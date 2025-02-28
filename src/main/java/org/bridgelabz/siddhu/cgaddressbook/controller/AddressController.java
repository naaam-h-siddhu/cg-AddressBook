package org.bridgelabz.siddhu.cgaddressbook.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address")
public class AddressController {

    // get all the addresses
    @GetMapping()
    public String getAddresses(){
        return "List of Address";
    }

    //get the address by id
    @GetMapping("{id}")
    public String getAddress(@PathVariable Long id){
        return "Details of address id = "+id;
    }

    // add the address
    @PostMapping("/add")
    public String addAddress(){
        return "Successfully added the address ";
    }

    //update the address
    @PutMapping("/update/{id}")
    public String updateAddress(@PathVariable Long id){
        return "Successfully update the address of id "+id;
    }

    // delete the address
    @DeleteMapping("/delete/{id}")
    public String deleteAddress(@PathVariable Long id){
        return "Successfully deleted the address of id "+id;
    }

}
