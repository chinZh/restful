package com.qing.mapper;

import com.qing.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author: zhching
 * @Date: 2019/6/21 15:41
 * @Version 1.0
 */
@Mapper
public interface UserDao {

    /**
     * 新增数据
     */
    @Insert("insert into t_user(id,name,sex) values(#{id},#{name},#{sex})")
    int addUser(User user);

    /**
    * 查询一条数据
    * */
    @Select("select id,name,sex from t_user where name=#{name}")
    User getUserByName(String name);

    /**
    * 删除一条数据
    * */
    @Delete("delete from t_user where id=#{id}")
    int deleteUserById( int id);

    /**
     * 查询全部数据
     * */
    @Select("select id,name,sex from t_user")
    List<User> getUser();

    /**
     * 更新数据
     */
    @Update("update t_user set name=#{name},sex=#{sex} where id=#{id}")
    int updateUser(User user);

}
