package studentTracking.dao;

import org.apache.ibatis.annotations.Param;
import studentTracking.model.Student;

import java.util.List;
import java.util.Map;

/**
 * 学生dao层接口
 */
public interface IStudentDao {
    /**
     * z
     * 根据老师id和学生姓名查询学生信息
     *
     * @param teacherId  老师id
     * @param stuName    学生姓名
     * @param classState 班级状态
     * @return 学生信息列表
     */
    List<Student> getAllStuByTeacher(@Param("teacherId") long teacherId,
                                     @Param("stuName") String stuName,
                                     @Param("classState") long classState);

    /**
     * z
     * 根据老师id和学生姓名分页查询所属学生信息
     *
     * @param page       页码
     * @param limit      每页条数
     * @param teacherId  老师id
     * @param stuName    学生姓名
     * @param classState 班级状态
     * @return 学生信息列表
     */
    List<Student> getStuByTeacher(@Param("page") int page,
                                  @Param("limit") int limit,
                                  @Param("teacherId") long teacherId,
                                  @Param("stuName") String stuName,
                                  @Param("classState") long classState);

    /**
     * z
     * 根据学生id查询学生信息
     *
     * @param stuId 学生id
     * @return 学生信息
     */
    Student getStuByStuId(long stuId);

    /**
     * 林崑鹏
     * 根据peopleId查询当前学生的所有信息
     *
     * @param peopleId 用户表的peopleid
     * @return 封装了单个学生实体类的student
     */
    Student getStuInform(long peopleId);

    /**
     * 林崑鹏
     * 根据部门id获取学生信息，用于获取部门下的所有学生信息
     *
     * @param deptId 部门id
     * @return 学生列表
     */
    List<Student> getStu(long deptId);

    /**
     * 林崑鹏
     * 根据部门编号获取员工信息
     *
     * @param page   页码
     * @param limit  每页信息条数
     * @param deptId 部门编号
     * @return
     */
    List<Student> getStuByDeptId(@Param("page") int page, @Param("limit") int limit, @Param("deptId") long deptId, @Param("stuName") String stuName);
}

