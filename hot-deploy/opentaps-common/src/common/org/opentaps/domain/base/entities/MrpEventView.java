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
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Auto generated base entity MrpEventView.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectMrpEventViews", query="SELECT PR.BILL_OF_MATERIAL_LEVEL AS \"billOfMaterialLevel\",MEV.MRP_ID AS \"mrpId\",MEV.PRODUCT_ID AS \"productId\",MEV.EVENT_DATE AS \"eventDate\",MEV.MRP_EVENT_TYPE_ID AS \"mrpEventTypeId\",MEV.FACILITY_ID AS \"facilityId\",MEV.QUANTITY AS \"quantity\",MEV.EVENT_NAME AS \"eventName\",MEV.IS_LATE AS \"isLate\" FROM MRP_EVENT MEV INNER JOIN PRODUCT PR ON MEV.PRODUCT_ID = PR.PRODUCT_ID", resultSetMapping="MrpEventViewMapping")
@SqlResultSetMapping(name="MrpEventViewMapping", entities={
@EntityResult(entityClass=MrpEventView.class, fields = {
@FieldResult(name="billOfMaterialLevel", column="billOfMaterialLevel")
,@FieldResult(name="mrpId", column="mrpId")
,@FieldResult(name="productId", column="productId")
,@FieldResult(name="eventDate", column="eventDate")
,@FieldResult(name="mrpEventTypeId", column="mrpEventTypeId")
,@FieldResult(name="facilityId", column="facilityId")
,@FieldResult(name="quantity", column="quantity")
,@FieldResult(name="eventName", column="eventName")
,@FieldResult(name="isLate", column="isLate")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class MrpEventView extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("billOfMaterialLevel", "PR.BILL_OF_MATERIAL_LEVEL");
        fields.put("mrpId", "MEV.MRP_ID");
        fields.put("productId", "MEV.PRODUCT_ID");
        fields.put("eventDate", "MEV.EVENT_DATE");
        fields.put("mrpEventTypeId", "MEV.MRP_EVENT_TYPE_ID");
        fields.put("facilityId", "MEV.FACILITY_ID");
        fields.put("quantity", "MEV.QUANTITY");
        fields.put("eventName", "MEV.EVENT_NAME");
        fields.put("isLate", "MEV.IS_LATE");
fieldMapColumns.put("MrpEventView", fields);
}
  public static enum Fields implements EntityFieldInterface<MrpEventView> {
    billOfMaterialLevel("billOfMaterialLevel"),
    mrpId("mrpId"),
    productId("productId"),
    eventDate("eventDate"),
    mrpEventTypeId("mrpEventTypeId"),
    facilityId("facilityId"),
    quantity("quantity"),
    eventName("eventName"),
    isLate("isLate");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

    
   private Long billOfMaterialLevel;
    @Id
   private String mrpId;
    
   private String productId;
    
   private Timestamp eventDate;
    
   private String mrpEventTypeId;
    
   private String facilityId;
    
   private BigDecimal quantity;
    
   private String eventName;
    
   private String isLate;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PRODUCT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Product product = null;

  /**
   * Default constructor.
   */
  public MrpEventView() {
      super();
      this.baseEntityName = "MrpEventView";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("mrpId");this.primaryKeyNames.add("productId");this.primaryKeyNames.add("eventDate");this.primaryKeyNames.add("mrpEventTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("billOfMaterialLevel");this.allFieldsNames.add("mrpId");this.allFieldsNames.add("productId");this.allFieldsNames.add("eventDate");this.allFieldsNames.add("mrpEventTypeId");this.allFieldsNames.add("facilityId");this.allFieldsNames.add("quantity");this.allFieldsNames.add("eventName");this.allFieldsNames.add("isLate");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public MrpEventView(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param billOfMaterialLevel the billOfMaterialLevel to set
     */
    public void setBillOfMaterialLevel(Long billOfMaterialLevel) {
        this.billOfMaterialLevel = billOfMaterialLevel;
    }
    /**
     * Auto generated value setter.
     * @param mrpId the mrpId to set
     */
    public void setMrpId(String mrpId) {
        this.mrpId = mrpId;
    }
    /**
     * Auto generated value setter.
     * @param productId the productId to set
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }
    /**
     * Auto generated value setter.
     * @param eventDate the eventDate to set
     */
    public void setEventDate(Timestamp eventDate) {
        this.eventDate = eventDate;
    }
    /**
     * Auto generated value setter.
     * @param mrpEventTypeId the mrpEventTypeId to set
     */
    public void setMrpEventTypeId(String mrpEventTypeId) {
        this.mrpEventTypeId = mrpEventTypeId;
    }
    /**
     * Auto generated value setter.
     * @param facilityId the facilityId to set
     */
    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }
    /**
     * Auto generated value setter.
     * @param quantity the quantity to set
     */
    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }
    /**
     * Auto generated value setter.
     * @param eventName the eventName to set
     */
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
    /**
     * Auto generated value setter.
     * @param isLate the isLate to set
     */
    public void setIsLate(String isLate) {
        this.isLate = isLate;
    }

    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getBillOfMaterialLevel() {
        return this.billOfMaterialLevel;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getMrpId() {
        return this.mrpId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductId() {
        return this.productId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getEventDate() {
        return this.eventDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getMrpEventTypeId() {
        return this.mrpEventTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getFacilityId() {
        return this.facilityId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getQuantity() {
        return this.quantity;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getEventName() {
        return this.eventName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getIsLate() {
        return this.isLate;
    }

    /**
     * Auto generated method that gets the related <code>Product</code> by the relation named <code>Product</code>.
     * @return the <code>Product</code>
     * @throws RepositoryException if an error occurs
     */
    public Product getProduct() throws RepositoryException {
        if (this.product == null) {
            this.product = getRelatedOne(Product.class, "Product");
        }
        return this.product;
    }

    /**
     * Auto generated value setter.
     * @param product the product to set
    */
    public void setProduct(Product product) {
        this.product = product;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setBillOfMaterialLevel((Long) mapValue.get("billOfMaterialLevel"));
        setMrpId((String) mapValue.get("mrpId"));
        setProductId((String) mapValue.get("productId"));
        setEventDate((Timestamp) mapValue.get("eventDate"));
        setMrpEventTypeId((String) mapValue.get("mrpEventTypeId"));
        setFacilityId((String) mapValue.get("facilityId"));
        setQuantity(convertToBigDecimal(mapValue.get("quantity")));
        setEventName((String) mapValue.get("eventName"));
        setIsLate((String) mapValue.get("isLate"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("billOfMaterialLevel", getBillOfMaterialLevel());
        mapValue.put("mrpId", getMrpId());
        mapValue.put("productId", getProductId());
        mapValue.put("eventDate", getEventDate());
        mapValue.put("mrpEventTypeId", getMrpEventTypeId());
        mapValue.put("facilityId", getFacilityId());
        mapValue.put("quantity", getQuantity());
        mapValue.put("eventName", getEventName());
        mapValue.put("isLate", getIsLate());
        return mapValue;
    }


}
