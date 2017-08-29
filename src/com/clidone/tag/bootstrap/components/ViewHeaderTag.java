package com.clidone.tag.bootstrap.components;

import javax.servlet.jsp.JspException;

import com.clidone.tag.AbstractTag;

/**
 * <strong>View Header tag</strong>
 * @author wuhuaxia
 */
public class ViewHeaderTag extends AbstractTag {

    private static final long serialVersionUID = -909316261721084871L;

    // **********************************************************************************
    //
    // Tag attributes
    //
    // **********************************************************************************

    // **********************************************************************************
    //
    // Tag methods
    //
    // **********************************************************************************
    /**
     * @see AbstractTag#renderV2()
     */
    @Override
    protected String renderV2() throws JspException {
        addClass("view-header");
        return render();
    }

    /**
     * @see AbstractTag#renderV3()
     */
    @Override
    protected String renderV3() throws JspException {
        return renderV2();
    }
}