<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>登陆注册</title>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
    <link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet">
    <link rel='stylesheet prefetch' href='https://fonts.googleapis.com/icon?family=Material+Icons'>

</head>
<body>
<div style="text-align:center;clear:both">
    <script src="/gg_bd_ad_720x90.js" type="text/javascript"></script>
    <script src="/follow.js" type="text/javascript"></script>
</div>

<div class="cotn_principal">
    <div class="cont_centrar">
        <div class="cont_login">
            <div class="cont_info_log_sign_up">
                <div class="col_md_login">
                    <div class="cont_ba_opcitiy">
                        <h2>LOGIN</h2>
                        <p>Lorem ipsum dolor sit amet, consectetur.</p>
                        <button class="btn_login" onClick="cambiar_login()">LOGIN</button>
                    </div>
                </div>
                <div class="col_md_sign_up">
                    <div class="cont_ba_opcitiy">
                        <h2>SIGN UP</h2>
                        <p>Lorem ipsum dolor sit amet, consectetur.</p>
                        <button class="btn_sign_up" onClick="cambiar_sign_up()">SIGN UP</button>
                    </div>
                </div>
            </div>
            <div class="cont_back_info">
                <div class="cont_img_back_grey"><img src="${pageContext.request.contextPath}/image/po.jpg" alt=""/></div>
            </div>
            <div class="cont_forms">
                <div class="cont_img_back_"><img src="${pageContext.request.contextPath}/image/po.jpg" alt=""/></div>
                <form action="login" method="post">
                    <div class="cont_form_login"><a href="#" onClick="ocultar_login_sign_up()"><i class="material-icons">&#xE5C4;</i></a>
                        <h2>LOGIN</h2>
                        <input type="text" name="username" placeholder="Username">
                        <input type="password" name="password" placeholder="Password">
                        <input type="submit" value="LOGIN" class="btn_login">
                    </div>
                </form>
                <form action="register" method="post">
                    <div class="cont_form_sign_up"><a href="#" onClick="ocultar_login_sign_up()"><i class="material-icons">&#xE5C4;</i></a>
                        <h2>SIGN UP</h2>
                        <input type="text" name="email" placeholder="Email"/>
                        <input type="text" name="username" placeholder="Usernmae"/>
                        <input type="password" name="password" placeholder="Password"/>
                        <input type="submit" value="SIGN UP" class="btn_sign_up">
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>

<script src="${pageContext.request.contextPath}/js/index.js"></script>

</body>
</html>

