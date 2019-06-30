package com;

public class Insurance {
String Policy_no;
int Cost_of_policy;
String Date_of_expiry;
String doa;
String dod;
String name;


public Insurance(String Policy_no,int Cost_of_policy,String Date_of_expiry,String doa,String dod,String name) {
	this.Policy_no=Policy_no;
	this.Cost_of_policy=Cost_of_policy;
			this.Date_of_expiry=Date_of_expiry;
			this.doa=doa;
			this.dod=dod;
			this.name=name;
}


public String getPolicy_no() {
	return Policy_no;
}


public void setPolicy_no(String Policy_no) {
	this.Policy_no = Policy_no;
}


public int getCost_of_policy() {
	return Cost_of_policy;
}


public void setCost_of_policy(int Cost_of_policy) {
	this.Cost_of_policy = Cost_of_policy;
}


public String getDate_of_expiry() {
	return Date_of_expiry;
}


public void setDate_of_expiry(String Date_of_expiry) {
	this.Date_of_expiry = Date_of_expiry;
}


public String getDoa() {
	return doa;
}


public void setDoa(String doa) {
	this.doa = doa;
}


public String getDod() {
	return dod;
}


public void setDod(String dod) {
	this.dod = dod;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}

}
