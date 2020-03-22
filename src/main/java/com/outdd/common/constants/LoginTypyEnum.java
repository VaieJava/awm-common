package com.outdd.common.constants;

/**
 * 登陆类型断定
 */
public enum LoginTypyEnum {
    USERNAME_PASSWORD("USERNAME_PASSWORD", 0),
    USERNAME_MOBILE("USERNAME_MOBILE", 1),
    WECHAT("WECHAT_LOGIN_TYPE", 2),
    BAIDU("BAIDU_LOGIN_TYPE", 3),
    GITHUB("GITHUB_LOGIN_TYPE", 4),
    Alipay("Alipay_LOGIN_TYPE", 5);


    private Integer value;
    private String name;

    private LoginTypyEnum(String name, Integer value) {
        this.name = name();
        this.value = value;
    }


    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static LoginTypyEnum getLoginTypy(Integer dataTypeCode) {
        for (LoginTypyEnum enums : LoginTypyEnum.values()) {
            if (enums.value ==dataTypeCode) {
                return enums;
            }
        }
        return null;
    }
}
