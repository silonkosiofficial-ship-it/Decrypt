package p012b1;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f24075a = false;

    public static final class a {
        a() {
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p092j1.h f24076D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p092j1.h hVar) {
            super(1);
            this.f24076D = hVar;
        }

        public final void a(androidx.compose.ui.graphics.c cVar) {
            p247y7.AbstractC7350t.f(cVar, "$this$null");
            if (!java.lang.Float.isNaN(this.f24076D.f()) || !java.lang.Float.isNaN(this.f24076D.g())) {
                cVar.T0(p141o0.m2.a(java.lang.Float.isNaN(this.f24076D.f()) ? 0.5f : this.f24076D.f(), java.lang.Float.isNaN(this.f24076D.g()) ? 0.5f : this.f24076D.g()));
            }
            if (!java.lang.Float.isNaN(this.f24076D.h())) {
                cVar.n(this.f24076D.h());
            }
            if (!java.lang.Float.isNaN(this.f24076D.i())) {
                cVar.c(this.f24076D.i());
            }
            if (!java.lang.Float.isNaN(this.f24076D.j())) {
                cVar.d(this.f24076D.j());
            }
            if (!java.lang.Float.isNaN(this.f24076D.n())) {
                cVar.j(this.f24076D.n());
            }
            if (!java.lang.Float.isNaN(this.f24076D.o())) {
                cVar.e(this.f24076D.o());
            }
            if (!java.lang.Float.isNaN(this.f24076D.p())) {
                cVar.p(this.f24076D.p());
            }
            if (!java.lang.Float.isNaN(this.f24076D.k()) || !java.lang.Float.isNaN(this.f24076D.l())) {
                cVar.h(java.lang.Float.isNaN(this.f24076D.k()) ? 1.0f : this.f24076D.k());
                cVar.g(java.lang.Float.isNaN(this.f24076D.l()) ? 1.0f : this.f24076D.l());
            }
            if (java.lang.Float.isNaN(this.f24076D.c())) {
                return;
            }
            cVar.b(this.f24076D.c());
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((androidx.compose.ui.graphics.c) obj);
            return p087i7.M.f46721a;
        }
    }

    public static final void c(p012b1.z zVar, java.util.List list) {
        p247y7.AbstractC7350t.f(zVar, "state");
        p247y7.AbstractC7350t.f(list, "measurables");
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            D0.G g6 = (D0.G) list.get(i6);
            java.lang.Object objA = androidx.compose.ui.layout.a.a(g6);
            if (objA == null && (objA = p012b1.m.a(g6)) == null) {
                objA = d();
            }
            zVar.t(objA.toString(), g6);
            java.lang.Object objB = p012b1.m.b(g6);
            if (objB != null && (objB instanceof java.lang.String) && (objA instanceof java.lang.String)) {
                zVar.z((java.lang.String) objA, (java.lang.String) objB);
            }
        }
    }

    public static final java.lang.Object d() {
        return new b1.j.a();
    }

    public static final void e(D0.X.a aVar, D0.X x6, p092j1.h hVar, long j6) {
        p247y7.AbstractC7350t.f(aVar, "$this$placeWithFrameTransform");
        p247y7.AbstractC7350t.f(x6, "placeable");
        p247y7.AbstractC7350t.f(hVar, "frame");
        if (hVar.q() != 8) {
            if (hVar.s()) {
                D0.X.a.j(aVar, x6, Y0.q.a(hVar.e() - Y0.p.h(j6), hVar.m() - Y0.p.i(j6)), 0.0f, 2, null);
                return;
            } else {
                aVar.u(x6, hVar.e() - Y0.p.h(j6), hVar.m() - Y0.p.i(j6), java.lang.Float.isNaN(hVar.p()) ? 0.0f : hVar.p(), new b1.j.b(hVar));
                return;
            }
        }
        if (f24075a) {
            p032d1.a.f44286a.a("CCL", "Widget: " + hVar.d() + " is Gone. Skipping placement.");
        }
    }

    public static /* synthetic */ void f(D0.X.a aVar, D0.X x6, p092j1.h hVar, long j6, int i6, java.lang.Object obj) {
        if ((i6 & 4) != 0) {
            j6 = Y0.p.f16221b.a();
        }
        e(aVar, x6, hVar, j6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String g(p122m1.e eVar) {
        return eVar.q() + " width " + eVar.B0() + " minWidth " + eVar.m0() + " maxWidth " + eVar.j0() + " height " + eVar.w() + " minHeight " + eVar.l0() + " maxHeight " + eVar.i0() + " HDB " + eVar.A() + " VDB " + eVar.y0() + " MCW " + eVar.Q() + " MCH " + eVar.P() + " percentW " + eVar.W() + " percentH " + eVar.V();
    }
}
