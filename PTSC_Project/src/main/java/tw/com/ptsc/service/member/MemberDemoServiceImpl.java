package tw.com.ptsc.service.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tw.com.ptsc.common.database.entity.MemberDemo;
import tw.com.ptsc.common.database.reposity.MemberDemoDao;

/**
 *會員資料service 
 */
@Service
public class MemberDemoServiceImpl implements MemberDemoService{
	
	/**Dao*/
	@Autowired
	private MemberDemoDao memberDemoDao;
	
	/**
	 * 取得會員資料
	 * @return {@code List<MemberDemo>} 會員資料
	 */
	@Override
	public List<MemberDemo> getAll() {
		return memberDemoDao.findAll();
	}

}
