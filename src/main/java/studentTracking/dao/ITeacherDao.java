package studentTracking.dao;

import org.apache.ibatis.annotations.Param;
import studentTracking.model.Teacher;
import java.util.List;
import studentTracking.model.Teacher;

/**
 * 教师dao层接口
 */
public interface ITeacherDao {
    /**
     * z
     * 通过老师id获得老师信息
     * @param teacherId 老师id
     * @return 老师信息
     */
    Teacher getTeacherById(long teacherId);

    /**
     * z
     * 根据教师id修改教师信息
     * @param teacher 教师信息
     * @return 是否修改成功
     */
    boolean updateTeacherById(Teacher teacher);
}
