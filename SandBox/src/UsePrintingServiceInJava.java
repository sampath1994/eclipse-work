
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.print.CancelablePrintJob;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.ServiceUI;
import javax.print.SimpleDoc;
import javax.print.attribute.Attribute;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.event.PrintJobAdapter;
import javax.print.event.PrintJobEvent;

public class UsePrintingServiceInJava {

	private static boolean jobRunning = true;

	public static void main(String[] args) throws Exception {

		// Open the image file

  InputStream is = new BufferedInputStream(new FileInputStream("C:\\Users\\promod\\Desktop\\Lab.pdf"));

  // create a PDF doc flavor

  DocFlavor flavor = DocFlavor.INPUT_STREAM.AUTOSENSE;

  // Locate the default print service for this environment.

  PrintService service = PrintServiceLookup.lookupDefaultPrintService();

  PrintService[] l = PrintServiceLookup.lookupPrintServices(null, null);
   
  for(PrintService p : l)
  {  
  			for(Attribute a :p.getAttributes().toArray())
  			{
  				System.out.println(a.getName());
  			}
  			
	 System.out.println( p.toString());
  }
  // Create and return a PrintJob capable of handling data from

  // any of the supported document flavors.

  /*PrintService[] services = PrintServiceLookup.lookupPrintServices(null, null);
  PrintService svc = PrintServiceLookup.lookupDefaultPrintService();
  PrintRequestAttributeSet attrs = new HashPrintRequestAttributeSet();
  PrintService selection = ServiceUI.printDialog(
     null, 100, 100, services, svc, null, attrs);*/
  
  
  
  DocPrintJob printJob = service.createPrintJob();
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      

  printJob.addPrintJobListener(new JobCompleteMonitor());

  // Construct a SimpleDoc with the specified 

  // print data, doc flavor and doc attribute set.

  Doc doc = new SimpleDoc(is, flavor, null);

  // Print a document with the specified job attributes.

  printJob.print(doc, null);
 /* Thread.sleep(5000);
  try {
  CancelablePrintJob cancelableJob = (CancelablePrintJob) printJob;
  cancelableJob.cancel();
	}
	catch (PrintException e) {
		System.out.println("Failed to cancel printing:" + e.getMessage());
	}*/
  
  while (jobRunning) {
  	Thread.sleep(1000);

  }

  System.out.println("Exiting app");

  is.close();

	}

	private static class JobCompleteMonitor extends PrintJobAdapter {
		@Override
		public void printJobCompleted(PrintJobEvent jobEvent) {
			System.out.println("Job completed");
			jobRunning = false;
		}
	}

}