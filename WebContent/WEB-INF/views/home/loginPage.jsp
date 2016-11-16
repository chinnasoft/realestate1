


<%@include file="../taglib_includes.jsp" %>

<c:set var="pathValue" value="${pageContext.request.contextPath}" />



<section id="container" class="hold-transition login-page">
<div class="login-box">
        <div class="login-box-body">
    <p class="login-box-msg">Sign in to start your session</p>
          
					 
		<form:form modelAttribute="loginInfo" id="login" action="loginPage.htm" method="post">
		
		
		
		<div id="wrapping" class="clearfix">
	
			
			<section id="aligned">
			
			<input type="text"  name="userName" id="username" placeholder="username"  class="form-control" autocomplete="off" tabindex="1" class="form-group has-feedback" autofocus required>
		    <input id="password" type="password" placeholder="Password"  name="userPassword"  class="form-control" autocomplete="off" tabindex="2" class="form-group has-feedback" required>
			
			</section>
           
		<div id="invalid">
					<c:out value="${error}" /> 
					<c:if test="${!empty error}"><a href="#" class="help_ic" >?</a></c:if>
						</div> 

          
			<div id="usernamevalid" style="display: none">
						 Please Enter Username or Password
						 
						</div> 
		</div>
		<section id="buttons" class="column">
       <!-- <button class="progress-button resetbtn" data-style="top-line"  id="resetbtn" data-horizontal  onclick="formReset();">Reset</button>
         <button class="progress-button submitbtn" data-style="top-line"  id="submitbtn" data-horizontal onclick="alert()">Sign In</button>  -->
        <!-- <button type="submit" value="Submit" id="submitbtn" >Sign In</button> -->
        
       	<button class="btn btn-primary md-trigger" type="reset"  id="resetbtn" ><span class="content">Reset</span></button>
         <button class="btn btn-primary md-trigger" type="submit"  id="submitbtn" data-horizontal data-style="top-line">Sign In</button>
         
           
			<br style="clear:both;">
		</section>
                        
		</form:form>
      
      </div></div>
      
        
</section>

                    
   

			
			<script type="text/javascript">
			function checkLogin()
			 {
				    
			  var userName = $("#username").val();
			   var password=$("#password").val();
			   //alert(userName);
				//alert(password);
			   
			    var result = 0;
			    if(userName==''||userName==0)
			    {
			      //  alert("Please enter User name");
			        $('#usernamevalid').show();
			        result = result+1;
			    }
			     if(password==''||password==0)
			    {
			     //   alert("Please enter password");
			        $('#usernamevalid').show();
			        result = result+1;
			       
			    } 
			     if(password==password && userName=='')
			     {
			      //   alert("Please enter password");
			         $('#usernamevalid').show();
			         result = result+1;
			        
			     } 
			     if(userName==userName && password=='')
			     {
			       //  alert("Please enter User name");
			         $('#usernamevalid').show();
			         result = result+1;
			     }
			    
			     if(parseInt(result)>0)
				{
			    	
			    return false;
				}
			   else
				   {
				
			             return true;
				   }
			            
			};	    			
			
			$(document)
			.ready(
					function() 
					{
						
						window.name="login";
						
						$('#password').keyup(function (e) {
							
							  if (e.which == 13) {
								 
								
							  
							      $("#submitbtn").trigger("click");
							      e.preventDefault();
							        $("#login").submit();
							    
							  //  return false;    //<---- Add this line
							  }
							});
						
						
						$('#submitbtn').click(function (e) {
							//alert("insi");
							
							    if(checkLogin())
							    	{
							    	//document.login.submit();
							    	 $("#login").submit();
							    	}
							  
							    
							  
							});
						
						/* $('#resetbtn').click(function (e) {
							
							
							  
						    $('#login').reset();
						    
						  
						}); */
						
						
					    $("#username").focus();
						
					});


			function formReset() {
				
				$("#login").reset();
				
			}
			
			
			
			
			
				
	   
		</script>
		
		
		