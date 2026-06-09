/**
 * 
 */
function makeRequestObject() {
    var xmlHTTP = false;
    try {
        // <6 versions internet explorer
        xmlHTTP = new ActiveXObject("Msxml2.XMLHTTP");
    } catch (e) {
        try {
            // >6 versions
            xmlHTTP = new ActiveXObject("Microsoft.XMLHTTP");
        } catch (E) {
            xmlHTTP = false;
        }
    }
    if (!xmlHTTP && typeof (XMLHttpRequest) != 'undefined') {
        xmlHTTP = new XMLHttpRequest();
    }
    return xmlHTTP;
}

function sendData(val) {
    var xmlHttp = makeRequestObject();
    var _url = 'output.jsp?value=' + val;
    xmlHttp.open('GET', _url, true); // true is indicating auto postback
    xmlHttp.onreadystatechange = function() {
        if (xmlHttp.readyState == 4 && xmlHttp.status == 200) {
            var content = xmlHttp.responseText;
            if (content) {
                document.getElementById('info').innerText = content;
            }
        }
    };
    xmlHttp.send(null);
}


function populateCity(val) {
    var xmlHttp = makeRequestObject();
    var url = "ShowCities.jsp?sname=" + val;
    xmlHttp.open("GET", url, true);
    xmlHttp.onreadystatechange = function() {
        if (xmlHttp.readyState == 4 && xmlHttp.status == 200) {
            var content = xmlHttp.responseText;
            if (content) {
                document.getElementById('info').innerHTML = content;
            }
        }
        xmlHttp.send(null);
    }
}

function crossCheckId(val) {
    var xmlHttp = makeRequestObject();
    var url = "CrossCheckUid.jsp?sname=" + val;
    xmlHttp.open("GET", url, true);
    xmlHttp.onreadystatechange = function() {
        if (xmlHttp.readyState == 4 && xmlHttp.status == 200) {
            var content = xmlHttp.responseText;
            if (content) {
                document.getElementById('info').innerHTML = content;
            }
        }
        xmlHttp.send(null);
    }
}