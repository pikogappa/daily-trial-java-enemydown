package plugin.enemydown.mapper.data;

/**
 * プレイヤーのスコア情報を扱うオブジェクト
 * DBに存在するテーブルと連動する
 */

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlayerScore {

  private int id;
  private String playerName;
  private int score;
  private String difficulty;
  private String registeredAt;
}
