public class hero{
	private String[] type = {"Strength","Agility","Intelligence","Luck"};
	private String[] skills = {"stun","damage","protect","ultimate"};
	public String[] getType(){
		return type;
	}
	public String[] skills(){
		return skills;
	}
	public void setType(String[] type){
		type = this.type;
	}
	public void setSkills(String[] skills){
		skills = this.skills;
	}
	public int chooseSkill(){
		int x = (int)(Math.random() * 4);
		return x;
	}
	public String showType(){
		int x = chooseSkill();
		return "Choosing type "+type[x];
	}
	public String attack(){
		int i = chooseSkill();
		return "Attacking with "+ skills[i];
	}
	public String block(){
		int i = chooseSkill();
		return "Blocking with "+ skills[i];
	}
}