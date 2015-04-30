public class wizard extends heroTry implements methods{
	public String[] skill = {"Cast","Double Team","Meteor mash","Ghost Run"};

	public wizard(){
		super.setType("Intelligence");
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