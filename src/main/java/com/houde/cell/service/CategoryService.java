package com.houde.cell.service;

import com.houde.cell.dataoject.ProductCategory;

import java.util.List;

/**
 * 类目
 * Created by houde
 * 2019-03-05 15:12
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
