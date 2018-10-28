import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.attribute.Attribute;
import javax.print.event.PrintServiceAttributeEvent;
import javax.print.event.PrintServiceAttributeListener;

public class HandlePrintServiceAttributeChanges {

	public static void main(String[] args) throws Exception {

		// Locate the default print service for this environment.
		PrintService service = PrintServiceLookup.lookupDefaultPrintService();

		service.addPrintServiceAttributeListener(new CustomPrintServiceAttributeListener());
		service.

	}

	private static class CustomPrintServiceAttributeListener implements PrintServiceAttributeListener {

		@Override
		public void attributeUpdate(PrintServiceAttributeEvent psae) {

			Attribute[] attrs = psae.getAttributes().toArray();

			for (int i=0; i<attrs.length; i++) {
			    String attrName = attrs[i].getName();
			    String attrValue = attrs[i].toString();
			    System.out.println("Attribute updated : " + attrName + " with value: " + attrValue);
			}

		}

	}

}