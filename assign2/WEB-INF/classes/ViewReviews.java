import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.WriteConcern;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.DBCursor;
import com.mongodb.ServerAddress;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.Date;

public class ViewReviews extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	MongoClient mongo;
	
	public void init() throws ServletException{
      	// Connect to Mongo DB
		mongo = new MongoClient("localhost", 27017);
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			//Get the values from the form
			String searchField = "productName";
			
			//Get the product selected
			String searchParameter = "";
			if (request.getParameter("XBox_Original") != null){
			searchParameter = "X Box Original";
			}else if (request.getParameter("XBox_360") != null){
			searchParameter = "X Box 360";
			}else if (request.getParameter("XBox_One") != null){
			searchParameter = "X Box One";
			}else if (request.getParameter("PlayStation_2") != null){
			searchParameter = "PlayStation 2";
			}else if (request.getParameter("PlayStation_3") != null){
			searchParameter = "PlayStation 3";
			}else if (request.getParameter("PlayStation_4") != null){
			searchParameter = "PlayStation 4";
			}else if (request.getParameter("PlayStation_4") != null){
			searchParameter = "PlayStation 4";
			}else if (request.getParameter("PlayStation_4") != null){
			searchParameter = "PlayStation 4";
			}else if (request.getParameter("PlayStation_4") != null){
			searchParameter = "PlayStation 4";
			}else if (request.getParameter("PlayStation_4") != null){
			searchParameter = "PlayStation 4";
			}
			
			// if database doesn't exists, MongoDB will create it for you
			DB db = mongo.getDB("assign1");
			
			DBCollection myReviews = db.getCollection("myReviews");
			
			// Find and display 
			BasicDBObject searchQuery = new BasicDBObject();
			searchQuery.put(searchField, searchParameter);

			DBCursor cursor = myReviews.find(searchQuery);
			
			PrintWriter out = response.getWriter();
			//out.println(cursor);
						
			out.println("<html>");
			out.println("<head> </head>");
			out.println("<body>");
			out.println("<h1> Reviews For:"+ searchParameter+ "</h1>");
			
			out.println("<table>");
			
			out.println("<tr>");
			out.println("<td>");
			out.println("<a href='index.html'> Index </a>");
			out.println("</td>");
			out.println("</tr>");
			
			out.println("<tr>");
			out.println("<td>");
			out.println("<a href='XBox.html'> X Box </a>");
			out.println("</td>");
			out.println("</tr>");
			
			out.println("<tr>");
			out.println("<td>");
			out.println("<a href='PlayStation.html'> Play Station </a>");
			out.println("</td>");
			out.println("</tr>");
			
			out.println("</table>");
			out.println("<br><br><hr>");
			
			if(cursor.count() == 0){
				out.println("There are no reviews for this product.");
			}else{
			
				out.println("<table>");
				
			String productName = "";
			String productCatagory = "";
			String productPrice = "";
			String retailerName = "";
			String retailerCity = "";
			String retailerZip = "";
			String retailerState = "";
			String productOnSale = "";
			String manufacturerName = "";
			String manufacturerRebate = "";
			String userId = "";
			String userAge = "";
			String userGender = "";
		    String userOccupation = "";
			int reviewRating = 0;
			String reviewDate = "";
			String reviewText = "";
			
			
				while (cursor.hasNext()) {
					//out.println(cursor.next());
					BasicDBObject obj = (BasicDBObject) cursor.next();				
					
					out.println("<tr>");
					out.println("<td> Product Name: </td>");
					productName = obj.getString("productName");
					out.println("<td>" +productName+ "</td>");
					out.println("</tr>");
					
					out.println("<tr>");
					out.println("<td> Product Catagory: </td>");
					productCatagory = obj.getString("ProductCategory");
					out.println("<td>" +productCatagory+ "</td>");
					out.println("</tr>");
					
					
					out.println("<tr>");
					out.println("<td> Product Price: </td>");
					productPrice = obj.getString("productPrice");
					out.println("<td>" +productPrice+ "</td>");
					out.println("</tr>");
					
					out.println("<tr>");
					out.println("<td> Retailer Name: </td>");
					retailerName = obj.getString("retailerName");
					out.println("<td>" +retailerName+ "</td>");
					out.println("</tr>");
					
					out.println("<tr>");
					out.println("<td> Retailer City: </td>");
					retailerCity = obj.getString("retailerCity");
					out.println("<td>" +retailerCity+ "</td>");
					out.println("</tr>");
					
					out.println("<tr>");
					out.println("<td> RetailerZip: </td>");
					retailerZip = obj.getString("retailerZipcode");
					out.println("<td>" +retailerZip+ "</td>");
					out.println("</tr>");
					
					out.println("<tr>");
					out.println("<td> Retailer State: </td>");
					retailerState = obj.getString("retailerState");
					out.println("<td>" +retailerState+ "</td>");
					out.println("</tr>");
					
					out.println("<tr>");
					out.println("<td> Product OnSale: </td>");
					productOnSale = obj.getString("productOnSale");
					out.println("<td>" +productOnSale+ "</td>");
					out.println("</tr>");
					
					out.println("<tr>");
					out.println("<td> Manufacturer Name: </td>");
					manufacturerName = obj.getString("consoleManufacturer");
					out.println("<td>" +manufacturerName+ "</td>");
					out.println("</tr>");
					
					out.println("<tr>");
					out.println("<td>Manufacturer Rebate: </td>");
					manufacturerRebate = obj.getString("manufacturerRebate");
					out.println("<td>" +manufacturerRebate+ "</td>");
					out.println("</tr>");
								
					out.println("<tr>");
					out.println("<td> User Id: </td>");
					userId = obj.getString("userID");
					out.println("<td>" +userId+ "</td>");
					out.println("</tr>");
					
					out.println("<tr>");
					out.println("<td> User Age: </td>");
					userAge = obj.getString("userAge");
					out.println("<td>" +userAge+ "</td>");
					out.println("</tr>");
					
					out.println("<tr>");
					out.println("<td> User Gender: </td>");
					userGender = obj.getString("userGender");
					out.println("<td>" +userGender+ "</td>");
					out.println("</tr>");
					
					out.println("<tr>");
					out.println("<td> User Occupation: </td>");
					userOccupation = obj.getString("userOccupation");
					out.println("<td>" +userOccupation+ "</td>");
					out.println("</tr>");
					
					out.println("<tr>");
					out.println("<td> Review Rating: </td>");
					reviewRating = obj.getInt("reviewRating");
					out.println("<td>" +reviewRating+ "</td>");
					out.println("</tr>");
						
					out.println("<tr>");
					out.println("<td> Review Date: </td>");
					reviewDate = obj.getString("reviewDate");
					out.println("<td>" +reviewDate+ "</td>");
					out.println("</tr>");
					
					out.println("<tr>");
					out.println("<td> Review Text: </td>");
					reviewText = obj.getString("reviewText");
					out.println("<td>" +reviewText+ "</td>");
					out.println("</tr>");
					
				}
			}	
				out.println("</table>");
				out.println("</body>");
				out.println("</html>");
			
		} catch (MongoException e) {
				e.printStackTrace();
		}
	}

	
	public void destroy(){
      // do nothing.
	}
}