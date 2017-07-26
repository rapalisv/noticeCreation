package com.david.vitali.www.domain.mapper;

import org.mapstruct.MapperConfig;
import org.mapstruct.MappingInheritanceStrategy;
import org.mapstruct.ReportingPolicy;

/**
 * Central MapStruct Configuration.
 * 
 * @author rapalisv Date: 26.07.2017
 *
 */
@MapperConfig(uses = {}, unmappedTargetPolicy = ReportingPolicy.ERROR,
    mappingInheritanceStrategy = MappingInheritanceStrategy.AUTO_INHERIT_FROM_CONFIG)
public interface CentralMapperConfig {

}
