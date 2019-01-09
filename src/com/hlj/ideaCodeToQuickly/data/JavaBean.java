package com.hlj.ideaCodeToQuickly.data;

/**
 * 作者 ：HealerJean
 * 日期 ：2018/12/29  下午5:01.
 * 类描述：
 */
public class JavaBean {

    private Long id;

    private String name;

    private String pwd;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }
}
