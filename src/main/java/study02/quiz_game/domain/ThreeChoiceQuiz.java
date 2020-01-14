package study02.quiz_game.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class ThreeChoiceQuiz {
    @Getter
    private final ThreeChoiceQuizNumber quizNumber;
    @Getter
    private final ThreeChoiceQuestionInfomation threeChoiceQuestionInfomation;

    public static ThreeChoiceQuiz create(
            ThreeChoiceQuizNumber threeChoiceQuizNumber,
            ThreeChoiceQuestionInfomation threeChoiceQuestionInfomation) {

        return new ThreeChoiceQuiz(threeChoiceQuizNumber, threeChoiceQuestionInfomation);
    }
}
