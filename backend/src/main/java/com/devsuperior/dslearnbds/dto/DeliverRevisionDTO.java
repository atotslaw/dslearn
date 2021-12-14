package com.devsuperior.dslearnbds.dto;

import java.io.Serializable;

import com.devsuperior.dslearnbds.entities.Deliver;
import com.devsuperior.dslearnbds.entities.enums.DeliverStatus;

public class DeliverRevisionDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private DeliverStatus status;
	private String feedback;
	private Integer correcCount;

	public DeliverRevisionDTO() {
	}

	public DeliverRevisionDTO(DeliverStatus status, String feedback, Integer correcCount) {
		this.status = status;
		this.feedback = feedback;
		this.correcCount = correcCount;
	}

	public DeliverRevisionDTO(Deliver entity) {
		status = entity.getStatus();
		feedback = entity.getFeedback();
		correcCount = entity.getCorrectCount();
	}

	public DeliverStatus getStatus() {
		return status;
	}

	public void setStatus(DeliverStatus status) {
		this.status = status;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public Integer getCorrecCount() {
		return correcCount;
	}

	public void setCorrecCount(Integer correcCount) {
		this.correcCount = correcCount;
	}
	
}
