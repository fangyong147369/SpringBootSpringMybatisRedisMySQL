package com.zc.sys.promotion.dao;
import com.zc.sys.common.dao.BaseDao;
import com.zc.sys.common.model.jpa.PageDataList;
import com.zc.sys.promotion.entity.PromotionPrizeRecord;
import com.zc.sys.promotion.model.PromotionPrizeRecordModel;
/**
 * 活动推广奖励记录
 * @author zp
 * @version 2.0.0.0
 * @since 2017年11月09日
 */
public interface PromotionPrizeRecordDao extends BaseDao<PromotionPrizeRecord> {

	/**
	 * 列表
	 * @param model
	 * @return
	 */
	PageDataList<PromotionPrizeRecord> list(PromotionPrizeRecordModel model);
	
}