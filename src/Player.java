//�����
import java.util.ArrayList;


public class Player {
	int pid;//���ID
	String pname;//����ǳ�
	String pwd;//�������
	int rest_game_times;//ʣ����Ϸ����
	int money;//ӵ�н�Ǯ��
	ArrayList owned_prop;//��ӵ�еĵ���
	int ranks;//��ҵȼ�
	Record record;//�����Ϸ��¼
	
	//��ҵ�½
	boolean login(int pid,String pwd){
		return true;
	}
	
	//�������
	boolean buy_prop(Prop prop){
		if(money>=prop.money){
			owned_prop.add(prop);
			return true;
		}else{
			return false;
		}
	}
	
	//ʹ�õ���
	int use_prop(Prop prop){
		return prop.prop_id;
	}
	
	//��ʼ��Ϸ
	boolean start_game(){
		if(rest_game_times>0){
			return true;
		}else{
			return false;
		}
	}
	
	//�ƶ�����
	int[][] move(){
		return null;
	}
	
	//��ȡ�����Ϣ
	String get_player_info(){
		String info=String.valueOf(pid)+" "+pname+" "+
	                String.valueOf(rest_game_times)+" "+String.valueOf(money)+" "+String.valueOf(ranks);
		return info;
	}
	
	//��ȡ��Ϸ��¼
	Record show_reocrd(){
		return record;
	}
}
