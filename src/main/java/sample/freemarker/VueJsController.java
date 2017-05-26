package sample.freemarker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by xiezhonggui on 2017/5/26.
 */
@Controller
public class VueJsController {
    @GetMapping("/vueJs01")
    public String vueJs01() {
        return "vueJs01";
    }

    @GetMapping("/vueJs02")
    public String vueJs02() {
        return "vueJs02";
    }

    @GetMapping("/vueJs03")
    public String vueJs03() {
        return "vueJs03";
    }

    @GetMapping("/vueJs04")
    public String vueJs04() {
        return "vueJs04";
    }

    @GetMapping("/vueJs05")
    public String vueJs05() {
        return "vueJs05";
    }

    @GetMapping("/vueJs06")
    public String vueJs06() {
        return "vueJs06";
    }

    @GetMapping("vueJs07")
    public String vueJs07() {
        return "vueJs07";
    }

}
