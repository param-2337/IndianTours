package com.tourApplication.springboot.services;

import java.util.List;
import java.util.Optional;

import com.tourApplication.springboot.model.BookingHeaderTable;
import com.tourApplication.springboot.model.CostMaster;
import com.tourApplication.springboot.model.CustomerMaster;
import com.tourApplication.springboot.model.DateMaster;
import com.tourApplication.springboot.model.ItineryMaster;
import com.tourApplication.springboot.model.PassengerTable;
import com.tourApplication.springboot.model.SignupMaster;
import com.tourApplication.springboot.model.TourCategoryMaster;


public interface TourManager {
	
	//TourCategoryMaster Manager
	List<TourCategoryMaster> getRecords();
	void addTour(TourCategoryMaster tour);
	Optional<TourCategoryMaster> getRecordById(Long id);
	void updateRecord(TourCategoryMaster tourcatmas);
	void deleteRecord(Long id);

	
	//SignUp Manager
	void saveNewUser(SignupMaster user);
	List<SignupMaster> getUser(String username);
	List<String> allCategories(String subcatid);
	void updateUsername(SignupMaster user);
	void deleteUsername(Long id);

	
	//Itinery Manager
	List<ItineryMaster> getItinery();
	void addItinery(ItineryMaster itinery);
	void updateItineryRecord(ItineryMaster itinery);
	void deleteItinery(Long id);

	
	//Cost Manager
	List<CostMaster> getCost();
	void addCost(CostMaster cost);
	Optional<CostMaster> getCostByID(Long id);
	void deleteCost(Long id);
	//void updateCost(CostMaster cost,Long id);
	void updateCost(CostMaster cost);

	
	//Passenegr Manager
	List<PassengerTable> getPass();
	void addPass(PassengerTable pass);
	Optional<PassengerTable> getPassByID(Long id);
	void deletePass(Long id);
	void updatePass(PassengerTable pass);
	
	
	//Booking Header Table
	List<BookingHeaderTable> getRecord();
	void addBookRecord(BookingHeaderTable rec);
	void deleteBookRecord(Long id);
	void updateBookRecord(BookingHeaderTable rec);
	
	
	//Customer Master
	List<CustomerMaster> getCustomers();
	void addCustomer(CustomerMaster cust);
	void deleteCustomer(Long id);
	void updateCustomer(CustomerMaster cust);
	Optional<CustomerMaster> getCustomerByID(Long id);
	
	
	
	//Date Master
	List<DateMaster> getDates();
	void addDate(DateMaster date);
	void deleteDate(Long id);
	void updateDate(DateMaster date);
	Optional<DateMaster> getDateByID(Long id);
	
}
