package com.springmvc.api.v1.mapper;

import com.springmvc.api.v1.model.VendorDTO;
import com.springmvc.domain.Vendor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class VendorMapperImp implements VendorMapper {

    @Override
    public VendorDTO vendorToVendorDTO(Vendor vendor) {
        VendorDTO vendorDTO = new VendorDTO();
        if (vendorDTO == null) {
            return vendorDTO;
        }
        vendorDTO.setName(vendor.getName());
        return vendorDTO;
    }

    @Override
    public Vendor vendorDTOtoVendor(VendorDTO vendorDTO) {
        Vendor vendor = new Vendor();
        if (vendorDTO == null) {
            return vendor;
        }
        vendor.setName(vendorDTO.getName());
        return vendor;
    }
}
