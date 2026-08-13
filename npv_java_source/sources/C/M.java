package C;

/* JADX INFO: loaded from: classes.dex */
public abstract class M {

    public static final class a implements D.E {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C.K f1057a;

        a(C.K k6) {
            this.f1057a = k6;
        }

        @Override // D.E
        public int a() {
            return this.f1057a.r().e() == p230x.s.Vertical ? Y0.t.f(this.f1057a.r().a()) : Y0.t.g(this.f1057a.r().a());
        }

        @Override // D.E
        public float b() {
            return androidx.compose.foundation.lazy.layout.f.b(this.f1057a.n(), this.f1057a.o());
        }

        @Override // D.E
        public int c() {
            return this.f1057a.r().g() + this.f1057a.r().b();
        }

        @Override // D.E
        public float d() {
            return androidx.compose.foundation.lazy.layout.f.a(this.f1057a.n(), this.f1057a.o(), this.f1057a.c());
        }

        @Override // D.E
        public K0.b e() {
            return new K0.b(-1, -1);
        }

        @Override // D.E
        public java.lang.Object f(int i6, p127m7.e eVar) {
            java.lang.Object objE = C.K.E(this.f1057a, i6, 0, eVar, 2, null);
            return objE == p137n7.b.g() ? objE : p087i7.M.f46721a;
        }
    }

    public static final D.E a(C.K k6, boolean z6, V.InterfaceC1734n interfaceC1734n, int i6) {
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-1247008005, i6, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridSemanticState (LazySemantics.kt:33)");
        }
        boolean z10 = ((((i6 & 14) ^ 6) > 4 && interfaceC1734n.S(k6)) || (i6 & 6) == 4) | ((((i6 & 112) ^ 48) > 32 && interfaceC1734n.d(z6)) || (i6 & 48) == 32);
        java.lang.Object objG = interfaceC1734n.g();
        if (z10 || objG == V.InterfaceC1734n.f14931a.a()) {
            objG = new C.M.a(k6);
            interfaceC1734n.K(objG);
        }
        C.M.a aVar = (C.M.a) objG;
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return aVar;
    }
}
