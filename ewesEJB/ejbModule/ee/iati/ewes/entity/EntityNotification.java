/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee.iati.ewes.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Artur
 */
@Entity
@Table(name = "notifications")
@NamedQueries({
		@NamedQuery(name = "EntityNotification.findAll", query = "SELECT n FROM EntityNotification n"),
		@NamedQuery(name = "EntityNotification.findByNotificationId", query = "SELECT n FROM EntityNotification n WHERE n.notificationId = :notificationId"),
		@NamedQuery(name = "EntityNotification.findByTitle", query = "SELECT n FROM EntityNotification n WHERE n.title = :title"),
		@NamedQuery(name = "EntityNotification.findByContent", query = "SELECT n FROM EntityNotification n WHERE n.content = :content"),
		@NamedQuery(name = "EntityNotification.findByCreationDate", query = "SELECT n FROM EntityNotification n WHERE n.creationDate = :creationDate") })
public class EntityNotification implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "NOTIFICATION_ID")
	private Integer notificationId;
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 128)
	@Column(name = "TITLE")
	private String title;
	@Size(max = 512)
	@Column(name = "CONTENT")
	private String content;
	@Basic(optional = false)
	@NotNull
	@Column(name = "CREATION_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date creationDate;
	@JoinColumn(name = "RECIEVER_ID", referencedColumnName = "USER_ID")
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	private EntityUser recieverId;
	@JoinColumn(name = "SENDER_ID", referencedColumnName = "USER_ID")
	@ManyToOne(fetch = FetchType.EAGER)
	private EntityUser senderId;

	public EntityNotification() {
	}

	public EntityNotification(Integer notificationId) {
		this.notificationId = notificationId;
	}

	public EntityNotification(Integer notificationId, String title,
			Date creationDate) {
		this.notificationId = notificationId;
		this.title = title;
		this.creationDate = creationDate;
	}

	public Integer getNotificationId() {
		return notificationId;
	}

	public void setNotificationId(Integer notificationId) {
		this.notificationId = notificationId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public EntityUser getRecieverId() {
		return recieverId;
	}

	public void setRecieverId(EntityUser recieverId) {
		this.recieverId = recieverId;
	}

	public EntityUser getSenderId() {
		return senderId;
	}

	public void setSenderId(EntityUser senderId) {
		this.senderId = senderId;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (notificationId != null ? notificationId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof EntityNotification)) {
			return false;
		}
		EntityNotification other = (EntityNotification) object;
		if ((this.notificationId == null && other.notificationId != null)
				|| (this.notificationId != null && !this.notificationId
						.equals(other.notificationId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "ee.iati.ewes.dto.Notifications[ notificationId="
				+ notificationId + " ]";
	}

}
