package org.orgw.simples.service.model;


import java.util.ArrayList;
import java.util.Properties;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.transaction.Transactional;

import org.orgw.simples.core.exception.BaseException;
import org.orgw.simples.data.LeaveRequest;
import org.orgw.simples.data.LeaveResponse;
import org.orgw.simples.repository.ILeaveRequestRepository;
import org.orgw.simples.repository.IUserRepository;
import org.orgw.simples.repository.model.EmailDetails;
import org.orgw.simples.repository.model.Users;
import org.orgw.simples.service.ILeaveService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class LeaveService implements ILeaveService {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	ILeaveRequestRepository  leaveRequestRepository;
	@Autowired
	IUserRepository userRepository;
	
	@Override
	public LeaveResponse leaverequest(LeaveRequest request ) {
		
		EmailDetails entity = new EmailDetails();
		
		entity.setEmpid(request.getEmpid());
		entity.setFromdate(request.getFromdate());
		entity.setTodate(request.getTodate());
		entity.setMailid(request.getMailid());
		entity.setLeavetype(request.getLeavetype());
		entity.setCc(request.getCc());
		entity.setTomailid(request.getTomailid());
		entity.setTotaldays(request.getTotaldays());
		entity.setApplieddate(request.getApplieddate());
		entity.setLeavestatus(request.getLeavestatus());
		entity.setId(request.getId());
		entity.setStatus("1");
		
		Users user=new Users();
		   user=userRepository.getuserdetails(request.getEmpid());

		entity.setUserfirstname(user);
		leaveRequestRepository.save(entity);
		leaveRequestRepository.refresh(entity);
        
		String empid=entity.getId();
		return leavedetails(request,empid);
		
	}

	private LeaveResponse leavedetails(LeaveRequest request, String empid) {
		
		EmailDetails leavedetails=leaveRequestRepository.getleaverequestdetails(empid);
		
		
		//Users userdetails = userRepository.getuserdetails(request.getEmployeid());
		
		LeaveResponse entity=new LeaveResponse();
		entity.setEmpid(leavedetails.getEmpid());
		entity.setFromdate(leavedetails.getFromdate());
		entity.setTodate(leavedetails.getTodate());
		entity.setMailid(leavedetails.getMailid());
		entity.setLeavetype(leavedetails.getLeavetype());
		entity.setCc(leavedetails.getCc());
		entity.setTomailid(leavedetails.getTomailid());
		entity.setTotaldays(leavedetails.getTotaldays());
		entity.setLeavestatus(leavedetails.getLeavestatus());
		entity.setApplieddate(leavedetails.getApplieddate());
		entity.setId(leavedetails.getId());
		
		 // }
		 
		 // private LeaveResponse leavedetails(LeaveRequest request) {
		
		
		String todate = request.getTodate();
		
		
	//	String mailid = "selva.orgware@gmail.com";
	//	String to ="ragavanm.orgware@gmail.com";
	//	String cc = "ragini.orgware@gmail.com";
		
		String mailid = request.getMailid();
		String to = request.getTomailid();
		String cc = request.getCc();
        // Sender's email ID needs to be mentioned
         String  from = request.getFromdate();
        final String username = "orgware.	@gmail.com";//change accordingly
        final String password = "8903531780";//change accordingly
        String subject =request.getSubject();
        String content = request.getContent();
        // Assuming you are sending email through relay.jangosmtp.net
        String host = "smtp.gmail.com";    ;

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", "587");

        // Get the Session object.
        Session session = Session.getInstance(props,
           new javax.mail.Authenticator() {
              protected PasswordAuthentication getPasswordAuthentication() {
                 return new PasswordAuthentication(username, password);
  	   }
           });
    	 try{ 
    		
    		MimeMessage msg = new MimeMessage(session);
	      //set message headers
	      msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
	      msg.addHeader("format", "flowed");
	      msg.addHeader("Content-Transfer-Encoding", "8bit");

	      msg.setFrom(new InternetAddress(mailid,mailid));

	      msg.setReplyTo(InternetAddress.parse(mailid, false));
	      
	      InternetAddress[] parse = InternetAddress.parse(cc, true);
	     
	     
	      msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to, false));
	//    msg.setRecipients(Message.RecipientType.CC, InternetAddress.parse(cc, false));
	      msg.addRecipients(javax.mail.Message.RecipientType.CC, parse);

	      msg.setSubject(subject, "UTF-8");
	      
	      BodyPart messageBodyPart = new MimeBodyPart(); 
	      messageBodyPart.setText("");
	      
	      Multipart multiPart = new MimeMultipart();
	      
	      
	      multiPart.addBodyPart(messageBodyPart);
	      
	      messageBodyPart = new MimeBodyPart();
	      
	      messageBodyPart.setContent(content,"text/html");
	      multiPart.addBodyPart(messageBodyPart);
	      msg.setContent(multiPart);

	      //	      msg.setText("Sample", "UTF-8");
	      System.out.println("Message is ready");
	      
  	      Transport.send(msg);
  	    
    	 }catch(Exception e) {
    	 }
    	 return entity;
	}
	@Override
    public LeaveResponse leaverequestapprove(LeaveRequest request) throws BaseException {
        // TODO Auto-generated method stub
        EmailDetails leavedetails=this.leaveRequestRepository.getleaverequestdetails(request.getId());
        
        leavedetails.setLeavestatus(request.getLeavestatus());
        
       
        this.leaveRequestRepository.update(leavedetails);
        
        return leavedetails(request,request.getId());
        
    }

}
