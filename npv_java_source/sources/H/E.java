package H;

/* JADX INFO: loaded from: classes.dex */
public abstract class E {
    public static final int a(float f6) {
        return java.lang.Math.round((float) java.lang.Math.ceil(f6));
    }

    public static final H.D b(H.D d6, M0.C1332d c1332d, M0.P p6, Y0.e eVar, R0.AbstractC1494h.b bVar, boolean z6, int i6, int i10, int i11, java.util.List list) {
        if (p247y7.AbstractC7350t.b(d6.k(), c1332d) && p247y7.AbstractC7350t.b(d6.j(), p6) && d6.i() == z6) {
            if (X0.u.e(d6.g(), i6)) {
                if (d6.d() == i10) {
                    if (d6.e() == i11 && p247y7.AbstractC7350t.b(d6.a(), eVar)) {
                        if (p247y7.AbstractC7350t.b(d6.h(), list) && d6.b() == bVar) {
                            return d6;
                        }
                    }
                }
            }
        }
        return new H.D(c1332d, p6, i10, i11, z6, i6, eVar, bVar, list, null);
    }
}
