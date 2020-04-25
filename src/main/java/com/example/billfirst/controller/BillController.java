package com.example.billfirst.controller;

import com.example.billfirst.dao.BillMapper;
import com.example.billfirst.dao.ProviderMapper;
import com.example.billfirst.entity.Bill;
import com.example.billfirst.entity.BillProvider;
import com.example.billfirst.entity.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
public class BillController {
    @Autowired
    BillMapper billMapper;
    @Autowired
    ProviderMapper providerMapper;

    @GetMapping("/bills")
    public String list(Map<String,Object> map, Bill bill){
        List<BillProvider> billProviders=billMapper.getBills(bill);
        List<Provider> providers=providerMapper.getProviders(null);
        map.put("billProviders",billProviders);
        map.put("providers",providers);
        //用于搜索出回显数据
        map.put("billName", bill.getBillName());
        map.put("pid", bill.getPid());
        return "bill/list";
    }

    @GetMapping("/bill/{bid}")
    public String view(@PathVariable("bid")Integer bid,
                       @RequestParam(value = "type",defaultValue = "view")String type,
                       Map<String,Object> map){
        BillProvider billProvider=billMapper.getBillById(bid);
        if("update".equals(type)){
            List<Provider> providers=providerMapper.getProviders(null);
            map.put("providers",providers);
        }
        map.put("billProvider",billProvider);
        return "bill/"+type;
    }

    //修改信息
    @PutMapping("/bill")
    public String update(Bill bill){
        billMapper.updateBill(bill);
        return "redirect:/bills";
    }

    //前往添加页面
    @GetMapping("/bill")
    public String toAddPage(Map<String,Object> map){
        map.put("providers",providerMapper.getProviders(null));
        return "bill/add";
    }

    //添加数据
    @PostMapping("/bill")
    public String add(Bill bill){
        billMapper.addBill(bill);
        return "redirect:/bills";
    }

    @DeleteMapping("/bill/{bid}")
    public String delete(@PathVariable("bid")Integer bid){
        billMapper.deleteBillById(bid);
        return "redirect:/bills";
    }

}
