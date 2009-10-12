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
 * Auto generated base entity DataWarehouseTransform.
 */
@javax.persistence.Entity
@Table(name="DATA_WAREHOUSE_TRANSFORM")
public class DataWarehouseTransform extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("transformId", "TRANSFORM_ID");
        fields.put("organizationPartyId", "ORGANIZATION_PARTY_ID");
        fields.put("transformEnumId", "TRANSFORM_ENUM_ID");
        fields.put("transformTimestamp", "TRANSFORM_TIMESTAMP");
        fields.put("userLoginId", "USER_LOGIN_ID");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("DataWarehouseTransform", fields);
}
  public static enum Fields implements EntityFieldInterface<DataWarehouseTransform> {
    transformId("transformId"),
    organizationPartyId("organizationPartyId"),
    transformEnumId("transformEnumId"),
    transformTimestamp("transformTimestamp"),
    userLoginId("userLoginId"),
    lastUpdatedStamp("lastUpdatedStamp"),
    lastUpdatedTxStamp("lastUpdatedTxStamp"),
    createdStamp("createdStamp"),
    createdTxStamp("createdTxStamp");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

   @org.hibernate.annotations.GenericGenerator(name="DataWarehouseTransform_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="DataWarehouseTransform_GEN")
   @Id
   @Column(name="TRANSFORM_ID")
   private String transformId;
   @Column(name="ORGANIZATION_PARTY_ID")
   private String organizationPartyId;
   @Column(name="TRANSFORM_ENUM_ID")
   private String transformEnumId;
   @Column(name="TRANSFORM_TIMESTAMP")
   private Timestamp transformTimestamp;
   @Column(name="USER_LOGIN_ID")
   private String userLoginId;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="TRANSFORM_ENUM_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Enumeration enumeration = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="USER_LOGIN_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private UserLogin userLogin = null;

  /**
   * Default constructor.
   */
  public DataWarehouseTransform() {
      super();
      this.baseEntityName = "DataWarehouseTransform";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("transformId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("transformId");this.allFieldsNames.add("organizationPartyId");this.allFieldsNames.add("transformEnumId");this.allFieldsNames.add("transformTimestamp");this.allFieldsNames.add("userLoginId");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public DataWarehouseTransform(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param transformId the transformId to set
     */
    public void setTransformId(String transformId) {
        this.transformId = transformId;
    }
    /**
     * Auto generated value setter.
     * @param organizationPartyId the organizationPartyId to set
     */
    public void setOrganizationPartyId(String organizationPartyId) {
        this.organizationPartyId = organizationPartyId;
    }
    /**
     * Auto generated value setter.
     * @param transformEnumId the transformEnumId to set
     */
    public void setTransformEnumId(String transformEnumId) {
        this.transformEnumId = transformEnumId;
    }
    /**
     * Auto generated value setter.
     * @param transformTimestamp the transformTimestamp to set
     */
    public void setTransformTimestamp(Timestamp transformTimestamp) {
        this.transformTimestamp = transformTimestamp;
    }
    /**
     * Auto generated value setter.
     * @param userLoginId the userLoginId to set
     */
    public void setUserLoginId(String userLoginId) {
        this.userLoginId = userLoginId;
    }
    /**
     * Auto generated value setter.
     * @param lastUpdatedStamp the lastUpdatedStamp to set
     */
    public void setLastUpdatedStamp(Timestamp lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }
    /**
     * Auto generated value setter.
     * @param lastUpdatedTxStamp the lastUpdatedTxStamp to set
     */
    public void setLastUpdatedTxStamp(Timestamp lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }
    /**
     * Auto generated value setter.
     * @param createdStamp the createdStamp to set
     */
    public void setCreatedStamp(Timestamp createdStamp) {
        this.createdStamp = createdStamp;
    }
    /**
     * Auto generated value setter.
     * @param createdTxStamp the createdTxStamp to set
     */
    public void setCreatedTxStamp(Timestamp createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTransformId() {
        return this.transformId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrganizationPartyId() {
        return this.organizationPartyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTransformEnumId() {
        return this.transformEnumId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getTransformTimestamp() {
        return this.transformTimestamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getUserLoginId() {
        return this.userLoginId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getLastUpdatedStamp() {
        return this.lastUpdatedStamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getLastUpdatedTxStamp() {
        return this.lastUpdatedTxStamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getCreatedStamp() {
        return this.createdStamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getCreatedTxStamp() {
        return this.createdTxStamp;
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
     * Auto generated method that gets the related <code>UserLogin</code> by the relation named <code>UserLogin</code>.
     * @return the <code>UserLogin</code>
     * @throws RepositoryException if an error occurs
     */
    public UserLogin getUserLogin() throws RepositoryException {
        if (this.userLogin == null) {
            this.userLogin = getRelatedOne(UserLogin.class, "UserLogin");
        }
        return this.userLogin;
    }

    /**
     * Auto generated value setter.
     * @param enumeration the enumeration to set
    */
    public void setEnumeration(Enumeration enumeration) {
        this.enumeration = enumeration;
    }
    /**
     * Auto generated value setter.
     * @param userLogin the userLogin to set
    */
    public void setUserLogin(UserLogin userLogin) {
        this.userLogin = userLogin;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setTransformId((String) mapValue.get("transformId"));
        setOrganizationPartyId((String) mapValue.get("organizationPartyId"));
        setTransformEnumId((String) mapValue.get("transformEnumId"));
        setTransformTimestamp((Timestamp) mapValue.get("transformTimestamp"));
        setUserLoginId((String) mapValue.get("userLoginId"));
        setLastUpdatedStamp((Timestamp) mapValue.get("lastUpdatedStamp"));
        setLastUpdatedTxStamp((Timestamp) mapValue.get("lastUpdatedTxStamp"));
        setCreatedStamp((Timestamp) mapValue.get("createdStamp"));
        setCreatedTxStamp((Timestamp) mapValue.get("createdTxStamp"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("transformId", getTransformId());
        mapValue.put("organizationPartyId", getOrganizationPartyId());
        mapValue.put("transformEnumId", getTransformEnumId());
        mapValue.put("transformTimestamp", getTransformTimestamp());
        mapValue.put("userLoginId", getUserLoginId());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
