package br.com.projuris;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyCalculo implements Calculo {

    @Override
    public List<CustoCargo> custoPorCargo(List<Funcionario> funcionarios) {

        Map<String, CustoCargo> map = new HashMap<String, CustoCargo>();

        for (Funcionario funcionario : funcionarios) {

            String cargo = funcionario.getCargo();

            if(map.containsKey(cargo)) {
                CustoCargo custoCargo = map.get(cargo);
                BigDecimal novoCusto = custoCargo.getCusto().add(funcionario.getSalario());
                custoCargo.setCusto(novoCusto);
                map.put(cargo, custoCargo);
            } else {
                map.put(cargo, new CustoCargo(funcionario.getDepartamento(), funcionario.getSalario()));
            }
        }

        return new ArrayList(map.values());
    }

    @Override
    public List<CustoDepartamento> custoPorDepartamento(List<Funcionario> funcionarios) {

        Map<String, CustoDepartamento> map = new HashMap<String, CustoDepartamento>();

        for (Funcionario funcionario : funcionarios) {

            String departamento = funcionario.getDepartamento();

            if(map.containsKey(departamento)) {
                CustoDepartamento custoDepartamento = map.get(departamento);
                BigDecimal novoCusto = custoDepartamento.getCusto().add(funcionario.getSalario());
                custoDepartamento.setCusto(novoCusto);
                map.put(departamento, custoDepartamento);
            } else {
                map.put(departamento, new CustoDepartamento(funcionario.getCargo(), funcionario.getSalario()));
            }
        }

        return new ArrayList(map.values());
    }
}
