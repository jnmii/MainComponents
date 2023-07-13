package com.example.maincomponents

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter(val contacts: List<MainActivity.Contact>) : RecyclerView.Adapter<ContactAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_contact_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val contact = contacts[position]
        holder.bind(contact)
    }

    override fun getItemCount(): Int {
        return contacts.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val tvContactName: TextView = view.findViewById(R.id.tvContactName)
        private val tvContactPhoneNumber: TextView = view.findViewById(R.id.tvContactPhoneNumber)

        fun bind(contact: MainActivity.Contact) {
            tvContactName.text = contact.name
            tvContactPhoneNumber.text = contact.phoneNumber
        }
    }
}
