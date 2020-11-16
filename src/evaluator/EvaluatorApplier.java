package evaluator;
import java.io.File;
import io.ExpressionReader;
import io.ResultWriter;

/**
 * EvaluatorApplier
 */

public class EvaluatorApplier {
    //Generamos variables para la cadena de entrada y salida 
    String in, out;
    
    //Constructor de la clase, incializamos las variables
    public EvaluatorApplier(String in, String out) {
        this.in = in;
        this.out = out;
    }
    
    //Método para la aplicar la evaluación.
    public void apply() {
        
        //Se inicializa el arreglo tipo String
        String[] expr = new ExpressionReader(in).getLines();
        
        //Hace un arreglo int del tamaño que se mando el arreglo expr
        int[] results = new int[expr.length];
        
        //Recorre el arreglo results 
        for (int i = 0; i < expr.length; ++i)
            results[i] = Evaluator.evaluate(expr[i]);
        
        //Se envía a la clase ResultWriter al metodo results para imprimir el resultado. 
        new ResultWriter(out).writeResults(results);
    }
}
