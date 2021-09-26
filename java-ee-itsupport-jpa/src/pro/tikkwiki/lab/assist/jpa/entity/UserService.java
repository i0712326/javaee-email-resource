package pro.tikkwiki.lab.assist.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the usrsvclgtbl database table.
 * 
 */
@Entity
@Table(name="usrsvclgtbl")
@NamedQuery(name="UserService.findAll", query="SELECT u FROM UserService u")
public class UserService implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer uslid;

	private String branch;

	private String mtrlgid;

	private String svcdetl;

	private String svclgid;

	private String svctitl;

	private String usrdpm;

	private String usrid;

	private String usrlevl;

	private String usrname;

	private String usrrole;

	public UserService() {
	}

	public Integer getUslid() {
		return this.uslid;
	}

	public void setUslid(Integer uslid) {
		this.uslid = uslid;
	}

	public String getBranch() {
		return this.branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
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

	public String getSvclgid() {
		return this.svclgid;
	}

	public void setSvclgid(String svclgid) {
		this.svclgid = svclgid;
	}

	public String getSvctitl() {
		return this.svctitl;
	}

	public void setSvctitl(String svctitl) {
		this.svctitl = svctitl;
	}

	public String getUsrdpm() {
		return this.usrdpm;
	}

	public void setUsrdpm(String usrdpm) {
		this.usrdpm = usrdpm;
	}

	public String getUsrid() {
		return this.usrid;
	}

	public void setUsrid(String usrid) {
		this.usrid = usrid;
	}

	public String getUsrlevl() {
		return this.usrlevl;
	}

	public void setUsrlevl(String usrlevl) {
		this.usrlevl = usrlevl;
	}

	public String getUsrname() {
		return this.usrname;
	}

	public void setUsrname(String usrname) {
		this.usrname = usrname;
	}

	public String getUsrrole() {
		return this.usrrole;
	}

	public void setUsrrole(String usrrole) {
		this.usrrole = usrrole;
	}

}