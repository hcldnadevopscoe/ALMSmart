<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<script crossorigin="anonymous" src="https://app.launchdarkly.com/snippet/ldclient.min.js"></script>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Presto</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Bootstrap -->
<link href="bootstrap/css/bootstrap.css" rel="stylesheet" media="screen">
<link href="bootstrap/css/bootstrap-responsive.css" rel="stylesheet"
	media="screen">


<!--Modifications to Some Class-->
<!--Insert After Main CSS-->
<link href="css/basic.css" rel="stylesheet" media="screen">
<link rel="shortcut icon" href="favicon.ico">
</head>
<body>
	<jsp:include page="header.html" />
	<section>
		<div class="container">

			<div class="row-fluid">

				<div id="myCarousel" class="carousel slide">
					<div class="carousel-inner">
						<div class="item active">
							<img src="img/slide-01.jpg" alt="">

						</div>
						<div class="item">
							<img src="img/slide-02.jpg" alt="">

						</div>
						<div class="item">
							<img src="img/slide-03.jpg" alt="">

						</div>
					</div>
					<a class="left carousel-control" href="#myCarousel"
						data-slide="prev">&lsaquo;</a> <a class="right carousel-control"
						href="#myCarousel" data-slide="next">&rsaquo;</a>
				</div>
				<!-- /.carousel -->

				<div class="container" style="margin-top: 50px;">
				
					<div class="span2" style="margin-left: 20px;">
					<div class="well sidebar-nav">
					<ul class="nav nav-list">
                         <li class="nav-header">Quick Links</li>
							<p id="demo"></p>	
 							<script type = "text/javascript">
								var user = {"key": "manuja.r@hcl.com"};
							   	var ldclient = LDClient.initialize('59a3dbf21337670b1401db9f', user);
							   	ldclient.on('ready', function() {
						        console.log("It's now safe to request feature flags");
						    	var showFeature = ldclient.variation("presto-feature-1", false);
						    	if (showFeature) {
						    		var lists, text, fLen, i;
						    		lists = ["Home", "About Us", "Contact Us", "Safe Banking"];
						    		fLen = lists.length;
						    		text = "<br>";
						    		for (i = 0; i < fLen; i++) {
						    		    text += '<a href="#">'+lists[i]+'</a>';
						    			text += '<br>';
						    		}
						    		document.getElementById("demo").innerHTML = text;
						    	} else {
						    		//alert ("Presto-feature-1 flag is turned OFF");
						    	}
						    });
						</script>   
                        </ul>
					
					</div>
					
					</div>
					<div class="span9" style="margin-left: 50px;">
						<div class="well">
							<div align="justify">
								<strong style="color: red;">Welcome to PRESTO Bank Demo! Your Own Demo Bank!!!! </strong><br>
								
								<b>Presto </b> believes in the strength and integrity of
								relationships built with its customers like you. With over 102
								years of experience in the banking industry and a wide network
								of over <a href="" class="toplinks3"><strong>4180&nbsp;branches</strong></a>
								all over the country, we have always been active in extending
								financial support and adapting to your changing needs.
							</div>
							<p align="justify">
								Our <a href="" class="toplinks3"><strong>Deposit
										Products</strong></a>, <a href="" class="toplinks3"><strong>Retail
										Loans</strong></a>, <a href="" class="toplinks3"
									target="_new"><strong>Credit Cards</strong></a> and <a
									href="" class="toplinks3"><strong>Debit
										Cards</strong></a> help you with your growing financial needs. With
								facilities like <a href="" class="toplinks3"><strong>Lockers</strong></a>
								we ensure that your valuables are safe with us.
							</p>
							<p align="justify">Our countrywide branches offer you
								convenience and ease in operating your account wherever you are.
								Our 24-hour ATMs enable you to withdraw cash, check your account
								balance and request for a new chequebook even after banking
								hours.</p>
							<p align="justify">
								<span >Faster technology for better
									service</span><br>
								<br>
							</p>
							<p align="justify">
								<a href="" class="toplinks3"><strong>Presto
										Internet Banking / Presto Mobile Banking</strong></a>, our latest Internet
								and Mobile banking initiatives enable you to operate your
								account just as you would in any of our branches. You can
								through the Internet check your balance, request for chequebooks
								and print account details.
							</p>
							<p align="justify">
								Choose from our various products and services, that we sincerely
								feel will put a smile on your face; an investment we would like
								to bank on forever. <br> <br>
							</p>
						</div>
					</div>
				
					
				</div>

			</div>



			<jsp:include page="footer.html" />
		</div>
	</section>









	<script src="bootstrap/js/jquery.js"></script>
	<script src="bootstrap/js/bootstrap.js"></script>

	<script>
      !function ($) {
        $(function(){
          // carousel demo
          $('#myCarousel').carousel()
        })
      }(window.jQuery)
    </script>
	<script src="bootstrap/js/holder.js" type="text/javascript"></script>

</body>
</html>