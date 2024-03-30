package ui;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import modelo.Inmueble;
import com.portal.listadepropiedades.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivityViewModel  extends AndroidViewModel {

    private MutableLiveData<List<Inmueble>> listaMutable;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
    }
    public LiveData<List<Inmueble>> getListaMutable(){
        if(listaMutable==null){
            this.listaMutable=new MutableLiveData<>();
        }
        return listaMutable;
    }
    public void cargarDatos(){
        ArrayList<Inmueble> list = new ArrayList<>();
        list.add(new Inmueble(R.drawable.casa1,"Merlo",10000));
        list.add(new Inmueble(R.drawable.casa2,"Naschel",45000));
        list.add(new Inmueble(R.drawable.casa3,"Tilisarao", 68000));
        list.add(new Inmueble(R.drawable.casa4,"Concaran", 68000));
        list.add(new Inmueble(R.drawable.casa5,"SanLuis", 68000));
        listaMutable.setValue(list);
        }


    }





