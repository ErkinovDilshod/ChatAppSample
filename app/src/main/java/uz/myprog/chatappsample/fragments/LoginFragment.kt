package uz.myprog.chatappsample.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_login.view.*
import uz.myprog.chatappsample.Communicator
import uz.myprog.chatappsample.R

class LoginFragment : Fragment() {


    lateinit var communicator:Communicator
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_login, container, false)
        communicator = activity as Communicator

        view.btn_login.setOnClickListener{
            communicator.passDataCom(view.btn_login.text.toString())
        }
        return view
    }


}