import java.util.Observable;
import java.util.Observer;

public class observableTest {

	public static void main(String[] args) {
		ObservableValue ov = new ObservableValue(0);
	      TextObserver to = new TextObserver(ov);
	      StrObserver  so = new StrObserver(ov);
	      ov.addObserver(to);
	      ov.addObserver(so);
	      ov.setValue(10);
	}
}

	 class ObservableValue extends Observable
	{
	   private int n = 0;
	   public ObservableValue(int n)
	   {
	      this.n = n;
	   }
	   public void setValue(int n)
	   {
	      this.n = n;
	      setChanged();
	      notifyObservers();
	   }
	   public int getValue()
	   {
	      return n;
	   }
	}
	 
	 
	 
	  class TextObserver implements Observer
	 {
	    private ObservableValue ov = null;
	    public TextObserver(ObservableValue ov)
	    {
	       this.ov = ov;
	    }
	    public void update(Observable obs, Object obj)
	    {
	       if (obs == ov)
	       {
	    	   System.out.print("TextObserver---update method triggered!");
	          System.out.println(ov.getValue());
	       }
	    }
	 }
	  
	  class StrObserver implements Observer
		 {
		    private ObservableValue ov = null;
		    public StrObserver(ObservableValue ov)
		    {
		       this.ov = ov;
		    }
		    public void update(Observable obs, Object obj)
		    {
		       if (obs == ov)
		       {
		    	   System.out.print("StrObserver---update method triggered!");
		          System.out.println(ov.getValue());
		       }
		    }
		 }