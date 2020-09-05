<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
}

li {
  float: left;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a:hover:not(.active) {
  background-color: #111;
}

.active {
  background-color: #4CAF50;
}
.contacts-form {
	background: grey;
	border-radius: 10px;
	-moz-border-radius: 10px;
	-webkit-border-radius: 10px;
	-o-border-radius: 10px;
	-ms-border-radius: 10px;
	padding: 70px 585px;
}
.form-control {
	padding: 10px 10px;
	margin: 3px;
}
</style>
</head>
<body>
<div class="switcher-wrapper">
		<div class="demo_changer">
			<div class="demo-icon customBgColor">
				<i class="fa fa-cog fa-spin fa-2x"></i>
			</div>
			<div class="form_holder">
				<div class="row">
					<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
						<div class="predefined_styles"></div>
					</div>
				</div>
			</div>
		</div>
	</div>

<ul>
  <!-- <li><a href="Reg.jsp">Registration</a></li>
  <li><a href="Login.jsp">Login</a></li> -->
</ul>
	<section class="contacts">
		<div class="container">
			<div class="row">
				<div class="contacts-find">
					<div class="col-md-5 col-md-offset-3">
						<div class="contacts-form"
							style="background-color: rgba(80, 54, 84, 0.6); height: 100%">
							<!-- <a href="./UserDetails.html">Show Users</a>&nbsp <a href="./UpdateUserById.html">Update user</a>&nbsp <a href="./DeleteUser.html">Delete User</a> -->
							<h1 style="font-size: 200%; color: White" class="blog-title">Add Bike</h1>
							<div id="success"></div>

							<form action="addBike" method="POST" id="contactForm">
								
                               
								 <div class="form-group col-lg-6">
                                      <label for="exampleInputEmail1">Bike name</label>
                                      <input type="text" name="bikeName" class="form-control" id="exampleInputEmail1" placeholder="Enter Bike_name">
                                  </div>
                                  <div class="form-group col-lg-6">
                                      <label for="exampleInputPassword1">Bike description</label>
                                      <input type="text" name="bikeDescription" class="form-control" id="exampleInputPassword1" placeholder="Enter Bike_description">
                                  </div>
                                  
                                  <div class="form-group col-lg-6">
                                      <label for="exampleInputEmail1">Select Bike Category</label>
                                      <select name="bikeCategory" class="form-control" id="exampleInputEmail1" placeholder="#">
                                          <option value="Scooty">Scooty</option>
                                          <option value="Tourer">Tourer</option>
                                          <option value="Adventure">Adventure</option>
                                          <option value="CityBike">CityBike</option>
                                      </select>                              
                                  </div>
                                   <div class="form-group col-lg-6">
                                      <label for="exampleInputEmail1">Bike company</label>
                                      <input type="text" name="bikeCompany" class="form-control" id="exampleInputEmail1" placeholder="Enter Bike_company">
                                  </div>
                                   <div class="form-group col-lg-6">
                                      <label for="exampleInputEmail1">Bike Model</label>
                                      <input type="text" name="bikeModel" class="form-control" id="exampleInputEmail1" placeholder="Enter Bike_Model">
                                  </div>
                                   <div class="form-group col-lg-6">
                                      <label for="exampleInputEmail1">Bike RC No</label>
                                      <input type="text" name="bikeRCNo" class="form-control" id="exampleInputEmail1" placeholder="Enter Bike_RC_No">
                                  </div>
                                   <div class="form-group col-lg-6">
                                      <label for="exampleInputEmail1">Bike RC Name</label>
                                      <input type="text" name="bikeRCName" class="form-control" id="exampleInputEmail1" placeholder="Enter Bike_RC_Name">
                                  </div>
                                   <div class="form-group col-lg-6">
                                      <label for="exampleInputEmail1">Bike RC RegDate</label>
                                      <input type="date" name="bikeRCRegDate" class="form-control" id="exampleInputEmail1" placeholder="Enter Bike_RC_RegDate">
                                  </div>
                                   <div class="form-group col-lg-6">
                                      <label for="exampleInputEmail1">Bike RC ExpDate</label>
                                      <input type="date" name="bikeRCExpDate" class="form-control" id="exampleInputEmail1" placeholder="Bike_RC_ExpDate">
                                  </div>
                                   <div class="form-group col-lg-6">
                                      <label for="exampleInputEmail1">Bike RC CHNO</label>
                                      <input type="text" name="bikeRCCHNO" class="form-control" id="exampleInputEmail1" placeholder="Enter Bike_RC_CHNO">
                                  </div>
                                   <div class="form-group col-lg-6">
                                      <label for="exampleInputEmail1">Bike RC EnginNo</label>
                                      <input type="text" name="bikeRCEnginNo" class="form-control" id="exampleInputEmail1" placeholder="Enter Bike_RC_EnginNo">
                                  </div>
                                   <div class="form-group col-lg-6">
                                      <label for="exampleInputEmail1">Bike_YearMfg</label>
                                      <input type="text" name="bikeYearMfg" class="form-control" id="exampleInputEmail1" placeholder="Enter Bike_YearMfg">
                                  </div>
                                   <div class="form-group col-lg-6">
                                      <label for="exampleInputEmail1">Bike NoOfGear</label>
                                      <input type="text" name="bikeNoOfGear" class="form-control" id="exampleInputEmail1" placeholder="Enter Bike_NoOfGear">
                                  </div>
                                   <div class="form-group col-lg-6">
                                      <label for="exampleInputEmail1">Bike color</label>
                                      <input type="text" name="bikeColor" class="form-control" id="exampleInputEmail1" placeholder="Enter Bike_color">
                                  </div>
                                  <div class="form-group col-lg-6">
                                  <label for="exampleInputFile">Self Start</label>
                                      <select name="selfstart" id="exampleInputFile" class="form-control">
                                          <option value="1">Yes</option>
                                          <option value="0">No</option>
                                      </select>
                                  </div>
                                  <div class="form-group col-lg-6">
                                      <label for="exampleInputEmail1">Bike Engin CC</label>
                                      <input type="text" name="bikeEnginCC" class="form-control" id="exampleInputEmail1" placeholder="Enter Bike_Engin_CC">
                                  </div>
                                  <div class="form-group col-lg-6">
                                      <label for="exampleInputEmail1">Status</label>
                                      <select name="status" id="exampleInputFile" class="form-control">
                                          <option value="1">Active</option>
                                          <option value="0">Non Active</option>
                                      </select>
                                  </div>
								<br>
								<center>
									<button type="submit"
										class="btn button button--red triangle triangle--12"
										value="SignUp">Add</button>
								</center>
								<br>
						
							</form>
						</div>
					</div>
				</div>
			</div>
	</section>
</body>
</html>