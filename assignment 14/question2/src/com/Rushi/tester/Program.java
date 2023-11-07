package com.Rushi.tester;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.TreeMap;

public class Program {
    public static int menu(Scanner sc) {
        int choice;
        System.out.println("\n0.EXIT");
        System.out.println("1.INSERT NEW USER");
        System.out.println("2.DISPLAY ALL USERS");
        System.out.println("3.DELETE VOTER WITH GIVEN ID");
        System.out.println("4.CHANGE STATUS OF VOTER WITH GIVEN ID TO TRUE");
        System.out.println("5.CHANGE THE NAME AND BIRTH DATE OF VOTER");
        System.out.print("ENTER YOUR CHOICE:");
        choice = sc.nextInt();
        return choice;
    }

    public static final String DB_URL = "jdbc:mysql://localhost:3306/test";
    public static final String DB_USER = "D3_80812_Gaurav";
    public static final String DB_PASS = "0981";
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        while ((choice = menu(sc)) != 0) {
            switch (choice) {
                case 1: // INSERT NEW USER
                	//INSERT into users values(default,"King","Lord","king@gmail.com","king@818","2020/05/30",1,"voter");
                    System.out.println("Enter Details of Users:");
                    try (Connection con1 = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {
                        String sql1 = "INSERT into users values(default,?,?,?,?,?,?,?)";
                        try (PreparedStatement stmt1 = con1.prepareStatement(sql1)) {
                            System.out.print("Enter First Name:");
                            String fname = sc.next();
                            System.out.print("Enter Last Name:");
                            String lname = sc.next();
                            System.out.print("Enter Email:");
                            String email = sc.next();
                            System.out.print("Enter Password:");
                            String password = sc.next();
                            System.out.println("Enter DOB(dd-mm-yyyy):");
                            String dateStr=sc.next();								//Date in String Format
                            SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");//SimpleDateFormat is used to convert String to Date of util Class
                            java.util.Date uDate=sdf.parse(dateStr);				//Using SimpleDate Format Parse Method to Convert String Date to Date of util Class
                            java.sql.Date sDate=new java.sql.Date(uDate.getTime());	//Converting utilDate to sqlDate;
                            System.out.print("Enter Status:");
                            int status = sc.nextInt();
                            System.out.print("Enter Role:");
                            String role = sc.next();
                            stmt1.setString(1,fname);
                            stmt1.setString(2, lname);
                            stmt1.setString(3,email);
                            stmt1.setString(4, password);
                            stmt1.setDate(5, sDate);
                            stmt1.setInt(6, choice);
                            stmt1.setString(7, role);
                            int count = stmt1.executeUpdate();
                            System.out.println("Rows Affected: " + count);
                        } // stmt.close() will get automatically called (try with resources)
                    } // con.close will get automatically called (try with resources)
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 2: // DISPLAY ALL USERS
                    System.out.println("All USERS Are:");
                    try (Connection con2 = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {
                        String sql2 = "SELECT id,first_name,last_name,dob FROM users";
                        try (PreparedStatement stmt2 = con2.prepareStatement(sql2)) {
                            try (ResultSet rs1 = stmt2.executeQuery()) {
                                while (rs1.next()) {
                                	int id=rs1.getInt("id");
                                    String fname = rs1.getString("first_name");
                                    String lname = rs1.getString("last_name");
                                    java.sql.Date sDate= rs1.getDate("dob");				//sqlDate
                                    SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
                                    String dateStr=sdf.format(sDate);						//sqlDate to directly String
                                    System.out.println(id + "." + fname+ " "+lname + " "+dateStr);
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 3: // DELETE VOTER WITH GIVEN ID
                	System.out.println("Enter Details of User to Delete:");
                    try (Connection con3 = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {
                        String sql3 = "DELETE from users where id=?";
                        try (PreparedStatement stmt3 = con3.prepareStatement(sql3)) {
                            System.out.print("Enter ID:");
                            int id1 = sc.nextInt();
                            stmt3.setInt(1, id1);
                            int count = stmt3.executeUpdate();
                            if (count > 0) {
                                System.out.println("Deleted User with ID:" + id1);
                            } else {
                                System.out.println("User with ID:" + id1 + " not Found");
                            }
                            System.out.println("Rows Affected: " + count);
                        } // stmt.close() will get automatically called (try with resources)
                    } // con.close will get automatically called (try with resources)
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 4: // CHANGE STATUS OF VOTER WITH GIVEN ID TO TRUE
                	//UPDATE users SET status = 1 where id=3;
                	System.out.println("Enter ID of User to Change Status To True:");
                    try (Connection con3 = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {
                        String sql3 = "UPDATE users SET status = 1 where id=?";
                        try (PreparedStatement stmt3 = con3.prepareStatement(sql3)) {
                            System.out.print("Enter ID:");
                            int id1 = sc.nextInt();
                            stmt3.setInt(1, id1);
                            int count = stmt3.executeUpdate();
                            if (count > 0) {
                                System.out.println("Status of User with ID:" + id1+ " Changed to 1");
                            } else {
                                System.out.println("User with ID:" + id1 + " not Found");
                            }
                        } // stmt.close() will get automatically called (try with resources)
                    } // con.close will get automatically called (try with resources)
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 5:// Change the name and birth date of voter
                    try (Connection con5 = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {
                        String sql5 = "UPDATE users SET first_name = ?, last_name=?, dob=? where id=?";
                        try (PreparedStatement stmt5 = con5.prepareStatement(sql5)) {
                            System.out.println("Enter ID:");
                            int id=sc.nextInt();
                            System.out.print("Enter First Name:");
                            String fname = sc.next();
                            System.out.print("Enter Last Name:");
                            String lname = sc.next();
                            System.out.println("Enter DOB(dd-mm-yyyy):");
                            String dateStr=sc.next();
                            
                            SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");//new SimpleDateFormat 
                            java.util.Date uDate=sdf.parse(dateStr);				//String to utilDate
                            java.sql.Date sDate=new java.sql.Date(uDate.getTime());	//utilDate to sqlDate
                            
                            stmt5.setInt(4, id);
                            stmt5.setDate(3, sDate);
                            stmt5.setString(1,fname);
                            stmt5.setString(2,lname);
                            int count=stmt5.executeUpdate();
                            if (count > 0) {
                                System.out.println("Updated Name:" + fname + " "+lname+" at ID:"+id);
                            } else {
                                System.out.println("User with ID:" + id + " not Found");
                            }
                        }
                         catch (Exception e) {
                                e.printStackTrace();
                             }
                        } // stmt.close() will get automatically called (try with resources)
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
