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
 * Auto generated base entity CarrierAndShipmentMethod.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectCarrierAndShipmentMethods", query="SELECT CS.SHIPMENT_METHOD_TYPE_ID AS \"shipmentMethodTypeId\",CS.PARTY_ID AS \"partyId\",CS.ROLE_TYPE_ID AS \"roleTypeId\",CS.SEQUENCE_NUMBER AS \"sequenceNumber\",SM.DESCRIPTION AS \"description\" FROM CARRIER_SHIPMENT_METHOD CS INNER JOIN SHIPMENT_METHOD_TYPE SM ON CS.SHIPMENT_METHOD_TYPE_ID = SM.SHIPMENT_METHOD_TYPE_ID", resultSetMapping="CarrierAndShipmentMethodMapping")
@SqlResultSetMapping(name="CarrierAndShipmentMethodMapping", entities={
@EntityResult(entityClass=CarrierAndShipmentMethod.class, fields = {
@FieldResult(name="shipmentMethodTypeId", column="shipmentMethodTypeId")
,@FieldResult(name="partyId", column="partyId")
,@FieldResult(name="roleTypeId", column="roleTypeId")
,@FieldResult(name="sequenceNumber", column="sequenceNumber")
,@FieldResult(name="description", column="description")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class CarrierAndShipmentMethod extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("shipmentMethodTypeId", "CS.SHIPMENT_METHOD_TYPE_ID");
        fields.put("partyId", "CS.PARTY_ID");
        fields.put("roleTypeId", "CS.ROLE_TYPE_ID");
        fields.put("sequenceNumber", "CS.SEQUENCE_NUMBER");
        fields.put("description", "SM.DESCRIPTION");
fieldMapColumns.put("CarrierAndShipmentMethod", fields);
}
  public static enum Fields implements EntityFieldInterface<CarrierAndShipmentMethod> {
    shipmentMethodTypeId("shipmentMethodTypeId"),
    partyId("partyId"),
    roleTypeId("roleTypeId"),
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
   private String shipmentMethodTypeId;
    
   private String partyId;
    
   private String roleTypeId;
    
   private Long sequenceNumber;
    
   private String description;

  /**
   * Default constructor.
   */
  public CarrierAndShipmentMethod() {
      super();
      this.baseEntityName = "CarrierAndShipmentMethod";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("shipmentMethodTypeId");this.primaryKeyNames.add("partyId");this.primaryKeyNames.add("roleTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("shipmentMethodTypeId");this.allFieldsNames.add("partyId");this.allFieldsNames.add("roleTypeId");this.allFieldsNames.add("sequenceNumber");this.allFieldsNames.add("description");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public CarrierAndShipmentMethod(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
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




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setShipmentMethodTypeId((String) mapValue.get("shipmentMethodTypeId"));
        setPartyId((String) mapValue.get("partyId"));
        setRoleTypeId((String) mapValue.get("roleTypeId"));
        setSequenceNumber((Long) mapValue.get("sequenceNumber"));
        setDescription((String) mapValue.get("description"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("shipmentMethodTypeId", getShipmentMethodTypeId());
        mapValue.put("partyId", getPartyId());
        mapValue.put("roleTypeId", getRoleTypeId());
        mapValue.put("sequenceNumber", getSequenceNumber());
        mapValue.put("description", getDescription());
        return mapValue;
    }


}
