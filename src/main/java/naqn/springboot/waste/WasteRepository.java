package naqn.springboot.waste;

import org.springframework.data.repository.CrudRepository;

public interface WasteRepository extends CrudRepository<Waste, String> {

	Waste findById(Long id);
	boolean existsById(Long id);	
	
}
