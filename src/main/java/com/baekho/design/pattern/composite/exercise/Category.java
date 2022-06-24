package com.baekho.design.pattern.composite.exercise;

import java.util.ArrayList;

public class Category extends ProductCategory {

  ArrayList<ProductCategory> productCategories;

  public Category(int id, String name, int price) {
    super(id, name, price);
    productCategories = new ArrayList<>();
  }

  @Override
  public void addProductCategory(ProductCategory productCategory) {
    productCategories.add(productCategory);
  }

  @Override
  public void removeProductCategory(ProductCategory productCategory) {
    for (ProductCategory p : productCategories) {
      if (productCategory.getId() == p.getId()) {
        productCategories.remove(p);
        break;
      }
    }
    System.out.println("상품이 없습니다.");
  }

  @Override
  public int getCount() {

    int count = 0;

    for (ProductCategory p : productCategories) {
      count += p.getCount();
    }
    return count;
  }

  @Override
  public int getPrice() {
    int price = 0;

    for (ProductCategory p : productCategories) {
      price += p.getPrice();
    }
    return price;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public int getId() {
    return id;
  }
}
