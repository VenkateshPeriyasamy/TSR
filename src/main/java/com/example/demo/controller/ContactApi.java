package com.example.demo.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.model.ContactDTO;
import com.example.demo.repo.Contact;

@RequestMapping("")
@Controller

public class ContactApi {

	private final Contact contactrepo;
	public ContactApi(Contact contactrepo) {
		this.contactrepo = contactrepo;
	}

	@Autowired
	private JavaMailSender sender;

	@RequestMapping(path = "/contactapi", method = RequestMethod.POST)
	@ResponseBody

	public String Contactcontroller(@RequestParam("name") String name,@RequestParam("email") String email,@RequestParam("mobilenumber") String mobilenumber,@RequestParam("batchno") String batchno,@RequestParam("department") String department,@RequestParam("course") String course,@RequestParam("presentorganization") String presentorganization,
			@RequestParam("designation") String designation,@RequestParam("presentlocation") String presentlocation,@RequestParam("message") String message, @RequestParam("attachment") MultipartFile uploadfile ) throws MessagingException, IOException {
		
		String filepath = null;
		String filename = null;
		if (!uploadfile.isEmpty()) {
		    
		    filename = uploadfile.getOriginalFilename();
		    String directory = "C://temp//";
		    filepath = Paths.get(directory, filename).toString();
		    BufferedOutputStream stream =
		        new BufferedOutputStream(new FileOutputStream(new File(filepath)));
		    stream.write(uploadfile.getBytes());
		    stream.close();
		}
		MimeMessage messages = sender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(messages, true);
		
		helper.setTo(email);
		helper.setCc("admin@tsrahaman.org");
		helper.setText("Candidate Name: " + name +"\n"+"Course Type: "+ department +"\n"+"Course: "+ course +"\n"+"Mobile No: "+ mobilenumber +"\n"+"Batch No: "+ batchno +"\n"+"Present Organization: "+ presentorganization +"\n"+"Designation: "+ designation +"\n"+"Present Location: "+ presentlocation +"\n"+"Message: "+ message);
		helper.setSubject("ALUMNI: "+name+", "+"Batch No:"+batchno+", "+course);
		 
		FileSystemResource file = null;
		if (filepath != null) {
			file = new FileSystemResource(filepath);
			helper.addAttachment(file.getFilename(), file);
		}	
		sender.send(messages);

		if (name != null && email != null && mobilenumber !=null && department !=null && course != null) 
			contactrepo.save(new ContactDTO(name, email, mobilenumber,batchno, department, course, message, filepath, presentorganization, designation, presentlocation));

		return "alumni";
	}
}
