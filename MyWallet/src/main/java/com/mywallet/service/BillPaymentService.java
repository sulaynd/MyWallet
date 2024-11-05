package com.mywallet.service;

import com.mywallet.exceptions.BillPaymentException;
import com.mywallet.exceptions.CustomerException;
import com.mywallet.exceptions.TransactionException;
import com.mywallet.exceptions.WalletException;
import com.mywallet.model.BillPayment;

import java.time.LocalDate;

public interface BillPaymentService {

	BillPayment addBillPayment(String targetMobile, String Name, double amount, String BillType, LocalDate paymentDate, Integer walletId, String key) throws BillPaymentException,WalletException,CustomerException,TransactionException;

}