package com.sharper.cat.bean;

import lombok.Data;

@Data
public class Admin {

    /**
     * �û�id
     */
    private Integer id;

    /**
     * ����
     */
    private String name;

    /**
     * ͷ���ַ
     */
    private String avatarPic;
    /**
     * �û���
     */
    private String username;
    /**
     * �ֻ�����
     */
    private String telephone;
    /**
     * ��ɫid
     */
    private Integer role;

    /**
     * �����ַ
     */
    private String email;

    /**
     * �û�״̬
     */
    private Integer status;
}
