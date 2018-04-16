package org.seckill.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.Seckill;

public interface SeckillDao {
	/**
	 * 减库存
	 * @param seckillId
	 * @param killTime
	 * @return	如果影响行数大于1,则表示更新的记录条数;
	 * */
	int reduceNumber(@Param("seckillId") long seckillId,@Param("killTime") Date KillTIme);
	   大飞哥热锅
	/**
	 * 根据id查询秒杀对象
	 * @param seckillId
	 * @return
	 * */
	Seckill queryById(long seckillId);
	
	/**
	 * 根据偏移量查询秒杀商品列表
	 * @param offset
	 * @param limit  取多少条记录
	 * @return
	 * */
	List<Seckill> queryAll(@Param("offset") int offset,@Param("limit") int limit);
}
