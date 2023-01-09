package ch01.com.springinaction.knights;

public class DamselRescuingKnight implements Knight {

	private RescueDamselQuest quest;
	
	public DamselRescuingKnight() {
		quest = new RescueDamselQuest();
	}
	
	@Override
	public void embarkOnQuest() throws QuestException {
		quest.embark();

	}

}
