package day11.jdbcapp.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.CallableStatement;

import day11.jdbcapp.data.Customer;
import day11.jdbcapp.util.DBConnectionUtils;
import day11.jdbcapp.util.QueryMapper;

public class CustomerDAOImpl implements CustomerDAO {

	@Override
	public Customer getCustomerById(Integer customerId) {
		// Parameterized query or dynamic query will have to use
		// select * from customer where customerId =15;
		Customer customer = new Customer();
		try {
			PreparedStatement preparedStatement = DBConnectionUtils.getDBConnection()
					.prepareStatement(QueryMapper.GET_CUSTOMER_BY_ID);
			preparedStatement.setInt(1, customerId);
			ResultSet rs = preparedStatement.executeQuery();
			if (rs.next()) {
				// Setting data from resultset to domain object in application
				customer.setCustomerId(rs.getInt(1));
				customer.setCustomerName(rs.getString("customerName"));
				customer.setBirthDate(rs.getDate(3).toLocalDate());
				customer.setEmail(rs.getString("email"));
				customer.setMobile(rs.getLong("mobile"));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return customer;
	}

	@Override
	public List<Customer> getAllCustomers() {

		List<Customer> customerList = new ArrayList<Customer>();
		try {
			Statement statement = DBConnectionUtils.getDBConnection().createStatement();
			ResultSet rs = statement.executeQuery(QueryMapper.GET_ALL_CUSTOMERS);
			while (rs.next()) {
				Customer customer = new Customer();
				customer.setCustomerId(rs.getInt(1));
				customer.setCustomerName(rs.getString("customerName"));
				customer.setBirthDate(rs.getDate(3).toLocalDate());
				customer.setEmail(rs.getString("email"));
				customer.setMobile(rs.getLong("mobile"));

				customerList.add(customer);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return customerList;
	}

	@Override
	public Integer addCustomer(Customer customer) {

		int row = 0;
		try {

			PreparedStatement preparedStatement = DBConnectionUtils.getDBConnection()
					.prepareStatement(QueryMapper.ADD_CUSTOMER);
			preparedStatement.setInt(1, customer.getCustomerId());
			preparedStatement.setString(2, customer.getCustomerName());
			preparedStatement.setDate(3, Date.valueOf(customer.getBirthDate()));
			preparedStatement.setLong(4, customer.getMobile());
			preparedStatement.setString(5, customer.getEmail());

			row = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return row;
	}

	@Override
	public Integer updateCustomer(Customer customer) {

		int row = 0;
		try {

			PreparedStatement preparedStatement = DBConnectionUtils.getDBConnection()
					.prepareStatement(QueryMapper.UPDATE_CUSTOMER);
			preparedStatement.setString(1, customer.getCustomerName());
			preparedStatement.setDate(2, Date.valueOf(customer.getBirthDate()));
			preparedStatement.setLong(3, customer.getMobile());
			preparedStatement.setString(4, customer.getEmail());
			preparedStatement.setInt(5, customer.getCustomerId());

			row = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return row;
	}

	@Override
	public Integer deleteCustomer(Integer customerId) {
		int row =0;
		try {
			PreparedStatement preparedStatement = DBConnectionUtils.getDBConnection().prepareStatement("delete from customer where customerId =?");
			preparedStatement.setInt(1, customerId);
			row = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return row;
	}

	@Override
	public String callProcedure(Integer custId) {
		try {
			java.sql.CallableStatement callableStatement = DBConnectionUtils
					.getDBConnection().prepareCall("{call delete_data(?)}");
		callableStatement.setInt(1, custId);	
		int n = callableStatement.executeUpdate();
		if(n != 0) {
			return "Data deleted successfully";
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Not able to delete the data";
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return null;
	}


}