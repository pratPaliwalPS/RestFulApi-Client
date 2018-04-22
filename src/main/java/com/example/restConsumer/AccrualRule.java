package com.example.restConsumer;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AccrualRule implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long accrualRuleSeqNumber;
	private String contractingparty;
	private long contract;
	private String endUser;
	private Boolean status;
	private Boolean isdeleted;
	private String updatedBy;
	private Date updatedDate;
	
	
	public AccrualRule() {}
	
	   
	    public Long getAccrualRuleSeqNumber() {
		return accrualRuleSeqNumber;
	}


	public void setAccrualRuleSeqNumber(Long accrualRuleSeqNumber) {
		this.accrualRuleSeqNumber = accrualRuleSeqNumber;
	}


	public String getContractingparty() {
		return contractingparty;
	}


	public void setContractingparty(String contractingparty) {
		this.contractingparty = contractingparty;
	}


	public long getContract() {
		return contract;
	}


	public void setContract(long contract) {
		this.contract = contract;
	}


	public String getEndUser() {
		return endUser;
	}


	public void setEndUser(String endUser) {
		this.endUser = endUser;
	}


	public Boolean getStatus() {
		return status;
	}


	public void setStatus(Boolean status) {
		this.status = status;
	}


	public Boolean getIsdeleted() {
		return isdeleted;
	}


	public void setIsdeleted(Boolean isdeleted) {
		this.isdeleted = isdeleted;
	}


	public String getUpdatedBy() {
		return updatedBy;
	}


	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}


	public Date getUpdatedDate() {
		return updatedDate;
	}


	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public AccrualRule(long accrualRuleSeqNumber, String contractingparty, long contract, String endUser, Boolean status, Boolean isdeleted,
			String updatedBy, Date updatedDate) {
		
		this.accrualRuleSeqNumber =accrualRuleSeqNumber;
		this.contractingparty = contractingparty;
		this.contract = contract;
		this.endUser = endUser;
		this.status = status;
		this.isdeleted = isdeleted;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
	}

		@Override
	    public String toString() {
	        return "content{" +
	                "accrualRuleSeqNumber=" + accrualRuleSeqNumber +
	                ", contractingparty='" + contractingparty + '\'' +
	                ", contract='" + contract + '\'' +
	                  ", endUser='" + endUser + '\'' +
	                    ", status='" + status + '\'' +
	                      ", isdeleted='" + isdeleted + '\'' +
	                        ", updatedBy='" + updatedBy + '\'' +
	                          ", updatedDate='" + updatedDate + '\'' +
	                '}';
	    }

	}

