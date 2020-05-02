package naqn.springboot.waste;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WasteService {

	@Autowired WasteRepository wasteRepo;
	
	public List<Waste> getAllWastes() {
		List<Waste> wasteList = new ArrayList<>();
		wasteRepo.findAll().forEach(wasteList::add);
		return wasteList;
	}
	
	public Waste getWaste(String id) {
		return wasteRepo.findOne(id);		
	}

	public Waste addWaste(Waste waste) {
		return wasteRepo.save(waste);
	}

	public Waste updateWaste(String id, Waste waste) {
		waste.setId(id);
		return wasteRepo.save(waste);
	}
	
	public void deleteWaste(String id) {		
		wasteRepo.delete(id);		
	}	
	
}
