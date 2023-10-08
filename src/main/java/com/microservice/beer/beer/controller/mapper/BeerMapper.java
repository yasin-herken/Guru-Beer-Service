package com.microservice.beer.beer.controller.mapper;

import com.microservice.beer.beer.controller.dto.BeerDTO;
import com.microservice.beer.beer.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface BeerMapper{

	@Mapping(target ="createdDate", ignore = true)
	@Mapping(target ="lastModifiedDate", ignore = true)
	BeerDTO beerToBeerDTO(Beer beer);

	@Mapping(target ="createdDate", ignore = true)
	@Mapping(target ="lastModifiedDate", ignore = true)
	Beer beerDTOToBeer(BeerDTO beerDTO);
}
