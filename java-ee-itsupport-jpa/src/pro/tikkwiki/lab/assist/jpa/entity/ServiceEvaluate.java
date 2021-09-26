package pro.tikkwiki.lab.assist.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the svcevltbl database table.
 * 
 */
@Entity
@Table(name="svcevltbl")
@NamedQuery(name="ServiceLevel.findAll", query="SELECT s FROM ServiceEvaluate s")
public class ServiceEvaluate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer seid;

	private Timestamp elvon;

	private String evlby;

	private String mtrlgid;

	private String raid;

	public ServiceEvaluate() {
	}

	public Integer getSeid() {
		return this.seid;
	}

	public void setSeid(Integer seid) {
		this.seid = seid;
	}

	public Timestamp getElvon() {
		return this.elvon;
	}

	public void setElvon(Timestamp elvon) {
		this.elvon = elvon;
	}

	public String getEvlby() {
		return this.evlby;
	}

	public void setEvlby(String evlby) {
		this.evlby = evlby;
	}

	public String getMtrlgid() {
		return this.mtrlgid;
	}

	public void setMtrlgid(String mtrlgid) {
		this.mtrlgid = mtrlgid;
	}

	public String getRaid() {
		return this.raid;
	}

	public void setRaid(String raid) {
		this.raid = raid;
	}

}