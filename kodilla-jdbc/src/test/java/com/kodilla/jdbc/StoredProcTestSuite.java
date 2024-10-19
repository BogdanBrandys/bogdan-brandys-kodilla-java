package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoredProcTestSuite {
    @Test
    public void testUpdateVipLevels() throws SQLException {
        // Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE READERS SET VIP_LEVEL=\"Not set\"";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);
        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM READERS WHERE VIP_LEVEL=\"Not set\"";

        // When
        Statement statement2 = dbManager.getConnection().createStatement();
        String sqlProcedureCall = "CALL UpdateVipLevels()";
        statement2.execute(sqlProcedureCall);
        ResultSet rs = statement.executeQuery(sqlCheckTable);

        // Then
        int howMany = -1;
        if (rs.next()) {
            howMany = rs.getInt("HOW_MANY");
        }
        assertEquals(0, howMany);
        rs.close();
        statement.close();
        statement2.close();
    }

    @Test
    public void testUpdateBestsellers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE BOOKS SET BESTSELLER=\"0\"";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);
        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM BOOKS WHERE BESTSELLER=\"0\"";
        //When
        Statement statement2 = dbManager.getConnection().createStatement();
        // Then
        //Checking database before procedure
        ResultSet rs1 = statement.executeQuery(sqlCheckTable);
        int howManyBefore = -1;
        if (rs1.next()) {
            howManyBefore = rs1.getInt("HOW_MANY");
        }
        //Executing procedure call
        String sqlProcedureCall = "CALL UpdateBestsellers()";
        statement2.execute(sqlProcedureCall);
        //Checking after procedure call
        ResultSet rs2 = statement.executeQuery(sqlCheckTable);
        int howManyAfter = -1;
        if(rs2.next()) {
            howManyAfter = rs2.getInt("HOW_MANY");
        }

        assertEquals(5, howManyBefore);
        assertEquals(4, howManyAfter); //one is bestseller
        rs1.close();
        rs2.close();
        statement.close();
        statement2.close();
    }
}