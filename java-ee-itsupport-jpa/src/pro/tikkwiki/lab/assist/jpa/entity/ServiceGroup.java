package pro.tikkwiki.lab.assist.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the const_svcgrp_tbl database table.
 * 
 */
@Entity
@Table(name="const_svcgrp_tbl")
@NamedQuery(name="ServiceGroup.findAll", query="SELECT s FROM ServiceGroup s")
public class ServiceGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String svcgrpid;

	private String grpdst;

	private String grpname;

	public ServiceGroup() {
	}

	public String getSvcgrpid() {
		return this.svcgrpid;
	}

	public void setSvcgrpid(String svcgrpid) {
		this.svcgrpid = svcgrpid;
	}

	public String getGrpdst() {
		return this.grpdst;
	}

	public void setGrpdst(String grpdst) {
		this.grpdst = grpdst;
	}

	public String getGrpname() {
		return this.grpname;
	}

	public void setGrpname(String grpname) {
		this.grpname = grpname;
	}

}