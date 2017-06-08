package com.mcs.web;
import java.awt.List;
import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.mcs.model.Car;




@Controller
public class HelloController {
	
	
    @RequestMapping("/hello")
    public ResponseEntity<car> hello(){
    car car= new Car("xys","2017","black");
    ResponseEntity<Car> response =new ResponseEntity<car>(car,HttpStatus.OK);
    return response;
     }
    //@PostMapping("/api/upload/")
    //@ResponseBody
    //public ResponseEntity<?> uploadFile(
      //      @RequestParam("file") MultipartFile uploadfile) throws IOException
    //{
    	// return null;
    }
				
    

         
