package naqn.springboot.waste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class WasteService {

	private List<Waste> wasteList = new ArrayList<>(Arrays.asList(
				new Waste("0001","Brodwino","Brodwino koło ujęcia wody","100", "100", "aa11bbcc111", "1588319796266734293")
			));

	public List<Waste> getAllWastes() {
		return wasteList;
	}
	
	public Waste getWaste(String id) {
		return wasteList.parallelStream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public Waste addWaste(Waste waste) {
		wasteList.add(waste);
		return waste;
	}

	public Waste updateWaste(String id, Waste waste) {
		for ( int i = 0; i < wasteList.size(); i++ ) {
			Waste t = wasteList.get(i);
			if (t.getId().equals(id)) {
				wasteList.set(i, waste);
			}
		}		
		return waste;
	}
	
	public void deleteWaste(String id) {		
		wasteList.removeIf(t -> t.getId().equals(id));
		return;
	}	
	
}
