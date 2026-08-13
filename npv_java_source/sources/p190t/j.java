package p190t;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p237x7.l f54496a = t.j.a.f54497D;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final t.j.a f54497D = new t.j.a();

        /* JADX INFO: renamed from: t.j$a$a, reason: collision with other inner class name */
        static final class C0709a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            public static final t.j.a.C0709a f54498D = new t.j.a.C0709a();

            C0709a() {
                super(1);
            }

            public final p200u.C7189q a(long j6) {
                long jK = p141o0.C7016y0.k(j6, p151p0.g.f52623a.t());
                return new p200u.C7189q(p141o0.C7016y0.p(jK), p141o0.C7016y0.t(jK), p141o0.C7016y0.s(jK), p141o0.C7016y0.q(jK));
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                return a(((p141o0.C7016y0) obj).w());
            }
        }

        static final class b extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ p151p0.c f54499D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(p151p0.c cVar) {
                super(1);
                this.f54499D = cVar;
            }

            public final long a(p200u.C7189q c7189q) {
                float fG = c7189q.g();
                if (fG < 0.0f) {
                    fG = 0.0f;
                }
                if (fG > 1.0f) {
                    fG = 1.0f;
                }
                float fH = c7189q.h();
                if (fH < -0.5f) {
                    fH = -0.5f;
                }
                if (fH > 0.5f) {
                    fH = 0.5f;
                }
                float fI = c7189q.i();
                float f6 = fI >= -0.5f ? fI : -0.5f;
                float f10 = f6 <= 0.5f ? f6 : 0.5f;
                float f11 = c7189q.f();
                float f12 = f11 >= 0.0f ? f11 : 0.0f;
                return p141o0.C7016y0.k(p141o0.A0.a(fG, fH, f10, f12 <= 1.0f ? f12 : 1.0f, p151p0.g.f52623a.t()), this.f54499D);
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                return p141o0.C7016y0.i(a((p200u.C7189q) obj));
            }
        }

        a() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p200u.x0 l(p151p0.c cVar) {
            return p200u.z0.a(t.j.a.C0709a.f54498D, new t.j.a.b(cVar));
        }
    }

    public static final p237x7.l a(p141o0.C7016y0.a aVar) {
        return f54496a;
    }
}
