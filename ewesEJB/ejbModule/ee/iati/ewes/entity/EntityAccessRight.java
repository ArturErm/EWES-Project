/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee.iati.ewes.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Artur
 */
@Entity
@Table(name = "access_rights")
@NamedQueries({
		@NamedQuery(name = "EntityAccessRight.findAll", query = "SELECT a FROM EntityAccessRight a"),
		@NamedQuery(name = "EntityAccessRight.findByArId", query = "SELECT a FROM EntityAccessRight a WHERE a.arId = :arId"),
		@NamedQuery(name = "EntityAccessRight.findByArTitleId", query = "SELECT a FROM EntityAccessRight a WHERE a.arTitleId = :arTitleId"),
		@NamedQuery(name = "EntityAccessRight.findByArDescrId", query = "SELECT a FROM EntityAccessRight a WHERE a.arDescrId = :arDescrId") })
public class EntityAccessRight implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "AR_ID")
	private Integer arId;
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 128)
	@Column(name = "AR_TITLE_ID")
	private String arTitleId;
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 128)
	@Column(name = "AR_DESCR_ID")
	private String arDescrId;

	public EntityAccessRight() {
	}

	public EntityAccessRight(Integer arId) {
		this.arId = arId;
	}

	public EntityAccessRight(Integer arId, String arTitleId, String arDescrId) {
		this.arId = arId;
		this.arTitleId = arTitleId;
		this.arDescrId = arDescrId;
	}

	public Integer getArId() {
		return arId;
	}

	public void setArId(Integer arId) {
		this.arId = arId;
	}

	public String getArTitleId() {
		return arTitleId;
	}

	public void setArTitleId(String arTitleId) {
		this.arTitleId = arTitleId;
	}

	public String getArDescrId() {
		return arDescrId;
	}

	public void setArDescrId(String arDescrId) {
		this.arDescrId = arDescrId;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (arId != null ? arId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof EntityAccessRight)) {
			return false;
		}
		EntityAccessRight other = (EntityAccessRight) object;
		if ((this.arId == null && other.arId != null)
				|| (this.arId != null && !this.arId.equals(other.arId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "ee.iati.ewes.dto.AccessRights[ arId=" + arId + " ]";
	}

}
