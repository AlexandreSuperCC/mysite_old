package cn.luischen.dto.cond;

import cn.luischen.utils.TaleUtils;

/**
 * 用户查找条件
 * Created by Yuan Cao on 8/2021.
 */
public class UserCond {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
