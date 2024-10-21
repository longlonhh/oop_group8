package quan_ly_quan_bida;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.util.Date;

public class NhanVienDAO {

    public List<NhanVien> getAllNhanVien() {
        List<NhanVien> list = new ArrayList<>();
        Connection connection = Class_ket_noi.getConnection();
        String sql = "SELECT * FROM NhanVien";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setIDNhanVien(rs.getInt("IDNhanVien"));
                nv.setHoTen(rs.getString("HoTen"));
                nv.setSoCCCD(rs.getString("SoCCCD"));
                nv.setNgaySinh(rs.getDate("NgaySinh"));
                nv.setTenDangNhap(rs.getString("TenDangNhap"));
                nv.setMatKhau(rs.getString("MatKhau"));
                nv.setVaiTro(rs.getString("VaiTro"));
                list.add(nv);
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Class_ket_noi.closeConnection(connection);
        }
        return list;
    }

    public static boolean addNhanVien(NhanVien nv) {
        Connection connection = Class_ket_noi.getConnection();
        String sql = "INSERT INTO NhanVien (HoTen, SoCCCD, NgaySinh, TenDangNhap, MatKhau, VaiTro) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, nv.getHoTen());
            ps.setString(2, nv.getSoCCCD());
            ps.setDate(3, new java.sql.Date(nv.getNgaySinh().getTime()));
            ps.setString(4, nv.getTenDangNhap());
            ps.setString(5, nv.getMatKhau());
            ps.setString(6, nv.getVaiTro());
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (SQLException e) {
            if (e.getErrorCode() == 2627) { // SQLServer error code for unique constraint violation
                JOptionPane.showMessageDialog(null, "Tên đăng nhập đã tồn tại, vui lòng chọn tên khác!");
            } else {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Đã xảy ra lỗi khi thêm nhân viên!");
            }
            return false;
        } finally {
            Class_ket_noi.closeConnection(connection);
        }
    }
    public static void main(String[] args) {
        NhanVienDAO nv = new NhanVienDAO();
               Date now = new Date();

        NhanVien a = new NhanVien("Duy", "123452",now , "user1", "123", "NhanVien");
        System.out.println(addNhanVien(a));
    }
    
            

    public void updateNhanVien(NhanVien nv) {
        Connection connection = Class_ket_noi.getConnection();
        String sql = "UPDATE NhanVien SET HoTen = ?, SoCCCD = ?, NgaySinh = ?, TenDangNhap = ?, MatKhau = ?, VaiTro = ? WHERE IDNhanVien = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, nv.getHoTen());
            ps.setString(2, nv.getSoCCCD());
            ps.setDate(3, new java.sql.Date(nv.getNgaySinh().getTime()));
            ps.setString(4, nv.getTenDangNhap());
            ps.setString(5, nv.getMatKhau());
            ps.setString(6, nv.getVaiTro());
            ps.setInt(7, nv.getIDNhanVien());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Đã xảy ra lỗi khi cập nhật nhân viên!");
        } finally {
            Class_ket_noi.closeConnection(connection);
        }
    }

    public void deleteNhanVien(int id) {
        Connection connection = Class_ket_noi.getConnection();
        String sql = "DELETE FROM NhanVien WHERE IDNhanVien = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Đã xảy ra lỗi khi xóa nhân viên!");
        } finally {
            Class_ket_noi.closeConnection(connection);
        }
    }
}
