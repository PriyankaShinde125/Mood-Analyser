package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoodAnalyserTest {

    @Test
    public void givenMessage_whenProper_shouldReturnMood() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
        String result = moodAnalyser.analyseMood();
        assertEquals("SAD",result);
    }
}
