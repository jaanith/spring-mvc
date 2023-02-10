package com.springmvc.api.v1.mapper;

import com.springmvc.api.v1.model.VendorDTO;
import com.springmvc.domain.Vendor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class VendorMapperTest {

    public static final String NAME = "someName";
    //VendorMapper vendorMapper = VendorMapper.INSTANCE;
    VendorMapper vendorMapper = new VendorMapperImp();

    @Test
    void vendorToVendorDTO() throws Exception {
        //given
        Vendor vendor = new Vendor();
        vendor.setName(NAME);

        //when
        VendorDTO vendorDTO = vendorMapper.vendorToVendorDTO(vendor);
        vendorDTO.setName(NAME);
        //then
        assertNotNull(vendorDTO);
        assertEquals(vendor.getName(), vendorDTO.getName());
    }

    @Test
    public void vendorDTOtoVendor() throws Exception {
        //given
        VendorDTO vendorDTO = new VendorDTO();
        vendorDTO.setName(NAME);

        //when
        Vendor vendor = vendorMapper.vendorDTOtoVendor(vendorDTO);

        //then
        assertEquals(vendorDTO.getName(), vendor.getName());
        assertNotNull(vendorDTO);
    }
}