
public class AnonymousInnerclass {

	public static void main(String[] args) {
		eatable e = new eatable() {
			
			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("eating with anonymous class!");
			}
		};
		
		//e.eat();
		pizza p = new pizza();
		//p.eat();
		eatable x = e;
		x.eat();
		x = p ;
		x.eat();
		
	}

}
