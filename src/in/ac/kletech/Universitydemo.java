package in.ac.kletech;

public class Universitydemo {

	public static void main(String[] args) {
		 
		college[] c=new college[2];
		//create object
		college p=new college();
		c[0]=new college("SDM",333,678,342);
		c[1]=new college("RV",34,786,333);
		p.maximumcolg(c);
		p.collegechecks(c);
		
		BVB kt=new BVB(27,"GBT5667YUYU",46,77,46);
		kt.displaysubjects();
		
		department[] d=new department[6];
		department r=new department();
		d[0]=new department(44,144,"CSE");
		d[1]=new department(57,45,"EC");
		d[2]=new department(76,11,"ROBOTICS");
		d[3]=new department(67,64,"MECHANICAL");
		d[4]=new department(55,34,"CIVIL");
		d[5]=new department(60,88,"EEE");
		System.out.println("In KLETECH college");
		r.verify(d);
		System.out.println("IN KLEIT college");
		r.verify1(d);

	}

}
