package com.example.stockmarketap.data.mapper

import com.example.stockmarketap.data.local.CompanyListingEntity
import com.example.stockmarketap.domain.model.CompanyListing

fun CompanyListingEntity.toCompanyListing(): CompanyListing {
    return CompanyListing(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyListing.toCompanyListingEntity(): CompanyListingEntity {
    return CompanyListingEntity(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

//fun CompanyInfoDto.toCompanyInfo(): CompanyInfo {
//    return CompanyInfo(
//        symbol = symbol ?: "",
//        description = description ?: "",
//        name = name ?: "",
//        country = country ?: "",
//        industry = industry ?: ""
//    )
//}