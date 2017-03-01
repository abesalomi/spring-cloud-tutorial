package combal.cloud.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by abesalomi on 3/1/17.
 */
@RestController
public class DemoController {
    @Value("${hello.to.client}")
    private String hello;


    @RequestMapping("hello")
    public String hello(){
        return "Message from config: " + hello;
    }

}
