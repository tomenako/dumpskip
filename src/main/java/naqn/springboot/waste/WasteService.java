package naqn.springboot.waste;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class WasteService {

	@Autowired WasteRepository wasteRepo;
	
	public List<Waste> getAllWastes() {
		List<Waste> wasteList = new ArrayList<>();
		wasteRepo.findAll().forEach(wasteList::add);
		return wasteList;
	}
	
	public Waste getWaste(Long id) {
		return wasteRepo.findById(id);		
	}

	@Transactional
	public Waste addWaste(Waste waste) {
		return wasteRepo.save(waste);
	}

	@Transactional
	public Waste updateWaste(Long id, Waste waste) {
		if (wasteRepo.existsById(id)) {
			waste.setId(id);
			return wasteRepo.save(waste);
		} else {
			return null;
		}
	}
	
	@Transactional
	public void deleteWaste(Long id) {
		Waste waste = wasteRepo.findById(id);
		if (null != waste) {
			wasteRepo.delete(waste);			
		}
	}	
	
}
