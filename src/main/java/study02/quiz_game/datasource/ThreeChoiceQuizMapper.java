package study02.quiz_game.datasource;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import study02.quiz_game.domain.ThreeChoiceQuestionInfomation;
import study02.quiz_game.domain.ThreeChoiceQuiz;
import study02.quiz_game.domain.ThreeChoiceQuizNumber;

import java.util.List;

@Mapper
public interface ThreeChoiceQuizMapper {
    void issue();
    int find();
    List<ThreeChoiceQuizCore> findListBy();
    void insert(@Param("threeChoiceQuiz") ThreeChoiceQuiz threeChoiceQuiz);
}
