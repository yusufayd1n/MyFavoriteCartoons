package com.example.myfavoritecartoons

import android.util.Log
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.myfavoritecartoons.cartoonData.CartoonDetails

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CartoonDetailScreen(cartoonId: Int?) {
    val cartoonDetail = CartoonDetails(cartoonId!!)
    cartoonDetail.setCartoonDetailData()
    val pagerState = rememberPagerState()
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        HorizontalPager(
            pageCount = cartoonDetail.getCartoonDetailsById()[0].list.size,
            state = pagerState
        ) { index ->
            Image(
                painter = painterResource(id = cartoonDetail.getCartoonDetailsById()[0].list[index]),
                contentDescription = null,
                contentScale = ContentScale.Crop,

                )
        }
        Log.d("YUYUYUYUUYUYUYUY", cartoonDetail.getCartoonDetailsById().toString())
    }
}

@Preview(showBackground = true)
@Composable
fun CartoonDetailScreenPreview() {
    CartoonDetailScreen(null)
}