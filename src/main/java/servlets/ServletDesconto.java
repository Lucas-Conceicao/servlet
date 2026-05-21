package servlets;

import beans.CompraBean;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//Helena da Silva Ramos e Lucas Conceição Ricardo
@WebServlet("/ServletDesconto")
public class ServletDesconto extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */

    public ServletDesconto() {
        super();
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String txtValor = request.getParameter("nValor");
        double valorOriginal = Double.parseDouble(txtValor);
        String tipoCliente = request.getParameter("tipoCliente");
        String formaPagamento = request.getParameter("formaPagamento");

        CompraBean compra = new CompraBean(valorOriginal, tipoCliente, formaPagamento);
        compra.setDescontoAplicado_E_ValorFinal();

        request.setAttribute("compraAtributo", compra);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/resultado.jsp");
        dispatcher.forward(request, response);
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("index.jsp");
    }
}
