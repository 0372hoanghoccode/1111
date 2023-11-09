package doan;
import java.util.Scanner;

public class DTPT extends Dienthoai implements doituong{
    private String banPhim;

    public DTPT() {
        super();
    }

    public String getBanPhim() {
        return banPhim;
    }

    public void setBanPhim(String banPhim) {
        this.banPhim = banPhim;
    }

    @Override
    public void Nhap() {
        super.Nhap();
        System.out.println("Nhap loai ban phim: ");
        banPhim = scanner.nextLine();
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Loai ban phim: " + banPhim);
    }
    public void Goi(){
        System.out.println( "  goi thuong " );
    }
}
