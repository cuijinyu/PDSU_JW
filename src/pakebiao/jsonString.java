package pakebiao;

public class jsonString {

	public jsonString() {
		// TODO Auto-generated constructor stub
	}

	public static String str = "选定 课程 学分 类别 任课教师 上课 班号 上课班级 名称 人数 上课时间/上课地点 限选 已选 可选 [45140115]项目综合应用实训 1.0 计算机科学类 专业课/必修课 李真RJ 001 58 55 3 [1-18周]星期五[5-6节]/S102软件实训室 [11180302]形势与政策 2.0 社会科学类 公共课/必修课 王秀毅 004 300 295 5 [1-18双周]星期二[9-10节]/2306 [11180202]毛泽东思想与中国特色社会主义理论体系概论（二） 3.0 社会科学类 公共课/必修课 张俊英 011 133 130 3 [1-18周]星期二[3-4节]/4206 [22140104]操作系统 4.0 计算机科学类 专业课/必修课 徐向艺 002 58 55 3 [1-18双周]星期三[7-8节]/S102软件实训室 徐向艺 001 58 55 3 [1-18周]星期一[1-2节]/4212 [1-18单周]星期三[7-8节]/4212 [31140217]工作流管理与技术 3.0 计算机科学类 专业课/必修课 李冰JK 002 58 55 3 [1-18周]星期四[1-2节]/S501西 软件实验室02 李冰JK 001 58 55 3 [1-18周]星期二[7-8节]/4311 [31140219]信息安全技术 4.0 计算机科学类 专业课/必修课 樊爱宛 002 58 55 3 [1-18双周]星期三[5-6节]/S101网络实训室 樊爱宛 001 58 55 3 [1-18周]星期一[3-4节]/4310 [1-18单周]星期三[5-6节]/4310 [32140215]javaEE应用开发 3.0 计算机科学类 专业课/必修课 张国平 002 58 55 3 [1-18周]星期二[1-2节]/S102软件实训室 张国平 001 58 55 3 [1-18周]星期一[5-6节]/4311";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l = str.length();
		String[] names = str.split(" ");
		for (int i = 14; i < names.length; i++) {
			int j = i -13;
            System.out.println("i = " + j +"\t"+ names[i]);
        }

	}

}
