package com.chukwuwa.uchenna.cardverification.app.ui.card.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.chukwuwa.uchenna.cardverification.app.util.Constants.DEFAULT_TEXT
import com.chukwuwa.uchenna.cardverification.core.domain.carddomain.CardDataRespone
import com.chukwuwa.uchenna.cardverification.databinding.FragmentCardResultBinding

class CardResultFragment(private val cardDataResponse: CardDataRespone) : DialogFragment() {

    private val binding: FragmentCardResultBinding by lazy {
        FragmentCardResultBinding.inflate(layoutInflater)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        populateData(cardDataResponse)
        return binding.root
    }

    private fun populateData(cardData: CardDataRespone) {
        with(binding) {
            textScheme.text = cardData.scheme ?: DEFAULT_TEXT
            textBank.text = cardData.bank?.name ?: DEFAULT_TEXT
            textCardNumberLength.text = cardData.number?.length?.toString() ?: DEFAULT_TEXT
            textCountry.text = cardData.country?.name ?: DEFAULT_TEXT
            textPrepaid.text = cardData.prepaid?.toString() ?: DEFAULT_TEXT
            textType.text = cardData.type ?: DEFAULT_TEXT
        }
    }

}