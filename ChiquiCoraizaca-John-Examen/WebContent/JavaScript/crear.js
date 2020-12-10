function createOperadora() {
	
	
	var num = document.getElementsByName("telfs")[0].value;
	
	
	 if (window.XMLHttpRequest) {
            // code for IE7+, Firefox, Chrome, Opera, Safari 
            xmlhttp = new XMLHttpRequest();
        } else { // code for IE6, IE5 
            xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
        }

        xmlhttp.onreadystatechange = function() {
            if (this.readyState == 4 && this.status == 200) {
                document.getElementById("pantalla").innerHTML = this.responseText;
            }
        };

        xmlhttp.open("GET", "/ChiquiCoraizaca-John-Examen/telefons?num="+num, true);
        xmlhttp.send();
	

    return false;

}