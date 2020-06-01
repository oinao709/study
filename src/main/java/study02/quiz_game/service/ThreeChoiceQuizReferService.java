package study02.quiz_game.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import study02.quiz_game.domain.IThreeChoiceQuizRepository;
import study02.quiz_game.domain.ThreeChoiceQuiz;

@Service
public class ThreeChoiceQuizReferService {

    @Autowired
    private IThreeChoiceQuizRepository iThreeChoiceQuizRepository;

    public ThreeChoiceQuiz refer() {
        ThreeChoiceQuiz threeChoiceQuiz = iThreeChoiceQuizRepository.refer();
        return threeChoiceQuiz;
    }
}
