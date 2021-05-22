package br.edu.pacotinho;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet ("/app")
public class aplicacao extends HttpServlet {
	
	protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ArrayList<Livros> livro = new ArrayList<Livros>();
		
		Livros livro1 = new Livros();
		livro1.setTitulo("A Bolsa Amarela");
		livro1.setAno(1976);
		livro1.setAutor("Lygia Bojunga");
		
		Livros livro2 = new Livros();
		livro2.setTitulo("Em busca de mim");
		livro2.setAno(1990);
		livro2.setAutor("Isabel Vieira");
		
		Livros livro3 = new Livros() ;
		livro3.setTitulo("Harry Potter e o Prisioneiro de Azkaban");
		livro3.setAno(1999);
		livro3.setAutor("J.K Rowling"); 
		
		Livros livro4 = new Livros() ;
		livro4.setTitulo("Fazendo Meu Filme 1: A Estreia de Fani");
		livro4.setAno(2014);
		livro4.setAutor("Paula Pimenta"); 
		
		livro.add(livro1);
		livro.add(livro2);
		livro.add(livro3);
		livro.add(livro4);
		
		req.setAttribute("livro", livro);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("listas.jsp");
		dispatcher.forward(req, resp);
	}

}
