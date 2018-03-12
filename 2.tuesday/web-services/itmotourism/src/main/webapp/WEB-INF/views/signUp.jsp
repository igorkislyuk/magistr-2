<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <!-- Site made with Mobirise Website Builder v4.4.1, https://mobirise.com -->
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="generator" content="Mobirise v4.4.1, mobirise.com">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="shortcut icon" href="assets/images/logo29.png" type="image/x-icon">
    <meta name="description" content="Website Creator Description">
    <title>events</title>
    <link rel="stylesheet" href="assets/web/assets/mobirise-icons/mobirise-icons.css">
    <link rel="stylesheet" href="assets/tether/tether.min.css">
    <link rel="stylesheet" href="assets/soundcloud-plugin/style.css">
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap-grid.min.css">
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap-reboot.min.css">
    <link rel="stylesheet" href="assets/dropdown/css/style.css">
    <link rel="stylesheet" href="assets/socicon/css/styles.css">
    <link rel="stylesheet" href="assets/theme/css/style.css">
    <link rel="stylesheet" href="assets/mobirise/css/mbr-additional.css" type="text/css">



</head>
<body>
<section class="menu cid-qJgHptF9Sy" once="menu" id="menu1-u" data-rv-view="594">



    <nav class="navbar navbar-expand beta-menu navbar-dropdown align-items-center navbar-fixed-top navbar-toggleable-sm">
        <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <div class="hamburger">
                <span></span>
                <span></span>
                <span></span>
                <span></span>
            </div>
        </button>
        <div class="menu-logo">
            <div class="navbar-brand">


            </div>
        </div>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav nav-dropdown navbar-nav-top-padding" data-app-modern-menu="true"><li class="nav-item">
                <a class="nav-link link text-white display-4" href="/">
                    <span class="mbri-home mbr-iconfont mbr-iconfont-btn"></span>Главная &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;</a>
            </li>
                <li class="nav-item">
                    <a class="nav-link link text-white display-4" href="/about">
                        <span class="mbri-search mbr-iconfont mbr-iconfont-btn"><br></span>О нас &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;</a>
                </li>
                <li class="nav-item"><a class="nav-link link text-white display-4" href="/events"><span class="mbri-flag mbr-iconfont mbr-iconfont-btn"></span>
                    События &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;</a>
                </li>
                <%if(session.getAttribute("ROLE_USER")!=null){%>
                <%="                <li class=\"nav-item\"><a class=\"nav-link link text-white display-4\" href=\"/myAchievements\"><span class=\"mbri-flag mbr-iconfont mbr-iconfont-btn\"></span>\n" +
                        "                    Мои достижения &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;</a>\n" +
                        "                </li>"%>
                <%}%>
                <%if(session.getAttribute("ROLE_ADMIN")!=null){%>
                <%="                <li class=\"nav-item\"><a class=\"nav-link link text-white display-4\" href=\"/adminPage\"><span class=\"mbri-flag mbr-iconfont mbr-iconfont-btn\"></span>\n" +
                        "                    Для администратора &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;</a>\n" +
                        "                </li>"%>
                <%}%>
            </ul>
            <%if(session.getAttribute("ROLE_USER")!=null){%>
            <%="<div class=\"navbar-buttons mbr-section-btn\"><a class=\"btn btn-sm btn-primary display-4\" href=\"/logOut\"><span class=\"mbri-key mbr-iconfont mbr-iconfont-btn\"></span>\n" +
                    "                Выйти</a></div>"%>
            <%}else {%>
            <%="<div class=\"navbar-buttons mbr-section-btn\"><a class=\"btn btn-sm btn-primary display-4\" href=\"/autentification\"><span class=\"mbri-key mbr-iconfont mbr-iconfont-btn\"></span>\n" +
                    "                Авторизация</a></div>"%>
            <%}%>
        </div>
    </nav>
</section>

<section class="engine"><a href="https://mobirise.co/h">how to make your own website</a></section><section class="header1 cid-qJOVvPUm4v" id="header1-1a" data-rv-view="116">





    <div class="container">
        <div class="row justify-content-md-center">
            <div class="mbr-white col-md-10">
                <h1 class="mbr-section-title align-center mbr-bold pb-3 mbr-fonts-style display-1">
                    Регистрация
                </h1>
                <h3 class="mbr-section-subtitle align-center mbr-light pb-3 mbr-fonts-style display-2">
                </h3>
                <p class="mbr-text align-center pb-3 mbr-fonts-style display-5">
                <div class="mbr-header mbr-header--center mbr-header--std-padding">
                    <h2 class="mbr-header__text"></h2>
                </div>
                <div data-form-alert="true"></div>
                <form action="/addUser" method="POST" data-form-title="Autentification">
                    <input type="hidden" value="MHh8Sp4RCkeJ6r9m2WHCb6HwehUbVxTFKaAvDe2ClSGt4Ilu9bYHZDRzzzXWg/IvKUDqC4rjRKmq0nSNX1GgOxBD9ghIyuLr8vhExEQMYupsZuvGYCGxEM+HpoNbVErL" data-form-email="true">

                    <div class="form-group">
                        <input type="text" class="form-control" name="name" required="" placeholder="Имя*">
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" name="surname" required="" placeholder="Фамилия*">
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" name="fatherName"  placeholder="Отчество(если есть)">
                    </div>
                    <div class="form-group">
                        <input type="date" class="form-control" name="bday" placeholder="Дата рождения*">
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" name="login" required="" placeholder="Логин*">
                    </div>

                    <div id="kind"></div>
                    <div class="form-group">
                        <input type="password" class="form-control" name="password" required="" placeholder="Пароль*" data-form-field="Password" id="pass1" onblur="checkPassword()">
                    </div>
                    <div class="form-group">
                        <input type="password" class="form-control" name="password2" required="" placeholder="Подтверждение пароля*" data-form-field="Password" id="pass2" onblur="checkPassword()">

                    </div>
                    <div class="mbr-buttons mbr-buttons--right"><button type="submit" class="mbr-buttons__btn btn btn-lg btn-danger">Зарегистрировать</button></div>
                </form>

            </div>
        </div>
    </div>

</section>


<section class="cid-qJgMgqsZtw mbr-reveal" id="footer1-10" data-rv-view="608">





    <div class="container">
        <div class="media-container-row content text-white">
            <div class="col-12 col-md-3">
                <div class="media-wrap">
                    <a href="https://mobirise.com/">
                        <img src="assets/images/logo2.png" alt="Mobirise" media-simple="true">
                    </a>
                </div>
            </div>
            <div class="col-12 col-md-3 mbr-fonts-style display-7">
                <h5 class="pb-3">
                    Адрес</h5>
                <p class="mbr-text">
                    1234 Street Name
                    <br>City, AA 99999
                </p>
            </div>
            <div class="col-12 col-md-3 mbr-fonts-style display-7">
                <h5 class="pb-3">
                    Контакты</h5>
                <p class="mbr-text">
                    Email: support@mobirise.com
                    <br>Phone: +1 (0) 000 0000 001
                    <br>Fax: +1 (0) 000 0000 002
                </p>
            </div>
            <div class="col-12 col-md-3 mbr-fonts-style display-7">
                <h5 class="pb-3"></h5>
                <p class="mbr-text"><br><br></p>
            </div>
        </div>
        <div class="footer-lower">
            <div class="media-container-row">
                <div class="col-sm-12">
                    <hr>
                </div>
            </div>
            <div class="media-container-row mbr-white">
                <div class="col-sm-6 copyright">
                    <p class="mbr-text mbr-fonts-style display-7">ITMO UVIVERSITY</p>
                </div>
                <div class="col-md-6">
                    <div class="social-list align-right">
                        <div class="soc-item">
                            <a href="https://twitter.com/mobirise" target="_blank">
                                <span class="socicon-twitter socicon mbr-iconfont mbr-iconfont-social" media-simple="true"></span>
                            </a>
                        </div>
                        <div class="soc-item">
                            <a href="https://www.facebook.com/pages/Mobirise/1616226671953247" target="_blank">
                                <span class="socicon-facebook socicon mbr-iconfont mbr-iconfont-social" media-simple="true"></span>
                            </a>
                        </div>
                        <div class="soc-item">
                            <a href="https://www.youtube.com/c/mobirise" target="_blank">
                                <span class="socicon-youtube socicon mbr-iconfont mbr-iconfont-social" media-simple="true"></span>
                            </a>
                        </div>



                    </div>
                </div>
            </div>
        </div>
    </div>
</section>


<script src="assets/web/assets/jquery/jquery.min.js"></script>
<script src="assets/popper/popper.min.js"></script>
<script src="assets/tether/tether.min.js"></script>
<script src="assets/bootstrap/js/bootstrap.min.js"></script>
<script src="assets/smooth-scroll/smooth-scroll.js"></script>
<script src="assets/touch-swipe/jquery.touch-swipe.min.js"></script>
<script src="assets/jquery-mb-ytplayer/jquery.mb.ytplayer.min.js"></script>
<script src="assets/jquery-mb-vimeo_player/jquery.mb.vimeo_player.js"></script>
<script src="assets/bootstrap-carousel-swipe/bootstrap-carousel-swipe.js"></script>
<script src="assets/dropdown/js/script.min.js"></script>
<script src="assets/theme/js/script.js"></script>
<script src="assets/mobirise-slider-video/script.js"></script>
<script src="assets/main.js"></script>
<script src="assets/custom/script.js"></script>

</body>
</html>