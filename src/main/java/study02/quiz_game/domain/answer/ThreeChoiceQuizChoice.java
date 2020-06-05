package study02.quiz_game.domain.answer;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class ThreeChoiceQuizChoice {
    @Getter
    private final ThreeChoiceQuizSelectionItemA threeChoiceQuizSelectionItemA;
    @Getter
    private final ThreeChoiceQuizSelectionItemB threeChoiceQuizSelectionItemB;
    @Getter
    private final ThreeChoiceQuizSelectionItemC threeChoiceQuizSelectionItemC;

    public ThreeChoiceQuizSelectionItemValue getThreeChoiceQuizSelectionItemValue() {
        if (threeChoiceQuizSelectionItemA.isCorrectAnswer()) {
            return threeChoiceQuizSelectionItemA.getThreeChoiceQuizSelectionItemValue();
        }
        if (threeChoiceQuizSelectionItemB.isCorrectAnswer()) {
            return threeChoiceQuizSelectionItemB.getThreeChoiceQuizSelectionItemValue();
        }
        if (threeChoiceQuizSelectionItemC.isCorrectAnswer()) {
            return threeChoiceQuizSelectionItemC.getThreeChoiceQuizSelectionItemValue();
        }
        throw new RuntimeException("答えがないよ");
    }
}
