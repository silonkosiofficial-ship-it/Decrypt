package p214v3;

/* JADX INFO: renamed from: v3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7234b {
    /* synthetic */ AbstractC7234b(p214v3.X0 x6) {
    }

    public abstract android.webkit.CookieManager a(android.content.Context context);

    public abstract android.webkit.WebResourceResponse b(java.lang.String str, java.lang.String str2, int i6, java.lang.String str3, java.util.Map map, java.io.InputStream inputStream);

    public abstract com.google.android.gms.internal.ads.AbstractC3097Zt c(com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot, com.google.android.gms.internal.ads.C4704od c4704od, boolean z6, com.google.android.gms.internal.ads.BinderC5240tT binderC5240tT);

    public boolean d(android.app.Activity activity, android.content.res.Configuration configuration) {
        return false;
    }

    public android.content.Intent e(android.app.Activity activity) {
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("app_package", activity.getPackageName());
        intent.putExtra("app_uid", activity.getApplicationInfo().uid);
        return intent;
    }

    public com.google.android.gms.internal.ads.EnumC2932Ve f(android.content.Context context, android.telephony.TelephonyManager telephonyManager) {
        return com.google.android.gms.internal.ads.EnumC2932Ve.ENUM_UNKNOWN;
    }

    public void g(android.content.Context context, java.lang.String str, java.lang.String str2) {
    }

    public boolean h(android.content.Context context, java.lang.String str) {
        return false;
    }

    public int i(android.media.AudioManager audioManager) {
        return 0;
    }

    public void j(android.app.Activity activity) {
    }

    public int k(android.content.Context context) {
        return ((android.telephony.TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }
}
