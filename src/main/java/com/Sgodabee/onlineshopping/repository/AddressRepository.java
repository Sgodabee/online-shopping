package com.Sgodabee.onlineshopping.repository;

import com.Sgodabee.onlineshopping.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("addressRepository")
public interface AddressRepository extends JpaRepository<Address, Integer> {

    Address findAddressByBilling(boolean billing);

}
