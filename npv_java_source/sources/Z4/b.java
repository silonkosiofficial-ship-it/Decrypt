package Z4;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Z4.b f16704c = new Z4.b("FirebaseAppCheck");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f16705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f16706b = 4;

    public b(java.lang.String str) {
        this.f16705a = str;
    }

    private boolean a(int i6) {
        return this.f16706b <= i6 || android.util.Log.isLoggable(this.f16705a, i6);
    }

    public static Z4.b f() {
        return f16704c;
    }

    public void b(java.lang.String str) {
        c(str, null);
    }

    public void c(java.lang.String str, java.lang.Throwable th) {
        if (a(3)) {
            java.lang.String str2 = this.f16705a;
        }
    }

    public void d(java.lang.String str) {
        e(str, null);
    }

    public void e(java.lang.String str, java.lang.Throwable th) {
        if (a(6)) {
            java.lang.String str2 = this.f16705a;
        }
    }
}
