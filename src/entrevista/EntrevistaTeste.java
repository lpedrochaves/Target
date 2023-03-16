/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entrevista;

import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author pedro
 */
public class EntrevistaTeste {

    public static void main(String[] args) {

        JSONParser jSONParser = new JSONParser();
        try {
            
            FileReader reader = new FileReader("dados.json");
            Object obj = jSONParser.parse(reader);
            JSONArray vendas = (JSONArray) obj;
            
            vendas.forEach(venda -> parserVendaEfetuada((JSONObject) venda));
            
        } catch (Exception e) {
        }
    }

    private static void parserVendaEfetuada(JSONObject venda) {
        System.out.println(venda.get("dia"));
        System.out.println(venda.get("valor"));
        System.out.println("===========");
    }
}
