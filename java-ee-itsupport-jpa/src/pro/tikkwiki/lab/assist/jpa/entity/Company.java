package pro.tikkwiki.lab.assist.jpa.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;



/**
 * The persistent class for the const_ent_tbl database table.
 * 
 */
@Entity
@Table(name="const_ent_tbl")
@NamedQueries({
	@NamedQuery(name="Company.findAll", query="SELECT c FROM Company c"),
	@NamedQuery(name="Company.findSingle", query="SELECT c FROM Company c where c.entid = :entid"),
})
public class Company implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String entid;

	private String entcd;

	private String entname;

	public Company() {
	}

	public String getEntid() {
		return this.entid;
	}

	public void setEntid(String entid) {
		this.entid = entid;
	}

	public String getEntcd() {
		return this.entcd;
	}

	public void setEntcd(String entcd) {
		this.entcd = entcd;
	}

	public String getEntname() {
		return this.entname;
	}

	public void setEntname(String entname) {
		this.entname = entname;
	}

}