package application;

import javafx.beans.property.SimpleStringProperty;

public class DataEntry {
	private SimpleStringProperty date;
	private SimpleStringProperty status;
	private SimpleStringProperty symptoms;
	
	public DataEntry(String date, String status, String symptoms) {
		this.date = new SimpleStringProperty(date);
		this.status = new SimpleStringProperty(status);
		this.symptoms = new SimpleStringProperty(symptoms);
	}

	public String getDate() {
		return date.get();
	}

	public void setDate(String date) {
		this.date = new SimpleStringProperty(date);
	}

	public String getStatus() {
		return status.get();
	}

	public void setStatus(String status) {
		this.status = new SimpleStringProperty(status);
	}

	public String getSymptoms() {
		return symptoms.get();
	}

	public void setSymptoms(String symptoms) {
		this.symptoms = new SimpleStringProperty(symptoms);
	}
	
}
