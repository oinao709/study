package study02.quiz_game.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import study02.quiz_game.domain.IThreeChoiceQuizRepository;
import study02.quiz_game.domain.ThreeChoiceQuestionInfomation;
import study02.quiz_game.domain.ThreeChoiceQuiz;
import study02.quiz_game.domain.ThreeChoiceQuizList;
import study02.quiz_game.domain.ThreeChoiceQuizNumber;

import java.util.List;

@Service
public class ThreeChoiceQuizReferService {

    @Autowired
    private IThreeChoiceQuizRepository iThreeChoiceQuizRepository;

    public Integer refer() {

        // 三択クイズ番号払い出し
//        ThreeChoiceQuizList threeChoiceQuizList = iThreeChoiceQuizRepository.refer();
//        List<ThreeChoiceQuizNumber> threeChoiceQuizNumbers = iThreeChoiceQuizRepository.refer();
        Integer a = iThreeChoiceQuizRepository.refer();

        return a;

//        return threeChoiceQuizList.getRand().getQuizNumber();
    }
}
