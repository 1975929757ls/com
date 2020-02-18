package com.project.service;


        import com.project.dao.UserDao;
        import com.project.daomain.User;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

        import java.util.List;

@Service
public class Userservice {
    @Autowired
    private UserDao userDao;
    public User findBynamepassword(String name, String password){
        return userDao.findBynamepassword(name,password);
    }
    public List<User> findall(){
        return userDao.findall();
    }
    public void adduser(User user){
        userDao.adduser(user);
    }
}
