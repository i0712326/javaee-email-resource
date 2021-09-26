package pro.tikkwiki.lab.assist.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the const_svcraid_tbl database table.
 * 
 */
@Entity
@Table(name="const_svcraid_tbl")
@NamedQuery(name="ServiceRaid.findAll", query="SELECT s FROM ServiceRaid s")
public class ServiceRaid implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer svrid;

	private String svraid;

	private String svrdst;

	public ServiceRaid() {
	}

	public Integer getSvrid() {
		return this.svrid;
	}

	public void setSvrid(Integer svrid) {
		this.svrid = svrid;
	}

	public String getSvraid() {
		return this.svraid;
	}

	public void setSvraid(String svraid) {
		this.svraid = svraid;
	}

	public String getSvrdst() {
		return this.svrdst;
	}

	public void setSvrdst(String svrdst) {
		this.svrdst = svrdst;
	}

}