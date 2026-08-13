package X4;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.SharedPreferences f15878a;

    public g(android.content.Context context, java.lang.String str) {
        Q3.AbstractC1477p.l(context);
        Q3.AbstractC1477p.f(str);
        this.f15878a = context.getSharedPreferences(java.lang.String.format("com.google.firebase.appcheck.debug.store.%s", str), 0);
    }

    public java.lang.String a() {
        return this.f15878a.getString("com.google.firebase.appcheck.debug.DEBUG_SECRET", null);
    }

    public void b(java.lang.String str) {
        this.f15878a.edit().putString("com.google.firebase.appcheck.debug.DEBUG_SECRET", str).apply();
    }
}
