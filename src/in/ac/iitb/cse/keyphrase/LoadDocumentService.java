package in.ac.iitb.cse.keyphrase;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/load")
public class LoadDocumentService {

	@GET
	@Produces("text/plain")
	public String loadDoc() throws IOException {
		System.out.println("HEY!!");
		return new String(Files.readAllBytes(
				Paths.get("/Users/ashish/Documents/personal/phd/pakdd extension/wiki20/documents/287.txt")));
	}
}
