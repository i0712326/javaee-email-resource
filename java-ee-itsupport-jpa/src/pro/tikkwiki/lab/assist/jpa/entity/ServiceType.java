package pro.tikkwiki.lab.assist.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the const_svctyp_tbl database table.
 * 
 */
@Entity
@Table(name="const_svctyp_tbl")
@NamedQuery(name="ServiceType.findAll", query="SELECT s FROM ServiceType s")
public class ServiceType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String svcid;

	private String svcgrpid;

	private String svcname;

	public ServiceType() {
	}

	public String getSvcid() {
		return this.svcid;
	}

	public void setSvcid(String svcid) {
		this.svcid = svcid;
	}

	public String getSvcgrpid() {
		return this.svcgrpid;
	}

	public void setSvcgrpid(String svcgrpid) {
		this.svcgrpid = svcgrpid;
	}

	public String getSvcname() {
		return this.svcname;
	}

	public void setSvcname(String svcname) {
		this.svcname = svcname;
	}

}