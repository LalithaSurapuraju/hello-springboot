function uploadButtonClicked() {
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

}

function fire_ajax_submit() {

	var form = $('#fileUploadForm')[0];

	var data = new FormData(form);

	//data.append("CustomField", "This is some extra data, testing");

	$("#btnSubmit").prop("disabled", true);

	$.ajax({
		type : "POST",
		enctype : 'multipart/form-data',
		url : "/fileupload",
		data : data,
		processData : false,
		contentType : false,
		cache : false,
		timeout : 600000,
		success : function(data) {

			$("#result").text(data);
			console.log("SUCCESS : ", data);
			$("#btnSubmit").prop("disabled", false);

		},
		error : function(e) {

			$("#result").text(e.responseText);
			console.log("ERROR : ", e);
			$("#btnSubmit").prop("disabled", false);

		}
	});
	

}

$("#btnSubmit").click(function() {
	
	console.log("Submit Button clicked");

	fire_ajax_submit();

});


$('#myFile').bind('change', function() {
	alert(this.files[0].size)
});
