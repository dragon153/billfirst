package com.example.billfirst.dao;

import com.example.billfirst.entity.Bill;
import com.example.billfirst.entity.BillProvider;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BillMapper {

    List<BillProvider> getBills(Bill bill);

    BillProvider getBillById(Integer bid);

    int addBill(Bill bill);

    int updateBill(Bill bill);

    int deleteBillById(Integer bid);

}
