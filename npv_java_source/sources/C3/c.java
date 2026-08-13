package C3;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f1285a = (java.lang.String) com.google.android.gms.internal.ads.AbstractC5589wg.f39659a.e();

    public java.lang.String a(java.util.Map map) {
        android.net.Uri.Builder builderBuildUpon = android.net.Uri.parse(this.f1285a).buildUpon();
        for (java.util.Map.Entry entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
        }
        return builderBuildUpon.build().toString();
    }
}
