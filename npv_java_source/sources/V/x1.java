package V;

/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class x1 {

    static final class a extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f15056G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f15057H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p237x7.p f15058I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ V.InterfaceC1753w0 f15059J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p237x7.p pVar, V.InterfaceC1753w0 interfaceC1753w0, p127m7.e eVar) {
            super(2, eVar);
            this.f15058I = pVar;
            this.f15059J = interfaceC1753w0;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f15056G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                W8.N n6 = (W8.N) this.f15057H;
                p237x7.p pVar = this.f15058I;
                V.N0 n10 = new V.N0(this.f15059J, n6.getCoroutineContext());
                this.f15056G = 1;
                if (pVar.u(n10, this) == objG) {
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
            return ((V.x1.a) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            V.x1.a aVar = new V.x1.a(this.f15058I, this.f15059J, eVar);
            aVar.f15057H = obj;
            return aVar;
        }
    }

    static final class b extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f15060G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f15061H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p237x7.p f15062I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ V.InterfaceC1753w0 f15063J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p237x7.p pVar, V.InterfaceC1753w0 interfaceC1753w0, p127m7.e eVar) {
            super(2, eVar);
            this.f15062I = pVar;
            this.f15063J = interfaceC1753w0;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f15060G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                W8.N n6 = (W8.N) this.f15061H;
                p237x7.p pVar = this.f15062I;
                V.N0 n10 = new V.N0(this.f15063J, n6.getCoroutineContext());
                this.f15060G = 1;
                if (pVar.u(n10, this) == objG) {
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
            return ((V.x1.b) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            V.x1.b bVar = new V.x1.b(this.f15062I, this.f15063J, eVar);
            bVar.f15061H = obj;
            return bVar;
        }
    }

    public static final V.G1 a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, p237x7.p pVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-1703169085, i6, -1, "androidx.compose.runtime.produceState (ProduceState.kt:146)");
        }
        java.lang.Object objG = interfaceC1734n.g();
        V.InterfaceC1734n.a aVar = V.InterfaceC1734n.f14931a;
        if (objG == aVar.a()) {
            objG = V.A1.d(obj, null, 2, null);
            interfaceC1734n.K(objG);
        }
        V.InterfaceC1753w0 interfaceC1753w0 = (V.InterfaceC1753w0) objG;
        boolean zL = interfaceC1734n.l(pVar);
        java.lang.Object objG2 = interfaceC1734n.g();
        if (zL || objG2 == aVar.a()) {
            objG2 = new V.x1.b(pVar, interfaceC1753w0, null);
            interfaceC1734n.K(objG2);
        }
        V.Q.d(obj2, obj3, (p237x7.p) objG2, interfaceC1734n, (i6 >> 3) & 126);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return interfaceC1753w0;
    }

    public static final V.G1 b(java.lang.Object obj, p237x7.p pVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(10454275, i6, -1, "androidx.compose.runtime.produceState (ProduceState.kt:79)");
        }
        java.lang.Object objG = interfaceC1734n.g();
        V.InterfaceC1734n.a aVar = V.InterfaceC1734n.f14931a;
        if (objG == aVar.a()) {
            objG = V.A1.d(obj, null, 2, null);
            interfaceC1734n.K(objG);
        }
        V.InterfaceC1753w0 interfaceC1753w0 = (V.InterfaceC1753w0) objG;
        p087i7.M m6 = p087i7.M.f46721a;
        boolean zL = interfaceC1734n.l(pVar);
        java.lang.Object objG2 = interfaceC1734n.g();
        if (zL || objG2 == aVar.a()) {
            objG2 = new V.x1.a(pVar, interfaceC1753w0, null);
            interfaceC1734n.K(objG2);
        }
        V.Q.e(m6, (p237x7.p) objG2, interfaceC1734n, 6);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return interfaceC1753w0;
    }
}
