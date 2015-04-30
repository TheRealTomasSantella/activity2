public class heroTry{
	private String type;
	private String[] skill;

	public heroTry(){
		type = "";
		skill = new String[4];
	}
	public heroTry(String type){
		type = this.type;
		skill = new String[4];
	}
	public String getType(){
		return type;
	}
	public String[] getSkill(){
		return skill;
	}
	public void setType(String t){
		type = t;
	}
	public void setSkill(String[] s){
		skill = this.skill;
	}
	public int chooseSkill(){
		int i = (int)(Math.random() * 4);
		return i;
	}
}