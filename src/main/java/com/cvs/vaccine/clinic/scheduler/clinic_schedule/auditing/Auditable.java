package com.cvs.vaccine.clinic.scheduler.clinic_schedule.auditing;

import static javax.persistence.TemporalType.TIMESTAMP;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

// Moving necessary fields to super class and providing AuditingEntityListener entity listner class

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class Auditable<U> {

    @CreatedBy
    @Column(columnDefinition = "VARCHAR(255) NOT NULL")
    protected U zMetaCreatedBy;

    @CreatedDate
    @Temporal(TIMESTAMP)
    @Column(columnDefinition = "datetime NOT NULL DEFAULT CURRENT_TIMESTAMP", updatable = false)
    protected Date zMetaCreatedDate;

    @LastModifiedBy
    @Column(columnDefinition = "VARCHAR(255) NOT NULL")
    protected U zMetaLastModifiedBy;

    @LastModifiedDate
    @Temporal(TIMESTAMP)
    @Column(columnDefinition = "datetime NOT NULL")
    protected Date zMetaLastModifiedDate;

	public U getzMetaCreatedBy() {
		return zMetaCreatedBy;
	}

	public void setzMetaCreatedBy(U zMetaCreatedBy) {
		this.zMetaCreatedBy = zMetaCreatedBy;
	}

	public Date getzMetaCreatedDate() {
		return zMetaCreatedDate;
	}

	public void setzMetaCreatedDate(Date zMetaCreatedDate) {
		this.zMetaCreatedDate = zMetaCreatedDate;
	}

	public U getzMetaLastModifiedBy() {
		return zMetaLastModifiedBy;
	}

	public void setzMetaLastModifiedBy(U zMetaLastModifiedBy) {
		this.zMetaLastModifiedBy = zMetaLastModifiedBy;
	}

	public Date getzMetaLastModifiedDate() {
		return zMetaLastModifiedDate;
	}

	public void setzMetaLastModifiedDate(Date zMetaLastModifiedDate) {
		this.zMetaLastModifiedDate = zMetaLastModifiedDate;
	}
    
    
    
}

