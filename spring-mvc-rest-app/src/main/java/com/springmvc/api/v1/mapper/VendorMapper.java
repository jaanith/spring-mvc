package com.springmvc.api.v1.mapper;

import com.springmvc.api.v1.model.VendorDTO;
import com.springmvc.domain.Vendor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

//@Mapper(componentModel = "spring")
public interface VendorMapper {


    //VendorMapper INSTANCE = Mappers.getMapper(VendorMapper.class);


    VendorDTO vendorToVendorDTO(Vendor vendor);

    Vendor vendorDTOtoVendor(VendorDTO vendorDTO);
}
