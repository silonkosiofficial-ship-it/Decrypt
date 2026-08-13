package P3;

/* JADX INFO: renamed from: P3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1448d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f8314a;

    public C1448d(android.app.Activity activity) {
        Q3.AbstractC1477p.m(activity, "Activity must not be null");
        this.f8314a = activity;
    }

    public final android.app.Activity a() {
        return (android.app.Activity) this.f8314a;
    }

    public final androidx.fragment.app.g b() {
        return (androidx.fragment.app.g) this.f8314a;
    }

    public final boolean c() {
        return this.f8314a instanceof android.app.Activity;
    }

    public final boolean d() {
        return this.f8314a instanceof androidx.fragment.app.g;
    }
}
