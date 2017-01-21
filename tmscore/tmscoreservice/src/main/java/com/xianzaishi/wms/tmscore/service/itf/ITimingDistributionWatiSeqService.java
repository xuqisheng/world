package com.xianzaishi.wms.tmscore.service.itf;

import java.util.List;

import com.xianzaishi.wms.tmscore.vo.TimingDistributionWatiSeqVO;
import com.xianzaishi.wms.tmscore.vo.TimingDistributionWatiSeqQueryVO;

public interface ITimingDistributionWatiSeqService {

	public Boolean addTimingDistributionWatiSeqVO(
			TimingDistributionWatiSeqVO timingDistributionWatiSeqVO);

	public List<TimingDistributionWatiSeqVO> queryTimingDistributionWatiSeqVOList(
			TimingDistributionWatiSeqQueryVO timingDistributionWatiSeqQueryVO);

	public TimingDistributionWatiSeqVO getTimingDistributionWatiSeqVOByID(
			Long id);

	public Boolean modifyTimingDistributionWatiSeqVO(
			TimingDistributionWatiSeqVO timingDistributionWatiSeqVO);

	public Boolean deleteTimingDistributionWatiSeqVOByID(Long id);

	public boolean assign(
			TimingDistributionWatiSeqVO timingDistributionWatiSeqVO);

	public boolean assignToNormal(
			TimingDistributionWatiSeqVO timingDistributionWatiSeqVO);

	public boolean deleteByDistributionID(Long distributionID);

}