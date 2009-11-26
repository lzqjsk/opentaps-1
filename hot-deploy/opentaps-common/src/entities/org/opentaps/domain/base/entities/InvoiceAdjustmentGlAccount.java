package org.opentaps.domain.base.entities;

/*
 * Copyright (c) 2008 - 2009 Open Source Strategies, Inc.
 *
 * Opentaps is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Opentaps is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Opentaps.  If not, see <http://www.gnu.org/licenses/>.
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
 * Auto generated base entity InvoiceAdjustmentGlAccount.
 */
@javax.persistence.Entity
@Table(name="INVOICE_ADJUSTMENT_GL_ACCOUNT")
public class InvoiceAdjustmentGlAccount extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("organizationPartyId", "ORGANIZATION_PARTY_ID");
        fields.put("invoiceTypeId", "INVOICE_TYPE_ID");
        fields.put("invoiceAdjustmentTypeId", "INVOICE_ADJUSTMENT_TYPE_ID");
        fields.put("glAccountId", "GL_ACCOUNT_ID");
        fields.put("acctgTransTypeId", "ACCTG_TRANS_TYPE_ID");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("InvoiceAdjustmentGlAccount", fields);
}
  public static enum Fields implements EntityFieldInterface<InvoiceAdjustmentGlAccount> {
    organizationPartyId("organizationPartyId"),
    invoiceTypeId("invoiceTypeId"),
    invoiceAdjustmentTypeId("invoiceAdjustmentTypeId"),
    glAccountId("glAccountId"),
    acctgTransTypeId("acctgTransTypeId"),
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

   @EmbeddedId

   @FieldBridge(impl = org.opentaps.domain.base.entities.bridge.InvoiceAdjustmentGlAccountPkBridge.class)
     private InvoiceAdjustmentGlAccountPk id = new InvoiceAdjustmentGlAccountPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>InvoiceAdjustmentGlAccountPk</code>
     */
      public InvoiceAdjustmentGlAccountPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>InvoiceAdjustmentGlAccountPk</code> value to set
    */   
      public void setId(InvoiceAdjustmentGlAccountPk id) {
         this.id = id;
      }
   @Column(name="GL_ACCOUNT_ID")
   private String glAccountId;
   @Column(name="ACCTG_TRANS_TYPE_ID")
   private String acctgTransTypeId;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="ORGANIZATION_PARTY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Party party = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="INVOICE_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private InvoiceType invoiceType = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="INVOICE_ADJUSTMENT_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private InvoiceAdjustmentType invoiceAdjustmentType = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="GL_ACCOUNT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private GlAccount glAccount = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="ACCTG_TRANS_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private AcctgTransType acctgTransType = null;

  /**
   * Default constructor.
   */
  public InvoiceAdjustmentGlAccount() {
      super();
      this.baseEntityName = "InvoiceAdjustmentGlAccount";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("organizationPartyId");this.primaryKeyNames.add("invoiceTypeId");this.primaryKeyNames.add("invoiceAdjustmentTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("organizationPartyId");this.allFieldsNames.add("invoiceTypeId");this.allFieldsNames.add("invoiceAdjustmentTypeId");this.allFieldsNames.add("glAccountId");this.allFieldsNames.add("acctgTransTypeId");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public InvoiceAdjustmentGlAccount(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param organizationPartyId the organizationPartyId to set
     */
    public void setOrganizationPartyId(String organizationPartyId) {
        id.setOrganizationPartyId(organizationPartyId);
    }
    /**
     * Auto generated value setter.
     * @param invoiceTypeId the invoiceTypeId to set
     */
    public void setInvoiceTypeId(String invoiceTypeId) {
        id.setInvoiceTypeId(invoiceTypeId);
    }
    /**
     * Auto generated value setter.
     * @param invoiceAdjustmentTypeId the invoiceAdjustmentTypeId to set
     */
    public void setInvoiceAdjustmentTypeId(String invoiceAdjustmentTypeId) {
        id.setInvoiceAdjustmentTypeId(invoiceAdjustmentTypeId);
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
     * @param acctgTransTypeId the acctgTransTypeId to set
     */
    public void setAcctgTransTypeId(String acctgTransTypeId) {
        this.acctgTransTypeId = acctgTransTypeId;
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
    public String getOrganizationPartyId() {
        return this.id.getOrganizationPartyId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getInvoiceTypeId() {
        return this.id.getInvoiceTypeId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getInvoiceAdjustmentTypeId() {
        return this.id.getInvoiceAdjustmentTypeId();
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
    public String getAcctgTransTypeId() {
        return this.acctgTransTypeId;
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
     * Auto generated method that gets the related <code>InvoiceType</code> by the relation named <code>InvoiceType</code>.
     * @return the <code>InvoiceType</code>
     * @throws RepositoryException if an error occurs
     */
    public InvoiceType getInvoiceType() throws RepositoryException {
        if (this.invoiceType == null) {
            this.invoiceType = getRelatedOne(InvoiceType.class, "InvoiceType");
        }
        return this.invoiceType;
    }
    /**
     * Auto generated method that gets the related <code>InvoiceAdjustmentType</code> by the relation named <code>InvoiceAdjustmentType</code>.
     * @return the <code>InvoiceAdjustmentType</code>
     * @throws RepositoryException if an error occurs
     */
    public InvoiceAdjustmentType getInvoiceAdjustmentType() throws RepositoryException {
        if (this.invoiceAdjustmentType == null) {
            this.invoiceAdjustmentType = getRelatedOne(InvoiceAdjustmentType.class, "InvoiceAdjustmentType");
        }
        return this.invoiceAdjustmentType;
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
     * Auto generated method that gets the related <code>AcctgTransType</code> by the relation named <code>AcctgTransType</code>.
     * @return the <code>AcctgTransType</code>
     * @throws RepositoryException if an error occurs
     */
    public AcctgTransType getAcctgTransType() throws RepositoryException {
        if (this.acctgTransType == null) {
            this.acctgTransType = getRelatedOne(AcctgTransType.class, "AcctgTransType");
        }
        return this.acctgTransType;
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
     * @param invoiceType the invoiceType to set
    */
    public void setInvoiceType(InvoiceType invoiceType) {
        this.invoiceType = invoiceType;
    }
    /**
     * Auto generated value setter.
     * @param invoiceAdjustmentType the invoiceAdjustmentType to set
    */
    public void setInvoiceAdjustmentType(InvoiceAdjustmentType invoiceAdjustmentType) {
        this.invoiceAdjustmentType = invoiceAdjustmentType;
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
     * @param acctgTransType the acctgTransType to set
    */
    public void setAcctgTransType(AcctgTransType acctgTransType) {
        this.acctgTransType = acctgTransType;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setOrganizationPartyId((String) mapValue.get("organizationPartyId"));
        setInvoiceTypeId((String) mapValue.get("invoiceTypeId"));
        setInvoiceAdjustmentTypeId((String) mapValue.get("invoiceAdjustmentTypeId"));
        setGlAccountId((String) mapValue.get("glAccountId"));
        setAcctgTransTypeId((String) mapValue.get("acctgTransTypeId"));
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
        mapValue.put("organizationPartyId", getOrganizationPartyId());
        mapValue.put("invoiceTypeId", getInvoiceTypeId());
        mapValue.put("invoiceAdjustmentTypeId", getInvoiceAdjustmentTypeId());
        mapValue.put("glAccountId", getGlAccountId());
        mapValue.put("acctgTransTypeId", getAcctgTransTypeId());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}