<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>PlayStation</title>
	<link rel="stylesheet" href="styles.css" type="text/css" />
</head>

<body>
<div id="container">
       <header>
	<div class="top" align="right">
		<%
			if(session.getAttribute("userid")!=null)
			{
				String s=(String)session.getAttribute("userid");
			%>
			
		<button type="button" >Hi,<%=s%></button>	
		<button type="button" ><a href="logout.jsp">Logout</a></button>
		<%
			}
			else{
		%>
		<button type="button" ><a href="login.jsp">Login</a></button>
		<button type="button" ><a href="signup.jsp">Sign Up</a></button>
		<%
			}
		%>
		</div>
		<br>
    	<h1><a href="home.jsp">Game<span>Speed</span></a></h1>
        <h2>world's largest online Game store</h2>
    </header>
    <nav>
    	<ul>
        	<li class=""><a href="home.jsp">Home</a></li>
            <li class=""><a href="XBox.jsp">XBox</a></li>
            <li class="start selected"><a href="PlayStation.jsp">Play Station</a></li>
			<li class=""><a href="Nintendo.jsp">Nintendo</a></li>
			<li class=""><a href="Accessories.jsp">Accessories</a></li>
			<li class="end" style="float:right; display:block"><a href="ViewCart.jsp">View-Cart</a></li>	 		        
			
        </ul>
    </nav>

	<img class="header-image" src="images/img_PlayStation.jpg" width = "100%" height = "100%" alt="Play Station" />

    <div id="body">		

	<section id="content">

	    <article>

			<h2>Play Station</h2>
			
            <p>Following are the different models of Play Station for sale.</p>	
            
            <p>Click on a model to purchase or check the reviews.</p>

		</article>
	
		<article class="expanded">

            <h2>Models in Play Station</h2>
						
            <table>
			<tr>
				<td>
					<img src = "images/img_PlayStation2.jpg" width = "200" height = "200" alt = "PlayStation2">
				</td>
				<td>
					<p> Specifications </p>
				<td>
				<td>
					<form class = "submit-button" method = "post" action = "Buy.jsp">
						<input class = "submit-button" type = "submit" name = "PlayStation_2" value = "Buy">
					</form>
					<form class = "submit-button" method = "post" action = "Reviews.jsp">
						<input class = "submit-button" type = "submit" name = "PlayStation_2" value = "Write Review">
					</form>
					<form class = "submit-button" method = "get" action = "ViewReviews.jsp">
						<input class = "submit-button" type = "submit" name = "PlayStation_2" value = "View Reviews">
					</form>
					<form class = "submit-button" method = "get" action = "AddCart.jsp">
						<input class = "submit-button" type = "submit" name = "PlayStation_2" value = "Add-To-Cart">
						<input type = "hidden" name = "XBOX_Price" value = "200">
					</form>
				</td>
			</tr>
			
			<tr>
				<td>
					<img src = "images/img_PlayStation3.jpg" width = "200" height = "200" alt = "PlayStation3">
				</td>
				<td>
					<p> Specifications </p>
				<td>
				<td>
					<form class = "submit-button" method = "post" action = "Buy.jsp">
						<input class = "submit-button" type = "submit" name = "PlayStation_3" value = "Buy">
					</form>
					<form class = "submit-button" method = "post" action = "Reviews.jsp">
						<input class = "submit-button" type = "submit" name = "PlayStation_3" value = "Write Review">
					</form>
					<form class = "submit-button" method = "get" action = "ViewReviews.jsp">
						<input class = "submit-button" type = "submit" name = "PlayStation_3" value = "View Reviews">
					</form>
					<form class = "submit-button" method = "get" action = "AddCart.jsp">
						<input class = "submit-button" type = "submit" name = "PlayStation_3" value = "Add-To-Cart">
						<input type = "hidden" name = "XBOX_Price" value = "200">
					</form>
				</td>
			</tr>
			
			<tr>
				<td>
					<img src = "images/img_PlayStation4.jpg" width = "200" height = "200" alt = "PlayStation4">
				</td>
				<td>
					<p> Specifications </p>
				<td>
				<td>
					<form class = "submit-button" method = "post" action = "Buy.jsp">
						<input class = "submit-button" type = "submit" name = "PlayStation_4" value = "Buy">
					</form>
					<form class = "submit-button" method = "post" action = "Reviews.jsp">
						<input class = "submit-button" type = "submit" name = "PlayStation_4" value = "Write Review">
					</form>
					<form class = "submit-button" method = "get" action = "ViewReviews.jsp">
						<input class = "submit-button" type = "submit" name = "PlayStation_4" value = "View Reviews">
					</form>
					<form class = "submit-button" method = "get" action = "AddCart.jsp">
						<input class = "submit-button" type = "submit" name = "PlayStation_4" value = "Add-To-Cart">
						<input type = "hidden" name = "XBOX_Price" value = "200">
					</form>
				</td>
			</tr>
			
			</table>
			
		</article>
    </section>
        
    <aside class="sidebar">
	
            <ul>	
               <li>
                    <h4>Products</h4>
                    <ul>
                        <li><a href="XBox.jsp">XBox</a></li>
                        <li><a href="PlayStation.jsp">Play Station</a></li>
					    <li><a href="Nintendo.jsp">Nintendo</a></li>
                        <li><a href="AccessoriesPlayStation.jsp">Accessories</a></li>
                    
                    </ul>
                </li>
                
                <li>
                    <h4>About us</h4>
                    <ul>
                        <li class="text">
                        	<p style="margin: 0;">This is a sample website created to demonstrate a standard enterprise web page.</p>
                        </li>
                    </ul>
                </li>
                
                <li>
                	<h4>Search site</h4>
                    <ul>
                    	<li class="text">
                            <form method="get" class="searchform" action="#" >
                                <p>
                                    <input type="text" size="25" value="" name="s" class="s" />
                                    
                                </p>
                            </form>	
						</li>
					</ul>
                </li>
                
                <li>
                    <h4>Helpful Links</h4>
                    <ul>
                        <li><a href="http://www.w3schools.com/html/default.asp" title="premium templates">Learn HTML here</a></li>
                        <li><a href="http://www.w3schools.com/css/default.asp" title="web hosting">Learn CSS here</a></li>
                        
                    </ul>
                </li>
                
            </ul>
		
    </aside>
    
	<div class="clear"></div>
	</div>
    
	<footer>
	
        <div class="footer-content">
            <ul>
            	<li><h4>Dummy Link Section 1</h4></li>
                <li><a href="#">Dummy Link 1</a></li>
                <li><a href="#">Dummy Link 2</a></li>
                <li><a href="#">Dummy Link  3</a></li>
			</ul>
           
        <div class="clear"></div>
        </div>
		
        <div class="footer-bottom">
            <p>CSP 595 - Enterprise Web Application - Tutorial 2</p>
        </div>
		
    </footer>
</div>

</body>

</html>