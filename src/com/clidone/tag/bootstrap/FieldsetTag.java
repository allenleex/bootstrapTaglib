package com.clidone.tag.bootstrap;

import javax.servlet.jsp.JspException;

import com.clidone.tag.AbstractTag;
import com.clidone.tag.ValueUtils;

/**
 * <strong>Fieldset tag</strong>
 * @author wuhuaxia
 */
public class FieldsetTag extends AbstractTag {

    private static final long serialVersionUID = -5652842183869037064L;

    // **********************************************************************************
    //
    // Tag attributes
    //
    // **********************************************************************************
    // legend
    protected String legend = null;
    public void setLegend(String legend) {
        this.legend = legend;
    }

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

    // **********************************************************************************
    //
    // Tag methods
    //
    // **********************************************************************************
    /**
     * @see AbstractFormFieldTag#doEndTagV2()
     */
    @Override
    protected String doEndTagV2() throws JspException {
        setTagName("fieldset");

        // fieldset legend
        String legendContent = "";
        if (!ValueUtils.isEmpty(icon)) {
            legendContent += renderIcon(icon, (iconOnly != null && iconOnly.booleanValue()));
        }
        if (!ValueUtils.isEmpty(legend)) {
            legendContent += legend;
        }
        if (!ValueUtils.isEmpty(legendContent)) {
            addBeforeContent("<legend>"+legendContent+"</legend>");
        }

        return render();
    }

    /**
     * @see AbstractFormFieldTag#doEndTagV3()
     */
    @Override
    protected String doEndTagV3() throws JspException {
        return doEndTagV2();
    }
}