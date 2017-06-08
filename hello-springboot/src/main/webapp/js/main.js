 function uploadButtonClicked(){
	 console.log('Button Clicked');
	 
	 var xhr = new XMLHttpRequest();
	 xhr.onreadystatechange = function() {
	     if (xhr.readyState == XMLHttpRequest.DONE) {
	    	 console.log('Got response');
	         alert(xhr.responseText);
	     }
	 }
	 xhr.open('GET', 'http://localhost:8080/hello', true);
	 xhr.send(null);
	 
	 //to get the size of file
	 function hrefSize(){
		    try{
		        var O= new XMLHttpRequest;
		        O.open("HEAD", document.URL, false);
		        O.send(null);
		        if(O.status== 200){
		            return O.getResponseHeader('Content-Length');
		        }
		        else return 0;
		    }
		    catch(er){
		        return 0;
		    }
		}
		alert(hrefSize()+' bytes');
 }
 
 