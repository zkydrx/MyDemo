package com.john.util;

import com.alibaba.fastjson.JSON;
import com.model.atll.AboutAddress;
import com.model.baidu.llta.AboutLocation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.text.DecimalFormat;


public class LocationUtil {
	private static double x_pi = 3.14159265358979324 * 3000.0 / 180.0;
	/**
	 * ���ݵ�ַ��ȡ����γ��
	 * @param address Ҫ���ַ�����ĵ�ַ
	 * @return AboutAddress
	 * */
	public static AboutAddress getGeocoderLatitude(String address) {
		AboutAddress aa = null;
		BufferedReader in = null;
		try {
			address = URLEncoder.encode(address, "UTF-8");
			URL tirc = new URL("http://api.map.baidu.com/geocoder?address="
					+ address + "&output=json");
			in = new BufferedReader(new InputStreamReader(tirc.openStream(),
					"UTF-8"));
			String res;
			StringBuilder sb = new StringBuilder("");
			while ((res = in.readLine()) != null) {
				sb.append(res.trim());
			}
			String str = sb.toString();
			aa = JSON.parseObject(str, AboutAddress.class);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != in) {
					in.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return aa;
	}
	
	/**
	 * ���ݾ�γ�Ȼ�ȡ�����ڳ�����Ϣ
	 * @param lng:���� lat:γ��
	 * @return AboutLocation
	 * */
	public static AboutLocation getAboutLocation(String lng,String lat){
		AboutLocation al = null;
		String url = "http://api.map.baidu.com/geocoder?location=" +
				lat +
				"," +
				lng +
				"&output=json&src=Trlol";
		BufferedReader in = null;
		try {
			URL tirc = new URL(url);
			in = new BufferedReader(new InputStreamReader(tirc.openStream(),
					"UTF-8"));
			String res;
			StringBuilder sb = new StringBuilder("");
			while ((res = in.readLine()) != null) {
				sb.append(res.trim());
			}
			String addressInfo = sb.toString();
			al = JSON.parseObject(addressInfo, AboutLocation.class);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != in) {
					in.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return al;
	}
	/**
	 * �� GCJ-02 ����ת���� BD-09 ����
	 * GoogleMap�͸ߵ�map�õ���ͬһ������ϵGCJ-02
	 * */
	public static double[] bd_encrypt(double gg_lat, double gg_lon) {
		double bd_lat = 0.0;
		double bd_lon = 0.0;
		double location[] = new double[2];
		double x = gg_lon, y = gg_lat;
		double z = Math.sqrt(x * x + y * y) + 0.00002 * Math.sin(y * x_pi);
		double theta = Math.atan2(y, x) + 0.000003 * Math.cos(x * x_pi);
		bd_lon = z * Math.cos(theta) + 0.0065;
		bd_lat = z * Math.sin(theta) + 0.006;
		location[0] = bd_lat;
		location[1] = bd_lon;
		return location;
	}

	/**
	 * �� BD-09 ����ת���� GCJ-02 ����
	 * GoogleMap�͸ߵ�map�õ���ͬһ������ϵGCJ-02
	 * */
	public static double[] bd_decrypt(double bd_lat, double bd_lon) {
		double gg_lat = 0.0;
		double gg_lon = 0.0;
		double location[] = new double[2];
		double x = bd_lon - 0.0065, y = bd_lat - 0.006;
		double z = Math.sqrt(x * x + y * y) - 0.00002 * Math.sin(y * x_pi);
		double theta = Math.atan2(y, x) - 0.000003 * Math.cos(x * x_pi);
		gg_lon = z * Math.cos(theta);
		gg_lat = z * Math.sin(theta);
		location[0] = gg_lon;
		location[1] = gg_lat;
		return location;
	}

	public static void main(String[] args)
	{
		LocationUtil locationUtil = new LocationUtil();
		/**
		 * "Lat":31.021562,"Lon":121.16201,
		 */
        double[] doubles = bd_decrypt(31.021562, 121.16201);
        DecimalFormat decimalFormat  = new DecimalFormat("#.000000");
        System.out.println(decimalFormat.format(doubles[0])+":"+decimalFormat.format(doubles[1]));
    }
}
