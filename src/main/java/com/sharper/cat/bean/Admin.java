package com.sharper.cat.bean;

import lombok.Data;

@Data
public class Admin {

    /**
     * 用户id
     */
    private Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 头像地址
     */
    private String avatarPic;
    /**
     * 用户名
     */
    private String username;
    /**
     * 手机号码
     */
    private String telephone;
    /**
     * 角色id
     */
    private Integer role;

    /**
     * 邮箱地址
     */
    private String email;

    /**
     * 用户状态
     */
    private Integer status;
}
