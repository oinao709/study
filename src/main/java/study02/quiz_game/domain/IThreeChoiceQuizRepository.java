package study02.quiz_game.domain;

import java.util.List;

public interface IThreeChoiceQuizRepository {

    public ThreeChoiceQuizNumber assignment();
    public ThreeChoiceQuiz refer();
    void register(ThreeChoiceQuiz threeChoiceQuiz);
}