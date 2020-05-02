package naqn.springboot.waste;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WasteController {

	@Autowired
	private WasteService wasteService; 
	
	@RequestMapping("/wastes")
	public List<Waste> getAllWastes() {
		return wasteService.getAllWastes();
	}

	@RequestMapping("/wastes/{id:[\\\\d]+}")
	public Waste getWaste(@PathVariable long idFromUrl) {		
		return wasteService.getWaste(idFromUrl);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/wastes")
	public Waste addWaste(@RequestBody Waste waste) {
		return wasteService.addWaste(waste);
	}

	@RequestMapping(method=RequestMethod.PUT, value="/wastes/{id}")
	public Waste updateWaste(@PathVariable Long idString, @RequestBody Waste waste) {
		return wasteService.updateWaste(idString, waste);
	}

	@RequestMapping(method=RequestMethod.DELETE, value="/wastes/{id}")
	public void updateWaste(@PathVariable Long idString) {
		wasteService.deleteWaste(idString);
	}	
	
}
