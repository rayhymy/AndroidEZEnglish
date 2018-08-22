package apps.myapp.eze.ezenglish2.vocabulary.common_words;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

import apps.myapp.eze.ezenglish2.R;

public class CommonWordsRecyclerViewLessonI extends AppCompatActivity {

    ArrayList<ImageVO> ImageList;
    RecyclerView ImageRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(apps.myapp.eze.ezenglish2.R.layout.activity_common_words_recycler_view_lesson_i);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ConstructRecycler();
    }

    private void fillContent(){
        //Expressions in A
        ImageList.add(new ImageVO(getString(apps.myapp.eze.ezenglish2.R.string.a_case),getString(apps.myapp.eze.ezenglish2.R.string.a_case_of_content),
                apps.myapp.eze.ezenglish2.R.drawable.a, apps.myapp.eze.ezenglish2.R.drawable.a_case_of_mistaken_identity));
        ImageList.add(new ImageVO(getString(apps.myapp.eze.ezenglish2.R.string.a_change_of_pace),getString(apps.myapp.eze.ezenglish2.R.string.a_change_of_pace_content), apps.myapp.eze.ezenglish2.R.drawable.a, apps.myapp.eze.ezenglish2.R.drawable.a_change_of_pace));
        ImageList.add(new ImageVO(getString(apps.myapp.eze.ezenglish2.R.string.a_chance_of_scenery),getString(apps.myapp.eze.ezenglish2.R.string.a_chance_of_scenery_content), apps.myapp.eze.ezenglish2.R.drawable.a, apps.myapp.eze.ezenglish2.R.drawable.a_change_of_scenery));
        ImageList.add(new ImageVO(getString(apps.myapp.eze.ezenglish2.R.string.a_chip_off_the_old_block),getString(apps.myapp.eze.ezenglish2.R.string.a_chip_off_the_old_block_content), apps.myapp.eze.ezenglish2.R.drawable.a, apps.myapp.eze.ezenglish2.R.drawable.a_chip_off_the_old_block));
        ImageList.add(new ImageVO(getString(apps.myapp.eze.ezenglish2.R.string.a_chip_on_your_shoulder),getString(apps.myapp.eze.ezenglish2.R.string.a_chip_on_your_shoulder_content),
                 apps.myapp.eze.ezenglish2.R.drawable.a, apps.myapp.eze.ezenglish2.R.drawable.a_chip_on_your_shoulder));
        ImageList.add(new ImageVO(getString(apps.myapp.eze.ezenglish2.R.string.a_copycat),getString(apps.myapp.eze.ezenglish2.R.string.a_copycat_content), apps.myapp.eze.ezenglish2.R.drawable.a, apps.myapp.eze.ezenglish2.R.drawable.a_copy_cat));
        ImageList.add(new ImageVO(getString(apps.myapp.eze.ezenglish2.R.string.a_crying_shame),getString(apps.myapp.eze.ezenglish2.R.string.a_crying_shame_content), apps.myapp.eze.ezenglish2.R.drawable.a, apps.myapp.eze.ezenglish2.R.drawable.a_crying_shame));
        ImageList.add(new ImageVO(getString(R.string.a_cut_above),getString(R.string.a_cut_above_description),apps.myapp.eze.ezenglish2.R.drawable.a, apps.myapp.eze.ezenglish2.R.drawable.a_cut_above));
        ImageList.add(new ImageVO(getString(R.string.all_night_long),getString(R.string.all_night_long_description), apps.myapp.eze.ezenglish2.R.drawable.a, apps.myapp.eze.ezenglish2.R.drawable.all_night_long));
        ImageList.add(new ImageVO(getString(R.string.all_over),getString(R.string.all_over_description), apps.myapp.eze.ezenglish2.R.drawable.a, apps.myapp.eze.ezenglish2.R.drawable.all_over));
        ImageList.add(new ImageVO(getString(R.string.all_over_again),getString(R.string.all_over_again_description), apps.myapp.eze.ezenglish2.R.drawable.a, apps.myapp.eze.ezenglish2.R.drawable.all_over_again));
        ImageList.add(new ImageVO(getString(R.string.all_set),getString(R.string.all_set_description), apps.myapp.eze.ezenglish2.R.drawable.a, apps.myapp.eze.ezenglish2.R.drawable.all_set_image));
        ImageList.add(new ImageVO(getString(R.string.all_skin_and_bones),getString(R.string.all_skin_and_bones_description), apps.myapp.eze.ezenglish2.R.drawable.a, apps.myapp.eze.ezenglish2.R.drawable.all_skin_and_bones));
        ImageList.add(new ImageVO(getString(R.string.all_talk_and_no_action),getString(R.string.all_talk_and_no_action_description), apps.myapp.eze.ezenglish2.R.drawable.a, apps.myapp.eze.ezenglish2.R.drawable.all_talk_no_action));
        ImageList.add(new ImageVO(getString(R.string.all_the_rage),getString(R.string.all_the_rage_description), apps.myapp.eze.ezenglish2.R.drawable.a, apps.myapp.eze.ezenglish2.R.drawable.all_the_rage));

        // Expressions in B
        ImageList.add(new ImageVO(getString(R.string.back_and_forth),getString(R.string.back_and_forth_description), apps.myapp.eze.ezenglish2.R.drawable.b, apps.myapp.eze.ezenglish2.R.drawable.back_and_forth));
        ImageList.add(new ImageVO(getString(R.string.back_down_from),getString(R.string.back_down_from_description), apps.myapp.eze.ezenglish2.R.drawable.b, apps.myapp.eze.ezenglish2.R.drawable.back_down_from));
        ImageList.add(new ImageVO(getString(R.string.back_in_circulation),getString(R.string.back_in_circulation_description), apps.myapp.eze.ezenglish2.R.drawable.b, apps.myapp.eze.ezenglish2.R.drawable.back_in_circulation));
        ImageList.add(new ImageVO(getString(R.string.back_me_up),getString(R.string.back_me_up_description), apps.myapp.eze.ezenglish2.R.drawable.b, apps.myapp.eze.ezenglish2.R.drawable.back_me_up));
        ImageList.add(new ImageVO(getString(R.string.back_off),getString(R.string.back_off_description), apps.myapp.eze.ezenglish2.R.drawable.b, apps.myapp.eze.ezenglish2.R.drawable.back_off));
        ImageList.add(new ImageVO(getString(R.string.back_order_them),getString(R.string.back_order_them_description), apps.myapp.eze.ezenglish2.R.drawable.b, apps.myapp.eze.ezenglish2.R.drawable.back_order));
        ImageList.add(new ImageVO(getString(R.string.back_the_wrong_horse),getString(R.string.back_the_wrong_horse_description), apps.myapp.eze.ezenglish2.R.drawable.b, apps.myapp.eze.ezenglish2.R.drawable.back_the_wrong_horse));
        ImageList.add(new ImageVO(getString(R.string.back_to_back),getString(R.string.back_to_back_description),apps.myapp.eze.ezenglish2.R.drawable.b, apps.myapp.eze.ezenglish2.R.drawable.back_to_back));
        ImageList.add(new ImageVO(getString(R.string.back_to_square_one),getString(R.string.back_to_square_one_description), apps.myapp.eze.ezenglish2.R.drawable.b, apps.myapp.eze.ezenglish2.R.drawable.back_to_square_one));
        ImageList.add(new ImageVO(getString(R.string.bad_blood_between_people),getString(R.string.bad_blood_between_people_description), apps.myapp.eze.ezenglish2.R.drawable.b, apps.myapp.eze.ezenglish2.R.drawable.bad_blood_between));
        ImageList.add(new ImageVO(getString(R.string.bad_mouthing_you),getString(R.string.bad_mouthing_you_description), apps.myapp.eze.ezenglish2.R.drawable.b, apps.myapp.eze.ezenglish2.R.drawable.bad_mouthing_someone));
        ImageList.add(new ImageVO(getString(R.string.bag_of_tricks),getString(R.string.bag_of_tricks_description), apps.myapp.eze.ezenglish2.R.drawable.b, apps.myapp.eze.ezenglish2.R.drawable.bag_of_tricks));
        ImageList.add(new ImageVO(getString(R.string.bail_me_out),getString(R.string.bail_me_out_description), apps.myapp.eze.ezenglish2.R.drawable.b, apps.myapp.eze.ezenglish2.R.drawable.bail_me_out));
        ImageList.add(new ImageVO(getString(R.string.bait_and_switch),getString(R.string.bait_and_switch_description), apps.myapp.eze.ezenglish2.R.drawable.b, apps.myapp.eze.ezenglish2.R.drawable.bait_and_switch));
        ImageList.add(new ImageVO(getString(R.string.bank_on_something),getString(R.string.bank_on_something_description), apps.myapp.eze.ezenglish2.R.drawable.b, apps.myapp.eze.ezenglish2.R.drawable.bank_on_it));

        //Expressions in C
        ImageList.add(new ImageVO(getString(R.string.call_it_a_day),getString(R.string.call_it_day_description), apps.myapp.eze.ezenglish2.R.drawable.c, apps.myapp.eze.ezenglish2.R.drawable.call_it_a_day));
        ImageList.add(new ImageVO(getString(R.string.call_it_a_night),getString(R.string.call_it_a_night_description), apps.myapp.eze.ezenglish2.R.drawable.c, apps.myapp.eze.ezenglish2.R.drawable.call_it_a_night));
        ImageList.add(new ImageVO(getString(R.string.call_it_off),getString(R.string.call_it_off_description), apps.myapp.eze.ezenglish2.R.drawable.c, apps.myapp.eze.ezenglish2.R.drawable.call_it_off));
        ImageList.add(new ImageVO(getString(R.string.calling_people_names),getString(R.string.calling_people_names_description), apps.myapp.eze.ezenglish2.R.drawable.c, apps.myapp.eze.ezenglish2.R.drawable.calling_people_names));
        ImageList.add(new ImageVO(getString(R.string.can_take_it_to_the_bank),getString(R.string.can_take_it_to_the_bank_description), apps.myapp.eze.ezenglish2.R.drawable.c, apps.myapp.eze.ezenglish2.R.drawable.can_take_it_to_the_bank));
        ImageList.add(new ImageVO(getString(R.string.can_you_imagine),getString(R.string.can_you_imagine_description), apps.myapp.eze.ezenglish2.R.drawable.c, apps.myapp.eze.ezenglish2.R.drawable.can_you_imagine));
        ImageList.add(new ImageVO(getString(R.string.can_t_carry_a_tune),getString(R.string.can_t_carry_a_tune_description), apps.myapp.eze.ezenglish2.R.drawable.c, apps.myapp.eze.ezenglish2.R.drawable.can_t_carry_a_tune));
        ImageList.add(new ImageVO(getString(R.string.can_t_cut_the_mustard),getString(R.string.can_t_cut_the_mustard_description), apps.myapp.eze.ezenglish2.R.drawable.c, apps.myapp.eze.ezenglish2.R.drawable.can_t_cut_the_mustard));
        ImageList.add(new ImageVO(getString(R.string.can_t_do_anything_with_someone),getString(R.string.can_t_do_anything_someone_description), apps.myapp.eze.ezenglish2.R.drawable.c, apps.myapp.eze.ezenglish2.R.drawable.can_t_do_anything));
        ImageList.add(new ImageVO(getString(R.string.can_t_hold_a_candle_to_someone),getString(R.string.can_t_hold_a_candle_to_someone_description), apps.myapp.eze.ezenglish2.R.drawable.c, apps.myapp.eze.ezenglish2.R.drawable.can_t_hold_a_candle));
        ImageList.add(new ImageVO(getString(R.string.cannot_help_doing_something),getString(R.string.cannot_help_doing_something_description), apps.myapp.eze.ezenglish2.R.drawable.c, apps.myapp.eze.ezenglish2.R.drawable.cannot_help_doing_something));
        ImageList.add(new ImageVO(getString(R.string.carry_a_secret_to_one_s_grave),getString(R.string.carry_a_secret_to_one_s_grave_description), apps.myapp.eze.ezenglish2.R.drawable.c, apps.myapp.eze.ezenglish2.R.drawable.carry_a_secret_to_grave));
        ImageList.add(new ImageVO(getString(R.string.carry_on_without_someone),getString(R.string.carry_on_without_someone_description), apps.myapp.eze.ezenglish2.R.drawable.c, apps.myapp.eze.ezenglish2.R.drawable.carry_on));
        ImageList.add(new ImageVO(getString(R.string.carrying_it_a_bit_too_far),getString(R.string.carrying_it_a_bit_too_far_description), apps.myapp.eze.ezenglish2.R.drawable.c, apps.myapp.eze.ezenglish2.R.drawable.carrying_it_a_little_bit));
        ImageList.add(new ImageVO(getString(R.string.cash_and_carry),getString(R.string.cash_and_carry_description), apps.myapp.eze.ezenglish2.R.drawable.c, apps.myapp.eze.ezenglish2.R.drawable.cash_and_carry));

        //Expressions in D
        ImageList.add(new ImageVO(getString(R.string.digging_your_own_grave),getString(R.string.digging_your_own_grave_description), apps.myapp.eze.ezenglish2.R.drawable.d, apps.myapp.eze.ezenglish2.R.drawable.d));
        ImageList.add(new ImageVO(getString(R.string.dirty_work),getString(R.string.dirty_work_description), apps.myapp.eze.ezenglish2.R.drawable.d, apps.myapp.eze.ezenglish2.R.drawable.d));
        ImageList.add(new ImageVO(getString(R.string.do_one_s_own_thing),getString(R.string.do_one_s_own_thing_description), apps.myapp.eze.ezenglish2.R.drawable.d, apps.myapp.eze.ezenglish2.R.drawable.d));
        ImageList.add(new ImageVO(getString(R.string.do_one_s_part),"\n" +
                getString(R.string.do_one_s_part_description), apps.myapp.eze.ezenglish2.R.drawable.d, apps.myapp.eze.ezenglish2.R.drawable.d));
        ImageList.add(new ImageVO(getString(R.string.do_so),getString(R.string.do_so_description), apps.myapp.eze.ezenglish2.R.drawable.d, apps.myapp.eze.ezenglish2.R.drawable.d));
        ImageList.add(new ImageVO(getString(R.string.doing_as_you_are_told),getString(R.string.doing_as_you_are_told_description), apps.myapp.eze.ezenglish2.R.drawable.d, apps.myapp.eze.ezenglish2.R.drawable.d));
        ImageList.add(new ImageVO(getString(R.string.doing_the_trik),getString(R.string.doing_the_triks_description), apps.myapp.eze.ezenglish2.R.drawable.d, apps.myapp.eze.ezenglish2.R.drawable.d));
        ImageList.add(new ImageVO(getString(R.string.doing_wonders),getString(R.string.doing_wonders_description), apps.myapp.eze.ezenglish2.R.drawable.d, apps.myapp.eze.ezenglish2.R.drawable.d));
        ImageList.add(new ImageVO(getString(R.string.doing_your_homework),getString(R.string.doing_your_homework_description), apps.myapp.eze.ezenglish2.R.drawable.d, apps.myapp.eze.ezenglish2.R.drawable.d));
        ImageList.add(new ImageVO(getString(R.string.doing_your_stuff),getString(R.string.doing_your_stuff_description), apps.myapp.eze.ezenglish2.R.drawable.d, apps.myapp.eze.ezenglish2.R.drawable.d));
        ImageList.add(new ImageVO(getString(R.string.don_t_burn_your_bridges),getString(R.string.don_t_burn_your_bridges_description), apps.myapp.eze.ezenglish2.R.drawable.d, apps.myapp.eze.ezenglish2.R.drawable.d));
        ImageList.add(new ImageVO(getString(R.string.don_t_count_your_chicken),getString(R.string.don_t_count_your_chicken_description), apps.myapp.eze.ezenglish2.R.drawable.d, apps.myapp.eze.ezenglish2.R.drawable.d));
        ImageList.add(new ImageVO(getString(R.string.don_t_put_all_your_eggs_in_one_basket),getString(R.string.don_t_put_all_your_eggs_in_one_basket_description), apps.myapp.eze.ezenglish2.R.drawable.d, apps.myapp.eze.ezenglish2.R.drawable.d));
        ImageList.add(new ImageVO(getString(R.string.down_on_someones),getString(R.string.down_on_someones_description), apps.myapp.eze.ezenglish2.R.drawable.d, apps.myapp.eze.ezenglish2.R.drawable.d));
        ImageList.add(new ImageVO(getString(R.string.down_the_hatch),getString(R.string.down_the_hatch_description), apps.myapp.eze.ezenglish2.R.drawable.d, apps.myapp.eze.ezenglish2.R.drawable.d));
        //ImageList.add(new ImageVO("","",R.drawable.commonwords));
    }
    public void onClick(View view) {

        switch (view.getId()){
            case apps.myapp.eze.ezenglish2.R.id.btnList: Utilities.visualization = Utilities.LIST;
                break;
            case apps.myapp.eze.ezenglish2.R.id.btnGrid: Utilities.visualization = Utilities.GRID;
                break;
        }
        ConstructRecycler();
    }
    private void ConstructRecycler() {
        ImageList =new ArrayList<>();
        ImageRecycler = findViewById(apps.myapp.eze.ezenglish2.R.id.RecyclerId);

        if (Utilities.visualization == Utilities.LIST){
            ImageRecycler.setLayoutManager(new LinearLayoutManager(this));
        }else {
            ImageRecycler.setLayoutManager(new GridLayoutManager(this,3));
        }

        fillContent();

        AdaptorImages adapter=new AdaptorImages(ImageList);

        adapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        ImageList.get
                                (ImageRecycler.getChildAdapterPosition(view))
                                .getInfo(),Toast.LENGTH_LONG).show();
            }
        });

        ImageRecycler.setAdapter(adapter);
    }
}
