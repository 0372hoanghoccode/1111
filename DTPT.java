package doan;
import java.util.Scanner;

public class DTPT extends Dienthoai {
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
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.println("Nhap loai ban phim: ");
        banPhim = scanner.nextLine();
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Loai ban phim: " + banPhim);
    }
}
