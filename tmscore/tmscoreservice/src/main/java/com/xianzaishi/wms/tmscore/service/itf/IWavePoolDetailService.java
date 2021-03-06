package com.xianzaishi.wms.tmscore.service.itf;

import java.util.List;

import com.xianzaishi.wms.tmscore.vo.WavePoolDetailQueryVO;
import com.xianzaishi.wms.tmscore.vo.WavePoolDetailVO;

public interface IWavePoolDetailService {

	public Boolean addWavePoolDetailVO(WavePoolDetailVO wavePoolDetailVO);

	public List<WavePoolDetailVO> queryWavePoolDetailVOList(
			WavePoolDetailQueryVO wavePoolDetailQueryVO);

	public WavePoolDetailVO getWavePoolDetailVOByID(Long id);

	public Boolean modifyWavePoolDetailVO(WavePoolDetailVO wavePoolDetailVO);

	public Boolean deleteWavePoolDetailVOByID(Long id);

	public List<WavePoolDetailVO> getWavePoolDetailVOByWaveID(Long id);

	public Boolean batchAddWavePoolDetailVO(
			List<WavePoolDetailVO> wavePoolDetailVOs);

	public Boolean batchModifyWavePoolDetailVO(
			List<WavePoolDetailVO> wavePoolDetailVOs);

	public Boolean batchDeleteWavePoolDetailVO(
			List<WavePoolDetailVO> wavePoolDetailVOs);

	public Boolean batchDeleteWavePoolDetailVOByID(List<Long> wavePoolDetailIDs);

}