package control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import persistence.PessoaDao;

public class Controle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Controle() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cmd = request.getParameter("cmd");
		if(cmd.equalsIgnoreCase("pegaVistoriadores")){
			pegaVistoriadores(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	
	protected void pegaVistoriadores(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			JSONArray  lista = new JSONArray(new PessoaDao().findAll());
			JSONObject json = new JSONObject();
			json.put("Pessoa", lista);			
			response.setContentType("application/json");
			response.getWriter().write(json.toString());	
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
