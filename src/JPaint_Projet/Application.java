/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPaint_Projet;

import java.awt.Color;
import java.util.ArrayList;
/**
 *
 * @author ISEN
 */
public class Application {
    private ArrayList figuresArray = null;
    private Color foregroundColor = null;
    private Color backgroundColor = null;
    private Tool selectedTool = null;
    
    public Application(){
        this.figuresArray = new ArrayList();
        this.foregroundColor = Color.WHITE;
        this.backgroundColor = Color.BLACK;
        this.selectedTool = null;
    }
}
