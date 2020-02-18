import com.project.daomain.AllInfo;
import com.project.daomain.Information;
import com.project.daomain.User;
import com.project.service.Allinfoservice;
import com.project.service.Informationservice;
import com.project.service.Userservice;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.TestExecutionListeners;

import java.util.List;

public class test111 {
    @Test
    public void test1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Userservice userservice=(Userservice) ac.getBean("userservice");
        User user=new User();
        user.setName("mf");
        user.setPassword("1234");
        user.setUsername("蒙发");
        user.setPhone("18792128876");
        user.setQQ("1347567867");
        userservice.adduser(user);
        List<User> userList=userservice.findall();
        for (User user1:userList) {
            System.out.println(user1);
        }
    }
    @Test
    public void test11(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Informationservice informationservice=(Informationservice) ac.getBean("informationservice");
        Information information=informationservice.findByid(1);
        System.out.println(information);
        information.setLike(information.getLove()+1);
        informationservice.updatelike(information);
        System.out.println(information.getLove());
    }

    @Test
    public void test12(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Informationservice informationservice=(Informationservice) ac.getBean("informationservice");
        List<Information> stringList=informationservice.searckByauthor("coco");
        for (Information s:stringList) {
            System.out.println(s);
        }
    }
    @Test
    public void test3(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Informationservice informationservice=(Informationservice) ac.getBean("informationservice");
        List<Information> stringList=informationservice.searchByinfo("2月15日");
        for (Information s:stringList) {
            System.out.println(s);
        }
    }
    @Test
    public void test2(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Allinfoservice allinfoservice=(Allinfoservice) ac.getBean("allinfoservice");
        List<AllInfo> allInfos=allinfoservice.findall();
        for (AllInfo a:allInfos) {
            System.out.println(a);
            System.out.println();
        }
    }
}
