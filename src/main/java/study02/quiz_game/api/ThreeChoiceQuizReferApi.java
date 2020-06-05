package study02.quiz_game.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import study02.quiz_game.domain.ThreeChoiceQuiz;
import study02.quiz_game.service.ThreeChoiceQuizReferService;

import java.util.HashMap;
import java.util.Map;

@Controller
public class ThreeChoiceQuizReferApi {
    @Autowired
    private ThreeChoiceQuizReferService threeChoiceQuizReferService;

    @RequestMapping(value = "/three-choice-quiz/refer")
    public String refer(Model model) {
        ThreeChoiceQuiz threeChoiceQuiz = threeChoiceQuizReferService.refer();

        Map<String, String> map = new HashMap<>();
        map.put("response", "OK");
        map.put("quiz_number", threeChoiceQuiz.getQuizNumber().getValue().toString());
        map.put("question", threeChoiceQuiz.getThreeChoiceQuestionInfomation().getThreeChoiceQuizQuestion().getQuestion().getValue());
        map.put("three_choice_quiz_choice_a", threeChoiceQuiz.getThreeChoiceQuestionInfomation().getThreeChoiceQuizAnswer().getThreeChoiceQuizChoice().getThreeChoiceQuizSelectionItemA().getThreeChoiceQuizSelectionItemValue().getValue());
        map.put("three_choice_quiz_choice_b", threeChoiceQuiz.getThreeChoiceQuestionInfomation().getThreeChoiceQuizAnswer().getThreeChoiceQuizChoice().getThreeChoiceQuizSelectionItemB().getThreeChoiceQuizSelectionItemValue().getValue());
        map.put("three_choice_quiz_choice_c", threeChoiceQuiz.getThreeChoiceQuestionInfomation().getThreeChoiceQuizAnswer().getThreeChoiceQuizChoice().getThreeChoiceQuizSelectionItemC().getThreeChoiceQuizSelectionItemValue().getValue());
        map.put("three_quiz_answer", threeChoiceQuiz.getThreeChoiceQuestionInfomation().getThreeChoiceQuizAnswer().getThreeChoiceQuizSelectionItemValue().getValue());
        model.addAttribute("map", map);

        return "three-choice-quiz/refer";
    }
}
