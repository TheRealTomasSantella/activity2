public class warrior extends heroTry implements methods{
	public String[] skill = {"crush","throw","evade","smash"};
	public warrior(){
		super.setType("Strength");
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