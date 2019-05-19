import br.com.projuris.Funcionario;
import br.com.projuris.MyCalculo;
import br.com.projuris.MyFindArray;
import br.com.projuris.MyFindChar;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        MyFindArray myFindArray = new MyFindArray();
        MyFindChar myFindChar = new MyFindChar();
        MyCalculo myCalculo = new MyCalculo();

        int[] array = {};
        int[] subArray = {};
        String word = "";

        List<Funcionario> funcionarioList = new ArrayList<Funcionario>();
        Funcionario funcionario = new Funcionario("Cargo", "Dept", new BigDecimal(1000.0));
        funcionarioList.add(funcionario);

        myCalculo.custoPorDepartamento(funcionarioList);
        myCalculo.custoPorCargo(funcionarioList);

        myFindArray.findArray(array, subArray);
        myFindChar.findChar(word);

    }
}
