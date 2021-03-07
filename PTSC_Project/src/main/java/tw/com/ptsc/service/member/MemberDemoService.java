package tw.com.ptsc.service.member;

import java.util.List;

import tw.com.ptsc.common.database.entity.MemberDemo;

/**
 *會員資料service interface
 */
public interface MemberDemoService {

	/**
	 * 取得會員資料
	 * @return {@code List<MemberDemo>} 會員資料
	 */
	List<MemberDemo> getAll();

}
