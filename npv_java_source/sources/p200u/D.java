package p200u;

/* JADX INFO: loaded from: classes.dex */
public abstract class D {
    public static final float a(p200u.B b6, float f6, float f10) {
        return ((p200u.C7183n) b6.a(p200u.z0.i(p247y7.C7344m.f57303a)).b(p200u.AbstractC7191s.a(f6), p200u.AbstractC7191s.a(f10))).f();
    }

    public static final p200u.B b(float f6, float f10) {
        return d(new p200u.M(f6, f10));
    }

    public static /* synthetic */ p200u.B c(float f6, float f10, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            f6 = 1.0f;
        }
        if ((i6 & 2) != 0) {
            f10 = 0.1f;
        }
        return b(f6, f10);
    }

    public static final p200u.B d(p200u.L l6) {
        return new p200u.C(l6);
    }
}
