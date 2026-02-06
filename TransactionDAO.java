package Banking_Management_System;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class TransactionDAO {

    public static void addTransaction(long account_number, String full_name, String type, double amount) {

        String sql = "INSERT INTO transactions(account_number, full_name, type, amount) VALUES(?,?,?,?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setLong(1, account_number);
            ps.setString(2, full_name);
            ps.setString(3, type);
            ps.setDouble(4, amount);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("✅ Transaction Added Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
