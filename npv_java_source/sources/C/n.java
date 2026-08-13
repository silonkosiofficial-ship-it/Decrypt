package C;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ V.G1 f1107D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(V.G1 g6) {
            super(0);
            this.f1107D = g6;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C.C0836j b() {
            return new C.C0836j((p237x7.l) this.f1107D.getValue());
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ V.G1 f1108D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ C.K f1109E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(V.G1 g6, C.K k6) {
            super(0);
            this.f1108D = g6;
            this.f1109E = k6;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C.C0839m b() {
            C.C0836j c0836j = (C.C0836j) this.f1108D.getValue();
            return new C.C0839m(this.f1109E, c0836j, new D.J(this.f1109E.t(), c0836j));
        }
    }

    public static final p237x7.a a(C.K k6, p237x7.l lVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-1898306282, i6, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridItemProviderLambda (LazyGridItemProvider.kt:40)");
        }
        V.G1 g1N = V.v1.n(lVar, interfaceC1734n, (i6 >> 3) & 14);
        boolean z6 = (((i6 & 14) ^ 6) > 4 && interfaceC1734n.S(k6)) || (i6 & 6) == 4;
        java.lang.Object objG = interfaceC1734n.g();
        if (z6 || objG == V.InterfaceC1734n.f14931a.a()) {
            objG = new p247y7.E(V.v1.d(V.v1.m(), new C.n.c(V.v1.d(V.v1.m(), new C.n.b(g1N)), k6))) { // from class: C.n.a
                @Override // F7.l
                public java.lang.Object get() {
                    return ((V.G1) this.f57287D).getValue();
                }
            };
            interfaceC1734n.K(objG);
        }
        F7.l lVar2 = (F7.l) objG;
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return lVar2;
    }
}
