package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoodAnalyserTest {

    @Test
    public void givenSadMoodMessage_whenProper_shouldReturnSadMood() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
        String result = moodAnalyser.analyseMood();
        assertEquals("SAD",result);
    }
    @Test
    public void givenHappyMoodMessage_whenProper_shouldReturnHappyMood() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in happy mood");
        String result = moodAnalyser.analyseMood();
        assertEquals("HAPPY",result);
    }
    @Test
    public void givenMoodMessage_whenNull_shouldReturnHappyMood() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String result = moodAnalyser.analyseMood();
        assertEquals("HAPPY",result);
    }
}
