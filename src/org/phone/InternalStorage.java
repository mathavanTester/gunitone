package org.phone;

public class InternalStorage {
public void processName() {
	System.out.println("process name intel");
}
public void ramSize() {
	System.out.println("rame size 8gp");
	
}
public static void main(String[] args)
{
	InternalStorage b=new InternalStorage();
	b.processName();
	b.ramSize();
	
	ExternalStorage a= new ExternalStorage();
	a.size();
}
}
