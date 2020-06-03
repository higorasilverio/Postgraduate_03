package br.com.silverio.postgraduate_03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import br.com.silverio.postgraduate_03.product.ProductInfoFragmentDirections

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (this.intent.hasExtra("product")) {
            showProductInfo(intent.getStringExtra("product")!!)
        }
    }

    private fun showProductInfo(productInfo: String) {
        this.findNavController(R.id.nav_host_fragment)
            .navigate(ProductInfoFragmentDirections.actionShowProductInfo(productInfo))
    }

    override fun onNewIntent(intent: Intent) {
        if (intent.hasExtra("product")) {
            showProductInfo(intent.getStringExtra("product")!!)
        }
        super.onNewIntent(intent)
    }
}