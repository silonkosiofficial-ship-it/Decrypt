package p161q0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    public static final class a implements p161q0.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p161q0.d f52922a;

        a(p161q0.d dVar) {
            this.f52922a = dVar;
        }

        @Override // p161q0.j
        public void a(float[] fArr) {
            this.f52922a.h().o(fArr);
        }

        @Override // p161q0.j
        public void b(p141o0.Q1 q6, int i6) {
            this.f52922a.h().b(q6, i6);
        }

        @Override // p161q0.j
        public void c(float f6, float f10, float f11, float f12, int i6) {
            this.f52922a.h().c(f6, f10, f11, f12, i6);
        }

        @Override // p161q0.j
        public void d(float f6, float f10) {
            this.f52922a.h().d(f6, f10);
        }

        @Override // p161q0.j
        public void e(float f6, float f10, long j6) {
            p141o0.InterfaceC6993q0 interfaceC6993q0H = this.f52922a.h();
            interfaceC6993q0H.d(p131n0.g.m(j6), p131n0.g.n(j6));
            interfaceC6993q0H.g(f6, f10);
            interfaceC6993q0H.d(-p131n0.g.m(j6), -p131n0.g.n(j6));
        }

        @Override // p161q0.j
        public void f(float f6, float f10, float f11, float f12) {
            p141o0.InterfaceC6993q0 interfaceC6993q0H = this.f52922a.h();
            p161q0.d dVar = this.f52922a;
            long jA = p131n0.n.a(p131n0.m.i(h()) - (f11 + f6), p131n0.m.g(h()) - (f12 + f10));
            if (!(p131n0.m.i(jA) >= 0.0f && p131n0.m.g(jA) >= 0.0f)) {
                p141o0.H1.a("Width and height must be greater than or equal to zero");
            }
            dVar.d(jA);
            interfaceC6993q0H.d(f6, f10);
        }

        @Override // p161q0.j
        public void g(float f6, long j6) {
            p141o0.InterfaceC6993q0 interfaceC6993q0H = this.f52922a.h();
            interfaceC6993q0H.d(p131n0.g.m(j6), p131n0.g.n(j6));
            interfaceC6993q0H.i(f6);
            interfaceC6993q0H.d(-p131n0.g.m(j6), -p131n0.g.n(j6));
        }

        public long h() {
            return this.f52922a.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p161q0.j b(p161q0.d dVar) {
        return new q0.b.a(dVar);
    }
}
