package apps.myapp.eze.ezenglish2.vocabulary.common_words;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdaptorImages extends RecyclerView
        .Adapter<AdaptorImages.ViewHolderImages> implements View.OnClickListener{

    ArrayList<ImageVO> imageList;
    private View.OnClickListener listener;

    public AdaptorImages(ArrayList<ImageVO> imageList) {
        this.imageList = imageList;

    }

    @NonNull
    @Override
    public ViewHolderImages onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        int layout=0;
        if (Utilities.visualization == Utilities.LIST){
            layout= apps.myapp.eze.ezenglish2.R.layout.common_words_list;
        }else {
            layout= apps.myapp.eze.ezenglish2.R.layout.item_grid_images;
        }

        View view= LayoutInflater.from(parent.getContext()).inflate(layout,null,false);

        view.setOnClickListener(this);
        return new ViewHolderImages(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderImages holder, int position) {
        holder.etiName.setText(imageList.get(position).getName());

        if (Utilities.visualization == Utilities.LIST){
            holder.etiInformation.setText(imageList.get(position).getInfo());
            holder.photo2.setImageResource(imageList.get(position).getImage2());
        }
        holder.photo.setImageResource(imageList.get(position).getImage());

    }

    @Override
    public int getItemCount() { return imageList.size(); }

    public void setOnClickListener(View.OnClickListener listener){
        this.listener=listener;
    }

    @Override
    public void onClick(View view) {
        if (listener!=null){
            listener.onClick(view);
        }
    }


    public class ViewHolderImages extends RecyclerView.ViewHolder {

        TextView etiName, etiInformation;
        ImageView photo,photo2;

        public ViewHolderImages(View itemView) {
            super(itemView);
            etiName = itemView.findViewById(apps.myapp.eze.ezenglish2.R.id.idName);
            if (Utilities.visualization == Utilities.LIST){
                etiInformation = itemView.findViewById(apps.myapp.eze.ezenglish2.R.id.idInfo);
                photo2 = itemView.findViewById(apps.myapp.eze.ezenglish2.R.id.idImage_description);
            }
            photo = itemView.findViewById(apps.myapp.eze.ezenglish2.R.id.idImage);
        }
    }
}
