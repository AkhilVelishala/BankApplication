<!DOCTYPE html>
<html lang="en">
<head>
<style>
    h1{
        color: rgb(236, 51, 15);
    }
    h3{
        color: rgb(40, 196, 12);
    }
    marquee{
        color: blueviolet;
    }
    body{
    
        background-color: rgb(235, 201, 234);
    }

    
    td:hover{
      color: #1500ff;
     
    }
    table{
border: 2px blue;
background-color:white;
width: 300px;
height: 250px;
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
        
        <h3>ACCOUNT FORM</h3>
        <form action="/accounturl">
            <table>
                <tr>
                    <td>ACCOUNT NUMBER:</td>
                    <td><input  id ="box"type="text" name="accountNumber">
                </tr>
                <tr>
                    <td>NAME:</td>
                    <td><input id ="box" type="text" name="name">
                </tr>
                <tr>
                    <td>PASSWORD:</td>
                    <td><input id ="box" type="text" name="password">
                </tr>
               
                <tr>
                    <td>AMOUNT:</td>
                    <td><input id ="box" type="number" name="amount">
                </tr>
                <tr>
                    <td>ADDRESS:</td>
                    <td><input  id ="box"type="text" name="address">
                </tr>
                <tr>
                    <td>MOBILE NO:</td>
                    <td><input id ="box" type="number" name="mobile">
                </tr>
                <tr>
                    <td></td>
                    <td ><input id ="s" type="submit"></td>
                    <td ><input  id = "k" type="reset"></td>
                </tr>
            </table>
        </center>
</body>
</html>