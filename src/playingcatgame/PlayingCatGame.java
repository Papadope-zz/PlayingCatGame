/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playingcatgame;

/**
 *
 * @author User
 */
public class PlayingCatGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        isCatPlaying(true, 10);
        isCatPlaying(false, 36);
        isCatPlaying(false, 35);
        

    }

    public static boolean isCatPlaying(boolean Summer, int Temperature) {
        if (Summer) {
            
            return (Temperature >= 25) && (Temperature <= 45) ? true : false;
        } else
            
            return (Temperature >= 25) && (Temperature <= 35) ? true : false;
            
    }    
}

