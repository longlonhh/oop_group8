package quan_ly_quan_bida;

import java.util.Date;

public class NhanVien {
    private int IDNhanVien;
    private String HoTen;
    private String SoCCCD;
    private Date NgaySinh;
    private String TenDangNhap;
    private String MatKhau;
    private String VaiTro;

    public NhanVien(int IDNhanVien, String HoTen, String SoCCCD, Date NgaySinh, String TenDangNhap, String MatKhau, String VaiTro) {
        this.IDNhanVien = IDNhanVien;
        this.HoTen = HoTen;
        this.SoCCCD = SoCCCD;
        this.NgaySinh = NgaySinh;
        this.TenDangNhap = TenDangNhap;
        this.MatKhau = MatKhau;
        this.VaiTro = VaiTro;
    }

    public NhanVien(String HoTen, String SoCCCD, Date NgaySinh, String TenDangNhap, String MatKhau, String VaiTro) {
        this.HoTen = HoTen;
        this.SoCCCD = SoCCCD;
        this.NgaySinh = NgaySinh;
        this.TenDangNhap = TenDangNhap;
        this.MatKhau = MatKhau;
        this.VaiTro = VaiTro;
    }
    
    public NhanVien() {
    }
    
    public int getIDNhanVien() {
        return IDNhanVien;
    }

    public void setIDNhanVien(int IDNhanVien) {
        this.IDNhanVien = IDNhanVien;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getSoCCCD() {
        return SoCCCD;
    }

    public void setSoCCCD(String SoCCCD) {
        this.SoCCCD = SoCCCD;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getTenDangNhap() {
        return TenDangNhap;
    }

    public void setTenDangNhap(String TenDangNhap) {
        this.TenDangNhap = TenDangNhap;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getVaiTro() {
        return VaiTro;
    }

    public void setVaiTro(String VaiTro) {
        this.VaiTro = VaiTro;
    }
}
