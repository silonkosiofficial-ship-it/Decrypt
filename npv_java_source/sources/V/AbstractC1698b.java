package V;

/* JADX INFO: renamed from: V.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1698b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p087i7.InterfaceC6668n f14832a = p087i7.AbstractC6669o.b(V.AbstractC1698b.a.f14834D);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f14833b;

    /* JADX INFO: renamed from: V.b$a */
    static final class a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final V.AbstractC1698b.a f14834D = new V.AbstractC1698b.a();

        a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final V.InterfaceC1723j0 b() {
            return android.os.Looper.getMainLooper() != null ? V.H.f14666C : V.C1712f1.f14855C;
        }
    }

    static {
        long id;
        try {
            id = android.os.Looper.getMainLooper().getThread().getId();
        } catch (java.lang.Exception unused) {
            id = -1;
        }
        f14833b = id;
    }

    public static final V.InterfaceC1742q0 a(float f6) {
        return new V.A0(f6);
    }

    public static final V.InterfaceC1745s0 b(int i6) {
        return new V.B0(i6);
    }

    public static final V.InterfaceC1749u0 c(long j6) {
        return new V.C0(j6);
    }

    public static final p051f0.q d(java.lang.Object obj, V.u1 u1Var) {
        return new V.D0(obj, u1Var);
    }

    public static final long e() {
        return f14833b;
    }

    public static final void f(java.lang.String str, java.lang.Throwable th) {
    }
}
