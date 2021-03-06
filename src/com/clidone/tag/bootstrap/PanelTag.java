package com.clidone.tag.bootstrap;

import javax.servlet.jsp.JspException;

import com.clidone.tag.AbstractTag;
import com.clidone.tag.ValueUtils;

/**
 * <strong>Panel tag</strong>
 * @author wuhuaxia
 */
public class PanelTag extends AbstractTag {

    private static final long serialVersionUID = -4271492475408010177L;

    // **********************************************************************************
    //
    // Tag attributes
    //
    // **********************************************************************************
    // theme
    protected String theme = "default";
    public void setTheme(String theme) {
        this.theme = theme;
    }

    // **********************************************************************************
    //
    // Tag methods
    //
    // **********************************************************************************
    /**
     * @see AbstractTag#doEndTagV2()
     */
    @Override
    protected String doEndTagV2() throws JspException {
        setTagName("div");

        addClass("panel");
        if (!ValueUtils.isEmpty(theme)) {
            addClass("panel-"+theme);
        }

        return render();
    }

    /**
     * @see AbstractTag#doEndTagV3()
     */
    @Override
    protected String doEndTagV3() throws JspException {
        return doEndTagV2();
    }
}