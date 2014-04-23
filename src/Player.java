//玩家类
import java.util.ArrayList;


public class Player {
	int pid;//玩家ID
	String pname;//玩家昵称
	String pwd;//玩家密码
	int rest_game_times;//剩余游戏次数
	int money;//拥有金钱数
	ArrayList owned_prop;//已拥有的道具
	int ranks;//玩家等级
	Record record;//玩家游戏记录
	
	//玩家登陆
	boolean login(int pid,String pwd){
		return true;
	}
	
	//购买道具
	boolean buy_prop(Prop prop){
		if(money>=prop.money){
			owned_prop.add(prop);
			return true;
		}else{
			return false;
		}
	}
	
	//使用道具
	int use_prop(Prop prop){
		return prop.prop_id;
	}
	
	//开始游戏
	boolean start_game(){
		if(rest_game_times>0){
			return true;
		}else{
			return false;
		}
	}
	
	//移动方块
	int[][] move(){
		return null;
	}
	
	//获取玩家信息
	String get_player_info(){
		String info=String.valueOf(pid)+" "+pname+" "+
	                String.valueOf(rest_game_times)+" "+String.valueOf(money)+" "+String.valueOf(ranks);
		return info;
	}
	
	//获取游戏记录
	Record show_reocrd(){
		return record;
	}
}
