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

/**
 * Auto generated base entity ProductStoreShipmentMethView.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectProductStoreShipmentMethViews", query="SELECT PSSM.PRODUCT_STORE_SHIP_METH_ID AS \"productStoreShipMethId\",PSSM.PRODUCT_STORE_ID AS \"productStoreId\",PSSM.SHIPMENT_METHOD_TYPE_ID AS \"shipmentMethodTypeId\",PSSM.PARTY_ID AS \"partyId\",PSSM.ROLE_TYPE_ID AS \"roleTypeId\",PSSM.COMPANY_PARTY_ID AS \"companyPartyId\",PSSM.MIN_SIZE AS \"minSize\",PSSM.MAX_SIZE AS \"maxSize\",PSSM.MIN_TOTAL AS \"minTotal\",PSSM.MAX_TOTAL AS \"maxTotal\",PSSM.MIN_WEIGHT AS \"minWeight\",PSSM.MAX_WEIGHT AS \"maxWeight\",PSSM.ALLOW_USPS_ADDR AS \"allowUspsAddr\",PSSM.REQUIRE_USPS_ADDR AS \"requireUspsAddr\",PSSM.ALLOW_COMPANY_ADDR AS \"allowCompanyAddr\",PSSM.REQUIRE_COMPANY_ADDR AS \"requireCompanyAddr\",PSSM.INCLUDE_NO_CHARGE_ITEMS AS \"includeNoChargeItems\",PSSM.INCLUDE_GEO_ID AS \"includeGeoId\",PSSM.EXCLUDE_GEO_ID AS \"excludeGeoId\",PSSM.INCLUDE_FEATURE_GROUP AS \"includeFeatureGroup\",PSSM.EXCLUDE_FEATURE_GROUP AS \"excludeFeatureGroup\",PSSM.SEQUENCE_NUMBER AS \"sequenceNumber\",SM.DESCRIPTION AS \"description\" FROM PRODUCT_STORE_SHIPMENT_METH PSSM INNER JOIN SHIPMENT_METHOD_TYPE SM ON PSSM.SHIPMENT_METHOD_TYPE_ID = SM.SHIPMENT_METHOD_TYPE_ID", resultSetMapping="ProductStoreShipmentMethViewMapping")
@SqlResultSetMapping(name="ProductStoreShipmentMethViewMapping", entities={
@EntityResult(entityClass=ProductStoreShipmentMethView.class, fields = {
@FieldResult(name="productStoreShipMethId", column="productStoreShipMethId")
,@FieldResult(name="productStoreId", column="productStoreId")
,@FieldResult(name="shipmentMethodTypeId", column="shipmentMethodTypeId")
,@FieldResult(name="partyId", column="partyId")
,@FieldResult(name="roleTypeId", column="roleTypeId")
,@FieldResult(name="companyPartyId", column="companyPartyId")
,@FieldResult(name="minSize", column="minSize")
,@FieldResult(name="maxSize", column="maxSize")
,@FieldResult(name="minTotal", column="minTotal")
,@FieldResult(name="maxTotal", column="maxTotal")
,@FieldResult(name="minWeight", column="minWeight")
,@FieldResult(name="maxWeight", column="maxWeight")
,@FieldResult(name="allowUspsAddr", column="allowUspsAddr")
,@FieldResult(name="requireUspsAddr", column="requireUspsAddr")
,@FieldResult(name="allowCompanyAddr", column="allowCompanyAddr")
,@FieldResult(name="requireCompanyAddr", column="requireCompanyAddr")
,@FieldResult(name="includeNoChargeItems", column="includeNoChargeItems")
,@FieldResult(name="includeGeoId", column="includeGeoId")
,@FieldResult(name="excludeGeoId", column="excludeGeoId")
,@FieldResult(name="includeFeatureGroup", column="includeFeatureGroup")
,@FieldResult(name="excludeFeatureGroup", column="excludeFeatureGroup")
,@FieldResult(name="sequenceNumber", column="sequenceNumber")
,@FieldResult(name="description", column="description")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class ProductStoreShipmentMethView extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("productStoreShipMethId", "PSSM.PRODUCT_STORE_SHIP_METH_ID");
        fields.put("productStoreId", "PSSM.PRODUCT_STORE_ID");
        fields.put("shipmentMethodTypeId", "PSSM.SHIPMENT_METHOD_TYPE_ID");
        fields.put("partyId", "PSSM.PARTY_ID");
        fields.put("roleTypeId", "PSSM.ROLE_TYPE_ID");
        fields.put("companyPartyId", "PSSM.COMPANY_PARTY_ID");
        fields.put("minSize", "PSSM.MIN_SIZE");
        fields.put("maxSize", "PSSM.MAX_SIZE");
        fields.put("minTotal", "PSSM.MIN_TOTAL");
        fields.put("maxTotal", "PSSM.MAX_TOTAL");
        fields.put("minWeight", "PSSM.MIN_WEIGHT");
        fields.put("maxWeight", "PSSM.MAX_WEIGHT");
        fields.put("allowUspsAddr", "PSSM.ALLOW_USPS_ADDR");
        fields.put("requireUspsAddr", "PSSM.REQUIRE_USPS_ADDR");
        fields.put("allowCompanyAddr", "PSSM.ALLOW_COMPANY_ADDR");
        fields.put("requireCompanyAddr", "PSSM.REQUIRE_COMPANY_ADDR");
        fields.put("includeNoChargeItems", "PSSM.INCLUDE_NO_CHARGE_ITEMS");
        fields.put("includeGeoId", "PSSM.INCLUDE_GEO_ID");
        fields.put("excludeGeoId", "PSSM.EXCLUDE_GEO_ID");
        fields.put("includeFeatureGroup", "PSSM.INCLUDE_FEATURE_GROUP");
        fields.put("excludeFeatureGroup", "PSSM.EXCLUDE_FEATURE_GROUP");
        fields.put("sequenceNumber", "PSSM.SEQUENCE_NUMBER");
        fields.put("description", "SM.DESCRIPTION");
fieldMapColumns.put("ProductStoreShipmentMethView", fields);
}
  public static enum Fields implements EntityFieldInterface<ProductStoreShipmentMethView> {
    productStoreShipMethId("productStoreShipMethId"),
    productStoreId("productStoreId"),
    shipmentMethodTypeId("shipmentMethodTypeId"),
    partyId("partyId"),
    roleTypeId("roleTypeId"),
    companyPartyId("companyPartyId"),
    minSize("minSize"),
    maxSize("maxSize"),
    minTotal("minTotal"),
    maxTotal("maxTotal"),
    minWeight("minWeight"),
    maxWeight("maxWeight"),
    allowUspsAddr("allowUspsAddr"),
    requireUspsAddr("requireUspsAddr"),
    allowCompanyAddr("allowCompanyAddr"),
    requireCompanyAddr("requireCompanyAddr"),
    includeNoChargeItems("includeNoChargeItems"),
    includeGeoId("includeGeoId"),
    excludeGeoId("excludeGeoId"),
    includeFeatureGroup("includeFeatureGroup"),
    excludeFeatureGroup("excludeFeatureGroup"),
    sequenceNumber("sequenceNumber"),
    description("description");
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
   private String productStoreShipMethId;
    
   private String productStoreId;
    
   private String shipmentMethodTypeId;
    
   private String partyId;
    
   private String roleTypeId;
    
   private String companyPartyId;
    
   private BigDecimal minSize;
    
   private BigDecimal maxSize;
    
   private BigDecimal minTotal;
    
   private BigDecimal maxTotal;
    
   private BigDecimal minWeight;
    
   private BigDecimal maxWeight;
    
   private String allowUspsAddr;
    
   private String requireUspsAddr;
    
   private String allowCompanyAddr;
    
   private String requireCompanyAddr;
    
   private String includeNoChargeItems;
    
   private String includeGeoId;
    
   private String excludeGeoId;
    
   private String includeFeatureGroup;
    
   private String excludeFeatureGroup;
    
   private Long sequenceNumber;
    
   private String description;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="COMPANY_PARTY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Party party = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="INCLUDE_GEO_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Geo includeGeo = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="EXCLUDE_GEO_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Geo excludeGeo = null;
   private transient PartyGroup partyGroup = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="SHIPMENT_METHOD_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ShipmentMethodType shipmentMethodType = null;

  /**
   * Default constructor.
   */
  public ProductStoreShipmentMethView() {
      super();
      this.baseEntityName = "ProductStoreShipmentMethView";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("productStoreShipMethId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("productStoreShipMethId");this.allFieldsNames.add("productStoreId");this.allFieldsNames.add("shipmentMethodTypeId");this.allFieldsNames.add("partyId");this.allFieldsNames.add("roleTypeId");this.allFieldsNames.add("companyPartyId");this.allFieldsNames.add("minSize");this.allFieldsNames.add("maxSize");this.allFieldsNames.add("minTotal");this.allFieldsNames.add("maxTotal");this.allFieldsNames.add("minWeight");this.allFieldsNames.add("maxWeight");this.allFieldsNames.add("allowUspsAddr");this.allFieldsNames.add("requireUspsAddr");this.allFieldsNames.add("allowCompanyAddr");this.allFieldsNames.add("requireCompanyAddr");this.allFieldsNames.add("includeNoChargeItems");this.allFieldsNames.add("includeGeoId");this.allFieldsNames.add("excludeGeoId");this.allFieldsNames.add("includeFeatureGroup");this.allFieldsNames.add("excludeFeatureGroup");this.allFieldsNames.add("sequenceNumber");this.allFieldsNames.add("description");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ProductStoreShipmentMethView(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param productStoreShipMethId the productStoreShipMethId to set
     */
    public void setProductStoreShipMethId(String productStoreShipMethId) {
        this.productStoreShipMethId = productStoreShipMethId;
    }
    /**
     * Auto generated value setter.
     * @param productStoreId the productStoreId to set
     */
    public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
    }
    /**
     * Auto generated value setter.
     * @param shipmentMethodTypeId the shipmentMethodTypeId to set
     */
    public void setShipmentMethodTypeId(String shipmentMethodTypeId) {
        this.shipmentMethodTypeId = shipmentMethodTypeId;
    }
    /**
     * Auto generated value setter.
     * @param partyId the partyId to set
     */
    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
    /**
     * Auto generated value setter.
     * @param roleTypeId the roleTypeId to set
     */
    public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
    }
    /**
     * Auto generated value setter.
     * @param companyPartyId the companyPartyId to set
     */
    public void setCompanyPartyId(String companyPartyId) {
        this.companyPartyId = companyPartyId;
    }
    /**
     * Auto generated value setter.
     * @param minSize the minSize to set
     */
    public void setMinSize(BigDecimal minSize) {
        this.minSize = minSize;
    }
    /**
     * Auto generated value setter.
     * @param maxSize the maxSize to set
     */
    public void setMaxSize(BigDecimal maxSize) {
        this.maxSize = maxSize;
    }
    /**
     * Auto generated value setter.
     * @param minTotal the minTotal to set
     */
    public void setMinTotal(BigDecimal minTotal) {
        this.minTotal = minTotal;
    }
    /**
     * Auto generated value setter.
     * @param maxTotal the maxTotal to set
     */
    public void setMaxTotal(BigDecimal maxTotal) {
        this.maxTotal = maxTotal;
    }
    /**
     * Auto generated value setter.
     * @param minWeight the minWeight to set
     */
    public void setMinWeight(BigDecimal minWeight) {
        this.minWeight = minWeight;
    }
    /**
     * Auto generated value setter.
     * @param maxWeight the maxWeight to set
     */
    public void setMaxWeight(BigDecimal maxWeight) {
        this.maxWeight = maxWeight;
    }
    /**
     * Auto generated value setter.
     * @param allowUspsAddr the allowUspsAddr to set
     */
    public void setAllowUspsAddr(String allowUspsAddr) {
        this.allowUspsAddr = allowUspsAddr;
    }
    /**
     * Auto generated value setter.
     * @param requireUspsAddr the requireUspsAddr to set
     */
    public void setRequireUspsAddr(String requireUspsAddr) {
        this.requireUspsAddr = requireUspsAddr;
    }
    /**
     * Auto generated value setter.
     * @param allowCompanyAddr the allowCompanyAddr to set
     */
    public void setAllowCompanyAddr(String allowCompanyAddr) {
        this.allowCompanyAddr = allowCompanyAddr;
    }
    /**
     * Auto generated value setter.
     * @param requireCompanyAddr the requireCompanyAddr to set
     */
    public void setRequireCompanyAddr(String requireCompanyAddr) {
        this.requireCompanyAddr = requireCompanyAddr;
    }
    /**
     * Auto generated value setter.
     * @param includeNoChargeItems the includeNoChargeItems to set
     */
    public void setIncludeNoChargeItems(String includeNoChargeItems) {
        this.includeNoChargeItems = includeNoChargeItems;
    }
    /**
     * Auto generated value setter.
     * @param includeGeoId the includeGeoId to set
     */
    public void setIncludeGeoId(String includeGeoId) {
        this.includeGeoId = includeGeoId;
    }
    /**
     * Auto generated value setter.
     * @param excludeGeoId the excludeGeoId to set
     */
    public void setExcludeGeoId(String excludeGeoId) {
        this.excludeGeoId = excludeGeoId;
    }
    /**
     * Auto generated value setter.
     * @param includeFeatureGroup the includeFeatureGroup to set
     */
    public void setIncludeFeatureGroup(String includeFeatureGroup) {
        this.includeFeatureGroup = includeFeatureGroup;
    }
    /**
     * Auto generated value setter.
     * @param excludeFeatureGroup the excludeFeatureGroup to set
     */
    public void setExcludeFeatureGroup(String excludeFeatureGroup) {
        this.excludeFeatureGroup = excludeFeatureGroup;
    }
    /**
     * Auto generated value setter.
     * @param sequenceNumber the sequenceNumber to set
     */
    public void setSequenceNumber(Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }
    /**
     * Auto generated value setter.
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductStoreShipMethId() {
        return this.productStoreShipMethId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductStoreId() {
        return this.productStoreId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getShipmentMethodTypeId() {
        return this.shipmentMethodTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPartyId() {
        return this.partyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRoleTypeId() {
        return this.roleTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCompanyPartyId() {
        return this.companyPartyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getMinSize() {
        return this.minSize;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getMaxSize() {
        return this.maxSize;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getMinTotal() {
        return this.minTotal;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getMaxTotal() {
        return this.maxTotal;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getMinWeight() {
        return this.minWeight;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getMaxWeight() {
        return this.maxWeight;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAllowUspsAddr() {
        return this.allowUspsAddr;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRequireUspsAddr() {
        return this.requireUspsAddr;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAllowCompanyAddr() {
        return this.allowCompanyAddr;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRequireCompanyAddr() {
        return this.requireCompanyAddr;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getIncludeNoChargeItems() {
        return this.includeNoChargeItems;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getIncludeGeoId() {
        return this.includeGeoId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getExcludeGeoId() {
        return this.excludeGeoId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getIncludeFeatureGroup() {
        return this.includeFeatureGroup;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getExcludeFeatureGroup() {
        return this.excludeFeatureGroup;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getSequenceNumber() {
        return this.sequenceNumber;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Auto generated method that gets the related <code>Party</code> by the relation named <code>Party</code>.
     * @return the <code>Party</code>
     * @throws RepositoryException if an error occurs
     */
    public Party getParty() throws RepositoryException {
        if (this.party == null) {
            this.party = getRelatedOne(Party.class, "Party");
        }
        return this.party;
    }
    /**
     * Auto generated method that gets the related <code>Geo</code> by the relation named <code>IncludeGeo</code>.
     * @return the <code>Geo</code>
     * @throws RepositoryException if an error occurs
     */
    public Geo getIncludeGeo() throws RepositoryException {
        if (this.includeGeo == null) {
            this.includeGeo = getRelatedOne(Geo.class, "IncludeGeo");
        }
        return this.includeGeo;
    }
    /**
     * Auto generated method that gets the related <code>Geo</code> by the relation named <code>ExcludeGeo</code>.
     * @return the <code>Geo</code>
     * @throws RepositoryException if an error occurs
     */
    public Geo getExcludeGeo() throws RepositoryException {
        if (this.excludeGeo == null) {
            this.excludeGeo = getRelatedOne(Geo.class, "ExcludeGeo");
        }
        return this.excludeGeo;
    }
    /**
     * Auto generated method that gets the related <code>PartyGroup</code> by the relation named <code>PartyGroup</code>.
     * @return the <code>PartyGroup</code>
     * @throws RepositoryException if an error occurs
     */
    public PartyGroup getPartyGroup() throws RepositoryException {
        if (this.partyGroup == null) {
            this.partyGroup = getRelatedOne(PartyGroup.class, "PartyGroup");
        }
        return this.partyGroup;
    }
    /**
     * Auto generated method that gets the related <code>ShipmentMethodType</code> by the relation named <code>ShipmentMethodType</code>.
     * @return the <code>ShipmentMethodType</code>
     * @throws RepositoryException if an error occurs
     */
    public ShipmentMethodType getShipmentMethodType() throws RepositoryException {
        if (this.shipmentMethodType == null) {
            this.shipmentMethodType = getRelatedOne(ShipmentMethodType.class, "ShipmentMethodType");
        }
        return this.shipmentMethodType;
    }

    /**
     * Auto generated value setter.
     * @param party the party to set
    */
    public void setParty(Party party) {
        this.party = party;
    }
    /**
     * Auto generated value setter.
     * @param includeGeo the includeGeo to set
    */
    public void setIncludeGeo(Geo includeGeo) {
        this.includeGeo = includeGeo;
    }
    /**
     * Auto generated value setter.
     * @param excludeGeo the excludeGeo to set
    */
    public void setExcludeGeo(Geo excludeGeo) {
        this.excludeGeo = excludeGeo;
    }
    /**
     * Auto generated value setter.
     * @param partyGroup the partyGroup to set
    */
    public void setPartyGroup(PartyGroup partyGroup) {
        this.partyGroup = partyGroup;
    }
    /**
     * Auto generated value setter.
     * @param shipmentMethodType the shipmentMethodType to set
    */
    public void setShipmentMethodType(ShipmentMethodType shipmentMethodType) {
        this.shipmentMethodType = shipmentMethodType;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setProductStoreShipMethId((String) mapValue.get("productStoreShipMethId"));
        setProductStoreId((String) mapValue.get("productStoreId"));
        setShipmentMethodTypeId((String) mapValue.get("shipmentMethodTypeId"));
        setPartyId((String) mapValue.get("partyId"));
        setRoleTypeId((String) mapValue.get("roleTypeId"));
        setCompanyPartyId((String) mapValue.get("companyPartyId"));
        setMinSize(convertToBigDecimal(mapValue.get("minSize")));
        setMaxSize(convertToBigDecimal(mapValue.get("maxSize")));
        setMinTotal(convertToBigDecimal(mapValue.get("minTotal")));
        setMaxTotal(convertToBigDecimal(mapValue.get("maxTotal")));
        setMinWeight(convertToBigDecimal(mapValue.get("minWeight")));
        setMaxWeight(convertToBigDecimal(mapValue.get("maxWeight")));
        setAllowUspsAddr((String) mapValue.get("allowUspsAddr"));
        setRequireUspsAddr((String) mapValue.get("requireUspsAddr"));
        setAllowCompanyAddr((String) mapValue.get("allowCompanyAddr"));
        setRequireCompanyAddr((String) mapValue.get("requireCompanyAddr"));
        setIncludeNoChargeItems((String) mapValue.get("includeNoChargeItems"));
        setIncludeGeoId((String) mapValue.get("includeGeoId"));
        setExcludeGeoId((String) mapValue.get("excludeGeoId"));
        setIncludeFeatureGroup((String) mapValue.get("includeFeatureGroup"));
        setExcludeFeatureGroup((String) mapValue.get("excludeFeatureGroup"));
        setSequenceNumber((Long) mapValue.get("sequenceNumber"));
        setDescription((String) mapValue.get("description"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("productStoreShipMethId", getProductStoreShipMethId());
        mapValue.put("productStoreId", getProductStoreId());
        mapValue.put("shipmentMethodTypeId", getShipmentMethodTypeId());
        mapValue.put("partyId", getPartyId());
        mapValue.put("roleTypeId", getRoleTypeId());
        mapValue.put("companyPartyId", getCompanyPartyId());
        mapValue.put("minSize", getMinSize());
        mapValue.put("maxSize", getMaxSize());
        mapValue.put("minTotal", getMinTotal());
        mapValue.put("maxTotal", getMaxTotal());
        mapValue.put("minWeight", getMinWeight());
        mapValue.put("maxWeight", getMaxWeight());
        mapValue.put("allowUspsAddr", getAllowUspsAddr());
        mapValue.put("requireUspsAddr", getRequireUspsAddr());
        mapValue.put("allowCompanyAddr", getAllowCompanyAddr());
        mapValue.put("requireCompanyAddr", getRequireCompanyAddr());
        mapValue.put("includeNoChargeItems", getIncludeNoChargeItems());
        mapValue.put("includeGeoId", getIncludeGeoId());
        mapValue.put("excludeGeoId", getExcludeGeoId());
        mapValue.put("includeFeatureGroup", getIncludeFeatureGroup());
        mapValue.put("excludeFeatureGroup", getExcludeFeatureGroup());
        mapValue.put("sequenceNumber", getSequenceNumber());
        mapValue.put("description", getDescription());
        return mapValue;
    }


}
