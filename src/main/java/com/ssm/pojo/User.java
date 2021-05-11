package com.ssm.pojo;

/**
 * @author CZY
 */
public class User {
    private String create_time;
    private String update_time;
    private int is_deleted;
    private int user_id;
    private String real_name;
    private String account;
    private String pass_word;
    private String birthday;

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    public int getIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(int is_deleted) {
        this.is_deleted = is_deleted;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getReal_name() {
        return real_name;
    }

    public void setReal_name(String real_name) {
        this.real_name = real_name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPass_word() {
        return pass_word;
    }

    public void setPass_word(String pass_word) {
        this.pass_word = pass_word;
    }

    @Override
    public String toString() {
        return "User{" +
                "create_time='" + create_time + '\'' +
                ", update_time='" + update_time + '\'' +
                ", is_deleted=" + is_deleted +
                ", user_id=" + user_id +
                ", real_name='" + real_name + '\'' +
                ", account='" + account + '\'' +
                ", pass_word='" + pass_word + '\'' +
                '}';
    }
}
