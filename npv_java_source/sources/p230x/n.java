package p230x;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p237x7.q f56571a = new x.n.a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p237x7.q f56572b = new x.n.b(null);

    static final class a extends p147o7.l implements p237x7.q {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f56573G;

        a(p127m7.e eVar) {
            super(3, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            p137n7.b.g();
            if (this.f56573G != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p087i7.x.b(obj);
            return p087i7.M.f46721a;
        }

        public final java.lang.Object H(W8.N n6, long j6, p127m7.e eVar) {
            return new x.n.a(eVar).B(p087i7.M.f46721a);
        }

        @Override // p237x7.q
        public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return H((W8.N) obj, ((p131n0.g) obj2).v(), (p127m7.e) obj3);
        }
    }

    static final class b extends p147o7.l implements p237x7.q {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f56574G;

        b(p127m7.e eVar) {
            super(3, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            p137n7.b.g();
            if (this.f56574G != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p087i7.x.b(obj);
            return p087i7.M.f46721a;
        }

        public final java.lang.Object H(W8.N n6, float f6, p127m7.e eVar) {
            return new x.n.b(eVar).B(p087i7.M.f46721a);
        }

        @Override // p237x7.q
        public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return H((W8.N) obj, ((java.lang.Number) obj2).floatValue(), (p127m7.e) obj3);
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ V.G1 f56575D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(V.G1 g6) {
            super(1);
            this.f56575D = g6;
        }

        public final void a(float f6) {
            ((p237x7.l) this.f56575D.getValue()).l(java.lang.Float.valueOf(f6));
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a(((java.lang.Number) obj).floatValue());
            return p087i7.M.f46721a;
        }
    }

    public static final p230x.o a(p237x7.l lVar) {
        return new p230x.C7289i(lVar);
    }

    public static final androidx.compose.ui.d g(androidx.compose.ui.d dVar, p230x.o oVar, p230x.s sVar, boolean z6, p250z.l lVar, boolean z10, p237x7.q qVar, p237x7.q qVar2, boolean z11) {
        return dVar.b(new androidx.compose.foundation.gestures.DraggableElement(oVar, sVar, z6, lVar, z10, qVar, qVar2, z11));
    }

    public static final p230x.o i(p237x7.l lVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-183245213, i6, -1, "androidx.compose.foundation.gestures.rememberDraggableState (Draggable.kt:135)");
        }
        V.G1 g1N = V.v1.n(lVar, interfaceC1734n, i6 & 14);
        java.lang.Object objG = interfaceC1734n.g();
        if (objG == V.InterfaceC1734n.f14931a.a()) {
            objG = a(new x.n.c(g1N));
            interfaceC1734n.K(objG);
        }
        p230x.o oVar = (p230x.o) objG;
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return oVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float j(long j6, p230x.s sVar) {
        return sVar == p230x.s.Vertical ? p131n0.g.n(j6) : p131n0.g.m(j6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float k(long j6, p230x.s sVar) {
        return sVar == p230x.s.Vertical ? Y0.A.i(j6) : Y0.A.h(j6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long l(long j6) {
        return Y0.B.a(java.lang.Float.isNaN(Y0.A.h(j6)) ? 0.0f : Y0.A.h(j6), java.lang.Float.isNaN(Y0.A.i(j6)) ? 0.0f : Y0.A.i(j6));
    }
}
