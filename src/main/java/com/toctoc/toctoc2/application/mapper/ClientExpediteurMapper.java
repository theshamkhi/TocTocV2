package com.toctoc.toctoc2.application.mapper;

import com.toctoc.toctoc2.domain.client.dto.ClientExpediteurDTO;
import com.toctoc.toctoc2.domain.client.model.ClientExpediteur;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ClientExpediteurMapper {

    ClientExpediteurDTO toDTO(ClientExpediteur client);

    List<ClientExpediteurDTO> toDTOList(List<ClientExpediteur> clients);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "dateCreation", ignore = true)
    @Mapping(target = "dateModification", ignore = true)
    ClientExpediteur toEntity(ClientExpediteurDTO dto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "dateCreation", ignore = true)
    @Mapping(target = "dateModification", ignore = true)
    void updateEntity(ClientExpediteurDTO dto, @MappingTarget ClientExpediteur client);
}