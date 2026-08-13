package p214v3;

/* JADX INFO: loaded from: classes.dex */
public class H0 extends p214v3.F0 {
    static final boolean l(int i6, int i10, int i11) {
        return java.lang.Math.abs(i6 - i10) <= i11;
    }

    @Override // p214v3.AbstractC7234b
    public final boolean d(android.app.Activity activity, android.content.res.Configuration configuration) {
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25398R4)).booleanValue()) {
            return false;
        }
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25420T4)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        p184s3.C7147y.b();
        int iZ = p224w3.g.z(activity, configuration.screenHeightDp);
        int iZ2 = p224w3.g.z(activity, configuration.screenWidthDp);
        android.view.WindowManager windowManager = (android.view.WindowManager) activity.getApplicationContext().getSystemService("window");
        p174r3.v.t();
        android.util.DisplayMetrics displayMetricsZ = p214v3.E0.Z(windowManager);
        int i6 = displayMetricsZ.heightPixels;
        int i10 = displayMetricsZ.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        int iRound = ((int) java.lang.Math.round(((double) activity.getResources().getDisplayMetrics().density) + 0.5d)) * ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25376P4)).intValue();
        return (l(i6, iZ + dimensionPixelSize, iRound) && l(i10, iZ2, iRound)) ? false : true;
    }
}
