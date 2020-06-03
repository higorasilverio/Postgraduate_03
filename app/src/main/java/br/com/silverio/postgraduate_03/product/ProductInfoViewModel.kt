package br.com.silverio.postgraduate_03.product

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProductInfoViewModel : ViewModel() {
    val fcmRegistrationId = MutableLiveData<String>()
    val product = MutableLiveData<Product>()
}