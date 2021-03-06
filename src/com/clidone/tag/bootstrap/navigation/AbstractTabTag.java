package com.clidone.tag.bootstrap.navigation;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.jsp.JspException;

import com.clidone.tag.AbstractTag;

/**
 * <strong>Abstract Tab tag</strong>
 * @author wuhuaxia
 */
abstract class AbstractTabTag extends AbstractTag {

    private static final long serialVersionUID = 3449231373545591617L;

    // **********************************************************************************
    //
    // Tag data
    //
    // **********************************************************************************
    // item data list
    protected List<TabItemData> items = null;

    // **********************************************************************************
    //
    // Tag attributes
    //
    // **********************************************************************************
    // active
    protected String active = null;
    public String getActive() {
        return active;
    }
    public void setActive(String active) {
        this.active = active;
    }

    // fade effect
    protected Boolean fade = new Boolean(true);
    public Boolean getFade() {
        return fade;
    }
    public void setFade(Boolean fade) {
        this.fade = fade;
    }

    // justified
    protected Boolean justified = null;
    public void setJustified(Boolean justified) {
        this.justified = justified;
    }

    // **********************************************************************************
    //
    // Tag methods
    //
    // **********************************************************************************
    /**
     * @see AbstractTag#doStartTagV2()
     */
    @Override
    protected int doStartTagV2() throws JspException {
        items = new ArrayList<TabItemData>();

        return super.doStartTagV2();
    }

    /**
     * @see AbstractTag#doStartTagV3()
     */
    @Override
    protected int doStartTagV3() throws JspException {
        return doStartTagV2();
    }

    /**
     * Add item tag data
     * @param itemData column data
     */
    public void addItem(TabItemData itemData) {
        if (itemData == null) {
            return;
        }
        items.add(itemData);
    }
}