package com.demo.mapper;

/**
 * Created by cmcc on 2020-02-10.
 */
import com.demo.bean.Department;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

//@Repository 或者@Mapper，由于 @MapperScan(value="com.demo.mapper")
//故不需要加注解
public interface DepartmentMapper {
    @Select("select * from SSH_DEPARTMENT where id=#{id}")
    public Department getDeptById(Integer id);

    /*
    @Delete("delete from SSH_DEPARTMENT where id=#{id}")
    public int deleteDeptById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into SSH_DEPARTMENT(department_name) values(#{departmentName})")
    public int insertDept(Department department);

    @Update("update SSH_DEPARTMENT set departmentName=#{DEPARTMENT_NAME} where id=#{id}")
    public int updateDept(Department department);
    */

}
