package plugin.enemydown.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * コマンドを実行して動かすプラグイン処理の規定クラスです。
 */
public abstract class BaseCommand implements CommandExecutor {

  @Override
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
    if(sender instanceof Player player) {
      return onExecutePlayerCommand(player, command, label, args);
    } else {
      return onExecuteNPCCommand(sender, command, label, args);
    }
  }

  /**
   * コマンド実行者がプレイヤーだった場合に実行します
   * @param command コマンド
   * @param label ラベル
   * @param args コマンド引数
   * @param player コマンドを実行した人
   * @return 処理の実行者有無
   */
  public abstract boolean onExecutePlayerCommand(Player player, Command command, String label, String[] args);

  /**
   * コマンド実行者がプレイヤー以外だった場合に実行します
   * @param sender コマンド実行者
   * @param command コマンド
   * @param label ラベル
   * @param args コマンド引数
   * @return 処理の実行者有無
   */
  public abstract boolean onExecuteNPCCommand(CommandSender sender, Command command, String label, String[] args);

}
