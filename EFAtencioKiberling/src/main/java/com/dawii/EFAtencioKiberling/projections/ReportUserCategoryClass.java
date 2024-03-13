package com.dawii.EFAtencioKiberling.projections;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ReportUserCategoryClass {
	private int userId;
	private String name;
	private String lastname;
	private int categoryId;
	private String categoryName;

}
