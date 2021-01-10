/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principamediabruta;

/**
 *
 * @author michael
 */
public class MediaBruta {
       public float margemBruta(float receitaLiquida,float custoProduto){
         float   lucroBruto= receitaLiquida - custoProduto;
         return (lucroBruto / receitaLiquida) * 100;
        
        }
}
