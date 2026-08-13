package G;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final G.b f3008a = new G.c.a();

    public static final class a implements G.b {
        a() {
        }

        @Override // G.b
        public float a(long j6, Y0.e eVar) {
            return 0.0f;
        }

        public java.lang.String toString() {
            return "ZeroCornerSize";
        }
    }

    public static final G.b a(int i6) {
        return new G.e(i6);
    }

    public static final G.b b(float f6) {
        return new G.d(f6, null);
    }
}
