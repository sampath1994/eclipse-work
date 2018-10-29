
public class line {
  private String status;
  private String content;
public line(String status, String content) {
	this.status = status;
	this.content = content;
}
  @Override
  public boolean equals(Object o){
	  line l = (line)o;
	  return (this.status.equals(l.status))&&(this.content.equals(l.content));
	  
  }
  
}
