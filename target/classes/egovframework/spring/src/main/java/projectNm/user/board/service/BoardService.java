package projectNm.user.board.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import projectNm.cmmn.model.BoardVO;

public interface BoardService {

	public List<Map<String, Object>> selectTestBoard(BoardVO searchVO)throws IOException, SQLException;

}
