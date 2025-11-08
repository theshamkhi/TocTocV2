package com.toctoc.toctoc2.application.mapper;

import com.toctoc.toctoc2.domain.client.dto.DestinataireDTO;
import com.toctoc.toctoc2.domain.client.model.Destinataire;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DestinataireMapper {

    DestinataireDTO toDTO(Destinataire destinataire);

    List<DestinataireDTO> toDTOList(List<Destinataire> destinataires);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "dateCreation", ignore = true)
    @Mapping(target = "dateModification", ignore = true)
    Destinataire toEntity(DestinataireDTO dto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "dateCreation", ignore = true)
    @Mapping(target = "dateModification", ignore = true)
    void updateEntity(DestinataireDTO dto, @MappingTarget Destinataire destinataire);
}