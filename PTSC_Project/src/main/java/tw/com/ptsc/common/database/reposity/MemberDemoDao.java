package tw.com.ptsc.common.database.reposity;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tw.com.ptsc.common.database.entity.MemberDemo;

/**
 * 會員資料表 Dao
 */
@Repository
public interface MemberDemoDao extends JpaRepository<MemberDemo, Long> {

}
