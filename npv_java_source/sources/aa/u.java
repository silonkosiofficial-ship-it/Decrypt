package aa;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u {

    static final class a extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f17329G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ p237x7.p f17330H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ aa.n f17331I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p237x7.p pVar, aa.n nVar, p127m7.e eVar) {
            super(2, eVar);
            this.f17330H = pVar;
            this.f17331I = nVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f17329G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p237x7.p pVar = this.f17330H;
                aa.n nVar = this.f17331I;
                this.f17329G = 1;
                obj = pVar.u(nVar, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            return obj;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((aa.u.a) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return new aa.u.a(this.f17330H, this.f17331I, eVar);
        }
    }

    static final class b extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f17332G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ p237x7.p f17333H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ aa.n f17334I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p237x7.p pVar, aa.n nVar, p127m7.e eVar) {
            super(2, eVar);
            this.f17333H = pVar;
            this.f17334I = nVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f17332G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p237x7.p pVar = this.f17333H;
                aa.n nVar = this.f17334I;
                this.f17332G = 1;
                obj = pVar.u(nVar, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            return obj;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((aa.u.b) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return new aa.u.b(this.f17333H, this.f17334I, eVar);
        }
    }

    static final class c extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f17335G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ p237x7.p f17336H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ aa.n f17337I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(p237x7.p pVar, aa.n nVar, p127m7.e eVar) {
            super(2, eVar);
            this.f17336H = pVar;
            this.f17337I = nVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f17335G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p237x7.p pVar = this.f17336H;
                aa.n nVar = this.f17337I;
                this.f17335G = 1;
                obj = pVar.u(nVar, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            return obj;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((aa.u.c) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return new aa.u.c(this.f17336H, this.f17337I, eVar);
        }
    }

    public static final V.G1 a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, p237x7.a aVar, p237x7.p pVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        p247y7.AbstractC7350t.f(obj, "key1");
        p247y7.AbstractC7350t.f(obj2, "key2");
        p247y7.AbstractC7350t.f(obj3, "key3");
        p247y7.AbstractC7350t.f(aVar, "getDefault");
        p247y7.AbstractC7350t.f(pVar, "block");
        interfaceC1734n.T(-1116698203);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-1116698203, i6, -1, "org.jetbrains.compose.resources.rememberResourceState (ResourceState.blocking.kt:41)");
        }
        aa.n nVarA = ((aa.InterfaceC1888b) interfaceC1734n.n(aa.o.e())).a(interfaceC1734n, 0);
        interfaceC1734n.T(406061423);
        boolean zS = interfaceC1734n.S(obj) | interfaceC1734n.S(obj2) | interfaceC1734n.S(obj3) | interfaceC1734n.S(nVarA);
        java.lang.Object objG = interfaceC1734n.g();
        if (zS || objG == V.InterfaceC1734n.f14931a.a()) {
            objG = V.A1.d(W8.AbstractC1786h.b(null, new aa.u.c(pVar, nVarA, null), 1, null), null, 2, null);
            interfaceC1734n.K(objG);
        }
        V.InterfaceC1753w0 interfaceC1753w0 = (V.InterfaceC1753w0) objG;
        interfaceC1734n.J();
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        interfaceC1734n.J();
        return interfaceC1753w0;
    }

    public static final V.G1 b(java.lang.Object obj, java.lang.Object obj2, p237x7.a aVar, p237x7.p pVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        p247y7.AbstractC7350t.f(obj, "key1");
        p247y7.AbstractC7350t.f(obj2, "key2");
        p247y7.AbstractC7350t.f(aVar, "getDefault");
        p247y7.AbstractC7350t.f(pVar, "block");
        interfaceC1734n.T(1165507973);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(1165507973, i6, -1, "org.jetbrains.compose.resources.rememberResourceState (ResourceState.blocking.kt:25)");
        }
        aa.n nVarA = ((aa.InterfaceC1888b) interfaceC1734n.n(aa.o.e())).a(interfaceC1734n, 0);
        interfaceC1734n.T(406048553);
        boolean zS = interfaceC1734n.S(obj) | interfaceC1734n.S(obj2) | interfaceC1734n.S(nVarA);
        java.lang.Object objG = interfaceC1734n.g();
        if (zS || objG == V.InterfaceC1734n.f14931a.a()) {
            objG = V.A1.d(W8.AbstractC1786h.b(null, new aa.u.b(pVar, nVarA, null), 1, null), null, 2, null);
            interfaceC1734n.K(objG);
        }
        V.InterfaceC1753w0 interfaceC1753w0 = (V.InterfaceC1753w0) objG;
        interfaceC1734n.J();
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        interfaceC1734n.J();
        return interfaceC1753w0;
    }

    public static final V.G1 c(java.lang.Object obj, p237x7.a aVar, p237x7.p pVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        p247y7.AbstractC7350t.f(obj, "key1");
        p247y7.AbstractC7350t.f(aVar, "getDefault");
        p247y7.AbstractC7350t.f(pVar, "block");
        interfaceC1734n.T(-2043354779);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-2043354779, i6, -1, "org.jetbrains.compose.resources.rememberResourceState (ResourceState.blocking.kt:10)");
        }
        aa.n nVarA = ((aa.InterfaceC1888b) interfaceC1734n.n(aa.o.e())).a(interfaceC1734n, 0);
        interfaceC1734n.T(406036355);
        boolean zS = interfaceC1734n.S(obj) | interfaceC1734n.S(nVarA);
        java.lang.Object objG = interfaceC1734n.g();
        if (zS || objG == V.InterfaceC1734n.f14931a.a()) {
            objG = V.A1.d(W8.AbstractC1786h.b(null, new aa.u.a(pVar, nVarA, null), 1, null), null, 2, null);
            interfaceC1734n.K(objG);
        }
        V.InterfaceC1753w0 interfaceC1753w0 = (V.InterfaceC1753w0) objG;
        interfaceC1734n.J();
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        interfaceC1734n.J();
        return interfaceC1753w0;
    }
}
