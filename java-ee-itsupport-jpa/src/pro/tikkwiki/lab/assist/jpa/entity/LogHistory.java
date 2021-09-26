package pro.tikkwiki.lab.assist.jpa.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the lghisttbl database table.
 * 
 */
@Entity
@Table(name="lghisttbl")
@NamedQuery(name="LogHistory.findAll", query="SELECT l FROM LogHistory l")
public class LogHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer lgid;

	private Timestamp actionby;

	private String actionon;

	private String attachement;

	private String mtrlgid;

	private String remark;

	private String status;

	private String verifyby;

	private Timestamp verifyon;

	public LogHistory() {
	}

	public Integer getLgid() {
		return this.lgid;
	}

	public void setLgid(Integer lgid) {
		this.lgid = lgid;
	}

	public Timestamp getActionby() {
		return this.actionby;
	}

	public void setActionby(Timestamp actionby) {
		this.actionby = actionby;
	}

	public String getActionon() {
		return this.actionon;
	}

	public void setActionon(String actionon) {
		this.actionon = actionon;
	}

	public String getAttachement() {
		return this.attachement;
	}

	public void setAttachement(String attachement) {
		this.attachement = attachement;
	}

	public String getMtrlgid() {
		return this.mtrlgid;
	}

	public void setMtrlgid(String mtrlgid) {
		this.mtrlgid = mtrlgid;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getVerifyby() {
		return this.verifyby;
	}

	public void setVerifyby(String verifyby) {
		this.verifyby = verifyby;
	}

	public Timestamp getVerifyon() {
		return this.verifyon;
	}

	public void setVerifyon(Timestamp verifyon) {
		this.verifyon = verifyon;
	}

}