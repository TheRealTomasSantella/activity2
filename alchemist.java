public class alchemist extends heroTry implements methods{
	public String[] skill = {"Chemical Rage","Alchemy","Morph","Summon"};

	public alchemist(){
		super.setType("Intelligence");
		super.setSkill(skill);
	}
	public String attack(){
		int i = super.chooseSkill();
		return "Attacking with "+skill[i];
	}
	public String block(){
		int i = super.chooseSkill();
		return "Blocking with "+skill[i];
	}
	public String showType(){
		return "Choosing "+super.getType();
	}
}