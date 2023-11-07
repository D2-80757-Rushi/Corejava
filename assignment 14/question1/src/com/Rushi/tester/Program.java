package com.Rushi.tester;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import java.util.TreeMap;

public class Program {
    public static int menu(Scanner sc) {
        int choice;
        System.out.println("\n0.EXIT");
        System.out.println("1.INSERT NEW CANDIDATE");
        System.out.println("2.DISPLAY ALL CANDIDATES");
        System.out.println("3.INCREMENT VOTES OF CANDIDATE WITH GIVEN ID");
        System.out.println("4.DELETE CANDIDATE WITH GIVEN ID");
        System.out.println("5.FIND CANDIDATE OF GIVEN ID");
        System.out.println("6.FIND CANDIDATES OF GIVEN PARTY");
        System.out.println("7.DISPLAY TOTAL VOTES OF EACH PARTY");
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
                case 1: // INSERT NEW CANDIDATE
                    System.out.println("Enter Details of Candidate:");
                    try (Connection con1 = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {
                        String sql1 = "INSERT INTO candidates Values(default,?,?,?)";
                        try (PreparedStatement stmt1 = con1.prepareStatement(sql1)) {
                            System.out.print("Enter Name:");
                            String name = sc.next();
                            System.out.print("Enter Party:");
                            String party = sc.next();
                            System.out.print("Enter Votes:");
                            int votes = sc.nextInt();

                            stmt1.setString(1, name);
                            stmt1.setString(2, party);
                            stmt1.setInt(3, votes);
                            int count = stmt1.executeUpdate();
                            System.out.println("Rows Affected: " + count);
                        } // stmt.close() will get automatically called (try with resources)
                    } // con.close will get automatically called (try with resources)
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 2: // DISPLAY ALL CANDIDATES
                    System.out.println("All Candidates Are:");
                    try (Connection con2 = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {
                        String sql2 = "SELECT name FROM candidates";
                        try (PreparedStatement stmt2 = con2.prepareStatement(sql2)) {
                            try (ResultSet rs1 = stmt2.executeQuery()) {
                                int counter = 1;
                                while (rs1.next()) {
                                    String name = rs1.getString("name");
                                    System.out.println(counter + "." + name);
                                    counter++;
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
                case 3: // INCREMENT VOTES OF CANDIDATE WITH GIVEN ID
                    System.out.println("Enter Details of Candidate To Increment Votes:");
                    try (Connection con3 = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {
                        String sql3 = "UPDATE candidates SET votes = votes + 1 where id=?";
                        try (PreparedStatement stmt3 = con3.prepareStatement(sql3)) {
                            System.out.print("Enter ID:");
                            int id = sc.nextInt();
                            stmt3.setInt(1, id);
                            int count = stmt3.executeUpdate();
                            if (count > 0) {
                                System.out.println("Increased Votes of ID:" + id + " by 1");
                            } else {
                                System.out.println("Candidate with ID:" + id + " not Found");
                            }
                        } // stmt.close() will get automatically called (try with resources)
                    } // con.close will get automatically called (try with resources)
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 4: // DELETE CANDIDATE WITH GIVEN ID
                    System.out.println("Enter Details of Candidate to Delete:");
                    try (Connection con4 = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {
                        String sql4 = "DELETE from candidates where id=?";
                        try (PreparedStatement stmt4 = con4.prepareStatement(sql4)) {
                            System.out.print("Enter ID:");
                            int id1 = sc.nextInt();
                            stmt4.setInt(1, id1);
                            int count = stmt4.executeUpdate();
                            if (count > 0) {
                                System.out.println("Deleted Candidate with ID:" + id1);
                            } else {
                                System.out.println("Candidate with ID:" + id1 + " not Found");
                            }
                            System.out.println("Rows Affected: " + count);
                        } // stmt.close() will get automatically called (try with resources)
                    } // con.close will get automatically called (try with resources)
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 5:// FIND CANDIDATE OF GIVEN ID
                    try (Connection con5 = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {
                        String sql5 = "SELECT * from candidates where id = ?";
                        try (PreparedStatement stmt5 = con5.prepareStatement(sql5)) {
                            System.out.print("Enter ID:");
                            int id2 = sc.nextInt();
                            stmt5.setInt(1, id2);
                            try (ResultSet rs2 = stmt5.executeQuery()) {
                                int id=0;
                                String name="";
                                String party="";
                                int votes=0;
                                boolean flag = false;
                                while (rs2.next()) {
                                    id = rs2.getInt("id");
                                    name = rs2.getString("name");
                                    party = rs2.getString("party");
                                    votes = rs2.getInt("votes");
                                    flag = true;
                                }
                                if (flag == true)
                                    System.out.println(
                                            "Id:" + id + " Name:" + name + " Party:" + party + " Votes:" + votes);
                                else
                                    System.out.println("Candidate not Found with given ID:" + id2);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        } // stmt.close() will get automatically called (try with resources)
                    } // con.close will get automatically called (try with resources)
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 6:// FIND CANDIDATES OF GIVEN PARTY
                       // select name from candidates where party= "AAP";
                    try (Connection con6 = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {
                        String sql6 = "SELECT name from candidates where party = ?";
                        try (PreparedStatement stmt6 = con6.prepareStatement(sql6)) {
                            System.out.print("Enter Party:");
                            String partyFind = sc.next();
                            stmt6.setString(1, partyFind);
                            try (ResultSet rs3 = stmt6.executeQuery()) {
                                String name;
                                int counter = 1;
                                boolean flag = false;
                                while (rs3.next()) {
                                    name = rs3.getString("name");
                                    System.out.println(counter + ".Name:" + name);
                                    counter++;
                                    flag = true;
                                }
                                if (flag == false)
                                    System.out.println("There is No Candidate of Give Party: " + partyFind);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        } // stmt.close() will get automatically called (try with resources)
                    } // con.close will get automatically called (try with resources)
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 7:// DISPLAY TOTAL VOTES OF EACH PARTY
                       // select distinct party,sum(votes) from candidates group by party;
                    System.out.println("Each Party With Total Votes:");
                    try (Connection con7 = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {
                        String sql7 = "SELECT distinct party,sum(votes) FROM candidates group by party";
                        try (PreparedStatement stmt7 = con7.prepareStatement(sql7)) {
                            try (ResultSet rs7 = stmt7.executeQuery()) {
                                int counter = 1;
                                String party = "";
                                while (rs7.next()) {
                                    party = rs7.getString("party");
                                    int totalVotes = rs7.getInt("sum(votes)");
                                    System.out.println(counter + "." + party + ":" + totalVotes);
                                    counter++;
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
                default:
                    break;
            }
        }
    }
}
