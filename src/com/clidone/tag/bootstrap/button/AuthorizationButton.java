package com.clidone.tag.bootstrap.button;

import java.io.IOException;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspWriter;

/**
 * <strong>授权按钮标签对象</strong>
 * @author wuhuaxia
 */
public class AuthorizationButton extends ButtonTag {
    // 有效范围
    private String valid = null;

    // 当前数值
    private String current = null;

    /**
     * 获取有效范围
     * @return 有效范围
     */
    public String getValid() {
        return current;
    }

    /**
     * 设置有效范围
     * @param valid 有效范围
     */
    public void setValid(String valid) {
        this.valid = valid;
    }

    /**
     * 获取当前数值
     * @return 当前数值
     */
    public String getCurrent() {
        return current;
    }

    /**
     * 设置当前数值
     * @param current 当前数值
     */
    public void setCurrent(String current) {
        this.current = current;
    }
}