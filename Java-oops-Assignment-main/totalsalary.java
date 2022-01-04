class employee
   {
	int salary;
	int total()
   {
	return 0;
	}
   }	
class man extends employee
     {

          int incentive;	
          int total()
     {
			
        return salary+incentive;
     }
			
	}
class lab extends employee{

         int over;
	 int total( ) 
      {
         return salary+over;
		}
	}

public class totalsalary
      {
	public static void main(String args[]){ 
	man manager = new man();
	lab labour = new lab();

manager.salary = 10000;
manager.incentive = 2000;
labour.salary= 15000;
labour.over=1000;

int Total;
Total=manager.total() +labour.total();
System.out.println (Total);
		
		
	}
}
