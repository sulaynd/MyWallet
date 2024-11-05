package com.mywallet.service;

import java.util.List;

import com.mywallet.exceptions.BeneficiaryException;
import com.mywallet.exceptions.CustomerException;
import com.mywallet.exceptions.WalletException;
import com.mywallet.model.Beneficiary;
import com.mywallet.model.dto.BeneficiaryDTO;

public interface BeneficiaryService {
	
	Beneficiary addBeneficiary(Beneficiary beneficiary, String key) throws BeneficiaryException, CustomerException, WalletException;

	List<Beneficiary> findAllByWallet(Integer walletId) throws BeneficiaryException;

	Beneficiary viewBeneficiary(String beneficiaryName, String key) throws BeneficiaryException, CustomerException;

	List<Beneficiary> viewAllBeneficiary(String key) throws BeneficiaryException, CustomerException;

	Beneficiary deleteBeneficiary(String key, BeneficiaryDTO beneficiaryDTO) throws BeneficiaryException, CustomerException;

}
