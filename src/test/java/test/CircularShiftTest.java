package test;

import org.junit.Test;

import static org.junit.Assert.*;

import CS3213.CircularShift;
import CS3213.RequiredWords;

import java.util.HashSet;

public class CircularShiftTest {

    @Test
    public void testGetCircularShifts() throws Exception {
        CircularShift circularShit = new CircularShift("tEst this Circular shIft");
        String[] shifts = circularShit.getCircularShifts();
        HashSet<String> testSet = new HashSet<String>();
        for (String str : shifts) {
            testSet.add(str);
        }
        assertTrue(testSet.size() == 4);
        assertTrue(testSet.contains("Test This Circular Shift"));
        assertTrue(testSet.contains("This Circular Shift Test"));
        assertTrue(testSet.contains("Circular Shift Test This"));
        assertTrue(testSet.contains("Shift Test This Circular"));
    }
    
    @Test
    public void testFilterCircularShifts() throws Exception {
    	RequiredWords requiredWords = RequiredWords.getRequiredWords();
    	requiredWords.addRequiredWords("Test");
    	requiredWords.addRequiredWords("THIs");
    	requiredWords.addRequiredWords("Hello");
    	
        CircularShift circularShift = new CircularShift("tEst this Circular shIft");
        String[] shifts = circularShift.getCircularShifts();
        HashSet<String> testSet = new HashSet<String>();
        for (String str : shifts) {
            testSet.add(str);
        }
        assertTrue(testSet.size() == 2);
        assertTrue(testSet.contains("Test This Circular Shift"));
        assertTrue(testSet.contains("This Circular Shift Test"));
        assertFalse(testSet.contains("Circular Shift Test This"));
        assertFalse(testSet.contains("Shift Test This Circular"));
    }
}
