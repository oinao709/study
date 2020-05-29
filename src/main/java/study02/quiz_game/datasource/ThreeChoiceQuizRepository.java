package study02.quiz_game.datasource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import study02.quiz_game.domain.IThreeChoiceQuizRepository;
import study02.quiz_game.domain.ThreeChoiceQuiz;
import study02.quiz_game.domain.ThreeChoiceQuizList;
import study02.quiz_game.domain.ThreeChoiceQuizNumber;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ThreeChoiceQuizRepository implements IThreeChoiceQuizRepository {

    @Autowired
    private ThreeChoiceQuizMapper threeChoiceQuizMapper;

    @Override
    public ThreeChoiceQuizNumber assignment() {
        // 番号払い出し
        threeChoiceQuizMapper.issue();
        return new ThreeChoiceQuizNumber(threeChoiceQuizMapper.find());
    }

    @Override
    public ThreeChoiceQuiz refer() {
        List<ThreeChoiceQuizCore> threeChoiceQuizCores = threeChoiceQuizMapper.findListBy();
        ThreeChoiceQuiz threeChoiceQuiz = threeChoiceQuizCores.get(0).create();
        return threeChoiceQuiz;
    }

    @Override
    public void register(ThreeChoiceQuiz threeChoiceQuiz) {
        // 永続化
        threeChoiceQuizMapper.insert(threeChoiceQuiz);
    }

}
