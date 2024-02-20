<!DOCTYPE html>
<html lang="en">
<head>
    <style>
        h1{
            color: rgb(221, 224, 50);
        }
        h3{
            color: rgb(196, 240, 0);
        }
        marquee{
            color: rgb(226, 43, 192);
        }
        body{
        
            background-color: rgb(159, 158, 184);
        }
    
        
        td:hover{
          color: #ff008c;
         
        }
        table{
    border: 2px rgb(162, 162, 225);
    background-color:rgb(164, 186, 196);
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
        <a   href="\">ABOUT US</a>&nbsp;&nbsp;
        </nav>
                <h3> TRANSFER FORM</h3>
        <form action="/transferurl">
            <table>
                <tr>
                    <td>ACCOUNT NUMBER:</td>
                    <td><input id ="box" type="text" name="accountNumber">
                </tr>
                <tr>
                    <td>NAME:</td>
                    <td><input  id ="box"type="text" name="name">
                </tr>
                <tr>
                    <td>PASSWORD:</td>
                    <td><input id ="box" type="text" name="password">
                </tr>
                <tr>
                    <td>TARGETACCOUNT_NO:</td>
                    <td><input id ="box" type="text" name="taccountNo">
                </tr>
                <tr>
                    <td>AMOUNT:</td>
                    <td><input id ="box" type="number" name="amount">
                </tr>
                <tr>
                    <td></td>
                    <td><input id="s" type="submit"></td>
                    <td><input  id="k"type="reset"></td>
                </tr>
                </table>
                </form>
                </center>
               
</body>
</html>