/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BioMEtricAuth;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

/**
 *
 * @author Wimukthi
 */
public class BioMetricAuthenticationListener implements KeyListener{
    ArrayList<Long> timePressedArray;
    ArrayList<Long> timeReleasedArray;
    ArrayList<String> pressedKeysArray;
    ArrayList<String> releasedKeysArray;
    
    //constructor
    public BioMetricAuthenticationListener() {
        timePressedArray = new ArrayList();
        timeReleasedArray = new ArrayList();
        pressedKeysArray = new ArrayList();
        releasedKeysArray = new ArrayList();
    }
    @Override
    public void keyTyped(KeyEvent e) {
        System.out.print("");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        timePressedArray.add(System.currentTimeMillis());
        pressedKeysArray.add(KeyEvent.getKeyText(e.getKeyCode()));
    }

    @Override
    public void keyReleased(KeyEvent e) {
        timeReleasedArray.add(System.currentTimeMillis());
        releasedKeysArray.add(KeyEvent.getKeyText(e.getKeyCode()));
    }
    
    //method to print values in console
    public void informationShowing() {
        int value;
        for(int i = 1; i < timePressedArray.size(); i++) {
            value = (int) (timePressedArray.get(i) - timePressedArray.get(i - 1));
            System.out.print(value + " ");
        }
        System.out.print("   ");
        for(int i = 0; i < timeReleasedArray.size(); i++) {
            value = (int) (timeReleasedArray.get(i) - timePressedArray.get(i));
            System.out.print(value + " ");
        }
        System.out.print("   ");
        for(int i = 0; i < pressedKeysArray.size(); i++) {
            System.out.print(pressedKeysArray.get(i) + " ");
        }
        System.out.println("");
    }
    
    //method to get pressing time
    public Integer[] getPressingTime() {
        Integer[] timeValue = new Integer[timePressedArray.size() - 1];
        for(int i = 1; i < timePressedArray.size(); i++) {
            timeValue[i - 1] = (int) (timePressedArray.get(i) - timePressedArray.get(i - 1));
        }
        return timeValue;
    }
    
    //method to get pressed keys
    public String getPressedKeys() {
        String temp = "";
        for(int i = 0; i < pressedKeysArray.size() - 1; i++) {
            temp = temp + pressedKeysArray.get(i) + " ";
        }
        temp = temp + pressedKeysArray.get(pressedKeysArray.size() - 1);
        return temp;
    }
    
    //method to get releasing time
    public Integer[] getReleasingTime() {
        Integer[] temp = new Integer[timeReleasedArray.size() - 1];
        for(int i = 1; i < timeReleasedArray.size(); i++) {
            temp[i - 1] = (int) (timeReleasedArray.get(i) - timeReleasedArray.get(i - 1));
        }
        return temp;
    }
    
    //method to get released keys
    public String[] getReleasedKeys() {
        String[] temp = new String[releasedKeysArray.size()];
        for(int i = 0; i < releasedKeysArray.size(); i++) {
            temp[i] = releasedKeysArray.get(i);
        }
        return temp;
    }
    
    //method to calculate time differences
    public Integer[] getTimeDifferences() {
        Integer[] temp = new Integer[timePressedArray.size()];
        for(int i = 0; i < timePressedArray.size(); i++) {
            temp[i] = (int) (timePressedArray.get(i) - timeReleasedArray.get(i));
        }
        return temp;
    }
    
    //method to clear arrays
    public void clear() {
        timePressedArray.clear();
        timeReleasedArray.clear();
        pressedKeysArray.clear();
        releasedKeysArray.clear();
    }
}
