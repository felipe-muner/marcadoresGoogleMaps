package persistence;

import java.util.ArrayList;
import java.util.List;

import entity.Pessoa;

public class PessoaDao extends Dao{
	
	public List<Pessoa> findAll() throws Exception{
		open();
		List<Pessoa> listap = new ArrayList<Pessoa>();
		stmt = con.prepareStatement("SELECT * FROM GM");
		rs = stmt.executeQuery();
		while (rs.next()) {
			Pessoa p1 = new Pessoa();
			p1.setId(rs.getInt("id"));
			p1.setNome(rs.getString("nome"));
			p1.setEndereco(rs.getString("endereco"));
			listap.add(p1);
		}		
		close();
		return listap;
	}
public static void main(String[] args) {
	try {
		List<Pessoa> pp = new ArrayList<Pessoa>();
		pp = new PessoaDao().findAll();
		System.out.println(pp);
		
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
}
