package rom.buulean.springforraspberry;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/demo")
public class DemoRestController {

    @RequestMapping("/")
    public String index() {
        return "Hello World!";
    }

}
