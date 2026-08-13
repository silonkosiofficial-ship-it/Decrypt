package p171r0;

/* JADX INFO: loaded from: classes.dex */
public abstract class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r0.G.a f53496a = new r0.G.a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f53497b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final boolean a() {
            return p171r0.G.f53497b;
        }
    }

    static {
        java.lang.String lowerCase = android.os.Build.FINGERPRINT.toLowerCase(java.util.Locale.ROOT);
        p247y7.AbstractC7350t.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        f53497b = p247y7.AbstractC7350t.b(lowerCase, "robolectric");
    }
}
