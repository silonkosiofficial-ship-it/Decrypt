package B;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ V.G1 f393D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(V.G1 g6) {
            super(0);
            this.f393D = g6;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final B.k b() {
            return new B.k((p237x7.l) this.f393D.getValue());
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ V.G1 f394D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ B.D f395E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.a f396F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(V.G1 g6, B.D d6, androidx.compose.foundation.lazy.a aVar) {
            super(0);
            this.f394D = g6;
            this.f395E = d6;
            this.f396F = aVar;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final B.n b() {
            B.k kVar = (B.k) this.f394D.getValue();
            return new B.n(this.f395E, kVar, this.f396F, new D.J(this.f395E.y(), kVar));
        }
    }

    public static final p237x7.a a(B.D d6, p237x7.l lVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-343736148, i6, -1, "androidx.compose.foundation.lazy.rememberLazyListItemProviderLambda (LazyListItemProvider.kt:43)");
        }
        V.G1 g1N = V.v1.n(lVar, interfaceC1734n, (i6 >> 3) & 14);
        boolean z6 = (((i6 & 14) ^ 6) > 4 && interfaceC1734n.S(d6)) || (i6 & 6) == 4;
        java.lang.Object objG = interfaceC1734n.g();
        if (z6 || objG == V.InterfaceC1734n.f14931a.a()) {
            objG = new p247y7.E(V.v1.d(V.v1.m(), new B.o.c(V.v1.d(V.v1.m(), new B.o.b(g1N)), d6, new androidx.compose.foundation.lazy.a()))) { // from class: B.o.a
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
