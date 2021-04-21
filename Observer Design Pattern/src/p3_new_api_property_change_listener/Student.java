package p3_new_api_property_change_listener;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Student {

	private Record record;
	private PropertyChangeSupport support;
	
	public Student() {
		support = new PropertyChangeSupport(this); // make this object an observable
	}
	
	public void addPropertyChangeListener(PropertyChangeListener pcl) {
		support.addPropertyChangeListener(pcl);
	}
	
	public void removePropertyChangeListener(PropertyChangeListener pcl) {
		support.removePropertyChangeListener(pcl);
	}
	
	public Record getRecord() {
		return record;
	}
	
	public void setRecord(Record record) {
		support.firePropertyChange("Student Record", this.record, record);
		this.record = record;
	}
}
