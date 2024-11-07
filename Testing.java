<!DOCTYPE html>
<html>
<head>
   <style>
        button { font-size: 32px; }
        div {
                font-size: 26px;
                width: 260px;
                text-align: center;
                color: #ffffff;
                background-color: #000000;
        }
        .green  { color: #009900; background-color: #000000; }
        .yellow { color: #ffff1a; background-color: #000000; }
        .red    { color: #ff1a1a; background-color: #000000; }
   </style>
   <script>
                function makeItGreen() {
                        document.getElementById("msg").innerHTML = "<div id=\"msg\" class=\"green\">Where are you, mouse?</div>"
                }
                function makeItRed() {
                        document.getElementById("msg").innerHTML = "<div id=\"msg\" class=\"red\">Where are you, mouse?</div>"
                }
                function makeItYellow() {
                        document.getElementById("msg").innerHTML = "<div id=\"msg\" class=\"yellow\">Where are you, mouse?</div>"
                }
   </script>
</head>
<body>
        <h1>Checking Mouse Events</h1>
        <p>Move the mouse around and eventually click on the button!</p>
        <button id="magicButton" type="button" onclick="makeItRed()" onmouseover="makeItYellow()" onmouseout="makeItGreen()">The Magic Button</button>
        <h2>Mouse Location:</h2>
        <div id="msg" class="green">Where are you, mouse?</div>
        <ul>
                <li><span class="green"> Green </span> means that the mouse is out there</li>
                <li><span class="yellow"> Yellow </span> means that the mouse is over the button</li>
                <li><span class="red"> Red </span> means that the mouse has clicked the button</li>
        </ul>
</body>
</html>