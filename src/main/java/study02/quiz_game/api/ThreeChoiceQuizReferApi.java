package study02.quiz_game.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import study02.quiz_game.domain.ThreeChoiceQuizNumber;
import study02.quiz_game.service.ThreeChoiceQuizReferService;
import study02.quiz_game.service.ThreeChoiceQuizService;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@Controller
public class ThreeChoiceQuizReferApi {
    @Autowired
    private ThreeChoiceQuizReferService threeChoiceQuizReferService;

    @RequestMapping(value = "/three-choice-quiz/refer")
    public String refer(Model model) {
        Integer a = threeChoiceQuizReferService.refer();

        Map<String, String> map = new HashMap<>();
        map.put("response", "OK");
        map.put("quiz_number", a.toString());
        model.addAttribute("map", map);

        return "three-choice-quiz/refer";
    }
}
