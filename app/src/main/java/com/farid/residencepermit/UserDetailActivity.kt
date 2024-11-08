package com.farid.residencepermit

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.farid.residencepermit.databinding.ActivityUserDetailBinding
import com.farid.residencepermit.model.Permit

class UserDetailActivity : AppCompatActivity() {
    companion object {
        const val USER_PERMIT = "user_permit"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()


            val binding: ActivityUserDetailBinding = DataBindingUtil.setContentView(this, R.layout.activity_user_detail)

            val permit: Permit = intent.getParcelableExtra(USER_PERMIT) ?: Permit()

            binding.permit = permit


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}