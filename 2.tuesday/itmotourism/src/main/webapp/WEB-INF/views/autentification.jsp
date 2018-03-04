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
<section class="engine"><a href="https://mobirise.co/g">create a website for free</a></section><section class="mbr-section mbr-section--relative mbr-section--fixed-size mbr-after-navbar" id="form1-9" data-rv-view="22" style="background-color: rgb(193, 193, 193);">

    <div class="mbr-section__container mbr-section__container--std-padding container" style="padding-top: 93px; padding-bottom: 93px;">
        <div class="row">
            <div class="col-sm-12">
                <div class="row">
                    <div class="col-sm-8 col-sm-offset-2" data-form-type="formoid">
                        <div class="mbr-header mbr-header--center mbr-header--std-padding">
                            <h2 class="mbr-header__text">Авторизация</h2>
                        </div>
                        <div data-form-alert="true"></div>
                        <form action="/login" method="POST">
                            <div class="form-group">
                                <input type="text" class="form-control" name="login" placeholder="Логин" required data-form-field="Name">
                            </div>
                            <div class="form-group">
                                <input type="password" class="form-control" name="password" placeholder="Пароль" required data-form-field="Email">
                            </div>

                            <div class="mbr-buttons mbr-buttons--right"><button type="submit" class="mbr-buttons__btn btn btn-lg btn-danger">Войти</button></div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>


<section class="mbr-section" id="buttons1-e" data-rv-view="31">
    <div class="mbr-section__container container mbr-section__container--isolated">
        <div class="row">
            <div class="col-sm-8 col-sm-offset-2">
                <div class="mbr-buttons mbr-buttons--center"><a class="mbr-buttons__btn btn btn-lg btn-default" href="/signUp">У меня еще нет профиля</a> </div>
            </div>
        </div>
    </div>
</section>


<section class="cid-qJOVpv0xf9" id="footer1-19" data-rv-view="119">



    <div class="container">
        <div class="media-container-row content text-white">
            <div class="col-12 col-md-3">
                <div class="media-wrap">
                    <a href="https://mobirise.com/">
                        <img src="assets/images/logo2-1.png" alt="Mobirise" title="" media-simple="true">
                    </a>
                </div>
            </div>
            <div class="col-12 col-md-3 mbr-fonts-style display-7">
                <h5 class="pb-3">
                    Address
                </h5>
                <p class="mbr-text">
                    1234 Street Name
                    <br>City, AA 99999
                </p>
            </div>
            <div class="col-12 col-md-3 mbr-fonts-style display-7">
                <h5 class="pb-3">
                    Contacts
                </h5>
                <p class="mbr-text">
                    Email: support@mobirise.com
                    <br>Phone: +1 (0) 000 0000 001
                    <br>Fax: +1 (0) 000 0000 002
                </p>
            </div>
            <div class="col-12 col-md-3 mbr-fonts-style display-7">
                <h5 class="pb-3"></h5>
                <p class="mbr-text">&nbsp;<br><br><br></p>
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
                    <p class="mbr-text mbr-fonts-style display-7">
                        © Copyright 2017 Mobirise - All Rights Reserved
                    </p>
                </div>
                <div class="col-md-6">
                    <div class="social-list align-right">
                        <div class="soc-item">
                            <a href="https://twitter.com/mobirise" target="_blank">
                                <span class="mbr-iconfont mbr-iconfont-social socicon-youtube socicon" media-simple="true"></span>
                            </a>
                        </div>
                        <div class="soc-item">
                            <a href="https://www.facebook.com/pages/Mobirise/1616226671953247" target="_blank">
                                <span class="mbr-iconfont mbr-iconfont-social socicon-vkontakte socicon" media-simple="true"></span>
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


</body>
</html>
