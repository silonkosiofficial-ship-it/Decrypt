package androidx.appcompat.view;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.content.Context f17651a;

    private a(android.content.Context context) {
        this.f17651a = context;
    }

    public static androidx.appcompat.view.a b(android.content.Context context) {
        return new androidx.appcompat.view.a(context);
    }

    public boolean a() {
        return this.f17651a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.f17651a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        android.content.res.Configuration configuration = this.f17651a.getResources().getConfiguration();
        int i6 = configuration.screenWidthDp;
        int i10 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i6 > 600) {
            return 5;
        }
        if (i6 > 960 && i10 > 720) {
            return 5;
        }
        if (i6 > 720 && i10 > 960) {
            return 5;
        }
        if (i6 >= 500) {
            return 4;
        }
        if (i6 > 640 && i10 > 480) {
            return 4;
        }
        if (i6 <= 480 || i10 <= 640) {
            return i6 >= 360 ? 3 : 2;
        }
        return 4;
    }

    public boolean e() {
        return this.f17651a.getResources().getBoolean(p090j.b.f48650a);
    }

    public boolean f() {
        return true;
    }
}
