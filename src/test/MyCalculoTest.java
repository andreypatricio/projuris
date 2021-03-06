package test;

import br.com.projuris.Funcionario;
import br.com.projuris.MyCalculo;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MyCalculoTest {

    @Test
    public void testingMethodCustoPorCargo() {

        MyCalculo myCalculo = new MyCalculo();
        List<Funcionario> funcionarioList = new ArrayList<Funcionario>();

        myCalculo.custoPorCargo(createFuncionarioListMock(funcionarioList));

        Assert.assertNotNull(funcionarioList);

    }

    @Test
    public void testingMethodCustoPorDepartamento() {

        MyCalculo myCalculo = new MyCalculo();
        List<Funcionario> funcionarioList = new ArrayList<Funcionario>();

        myCalculo.custoPorDepartamento(createFuncionarioListMock(funcionarioList));

        Assert.assertNotNull(funcionarioList);

    }


    public List<Funcionario> createFuncionarioListMock(List<Funcionario> funcionarioList) {

        List<Funcionario> listaFuncionario = new ArrayList<>();

        Funcionario funcionario1 = new Funcionario("Assistente", "Administrativo", new BigDecimal(1000.0));
        Funcionario funcionario2 = new Funcionario("Gerente", "Administrativo", new BigDecimal(7000.70));
        Funcionario funcionario3 = new Funcionario("Diretor", "Administrativo", new BigDecimal(10000.45));
        Funcionario funcionario4 = new Funcionario("Assistente", "Financeiro", new BigDecimal(1300.9));
        Funcionario funcionario5 = new Funcionario("Gerente", "Financeiro", new BigDecimal(7500));
        Funcionario funcionario6 = new Funcionario("Diretor", "Financeiro", new BigDecimal(11000.0));
        Funcionario funcionario7 = new Funcionario("Estagiário", "Jurídico", new BigDecimal(700.4));
        Funcionario funcionario8 = new Funcionario("Assistente", "Jurídico", new BigDecimal(1800.90));
        Funcionario funcionario9 = new Funcionario("Gerente", "Jurídico", new BigDecimal(9500.50));
        Funcionario funcionario10 = new Funcionario("Diretor", "Jurídico", new BigDecimal(13000.0));

        listaFuncionario.add(funcionario1);
        listaFuncionario.add(funcionario2);
        listaFuncionario.add(funcionario3);
        listaFuncionario.add(funcionario4);
        listaFuncionario.add(funcionario5);
        listaFuncionario.add(funcionario6);
        listaFuncionario.add(funcionario7);
        listaFuncionario.add(funcionario8);
        listaFuncionario.add(funcionario9);
        listaFuncionario.add(funcionario10);

        return listaFuncionario;
    }


}
