package doan;
import java.util.Scanner;

public class QUANLIDSDT {
    private ListDT listDS;
    private Scanner scanner;

    public QUANLIDSDT() {
        listDS = new ListDT();
        scanner = new Scanner(System.in);
    }

    public void menu() {
        int choice;

        do {
            System.out.println("1. Them dien thoai");
            System.out.println("2. Xoa dien thoai");
            System.out.println("3. Hien thi danh sach dien thoai");
            System.out.println("4. Sua thong tin dien thoai");
            System.out.println("5. Tim kiem dien thoai");
            System.out.println("6. Thoat");
            System.out.print("Nhap lua chon : ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    themDienThoai();
                    break;
                case 2:
                    xoaDienThoai();
                    break;
                case 3:
                    hienThiDanhSachDienThoai();
                    break;
                case 4:
                    suaThongTinDienThoai();
                    break;
                case 5:
                    timKiemDienThoai();
                    break;
                case 6:
                    System.out.println("Thoat.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le.");
            }
        } while (choice != 6);
    }

    private void themDienThoai() {
        System.out.println("Ban muon them ?");
        System.out.println("1. Dien thoai pho thong");
        System.out.println("2. Smartphone");
        int loai1 = scanner.nextInt();
        scanner.nextLine();

        switch (loai1) {
            case 1:
                DTPT dtpt = new DTPT();
                dtpt.Nhap();
                listDS.addDienthoai(dtpt);
                break;
            case 2:
                Smartphone smartphone = new Smartphone();
                smartphone.Nhap();
                listDS.addDienthoai(smartphone);
                break;
            default:
                System.out.print("Khong hop le ");
                break;
        }
    }

    private void xoaDienThoai() {
        if (listDS.getSize() > 0) {
            System.out.println("Ban muon xoa ?");
            System.out.println("1. Dien thoai pho thong");
            System.out.println("2. Smartphone");
            int loai2 = scanner.nextInt();
            scanner.nextLine();

            switch (loai2) {
                case 1:
                    System.out.println("Nhap ma san pham : ");
                    int maSanPhamDTPT = scanner.nextInt();
                    listDS.removeDienthoaiByMaSanPham(maSanPhamDTPT);
                    break;
                case 2:
                    System.out.println("Nhap ma san pham : ");
                    int maSanPhamSmartphone = scanner.nextInt();
                    listDS.removeDienthoaiByMaSanPham(maSanPhamSmartphone);
                    break;
                default:
                    System.out.print("Khong hop le ");
                    break;
            }
        } else {
            System.out.println("Danh sach rong.");
        }
    }

    private void hienThiDanhSachDienThoai() {
        if (listDS.getSize() == 0) {
            System.out.println("Danh sach rong.");
        } else {
            System.out.println("Ban muon xuat thong tin loai nao ?");
            System.out.println("1. Dien thoai pho thong");
            System.out.println("2. Smartphone");
            int loai3 = scanner.nextInt();
            scanner.nextLine();

            switch (loai3) {
                case 1:
                    listDS.xuatDanhSachTheoLoai("Dien thoai pho thong");
                    break;
                case 2:
                    listDS.xuatDanhSachTheoLoai("Smartphone");
                    break;
                default:
                    System.out.print("Khong hop le.");
                    break;
            }
        }
    }

    private void suaThongTinDienThoai() {
        if (listDS.getSize() > 0) {
            System.out.println("Ban muon sua thong tin ?");
            System.out.println("1. Dien thoai pho thong");
            System.out.println("2. Smartphone");
            int loai4 = scanner.nextInt();
            scanner.nextLine();

            switch (loai4) {
                case 1:
                    System.out.println("Nhap ma san pham : ");
                    int maSanPhamDTPT = scanner.nextInt();
                    DTPT dtptMoi = new DTPT();
                    dtptMoi.Nhap();
                    listDS.suaThongTinSanPham(maSanPhamDTPT, dtptMoi);
                    break;
                case 2:
                    System.out.println("Nhap ma san pham : ");
                    int maSanPhamSmartphone = scanner.nextInt();
                    Smartphone smartphoneMoi = new Smartphone();
                    smartphoneMoi.Nhap();
                    listDS.suaThongTinSanPham(maSanPhamSmartphone, smartphoneMoi);
                    break;
                default:
                    System.out.print("Khong hop le ");
                    break;
            }
        } else {
            System.out.println("Danh sach rong.");
        }
    }

    private void timKiemDienThoai() {
        if (listDS.getSize() > 0) {
            System.out.println("Ban muon tim kiem thong tin ?");
            System.out.println("1. Dien thoai pho thong");
            System.out.println("2. Smartphone");
            int loai5 = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nhap ma san pham : ");
            int maSanPham = scanner.nextInt();

            switch (loai5) {
                case 1:
                    Dienthoai dtpt = listDS.timKiemSanPham(maSanPham);
                    if (dtpt != null && dtpt instanceof DTPT) {
                        dtpt.Xuat();
                    } else {
                        System.out.println("Khong tim thay san pham voi ma da cho hoac san pham khong phai la Dien thoai pho thong.");
                    }
                    break;
                case 2:
                    Dienthoai smartphone = listDS.timKiemSanPham(maSanPham);
                    if (smartphone != null && smartphone instanceof Smartphone) {
                        smartphone.Xuat();
                    } else {
                        System.out.println("Khong tim thay san pham voi ma da cho hoac san pham khong phai la Smartphone.");
                    }
                    break;
                default:
                    System.out.print("Lua chon khong hop le.");
                    break;
            }
        } else {
            System.out.println("Danh sach rong.");
        }
    }
}
