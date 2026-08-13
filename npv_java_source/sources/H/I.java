package H;

/* JADX INFO: loaded from: classes.dex */
public abstract class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.String f3683a = S8.r.N("H", 10);

    public static final long a(M0.P p6, Y0.e eVar, R0.AbstractC1494h.b bVar, java.lang.String str, int i6) {
        M0.InterfaceC1344p interfaceC1344pA = M0.AbstractC1348u.a(str, p6, Y0.c.b(0, 0, 0, 0, 15, null), eVar, bVar, (64 & 32) != 0 ? p097j7.AbstractC6879v.m() : p097j7.AbstractC6879v.m(), (64 & 64) != 0 ? p097j7.AbstractC6879v.m() : null, (64 & 128) != 0 ? Integer.MAX_VALUE : i6, (64 & 256) != 0 ? false : false);
        return Y0.u.a(H.E.a(interfaceC1344pA.a()), H.E.a(interfaceC1344pA.getHeight()));
    }

    public static /* synthetic */ long b(M0.P p6, Y0.e eVar, R0.AbstractC1494h.b bVar, java.lang.String str, int i6, int i10, java.lang.Object obj) {
        if ((i10 & 8) != 0) {
            str = f3683a;
        }
        if ((i10 & 16) != 0) {
            i6 = 1;
        }
        return a(p6, eVar, bVar, str, i6);
    }

    public static final java.lang.String c() {
        return f3683a;
    }
}
