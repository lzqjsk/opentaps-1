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

/**
 * Auto generated base entity ProjectIdPartyRoleAndPhase.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectProjectIdPartyRoleAndPhases", query="SELECT WEPH.WORK_EFFORT_PARENT_ID AS \"workEffortParentId\",WEPH.WORK_EFFORT_ID AS \"workEffortId\",WEPA.PARTY_ID AS \"partyId\",WEPA.ROLE_TYPE_ID AS \"roleTypeId\",RT.DESCRIPTION AS \"description\" FROM WORK_EFFORT_PARTY_ASSIGNMENT WEPA INNER JOIN ROLE_TYPE RT ON WEPA.ROLE_TYPE_ID = RT.ROLE_TYPE_ID INNER JOIN WORK_EFFORT WEPH ON WEPH.WORK_EFFORT_PARENT_ID = WEPA.WORK_EFFORT_ID", resultSetMapping="ProjectIdPartyRoleAndPhaseMapping")
@SqlResultSetMapping(name="ProjectIdPartyRoleAndPhaseMapping", entities={
@EntityResult(entityClass=ProjectIdPartyRoleAndPhase.class, fields = {
@FieldResult(name="projectId", column="projectId")
,@FieldResult(name="phaseId", column="phaseId")
,@FieldResult(name="partyId", column="partyId")
,@FieldResult(name="roleTypeId", column="roleTypeId")
,@FieldResult(name="description", column="description")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class ProjectIdPartyRoleAndPhase extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("projectId", "WEPH.WORK_EFFORT_PARENT_ID");
        fields.put("phaseId", "WEPH.WORK_EFFORT_ID");
        fields.put("partyId", "WEPA.PARTY_ID");
        fields.put("roleTypeId", "WEPA.ROLE_TYPE_ID");
        fields.put("description", "RT.DESCRIPTION");
fieldMapColumns.put("ProjectIdPartyRoleAndPhase", fields);
}
  public static enum Fields implements EntityFieldInterface<ProjectIdPartyRoleAndPhase> {
    projectId("projectId"),
    phaseId("phaseId"),
    partyId("partyId"),
    roleTypeId("roleTypeId"),
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

    
   private String projectId;
    
   private String phaseId;
    @Id
   private String partyId;
    
   private String roleTypeId;
    
   private String description;

  /**
   * Default constructor.
   */
  public ProjectIdPartyRoleAndPhase() {
      super();
      this.baseEntityName = "ProjectIdPartyRoleAndPhase";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("phaseId");this.primaryKeyNames.add("partyId");this.primaryKeyNames.add("roleTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("projectId");this.allFieldsNames.add("phaseId");this.allFieldsNames.add("partyId");this.allFieldsNames.add("roleTypeId");this.allFieldsNames.add("description");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ProjectIdPartyRoleAndPhase(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param projectId the projectId to set
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }
    /**
     * Auto generated value setter.
     * @param phaseId the phaseId to set
     */
    public void setPhaseId(String phaseId) {
        this.phaseId = phaseId;
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
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProjectId() {
        return this.projectId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPhaseId() {
        return this.phaseId;
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
    public String getDescription() {
        return this.description;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setProjectId((String) mapValue.get("projectId"));
        setPhaseId((String) mapValue.get("phaseId"));
        setPartyId((String) mapValue.get("partyId"));
        setRoleTypeId((String) mapValue.get("roleTypeId"));
        setDescription((String) mapValue.get("description"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("projectId", getProjectId());
        mapValue.put("phaseId", getPhaseId());
        mapValue.put("partyId", getPartyId());
        mapValue.put("roleTypeId", getRoleTypeId());
        mapValue.put("description", getDescription());
        return mapValue;
    }


}
