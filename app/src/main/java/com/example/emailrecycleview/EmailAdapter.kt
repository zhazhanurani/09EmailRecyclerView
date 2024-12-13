import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.emailrecycleview.Email
import com.example.emailrecycleview.databinding.ItemDisasterBinding

class EmailAdapter(private val emails: List<Email>,
                   private val onItemClick: (Email) -> Unit
) : RecyclerView.Adapter<EmailAdapter.EmailViewHolder>() {
    inner class EmailViewHolder(private val binding: ItemDisasterBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(email: Email) {
            binding.name.text = email.name
            binding.date.text = email.date
            binding.description.text = if (email.description.length > 50) {
                "${email.description.substring(0, 50)}..."
            } else {
                email.description
            }

            // Set click listener on the item view
            itemView.setOnClickListener {
                onItemClick(email)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        val binding = ItemDisasterBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return EmailViewHolder(binding)
    }

    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        holder.bind(emails[position])
    }

    override fun getItemCount(): Int = emails.size
}