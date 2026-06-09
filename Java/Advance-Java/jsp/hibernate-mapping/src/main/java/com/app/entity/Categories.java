package com.app.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Categories {

    @Id
    private int id;

    private String catName;

    @ManyToMany(targetEntity = Items.class, cascade = CascadeType.ALL)
    @JoinTable(
        name = "category_items",

        joinColumns = @JoinColumn(
            name = "catId_fk",
            referencedColumnName = "id"
        ),

        inverseJoinColumns = @JoinColumn(
            name = "item_id_fk",
            referencedColumnName = "itemId"
        )
    )
    private Set items;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public Set getItems() {
		return items;
	}

	public void setItems(Set items) {
		this.items = items;
	}
    
}