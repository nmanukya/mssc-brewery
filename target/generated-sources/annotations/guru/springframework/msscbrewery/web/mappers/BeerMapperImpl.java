package guru.springframework.msscbrewery.web.mappers;

import guru.springframework.msscbrewery.domain.Beer;
import guru.springframework.msscbrewery.domain.Beer.BeerBuilder;
import guru.springframework.msscbrewery.web.model.BeerDto;
import guru.springframework.msscbrewery.web.model.BeerDto.BeerDtoBuilder;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-01-20T14:48:33+0100",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 12 (Oracle Corporation)"
)
@Component
public class BeerMapperImpl implements BeerMapper {

    @Override
    public BeerDto beerToBeerDto(Beer beer) {
        if ( beer == null ) {
            return null;
        }

        BeerDtoBuilder beerDto = BeerDto.builder();

        beerDto.id( beer.getId() );
        beerDto.beerName( beer.getBeerName() );
        beerDto.beerStyle( beer.getBeerStyle() );
        beerDto.upc( beer.getUpc() );

        return beerDto.build();
    }

    @Override
    public Beer beerDtoToBeer(BeerDto dto) {
        if ( dto == null ) {
            return null;
        }

        BeerBuilder beer = Beer.builder();

        beer.id( dto.getId() );
        beer.beerName( dto.getBeerName() );
        beer.beerStyle( dto.getBeerStyle() );
        beer.upc( dto.getUpc() );

        return beer.build();
    }
}
