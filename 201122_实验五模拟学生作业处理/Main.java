package five;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student stu = Student.interactiveCreate();
        System.out.println(stu);
        String inFilePath;
        do {
            inFilePath = InputUtil.inputString("路径：");
        } while (true);

        ArrayList<String> searches = new ArrayList<>();
        searches.addAll(Arrays.asList(args));//导入参数
        do {
            String input = InputUtil.inputString("输入要计数的词语，点号(.)代表完成(" + searches.size() + "): ");
            if (input.equals(".")) break;
            searches.add(input.trim());
        } while (true);
        System.out.println("计数词语(" + searches.size() + ")：" + Util.arrayJoin(searches, ", "));

        String outFileName = "resources" + File.separator + FileUtil.getFileName(inFilePath) + ".finish.txt";
        FileUtil.recreate(outFileName);

        StringBuffer content = new StringBuffer();

        content.append(stu);

        String source = "";
        try {
            source = FileUtil.readFile(inFilePath);
        } catch (IOException e) {
            System.out.println("文件读取失败");
            exit(-1);
        }

        assert source != null;
        String result = StringUtil.rulesInsert(
                StringUtil.rulesInsert(
                        source,
                        "，",
                        1, 14, 7),
                "。\n",
                1, 15, 0);
        content.append(result);
        content.append("\n\n========================\n\n");

        content.append("词语统计\n");
        for (String keyword : searches) {
            content.append(keyword + "\t" + StringUtil.countString(result, keyword) + "\n");
        }

        FileUtil.writeFile(outFileName, content.toString().split("\n"));

        System.out.println(content.toString());
    }
}
