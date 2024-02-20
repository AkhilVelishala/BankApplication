<!DOCTYPE html>
<html lang="en">
<head>
    <style>
    h1{
        color: rgba(91, 6, 188, 0.842);
    }
    h3{
        color: rgb(242, 12, 200);
    }
    marquee{
        color: rgb(52, 186, 4);
    }
    body{
    
        background-color: rgb(14, 240, 210);
    }

    
    td:hover{
      color: #1500ff;
     
    }
    table{
border: 2px blue;
background-color:rgb(175, 236, 235);
width: 150px;
height: 150px;
margin: auto;
    }
    #l:hover{
      
     color: #d95417
    }
    #s:hover{
      border-radius: 4px;
      border-color: #1500ff;
      color: crimson;
    
    }
    #k:hover{
      border-radius: 4px;
      border-color: #1500ff;
      color: rgba(8, 192, 79, 0.845);
    
    }
    #box:hover{
      border-radius: 4px;
      border-color: #1500ff;
    }
    </style>
</head>
</head>
<body>
    <center>
    
        <h1> HDFC BANK SERVICE</h1><p></p>
   <h2> <marquee>24/7 SERVICES </marquee></h2>
   <nav id="l">
   <a    href="/">HOME</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
   <a   href="/account">NEW ACCOUNT</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
   <a href="/balance">BALANCE</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
   <a  href="/deposit">DEPOSIT</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
   <a   href="/withdraw">WITHDRAW</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
   <a   href="/transfer">TRANSFER</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
   <a href="/close">CLOSE A/C</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
   <a   href="/">ABOUT US</a>&nbsp;&nbsp;
   </nav>
        <h3>BALANCE FORM</h3>
        <form action="/balanceurl">
            <table>
                <tr>
                    <td>ACCOUNT NUMBER:</td>
                    <td><input id ="box" type="text" name="accountNumber">
                </tr>
                <tr>
                    <td>NAME:</td>
                    <td><input id ="box" type="text" name="name">
                </tr>
                <tr>
                    <td>PASSWORD:</td>
                    <td><input  id ="box"type="text" name="password">
                </tr>
                <tr>
                    <td></td>
                    <td><input id ="s" type="submit"></td>
                    <td><input id ="k" type="reset"></td>
                </tr>
                </table>
                </form>
                </center>
               
</body>
</html>