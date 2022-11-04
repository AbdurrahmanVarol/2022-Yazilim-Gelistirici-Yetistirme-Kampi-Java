package kodlama.io.rentACar.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.conretes.Brand;

@Service
public class BrandManager implements BrandService {
	private BrandRepository _brandRepository;

	@Autowired
	public BrandManager(BrandRepository brandRepository) {
		_brandRepository = brandRepository;
	}

	@Override
	public List<GetAllBrandsResponse> getAll() {
		return new ArrayList<GetAllBrandsResponse>();
	}

	@Override
	public void add(CreateBrandRequest createBrandRequest) {
		Brand brand = new Brand();
		brand.setName(createBrandRequest.getName());
		_brandRepository.save(brand);
		
	}
}
