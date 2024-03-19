package com.fuadhev.myweatherappjetpack.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fuadhev.myweatherappjetpack.model.locationModel.AdministrativeArea
import com.fuadhev.myweatherappjetpack.model.locationModel.Country
import com.fuadhev.myweatherappjetpack.model.locationModel.Elevation
import com.fuadhev.myweatherappjetpack.model.locationModel.GeoPosition
import com.fuadhev.myweatherappjetpack.model.locationModel.Imperial
import com.fuadhev.myweatherappjetpack.model.locationModel.LocationResponseItem
import com.fuadhev.myweatherappjetpack.model.locationModel.Metric
import com.fuadhev.myweatherappjetpack.model.locationModel.Region
import com.fuadhev.myweatherappjetpack.model.locationModel.TimeZone

@Composable
fun HomeListVerticalGrid(
    location: LocationResponseItem,
    onItemClick: (LocationResponseItem) -> Unit
) {
    Row(modifier = Modifier
        .fillMaxWidth()
        .height(50.dp)
        .clip(
            RoundedCornerShape(8.dp)
        )
        .background(MaterialTheme.colorScheme.secondary)
        .clickable {
            onItemClick(location)
        }
        .padding(8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically) {
        Column {
            Text(
                location.englishName,
                color = Color.White,
                fontWeight = FontWeight.Bold
            )
            Text(
                location.country.englishName,
                color = Color.Gray,
                fontSize = 12.sp
            )
        }
    }
}

@Preview
@Composable
fun test() {

    HomeListVerticalGrid(
        location = LocationResponseItem(
            administrativeArea = AdministrativeArea(
                countryID = "AZ",
                englishName = "Baku",
                englishType = "Municipality",
                iD = "BA",
                level = 1,
                localizedName = "Baku",
                localizedType = "Municipality"
            ),
            country = Country(englishName = "Azerbaijan", iD = "AZ", localizedName = "Azerbaijan"),
            dataSets = emptyList(),
            englishName = "Baku",
            geoPosition = GeoPosition(
                elevation = Elevation(
                    imperial = Imperial(
                        unit = "ft",
                        unitType = 0,
                        value = 141
                    ), metric = Metric(unit = "m", unitType = 5, value = 43)
                ), latitude = 40.395, longitude = 49.883
            ),
            isAlias = false,
            key = "27103",
            localizedName = "Baku",
            primaryPostalCode ="",
            rank = 20,
            region = Region(englishName = "Asia", iD = "ASI", localizedName = "Asia"),
            supplementalAdminAreas = emptyList(),
            timeZone = TimeZone(
                code = "AZT",
                gmtOffset = 4.0,
                isDaylightSaving = false,
                name = "",
                nextOffsetChange = "null"
            ),
            type = "City",
            version = 1
        ),
        onItemClick ={}
    )
}