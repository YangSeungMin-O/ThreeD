package co.kr.threed;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class MainController {
    @GetMapping("main")
    public List<String> main(){
        return Arrays.asList("메인페이지 RestController 생성", "asList 테스트1", "asList 테스트2");
    }
}
