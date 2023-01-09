package ch01.com.springinaction.knights;

import static org.mockito.Mockito.*;
import org.junit.Test;

import ch01.com.springinaction.knights.BraveKnight;
import ch01.com.springinaction.knights.Quest;
import ch01.com.springinaction.knights.QuestException;

public class BraveKnightTest {
    @Test
    public void knightShouldEmbarkOnQuest() throws QuestException {
        Quest mockQuest = mock(Quest.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();

        verify(mockQuest,times(1)).embark();
    }
}
