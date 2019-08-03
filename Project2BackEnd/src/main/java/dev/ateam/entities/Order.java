package dev.ateam.entities;

public class Order {

	private int orderId;
	private int qmId;
	private int	rId;
	private int aId;
	private int buildId;
	private String status;
	private String requestDetails;
	public Order(int orderId, int qmId, int rId, int aId, int buildId, String status, String requestDetails) {
		super();
		this.orderId = orderId;
		this.qmId = qmId;
		this.rId = rId;
		this.aId = aId;
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
