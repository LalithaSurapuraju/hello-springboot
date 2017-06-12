package com.mcs.web;



import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.mcs.model.Car;




@Controller
public class HelloController {
	
	
    @RequestMapping("/hello")
    public ResponseEntity<Car> hello(){
    Car car= new Car("xys",2017,"black");
    ResponseEntity<Car> response =new ResponseEntity<Car>(car,HttpStatus.OK);
    return response;
    }
    //@PostMapping("/api/upload/")
    //@ResponseBody
    //public ResponseEntity<?> uploadFile(
      //      @RequestParam("file") MultipartFile uploadfile) 
    //{
    	// return null;

@RequestMapping("/fileupload")
public ResponseEntity<String> multiUploadFileModel(@RequestParam("myexcel")MultipartFile file) {

	ExcelReader er = new ExcelReader();
	try {
		er.readExcel(file.getBytes());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	if(file!=null){
		System.out.println(file.getName());
		System.out.println(file.getSize());
	}
    ResponseEntity<String> responseEntity = new ResponseEntity<String>("Successfully uploaded!", HttpStatus.OK);
	return responseEntity;

}
}



     
