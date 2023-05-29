/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import view.Tela;

/**
 *
 * @author marce
 */
public class Minuto implements Runnable{
    @Override
    public void run() {
        int i=Integer.parseInt(Tela.txtMin.getText());
        for (;;) {
            Tela.txtMin.setText(i+"");
            i++;
            if(i==59)
                i=0;
            try {
                Thread.sleep(60000);
            } catch (Exception e) {

            }
        }
    }
}