/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.concurrent.atomic.AtomicBoolean;
import view.Tela;

/**
 *
 * @author marce
 */
public class Segundo implements Runnable{
    private final AtomicBoolean running = new AtomicBoolean(false);
    @Override
    public void run() {
        int i=Integer.parseInt(Tela.txtSeg.getText());
        for (;;) {
            Tela.txtSeg.setText(i+"");
            i++;
            if(i==59)
                i=0;
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }
    }
    public void parar() {
        running.set(false);
    }
}