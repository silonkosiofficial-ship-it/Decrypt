package p250z;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    static final class a extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f57448G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ p250z.j f57449H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ V.InterfaceC1753w0 f57450I;

        /* JADX INFO: renamed from: z.f$a$a, reason: collision with other inner class name */
        static final class C0760a implements Z8.InterfaceC1870g {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ java.util.List f57451C;

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ V.InterfaceC1753w0 f57452D;

            C0760a(java.util.List list, V.InterfaceC1753w0 interfaceC1753w0) {
                this.f57451C = list;
                this.f57452D = interfaceC1753w0;
            }

            @Override // Z8.InterfaceC1870g
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object a(p250z.i iVar, p127m7.e eVar) {
                if (iVar instanceof p250z.d) {
                    this.f57451C.add(iVar);
                } else if (iVar instanceof p250z.e) {
                    this.f57451C.remove(((p250z.e) iVar).a());
                }
                this.f57452D.setValue(p147o7.b.a(!this.f57451C.isEmpty()));
                return p087i7.M.f46721a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p250z.j jVar, V.InterfaceC1753w0 interfaceC1753w0, p127m7.e eVar) {
            super(2, eVar);
            this.f57449H = jVar;
            this.f57450I = interfaceC1753w0;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f57448G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                Z8.InterfaceC1869f interfaceC1869fB = this.f57449H.b();
                z.f.a.C0760a c0760a = new z.f.a.C0760a(arrayList, this.f57450I);
                this.f57448G = 1;
                if (interfaceC1869fB.b(c0760a, this) == objG) {
                    return objG;
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((z.f.a) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return new z.f.a(this.f57449H, this.f57450I, eVar);
        }
    }

    public static final V.G1 a(p250z.j jVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-1805515472, i6, -1, "androidx.compose.foundation.interaction.collectIsFocusedAsState (FocusInteraction.kt:64)");
        }
        java.lang.Object objG = interfaceC1734n.g();
        V.InterfaceC1734n.a aVar = V.InterfaceC1734n.f14931a;
        if (objG == aVar.a()) {
            objG = V.A1.d(java.lang.Boolean.FALSE, null, 2, null);
            interfaceC1734n.K(objG);
        }
        V.InterfaceC1753w0 interfaceC1753w0 = (V.InterfaceC1753w0) objG;
        int i10 = i6 & 14;
        boolean z6 = ((i10 ^ 6) > 4 && interfaceC1734n.S(jVar)) || (i6 & 6) == 4;
        java.lang.Object objG2 = interfaceC1734n.g();
        if (z6 || objG2 == aVar.a()) {
            objG2 = new z.f.a(jVar, interfaceC1753w0, null);
            interfaceC1734n.K(objG2);
        }
        V.Q.e(jVar, (p237x7.p) objG2, interfaceC1734n, i10);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return interfaceC1753w0;
    }
}
