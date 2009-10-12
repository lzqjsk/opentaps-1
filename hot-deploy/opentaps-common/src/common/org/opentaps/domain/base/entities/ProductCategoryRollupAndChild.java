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
import java.lang.String;
import java.sql.Timestamp;

/**
 * Auto generated base entity ProductCategoryRollupAndChild.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectProductCategoryRollupAndChilds", query="SELECT PCR.PARENT_PRODUCT_CATEGORY_ID AS \"parentProductCategoryId\",PCR.FROM_DATE AS \"fromDate\",PCR.THRU_DATE AS \"thruDate\",CPC.PRODUCT_CATEGORY_ID AS \"productCategoryId\",CPC.PRODUCT_CATEGORY_TYPE_ID AS \"productCategoryTypeId\",CPC.PRIMARY_PARENT_CATEGORY_ID AS \"primaryParentCategoryId\",CPC.CATEGORY_NAME AS \"categoryName\",CPC.DESCRIPTION AS \"description\",CPC.LONG_DESCRIPTION AS \"longDescription\",CPC.CATEGORY_IMAGE_URL AS \"categoryImageUrl\",CPC.LINK_ONE_IMAGE_URL AS \"linkOneImageUrl\",CPC.LINK_TWO_IMAGE_URL AS \"linkTwoImageUrl\",CPC.DETAIL_SCREEN AS \"detailScreen\",CPC.SHOW_IN_SELECT AS \"showInSelect\" FROM PRODUCT_CATEGORY_ROLLUP PCR INNER JOIN PRODUCT_CATEGORY CPC ON PCR.PRODUCT_CATEGORY_ID = CPC.PRODUCT_CATEGORY_ID", resultSetMapping="ProductCategoryRollupAndChildMapping")
@SqlResultSetMapping(name="ProductCategoryRollupAndChildMapping", entities={
@EntityResult(entityClass=ProductCategoryRollupAndChild.class, fields = {
@FieldResult(name="parentProductCategoryId", column="parentProductCategoryId")
,@FieldResult(name="fromDate", column="fromDate")
,@FieldResult(name="thruDate", column="thruDate")
,@FieldResult(name="productCategoryId", column="productCategoryId")
,@FieldResult(name="productCategoryTypeId", column="productCategoryTypeId")
,@FieldResult(name="primaryParentCategoryId", column="primaryParentCategoryId")
,@FieldResult(name="categoryName", column="categoryName")
,@FieldResult(name="description", column="description")
,@FieldResult(name="longDescription", column="longDescription")
,@FieldResult(name="categoryImageUrl", column="categoryImageUrl")
,@FieldResult(name="linkOneImageUrl", column="linkOneImageUrl")
,@FieldResult(name="linkTwoImageUrl", column="linkTwoImageUrl")
,@FieldResult(name="detailScreen", column="detailScreen")
,@FieldResult(name="showInSelect", column="showInSelect")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class ProductCategoryRollupAndChild extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("parentProductCategoryId", "PCR.PARENT_PRODUCT_CATEGORY_ID");
        fields.put("fromDate", "PCR.FROM_DATE");
        fields.put("thruDate", "PCR.THRU_DATE");
        fields.put("productCategoryId", "CPC.PRODUCT_CATEGORY_ID");
        fields.put("productCategoryTypeId", "CPC.PRODUCT_CATEGORY_TYPE_ID");
        fields.put("primaryParentCategoryId", "CPC.PRIMARY_PARENT_CATEGORY_ID");
        fields.put("categoryName", "CPC.CATEGORY_NAME");
        fields.put("description", "CPC.DESCRIPTION");
        fields.put("longDescription", "CPC.LONG_DESCRIPTION");
        fields.put("categoryImageUrl", "CPC.CATEGORY_IMAGE_URL");
        fields.put("linkOneImageUrl", "CPC.LINK_ONE_IMAGE_URL");
        fields.put("linkTwoImageUrl", "CPC.LINK_TWO_IMAGE_URL");
        fields.put("detailScreen", "CPC.DETAIL_SCREEN");
        fields.put("showInSelect", "CPC.SHOW_IN_SELECT");
fieldMapColumns.put("ProductCategoryRollupAndChild", fields);
}
  public static enum Fields implements EntityFieldInterface<ProductCategoryRollupAndChild> {
    parentProductCategoryId("parentProductCategoryId"),
    fromDate("fromDate"),
    thruDate("thruDate"),
    productCategoryId("productCategoryId"),
    productCategoryTypeId("productCategoryTypeId"),
    primaryParentCategoryId("primaryParentCategoryId"),
    categoryName("categoryName"),
    description("description"),
    longDescription("longDescription"),
    categoryImageUrl("categoryImageUrl"),
    linkOneImageUrl("linkOneImageUrl"),
    linkTwoImageUrl("linkTwoImageUrl"),
    detailScreen("detailScreen"),
    showInSelect("showInSelect");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

    
   private String parentProductCategoryId;
    
   private Timestamp fromDate;
    
   private Timestamp thruDate;
    @Id
   private String productCategoryId;
    
   private String productCategoryTypeId;
    
   private String primaryParentCategoryId;
    
   private String categoryName;
    
   private String description;
    
   private String longDescription;
    
   private String categoryImageUrl;
    
   private String linkOneImageUrl;
    
   private String linkTwoImageUrl;
    
   private String detailScreen;
    
   private String showInSelect;

  /**
   * Default constructor.
   */
  public ProductCategoryRollupAndChild() {
      super();
      this.baseEntityName = "ProductCategoryRollupAndChild";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("parentProductCategoryId");this.primaryKeyNames.add("fromDate");this.primaryKeyNames.add("productCategoryId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("parentProductCategoryId");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("productCategoryId");this.allFieldsNames.add("productCategoryTypeId");this.allFieldsNames.add("primaryParentCategoryId");this.allFieldsNames.add("categoryName");this.allFieldsNames.add("description");this.allFieldsNames.add("longDescription");this.allFieldsNames.add("categoryImageUrl");this.allFieldsNames.add("linkOneImageUrl");this.allFieldsNames.add("linkTwoImageUrl");this.allFieldsNames.add("detailScreen");this.allFieldsNames.add("showInSelect");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ProductCategoryRollupAndChild(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param parentProductCategoryId the parentProductCategoryId to set
     */
    public void setParentProductCategoryId(String parentProductCategoryId) {
        this.parentProductCategoryId = parentProductCategoryId;
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
     * @param productCategoryId the productCategoryId to set
     */
    public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
    }
    /**
     * Auto generated value setter.
     * @param productCategoryTypeId the productCategoryTypeId to set
     */
    public void setProductCategoryTypeId(String productCategoryTypeId) {
        this.productCategoryTypeId = productCategoryTypeId;
    }
    /**
     * Auto generated value setter.
     * @param primaryParentCategoryId the primaryParentCategoryId to set
     */
    public void setPrimaryParentCategoryId(String primaryParentCategoryId) {
        this.primaryParentCategoryId = primaryParentCategoryId;
    }
    /**
     * Auto generated value setter.
     * @param categoryName the categoryName to set
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
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
     * @param longDescription the longDescription to set
     */
    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }
    /**
     * Auto generated value setter.
     * @param categoryImageUrl the categoryImageUrl to set
     */
    public void setCategoryImageUrl(String categoryImageUrl) {
        this.categoryImageUrl = categoryImageUrl;
    }
    /**
     * Auto generated value setter.
     * @param linkOneImageUrl the linkOneImageUrl to set
     */
    public void setLinkOneImageUrl(String linkOneImageUrl) {
        this.linkOneImageUrl = linkOneImageUrl;
    }
    /**
     * Auto generated value setter.
     * @param linkTwoImageUrl the linkTwoImageUrl to set
     */
    public void setLinkTwoImageUrl(String linkTwoImageUrl) {
        this.linkTwoImageUrl = linkTwoImageUrl;
    }
    /**
     * Auto generated value setter.
     * @param detailScreen the detailScreen to set
     */
    public void setDetailScreen(String detailScreen) {
        this.detailScreen = detailScreen;
    }
    /**
     * Auto generated value setter.
     * @param showInSelect the showInSelect to set
     */
    public void setShowInSelect(String showInSelect) {
        this.showInSelect = showInSelect;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getParentProductCategoryId() {
        return this.parentProductCategoryId;
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
    public String getProductCategoryId() {
        return this.productCategoryId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductCategoryTypeId() {
        return this.productCategoryTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPrimaryParentCategoryId() {
        return this.primaryParentCategoryId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCategoryName() {
        return this.categoryName;
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
    public String getLongDescription() {
        return this.longDescription;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCategoryImageUrl() {
        return this.categoryImageUrl;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getLinkOneImageUrl() {
        return this.linkOneImageUrl;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getLinkTwoImageUrl() {
        return this.linkTwoImageUrl;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDetailScreen() {
        return this.detailScreen;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getShowInSelect() {
        return this.showInSelect;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setParentProductCategoryId((String) mapValue.get("parentProductCategoryId"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
        setProductCategoryId((String) mapValue.get("productCategoryId"));
        setProductCategoryTypeId((String) mapValue.get("productCategoryTypeId"));
        setPrimaryParentCategoryId((String) mapValue.get("primaryParentCategoryId"));
        setCategoryName((String) mapValue.get("categoryName"));
        setDescription((String) mapValue.get("description"));
        setLongDescription((String) mapValue.get("longDescription"));
        setCategoryImageUrl((String) mapValue.get("categoryImageUrl"));
        setLinkOneImageUrl((String) mapValue.get("linkOneImageUrl"));
        setLinkTwoImageUrl((String) mapValue.get("linkTwoImageUrl"));
        setDetailScreen((String) mapValue.get("detailScreen"));
        setShowInSelect((String) mapValue.get("showInSelect"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("parentProductCategoryId", getParentProductCategoryId());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("productCategoryId", getProductCategoryId());
        mapValue.put("productCategoryTypeId", getProductCategoryTypeId());
        mapValue.put("primaryParentCategoryId", getPrimaryParentCategoryId());
        mapValue.put("categoryName", getCategoryName());
        mapValue.put("description", getDescription());
        mapValue.put("longDescription", getLongDescription());
        mapValue.put("categoryImageUrl", getCategoryImageUrl());
        mapValue.put("linkOneImageUrl", getLinkOneImageUrl());
        mapValue.put("linkTwoImageUrl", getLinkTwoImageUrl());
        mapValue.put("detailScreen", getDetailScreen());
        mapValue.put("showInSelect", getShowInSelect());
        return mapValue;
    }


}
