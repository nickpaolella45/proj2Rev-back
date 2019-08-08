package dev.ateam.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "computer_order")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="order_id")
	private int orderId;
	
	@Column(name="quartermaster_id")
	private int qmId;
	
	@Column(name="requester_id")
	private int	rId;
	
	@Column(name="assembler_id")
	private int aId;
	
	@Column(name="build_id")
	private int buildId;
	
	@Column(name="requester_id")
	@NotNull(message = "Status can't be null")
	private String status;
	
	@Column(name="request_details")
	@NotNull(message = "Request details can't be null")
	private String requestDetails;
	
	
	public Order(int orderId, int qmId, int rId, int aId, int buildId, String status, String requestDetails) {
		super();
		this.orderId = orderId;
		this.qmId = qmId; //Quartermaster ID
		this.rId = rId; //Requester ID
		this.aId = aId; // Assembler ID
		this.buildId = buildId;
		this.status = status;
		this.requestDetails = requestDetails;
	}
	public Order() {
		super();
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getQmId() {
		return qmId;
	}
	public void setQmId(int qmId) {
		this.qmId = qmId;
	}
	public int getrId() {
		return rId;
	}
	public void setrId(int rId) {
		this.rId = rId;
	}
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public int getBuildId() {
		return buildId;
	}
	public void setBuildId(int buildId) {
		this.buildId = buildId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRequestDetails() {
		return requestDetails;
	}
	public void setRequestDetails(String requestDetails) {
		this.requestDetails = requestDetails;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", qmId=" + qmId + ", rId=" + rId + ", aId=" + aId + ", buildId=" + buildId
				+ ", status=" + status + ", requestDetails=" + requestDetails + "]";
	}
	
}
