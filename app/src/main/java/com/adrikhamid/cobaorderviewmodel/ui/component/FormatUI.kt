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
import com.adrikhamid.cobaorderviewmodel.data.FormState

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
 ){
    Text(
        text = stringResource(R.string.namaOrder)
    )
    Text(namaPemesan)
    Divider()
    Spacer(modifier = Modifier.padding(8.dp))

    Text(
        text = stringResource(R.string.alamatOrder)
    )
    Text(alamatPemesan)
    Divider()
    Spacer(modifier = Modifier.padding(8.dp))

    Text(
        text = stringResource(R.string.hpOrder),
    )
    Text(telpPemesan)
    Divider()

}