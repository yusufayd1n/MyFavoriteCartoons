package com.example.myfavoritecartoons

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myfavoritecartoons.cartoonData.CartoonDetails

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CartoonDetailScreen(cartoonId: Int?) {
    val cartoonDetail = CartoonDetails(cartoonId!!, LocalContext.current)
    cartoonDetail.setCartoonDetailData()
    val pagerState = rememberPagerState()
    val scroll = rememberScrollState(0)

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        HorizontalPager(
            pageCount = cartoonDetail.getCartoonDetailsById()[0].list.size,
            state = pagerState,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.5f)
        ) { index ->
            Image(
                painter = painterResource(id = cartoonDetail.getCartoonDetailsById()[0].list[index]),
                contentDescription = null,
                contentScale = ContentScale.Crop,

                )
        }
        Text(
            text = cartoonDetail.getCartoonDetailsById()[0].name,
            fontSize = 25.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            textAlign = TextAlign.Center
        )
        Text(
            text = cartoonDetail.getCartoonDetailsById()[0].description,
            fontSize = 12.sp,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(8.dp)
                .verticalScroll(scroll),
            textAlign = TextAlign.Center
        )

    }
}

@Preview(showBackground = true)
@Composable
fun CartoonDetailScreenPreview() {
    CartoonDetailScreen(null)
}