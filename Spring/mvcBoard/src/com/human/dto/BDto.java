package com.human.dto;

import java.sql.Date;

public class BDto {
	private int bID;
	private String bName,bTitle,bContent;
	private Date bDate;
	private int bHit,bGroup,bStep,bIndent;
	
	public BDto() {}
	public BDto(int bID, String bName, String bTitle, String bContent, Date bDate, int bHit, int bGroup, int bStep,
			int bIndent) {
		super();
		this.bID = bID;
		this.bName = bName;
		this.bTitle = bTitle;
		this.bContent = bContent;
		this.bDate = bDate;
		this.bHit = bHit;
		this.bGroup = bGroup;
		this.bStep = bStep;
		this.bIndent = bIndent;
	}
	
	@Override
	public String toString() {
		return "BDto [bID=" + bID + ", bName=" + bName + ", bTitle=" + bTitle + ", bContent=" + bContent + ", bDate="
				+ bDate + ", bHit=" + bHit + ", bGroup=" + bGroup + ", bStep=" + bStep + ", bIndent=" + bIndent + "]";
	}

	public int getbID() {
		return bID;
	}
	public void setbID(int bID) {
		this.bID = bID;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public String getbTitle() {
		return bTitle;
	}
	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}
	public String getbContent() {
		return bContent;
	}
	public void setbContent(String bContent) {
		this.bContent = bContent;
	}
	public Date getbDate() {
		return bDate;
	}
	public void setbDate(Date bDate) {
		this.bDate = bDate;
	}
	public int getbHit() {
		return bHit;
	}
	public void setbHit(int bHit) {
		this.bHit = bHit;
	}
	public int getbGroup() {
		return bGroup;
	}
	public void setbGroup(int bGroup) {
		this.bGroup = bGroup;
	}
	public int getbStep() {
		return bStep;
	}
	public void setbStep(int bStep) {
		this.bStep = bStep;
	}
	public int getbIndent() {
		return bIndent;
	}
	public void setbIndent(int bIndent) {
		this.bIndent = bIndent;
	}
	
	
	
	
	
	
}
