public class main{
	public static void main(String[] args) {
		int i = 0;
		do{
			warrior war = new warrior();
			System.out.println(war.showType());
			System.out.println(war.attack());
			System.out.println(war.block()+"\n");
			archer arch = new archer();
			System.out.println(arch.showType());
			System.out.println(arch.attack());
			System.out.println(arch.block()+"\n");
			alchemist alch = new alchemist();
			System.out.println(alch.showType());
			System.out.println(alch.attack());
			System.out.println(alch.block()+"\n");
			wizard wiz = new wizard();
			System.out.println(wiz.showType());
			System.out.println(wiz.attack());
			System.out.println(wiz.block()+"\n");
			thief kawatan = new thief();
			System.out.println(kawatan.showType());
			System.out.println(kawatan.attack());
			System.out.println(kawatan.block()+"\n");
			System.out.println("*-------------------------------------*");
			i++;
		}while(i <= 4);
	}
}