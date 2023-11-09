package doan;
import java.util.Scanner;
public class Smartphone extends Dienthoai {
    private String heDieuHanh;
    private int ram;
    private String chip;

    public Smartphone() {
        super();
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.println("Nhap he dieu hanh: ");
        heDieuHanh = scanner.nextLine();
        System.out.println("Nhap RAM: ");
        ram = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Nhap chip: ");
        chip = scanner.nextLine();
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.printf("He dieu hanh: %s\nRAM: %d\nChip: %s\n", heDieuHanh, ram, chip);
    }
}