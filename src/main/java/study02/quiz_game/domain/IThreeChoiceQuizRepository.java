package study02.quiz_game.domain;

import java.util.List;

public interface IThreeChoiceQuizRepository {

    public ThreeChoiceQuizNumber assignment();

//    public ThreeChoiceQuizList refer();

    public Integer refer();
    void register(ThreeChoiceQuiz threeChoiceQuiz);
}