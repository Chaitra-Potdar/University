package in.ac.kletech;

public interface University {
  void verify(department[] d);
  
}
  interface UGC{
	  void maximumcolg(college[] c);
  }
  //implementing interface
   class college implements UGC{
	   String sname;
	   int icode;
	   int nooffaculty;
	   int noofstu;
	   public college(String sname,int icode,int nooffaculty,int noofstu){
		   super();
		   this.sname=sname;
		   this.icode=icode;
		   this.nooffaculty=nooffaculty;
		   this.noofstu=noofstu;
	   }
	   public college(){
		   //constructor body
	   }
	    public void maximumcolg(college[] c)
	    {
	    	if(c.length>4)
	    		System.out.println("max colleges exceeded the limit\n");
	    	else
	    	   System.out.println("number of colleges within the limit\n");
	    }
	      public void collegechecks(college[] c1){
	    	  System.out.println("colleges under university\n");
	    	  for(int i=0;i<2;i++)
	    	  {
	    		 System.out.println("college name:"+c1[i].sname);
	    	  }
	      }
   }
    class BVB extends college{    //body of a class
    	 int icode;
    	 String sname;
    	 int nooffaculty;
    	 int noofstu;
    	 int noofsub;
    	 BVB(int icode,String sname,int nooffaculty,int noofstu,int noofsub){
    		 super();
    		 this.noofsub=noofsub;
    	 }
    	 public void displaysubjects(){    //method body
    		 System.out.println("number of subjects intake is"+noofsub);
    	 }
    }
     class department implements University
     {
    	final String s="Both colleges have same";    //final variable
    	 int inoofstud;
    	 int inooffaculties;
    	 String sdepartmentname;
    	 public department(int inoofstud,int inooffaculties,String sdepartmentname){   //constructor body
    		 super();
    		 this.inoofstud=inoofstud;
    		 this.inooffaculties=inooffaculties;
    		 this.sdepartmentname=sdepartmentname;
    	 }
    	  public department(){ 
    	  }
    	  
    	  public void verify (department[] d){
    		  int j;
    		  System.out.println("department intake checks\n");
    		  for(j=0;j<d.length;j++)
    		  {
    			  if(d[j].inoofstud>80)
    				  System.out.println("department"+d[j].sdepartmentname+"has exceeded max syudents limits with"+d[j].inoofstud);
    		  }
    	  }
    	   public void verify1(department[] d){
    		   int j;
    		   System.out.println("faculties check\n");
    		    for(j=0;j<d.length;j++)
    		    {
    		    	if(d[j].inooffaculties>40)
    		    		System.out.println("department"+d[j].sdepartmentname+"hs exceeded max faculties limits with"+d[j].inooffaculties);
    		    }
    	   }
     }
