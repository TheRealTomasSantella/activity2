public class thief extends heroTry implements methods{
	public String[] skill = {"Quick Attack","Blink","Track","Shuriken Toss"};

	public thief(){
		super.setType("Agility");
		super.setSkill(skill);
	}
	public String attack(){
		int i = super.chooseSkill();
		return "Attacking with "+skill[i];
	}
	public String block(){
		int i = chooseSkill();
		return "Blocking with "+skill[i];
	}
	public String showType(){
		return "Choosing "+super.getType();
	}
}