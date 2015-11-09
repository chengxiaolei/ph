package com.pose.po.ph.util.zip;

import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.servlet.ServletOutputStream;


/**
 * 
 * @description: 压缩帮助类
 * @author: wujinsong
 * @time: 2014年7月29日 下午3:24:12
 */
public class ZipUtil {
	
	/**
	 * 打包协议文件
	 * @Author zy
	 * @Company: JL
	 * @Create Time: 2014年11月24日 下午2:41:06
	 * @param childAssetFiles
	 * @param baseName
	 * @param isPackageSumProtocol 上否打包汇总协议
	 * @param isPackageTransferProtocol 是否打包债权转让协议
	 * @param isPackageGuranteeProtocol 是否打包担保函
	 * @param outputStream
	 * @return
	 */
//	public static boolean zipByChildAssetFiles(List<ChildAssetFile> childAssetFiles,String baseName,boolean hasChildAssetFolder,boolean isPackageSumProtocol,boolean isPackageTransferProtocol,boolean isPackageGuranteeProtocol, OutputStream outputStream) {
//		boolean ret = true;
//		ZipOutputStream zos = null;
//		
//		try{
//			zos = new ZipOutputStream(outputStream);
//			for(int i = 0 ; i < childAssetFiles.size() ; i++) {
//				ChildAssetFile _childAssetFile = childAssetFiles.get(i);
//				if(null == _childAssetFile) {
//					continue;
//				}
//				
//				String folder = "";
//				if(hasChildAssetFolder) {
//					//如果未设置子资产，则手动设置一个默认实体，以便能正常打包
//					if(null == _childAssetFile.getChildAsset()) {
//						ChildAsset childAsset = new ChildAsset();
//						childAsset.setCode("defaultCode");
//						_childAssetFile.setChildAsset(childAsset);
//					}
//					folder = baseName + _childAssetFile.getChildAsset().getCode()+ "_" + new SimpleDateFormat("yyy-MM-dd").format(new Date())+ "协议/";
//					
//					zos.putNextEntry(new ZipEntry(folder));
//				
//				}
//				
//				//汇总协议
//				if(null != _childAssetFile.getSummaryProtocolFiles() && isPackageSumProtocol) {
//					zos.putNextEntry(new ZipEntry(folder + _childAssetFile.getSummaryProtocolFiles().getFileName()));
//					zos.write(_childAssetFile.getSummaryProtocolFiles().getFileContent());
//				}
//				
//				//债权转让协议
//				if(null != _childAssetFile.getTransferOfCreditorFiles() && isPackageTransferProtocol) {
//					for(PdfFile file : _childAssetFile.getTransferOfCreditorFiles()) {
//						if(null != file ) {
//							zos.putNextEntry(new ZipEntry(folder + file.getFileName()));
//							zos.write(file.getFileContent());
//						}
//					}
//				}
//				
//				//担保函
//				if(null != _childAssetFile.getGuaranteeProtocolFiles() && isPackageGuranteeProtocol) {
//					for(PdfFile file : _childAssetFile.getGuaranteeProtocolFiles()) {
//						if(null != file) {
//							zos.putNextEntry(new ZipEntry(folder + file.getFileName()));
//							zos.write(file.getFileContent());
//						}
//					}
//				}
//				
//				
//			}
//			zos.flush();
//		}catch(Exception e) {
//			e.printStackTrace();
//			ret = false;
//		} finally {
//			if(null != zos) {
//				try {
//					zos.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//					ret = false;
//				}
//			}
//		}
//		
//		return ret;
//	}
//	
//	
//	/**
//	 * 
//	 * @description: 压缩
//	 * @author: wujinsong
//	 * @param pdfFiles
//	 * @param baseName
//	 * @param zos
//	 * @throws IOException
//	 */
//	public static void zipFile(List<PdfFile> pdfFiles, String baseName, ServletOutputStream outputStream) throws IOException {
//		ZipOutputStream zos = new ZipOutputStream(outputStream);
//		for (PdfFile pdfFile : pdfFiles) {
//			zos.putNextEntry(new ZipEntry(baseName + pdfFile.getFileName()));
//			zos.write(pdfFile.getFileContent(), 0, pdfFile.getFileContent().length);
//		}
//
//		zos.flush();
//		zos.close();
//	}
//
//	public static void zipFile(Set<Attachment> attachments, String baseName, ServletOutputStream outputStream) throws IOException {
//		ZipOutputStream zos = new ZipOutputStream(outputStream);
//		for (Attachment attachment : attachments) {
//			zos.putNextEntry(new ZipEntry(baseName + new Date().getTime() + attachment.getName()));
//
//			zos.write(attachment.getContent(), 0, attachment.getContent().length);
//		}
//
//		zos.flush();
//		zos.close();
//	}
//
//	/**
//	 * 
//	 * @description: 含日期的文件名
//	 * @author: wujinsong
//	 * @return
//	 */
//	public static String getZipFilename() {
//		Date date = new Date();
//		String s = date.getTime() + ".zip";
//		return s;
//	}
//
//	public static String getChildAssetZipFilename(String code, String assetname) {
//		return code + "_" + assetname + "_" + DateUtils.dateToString(new Date(), "yyyyMMdd") + "_协议.zip";
//	}
//
//	public static String getProductZipFilename(String productName) {
//		return productName + "_" + DateUtils.dateToString(new Date(), "yyyyMMdd") + "_协议.zip";
//	}
}
