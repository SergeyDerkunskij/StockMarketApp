package com.example.stockmarketap.domain.repository

import com.example.stockmarketap.domain.model.CompanyListing
import com.example.stockmarketap.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {
    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>

//    suspend fun getIntradayInfo(
//        symbol: String
//    ): Resource<List<IntradayInfo>>
//
//    suspend fun getCompanyInfo(
//        symbol: String
//    ): Resource<CompanyInfo>
}