<%--
  Created by IntelliJ IDEA.
  User: miry
  Date: 11/18/18
  Time: 8:55 AM
--%>



<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta name="viewport" content="width=device-width; initial-scale=1.0; maximum-scale=1.0; user-scalable=0;">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>Landiya Theme: Front Page</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <asset:stylesheet src="style.css"/>

    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
            integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
            crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
            integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
            crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
            integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
            crossorigin="anonymous"></script>
</head>

<body>
<div class="header">
    <div class="container">
        <a href="#" class="logo"><asset:image src="logo.png" class="grails-logo"/></a>

        <div class="nav mobile">
            <div class="title">Menu <span class="fa "></span></div>
            <ul>
                <li><a href="#contact_part">Sing In</a></li>
                <li><a href="#subscribe_part">Sign Up</a></li>
            </ul>
        </div>
    </div>
</div>


<div class="container">
    <h4>Sign up</h4>

    <div class="row justify-content-md-center">
        <div class="col-md-8">
            <form action="/user/save" method="post">
                <div class="row">
                    <div class="col-md-4">
                        <div class="text-center">
                            <img src="https://c.tribune.com.pk/2018/09/1815077-deadppol_insing-1538295729-229-640x480.jpg"
                                 width="160" class="rounded float-left" alt="...">
                        </div>
                        <input type="file" class="form-control-file" id="exampleFormControlFile1">
                    </div>

                    <div class="col-md-8">
                        <div class="form-group">
                            <label for="formGroupExampleInput2">Firstname:</label>
                            <input type="text" class="form-control" name="firstname" id="formGroupExampleInput2"
                                   placeholder="Type your Fristname">
                        </div>

                        <div class="form-group">
                            <label for="formGroupExampleInput2">Lastname:</label>
                            <input type="text" class="form-control" name="lastname" id="formGroupExampleInput2"
                                   placeholder="Type your Lastname">
                        </div>
                    </div>

                </div>


                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="formGroupExampleInput2">Email:</label>
                        <input type="text" class="form-control" name="email" id="formGroupExampleInput2"
                               placeholder="xxxxxxxx@xxxxxx.xxx">
                    </div>

                    <div class="col-md-6">
                        <label for="formGroupExampleInput2">Retype Email</label>
                        <input type="text" class="form-control" id="formGroupExampleInput2"
                               placeholder="xxxxxxxx@xxxxxx.xxx">
                    </div>
                </div>

                <div class="form-group">
                    <label for="formGroupExampleInput2">Username:</label>
                    <input type="text" class="form-control" name="username" id="formGroupExampleInput2"
                           placeholder="Type your username">
                </div>

                <div class="form-group row">
                    <div class="col-md-6">
                        <label for="formGroupExampleInput2">Password:</label>
                        <input type="password" class="form-control" name="password" id="formGroupExampleInput2"
                               placeholder="*************">
                    </div>

                    <div class="col-md-6">
                        <label for="formGroupExampleInput2">Retype Password</label>
                        <input type="password" class="form-control" id="formGroupExampleInput2"
                               placeholder="*************">
                    </div>
                </div>
                <button type="submit" class="btn btn-primary">Sign in</button>
            </form>
        </div>
    </div>

    %{-- <div class="row">
         <div class="col">
             1 of 3
         </div>

         <div class="col-md-auto">
             Variable width content
         </div>

         <div class="col col-lg-2">
             3 of 3
         </div>
     </div>--}%
</div>

</body>
</html>

