package pro.tikkwiki.lab.assist.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the mtrlgtbl database table.
 * 
 */
@Entity
@Table(name="mtrlgtbl")
@NamedQuery(name="MasterLog.findAll", query="SELECT m FROM MasterLog m")
public class MasterLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String mtrlgid;

	private Timestamp aaprvon;

	private String apprvby;

	private String attachment;

	private String createby;

	private Timestamp createon;

	private String entid;

	private String itapprvby;

	private Timestamp itapprvon;

	private Integer prctime;

	private String state;

	private String svcid;

	private Timestamp updatedate;

	public MasterLog() {
	}

	public String getMtrlgid() {
		return this.mtrlgid;
	}

	public void setMtrlgid(String mtrlgid) {
		this.mtrlgid = mtrlgid;
	}

	public Timestamp getAaprvon() {
		return this.aaprvon;
	}

	public void setAaprvon(Timestamp aaprvon) {
		this.aaprvon = aaprvon;
	}

	public String getApprvby() {
		return this.apprvby;
	}

	public void setApprvby(String apprvby) {
		this.apprvby = apprvby;
	}

	public String getAttachment() {
		return this.attachment;
	}

	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}

	public String getCreateby() {
		return this.createby;
	}

	public void setCreateby(String createby) {
		this.createby = createby;
	}

	public Timestamp getCreateon() {
		return this.createon;
	}

	public void setCreateon(Timestamp createon) {
		this.createon = createon;
	}

	public String getEntid() {
		return this.entid;
	}

	public void setEntid(String entid) {
		this.entid = entid;
	}

	public String getItapprvby() {
		return this.itapprvby;
	}

	public void setItapprvby(String itapprvby) {
		this.itapprvby = itapprvby;
	}

	public Timestamp getItapprvon() {
		return this.itapprvon;
	}

	public void setItapprvon(Timestamp itapprvon) {
		this.itapprvon = itapprvon;
	}

	public Integer getPrctime() {
		return this.prctime;
	}

	public void setPrctime(Integer prctime) {
		this.prctime = prctime;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getSvcid() {
		return this.svcid;
	}

	public void setSvcid(String svcid) {
		this.svcid = svcid;
	}

	public Timestamp getUpdatedate() {
		return this.updatedate;
	}

	public void setUpdatedate(Timestamp updatedate) {
		this.updatedate = updatedate;
	}

}