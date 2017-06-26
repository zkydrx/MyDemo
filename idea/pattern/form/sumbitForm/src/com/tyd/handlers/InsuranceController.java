package com.tyd.handlers;

import org.springframework.stereotype.Controller;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

/**
 * Created by Abbot on 2017-02-22-0022 11:05.
 */
@Controller
public class InsuranceController
{

    private String add_insurance_account_name;//开户名


    private String add_insurance_type;//险种名称


    private String add_clauses_code;//主险条款代码


    private String add_insurance_applicant_name;//投保人名称


    private String add_insurance_insured_name;//被保险人名称


    private String add_goods_package;//包装


    private String add_goods_name;//货物名称


    private String add_goods_type;//货物类型


    private String add_insurance_transportation;//运输方式


    private String add_insurance_transportation_tool;//运输工具


    private String add_transportation_location_start;//起运地


    private String add_transportation_location_end;//目的地


    private String add_transportation_start_date;//起运日期


    private String add_sign_bill_date;//签单日期


    private String add_insurance_money_type;//投保币种


    private String add_insurance_money;//保险金额


    private String add_insurance_rate;//费率


    private String add_insurance_count_money;//结算币种


    private String add_insurance_company;//保险公司





    public void createXMLByDOM()
    {
        File dest = new File("D:\\temp\\insuracne.xml");
        // 创建DocumentBuilderFactory
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try
        {

            // 创建DocumentBuilder
            DocumentBuilder builder = factory.newDocumentBuilder();

            // 创建Document
            Document document = builder.newDocument();

            // 设置XML声明中standalone为yes，即没有dtd和schema作为该XML的说明文档，且不显示该属性
            document.setXmlStandalone(true);

            // 创建根节点
            Element insurance = document.createElement("PolicyList");//用户名
            insurance.setAttribute("username", "DZGJ254");

            // 创建子节点，并设置属性
            Element book = document.createElement("Policy");//逻辑名称
            book.setAttribute("BusinessLogic", "AddFreightPolicyWeb");



            /*****************************************需要校验**********************************************/
            // 为book添加子节点
            Element mainGlausesCode = document.createElement("MainGlausesCode");//主险代码
            mainGlausesCode.setTextContent("YDG001");
            book.appendChild(mainGlausesCode);//

            Element goodsTypeNo = document.createElement("GoodsTypeNo");//货物类型
            goodsTypeNo.setTextContent("110202");
            book.appendChild(goodsTypeNo);

            Element departureDate = document.createElement("DepartureDate");//起运时间
            departureDate.setTextContent("2016-10-13:118");
            book.appendChild(departureDate);

            Element effDate = document.createElement("Effdate");//签单日期
            effDate.setTextContent("2016-10-13:18");
            book.appendChild(effDate);

            Element insuredAmount = document.createElement("InsuredAmount");//保险金额
            insuredAmount.setTextContent("123456");
            book.appendChild(insuredAmount);

            Element ratio = document.createElement("Ratio");//费率‰
            ratio.setTextContent("0.5");
            book.appendChild(ratio);

            /******************************************需要校验*********************************************/



            /******************************************测试环境固定，别的不可以*********************************************/
            /**
             * 新建元素。
             */
            Element mainGlauses = document.createElement("MainGlauses");//险种名称
            /**
             * 给元素赋值
             */
            mainGlauses.setTextContent("国内公路货运保险");
            /**
             * 将元素及其内容添加进子节点
             */
            book.appendChild(mainGlauses);

            Element packQty = document.createElement("PackQty");//包装及件数
            packQty.setTextContent("普通包装");
            book.appendChild(packQty);

            Element insuranceone= document.createElement("Insurance");//主险名称
            insuranceone.setTextContent("国内货物运输保险");
            book.appendChild(insuranceone);

            Element goodsName = document.createElement("GoodsName");//货物名称
            goodsName.setTextContent("手机");
            book.appendChild(goodsName);

            Element transportType = document.createElement("TransportType");//运输方式
            transportType.setTextContent("公路");
            book.appendChild(transportType);

            Element currencyID = document.createElement("CurrencyID");//投保币种
            currencyID.setTextContent("人民币");
            book.appendChild(currencyID);

            Element endCurrencyID = document.createElement("EndCurrencyID");//结算币种
            endCurrencyID.setTextContent("人民币");
            book.appendChild(endCurrencyID);

            /******************************************固定结束*********************************************/

            Element holderName = document.createElement("HolderName");//投保人名称
            holderName.setTextContent("泰易达物流");
            book.appendChild(holderName);

            Element recognizeeName = document.createElement("RecognizeeName");//被保险人名称
            recognizeeName.setTextContent("泰易达物流");
            book.appendChild(recognizeeName);

            Element transport = document.createElement("Transport");//交通工具名称
            transport.setTextContent("汽车");
            book.appendChild(transport);

            Element fromLoc = document.createElement("FromLoc");//起运地
            fromLoc.setTextContent("杭州");
            book.appendChild(fromLoc);

            Element toLoc = document.createElement("ToLoc");//目的地
            toLoc.setTextContent("上海");
            book.appendChild(toLoc);

            Element recognizeeIdenty = document.createElement("RecongnizeeIdenty");//被保险人身份证号
            recognizeeIdenty.setTextContent("");
            book.appendChild(recognizeeIdenty);

            Element additive = document.createElement("Additive");//附加险
            book.appendChild(additive);

            Element holderAddr = document.createElement("HolderAddr");//投保人地址
            holderAddr.setTextContent("");
            book.appendChild(holderAddr);

            Element recognizeeAddr = document.createElement("RecognizeeAddr");//被保险人地址
            recognizeeAddr.setTextContent("");
            book.appendChild(recognizeeAddr);

            Element recognizeePhone = document.createElement("RecognizeePhone");//被保险人电话号码
            recognizeePhone.setTextContent("17858838888");
            book.appendChild(recognizeePhone);

            Element recognizeeOrg = document.createElement("RecognizeeOrg");//被保人机构代码
            recognizeeOrg.setTextContent("");
            book.appendChild(recognizeeOrg);

            Element invRefNo = document.createElement("InrefNo");//发票号/运单号
            invRefNo.setTextContent("");
            book.appendChild(invRefNo);

            Element weight = document.createElement("Weight");//重量
            weight.setTextContent("150");
            book.appendChild(weight);

            Element transportNo = document.createElement("TransportNo");//航班次/船龄
            transportNo.setTextContent("");
            book.appendChild(transportNo);

            Element vialoc =document.createElement("Vialoc");//中转地
            vialoc.setTextContent("");
            book.appendChild(vialoc);

            Element deductible = document.createElement("Deductible");//免赔
            deductible.setTextContent("");
            book.appendChild(deductible);

            Element specialAnnounce = document.createElement("SpecialAnnounce");//特别约定
            specialAnnounce.setTextContent("");
            book.appendChild(specialAnnounce);

            Element primaryNo = document.createElement("PrimaryNo");
            primaryNo.setTextContent("3957223417");
            book.appendChild(primaryNo);

            Element mD5Key = document.createElement("MD5Key");
            mD5Key.setTextContent("2c5d9d0ea593dd20b735ff0ce1402ff9");
            book.appendChild(mD5Key);



            // 为根节点添加子节点
            insurance.appendChild(book);

            // 将根节点添加到Document下
            document.appendChild(insurance);

            /*
             * 下面开始实现： 生成XML文件
             */

            // 创建TransformerFactory对象
            TransformerFactory tff = TransformerFactory.newInstance();

            // 创建Transformer对象
            Transformer tf = tff.newTransformer();

            // 设置输出数据时换行
            tf.setOutputProperty(OutputKeys.INDENT, "yes");

            // 使用Transformer的transform()方法将DOM树转换成XML
            tf.transform(new DOMSource(document), new StreamResult(dest));
            System.out.println("生成的文件在"+ dest.getAbsolutePath());

        } catch (ParserConfigurationException e)
        {
            e.printStackTrace();
        } catch (TransformerConfigurationException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (TransformerException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
