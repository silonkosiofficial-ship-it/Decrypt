package p210v;

/* JADX INFO: renamed from: v.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7218l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f55717a = Y0.i.q(30);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final androidx.compose.ui.d f55718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final androidx.compose.ui.d f55719c;

    /* JADX INFO: renamed from: v.l$a */
    public static final class a implements p141o0.e2 {
        a() {
        }

        @Override // p141o0.e2
        public p141o0.L1 a(long j6, Y0.v vVar, Y0.e eVar) {
            float fS0 = eVar.S0(p210v.AbstractC7218l.b());
            return new o0.L1.b(new p131n0.i(0.0f, -fS0, p131n0.m.i(j6), p131n0.m.g(j6) + fS0));
        }
    }

    /* JADX INFO: renamed from: v.l$b */
    public static final class b implements p141o0.e2 {
        b() {
        }

        @Override // p141o0.e2
        public p141o0.L1 a(long j6, Y0.v vVar, Y0.e eVar) {
            float fS0 = eVar.S0(p210v.AbstractC7218l.b());
            return new o0.L1.b(new p131n0.i(-fS0, 0.0f, p131n0.m.i(j6) + fS0, p131n0.m.g(j6)));
        }
    }

    static {
        androidx.compose.ui.d.a aVar = androidx.compose.ui.d.f19586a;
        f55718b = p111l0.e.a(aVar, new p210v.AbstractC7218l.a());
        f55719c = p111l0.e.a(aVar, new p210v.AbstractC7218l.b());
    }

    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, p230x.s sVar) {
        return dVar.b(sVar == p230x.s.Vertical ? f55719c : f55718b);
    }

    public static final float b() {
        return f55717a;
    }
}
