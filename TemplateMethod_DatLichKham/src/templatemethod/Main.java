
package templatemethod;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n================================");
            System.out.println("   HE THONG DAT LICH KHAM");
            System.out.println("================================");
            System.out.println("1. Dat lich kham truc tiep");
            System.out.println("2. Dat lich tu van truc tuyen");
            System.out.println("0. Thoat chuong trinh");
            System.out.print("Nhap lua chon: ");

            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 0) {
                System.out.println("Cam on ban da su dung!");
                break;
            }

            if (choice != 1 && choice != 2) {
                System.out.println("Lua chon khong hop le!");
                continue;
            }

            // Nhap thong tin benh nhan
            System.out.println("\n--- NHAP THONG TIN DAT LICH ---");

            System.out.print("Nhap ma lich hen: ");
            String id = sc.nextLine();

            System.out.print("Nhap ten benh nhan: ");
            String name = sc.nextLine();

            System.out.print("Nhap ten bac si: ");
            String doctor = sc.nextLine();

            System.out.print("Nhap thoi gian kham: ");
            String time = sc.nextLine();

            // Tao doi tuong theo lua chon
            AppointmentProcessor appointment;

            if (choice == 1) {
                appointment = new InPersonAppointment(
                        id, name, doctor, time);
            } else {
                appointment = new OnlineAppointment(
                        id, name, doctor, time);
            }

            // Thuc hien quy trinh Template Method
            appointment.processAppointment();

        } while (true);

        sc.close();
    }
}
