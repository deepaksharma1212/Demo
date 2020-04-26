import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Primitive {
	public static void main(String[] args)
	{
		//INPUT [uncomment & modify if required]
		int DD,MM,YYYY;	
				
		Scanner sc=new Scanner(System.in);
		
		DD=sc.nextInt();
		MM=sc.nextInt();
		YYYY=sc.nextInt();
		int ij= 0;
		int aa = ++ij;
        sc.close();
        
        LocalDate date = LocalDate.of(YYYY, MM,DD);
        LocalDate date2 = date.minusDays(1);
        System.out.println(date);
        System.out.println(date2.format(DateTimeFormatter.ofPattern("d M yyyy")));
        

	}
}

class DemoThread extends Thread{
	public DemoThread(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			if(i==2 && "A1".equals(Thread.currentThread().getName())) {
				
			}
			System.out.println(Thread.currentThread().getName()+ " "+ i);
		}
	}
}
