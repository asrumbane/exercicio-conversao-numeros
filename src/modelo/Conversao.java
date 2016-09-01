package modelo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/adicionar")
public class Conversao extends  HttpServlet  {
	
		@Override
		protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
					String num = request.getParameter("arabe");
					int numero = Integer.parseInt(num);
					
		 String unidades = "", dezenas = "", centenas = "", milhares = "";
		 int unidade, dezena, centena, milhar;

		milhar = numero / 1000;
		centena = (numero %1000) / 100;
		dezena = ((numero % 1000)%100) / 10;
		unidade = (((numero %1000) % 100) % 10);
		
		switch (milhar) {
		case 1: milhares += "M"; break;
		case 2: milhares += "MM"; break;
		case 3: milhares += "MMM"; break;
		case 4: milhares += "MMMM"; break;
		case 5: milhares += "MMMMM"; break;
		case 6: milhares += "MMMMMM"; break;
		case 7: milhares += "MMMMMMM"; break;
		case 8: milhares += "MMMMMMMM"; break;
		case 9: milhares += "MMMMMMMMM"; break;
		}

		switch (centena) {
		case 1: centenas += "C"; break;
		case 2: centenas += "CC"; break;
		case 3: centenas += "CCC"; break;
		case 4: centenas += "CD"; break;
		case 5: centenas += "D"; break;
		case 6: centenas += "DC"; break;
		case 7: centenas += "DCC"; break;
		case 8: centenas += "DCCC"; break;
		case 9: centenas += "CM"; break;
		}

		switch (dezena) {
		case 1: dezenas += "X"; break;
		case 2: dezenas += "XX"; break;
		case 3: dezenas += "XXX"; break;
		case 4: dezenas += "XL"; break;
		case 5: dezenas += "L"; break;
		case 6: dezenas += "LX"; break;
		case 7: dezenas += "LXX"; break;
		case 8: dezenas += "LXXX"; break;
		case 9: dezenas += "XC"; break;
		}

		switch (unidade) {
		case 1:	unidades += "I"; break;
		case 2: unidades += "II"; break;
		case 3: unidades += "III"; break;
		case 4: unidades += "IV"; break;
		case 5: unidades += "V"; break;
		case 6: unidades += "VI"; break;
		case 7: unidades += "VII"; break;
		case 8: unidades += "VIII"; break;
		case 9: unidades += "IX";break;
		}
		
		request.setAttribute("valorIntroduzido", numero);
		request.setAttribute("resulato", milhares + centenas + dezenas + unidades);
		RequestDispatcher rb = request.getRequestDispatcher("formularioConvertido.jsp");
		rb.forward(request, response);
		}
}

