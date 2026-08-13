package Q3;

/* JADX INFO: renamed from: Q3.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1483w implements O3.a.d {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final Q3.C1483w f9026D = a().a();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.String f9027C;

    /* JADX INFO: renamed from: Q3.w$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.String f9028a;

        /* synthetic */ a(Q3.AbstractC1485y abstractC1485y) {
        }

        public Q3.C1483w a() {
            return new Q3.C1483w(this.f9028a, null);
        }

        public Q3.C1483w.a b(java.lang.String str) {
            this.f9028a = str;
            return this;
        }
    }

    /* synthetic */ C1483w(java.lang.String str, Q3.AbstractC1486z abstractC1486z) {
        this.f9027C = str;
    }

    public static Q3.C1483w.a a() {
        return new Q3.C1483w.a(null);
    }

    public final android.os.Bundle b() {
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String str = this.f9027C;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Q3.C1483w) {
            return Q3.AbstractC1475n.a(this.f9027C, ((Q3.C1483w) obj).f9027C);
        }
        return false;
    }

    public final int hashCode() {
        return Q3.AbstractC1475n.b(this.f9027C);
    }
}
