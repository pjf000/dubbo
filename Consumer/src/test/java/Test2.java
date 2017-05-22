import com.test.Provider;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jieliyu on 2017/2/9.
 */
public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });
        context.start();
        Provider demoService = (Provider) context.getBean("demoService"); // 获取bean
        // service
        // invocation
        // proxy
        String message = "";
        try {
            message = demoService.build("2016-10-20");
            System.out.println(" the message from server is:" + message);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}