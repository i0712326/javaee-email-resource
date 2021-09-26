package pro.tikkwiki.lab.assist.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the const_lgstat_tbl database table.
 * 
 */
@Entity
@Table(name="const_lgstat_tbl")
@NamedQuery(name="LogStatus.findAll", query="SELECT l FROM LogStatus l")
public class LogStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String statid;

	private String statcd;

	private String statde;

	public LogStatus() {
	}

	public String getStatid() {
		return this.statid;
	}

	public void setStatid(String statid) {
		this.statid = statid;
	}

	public String getStatcd() {
		return this.statcd;
	}

	public void setStatcd(String statcd) {
		this.statcd = statcd;
	}

	public String getStatde() {
		return this.statde;
	}

	public void setStatde(String statde) {
		this.statde = statde;
	}

}