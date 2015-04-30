public class archer extends heroTry implements methods{
	private String[] skill = {"run","split shot","power shot","invinsible"};
	public archer(){
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