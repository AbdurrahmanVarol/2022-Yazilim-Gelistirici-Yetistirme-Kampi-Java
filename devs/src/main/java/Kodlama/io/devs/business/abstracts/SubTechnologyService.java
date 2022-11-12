package Kodlama.io.devs.business.abstracts;

import java.util.List;

import Kodlama.io.devs.business.requests.CreateSubTechnologyRequest;
import Kodlama.io.devs.business.responses.GetAllSubTechnologyResponse;
import Kodlama.io.devs.business.responses.GetSubTechnologyResponse;

public interface SubTechnologyService {
	List<GetAllSubTechnologyResponse> getAllWithLanguage();

	List<GetSubTechnologyResponse> getAll();

	void add(CreateSubTechnologyRequest createSubTechnologyRequest);
}
