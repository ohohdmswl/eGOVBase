package projectNm.user.board.service.impl;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.egovframe.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import projectNm.cmmn.dao.CmmnDao;
import projectNm.cmmn.model.BoardVO;
import projectNm.user.board.service.BoardService;

@Service("boardService")
public class BoardServiceImpl extends EgovAbstractServiceImpl implements BoardService{

	//사용하지 않는 코드 또는 불필요한 코드가 있을 경우 경고를 억제시킴.
	@SuppressWarnings("unused")
	private static final Logger LOGGER = LoggerFactory.getLogger(BoardServiceImpl.class);
	
	/** DAO */
	@Resource(name="cmmnDao")
	private CmmnDao cmmnDao;

	@Override
	public List<Map<String, Object>> selectTestBoard(BoardVO searchVO) throws IOException, SQLException {
		System.out.println("서비스임플");
		return cmmnDao.selectList("board.selectTestBoard");
	}
	
	
	
}
