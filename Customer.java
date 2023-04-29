import java.util.Scanner;

public class Customer {
    int no;
    String name;
    String BookingNo;
    int nod,type,ld,d;
    boolean status;

    Customer () {
        no=-1;
        name=null;
        BookingNo=null;
        nod=type=ld=d=-1;
        status=false;
    }

    public void setInitialDetails (int c) {
        no=c;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name");
        name = in.nextLine();
        System.out.println("""
                Enter room type?
                 1 for Luxury => 500$,
                 2 for Deluxe => 1000$,
                 3 for SuperDeluxe => 1500$""");
        type = in.nextInt();
        System.out.println("Single Room (1) or Double Room (2) ? ");
        ld = in.nextInt();
        System.out.println("Enter number of days ?");
        d = in.nextInt();
    }

    public void setBookingNo (String b) {
        BookingNo=b;
    }
}
