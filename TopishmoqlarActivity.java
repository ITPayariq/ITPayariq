package uz.eko.bolajon.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import org.json.*;
import android.widget.ScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class TopishmoqlarActivity extends  AppCompatActivity  { 
	
	
	private ScrollView vscroll_root_control;
	private LinearLayout linear_root_control_1;
	private LinearLayout linear_logo;
	private LinearLayout linear_savol;
	private LinearLayout linear_root_control_2;
	private TextView textview_savol;
	private TextView textview_logo;
	private TextView textview_hisob;
	private TextView textview_atribut;
	private LinearLayout linear_round_radius_1;
	private LinearLayout linear_round_radius_2;
	private LinearLayout linear_round_radius_3;
	private CardView cardview_round_radius_1;
	private ImageView imageview_variant_1;
	private CardView cardview_round_radius_2;
	private ImageView imageview_variant_2;
	private CardView cardview_round_radius_3;
	private ImageView imageview_variant_3;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.topishmoqlar);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		vscroll_root_control = (ScrollView) findViewById(R.id.vscroll_root_control);
		linear_root_control_1 = (LinearLayout) findViewById(R.id.linear_root_control_1);
		linear_logo = (LinearLayout) findViewById(R.id.linear_logo);
		linear_savol = (LinearLayout) findViewById(R.id.linear_savol);
		linear_root_control_2 = (LinearLayout) findViewById(R.id.linear_root_control_2);
		textview_savol = (TextView) findViewById(R.id.textview_savol);
		textview_logo = (TextView) findViewById(R.id.textview_logo);
		textview_hisob = (TextView) findViewById(R.id.textview_hisob);
		textview_atribut = (TextView) findViewById(R.id.textview_atribut);
		linear_round_radius_1 = (LinearLayout) findViewById(R.id.linear_round_radius_1);
		linear_round_radius_2 = (LinearLayout) findViewById(R.id.linear_round_radius_2);
		linear_round_radius_3 = (LinearLayout) findViewById(R.id.linear_round_radius_3);
		cardview_round_radius_1 = (CardView) findViewById(R.id.cardview_round_radius_1);
		imageview_variant_1 = (ImageView) findViewById(R.id.imageview_variant_1);
		cardview_round_radius_2 = (CardView) findViewById(R.id.cardview_round_radius_2);
		imageview_variant_2 = (ImageView) findViewById(R.id.imageview_variant_2);
		cardview_round_radius_3 = (CardView) findViewById(R.id.cardview_round_radius_3);
		imageview_variant_3 = (ImageView) findViewById(R.id.imageview_variant_3);
	}
	
	private void initializeLogic() {
		getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
		getWindow().setStatusBarColor(0xFFFFFFFF);
		
		Window window = this.getWindow();window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS); window.setNavigationBarColor(Color.parseColor("#ffffff"));
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}