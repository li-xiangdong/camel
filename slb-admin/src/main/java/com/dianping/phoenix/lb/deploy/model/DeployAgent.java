package com.dianping.phoenix.lb.deploy.model;

import java.io.Serializable;
import java.util.Date;

public class DeployAgent implements Serializable {
	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database table deploy_agent
	 *
	 * @mbggenerated
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column deploy_agent.id
	 *
	 * @mbggenerated
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column deploy_agent.deploy_vs_id
	 *
	 * @mbggenerated
	 */
	private Long deployVsId;
	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column deploy_agent.ip_address
	 *
	 * @mbggenerated
	 */
	private String ipAddress;
	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column deploy_agent.status
	 *
	 * @mbggenerated
	 */
	private DeployAgentStatus status;
	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column deploy_agent.begin_date
	 *
	 * @mbggenerated
	 */
	private Date beginDate;
	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column deploy_agent.end_date
	 *
	 * @mbggenerated
	 */
	private Date endDate;
	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column deploy_agent.creation_date
	 *
	 * @mbggenerated
	 */
	private Date creationDate;
	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column deploy_agent.last_modified_date
	 *
	 * @mbggenerated
	 */
	private Date lastModifiedDate;
	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column deploy_agent.raw_log
	 *
	 * @mbggenerated
	 */
	private String rawLog;

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column deploy_agent.id
	 *
	 * @return the value of deploy_agent.id
	 * @mbggenerated
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column deploy_agent.id
	 *
	 * @param id the value for deploy_agent.id
	 * @mbggenerated
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column deploy_agent.deploy_vs_id
	 *
	 * @return the value of deploy_agent.deploy_vs_id
	 * @mbggenerated
	 */
	public Long getDeployVsId() {
		return deployVsId;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column deploy_agent.deploy_vs_id
	 *
	 * @param deployVsId the value for deploy_agent.deploy_vs_id
	 * @mbggenerated
	 */
	public void setDeployVsId(Long deployVsId) {
		this.deployVsId = deployVsId;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column deploy_agent.ip_address
	 *
	 * @return the value of deploy_agent.ip_address
	 * @mbggenerated
	 */
	public String getIpAddress() {
		return ipAddress;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column deploy_agent.ip_address
	 *
	 * @param ipAddress the value for deploy_agent.ip_address
	 * @mbggenerated
	 */
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress == null ? null : ipAddress.trim();
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column deploy_agent.status
	 *
	 * @return the value of deploy_agent.status
	 * @mbggenerated
	 */
	public DeployAgentStatus getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column deploy_agent.status
	 *
	 * @param status the value for deploy_agent.status
	 * @mbggenerated
	 */
	public void setStatus(DeployAgentStatus status) {
		this.status = status;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column deploy_agent.begin_date
	 *
	 * @return the value of deploy_agent.begin_date
	 * @mbggenerated
	 */
	public Date getBeginDate() {
		return beginDate;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column deploy_agent.begin_date
	 *
	 * @param beginDate the value for deploy_agent.begin_date
	 * @mbggenerated
	 */
	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column deploy_agent.end_date
	 *
	 * @return the value of deploy_agent.end_date
	 * @mbggenerated
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column deploy_agent.end_date
	 *
	 * @param endDate the value for deploy_agent.end_date
	 * @mbggenerated
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column deploy_agent.creation_date
	 *
	 * @return the value of deploy_agent.creation_date
	 * @mbggenerated
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column deploy_agent.creation_date
	 *
	 * @param creationDate the value for deploy_agent.creation_date
	 * @mbggenerated
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column deploy_agent.last_modified_date
	 *
	 * @return the value of deploy_agent.last_modified_date
	 * @mbggenerated
	 */
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column deploy_agent.last_modified_date
	 *
	 * @param lastModifiedDate the value for deploy_agent.last_modified_date
	 * @mbggenerated
	 */
	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column deploy_agent.raw_log
	 *
	 * @return the value of deploy_agent.raw_log
	 * @mbggenerated
	 */
	public String getRawLog() {
		return rawLog;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column deploy_agent.raw_log
	 *
	 * @param rawLog the value for deploy_agent.raw_log
	 * @mbggenerated
	 */
	public void setRawLog(String rawLog) {
		this.rawLog = rawLog == null ? null : rawLog.trim();
	}
}