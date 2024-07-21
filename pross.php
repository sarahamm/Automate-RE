<!DOCTYPE html >
<html>
<head>
    <title>IP_Address</title>
    <style>
        body, html {
                    margin: 0;
                    padding: 0;
                    overflow: hidden;} 
        img { position: absolute;}
        .form{ position: absolute;  z-index: 4; }
        .ip_add{background-color: gray; 
                padding: 10px;
                margin: 10px 0;
                }
        .btn{background-color: #F4C351; border-color:#F4C351; }
        .package{display: grid;
                 place-items: center;
                 z-index: 2;}
        video{top:0;
              left:0;
              width: 100%;
              height: 100%;
              object-fit: cover;
              z-index: 1;}         
        img{width:40%; height: 60%; filter: blur(2px); opacity: 0.7; border:1px; border-color:gray; z-index: 3;}  
        .txt{color:white;}  
        .warp-text {
            color: white;
            font-size: 24px;
            transform: rotate(-10deg) skewX(10deg);
            text-shadow: 2px 2px 5px rgba(0,0,0,0.5);
            position: relative;
            top: -50px;
        }
</style>

</head>
<body >
    
    <div class="cont">
       <div class="package" class ="warp-text">
       <form method="POST" action="">
       </form>
            <img src="Un.png" class="img"  />
            
            <video src="vid.mp4" class="vid"  autoplay muted loop></video>
    </div>

    

<?php

function convert($ip) {
    $parts = explode('.', $ip);
    $result = 0;
    foreach ($parts as $part) {
        $result = ($result << 8) + intval($part);
    }
    return $result;
}

function IPPatterns($ip) {
    $ipv4Pattern = '/\b(?:\d{1,3}\.){3}\d{1,3}\b/';
    $ipv6Pattern = '/\b(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}\b/';

    if (preg_match($ipv4Pattern, $ip)) {
        return "IPv4 address detected.";
    } elseif (preg_match($ipv6Pattern, $ip)) {
        return "IPv6 address detected.";
    } else {
        return "Invalid IP address format.";
    }
}

function findCountry($ip, $range) {
    foreach ($range as $country => $ipRanges) {
        foreach ($ipRanges as $ipRange) {
            if ($ip >= $ipRange[0] && $ip <= $ipRange[1]) {
                return $country;
            }
        }
    }
    return "Unknown";
}

$range = array(
    "Australia" => array(array(convert("1.0.0.0"), convert("1.255.255.254"))),
    "European Union" => array(array(convert("2.0.0.0"), convert("2.255.255.254"))),
    "United States" => array(
        array(convert("3.0.0.0"), convert("3.255.255.254")),
        array(convert("4.0.0.0"), convert("4.255.255.254")),
        array(convert("5.0.0.0"), convert("5.255.255.254")),
        array(convert("6.0.0.0"), convert("6.255.255.254")),
        array(convert("7.0.0.0"), convert("7.255.255.254")),
        array(convert("8.0.0.0"), convert("8.255.255.254")),
        array(convert("9.0.0.0"), convert("9.255.255.254")),
        array(convert("11.0.0.0"), convert("11.255.255.254")),
        array(convert("12.0.0.0"), convert("12.255.255.254")),
        array(convert("13.0.0.0"), convert("13.255.255.254")),
        array(convert("15.0.0.0"), convert("15.255.255.254")),
        array(convert("16.0.0.0"), convert("16.255.255.254")),
        array(convert("17.0.0.0"), convert("17.255.255.254")),
        array(convert("18.0.0.0"), convert("18.255.255.254")),
        array(convert("19.0.0.0"), convert("19.255.255.254")),
        array(convert("20.0.0.0"), convert("20.255.255.254")),
        array(convert("21.0.0.0"), convert("21.255.255.254")),
        array(convert("22.0.0.0"), convert("22.255.255.254")),
        array(convert("23.0.0.0"), convert("23.255.255.254")),
        array(convert("24.0.0.0"), convert("24.255.255.254")),
        array(convert("25.0.0.0"), convert("25.255.255.254")),
        array(convert("26.0.0.0"), convert("26.255.255.254")),
        array(convert("33.0.0.0"), convert("33.255.255.254")),
        array(convert("38.0.0.0"), convert("38.255.255.254")),
        array(convert("40.0.0.0"), convert("40.255.255.254")),
        array(convert("45.0.0.0"), convert("45.255.255.254")),
        array(convert("46.0.0.0"), convert("46.255.255.254")),
        array(convert("47.0.0.0"), convert("47.255.255.254")),
        array(convert("49.0.0.0"), convert("49.255.255.254")),
        array(convert("50.0.0.0"), convert("50.255.255.254")),
        array(convert("51.0.0.0"), convert("51.255.255.254")),
        array(convert("53.0.0.0"), convert("53.255.255.254")),
        array(convert("54.0.0.0"), convert("54.255.255.254")),
        array(convert("55.0.0.0"), convert("55.255.255.254")),
        array(convert("57.0.0.0"), convert("57.255.255.254")),
    ),
    "Private Network" => array(array(convert("10.0.0.0"), convert("10.255.255.254"))),
    "China" => array(
        array(convert("14.0.0.0"), convert("14.255.255.254")),
        array(convert("36.0.0.0"), convert("36.255.255.254")),
        array(convert("37.0.0.0"), convert("37.255.255.254")),
        array(convert("39.0.0.0"), convert("39.255.255.254")),
        array(convert("42.0.0.0"), convert("42.255.255.254")),
        array(convert("52.0.0.0"), convert("52.255.255.254")),
        array(convert("58.0.0.0"), convert("58.255.255.254")),
        array(convert("59.0.0.0"), convert("59.255.255.254")),
        array(convert("60.0.0.0"), convert("60.255.255.254")),
    ),
    "South Korea" => array(array(convert("27.0.0.0"), convert("27.255.255.254"))),
    "Japan" => array(array(convert("35.0.0.0"), convert("35.255.255.254"))),
    "African Network Information Center" => array(array(convert("41.0.0.0"), convert("41.255.255.254"))),
    "Reserved" => array(
        array(convert("28.0.0.0"), convert("28.255.255.254")),
        array(convert("29.0.0.0"), convert("29.255.255.254")),
        array(convert("30.0.0.0"), convert("30.255.255.254")),
        array(convert("31.0.0.0"), convert("31.255.255.254")),
        array(convert("32.0.0.0"), convert("32.255.255.254")),
        array(convert("34.0.0.0"), convert("34.255.255.254")),
        array(convert("43.0.0.0"), convert("43.255.255.254")),
        array(convert("44.0.0.0"), convert("44.255.255.254")),
        array(convert("48.0.0.0"), convert("48.255.255.254")),
        array(convert("56.0.0.0"), convert("56.255.255.254")),
    )
);

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $ip = trim($_POST["IP"]);
    
    // Validate IP format
    $ipCheck = IPPatterns($ip);
    echo $ipCheck . "\n";

    if ($ipCheck === "IPv4 address detected.") {
        $ipInt = convert($ip);
        $country = findCountry($ipInt, $range);
        echo "<p>The IP address $ip belongs to: $country</p>\n";
    } else {
        echo "<p>Please enter a valid IPv4 address.</p>\n";
    }
}
?>
</body>
</html>