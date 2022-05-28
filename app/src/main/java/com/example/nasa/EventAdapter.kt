package com.example.nasa

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.event.view.*

class EventAdapter(
    private val events: MutableList<Event>
) : RecyclerView.Adapter<EventAdapter.EventViewHolder>()  {

    class EventViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventViewHolder {
        return EventViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.event,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: EventViewHolder, position: Int) {
        val curEvent = events[position]
        holder.itemView.apply {
            tvSpeaker.text = curEvent.speaker
            tvTime.text = curEvent.time
            tvVenue.text = curEvent.venue
            tvTopic.text = curEvent.topic
        }

    }

    override fun getItemCount(): Int {
        return events.size
    }
}