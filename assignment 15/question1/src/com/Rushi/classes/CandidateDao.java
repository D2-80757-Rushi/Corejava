package com.Rushi.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CandidateDao implements AutoCloseable{
	private Connection con;
	private PreparedStatement stmtSave;
	private PreparedStatement stmtDeleteById;
	private PreparedStatement stmtFindById;
	private PreparedStatement stmtFindAll;
	private PreparedStatement stmtFindByParty;
	private PreparedStatement stmtUpdate;
	private PreparedStatement stmtGetPartyWiseVotes;
	
	//private PreparedStatement stmtDeleteById;
	//private PreparedStatement stmtDeleteById;
	public CandidateDao()
	{
		con=DbUtil.getConnection();
		try {
		stmtFindById=con.prepareStatement("SELECT * from candidates WHERE id=?");
		stmtSave=con.prepareStatement("INSERT into candidates values(default,?,?,?)");
		stmtDeleteById=con.prepareStatement("DELETE from candidates where id=?");
		stmtFindAll=con.prepareStatement("SELECT * from candidates");
		stmtFindByParty=con.prepareStatement("SELECT * FROM candidates WHERE party=?");
		stmtUpdate=con.prepareStatement("UPDATE candidates SET name=?, party=?, votes=? WHERE id=?");
		stmtGetPartyWiseVotes=con.prepareStatement("SELECT party,sum(votes) sum from candidates GROUP BY party");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	@Override
	public void close() throws Exception {
		if(stmtFindById!=null)
			stmtFindById.close();
		if(stmtSave!=null)
			stmtSave.close();
		if(stmtDeleteById!=null)
			stmtDeleteById.close();
		if(stmtFindAll!=null)
			stmtFindAll.close();
		if(stmtFindByParty!=null)
			stmtFindByParty.close();
		if(stmtUpdate!=null)
			stmtUpdate.close();
		if(stmtGetPartyWiseVotes!=null)
			stmtGetPartyWiseVotes.close();
		if(con!=null)
			con.close();	
	}
	public int save(Candidate c)
	{
		//INSERT into candidates values(default,?,?,?")
		int count=0;
		try {
		stmtSave.setString(1, c.getName());
		stmtSave.setString(2, c.getParty());
		stmtSave.setInt(3, c.getVotes());
		count=stmtSave.executeUpdate();
		return count;
		}catch(Exception e)
		{
			e.printStackTrace();
			return count;
		}
		
	}
	public int update(Candidate c) {
		//UPDATE candidates SET name=?, party=?, votes=? WHERE id=?
		int count=0;
		try {
		stmtUpdate.setString(1, c.getName());
		stmtUpdate.setString(2, c.getParty());
		stmtUpdate.setInt(3, c.getVotes());
		stmtUpdate.setInt(4, c.getId());
		count=stmtUpdate.executeUpdate();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return count;
	}
	public int deleteById(int id) {
		//DELETE from candidates where id=?
		int count=0;
		try {
			stmtDeleteById.setInt(1, id);
			count=stmtDeleteById.executeUpdate();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		return count;
	}
	public Candidate findById(int id) {
		//SELECT * from candidates WHERE id=?
		try {
			stmtFindById.setInt(1, id);
			ResultSet rs=stmtFindById.executeQuery();
			if(rs.next())
			{
				String name=rs.getString("name");
				String party=rs.getString("party");
				int votes=rs.getInt("votes");
				return new Candidate(id, name, party,votes);
			}		
		} catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Candidate> findAll() {
		//SELECT * from candidates
		List<Candidate> list = new ArrayList<Candidate>();
		try {
		ResultSet rs=stmtFindAll.executeQuery();
		while(rs.next())
		{
			int id=rs.getInt("id");
			String name=rs.getString("name");
			String party=rs.getString("party");
			int votes=rs.getInt("votes");
			Candidate c=new Candidate(id,name,party,votes);
			list.add(c);
		}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}
	//
	public List<Candidate> findByParty(String party){
		List<Candidate> list = new ArrayList<Candidate>();
		//SELECT * FROM candidates WHERE party=?
		try {
			stmtFindByParty.setString(1, party);
			ResultSet rs=stmtFindByParty.executeQuery();
			while(rs.next())
			{
				int id=rs.getInt("id");
				String name=rs.getString("name");
				int votes=rs.getInt("votes");
				list.add(new Candidate(id,name,party,votes));
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}
	public List<PartyVotes> getPartywiseVotes(){
		List<PartyVotes> list=new ArrayList<PartyVotes>();
		try(ResultSet rs=stmtGetPartyWiseVotes.executeQuery())
		{
			while(rs.next())
			{
				list.add(new PartyVotes(rs.getString("party"),rs.getInt("sum")));
			}
			return list;
		}
		catch(Exception e)
		{
			return null;
		}
	}
}
