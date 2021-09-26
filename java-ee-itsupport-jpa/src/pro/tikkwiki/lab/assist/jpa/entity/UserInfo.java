package pro.tikkwiki.lab.assist.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the userinfotbl database table.
 * 
 */
@Entity
@Table(name="userinfotbl")
@NamedQuery(name="UserInfo.findAll", query="SELECT u FROM UserInfo u")
public class UserInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer uiid;

	private Timestamp actionby;

	private String actionon;

	private String adgrp;

	private String attachement;

	private String email;

	private String emailgrp;

	private String ipphonecode;

	private String ipphonegrp;

	private String ipphoneno;

	private Integer lgid;

	private String loginid;

	private String loginname;

	private String mtrlgid;

	private String printercode;

	private String remark;

	private String sharefile;

	private String status;

	private String verifyby;

	private Timestamp verifyon;

	private String voicerec;

	private String voicerecgrp;

	private String wiseaccount;

	private String wiseuam;

	public UserInfo() {
	}

	public Integer getUiid() {
		return this.uiid;
	}

	public void setUiid(Integer uiid) {
		this.uiid = uiid;
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

	public String getAdgrp() {
		return this.adgrp;
	}

	public void setAdgrp(String adgrp) {
		this.adgrp = adgrp;
	}

	public String getAttachement() {
		return this.attachement;
	}

	public void setAttachement(String attachement) {
		this.attachement = attachement;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmailgrp() {
		return this.emailgrp;
	}

	public void setEmailgrp(String emailgrp) {
		this.emailgrp = emailgrp;
	}

	public String getIpphonecode() {
		return this.ipphonecode;
	}

	public void setIpphonecode(String ipphonecode) {
		this.ipphonecode = ipphonecode;
	}

	public String getIpphonegrp() {
		return this.ipphonegrp;
	}

	public void setIpphonegrp(String ipphonegrp) {
		this.ipphonegrp = ipphonegrp;
	}

	public String getIpphoneno() {
		return this.ipphoneno;
	}

	public void setIpphoneno(String ipphoneno) {
		this.ipphoneno = ipphoneno;
	}

	public Integer getLgid() {
		return this.lgid;
	}

	public void setLgid(Integer lgid) {
		this.lgid = lgid;
	}

	public String getLoginid() {
		return this.loginid;
	}

	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}

	public String getLoginname() {
		return this.loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getMtrlgid() {
		return this.mtrlgid;
	}

	public void setMtrlgid(String mtrlgid) {
		this.mtrlgid = mtrlgid;
	}

	public String getPrintercode() {
		return this.printercode;
	}

	public void setPrintercode(String printercode) {
		this.printercode = printercode;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSharefile() {
		return this.sharefile;
	}

	public void setSharefile(String sharefile) {
		this.sharefile = sharefile;
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

	public String getVoicerec() {
		return this.voicerec;
	}

	public void setVoicerec(String voicerec) {
		this.voicerec = voicerec;
	}

	public String getVoicerecgrp() {
		return this.voicerecgrp;
	}

	public void setVoicerecgrp(String voicerecgrp) {
		this.voicerecgrp = voicerecgrp;
	}

	public String getWiseaccount() {
		return this.wiseaccount;
	}

	public void setWiseaccount(String wiseaccount) {
		this.wiseaccount = wiseaccount;
	}

	public String getWiseuam() {
		return this.wiseuam;
	}

	public void setWiseuam(String wiseuam) {
		this.wiseuam = wiseuam;
	}

}