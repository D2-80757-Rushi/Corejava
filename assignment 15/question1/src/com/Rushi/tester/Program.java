package com.gaurav.tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.gaurav.classes.Candidate;
import com.gaurav.classes.CandidateDao;
import com.gaurav.classes.PartyVotes;

public class Program {
    public static int menu(Scanner sc) {
        int choice;
        System.out.println("\n0.EXIT");
        System.out.println("1.INSERT A CANDIDATE");
        System.out.println("2.UPDATE A CANDIDATE");
        System.out.println("3.DELETE A CANDIDATE");
        System.out.println("4.FIND A CANDIDATE");
        System.out.println("5.DISPLAY ALL CANDIDATES");
        System.out.println("6.FIND ALL CANDIDATES OF A PARTY");
        System.out.println("7.FIND PARTYWISE VOTES");
        System.out.print("ENTER YOUR CHOICE:");
        choice = sc.nextInt();
        return choice;
    }

    public static void main(String[] args) {
    	CandidateDao candidateDao=new CandidateDao();
        Scanner sc = new Scanner(System.in);
        int choice;
        while ((choice = menu(sc)) != 0) {
            switch (choice) {
                case 1:  	//INSERT A CANDIDATE
	                {
	                	System.out.println("Enter Details of Candidate:");
	                	System.out.print("Enter Name:");
	                	String name=sc.next();
	                	System.out.print("Enter Party:");
	                	String party=sc.next();
	                	System.out.print("Enter Votes:");
	                	int votes=sc.nextInt();
	                	candidateDao.save(new Candidate(0,name,party,votes));
	                }
                    break;
                case 2:  	//UPDATE A CANDIDATE   
	                {
	                	System.out.println("Enter Details of Candidate:");
	                	System.out.print("Enter ID to update:");
	                	int id=sc.nextInt();
	                	System.out.print("Enter Name:");
	                	String name=sc.next();
	                	System.out.print("Enter Party:");
	                	String party=sc.next();
	                	System.out.print("Enter Votes:");
	                	int votes=sc.nextInt();
	                	candidateDao.update(new Candidate(id,name,party,votes));
	                }
                    break;
                case 3:  	//DELETE A CANDIDATE   
	                {
	                	System.out.println("Enter ID of Candidate to Delete::");
	                	int id=sc.nextInt();
	                	int count=candidateDao.deleteById(id);
	                	if(count>0)
	                		System.out.println("Deleted Candidate With ID:"+id);
	                	else
	                		System.out.println("Unable to Find Candidate With ID:"+id);
	                }
                    break;
                case 4: 	//FIND A CANDIDATE
	                {
	                	System.out.println("Enter ID of Candidate to Find::");
	                	int id=sc.nextInt();
	                	Candidate c=null;
	                	c=candidateDao.findById(id);
	                	if(c!=null)
	                	{
	                		System.out.println("Found Candidate:");
		                	System.out.println("Name:"+c.getName());
		                	System.out.println("ID:"+c.getId());
		                	System.out.println("Party:"+c.getParty());
		                	System.out.println("Votes:"+c.getVotes());
	                	}
	                	else
	                		System.out.println("Unable to Find Candidate With ID:"+id);
	                }
                    break;
                case 5:   	//DISPLAY ALL CANDIDATES          
	                {
	                	List list=candidateDao.findAll();
	                	list.forEach(ele->System.out.println(ele));
	                }
                    break;
                case 6:   	//FIND ALL CANDIDATES OF A PARTY  
	                {
	                	System.out.print("Enter Party:");
	                	String party=sc.next();
	                	List list=null;
	                	list=candidateDao.findByParty(party);
	                	if(list.size()>0)
	                		list.forEach(ele->System.out.println(ele));
	                	else
	                		System.out.println("Unable to Find Any Candidate of Party:"+party);
	                }
                    break;
                case 7:		//FIND PARTYWISE VOTES
	                {
	                	List<PartyVotes> list=new ArrayList<PartyVotes>();
	                	list=candidateDao.getPartywiseVotes();
	                	list.forEach(ele->System.out.println(ele));
	                }
                	break;
                default:
                	System.out.println("INVALID CHOICE");
                    break;
            }
        }
    }
}