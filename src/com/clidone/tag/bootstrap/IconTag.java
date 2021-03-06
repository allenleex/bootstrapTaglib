package com.clidone.tag.bootstrap;

import javax.servlet.jsp.JspException;

import com.clidone.tag.AbstractTag;

/**
 * <strong>Icon tag</strong>
 * @author wuhuaxia
 */
public class IconTag extends AbstractTag {

    private static final long serialVersionUID = 8663524616531154472L;

    // **********************************************************************************
    //
    // Tag attributes
    //
    // **********************************************************************************
    // icon
    protected String icon = null;
    public void setIcon(String icon) {
        this.icon = icon;
    }

    // iconOnly
    protected Boolean iconOnly = new Boolean(false);
    public void setIconOnly(Boolean iconOnly) {
        this.iconOnly = iconOnly;
    }

    // spin
    protected Boolean spin = new Boolean(false);
    public void setSpin(Boolean spin) {
        this.spin = spin;
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
        String iconHTML = renderIcon(icon, (iconOnly != null && iconOnly.booleanValue()), spin);
        addBeforeContent(iconHTML);

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