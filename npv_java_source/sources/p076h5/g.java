package p076h5;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final p076h5.g f46501c = new p076h5.g("FirebaseCrashlytics");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f46502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f46503b = 4;

    public g(java.lang.String str) {
        this.f46502a = str;
    }

    private boolean a(int i6) {
        return this.f46503b <= i6 || android.util.Log.isLoggable(this.f46502a, i6);
    }

    public static p076h5.g f() {
        return f46501c;
    }

    public void b(java.lang.String str) {
        c(str, null);
    }

    public void c(java.lang.String str, java.lang.Throwable th) {
        if (a(3)) {
            java.lang.String str2 = this.f46502a;
        }
    }

    public void d(java.lang.String str) {
        e(str, null);
    }

    public void e(java.lang.String str, java.lang.Throwable th) {
        if (a(6)) {
            java.lang.String str2 = this.f46502a;
        }
    }

    public void g(java.lang.String str) {
        h(str, null);
    }

    public void h(java.lang.String str, java.lang.Throwable th) {
        if (a(4)) {
            java.lang.String str2 = this.f46502a;
        }
    }

    public void i(java.lang.String str) {
        j(str, null);
    }

    public void j(java.lang.String str, java.lang.Throwable th) {
        if (a(2)) {
            java.lang.String str2 = this.f46502a;
        }
    }

    public void k(java.lang.String str) {
        l(str, null);
    }

    public void l(java.lang.String str, java.lang.Throwable th) {
        if (a(5)) {
            java.lang.String str2 = this.f46502a;
        }
    }
}
