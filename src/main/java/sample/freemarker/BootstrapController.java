package sample.freemarker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by xiezhonggui on 2017/5/26.
 */
@Controller
public class BootstrapController {
    @GetMapping("/bootstrap01")
    private String bootstrap01() {
        return "bootstrap01";
    }
}
