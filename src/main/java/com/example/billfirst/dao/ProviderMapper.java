package com.example.billfirst.dao;

import com.example.billfirst.entity.Provider;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProviderMapper {

    List<Provider> getProviders(Provider provider);

    Provider getProviderById(Integer pid);

    int addProvider(Provider provider);

    int deleteProviderById(Integer id);

    int updateProvider(Provider provider);

}
