<%--
  User: lienjiaa
  Date: 2017/10/24
  Time: 22:27
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Custom Login Form Styling</title>
    <meta name="description" content="Custom Login Form Styling with CSS3" />
    <meta name="keywords" content="css3, login, form, custom, input, submit, button, html5, placeholder" />
    <meta name="author" content="Codrops" />
    <link rel="shortcut icon" href="images/timg.jpg">
    <link rel="stylesheet" type="text/css" href="css/style.css" />
    <script src="js/modernizr.custom.63321.js"></script>
    <!--[if lte IE 7]><style>.main{display:none;} .support-note .note-ie{display:block;}</style><![endif]-->
    <style>
        @import url(http://fonts.googleapis.com/css?family=Raleway:400,700);
        body {
            background: url(images/bg2.jpg);
            -webkit-background-size: cover;
            -moz-background-size: cover;
            background-size: cover;
        }
        .container > header h1,
        .container > header h2 {
            color: #fff;
            text-shadow: 0 1px 1px rgba(0,0,0,0.7);
        }
    </style>
</head>
<body>
<div class="container">

    <!-- Codrops top bar -->
    <div class="codrops-top">
        <a href="http://www.xuekai.me/">
            <strong>&laquo; 公司域名:陈波 </strong>
        </a>
        <span class="right">
                	<a href="http://www.baidu.com"><strong>百度</strong></a>
                    <a href="http://www.alibaba.com">
                        <strong>阿里巴巴</strong>
                    </a>
                </span>
    </div><!--/ Codrops top bar -->

    <header>

        <h1>在<strong>互联网领域</strong>，我们能 <strong>为您做到最好</strong></h1>
        <h2>In the field of the Internet, we can do the best for you</h2>
        <div class="support-note">
            <span class="note-ie">Sorry, only modern browsers.</span>
        </div>

    </header>

    <section class="main">
        <form class="form-4" action="index">
            <p>
                <label for="login">Username or email</label>
                <input type="text" name="login" placeholder="Username or email" required>
            </p>
            <p>
                <label for="password">Password</label>
                <input type="password" name='password' placeholder="Password" required>
            </p>

            <p>
                <input type="submit" name="submit" value="Continue">
            </p>
        </form>?
    </section>

</div>
</body>
</html>
