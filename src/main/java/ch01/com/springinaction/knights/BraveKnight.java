package ch01.com.springinaction.knights;

public class BraveKnight implements Knight{
	private Quest quest;
	private Minstrel minstrel;
	
	//constructor injection
//	public BraveKnight(Quest quest) {
//		this.quest = quest;
//	}
	
	public BraveKnight(Quest quest, Minstrel minstrel) {
		this.quest = quest;
		this.minstrel = minstrel;
	}



	@Override
	public void embarkOnQuest() throws QuestException {
		//minstrel.singBeforeQuest();
		quest.embark();
		//minstrel.singAfterQuest();
	}

}
