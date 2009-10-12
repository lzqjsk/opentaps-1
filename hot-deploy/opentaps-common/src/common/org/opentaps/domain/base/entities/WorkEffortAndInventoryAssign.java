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
 * Auto generated base entity WorkEffortAndInventoryAssign.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectWorkEffortAndInventoryAssigns", query="SELECT II.PRODUCT_ID AS \"productId\",II.CURRENCY_UOM_ID AS \"currencyUomId\",II.UNIT_COST AS \"unitCost\",WEIA.WORK_EFFORT_ID AS \"workEffortId\",WEIA.INVENTORY_ITEM_ID AS \"inventoryItemId\",WEIA.STATUS_ID AS \"statusId\",WEIA.QUANTITY AS \"quantity\" FROM WORK_EFFORT_INVENTORY_ASSIGN WEIA INNER JOIN INVENTORY_ITEM II ON WEIA.INVENTORY_ITEM_ID = II.INVENTORY_ITEM_ID", resultSetMapping="WorkEffortAndInventoryAssignMapping")
@SqlResultSetMapping(name="WorkEffortAndInventoryAssignMapping", entities={
@EntityResult(entityClass=WorkEffortAndInventoryAssign.class, fields = {
@FieldResult(name="productId", column="productId")
,@FieldResult(name="currencyUomId", column="currencyUomId")
,@FieldResult(name="unitCost", column="unitCost")
,@FieldResult(name="workEffortId", column="workEffortId")
,@FieldResult(name="inventoryItemId", column="inventoryItemId")
,@FieldResult(name="statusId", column="statusId")
,@FieldResult(name="quantity", column="quantity")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class WorkEffortAndInventoryAssign extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("productId", "II.PRODUCT_ID");
        fields.put("currencyUomId", "II.CURRENCY_UOM_ID");
        fields.put("unitCost", "II.UNIT_COST");
        fields.put("workEffortId", "WEIA.WORK_EFFORT_ID");
        fields.put("inventoryItemId", "WEIA.INVENTORY_ITEM_ID");
        fields.put("statusId", "WEIA.STATUS_ID");
        fields.put("quantity", "WEIA.QUANTITY");
fieldMapColumns.put("WorkEffortAndInventoryAssign", fields);
}
  public static enum Fields implements EntityFieldInterface<WorkEffortAndInventoryAssign> {
    productId("productId"),
    currencyUomId("currencyUomId"),
    unitCost("unitCost"),
    workEffortId("workEffortId"),
    inventoryItemId("inventoryItemId"),
    statusId("statusId"),
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

    
   private String productId;
    
   private String currencyUomId;
    
   private BigDecimal unitCost;
    @Id
   private String workEffortId;
    
   private String inventoryItemId;
    
   private String statusId;
    
   private BigDecimal quantity;

  /**
   * Default constructor.
   */
  public WorkEffortAndInventoryAssign() {
      super();
      this.baseEntityName = "WorkEffortAndInventoryAssign";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("workEffortId");this.primaryKeyNames.add("inventoryItemId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("productId");this.allFieldsNames.add("currencyUomId");this.allFieldsNames.add("unitCost");this.allFieldsNames.add("workEffortId");this.allFieldsNames.add("inventoryItemId");this.allFieldsNames.add("statusId");this.allFieldsNames.add("quantity");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public WorkEffortAndInventoryAssign(RepositoryInterface repository) {
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
     * @param currencyUomId the currencyUomId to set
     */
    public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }
    /**
     * Auto generated value setter.
     * @param unitCost the unitCost to set
     */
    public void setUnitCost(BigDecimal unitCost) {
        this.unitCost = unitCost;
    }
    /**
     * Auto generated value setter.
     * @param workEffortId the workEffortId to set
     */
    public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
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
     * @param statusId the statusId to set
     */
    public void setStatusId(String statusId) {
        this.statusId = statusId;
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
    public String getProductId() {
        return this.productId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCurrencyUomId() {
        return this.currencyUomId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getUnitCost() {
        return this.unitCost;
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
     * @return <code>String</code>
     */
    public String getInventoryItemId() {
        return this.inventoryItemId;
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
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getQuantity() {
        return this.quantity;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setProductId((String) mapValue.get("productId"));
        setCurrencyUomId((String) mapValue.get("currencyUomId"));
        setUnitCost(convertToBigDecimal(mapValue.get("unitCost")));
        setWorkEffortId((String) mapValue.get("workEffortId"));
        setInventoryItemId((String) mapValue.get("inventoryItemId"));
        setStatusId((String) mapValue.get("statusId"));
        setQuantity(convertToBigDecimal(mapValue.get("quantity")));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("productId", getProductId());
        mapValue.put("currencyUomId", getCurrencyUomId());
        mapValue.put("unitCost", getUnitCost());
        mapValue.put("workEffortId", getWorkEffortId());
        mapValue.put("inventoryItemId", getInventoryItemId());
        mapValue.put("statusId", getStatusId());
        mapValue.put("quantity", getQuantity());
        return mapValue;
    }


}
