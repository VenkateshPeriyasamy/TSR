package org.orgw.simples.service.model;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.orgw.simples.core.exception.BaseException;
import org.orgw.simples.core.util.UtilHelper;
import org.orgw.simples.data.AttendanceRequest;
import org.orgw.simples.data.AttendanceResponse;
import org.orgw.simples.data.CreateTestRequest;
import org.orgw.simples.data.ProfileRequest;
import org.orgw.simples.data.UserResponse;
import org.orgw.simples.repository.ITestRepository;
import org.orgw.simples.repository.IUserRepository;
import org.orgw.simples.repository.model.Attendance;
import org.orgw.simples.repository.model.Users;
import org.orgw.simples.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService  implements IUserService{

    @Autowired
    IUserRepository userRepository;
    
    @Override
    public UserResponse addUser(CreateTestRequest request) {
        
         Users user = this.userRepository.getupdatedetails(request.getEmpid());
         String id;

         if (user != null)
          {
        Users newuser = new Users();
        newuser.setEmpid(request.getEmpid());
        newuser.setIp(request.getIp());
        newuser.setPassword(request.getPassword());
        newuser.setDateTime(UtilHelper.getSystemDate());
        newuser.setStatus("1");
        userRepository.save(newuser);
        userRepository.refresh(newuser);
        
        id = newuser.getEmpid();
          }
         else
         {
             user.setSickleave(request.getSickleave());
                this.userRepository.update(user);
                id = user.getEmpid();
         }
        
        
        return getdetails(request, id);
    }

    private UserResponse getdetails(CreateTestRequest request, String id) {
        
        
        Users userdetails = userRepository.getuserdetails(request.getEmpid());
        
        UserResponse user=  new UserResponse();
        user.setEmpid(userdetails.getEmpid());
        user.setSickleave(userdetails.getSickleave());
        user.setCasualleave(userdetails.getCasualleave());
        user.setEarnedleave(userdetails.getEarnedleave());
        user.setMaternityleave(userdetails.getMaternityleave());
        user.setMedicalleave(userdetails.getMedicalleave());
        user.setSltaken(userdetails.getSltaken());
        user.setCltaken(userdetails.getCltaken());
        user.setEltaken(userdetails.getEltaken());
        user.setMtltaken(userdetails.getMtltaken());
        user.setMdltaken(userdetails.getMdltaken());
        return user;
    }


      @Override
      public UserResponse leaveapprove(CreateTestRequest request) {

    	 Users newuser = this.userRepository.getuserdetails(request.getEmpid());

         newuser.setSickleave(request.getSickleave());
         newuser.setCasualleave(request.getCasualleave());
         newuser.setEarnedleave(request.getEarnedleave());
         newuser.setMedicalleave(request.getMedicalleave());
         newuser.setMaternityleave(request.getMaternityleave());
         newuser.setSltaken(request.getSltaken());
         newuser.setCltaken(request.getCltaken());
         newuser.setEltaken(request.getEltaken());
         newuser.setMtltaken(request.getMtltaken());
         newuser.setMdltaken(request.getMdltaken());
         this.userRepository.update(newuser);


      
      return getdetails(request, newuser.getId());
      }

      @Override
        public UserResponse saveleavedetails(CreateTestRequest request) {
            // TODO Auto-generated method stub
    	
            Users users = this.userRepository.getuserdetails(request.getEmpid());

            users.setEmpid(request.getEmpid());
            users.setSickleave(request.getSickleave());
            users.setCasualleave(request.getCasualleave());
            users.setEarnedleave(request.getEarnedleave());
            users.setMaternityleave(request.getMaternityleave());
            users.setMedicalleave(request.getMedicalleave());
            
            this.userRepository.update(users);
          

           return getdetails(request,users.getId());
            
        }

	@Override
	public List<UserResponse> employeeleavedetails(CreateTestRequest request) {

		
		List<UserResponse> employeeleavelist=new ArrayList<UserResponse>();
		
		List<Users> users=userRepository.getemployeeleavedetails();
		
		for(Users entity :users) {
			UserResponse entitys=new UserResponse();
			entitys.setEmpid(entity.getEmpid());
			entitys.setTotalleavetaken(entity.getTotalleavetaken());
			entitys.setSltaken(entity.getSltaken());
			entitys.setCltaken(entity.getCltaken());
            entitys.setEltaken(entity.getEltaken());
            entitys.setMtltaken(entity.getMtltaken());
            entitys.setMdltaken(entity.getMdltaken());
            employeeleavelist.add(entitys); 
           
		}
		return employeeleavelist;
	}

	

	
    
    
    

    
}