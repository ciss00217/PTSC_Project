package tw.com.ptsc.common.database.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 會員資料檔
 */
@Entity
@Table(name = "MemberDemo", schema = "Member")
public class MemberDemo implements Serializable {

  /** serialVersionUID */
  private static final long serialVersionUID = 1L;

  /** 唯一序號 */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long seqNo;

  /** 中文姓名 */
  @Column(columnDefinition = "nvarchar(35)")
  private String name;

  /** 身分證 ID */
  @Column(name = "IDNO")
  private String idno;

  /** 使用者代號 */
  @Column(name = "UserID")
  private String userId;

  /** 密碼 */
  @Column(name = "PSD")
  private String psd;

}
