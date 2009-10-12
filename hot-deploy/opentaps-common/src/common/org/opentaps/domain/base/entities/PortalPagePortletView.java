package org.opentaps.domain.base.entities;

/*
* Copyright (c) 2008 - 2009 Open Source Strategies, Inc.
*
* This program is free software; you can redistribute it and/or modify
* it under the terms of the Honest Public License.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* Honest Public License for more details.
*
* You should have received a copy of the Honest Public License
* along with this program; if not, write to Funambol,
* 643 Bair Island Road, Suite 305 - Redwood City, CA 94063, USA
*/

// DO NOT EDIT THIS FILE!  THIS IS AUTO GENERATED AND WILL GET WRITTEN OVER PERIODICALLY WHEN THE DATA MODEL CHANGES
// EXTEND THIS CLASS INSTEAD.

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import javolution.util.FastMap;

import org.opentaps.foundation.entity.Entity;
import org.opentaps.foundation.entity.EntityFieldInterface;
import org.opentaps.foundation.repository.RepositoryException;
import org.opentaps.foundation.repository.RepositoryInterface;
import javax.persistence.*;
import org.hibernate.search.annotations.*;
import java.lang.Long;
import java.lang.String;

/**
 * Auto generated base entity PortalPagePortletView.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectPortalPagePortletViews", query="SELECT PPGPTLT.PORTAL_PAGE_ID AS \"portalPageId\",PPGPTLT.PORTAL_PORTLET_ID AS \"portalPortletId\",PPGPTLT.PORTLET_SEQ_ID AS \"portletSeqId\",PPGPTLT.COLUMN_SEQ_ID AS \"columnSeqId\",PPGPTLT.SEQUENCE_NUM AS \"sequenceNum\",PTLT.PORTLET_NAME AS \"portletName\",PTLT.SCREEN_NAME AS \"screenName\",PTLT.SCREEN_LOCATION AS \"screenLocation\",PTLT.EDIT_FORM_NAME AS \"editFormName\",PTLT.EDIT_FORM_LOCATION AS \"editFormLocation\",PTLT.DESCRIPTION AS \"description\",PTLT.SCREENSHOT AS \"screenshot\",PTLT.SECURITY_SERVICE_NAME AS \"securityServiceName\",PTLT.SECURITY_MAIN_ACTION AS \"securityMainAction\" FROM PORTAL_PAGE_PORTLET PPGPTLT INNER JOIN PORTAL_PORTLET PTLT ON PPGPTLT.PORTAL_PORTLET_ID = PTLT.PORTAL_PORTLET_ID", resultSetMapping="PortalPagePortletViewMapping")
@SqlResultSetMapping(name="PortalPagePortletViewMapping", entities={
@EntityResult(entityClass=PortalPagePortletView.class, fields = {
@FieldResult(name="portalPageId", column="portalPageId")
,@FieldResult(name="portalPortletId", column="portalPortletId")
,@FieldResult(name="portletSeqId", column="portletSeqId")
,@FieldResult(name="columnSeqId", column="columnSeqId")
,@FieldResult(name="sequenceNum", column="sequenceNum")
,@FieldResult(name="portletName", column="portletName")
,@FieldResult(name="screenName", column="screenName")
,@FieldResult(name="screenLocation", column="screenLocation")
,@FieldResult(name="editFormName", column="editFormName")
,@FieldResult(name="editFormLocation", column="editFormLocation")
,@FieldResult(name="description", column="description")
,@FieldResult(name="screenshot", column="screenshot")
,@FieldResult(name="securityServiceName", column="securityServiceName")
,@FieldResult(name="securityMainAction", column="securityMainAction")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class PortalPagePortletView extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("portalPageId", "PPGPTLT.PORTAL_PAGE_ID");
        fields.put("portalPortletId", "PPGPTLT.PORTAL_PORTLET_ID");
        fields.put("portletSeqId", "PPGPTLT.PORTLET_SEQ_ID");
        fields.put("columnSeqId", "PPGPTLT.COLUMN_SEQ_ID");
        fields.put("sequenceNum", "PPGPTLT.SEQUENCE_NUM");
        fields.put("portletName", "PTLT.PORTLET_NAME");
        fields.put("screenName", "PTLT.SCREEN_NAME");
        fields.put("screenLocation", "PTLT.SCREEN_LOCATION");
        fields.put("editFormName", "PTLT.EDIT_FORM_NAME");
        fields.put("editFormLocation", "PTLT.EDIT_FORM_LOCATION");
        fields.put("description", "PTLT.DESCRIPTION");
        fields.put("screenshot", "PTLT.SCREENSHOT");
        fields.put("securityServiceName", "PTLT.SECURITY_SERVICE_NAME");
        fields.put("securityMainAction", "PTLT.SECURITY_MAIN_ACTION");
fieldMapColumns.put("PortalPagePortletView", fields);
}
  public static enum Fields implements EntityFieldInterface<PortalPagePortletView> {
    portalPageId("portalPageId"),
    portalPortletId("portalPortletId"),
    portletSeqId("portletSeqId"),
    columnSeqId("columnSeqId"),
    sequenceNum("sequenceNum"),
    portletName("portletName"),
    screenName("screenName"),
    screenLocation("screenLocation"),
    editFormName("editFormName"),
    editFormLocation("editFormLocation"),
    description("description"),
    screenshot("screenshot"),
    securityServiceName("securityServiceName"),
    securityMainAction("securityMainAction");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

    @Id
   private String portalPageId;
    
   private String portalPortletId;
    
   private String portletSeqId;
    
   private String columnSeqId;
    
   private Long sequenceNum;
    
   private String portletName;
    
   private String screenName;
    
   private String screenLocation;
    
   private String editFormName;
    
   private String editFormLocation;
    
   private String description;
    
   private String screenshot;
    
   private String securityServiceName;
    
   private String securityMainAction;

  /**
   * Default constructor.
   */
  public PortalPagePortletView() {
      super();
      this.baseEntityName = "PortalPagePortletView";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("portalPageId");this.primaryKeyNames.add("portalPortletId");this.primaryKeyNames.add("portletSeqId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("portalPageId");this.allFieldsNames.add("portalPortletId");this.allFieldsNames.add("portletSeqId");this.allFieldsNames.add("columnSeqId");this.allFieldsNames.add("sequenceNum");this.allFieldsNames.add("portletName");this.allFieldsNames.add("screenName");this.allFieldsNames.add("screenLocation");this.allFieldsNames.add("editFormName");this.allFieldsNames.add("editFormLocation");this.allFieldsNames.add("description");this.allFieldsNames.add("screenshot");this.allFieldsNames.add("securityServiceName");this.allFieldsNames.add("securityMainAction");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public PortalPagePortletView(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param portalPageId the portalPageId to set
     */
    public void setPortalPageId(String portalPageId) {
        this.portalPageId = portalPageId;
    }
    /**
     * Auto generated value setter.
     * @param portalPortletId the portalPortletId to set
     */
    public void setPortalPortletId(String portalPortletId) {
        this.portalPortletId = portalPortletId;
    }
    /**
     * Auto generated value setter.
     * @param portletSeqId the portletSeqId to set
     */
    public void setPortletSeqId(String portletSeqId) {
        this.portletSeqId = portletSeqId;
    }
    /**
     * Auto generated value setter.
     * @param columnSeqId the columnSeqId to set
     */
    public void setColumnSeqId(String columnSeqId) {
        this.columnSeqId = columnSeqId;
    }
    /**
     * Auto generated value setter.
     * @param sequenceNum the sequenceNum to set
     */
    public void setSequenceNum(Long sequenceNum) {
        this.sequenceNum = sequenceNum;
    }
    /**
     * Auto generated value setter.
     * @param portletName the portletName to set
     */
    public void setPortletName(String portletName) {
        this.portletName = portletName;
    }
    /**
     * Auto generated value setter.
     * @param screenName the screenName to set
     */
    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }
    /**
     * Auto generated value setter.
     * @param screenLocation the screenLocation to set
     */
    public void setScreenLocation(String screenLocation) {
        this.screenLocation = screenLocation;
    }
    /**
     * Auto generated value setter.
     * @param editFormName the editFormName to set
     */
    public void setEditFormName(String editFormName) {
        this.editFormName = editFormName;
    }
    /**
     * Auto generated value setter.
     * @param editFormLocation the editFormLocation to set
     */
    public void setEditFormLocation(String editFormLocation) {
        this.editFormLocation = editFormLocation;
    }
    /**
     * Auto generated value setter.
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * Auto generated value setter.
     * @param screenshot the screenshot to set
     */
    public void setScreenshot(String screenshot) {
        this.screenshot = screenshot;
    }
    /**
     * Auto generated value setter.
     * @param securityServiceName the securityServiceName to set
     */
    public void setSecurityServiceName(String securityServiceName) {
        this.securityServiceName = securityServiceName;
    }
    /**
     * Auto generated value setter.
     * @param securityMainAction the securityMainAction to set
     */
    public void setSecurityMainAction(String securityMainAction) {
        this.securityMainAction = securityMainAction;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPortalPageId() {
        return this.portalPageId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPortalPortletId() {
        return this.portalPortletId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPortletSeqId() {
        return this.portletSeqId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getColumnSeqId() {
        return this.columnSeqId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getSequenceNum() {
        return this.sequenceNum;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPortletName() {
        return this.portletName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getScreenName() {
        return this.screenName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getScreenLocation() {
        return this.screenLocation;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getEditFormName() {
        return this.editFormName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getEditFormLocation() {
        return this.editFormLocation;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getScreenshot() {
        return this.screenshot;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSecurityServiceName() {
        return this.securityServiceName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSecurityMainAction() {
        return this.securityMainAction;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setPortalPageId((String) mapValue.get("portalPageId"));
        setPortalPortletId((String) mapValue.get("portalPortletId"));
        setPortletSeqId((String) mapValue.get("portletSeqId"));
        setColumnSeqId((String) mapValue.get("columnSeqId"));
        setSequenceNum((Long) mapValue.get("sequenceNum"));
        setPortletName((String) mapValue.get("portletName"));
        setScreenName((String) mapValue.get("screenName"));
        setScreenLocation((String) mapValue.get("screenLocation"));
        setEditFormName((String) mapValue.get("editFormName"));
        setEditFormLocation((String) mapValue.get("editFormLocation"));
        setDescription((String) mapValue.get("description"));
        setScreenshot((String) mapValue.get("screenshot"));
        setSecurityServiceName((String) mapValue.get("securityServiceName"));
        setSecurityMainAction((String) mapValue.get("securityMainAction"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("portalPageId", getPortalPageId());
        mapValue.put("portalPortletId", getPortalPortletId());
        mapValue.put("portletSeqId", getPortletSeqId());
        mapValue.put("columnSeqId", getColumnSeqId());
        mapValue.put("sequenceNum", getSequenceNum());
        mapValue.put("portletName", getPortletName());
        mapValue.put("screenName", getScreenName());
        mapValue.put("screenLocation", getScreenLocation());
        mapValue.put("editFormName", getEditFormName());
        mapValue.put("editFormLocation", getEditFormLocation());
        mapValue.put("description", getDescription());
        mapValue.put("screenshot", getScreenshot());
        mapValue.put("securityServiceName", getSecurityServiceName());
        mapValue.put("securityMainAction", getSecurityMainAction());
        return mapValue;
    }


}
