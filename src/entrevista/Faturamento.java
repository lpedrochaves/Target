/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entrevista;

/**
 *
 * @author pedro
 */
public class Faturamento {

    public static void main(String[] args) {

        Double sp = 67836.43;
        Double rj = 36678.66;
        Double mg = 29229.88;
        Double es = 27165.48;
        Double outros = 19849.53;
        Double total = sp + rj + mg + es + outros;

        Double percentualSp = (sp / total) * 100,
                percentualRj = (rj / total) * 100,
                percentualMg = (mg / total) * 100,
                percentualEs = (es / total) * 100,
                percentualOutros = (outros / total) * 100;
        
        System.out.println("Faturamento total: R$" + total);
        System.out.printf("%s%.2f%s \n", "Percentual SP: ", percentualSp, "%");
        System.out.printf("%s%.2f%s \n", "Percentual SP: ", percentualRj, "%");
        System.out.printf("%s%.2f%s \n", "Percentual SP: ", percentualMg, "%");
        System.out.printf("%s%.2f%s \n", "Percentual SP: ", percentualEs, "%");
        System.out.printf("%s%.2f%s \n", "Percentual SP: ", percentualOutros, "%");
    }
}
