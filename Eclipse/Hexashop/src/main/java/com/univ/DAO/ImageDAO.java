package com.univ.DAO;

import java.sql.*;
import java.util.*;

import com.univ.DB.DBConnection;

public class ImageDAO {

	public List getImage() {
		List lst = new ArrayList();
		try {
			Connection con1 = DBConnection.getConn();
			Statement stm = con1.createStatement();
			ResultSet rs = stm.executeQuery("select * from imagedata where status = 0");
			while(rs.next()) {
				Vector v1 = new Vector();
				v1.add(rs.getInt(1));
				v1.add(rs.getString(2));
				v1.add(rs.getString(3));
				v1.add(rs.getInt(4));
				lst.add(v1);
			}
		}catch(Exception tt) {
			System.out.println(tt);		
		}
	return lst;
}
}
