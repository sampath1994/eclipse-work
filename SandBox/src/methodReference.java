
interface run{
void running(Integer i);
}

class man implements run{
	@Override
	public void running(Integer i) {
		// TODO Auto-generated method stub
		System.out.println("Running at "+i);
	}
}






class jog{
	void jogging(Integer i)
	{
		System.out.println("jogging at "+i);
	}
}



public class methodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		man m = new man();
		m.running(60);
		
		
		jog g = new jog();
		run r = g::jogging;
		
		r.running(50);
	}

}
