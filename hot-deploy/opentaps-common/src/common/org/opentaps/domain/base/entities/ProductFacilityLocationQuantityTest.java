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
import java.math.BigDecimal;

/**
 * Auto generated base entity ProductFacilityLocationQuantityTest.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectProductFacilityLocationQuantityTests", query="SELECT PFL.PRODUCT_ID AS \"productId\",PFL.FACILITY_ID AS \"facilityId\",PFL.LOCATION_SEQ_ID AS \"locationSeqId\",PFL.MINIMUM_STOCK AS \"minimumStock\",PFL.MOVE_QUANTITY AS \"moveQuantity\",FL.LOCATION_TYPE_ENUM_ID AS \"locationTypeEnumId\",II.AVAILABLE_TO_PROMISE_TOTAL AS \"availableToPromiseTotal\",II.QUANTITY_ON_HAND_TOTAL AS \"quantityOnHandTotal\" FROM PRODUCT_FACILITY_LOCATION PFL INNER JOIN FACILITY_LOCATION FL ON PFL.FACILITY_ID = FL.FACILITY_ID AND PFL.LOCATION_SEQ_ID = FL.LOCATION_SEQ_ID INNER JOIN INVENTORY_ITEM II ON PFL.PRODUCT_ID = II.PRODUCT_ID AND PFL.FACILITY_ID = II.FACILITY_ID AND PFL.LOCATION_SEQ_ID = II.LOCATION_SEQ_ID", resultSetMapping="ProductFacilityLocationQuantityTestMapping")
@SqlResultSetMapping(name="ProductFacilityLocationQuantityTestMapping", entities={
@EntityResult(entityClass=ProductFacilityLocationQuantityTest.class, fields = {
@FieldResult(name="productId", column="productId")
,@FieldResult(name="facilityId", column="facilityId")
,@FieldResult(name="locationSeqId", column="locationSeqId")
,@FieldResult(name="minimumStock", column="minimumStock")
,@FieldResult(name="moveQuantity", column="moveQuantity")
,@FieldResult(name="locationTypeEnumId", column="locationTypeEnumId")
,@FieldResult(name="availableToPromiseTotal", column="availableToPromiseTotal")
,@FieldResult(name="quantityOnHandTotal", column="quantityOnHandTotal")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class ProductFacilityLocationQuantityTest extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("productId", "PFL.PRODUCT_ID");
        fields.put("facilityId", "PFL.FACILITY_ID");
        fields.put("locationSeqId", "PFL.LOCATION_SEQ_ID");
        fields.put("minimumStock", "PFL.MINIMUM_STOCK");
        fields.put("moveQuantity", "PFL.MOVE_QUANTITY");
        fields.put("locationTypeEnumId", "FL.LOCATION_TYPE_ENUM_ID");
        fields.put("availableToPromiseTotal", "II.AVAILABLE_TO_PROMISE_TOTAL");
        fields.put("quantityOnHandTotal", "II.QUANTITY_ON_HAND_TOTAL");
fieldMapColumns.put("ProductFacilityLocationQuantityTest", fields);
}
  public static enum Fields implements EntityFieldInterface<ProductFacilityLocationQuantityTest> {
    productId("productId"),
    facilityId("facilityId"),
    locationSeqId("locationSeqId"),
    minimumStock("minimumStock"),
    moveQuantity("moveQuantity"),
    locationTypeEnumId("locationTypeEnumId"),
    availableToPromiseTotal("availableToPromiseTotal"),
    quantityOnHandTotal("quantityOnHandTotal");
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
   private String productId;
    
   private String facilityId;
    
   private String locationSeqId;
    
   private BigDecimal minimumStock;
    
   private BigDecimal moveQuantity;
    
   private String locationTypeEnumId;
    
   private BigDecimal availableToPromiseTotal;
    
   private BigDecimal quantityOnHandTotal;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PRODUCT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Product product = null;
   private transient FacilityLocation facilityLocation = null;
   private transient ProductFacilityLocation productFacilityLocation = null;

  /**
   * Default constructor.
   */
  public ProductFacilityLocationQuantityTest() {
      super();
      this.baseEntityName = "ProductFacilityLocationQuantityTest";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("productId");this.primaryKeyNames.add("facilityId");this.primaryKeyNames.add("locationSeqId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("productId");this.allFieldsNames.add("facilityId");this.allFieldsNames.add("locationSeqId");this.allFieldsNames.add("minimumStock");this.allFieldsNames.add("moveQuantity");this.allFieldsNames.add("locationTypeEnumId");this.allFieldsNames.add("availableToPromiseTotal");this.allFieldsNames.add("quantityOnHandTotal");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ProductFacilityLocationQuantityTest(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param productId the productId to set
     */
    public void setProductId(String productId) {
        this.productId = productId;
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
     * @param locationSeqId the locationSeqId to set
     */
    public void setLocationSeqId(String locationSeqId) {
        this.locationSeqId = locationSeqId;
    }
    /**
     * Auto generated value setter.
     * @param minimumStock the minimumStock to set
     */
    public void setMinimumStock(BigDecimal minimumStock) {
        this.minimumStock = minimumStock;
    }
    /**
     * Auto generated value setter.
     * @param moveQuantity the moveQuantity to set
     */
    public void setMoveQuantity(BigDecimal moveQuantity) {
        this.moveQuantity = moveQuantity;
    }
    /**
     * Auto generated value setter.
     * @param locationTypeEnumId the locationTypeEnumId to set
     */
    public void setLocationTypeEnumId(String locationTypeEnumId) {
        this.locationTypeEnumId = locationTypeEnumId;
    }
    /**
     * Auto generated value setter.
     * @param availableToPromiseTotal the availableToPromiseTotal to set
     */
    public void setAvailableToPromiseTotal(BigDecimal availableToPromiseTotal) {
        this.availableToPromiseTotal = availableToPromiseTotal;
    }
    /**
     * Auto generated value setter.
     * @param quantityOnHandTotal the quantityOnHandTotal to set
     */
    public void setQuantityOnHandTotal(BigDecimal quantityOnHandTotal) {
        this.quantityOnHandTotal = quantityOnHandTotal;
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
     * @return <code>String</code>
     */
    public String getFacilityId() {
        return this.facilityId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getLocationSeqId() {
        return this.locationSeqId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getMinimumStock() {
        return this.minimumStock;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getMoveQuantity() {
        return this.moveQuantity;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getLocationTypeEnumId() {
        return this.locationTypeEnumId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getAvailableToPromiseTotal() {
        return this.availableToPromiseTotal;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getQuantityOnHandTotal() {
        return this.quantityOnHandTotal;
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
     * Auto generated method that gets the related <code>FacilityLocation</code> by the relation named <code>FacilityLocation</code>.
     * @return the <code>FacilityLocation</code>
     * @throws RepositoryException if an error occurs
     */
    public FacilityLocation getFacilityLocation() throws RepositoryException {
        if (this.facilityLocation == null) {
            this.facilityLocation = getRelatedOne(FacilityLocation.class, "FacilityLocation");
        }
        return this.facilityLocation;
    }
    /**
     * Auto generated method that gets the related <code>ProductFacilityLocation</code> by the relation named <code>ProductFacilityLocation</code>.
     * @return the <code>ProductFacilityLocation</code>
     * @throws RepositoryException if an error occurs
     */
    public ProductFacilityLocation getProductFacilityLocation() throws RepositoryException {
        if (this.productFacilityLocation == null) {
            this.productFacilityLocation = getRelatedOne(ProductFacilityLocation.class, "ProductFacilityLocation");
        }
        return this.productFacilityLocation;
    }

    /**
     * Auto generated value setter.
     * @param product the product to set
    */
    public void setProduct(Product product) {
        this.product = product;
    }
    /**
     * Auto generated value setter.
     * @param facilityLocation the facilityLocation to set
    */
    public void setFacilityLocation(FacilityLocation facilityLocation) {
        this.facilityLocation = facilityLocation;
    }
    /**
     * Auto generated value setter.
     * @param productFacilityLocation the productFacilityLocation to set
    */
    public void setProductFacilityLocation(ProductFacilityLocation productFacilityLocation) {
        this.productFacilityLocation = productFacilityLocation;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setProductId((String) mapValue.get("productId"));
        setFacilityId((String) mapValue.get("facilityId"));
        setLocationSeqId((String) mapValue.get("locationSeqId"));
        setMinimumStock(convertToBigDecimal(mapValue.get("minimumStock")));
        setMoveQuantity(convertToBigDecimal(mapValue.get("moveQuantity")));
        setLocationTypeEnumId((String) mapValue.get("locationTypeEnumId"));
        setAvailableToPromiseTotal(convertToBigDecimal(mapValue.get("availableToPromiseTotal")));
        setQuantityOnHandTotal(convertToBigDecimal(mapValue.get("quantityOnHandTotal")));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("productId", getProductId());
        mapValue.put("facilityId", getFacilityId());
        mapValue.put("locationSeqId", getLocationSeqId());
        mapValue.put("minimumStock", getMinimumStock());
        mapValue.put("moveQuantity", getMoveQuantity());
        mapValue.put("locationTypeEnumId", getLocationTypeEnumId());
        mapValue.put("availableToPromiseTotal", getAvailableToPromiseTotal());
        mapValue.put("quantityOnHandTotal", getQuantityOnHandTotal());
        return mapValue;
    }


}
