package ch01.com.springinaction.knights;

public class BraveKnight implements Knight{
	private Quest quest;
	
	//constructor injection
	public BraveKnight(Quest quest) {
		this.quest = quest;
	}

	@Override
	public void embarkOnQuest() throws QuestException {
		quest.embark();
	}

}
