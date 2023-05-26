

import java.io.*;
import java.sql.*;
import java.text.*;
import java.util.Date;

public class connection {
    private static String readString(RandomAccessFile file, int size) throws IOException {
        byte[] buffer = new byte[size];
        file.read(buffer);
        return new String(buffer).trim();
    }

    private static void writeFile(int dong) throws IOException {
        FileWriter writer = new FileWriter("D://java//error.txt", true);
        writer.write("Dong " + dong + ": Sai dinh dang ngay sinh\n");
        writer.close();
    }

    private static void InsertHV(String maSV, String hoTen, java.sql.Date ngaySinh, String GT, double Diem) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1:3306/finalex";
            Connection con = DriverManager.getConnection(url, "root", "");
//			Statement stmt = con.createStatement();
            String query = "INSERT INTO HOCVIEN(MaHocVien, TenHocVien, NgaySinh, GioiTinh, DiemThi) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, maSV);
            pstmt.setString(2, hoTen);
            pstmt.setDate(3, java.sql.Date.valueOf(ngaySinh.toString()));
            pstmt.setString(4, GT);
            pstmt.setDouble(5, Diem);
//			String query = String.format("insert into HOCVIEN(MaHocVien, TenHocVien, NgaySinh, GioiTinh, DiemThi) values('{0}', '{1}', '{2}', '{3}', '{4}')", maSV, hoTen, ngaySinh.getDate(), GT, Diem);
            pstmt.executeUpdate();
            System.out.println("Da insert vao bang");
        } catch (Exception e) {
            System.err.format("Exception: %s%n", e);
        }
    }

    public static void main(String[] args) {
        int maSVSize = 10; // số lượng kí tự của trường mã sinh viên
        int hoTenSize = 50; // số lượng kí tự của trường họ tên
        int ngaySinhSize = 10; // số lượng kí tự của trường ngày sinh
        int GTSize = 3;
        int Diemsize = 3;

        try (BufferedReader reader = new BufferedReader(new FileReader("D://java//input.txt"))) {
            String line;
            int dong = 1;
            while ((line = reader.readLine()) != null) {
                String maSV = line.substring(0, maSVSize).trim();
                String hoTen = line.substring(maSVSize, maSVSize + hoTenSize).trim();
                String ngaySinh = line.substring(maSVSize + hoTenSize, maSVSize + hoTenSize + ngaySinhSize).trim();
                String GT = line
                        .substring(maSVSize + hoTenSize + ngaySinhSize, maSVSize + hoTenSize + ngaySinhSize + GTSize)
                        .trim();
                String diem = line.substring(maSVSize + hoTenSize + ngaySinhSize + GTSize,
                        maSVSize + hoTenSize + ngaySinhSize + GTSize + Diemsize).trim();
                double Diem = Double.parseDouble(diem);

                // read data
                System.out.println("Ma SV = " + maSV + " ,Ho Ten = " + hoTen + " ,Ngay sinh = " + ngaySinh
                        + " ,Gioi tinh = " + GT + " ,Diem = " + Diem);

                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                sdf.setLenient(false);
                try {
                    java.util.Date utilDate = sdf.parse(ngaySinh);
                    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

                    InsertHV(maSV, hoTen, sqlDate, GT, Diem);
                }catch (ParseException pe) {
                    writeFile(dong);
                    System.out.println("ep k thanh cong");
                }

                dong++;
            }
        } catch (Exception e) {
            System.err.format("Exception: %s%n", e);
        }
    }
}
