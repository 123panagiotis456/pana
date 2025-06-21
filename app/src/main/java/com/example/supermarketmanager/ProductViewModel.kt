package com.example.supermarketmanager

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class ProductViewModel(application: Application) : AndroidViewModel(application) {
    private val dao = AppDatabase.getDatabase(application).productDao()
    val productList: LiveData<List<Product>> = dao.getAllProducts().asLiveData()

    fun addProduct(product: Product) {
        viewModelScope.launch {
            dao.insertProduct(product)
        }
    }
}
