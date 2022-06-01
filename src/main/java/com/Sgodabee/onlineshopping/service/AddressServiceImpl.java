package com.Sgodabee.onlineshopping.service;

import com.Sgodabee.onlineshopping.repository.AddressRepository;
import com.Sgodabee.onlineshopping.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("addressService")
public class AddressServiceImpl implements AddressService {

    @Qualifier("addressRepository")
    @Autowired
    private AddressRepository addressRepository;

    @Override
    public boolean saveAddress(Address address) {
        // TODO Auto-generated method stub
        addressRepository.saveAndFlush(address);
        return true;
    }

    @Override
    public Address findAddressByBilling(boolean billing) {
        // TODO Auto-generated method stub
        return addressRepository.findAddressByBilling(billing);
    }

}
