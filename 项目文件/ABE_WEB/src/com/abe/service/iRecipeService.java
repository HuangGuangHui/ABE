package com.abe.service;

import com.abe.entity.app.RespRecipe;

public interface iRecipeService {

	/*
	 * 创建食谱
	 * @param Recipe
	 * 
	 */
	public RespRecipe creatRecipe(String scId, String rType, String rTime,
			String rState, String uId, String rImages, String isIdAccept,
			String isIdAll);
	/**
	 * 发布食谱
	 * @param Recipe
	 */
	public RespRecipe releaseRecipe(String scId, String rType, String rTime,
			String rState, String uId, String rImages, String isIdAccept,
			String isIdAll);
}
