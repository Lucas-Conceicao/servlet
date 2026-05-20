<!DOCTYPE HTML>
<html lang="pt-BR">
    <head>
        <title>Sistema Web</title>
    </head>

    <body>
        <h2>Sistema Web de Desconto Inteligente</h2>
        <h3>Helena da Silva Ramos e Lucas Conceicao Ricardo</h3>
        <form>
            <label>Valor:</label>
            <input type='number' name='nValor' required><br><br>

            <label>Tipo de Cliente:</label>
            <select name="tipoCliente">
                <option value="COMUM">Cliente Regular</option>
                <option value="PREMIUM">Cliente Premium</option>
                <option value="VIP">Cliente VIP</option>
            </select>

            <br> <br>

            <label>Forma de Pagamento:</label>
            <select name="formaPagamento">
                <option value="DEBITO">Debito</option>
                <option value="CREDITO">Credito</option>
                <option value="PIX">Pix</option>
                <option value="DINHEIRO">Dinheiro</option>
            </select>

            <br><br>

            <button type="submit">Enviar</button>
        </form>
    </body>
</html>