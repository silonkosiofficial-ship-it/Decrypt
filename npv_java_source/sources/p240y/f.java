package p240y;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    public static final class a implements p240y.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ B.D f57077a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p240y.j f57078b;

        a(B.D d6, p240y.j jVar) {
            this.f57077a = d6;
            this.f57078b = jVar;
        }

        private final int c() {
            B.q qVarD = d();
            int iA = 0;
            if (qVarD.j().isEmpty()) {
                return 0;
            }
            int size = qVarD.j().size();
            java.util.Iterator it = qVarD.j().iterator();
            while (it.hasNext()) {
                iA += ((B.l) it.next()).a();
            }
            return iA / size;
        }

        private final B.q d() {
            return this.f57077a.w();
        }

        @Override // p240y.i
        public float a(float f6, float f10) {
            return E7.j.c(java.lang.Math.abs(f10) - c(), 0.0f) * java.lang.Math.signum(f10);
        }

        @Override // p240y.i
        public float b(float f6) {
            java.util.List listJ = d().j();
            p240y.j jVar = this.f57078b;
            int size = listJ.size();
            float f10 = Float.NEGATIVE_INFINITY;
            float f11 = Float.POSITIVE_INFINITY;
            for (int i6 = 0; i6 < size; i6++) {
                B.l lVar = (B.l) listJ.get(i6);
                float fA = p240y.k.a(p240y.f.d(d()), d().g(), d().b(), lVar.a(), lVar.c(), lVar.getIndex(), jVar, d().d());
                if (fA <= 0.0f && fA > f10) {
                    f10 = fA;
                }
                if (fA >= 0.0f && fA < f11) {
                    f11 = fA;
                }
            }
            return p240y.h.j(p240y.f.c(this.f57077a.q(), f6), f10, f11);
        }
    }

    public static final p240y.i a(B.D d6, p240y.j jVar) {
        return new y.f.a(d6, jVar);
    }

    public static /* synthetic */ p240y.i b(B.D d6, p240y.j jVar, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            jVar = y.j.a.f57123a;
        }
        return a(d6, jVar);
    }

    public static final int c(Y0.e eVar, float f6) {
        if (java.lang.Math.abs(f6) < eVar.B0(p240y.h.m())) {
            return p240y.d.f57073a.a();
        }
        return f6 > 0.0f ? p240y.d.f57073a.b() : p240y.d.f57073a.c();
    }

    public static final int d(B.q qVar) {
        return qVar.e() == p230x.s.Vertical ? Y0.t.f(qVar.a()) : Y0.t.g(qVar.a());
    }
}
