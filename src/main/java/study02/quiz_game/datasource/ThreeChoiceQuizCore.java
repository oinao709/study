package study02.quiz_game.datasource;

import study02.quiz_game.domain.ThreeChoiceQuestionInfomation;
import study02.quiz_game.domain.ThreeChoiceQuiz;
import study02.quiz_game.domain.ThreeChoiceQuizNumber;
import study02.quiz_game.domain.answer.CorrectAnswerJudgment;
import study02.quiz_game.domain.answer.Explanation;
import study02.quiz_game.domain.answer.ThreeChoiceQuizAnswer;
import study02.quiz_game.domain.answer.ThreeChoiceQuizChoice;
import study02.quiz_game.domain.answer.ThreeChoiceQuizSelectionItemA;
import study02.quiz_game.domain.answer.ThreeChoiceQuizSelectionItemB;
import study02.quiz_game.domain.answer.ThreeChoiceQuizSelectionItemC;
import study02.quiz_game.domain.answer.ThreeChoiceQuizSelectionItemValue;
import study02.quiz_game.domain.question.Question;
import study02.quiz_game.domain.question.ThreeChoiceQuizQuestion;

public class ThreeChoiceQuizCore {
    private ThreeChoiceQuizNumber threeChoiceQuizNumber;
    private Question question;
    private ThreeChoiceQuizSelectionItemA threeChoiceQuizSelectionItemA;
    private ThreeChoiceQuizSelectionItemB threeChoiceQuizSelectionItemB;
    private ThreeChoiceQuizSelectionItemC threeChoiceQuizSelectionItemC;
    private Explanation explanation;

    public ThreeChoiceQuizCore(
            Integer threeChoiceQuizNumber,
            String question,
            String threeChoiceQuizChoiceA,
            String correctAnswerJudgementA,
            String threeChoiceQuizChoiceB,
            String correctAnswerJudgementB,
            String threeChoiceQuizChoiceC,
            String correctAnswerJudgementC,
            String explanation) {
        this.threeChoiceQuizNumber = new ThreeChoiceQuizNumber(Integer.valueOf(threeChoiceQuizNumber));
        this.question = new Question(question);
        this.threeChoiceQuizSelectionItemA = new ThreeChoiceQuizSelectionItemA(
                new ThreeChoiceQuizSelectionItemValue(threeChoiceQuizChoiceA),
                CorrectAnswerJudgment.INCORRECT_ANSWER
        );
        this.threeChoiceQuizSelectionItemB = new ThreeChoiceQuizSelectionItemB(
                new ThreeChoiceQuizSelectionItemValue(threeChoiceQuizChoiceB),
                CorrectAnswerJudgment.INCORRECT_ANSWER
        );
        this.threeChoiceQuizSelectionItemC = new ThreeChoiceQuizSelectionItemC(
                new ThreeChoiceQuizSelectionItemValue(threeChoiceQuizChoiceC),
                CorrectAnswerJudgment.INCORRECT_ANSWER
        );
        this.explanation = new Explanation(explanation);
    }

    public ThreeChoiceQuiz create() {
        return new ThreeChoiceQuiz(
                threeChoiceQuizNumber,
                new ThreeChoiceQuestionInfomation(
                        new ThreeChoiceQuizQuestion(
                                question
                        ),
                        new ThreeChoiceQuizAnswer(
                                new ThreeChoiceQuizChoice(
                                        threeChoiceQuizSelectionItemA,
                                        threeChoiceQuizSelectionItemB,
                                        threeChoiceQuizSelectionItemC
                                ),
                                explanation
                        )
                )
        );
    }
}
