import java.util.Scanner;
public class AMS {
public static void main(String [] args) {
Scanner id=new Scanner(System.in);

System.out.print("Anda Siapa = ");

String nama=id.nextLine();
int no_ktp;

switch(nama){
	
	case "muhaji" :
	System.out.println("lanjutkan masukkan ktp anda");
	System.out.print("no ktp = ");
	no_ktp=id.nextInt();
		
		switch(no_ktp){
	
		case 123 :
		System.out.println("pintu terbuka");
		break;
		default:
		System.out.println("data yang masukkan salah");
		break;

		//close switch
	}
	break;
	
	case "ascarina" :
	System.out.println("lanjutkan masukkan ktp anda");
	System.out.print("no ktp = ");
	no_ktp=id.nextInt();
		
		switch(no_ktp){
	
		case 456 :
		System.out.println("pintu terbuka");
		break;
		default:
		System.out.println("data yang masukkan salah");
		break;

		//close switch
	}
	break;

	case "rinto" :
	System.out.println("lanjutkan masukkan ktp anda");
	System.out.print("no ktp = ");
	no_ktp=id.nextInt();
		
		switch(no_ktp){
	
		case 789 :
		System.out.println("pintu terbuka");
		break;
		default:
		System.out.println("data yang masukkan salah");
		break;

		//close switch
	}
	break;
	
	case "rini" :
	System.out.println("lanjutkan masukkan ktp anda");
	System.out.print("no ktp = ");
	no_ktp=id.nextInt();
		
		switch(no_ktp){
	
		case 012 :
		System.out.println("pintu terbuka");
		break;
		default:
		System.out.println("data yang masukkan salah");
		break;

		//close switch
	}
	break;
	
	default:
	System.out.println("coba ulangi lagi");
	break;

//close switch
}
}
}

