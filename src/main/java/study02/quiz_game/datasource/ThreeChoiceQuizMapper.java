package study02.quiz_game.datasource;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import study02.quiz_game.domain.ThreeChoiceQuiz;

import java.util.List;

@Mapper
public interface ThreeChoiceQuizMapper {
    void issue();

    int find();

    List<ThreeChoiceQuizCore> findListBy();

    void insert(@Param("threeChoiceQuiz") ThreeChoiceQuiz threeChoiceQuiz);
}
