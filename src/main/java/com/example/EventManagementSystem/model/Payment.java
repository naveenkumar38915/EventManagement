package com.example.EventManagementSystem.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@Table(name="payment")
		public class Payment{

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int transactionId;
		@Column(name = "trans_date")
		@JsonFormat(pattern = "dd/MM/yy")
		private Date transactionDate;

		public int getTransactionId() {
			return transactionId;
		}

		public void setTransactionId(int transactionId) {
			this.transactionId = transactionId;
		}

		public Date getTransactionDate() {
			return transactionDate;
		}

		public void setTransactionDate(Date transactionDate) {
			this.transactionDate = transactionDate;
		}

		/*@Override
		public String toString() {
			return "Payment [transactionId=" + transactionId + ", transactionDate=" + transactionDate + "]";
		}*/

	}


