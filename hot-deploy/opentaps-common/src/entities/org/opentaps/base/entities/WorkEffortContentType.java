package org.opentaps.base.entities;

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
 * Auto generated base entity WorkEffortContentType.
 */
@javax.persistence.Entity
@Table(name="WORK_EFFORT_CONTENT_TYPE")
public class WorkEffortContentType extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("workEffortContentTypeId", "WORK_EFFORT_CONTENT_TYPE_ID");
        fields.put("parentTypeId", "PARENT_TYPE_ID");
        fields.put("description", "DESCRIPTION");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("WorkEffortContentType", fields);
}
  public static enum Fields implements EntityFieldInterface<WorkEffortContentType> {
    workEffortContentTypeId("workEffortContentTypeId"),
    parentTypeId("parentTypeId"),
    description("description"),
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

   @org.hibernate.annotations.GenericGenerator(name="WorkEffortContentType_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="WorkEffortContentType_GEN")
   @Id
   @Column(name="WORK_EFFORT_CONTENT_TYPE_ID")
   private String workEffortContentTypeId;
   @Column(name="PARENT_TYPE_ID")
   private String parentTypeId;
   @Column(name="DESCRIPTION")
   private String description;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PARENT_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private WorkEffortContentType parentWorkEffortContentType = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="workEffortContentType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="WORK_EFFORT_CONTENT_TYPE_ID")
   
   private List<WorkEffortContent> workEffortContents = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="PARENT_TYPE_ID")
   
   private List<WorkEffortContentType> childWorkEffortContentTypes = null;

  /**
   * Default constructor.
   */
  public WorkEffortContentType() {
      super();
      this.baseEntityName = "WorkEffortContentType";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("workEffortContentTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("workEffortContentTypeId");this.allFieldsNames.add("parentTypeId");this.allFieldsNames.add("description");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public WorkEffortContentType(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param workEffortContentTypeId the workEffortContentTypeId to set
     */
    public void setWorkEffortContentTypeId(String workEffortContentTypeId) {
        this.workEffortContentTypeId = workEffortContentTypeId;
    }
    /**
     * Auto generated value setter.
     * @param parentTypeId the parentTypeId to set
     */
    public void setParentTypeId(String parentTypeId) {
        this.parentTypeId = parentTypeId;
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
    public String getWorkEffortContentTypeId() {
        return this.workEffortContentTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getParentTypeId() {
        return this.parentTypeId;
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
     * Auto generated method that gets the related <code>WorkEffortContentType</code> by the relation named <code>ParentWorkEffortContentType</code>.
     * @return the <code>WorkEffortContentType</code>
     * @throws RepositoryException if an error occurs
     */
    public WorkEffortContentType getParentWorkEffortContentType() throws RepositoryException {
        if (this.parentWorkEffortContentType == null) {
            this.parentWorkEffortContentType = getRelatedOne(WorkEffortContentType.class, "ParentWorkEffortContentType");
        }
        return this.parentWorkEffortContentType;
    }
    /**
     * Auto generated method that gets the related <code>WorkEffortContent</code> by the relation named <code>WorkEffortContent</code>.
     * @return the list of <code>WorkEffortContent</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends WorkEffortContent> getWorkEffortContents() throws RepositoryException {
        if (this.workEffortContents == null) {
            this.workEffortContents = getRelated(WorkEffortContent.class, "WorkEffortContent");
        }
        return this.workEffortContents;
    }
    /**
     * Auto generated method that gets the related <code>WorkEffortContentType</code> by the relation named <code>ChildWorkEffortContentType</code>.
     * @return the list of <code>WorkEffortContentType</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends WorkEffortContentType> getChildWorkEffortContentTypes() throws RepositoryException {
        if (this.childWorkEffortContentTypes == null) {
            this.childWorkEffortContentTypes = getRelated(WorkEffortContentType.class, "ChildWorkEffortContentType");
        }
        return this.childWorkEffortContentTypes;
    }

    /**
     * Auto generated value setter.
     * @param parentWorkEffortContentType the parentWorkEffortContentType to set
    */
    public void setParentWorkEffortContentType(WorkEffortContentType parentWorkEffortContentType) {
        this.parentWorkEffortContentType = parentWorkEffortContentType;
    }
    /**
     * Auto generated value setter.
     * @param workEffortContents the workEffortContents to set
    */
    public void setWorkEffortContents(List<WorkEffortContent> workEffortContents) {
        this.workEffortContents = workEffortContents;
    }
    /**
     * Auto generated value setter.
     * @param childWorkEffortContentTypes the childWorkEffortContentTypes to set
    */
    public void setChildWorkEffortContentTypes(List<WorkEffortContentType> childWorkEffortContentTypes) {
        this.childWorkEffortContentTypes = childWorkEffortContentTypes;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addWorkEffortContent(WorkEffortContent workEffortContent) {
        if (this.workEffortContents == null) {
            this.workEffortContents = new ArrayList<WorkEffortContent>();
        }
        this.workEffortContents.add(workEffortContent);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeWorkEffortContent(WorkEffortContent workEffortContent) {
        if (this.workEffortContents == null) {
            return;
        }
        this.workEffortContents.remove(workEffortContent);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearWorkEffortContent() {
        if (this.workEffortContents == null) {
            return;
        }
        this.workEffortContents.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setWorkEffortContentTypeId((String) mapValue.get("workEffortContentTypeId"));
        setParentTypeId((String) mapValue.get("parentTypeId"));
        setDescription((String) mapValue.get("description"));
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
        mapValue.put("workEffortContentTypeId", getWorkEffortContentTypeId());
        mapValue.put("parentTypeId", getParentTypeId());
        mapValue.put("description", getDescription());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}