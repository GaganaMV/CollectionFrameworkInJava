package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Learner{
	int lno;
	String lname,ldegree;
	public Learner(int lno, String lname, String ldegree) {
		super();
		this.lno = lno;
		this.lname = lname;
		this.ldegree = ldegree;
	}
	@Override
	public String toString() {
		return "Learner [lno=" + lno + ", lname=" + lname + ", ldegree=" + ldegree + "]";
	}
	
	
}

public class CurdOpertionMenuDriven {

	public static void main(String[] args) {
		ArrayList<Learner> l=new ArrayList<Learner>();
		Scanner sc=new Scanner(System.in);
		
		int choice;
		do {
			System.out.println("1.Insert Data");
			System.out.println("2.Display Data");
			System.out.println("3.Detele Data");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.print("Enter lno");
			    int lno=sc.nextInt();
			    
			    System.out.print("Enter lname");
			    String lname=sc.next();
			    

			    System.out.print("Enter ldegree");
			    String ldegree=sc.next();
			
				l.add(new Learner(lno, lname, ldegree));
				break;
				
				
			case 2:
				Iterator<Learner> i=l.iterator();
				while(i.hasNext()) {
					
				Learner le=i.next();
				System.out.println(le);
			}
						
			case 3:
				boolean found = false;
                System.out.print("Enter lno to Search : ");
                 lno = sc.nextInt();
                
               Iterator<Learner> i1 = l.iterator();
                while (i1.hasNext()) {
                    Learner e = i1.next();
                    if (e.g() == lno) {
                        System.out.println(e);
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("Record Not Found");
                }
                
			case 4:
				boolean found = false;
                System.out.print("Enter Lno to Update : ");
               lno = sc.nextInt();
              Iterator < Learner > li = al.Iterator();
                while (li.hasNext()) {
                   Learner e = li.next();
                    if (e.getLno() == lno) {
                        System.out.print("Enter new Name : ");
                        lname = s1.nextLine();
                        System.out.print("Enter new degree : ");
                        ldegree = s.nextInt();
                        li.set(new Learner(lno, lname, ldegree));
                        found = true;
                    }
                }
                
                if (!found) {
                    System.out.println("Record Not Found");
                } 
                else {
                    System.out.println("Record is Updated Sucessfully");
                }
			}
		}while(choice!=0);
		
			
}	
	
}
