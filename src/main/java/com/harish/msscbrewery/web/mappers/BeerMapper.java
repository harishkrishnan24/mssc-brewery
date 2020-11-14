package com.harish.msscbrewery.web.mappers;

import com.harish.msscbrewery.domain.Beer;
import com.harish.msscbrewery.web.model.v2.BeerDtoV2;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDtoV2 beerToBeerDtoV2(Beer beer);

    Beer beerDtoV2ToBeer(BeerDtoV2 beerDtoV2);
}
