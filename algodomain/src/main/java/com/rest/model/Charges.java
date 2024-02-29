package com.rest.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Charges {
	

private double gst;
private double deliverycharge;
public Charges() {
	super();
	
}
public Charges(double gst, double deliverycharge) {
	super();
	this.gst = gst;
	this.deliverycharge = deliverycharge;
}
public double getGst() {
	return gst;
}
public void setGst(double gst) {
	this.gst = gst;
}
public double getDeliverycharge() {
	return deliverycharge;
}
public void setDeliverycharge(double deliverycharge) {
	this.deliverycharge = deliverycharge;
}
@Override
public String toString() {
	return "Charges [gst=" + gst + ", deliverycharge=" + deliverycharge + "]";
}


}