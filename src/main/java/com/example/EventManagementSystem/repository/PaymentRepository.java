package com.example.EventManagementSystem.repository;



import com.example.EventManagementSystem.model.Payment;

import org.springframework.data.jpa.repository.JpaRepository;

/*@Repository*/
public interface PaymentRepository extends JpaRepository <Payment, Integer>{
	

//	Optional<Payment>
//	findByTransactionId(int transactionId);
//
//	void deleteTransactionByDate(int transactionDate);
//
//	void deleteTransactionById(int transactionId);
//
//	
//	@Query(value = "select * from payments p where p.user_id=?1", nativeQuery = true)
//	Payment findByUserId(int userid);
}
