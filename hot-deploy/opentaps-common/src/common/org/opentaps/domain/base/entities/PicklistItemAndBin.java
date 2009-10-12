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
 * Auto generated base entity PicklistItemAndBin.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectPicklistItemAndBins", query="SELECT PB.PICKLIST_BIN_ID AS \"picklistBinId\",PB.PICKLIST_ID AS \"picklistId\",PB.BIN_LOCATION_NUMBER AS \"binLocationNumber\",PB.PRIMARY_ORDER_ID AS \"primaryOrderId\",PB.PRIMARY_SHIP_GROUP_SEQ_ID AS \"primaryShipGroupSeqId\",PI.ORDER_ID AS \"orderId\",PI.ORDER_ITEM_SEQ_ID AS \"orderItemSeqId\",PI.SHIP_GROUP_SEQ_ID AS \"shipGroupSeqId\",PI.INVENTORY_ITEM_ID AS \"inventoryItemId\",PI.ITEM_STATUS_ID AS \"itemStatusId\",PI.QUANTITY AS \"quantity\" FROM PICKLIST_BIN PB INNER JOIN PICKLIST_ITEM PI ON PB.PICKLIST_BIN_ID = PI.PICKLIST_BIN_ID", resultSetMapping="PicklistItemAndBinMapping")
@SqlResultSetMapping(name="PicklistItemAndBinMapping", entities={
@EntityResult(entityClass=PicklistItemAndBin.class, fields = {
@FieldResult(name="picklistBinId", column="picklistBinId")
,@FieldResult(name="picklistId", column="picklistId")
,@FieldResult(name="binLocationNumber", column="binLocationNumber")
,@FieldResult(name="primaryOrderId", column="primaryOrderId")
,@FieldResult(name="primaryShipGroupSeqId", column="primaryShipGroupSeqId")
,@FieldResult(name="orderId", column="orderId")
,@FieldResult(name="orderItemSeqId", column="orderItemSeqId")
,@FieldResult(name="shipGroupSeqId", column="shipGroupSeqId")
,@FieldResult(name="inventoryItemId", column="inventoryItemId")
,@FieldResult(name="itemStatusId", column="itemStatusId")
,@FieldResult(name="quantity", column="quantity")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class PicklistItemAndBin extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("picklistBinId", "PB.PICKLIST_BIN_ID");
        fields.put("picklistId", "PB.PICKLIST_ID");
        fields.put("binLocationNumber", "PB.BIN_LOCATION_NUMBER");
        fields.put("primaryOrderId", "PB.PRIMARY_ORDER_ID");
        fields.put("primaryShipGroupSeqId", "PB.PRIMARY_SHIP_GROUP_SEQ_ID");
        fields.put("orderId", "PI.ORDER_ID");
        fields.put("orderItemSeqId", "PI.ORDER_ITEM_SEQ_ID");
        fields.put("shipGroupSeqId", "PI.SHIP_GROUP_SEQ_ID");
        fields.put("inventoryItemId", "PI.INVENTORY_ITEM_ID");
        fields.put("itemStatusId", "PI.ITEM_STATUS_ID");
        fields.put("quantity", "PI.QUANTITY");
fieldMapColumns.put("PicklistItemAndBin", fields);
}
  public static enum Fields implements EntityFieldInterface<PicklistItemAndBin> {
    picklistBinId("picklistBinId"),
    picklistId("picklistId"),
    binLocationNumber("binLocationNumber"),
    primaryOrderId("primaryOrderId"),
    primaryShipGroupSeqId("primaryShipGroupSeqId"),
    orderId("orderId"),
    orderItemSeqId("orderItemSeqId"),
    shipGroupSeqId("shipGroupSeqId"),
    inventoryItemId("inventoryItemId"),
    itemStatusId("itemStatusId"),
    quantity("quantity");
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
   private String picklistBinId;
    
   private String picklistId;
    
   private Long binLocationNumber;
    
   private String primaryOrderId;
    
   private String primaryShipGroupSeqId;
    
   private String orderId;
    
   private String orderItemSeqId;
    
   private String shipGroupSeqId;
    
   private String inventoryItemId;
    
   private String itemStatusId;
    
   private BigDecimal quantity;

  /**
   * Default constructor.
   */
  public PicklistItemAndBin() {
      super();
      this.baseEntityName = "PicklistItemAndBin";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("picklistBinId");this.primaryKeyNames.add("orderId");this.primaryKeyNames.add("orderItemSeqId");this.primaryKeyNames.add("shipGroupSeqId");this.primaryKeyNames.add("inventoryItemId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("picklistBinId");this.allFieldsNames.add("picklistId");this.allFieldsNames.add("binLocationNumber");this.allFieldsNames.add("primaryOrderId");this.allFieldsNames.add("primaryShipGroupSeqId");this.allFieldsNames.add("orderId");this.allFieldsNames.add("orderItemSeqId");this.allFieldsNames.add("shipGroupSeqId");this.allFieldsNames.add("inventoryItemId");this.allFieldsNames.add("itemStatusId");this.allFieldsNames.add("quantity");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public PicklistItemAndBin(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param picklistBinId the picklistBinId to set
     */
    public void setPicklistBinId(String picklistBinId) {
        this.picklistBinId = picklistBinId;
    }
    /**
     * Auto generated value setter.
     * @param picklistId the picklistId to set
     */
    public void setPicklistId(String picklistId) {
        this.picklistId = picklistId;
    }
    /**
     * Auto generated value setter.
     * @param binLocationNumber the binLocationNumber to set
     */
    public void setBinLocationNumber(Long binLocationNumber) {
        this.binLocationNumber = binLocationNumber;
    }
    /**
     * Auto generated value setter.
     * @param primaryOrderId the primaryOrderId to set
     */
    public void setPrimaryOrderId(String primaryOrderId) {
        this.primaryOrderId = primaryOrderId;
    }
    /**
     * Auto generated value setter.
     * @param primaryShipGroupSeqId the primaryShipGroupSeqId to set
     */
    public void setPrimaryShipGroupSeqId(String primaryShipGroupSeqId) {
        this.primaryShipGroupSeqId = primaryShipGroupSeqId;
    }
    /**
     * Auto generated value setter.
     * @param orderId the orderId to set
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    /**
     * Auto generated value setter.
     * @param orderItemSeqId the orderItemSeqId to set
     */
    public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
    }
    /**
     * Auto generated value setter.
     * @param shipGroupSeqId the shipGroupSeqId to set
     */
    public void setShipGroupSeqId(String shipGroupSeqId) {
        this.shipGroupSeqId = shipGroupSeqId;
    }
    /**
     * Auto generated value setter.
     * @param inventoryItemId the inventoryItemId to set
     */
    public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }
    /**
     * Auto generated value setter.
     * @param itemStatusId the itemStatusId to set
     */
    public void setItemStatusId(String itemStatusId) {
        this.itemStatusId = itemStatusId;
    }
    /**
     * Auto generated value setter.
     * @param quantity the quantity to set
     */
    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPicklistBinId() {
        return this.picklistBinId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPicklistId() {
        return this.picklistId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getBinLocationNumber() {
        return this.binLocationNumber;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPrimaryOrderId() {
        return this.primaryOrderId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPrimaryShipGroupSeqId() {
        return this.primaryShipGroupSeqId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrderId() {
        return this.orderId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrderItemSeqId() {
        return this.orderItemSeqId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getShipGroupSeqId() {
        return this.shipGroupSeqId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getInventoryItemId() {
        return this.inventoryItemId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getItemStatusId() {
        return this.itemStatusId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getQuantity() {
        return this.quantity;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setPicklistBinId((String) mapValue.get("picklistBinId"));
        setPicklistId((String) mapValue.get("picklistId"));
        setBinLocationNumber((Long) mapValue.get("binLocationNumber"));
        setPrimaryOrderId((String) mapValue.get("primaryOrderId"));
        setPrimaryShipGroupSeqId((String) mapValue.get("primaryShipGroupSeqId"));
        setOrderId((String) mapValue.get("orderId"));
        setOrderItemSeqId((String) mapValue.get("orderItemSeqId"));
        setShipGroupSeqId((String) mapValue.get("shipGroupSeqId"));
        setInventoryItemId((String) mapValue.get("inventoryItemId"));
        setItemStatusId((String) mapValue.get("itemStatusId"));
        setQuantity(convertToBigDecimal(mapValue.get("quantity")));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("picklistBinId", getPicklistBinId());
        mapValue.put("picklistId", getPicklistId());
        mapValue.put("binLocationNumber", getBinLocationNumber());
        mapValue.put("primaryOrderId", getPrimaryOrderId());
        mapValue.put("primaryShipGroupSeqId", getPrimaryShipGroupSeqId());
        mapValue.put("orderId", getOrderId());
        mapValue.put("orderItemSeqId", getOrderItemSeqId());
        mapValue.put("shipGroupSeqId", getShipGroupSeqId());
        mapValue.put("inventoryItemId", getInventoryItemId());
        mapValue.put("itemStatusId", getItemStatusId());
        mapValue.put("quantity", getQuantity());
        return mapValue;
    }


}
