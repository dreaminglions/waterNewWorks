package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.BizResultAlter;
import java.util.List;	

/**
 * 化验结果修改 数据层
 * 
 * @author ruoyi
 * @date 2019-12-16
 */
public interface BizResultAlterMapper 
{
	/**
     * 查询化验结果修改信息
     * 
     * @param alterId 化验结果修改ID
     * @return 化验结果修改信息
     */
	public BizResultAlter selectBizResultAlterById(Long alterId);
	
	/**
     * 查询化验结果修改列表
     * 
     * @param bizResultAlter 化验结果修改信息
     * @return 化验结果修改集合
     */
	public List<BizResultAlter> selectBizResultAlterList(BizResultAlter bizResultAlter);
	
	/**
     * 新增化验结果修改
     * 
     * @param bizResultAlter 化验结果修改信息
     * @return 结果
     */
	public int insertBizResultAlter(BizResultAlter bizResultAlter);
	
	/**
     * 修改化验结果修改
     * 
     * @param bizResultAlter 化验结果修改信息
     * @return 结果
     */
	public int updateBizResultAlter(BizResultAlter bizResultAlter);
	
	/**
     * 删除化验结果修改
     * 
     * @param alterId 化验结果修改ID
     * @return 结果
     */
	public int deleteBizResultAlterById(Long alterId);
	
	/**
     * 批量删除化验结果修改
     * 
     * @param alterIds 需要删除的数据ID
     * @return 结果
     */
	public int deleteBizResultAlterByIds(String[] alterIds);
	
}