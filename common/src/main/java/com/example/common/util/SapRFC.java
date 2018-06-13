package com.example.common.util;
//package cn.hncu.example.util;
//
//import java.io.File;
//import java.io.FileOutputStream;
//import java.util.Properties;
//
//import org.apache.log4j.Logger;
//
//import com.sap.conn.jco.JCoDestination;
//import com.sap.conn.jco.JCoDestinationManager;
//import com.sap.conn.jco.JCoException;
//import com.sap.conn.jco.JCoFunction;
//import com.sap.conn.jco.JCoParameterList;
//import com.sap.conn.jco.JCoTable;
//import com.sap.conn.jco.ext.DestinationDataProvider;
//
//public class SapRFC {
//
//	private JCoFunction function;
//
//	// 输入参数列表
//	private JCoParameterList inPara = null;
//
//	// 输出参数列表
//	private JCoParameterList outPara = null;
//
//	private JCoParameterList tabPara = null;
//
//	private String functionName;
//
//	private static String ABAP_AS = "ABAP_AS_WITHOUT_POOL";
//
//	private JCoDestination destination;
//	
//	private static Logger logger = Logger.getLogger(SapRFC.class.getName());
//
//	private SapRFC(String portId) throws Exception {
//		connect(); // 连接SAP
//	}
//
//	// 调用SapRFC
//	public static SapRFC getInstance(String portId) throws Exception {
//		// RFC接口调用开始 ==========
//		SapRFC common = new SapRFC(portId);
//		return common;
//	}
//
//	// 连接 SAP
//	public void connect() throws Exception {
//
//		// set properties参数，
//		String clientName = "100";
//		String userid = "sap";
//		String password = "sap123";
//		String language = "ZH";
//		String host = "192.168.1.1";
//		String system = "01";
//
//		// 设置SAP的连接参数
//		Properties connectProperties = new Properties();
//		connectProperties.setProperty(DestinationDataProvider.JCO_ASHOST, host);
//		connectProperties.setProperty(DestinationDataProvider.JCO_SYSNR, system);
//		connectProperties.setProperty(DestinationDataProvider.JCO_CLIENT, clientName);
//		connectProperties.setProperty(DestinationDataProvider.JCO_USER, userid);
//		connectProperties.setProperty(DestinationDataProvider.JCO_PASSWD, password);
//		connectProperties.setProperty(DestinationDataProvider.JCO_LANG, language);
//
//		try {
//			// 创建DestinationDataProvider，
//			createDataFile(ABAP_AS, "jcoDestination", connectProperties);
//			destination = JCoDestinationManager.getDestination(ABAP_AS);
//
//		} catch (JCoException ex) {
//			throw new Exception("SAP连接失败" + ex.getMessage());
//		}
//	}
//
//	/*
//	 * 设置参数 name - the name of the field to set value - the value to set for the
//	 * field
//	 */
//	public SapRFC addParameter(String name, String value) {
//		inPara.setValue(name, value);
//		return this;
//	}
//
//	public SapRFC addParameter(int name, String value) {
//		inPara.setValue(name, value);
//		return this;
//	}
//
//	// 执行方法
//	public SapRFC prepare(String functionName) throws Exception {
//		this.functionName = functionName;
//		try {
//			// 取得要执行的方法
//			function = destination.getRepository().getFunction(functionName);
//		} catch (JCoException e) {
//			throw new Exception("SAP获取方法" + functionName + "失败：" + e.getMessage());
//		}
//		if (function == null) {
//			throw new Exception(functionName + "方法不存在");
//		}
//		// 取得参数列表
//		inPara = function.getImportParameterList();
//		outPara = function.getExportParameterList();
//		tabPara = function.getTableParameterList();
//		logger.info(functionName + "方法调用开始");
//		return this;
//	}
//
//	// 执行方法
//	public JCoParameterList execCall() throws JCoException {
//		// Execute
//		function.execute(destination);
//		logger.info(functionName + "方法调用结束");
//		return outPara;
//	}
//
//	// 取得返回结果
//	public JCoTable getResultTable(String tableName) {
//		return tabPara.getTable(tableName);
//	}
//
//	// //取得参数列表
//	// public JCoTable getParamTable(String tableName) {
//	// return tabPara.getTable(tableName);
//	// }
//
//	// SAP传入参数为列表
//	public JCoTable getParamTableList(String tableName) {
//		return function.getTableParameterList().getTable(tableName);
//	}
//
//	// DisConnect
//	public void close() {
//		// if (client != null)
//		// client.disconnect();
//	}
//
//	// Creates a connection configuration file based on parameters given above
//	static void createDataFile(String name, String suffix, Properties properties) throws Exception {
//		File cfg = new File(name + "." + suffix);
//		// if (!cfg.exists()) {
//		try {
//			FileOutputStream fos = new FileOutputStream(cfg, false);
//			properties.store(fos, "Destination - ABAP_AS_WITHOUT_POOL");
//			fos.close();
//		} catch (Exception e) {
//			throw new Exception("不能创建SAP连接需要的Destination文件" + cfg.getName(), e);
//		}
//		// }
//	}
//
//	public String convertNull(String str) {
//		if (str == null)
//			return "";
//		return str;
//	}
//}
//
