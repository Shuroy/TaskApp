 <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Task App</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body >
  <section>
  <form action="register" method="post" name="user_form">
    <div class="container">
      <div class="row justify-content-center">
        <div class="col-12 col-md-8 col-lg-8 col-xl-6">
          <div class="row">
            <div class="col text-center">
              <h1>Register</h1>
              <p class="text-h3"> </p>
            </div>
          </div>
          
          <div class=" container row align-items-center mt-4">
            <div class="col">
              <a href="/TaskApp/addTask.jsp">Add Task</a>
            </div>
            
             <div class="col">
             <a href="taskList.jsp">Show TaskList</a>
            </div>
            
          </div>
          
          <div class="row align-items-center">
            <div class="col mt-4">
              <input type="text" class="form-control" name="user_name" placeholder="Task Name">
            </div>
          </div>
          <div class="row align-items-center mt-4">
            <div class="col">
              <input type="email" class="form-control" name="user_email" placeholder="Email">
            </div>
          </div>
          <div class="row align-items-center mt-4">
            <div class="col">
              <input type="password" class="form-control" name="pass" placeholder="Password">
            </div>
            
          </div>
          <div class="row justify-content-start mt-4">
            <div class="col">
              <div class="form-check">
                <label class="form-check-label">
                  <input type="checkbox" class="form-check-input">
                  I Read and Accept <a href="#">Terms and Conditions</a>
                </label>
              </div>

              <button type="submit" class="btn btn-primary mt-4">Submit</button>
            </div>
          </div>
        </div>
      </div>
    </div>
    </form>
  </section>




		
		


<script>


</script>
</body>
</html>