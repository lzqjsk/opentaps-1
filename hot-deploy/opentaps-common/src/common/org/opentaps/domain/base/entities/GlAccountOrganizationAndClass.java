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
import java.sql.Timestamp;

/**
 * Auto generated base entity GlAccountOrganizationAndClass.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectGlAccountOrganizationAndClasss", query="SELECT GLA.POSTED_BALANCE AS \"postedBalance\",GLAO.GL_ACCOUNT_ID AS \"glAccountId\",GLAO.ORGANIZATION_PARTY_ID AS \"organizationPartyId\",GLAO.ROLE_TYPE_ID AS \"roleTypeId\",GLAO.FROM_DATE AS \"fromDate\",GLAO.THRU_DATE AS \"thruDate\",GLAO.POSTED_BALANCE AS \"postedBalance\",GLA.GL_ACCOUNT_TYPE_ID AS \"glAccountTypeId\",GLA.GL_ACCOUNT_CLASS_ID AS \"glAccountClassId\",GLA.GL_RESOURCE_TYPE_ID AS \"glResourceTypeId\",GLA.GL_XBRL_CLASS_ID AS \"glXbrlClassId\",GLA.PARENT_GL_ACCOUNT_ID AS \"parentGlAccountId\",GLA.ACCOUNT_CODE AS \"accountCode\",GLA.ACCOUNT_NAME AS \"accountName\",GLA.DESCRIPTION AS \"description\",GLA.PRODUCT_ID AS \"productId\" FROM GL_ACCOUNT_ORGANIZATION GLAO INNER JOIN GL_ACCOUNT GLA ON GLAO.GL_ACCOUNT_ID = GLA.GL_ACCOUNT_ID", resultSetMapping="GlAccountOrganizationAndClassMapping")
@SqlResultSetMapping(name="GlAccountOrganizationAndClassMapping", entities={
@EntityResult(entityClass=GlAccountOrganizationAndClass.class, fields = {
@FieldResult(name="accountPostedBalance", column="accountPostedBalance")
,@FieldResult(name="glAccountId", column="glAccountId")
,@FieldResult(name="organizationPartyId", column="organizationPartyId")
,@FieldResult(name="roleTypeId", column="roleTypeId")
,@FieldResult(name="fromDate", column="fromDate")
,@FieldResult(name="thruDate", column="thruDate")
,@FieldResult(name="postedBalance", column="postedBalance")
,@FieldResult(name="glAccountTypeId", column="glAccountTypeId")
,@FieldResult(name="glAccountClassId", column="glAccountClassId")
,@FieldResult(name="glResourceTypeId", column="glResourceTypeId")
,@FieldResult(name="glXbrlClassId", column="glXbrlClassId")
,@FieldResult(name="parentGlAccountId", column="parentGlAccountId")
,@FieldResult(name="accountCode", column="accountCode")
,@FieldResult(name="accountName", column="accountName")
,@FieldResult(name="description", column="description")
,@FieldResult(name="productId", column="productId")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class GlAccountOrganizationAndClass extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("accountPostedBalance", "GLA.POSTED_BALANCE");
        fields.put("glAccountId", "GLAO.GL_ACCOUNT_ID");
        fields.put("organizationPartyId", "GLAO.ORGANIZATION_PARTY_ID");
        fields.put("roleTypeId", "GLAO.ROLE_TYPE_ID");
        fields.put("fromDate", "GLAO.FROM_DATE");
        fields.put("thruDate", "GLAO.THRU_DATE");
        fields.put("postedBalance", "GLAO.POSTED_BALANCE");
        fields.put("glAccountTypeId", "GLA.GL_ACCOUNT_TYPE_ID");
        fields.put("glAccountClassId", "GLA.GL_ACCOUNT_CLASS_ID");
        fields.put("glResourceTypeId", "GLA.GL_RESOURCE_TYPE_ID");
        fields.put("glXbrlClassId", "GLA.GL_XBRL_CLASS_ID");
        fields.put("parentGlAccountId", "GLA.PARENT_GL_ACCOUNT_ID");
        fields.put("accountCode", "GLA.ACCOUNT_CODE");
        fields.put("accountName", "GLA.ACCOUNT_NAME");
        fields.put("description", "GLA.DESCRIPTION");
        fields.put("productId", "GLA.PRODUCT_ID");
fieldMapColumns.put("GlAccountOrganizationAndClass", fields);
}
  public static enum Fields implements EntityFieldInterface<GlAccountOrganizationAndClass> {
    accountPostedBalance("accountPostedBalance"),
    glAccountId("glAccountId"),
    organizationPartyId("organizationPartyId"),
    roleTypeId("roleTypeId"),
    fromDate("fromDate"),
    thruDate("thruDate"),
    postedBalance("postedBalance"),
    glAccountTypeId("glAccountTypeId"),
    glAccountClassId("glAccountClassId"),
    glResourceTypeId("glResourceTypeId"),
    glXbrlClassId("glXbrlClassId"),
    parentGlAccountId("parentGlAccountId"),
    accountCode("accountCode"),
    accountName("accountName"),
    description("description"),
    productId("productId");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

    
   private BigDecimal accountPostedBalance;
    @Id
   private String glAccountId;
    
   private String organizationPartyId;
    
   private String roleTypeId;
    
   private Timestamp fromDate;
    
   private Timestamp thruDate;
    
   private BigDecimal postedBalance;
    
   private String glAccountTypeId;
    
   private String glAccountClassId;
    
   private String glResourceTypeId;
    
   private String glXbrlClassId;
    
   private String parentGlAccountId;
    
   private String accountCode;
    
   private String accountName;
    
   private String description;
    
   private String productId;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="GL_ACCOUNT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private GlAccount glAccount = null;
   private transient GlAccountOrganization glAccountOrganization = null;

  /**
   * Default constructor.
   */
  public GlAccountOrganizationAndClass() {
      super();
      this.baseEntityName = "GlAccountOrganizationAndClass";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("glAccountId");this.primaryKeyNames.add("organizationPartyId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("accountPostedBalance");this.allFieldsNames.add("glAccountId");this.allFieldsNames.add("organizationPartyId");this.allFieldsNames.add("roleTypeId");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("postedBalance");this.allFieldsNames.add("glAccountTypeId");this.allFieldsNames.add("glAccountClassId");this.allFieldsNames.add("glResourceTypeId");this.allFieldsNames.add("glXbrlClassId");this.allFieldsNames.add("parentGlAccountId");this.allFieldsNames.add("accountCode");this.allFieldsNames.add("accountName");this.allFieldsNames.add("description");this.allFieldsNames.add("productId");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public GlAccountOrganizationAndClass(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param accountPostedBalance the accountPostedBalance to set
     */
    public void setAccountPostedBalance(BigDecimal accountPostedBalance) {
        this.accountPostedBalance = accountPostedBalance;
    }
    /**
     * Auto generated value setter.
     * @param glAccountId the glAccountId to set
     */
    public void setGlAccountId(String glAccountId) {
        this.glAccountId = glAccountId;
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
     * @param roleTypeId the roleTypeId to set
     */
    public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
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
     * @param postedBalance the postedBalance to set
     */
    public void setPostedBalance(BigDecimal postedBalance) {
        this.postedBalance = postedBalance;
    }
    /**
     * Auto generated value setter.
     * @param glAccountTypeId the glAccountTypeId to set
     */
    public void setGlAccountTypeId(String glAccountTypeId) {
        this.glAccountTypeId = glAccountTypeId;
    }
    /**
     * Auto generated value setter.
     * @param glAccountClassId the glAccountClassId to set
     */
    public void setGlAccountClassId(String glAccountClassId) {
        this.glAccountClassId = glAccountClassId;
    }
    /**
     * Auto generated value setter.
     * @param glResourceTypeId the glResourceTypeId to set
     */
    public void setGlResourceTypeId(String glResourceTypeId) {
        this.glResourceTypeId = glResourceTypeId;
    }
    /**
     * Auto generated value setter.
     * @param glXbrlClassId the glXbrlClassId to set
     */
    public void setGlXbrlClassId(String glXbrlClassId) {
        this.glXbrlClassId = glXbrlClassId;
    }
    /**
     * Auto generated value setter.
     * @param parentGlAccountId the parentGlAccountId to set
     */
    public void setParentGlAccountId(String parentGlAccountId) {
        this.parentGlAccountId = parentGlAccountId;
    }
    /**
     * Auto generated value setter.
     * @param accountCode the accountCode to set
     */
    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }
    /**
     * Auto generated value setter.
     * @param accountName the accountName to set
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
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
     * @param productId the productId to set
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getAccountPostedBalance() {
        return this.accountPostedBalance;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGlAccountId() {
        return this.glAccountId;
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
    public String getRoleTypeId() {
        return this.roleTypeId;
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
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getPostedBalance() {
        return this.postedBalance;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGlAccountTypeId() {
        return this.glAccountTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGlAccountClassId() {
        return this.glAccountClassId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGlResourceTypeId() {
        return this.glResourceTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGlXbrlClassId() {
        return this.glXbrlClassId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getParentGlAccountId() {
        return this.parentGlAccountId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAccountCode() {
        return this.accountCode;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAccountName() {
        return this.accountName;
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
    public String getProductId() {
        return this.productId;
    }

    /**
     * Auto generated method that gets the related <code>GlAccount</code> by the relation named <code>GlAccount</code>.
     * @return the <code>GlAccount</code>
     * @throws RepositoryException if an error occurs
     */
    public GlAccount getGlAccount() throws RepositoryException {
        if (this.glAccount == null) {
            this.glAccount = getRelatedOne(GlAccount.class, "GlAccount");
        }
        return this.glAccount;
    }
    /**
     * Auto generated method that gets the related <code>GlAccountOrganization</code> by the relation named <code>GlAccountOrganization</code>.
     * @return the <code>GlAccountOrganization</code>
     * @throws RepositoryException if an error occurs
     */
    public GlAccountOrganization getGlAccountOrganization() throws RepositoryException {
        if (this.glAccountOrganization == null) {
            this.glAccountOrganization = getRelatedOne(GlAccountOrganization.class, "GlAccountOrganization");
        }
        return this.glAccountOrganization;
    }

    /**
     * Auto generated value setter.
     * @param glAccount the glAccount to set
    */
    public void setGlAccount(GlAccount glAccount) {
        this.glAccount = glAccount;
    }
    /**
     * Auto generated value setter.
     * @param glAccountOrganization the glAccountOrganization to set
    */
    public void setGlAccountOrganization(GlAccountOrganization glAccountOrganization) {
        this.glAccountOrganization = glAccountOrganization;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setAccountPostedBalance(convertToBigDecimal(mapValue.get("accountPostedBalance")));
        setGlAccountId((String) mapValue.get("glAccountId"));
        setOrganizationPartyId((String) mapValue.get("organizationPartyId"));
        setRoleTypeId((String) mapValue.get("roleTypeId"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
        setPostedBalance(convertToBigDecimal(mapValue.get("postedBalance")));
        setGlAccountTypeId((String) mapValue.get("glAccountTypeId"));
        setGlAccountClassId((String) mapValue.get("glAccountClassId"));
        setGlResourceTypeId((String) mapValue.get("glResourceTypeId"));
        setGlXbrlClassId((String) mapValue.get("glXbrlClassId"));
        setParentGlAccountId((String) mapValue.get("parentGlAccountId"));
        setAccountCode((String) mapValue.get("accountCode"));
        setAccountName((String) mapValue.get("accountName"));
        setDescription((String) mapValue.get("description"));
        setProductId((String) mapValue.get("productId"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("accountPostedBalance", getAccountPostedBalance());
        mapValue.put("glAccountId", getGlAccountId());
        mapValue.put("organizationPartyId", getOrganizationPartyId());
        mapValue.put("roleTypeId", getRoleTypeId());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("postedBalance", getPostedBalance());
        mapValue.put("glAccountTypeId", getGlAccountTypeId());
        mapValue.put("glAccountClassId", getGlAccountClassId());
        mapValue.put("glResourceTypeId", getGlResourceTypeId());
        mapValue.put("glXbrlClassId", getGlXbrlClassId());
        mapValue.put("parentGlAccountId", getParentGlAccountId());
        mapValue.put("accountCode", getAccountCode());
        mapValue.put("accountName", getAccountName());
        mapValue.put("description", getDescription());
        mapValue.put("productId", getProductId());
        return mapValue;
    }


}
