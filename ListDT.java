package doan;

public class ListDT {
    private Dienthoai[] listdt;
    private int size;
public ListDT(){
listdt= new Dienthoai[100];
}
    public ListDT(Dienthoai[] dienthoai) {
        listdt = new Dienthoai[dienthoai.length];
        listdt = dienthoai;
    }

    public void addDienthoai(Dienthoai dt) {
        if (size < listdt.length) {
            listdt[size] = dt;
            size++;
        } else {
            System.out.println("Danh sach day ko them duoc.");
        }
    }
    

    public void removeDienthoai(int index) {
        if (index >= 0 && index < size) {
            System.arraycopy(listdt, index + 1, listdt, index, size - index - 1);
            size--;
        } else {
            System.out.println("Chi so khong hop le.");
        }
    }

    public void removeDienthoaiByMaSanPham(int maSanPham) {
        for (int i = 0; i < size; i++) {
            if (listdt[i].getMaSanPham() == maSanPham) {
                removeDienthoai(i);
                break;
            }
        }
    }

    public Dienthoai getDienthoai(int index) {
        if (index >= 0 && index < size) {
            return listdt[index];
        } else {
            System.out.println("Chi so khong hop le.");
            return null;
        }
    }

    public int getSize() {
        return size;
    }

    public void xuatDanhSachTheoLoai(String loai) {
        System.out.println("Danh sách " + loai + ":");
        for (int i = 0; i < size; i++) {
            if (listdt[i] != null) {
                if (listdt[i] instanceof Smartphone && "Smartphone".equals(loai)) {
                    listdt[i].Xuat();
                } else if (listdt[i] instanceof DTPT && "Dien thoai pho thong".equals(loai)) {
                    listdt[i].Xuat();
                }
            }
        }
    }

    public void suaThongTinSanPham(int maSanPham, Dienthoai dtMoi) {
        for (int i = 0; i < size; i++) {
            if (listdt[i].getMaSanPham() == maSanPham) {
                listdt[i] = dtMoi;
                break;
            }
        }
    }

    public Dienthoai timKiemSanPham(int maSanPham) {
        for (int i = 0; i < size; i++) {
            if (listdt[i].getMaSanPham() == maSanPham) {
                return listdt[i];
            }
        }
        return null;
    }
    
    public void timVaInSanPham(int maSanPham) {
        Dienthoai dt = timKiemSanPham(maSanPham);
        if (dt != null) {
            dt.Xuat();
        } else {
            System.out.println("Khong tim thay san pham voi ma: " + maSanPham);
        }
    }
}    

    