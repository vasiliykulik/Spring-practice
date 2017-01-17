package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.jws.soap.SOAPBinding;


/**
 * Created by Стрела on 17.01.2017.
 */
public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("application-context.xml");
        LoginService service = (LoginService) applicationContext.getBean("loginService");
        System.out.println(service.login("test","test"));
       /* UserCache cache = (UserCache) applicationContext.getBean("userCache") ;
        System.out.println(cache.get("test"));
        System.out.println(cache.get("test"));
        System.out.println(cache.get("test"));
*/

    }
}
