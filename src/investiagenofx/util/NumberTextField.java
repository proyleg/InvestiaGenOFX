/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package investiagenofx.util;

import javafx.scene.control.TextField;

/**
 *
 * @author Pierre
 */
public class NumberTextField extends TextField {
    
    @Override
    public void replaceSelection(String replacement) {
        super.replaceSelection(replacement);
    }

    @Override
    public void replaceText(int start, int end, String text) {
        if (text.matches("[0-9]") || text.isEmpty()) {
            super.replaceText(start, end, text);
        }
    }
}
