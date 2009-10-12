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
import java.sql.Timestamp;

/**
 * Auto generated base entity ContentAndWorkEffort.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectContentAndWorkEfforts", query="SELECT WEC.WORK_EFFORT_ID AS \"workEffortId\",WEC.FROM_DATE AS \"fromDate\",WEC.THRU_DATE AS \"thruDate\",C.CONTENT_ID AS \"contentId\",C.CONTENT_TYPE_ID AS \"contentTypeId\",C.OWNER_CONTENT_ID AS \"ownerContentId\",C.DECORATOR_CONTENT_ID AS \"decoratorContentId\",C.INSTANCE_OF_CONTENT_ID AS \"instanceOfContentId\",C.DATA_RESOURCE_ID AS \"dataResourceId\",C.TEMPLATE_DATA_RESOURCE_ID AS \"templateDataResourceId\",C.DATA_SOURCE_ID AS \"dataSourceId\",C.STATUS_ID AS \"statusId\",C.PRIVILEGE_ENUM_ID AS \"privilegeEnumId\",C.SERVICE_NAME AS \"serviceName\",C.CONTENT_NAME AS \"contentName\",C.DESCRIPTION AS \"description\",C.LOCALE_STRING AS \"localeString\",C.MIME_TYPE_ID AS \"mimeTypeId\",C.CHARACTER_SET_ID AS \"characterSetId\",C.CHILD_LEAF_COUNT AS \"childLeafCount\",C.CHILD_BRANCH_COUNT AS \"childBranchCount\",C.CREATED_DATE AS \"createdDate\",C.CREATED_BY_USER_LOGIN AS \"createdByUserLogin\",C.LAST_MODIFIED_DATE AS \"lastModifiedDate\",C.LAST_MODIFIED_BY_USER_LOGIN AS \"lastModifiedByUserLogin\",C.CLASSIFICATION_ENUM_ID AS \"classificationEnumId\" FROM CONTENT C INNER JOIN WORK_EFFORT_CONTENT WEC ON C.CONTENT_ID = WEC.CONTENT_ID", resultSetMapping="ContentAndWorkEffortMapping")
@SqlResultSetMapping(name="ContentAndWorkEffortMapping", entities={
@EntityResult(entityClass=ContentAndWorkEffort.class, fields = {
@FieldResult(name="workEffortId", column="workEffortId")
,@FieldResult(name="fromDate", column="fromDate")
,@FieldResult(name="thruDate", column="thruDate")
,@FieldResult(name="contentId", column="contentId")
,@FieldResult(name="contentTypeId", column="contentTypeId")
,@FieldResult(name="ownerContentId", column="ownerContentId")
,@FieldResult(name="decoratorContentId", column="decoratorContentId")
,@FieldResult(name="instanceOfContentId", column="instanceOfContentId")
,@FieldResult(name="dataResourceId", column="dataResourceId")
,@FieldResult(name="templateDataResourceId", column="templateDataResourceId")
,@FieldResult(name="dataSourceId", column="dataSourceId")
,@FieldResult(name="statusId", column="statusId")
,@FieldResult(name="privilegeEnumId", column="privilegeEnumId")
,@FieldResult(name="serviceName", column="serviceName")
,@FieldResult(name="contentName", column="contentName")
,@FieldResult(name="description", column="description")
,@FieldResult(name="localeString", column="localeString")
,@FieldResult(name="mimeTypeId", column="mimeTypeId")
,@FieldResult(name="characterSetId", column="characterSetId")
,@FieldResult(name="childLeafCount", column="childLeafCount")
,@FieldResult(name="childBranchCount", column="childBranchCount")
,@FieldResult(name="createdDate", column="createdDate")
,@FieldResult(name="createdByUserLogin", column="createdByUserLogin")
,@FieldResult(name="lastModifiedDate", column="lastModifiedDate")
,@FieldResult(name="lastModifiedByUserLogin", column="lastModifiedByUserLogin")
,@FieldResult(name="classificationEnumId", column="classificationEnumId")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class ContentAndWorkEffort extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("workEffortId", "WEC.WORK_EFFORT_ID");
        fields.put("fromDate", "WEC.FROM_DATE");
        fields.put("thruDate", "WEC.THRU_DATE");
        fields.put("contentId", "C.CONTENT_ID");
        fields.put("contentTypeId", "C.CONTENT_TYPE_ID");
        fields.put("ownerContentId", "C.OWNER_CONTENT_ID");
        fields.put("decoratorContentId", "C.DECORATOR_CONTENT_ID");
        fields.put("instanceOfContentId", "C.INSTANCE_OF_CONTENT_ID");
        fields.put("dataResourceId", "C.DATA_RESOURCE_ID");
        fields.put("templateDataResourceId", "C.TEMPLATE_DATA_RESOURCE_ID");
        fields.put("dataSourceId", "C.DATA_SOURCE_ID");
        fields.put("statusId", "C.STATUS_ID");
        fields.put("privilegeEnumId", "C.PRIVILEGE_ENUM_ID");
        fields.put("serviceName", "C.SERVICE_NAME");
        fields.put("contentName", "C.CONTENT_NAME");
        fields.put("description", "C.DESCRIPTION");
        fields.put("localeString", "C.LOCALE_STRING");
        fields.put("mimeTypeId", "C.MIME_TYPE_ID");
        fields.put("characterSetId", "C.CHARACTER_SET_ID");
        fields.put("childLeafCount", "C.CHILD_LEAF_COUNT");
        fields.put("childBranchCount", "C.CHILD_BRANCH_COUNT");
        fields.put("createdDate", "C.CREATED_DATE");
        fields.put("createdByUserLogin", "C.CREATED_BY_USER_LOGIN");
        fields.put("lastModifiedDate", "C.LAST_MODIFIED_DATE");
        fields.put("lastModifiedByUserLogin", "C.LAST_MODIFIED_BY_USER_LOGIN");
        fields.put("classificationEnumId", "C.CLASSIFICATION_ENUM_ID");
fieldMapColumns.put("ContentAndWorkEffort", fields);
}
  public static enum Fields implements EntityFieldInterface<ContentAndWorkEffort> {
    workEffortId("workEffortId"),
    fromDate("fromDate"),
    thruDate("thruDate"),
    contentId("contentId"),
    contentTypeId("contentTypeId"),
    ownerContentId("ownerContentId"),
    decoratorContentId("decoratorContentId"),
    instanceOfContentId("instanceOfContentId"),
    dataResourceId("dataResourceId"),
    templateDataResourceId("templateDataResourceId"),
    dataSourceId("dataSourceId"),
    statusId("statusId"),
    privilegeEnumId("privilegeEnumId"),
    serviceName("serviceName"),
    contentName("contentName"),
    description("description"),
    localeString("localeString"),
    mimeTypeId("mimeTypeId"),
    characterSetId("characterSetId"),
    childLeafCount("childLeafCount"),
    childBranchCount("childBranchCount"),
    createdDate("createdDate"),
    createdByUserLogin("createdByUserLogin"),
    lastModifiedDate("lastModifiedDate"),
    lastModifiedByUserLogin("lastModifiedByUserLogin"),
    classificationEnumId("classificationEnumId");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

    
   private String workEffortId;
    
   private Timestamp fromDate;
    
   private Timestamp thruDate;
    @Id
   private String contentId;
    
   private String contentTypeId;
    
   private String ownerContentId;
    
   private String decoratorContentId;
    
   private String instanceOfContentId;
    
   private String dataResourceId;
    
   private String templateDataResourceId;
    
   private String dataSourceId;
    
   private String statusId;
    
   private String privilegeEnumId;
    
   private String serviceName;
    
   private String contentName;
    
   private String description;
    
   private String localeString;
    
   private String mimeTypeId;
    
   private String characterSetId;
    
   private Long childLeafCount;
    
   private Long childBranchCount;
    
   private Timestamp createdDate;
    
   private String createdByUserLogin;
    
   private Timestamp lastModifiedDate;
    
   private String lastModifiedByUserLogin;
    
   private String classificationEnumId;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="CONTENT_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ContentType contentType = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="DATA_RESOURCE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private DataResource dataResource = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="CLASSIFICATION_ENUM_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Enumeration enumeration = null;

  /**
   * Default constructor.
   */
  public ContentAndWorkEffort() {
      super();
      this.baseEntityName = "ContentAndWorkEffort";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("workEffortId");this.primaryKeyNames.add("fromDate");this.primaryKeyNames.add("contentId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("workEffortId");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("contentId");this.allFieldsNames.add("contentTypeId");this.allFieldsNames.add("ownerContentId");this.allFieldsNames.add("decoratorContentId");this.allFieldsNames.add("instanceOfContentId");this.allFieldsNames.add("dataResourceId");this.allFieldsNames.add("templateDataResourceId");this.allFieldsNames.add("dataSourceId");this.allFieldsNames.add("statusId");this.allFieldsNames.add("privilegeEnumId");this.allFieldsNames.add("serviceName");this.allFieldsNames.add("contentName");this.allFieldsNames.add("description");this.allFieldsNames.add("localeString");this.allFieldsNames.add("mimeTypeId");this.allFieldsNames.add("characterSetId");this.allFieldsNames.add("childLeafCount");this.allFieldsNames.add("childBranchCount");this.allFieldsNames.add("createdDate");this.allFieldsNames.add("createdByUserLogin");this.allFieldsNames.add("lastModifiedDate");this.allFieldsNames.add("lastModifiedByUserLogin");this.allFieldsNames.add("classificationEnumId");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ContentAndWorkEffort(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param workEffortId the workEffortId to set
     */
    public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
    }
    /**
     * Auto generated value setter.
     * @param fromDate the fromDate to set
     */
    public void setFromDate(Timestamp fromDate) {
        this.fromDate = fromDate;
    }
    /**
     * Auto generated value setter.
     * @param thruDate the thruDate to set
     */
    public void setThruDate(Timestamp thruDate) {
        this.thruDate = thruDate;
    }
    /**
     * Auto generated value setter.
     * @param contentId the contentId to set
     */
    public void setContentId(String contentId) {
        this.contentId = contentId;
    }
    /**
     * Auto generated value setter.
     * @param contentTypeId the contentTypeId to set
     */
    public void setContentTypeId(String contentTypeId) {
        this.contentTypeId = contentTypeId;
    }
    /**
     * Auto generated value setter.
     * @param ownerContentId the ownerContentId to set
     */
    public void setOwnerContentId(String ownerContentId) {
        this.ownerContentId = ownerContentId;
    }
    /**
     * Auto generated value setter.
     * @param decoratorContentId the decoratorContentId to set
     */
    public void setDecoratorContentId(String decoratorContentId) {
        this.decoratorContentId = decoratorContentId;
    }
    /**
     * Auto generated value setter.
     * @param instanceOfContentId the instanceOfContentId to set
     */
    public void setInstanceOfContentId(String instanceOfContentId) {
        this.instanceOfContentId = instanceOfContentId;
    }
    /**
     * Auto generated value setter.
     * @param dataResourceId the dataResourceId to set
     */
    public void setDataResourceId(String dataResourceId) {
        this.dataResourceId = dataResourceId;
    }
    /**
     * Auto generated value setter.
     * @param templateDataResourceId the templateDataResourceId to set
     */
    public void setTemplateDataResourceId(String templateDataResourceId) {
        this.templateDataResourceId = templateDataResourceId;
    }
    /**
     * Auto generated value setter.
     * @param dataSourceId the dataSourceId to set
     */
    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }
    /**
     * Auto generated value setter.
     * @param statusId the statusId to set
     */
    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
    /**
     * Auto generated value setter.
     * @param privilegeEnumId the privilegeEnumId to set
     */
    public void setPrivilegeEnumId(String privilegeEnumId) {
        this.privilegeEnumId = privilegeEnumId;
    }
    /**
     * Auto generated value setter.
     * @param serviceName the serviceName to set
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
    /**
     * Auto generated value setter.
     * @param contentName the contentName to set
     */
    public void setContentName(String contentName) {
        this.contentName = contentName;
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
     * @param localeString the localeString to set
     */
    public void setLocaleString(String localeString) {
        this.localeString = localeString;
    }
    /**
     * Auto generated value setter.
     * @param mimeTypeId the mimeTypeId to set
     */
    public void setMimeTypeId(String mimeTypeId) {
        this.mimeTypeId = mimeTypeId;
    }
    /**
     * Auto generated value setter.
     * @param characterSetId the characterSetId to set
     */
    public void setCharacterSetId(String characterSetId) {
        this.characterSetId = characterSetId;
    }
    /**
     * Auto generated value setter.
     * @param childLeafCount the childLeafCount to set
     */
    public void setChildLeafCount(Long childLeafCount) {
        this.childLeafCount = childLeafCount;
    }
    /**
     * Auto generated value setter.
     * @param childBranchCount the childBranchCount to set
     */
    public void setChildBranchCount(Long childBranchCount) {
        this.childBranchCount = childBranchCount;
    }
    /**
     * Auto generated value setter.
     * @param createdDate the createdDate to set
     */
    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }
    /**
     * Auto generated value setter.
     * @param createdByUserLogin the createdByUserLogin to set
     */
    public void setCreatedByUserLogin(String createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }
    /**
     * Auto generated value setter.
     * @param lastModifiedDate the lastModifiedDate to set
     */
    public void setLastModifiedDate(Timestamp lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
    /**
     * Auto generated value setter.
     * @param lastModifiedByUserLogin the lastModifiedByUserLogin to set
     */
    public void setLastModifiedByUserLogin(String lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
    }
    /**
     * Auto generated value setter.
     * @param classificationEnumId the classificationEnumId to set
     */
    public void setClassificationEnumId(String classificationEnumId) {
        this.classificationEnumId = classificationEnumId;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getWorkEffortId() {
        return this.workEffortId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getFromDate() {
        return this.fromDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getThruDate() {
        return this.thruDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getContentId() {
        return this.contentId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getContentTypeId() {
        return this.contentTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOwnerContentId() {
        return this.ownerContentId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDecoratorContentId() {
        return this.decoratorContentId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getInstanceOfContentId() {
        return this.instanceOfContentId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDataResourceId() {
        return this.dataResourceId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTemplateDataResourceId() {
        return this.templateDataResourceId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDataSourceId() {
        return this.dataSourceId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getStatusId() {
        return this.statusId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPrivilegeEnumId() {
        return this.privilegeEnumId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getServiceName() {
        return this.serviceName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getContentName() {
        return this.contentName;
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
    public String getLocaleString() {
        return this.localeString;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getMimeTypeId() {
        return this.mimeTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCharacterSetId() {
        return this.characterSetId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getChildLeafCount() {
        return this.childLeafCount;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getChildBranchCount() {
        return this.childBranchCount;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getCreatedDate() {
        return this.createdDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCreatedByUserLogin() {
        return this.createdByUserLogin;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getLastModifiedDate() {
        return this.lastModifiedDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getLastModifiedByUserLogin() {
        return this.lastModifiedByUserLogin;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getClassificationEnumId() {
        return this.classificationEnumId;
    }

    /**
     * Auto generated method that gets the related <code>ContentType</code> by the relation named <code>ContentType</code>.
     * @return the <code>ContentType</code>
     * @throws RepositoryException if an error occurs
     */
    public ContentType getContentType() throws RepositoryException {
        if (this.contentType == null) {
            this.contentType = getRelatedOne(ContentType.class, "ContentType");
        }
        return this.contentType;
    }
    /**
     * Auto generated method that gets the related <code>DataResource</code> by the relation named <code>DataResource</code>.
     * @return the <code>DataResource</code>
     * @throws RepositoryException if an error occurs
     */
    public DataResource getDataResource() throws RepositoryException {
        if (this.dataResource == null) {
            this.dataResource = getRelatedOne(DataResource.class, "DataResource");
        }
        return this.dataResource;
    }
    /**
     * Auto generated method that gets the related <code>Enumeration</code> by the relation named <code>Enumeration</code>.
     * @return the <code>Enumeration</code>
     * @throws RepositoryException if an error occurs
     */
    public Enumeration getEnumeration() throws RepositoryException {
        if (this.enumeration == null) {
            this.enumeration = getRelatedOne(Enumeration.class, "Enumeration");
        }
        return this.enumeration;
    }

    /**
     * Auto generated value setter.
     * @param contentType the contentType to set
    */
    public void setContentType(ContentType contentType) {
        this.contentType = contentType;
    }
    /**
     * Auto generated value setter.
     * @param dataResource the dataResource to set
    */
    public void setDataResource(DataResource dataResource) {
        this.dataResource = dataResource;
    }
    /**
     * Auto generated value setter.
     * @param enumeration the enumeration to set
    */
    public void setEnumeration(Enumeration enumeration) {
        this.enumeration = enumeration;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setWorkEffortId((String) mapValue.get("workEffortId"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
        setContentId((String) mapValue.get("contentId"));
        setContentTypeId((String) mapValue.get("contentTypeId"));
        setOwnerContentId((String) mapValue.get("ownerContentId"));
        setDecoratorContentId((String) mapValue.get("decoratorContentId"));
        setInstanceOfContentId((String) mapValue.get("instanceOfContentId"));
        setDataResourceId((String) mapValue.get("dataResourceId"));
        setTemplateDataResourceId((String) mapValue.get("templateDataResourceId"));
        setDataSourceId((String) mapValue.get("dataSourceId"));
        setStatusId((String) mapValue.get("statusId"));
        setPrivilegeEnumId((String) mapValue.get("privilegeEnumId"));
        setServiceName((String) mapValue.get("serviceName"));
        setContentName((String) mapValue.get("contentName"));
        setDescription((String) mapValue.get("description"));
        setLocaleString((String) mapValue.get("localeString"));
        setMimeTypeId((String) mapValue.get("mimeTypeId"));
        setCharacterSetId((String) mapValue.get("characterSetId"));
        setChildLeafCount((Long) mapValue.get("childLeafCount"));
        setChildBranchCount((Long) mapValue.get("childBranchCount"));
        setCreatedDate((Timestamp) mapValue.get("createdDate"));
        setCreatedByUserLogin((String) mapValue.get("createdByUserLogin"));
        setLastModifiedDate((Timestamp) mapValue.get("lastModifiedDate"));
        setLastModifiedByUserLogin((String) mapValue.get("lastModifiedByUserLogin"));
        setClassificationEnumId((String) mapValue.get("classificationEnumId"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("workEffortId", getWorkEffortId());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("contentId", getContentId());
        mapValue.put("contentTypeId", getContentTypeId());
        mapValue.put("ownerContentId", getOwnerContentId());
        mapValue.put("decoratorContentId", getDecoratorContentId());
        mapValue.put("instanceOfContentId", getInstanceOfContentId());
        mapValue.put("dataResourceId", getDataResourceId());
        mapValue.put("templateDataResourceId", getTemplateDataResourceId());
        mapValue.put("dataSourceId", getDataSourceId());
        mapValue.put("statusId", getStatusId());
        mapValue.put("privilegeEnumId", getPrivilegeEnumId());
        mapValue.put("serviceName", getServiceName());
        mapValue.put("contentName", getContentName());
        mapValue.put("description", getDescription());
        mapValue.put("localeString", getLocaleString());
        mapValue.put("mimeTypeId", getMimeTypeId());
        mapValue.put("characterSetId", getCharacterSetId());
        mapValue.put("childLeafCount", getChildLeafCount());
        mapValue.put("childBranchCount", getChildBranchCount());
        mapValue.put("createdDate", getCreatedDate());
        mapValue.put("createdByUserLogin", getCreatedByUserLogin());
        mapValue.put("lastModifiedDate", getLastModifiedDate());
        mapValue.put("lastModifiedByUserLogin", getLastModifiedByUserLogin());
        mapValue.put("classificationEnumId", getClassificationEnumId());
        return mapValue;
    }


}
