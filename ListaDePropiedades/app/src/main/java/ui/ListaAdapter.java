package ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import modelo.Inmueble;
import com.portal.listadepropiedades.R;
import com.portal.listadepropiedades.databinding.ItemBinding;

import java.util.List;

public class ListaAdapter extends ArrayAdapter<Inmueble> {

    private ItemBinding binding;

    private Context context;
    private List<Inmueble> lista;
    private LayoutInflater li;
    private int itemAMostrar;

    public ListaAdapter(@NonNull Context context, int item, @NonNull List<Inmueble> objects, LayoutInflater layoutInflater) {
        super(context, item, objects);

        this.context= context;
        this.lista = objects;
        this.li= LayoutInflater.from(context);
        this.itemAMostrar=item;
        binding = ItemBinding.inflate(li);
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @SuppressLint("SetTextI18n")
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView , @NonNull ViewGroup parent) {
        View itemView = convertView;


        if (itemView == null){
            //invoco el metoodo inflate y le paso ek xml del item, le paso el padre.
            itemView=li.inflate(itemAMostrar,parent,false);
        }

        Inmueble inmueble = lista.get(position);

        ImageView foto = itemView.findViewById(R.id.foto);
        foto.setImageResource(inmueble.getFoto());
        TextView direccion =itemView.findViewById(R.id.direccion);
        direccion.setText(inmueble.getDireccion());
        TextView precio = itemView.findViewById(R.id.precio);
        precio.setText(inmueble.getPrecio()+"");
        return itemView;
    }
}
