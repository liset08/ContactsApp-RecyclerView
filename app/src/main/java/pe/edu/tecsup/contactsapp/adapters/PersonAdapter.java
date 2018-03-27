package pe.edu.tecsup.contactsapp.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import pe.edu.tecsup.contactsapp.R;
import pe.edu.tecsup.contactsapp.models.Person;

/**
 * Created by ebenites on 23/03/2018.
 */

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.ViewHolder>{

    private List<Person> people;

    public void setPeople(List<Person> people) {
        this.people = people;
    }

    public class ViewHolder extends RecyclerView.ViewHolder { ///este view holdeer va tener cargado esta clase de biew holder

        ImageView pictureImage;
        TextView fullnameText;
        TextView emailText;

        public ViewHolder(View itemView) {
            super(itemView);
            pictureImage = itemView.findViewById(R.id.picture_image);
            fullnameText = itemView.findViewById(R.id.fullname_text);
            emailText = itemView.findViewById(R.id.email_text);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact, parent, false);
        ViewHolder viewHolder = new ViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {

        final Person person = people.get(position);

        int resId = holder.itemView.getContext().getResources().getIdentifier(person.getPicture(), "drawable", holder.itemView.getContext().getPackageName()); //busca la imagen mediante el registro del adaptador people
        holder.pictureImage.setImageResource(resId);

        holder.fullnameText.setText(person.getFullname());
        holder.emailText.setText(person.getEmail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast.makeText(holder.itemView.getContext(), "Detalles de Persona: " + person.getFullname(), Toast.LENGTH_SHORT).show();
                // Llamar a otra pantalla y mostrar sus detalles de esta persona ...

            }
        });

    }

    @Override
    public int getItemCount() {
        return people.size();
    }

}



















