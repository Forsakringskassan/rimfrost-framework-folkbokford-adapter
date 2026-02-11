package se.fk.rimfrost.framework.folkbokford.adapter;

import jakarta.enterprise.context.ApplicationScoped;
import se.fk.rimfrost.framework.folkbokford.adapter.dto.FolkbokfordResponse;
import se.fk.rimfrost.framework.folkbokford.adapter.dto.ImmutableFolkbokfordResponse;
import se.fk.rimfrost.api.folkbokforing.jaxrsspec.controllers.generatedsource.model.FolkbokforingPersnrGet200Response;

@ApplicationScoped
public class FolkbokfordMapper
{

   public FolkbokfordResponse toFolkbokfordResponse(FolkbokforingPersnrGet200Response apiResponse)
   {
      if (apiResponse == null)
      {
         return null;
      }
      return ImmutableFolkbokfordResponse.builder()
            .id(apiResponse.getId())
            .fornamn(apiResponse.getFornamn())
            .efternamn(apiResponse.getEfternamn())
            .utdelningsadress(apiResponse.getAdress().getUtdelningsadress())
            .postnummer(apiResponse.getAdress().getPostnummer())
            .postort(apiResponse.getAdress().getPostort())
            .build();
   }

}
