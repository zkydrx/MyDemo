//
//import java.io.FileOutputStream;
//
//import java.io.IOException;
//
//
//
//public class Java2XML {
//
//    public void BuildXMLDoc() throws IOException, JDOMException {
//
//        //定义
//        String name = "姓名";
//        String age = "年龄";
//        String sex = "性别";
//        // 创建根节点 list;
//
//        Element root = new Element("list");
//
//        // 根节点添加到文档中；
//
//        Document Doc = new Document(root);
//
//        // 此处 for 循环可替换成 遍历 数据库表的结果集操作;
//
//        for (int i = 0; i < 2; i++) {
//
//            // 创建节点 user;
//
//            Element elements = new Element("user");
//
//            // 给 user 节点添加属性 id;
//
//            elements.setAttribute("id", "" + i);
//
//            // 给 user 节点添加子节点并赋值；
//
//            // 赋值；
//
//            elements.addContent(new Element(name).setText("某某"));
//
//            elements.addContent(new Element(age).setText("23"));
//
//            elements.addContent(new Element(sex).setText("男"));
//
//            // 给父节点list添加user子节点;
//
//            root.addContent(elements);
//
//        }
//
//        XMLOutputter XMLOut = new XMLOutputter();
//
//        // 输出 XMLOutput.xml 文件到项目根目录；
//
//        XMLOut.output(Doc, new FileOutputStream("C:\\Users\\ZKY\\Desktop\\XMLOutput.xml"));
//
//    }
//
//    /**
//     * @param args
//     */
//    public static void main(String[] args) {
//        try {
//
//            Java2XML j2x = new Java2XML();
//
//            System.out.println("生成 mxl 文件成功，请查看项目根目录XMLOutput.xml文件！");
//
//            j2x.BuildXMLDoc();
//
//        } catch (Exception e) {
//
//            e.printStackTrace();
//
//        }
//    }
//
//}