package com.etc.geeks.daoimp.GoodsInformation;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.rowset.OracleCachedRowSet;

import com.etc.geeks.dao.GoodsInformation.SupplierDao;
import com.etc.geeks.entity.GoodsInformation.Supplier;
import com.etc.geeks.util.DbOperation;

public class SupplierDaoImp implements SupplierDao {

	public int addSupplier(Supplier supplier) {
		String sql = "insert into Supplier values(?, ?, ?, ?, ?)";
		Object[] objects = new Object[]{
				supplier.getSupplierId(), supplier.getSupplierName(),
				supplier.getLocation(), supplier.getCall(),
				supplier.getContactPersonName()
				};
		int result = DbOperation.executeUpdate(sql, objects);
		return result;
	}

	public int deleteById(String supplierId) {
		int result = DbOperation.executeUpdate(
				"delete from Supplier where supplierId = ?", new Object[] { supplierId });
		return result;
	}

	public int updateSupplier(Supplier supplier) {
		String sql = "update Supplier set supplierName = ?, location = ?," +
				"call = ?, contactPersonName = ?," +
				"where supplierId = '" +
				supplier.getSupplierId() + "'";
		Object[] objects = new Object[]{
				supplier.getSupplierName(), supplier.getLocation(),
				supplier.getCall(), supplier.getContactPersonName()
				};
		int result = DbOperation.executeUpdate(sql, objects);
		return result;
	}

	public Supplier findByName(String supplierName) {
		String sql = "select * from Supplier where supplierName = ?";
		Object[] objects = new Object[]{supplierName};
		OracleCachedRowSet ocrs = DbOperation.executeQuery(sql, objects);
		Supplier supplier = null;
		try {
			if(ocrs.next()) {
				supplier = new Supplier(
						ocrs.getString(1), ocrs.getString(2),
						ocrs.getString(3), ocrs.getString(4),
						ocrs.getString(5)
						);
			}
			return supplier;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				ocrs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}

	public Supplier findById(String supplierId) {
		String sql = "select * from Supplier where supplierId = ?";
		Object[] objects = new Object[]{supplierId};
		OracleCachedRowSet ocrs = DbOperation.executeQuery(sql, objects);
		Supplier supplier = null;
		try {
			if(ocrs.next()) {
				supplier = new Supplier(
						ocrs.getString(1), ocrs.getString(2),
						ocrs.getString(3), ocrs.getString(4),
						ocrs.getString(5)
						);
			}
			return supplier;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				ocrs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}

	public List<Supplier> findAllSupplier() {
		String sql = "select * from Supplier";
		OracleCachedRowSet ocrs = DbOperation.executeQuery(sql, null);
		List<Supplier> list = new ArrayList<Supplier>();
		try {
			while(ocrs.next()) {
				Supplier supplier = new Supplier(
						ocrs.getString(1), ocrs.getString(2),
						ocrs.getString(3), ocrs.getString(4),
						ocrs.getString(5)
						);
				list.add(supplier);
			}
			if(!list.isEmpty()) {
				return list;
			} else {
				return null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				ocrs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}

}
