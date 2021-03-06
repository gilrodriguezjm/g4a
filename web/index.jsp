<%@page import="g4a.entity.Usuario"%>
<!DOCTYPE html>
<!--
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Html.html to edit this template
-->
<html>
    <head>
        <title>Games4All</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    </head>
    <%
        Usuario usuario = (Usuario)session.getAttribute("usuario");
        if (usuario != null) {
        response.sendRedirect(request.getContextPath() + "/juegos.jsp");
        }
    %>
    <body>
        <main>
            <header class="p-3 bg-dark text-white">
                
                <div class="container">
                  <div class="d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start">
                      <div class="col-1">   
                        <a href="index.jsp" class="d-flex align-items-center mb-2 mb-lg-0 text-white text-decoration-none">
                            <img src="img/dm-logo.png" height="70px">
                        </a>
                        
                      </div>
                      <div class="col-8">
                          <h3>Games 4 All</h3>
                      </div>
                      <div class="col-3">
                        <div class="text-end">
                          <a href="login.jsp" class="btn btn-outline-light me-2">Iniciar Sesi?n</a>
                          <a href="" class="btn btn-warning">Registrarse</a>
                        </div>
                      </div>
                  </div>
                </div>
            </header>
            
            <section>
                <div id="myCarousel" class="carousel slide" data-bs-ride="carousel">
                    <div class="carousel-indicators">
                    <button type="button" data-bs-target="#myCarousel" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
                    <button type="button" data-bs-target="#myCarousel" data-bs-slide-to="1" aria-label="Slide 2"></button>
                    <button type="button" data-bs-target="#myCarousel" data-bs-slide-to="2" aria-label="Slide 3"></button>
                    </div>
                    <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img src="img/sudoku.jpg" width="100%" height="100%">
                        <div class="container">
                        <div class="carousel-caption text-start">
                            <p><a class="btn btn-primary" href="#">Jugar</a></p>
                        </div>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <img src="img/tictactoe.jpg" width="100%" height="100%">
                        <div class="container">
                        <div class="carousel-caption text-start">
                            <p><a class="btn btn-primary" href="#">Jugar</a></p>
                        </div>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <img src="img/wordle.png" width="100%" height="100%">
                        <div class="container">
                        <div class="carousel-caption text-start">
                            <p><a class="btn btn-primary" href="#">Jugar</a></p>
                        </div>
                        </div>
                    </div>
                    </div>
                    <button class="carousel-control-prev" type="button" data-bs-target="#myCarousel" data-bs-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="visually-hidden">Anterior</span>
                    </button>
                    <button class="carousel-control-next" type="button" data-bs-target="#myCarousel" data-bs-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="visually-hidden">Siguiente</span>
                    </button>
                </div>
            </section>
        
        </main>
        <div class="container">
            <footer class="d-flex flex-wrap justify-content-between align-items-center py-3 my-4 border-top">
              <div class="col-md-4 d-flex align-items-center">
                <a href="/" class="mb-3 me-2 mb-md-0 text-muted text-decoration-none lh-1">
                    <img src="img/dm-logo.png" height="30px">
                </a>
                <span class="text-muted">? 2022 Darkmode</span>
              </div>
            </footer>
        </div>
        
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </body>
</html>
