package com.adrikhamid.cobaorderviewmodel.ui.component

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.adrikhamid.cobaorderviewmodel.R

@Composable
fun FormatLabelHarga(subtotal: String, modifier: Modifier = Modifier) {
    Text(
        text = stringResource(R.string.subtotal_price, subtotal),
        modifier = Modifier,
        style = MaterialTheme.typography.headlineSmall
    )
}

@Composable
fun DataPemesan(
    namaPemesan: String,
    alamatPemesan: String,
    telpPemesan: String,
    modifier: Modifier = Modifier){
    Text(
        text = stringResource(R.string.namaOrder, namaPemesan),
        modifier = Modifier,
        style = MaterialTheme.typography.headlineSmall
    )
    Spacer(modifier = Modifier.padding(10.dp))
    Text(
        text = stringResource(R.string.alamatOrder, alamatPemesan),
        modifier = Modifier,
        style = MaterialTheme.typography.headlineSmall
    )
    Spacer(modifier = Modifier.padding(10.dp))
    Text(
        text = stringResource(R.string.hpOrder, telpPemesan),
        modifier = Modifier,
        style = MaterialTheme.typography.headlineSmall
    )
    Spacer(modifier = Modifier.padding(10.dp))

}