package pro.tikkwiki.lab.assist.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the svclgtbl database table.
 * 
 */
@Entity
@Table(name="svclgtbl")
@NamedQuery(name="ServiceLog.findAll", query="SELECT s FROM ServiceLog s")
public class ServiceLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String svclgid;

	private String mtrlgid;

	private String svcdetl;

	private String svctitl;

	public ServiceLog() {
	}

	public String getSvclgid() {
		return this.svclgid;
	}

	public void setSvclgid(String svclgid) {
		this.svclgid = svclgid;
	}

	public String getMtrlgid() {
		return this.mtrlgid;
	}

	public void setMtrlgid(String mtrlgid) {
		this.mtrlgid = mtrlgid;
	}

	public String getSvcdetl() {
		return this.svcdetl;
	}

	public void setSvcdetl(String svcdetl) {
		this.svcdetl = svcdetl;
	}

	public String getSvctitl() {
		return this.svctitl;
	}

	public void setSvctitl(String svctitl) {
		this.svctitl = svctitl;
	}

}