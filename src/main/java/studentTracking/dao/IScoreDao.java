package studentTracking.dao;

import org.apache.ibatis.annotations.Param;
import studentTracking.model.Score;

import java.util.List;
import java.util.Map;

/**
 * 成绩dao层接口
 */
public interface IScoreDao {

    /**
     * 林崑鹏
     * 根据people查询个人成绩
     * @param peopleId 用户名
     * @return 学生的各科成绩
     */
    List<Map<String,Object>> getPersonScores(long peopleId);


    /**
     * z
     * 添加成绩
     * @param stuId 学生id
     * @param courseId 课程id
     * @param score 成绩
     * @return 是否添加成功
     */
    boolean addScore(@Param("stuId") long stuId, @Param("courseId") long courseId, @Param("score") double score);
    /**
     * z
     * 更新成绩
     * @param stuId 学生id
     * @param courseId 课程id
     * @param score 分数
     * @return 是否更新成功
     */
    boolean updateScore(@Param("stuId") long stuId, @Param("courseId") long courseId, @Param("score") double score);
}
