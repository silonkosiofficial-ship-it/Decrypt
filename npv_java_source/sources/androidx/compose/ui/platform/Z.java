package androidx.compose.ui.platform;

/* JADX INFO: loaded from: classes.dex */
public final class Z implements V.InterfaceC1723j0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.view.Choreographer f20062C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final androidx.compose.ui.platform.X f20063D;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.X f20064D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ android.view.Choreographer.FrameCallback f20065E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.platform.X x6, android.view.Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f20064D = x6;
            this.f20065E = frameCallback;
        }

        public final void a(java.lang.Throwable th) {
            this.f20064D.N1(this.f20065E);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((java.lang.Throwable) obj);
            return p087i7.M.f46721a;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ android.view.Choreographer.FrameCallback f20067E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(android.view.Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f20067E = frameCallback;
        }

        public final void a(java.lang.Throwable th) {
            androidx.compose.ui.platform.Z.this.a().removeFrameCallback(this.f20067E);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((java.lang.Throwable) obj);
            return p087i7.M.f46721a;
        }
    }

    static final class c implements android.view.Choreographer.FrameCallback {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ W8.InterfaceC1794l f20068C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.Z f20069D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p237x7.l f20070E;

        c(W8.InterfaceC1794l interfaceC1794l, androidx.compose.ui.platform.Z z6, p237x7.l lVar) {
            this.f20068C = interfaceC1794l;
            this.f20069D = z6;
            this.f20070E = lVar;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j6) {
            java.lang.Object objB;
            W8.InterfaceC1794l interfaceC1794l = this.f20068C;
            p237x7.l lVar = this.f20070E;
            try {
                i7.w.a aVar = p087i7.w.f46751D;
                objB = p087i7.w.b(lVar.l(java.lang.Long.valueOf(j6)));
            } catch (java.lang.Throwable th) {
                i7.w.a aVar2 = p087i7.w.f46751D;
                objB = p087i7.w.b(p087i7.x.a(th));
            }
            interfaceC1794l.t(objB);
        }
    }

    public Z(android.view.Choreographer choreographer, androidx.compose.ui.platform.X x6) {
        this.f20062C = choreographer;
        this.f20063D = x6;
    }

    @Override // p127m7.i
    public java.lang.Object D(java.lang.Object obj, p237x7.p pVar) {
        return V.InterfaceC1723j0.a.a(this, obj, pVar);
    }

    @Override // V.InterfaceC1723j0
    public java.lang.Object R(p237x7.l lVar, p127m7.e eVar) {
        p237x7.l bVar;
        androidx.compose.ui.platform.X x6 = this.f20063D;
        if (x6 == null) {
            m7.i.b bVarI = eVar.getContext().i(p127m7.f.f51196A);
            x6 = bVarI instanceof androidx.compose.ui.platform.X ? (androidx.compose.ui.platform.X) bVarI : null;
        }
        W8.C1798n c1798n = new W8.C1798n(p137n7.b.d(eVar), 1);
        c1798n.E();
        androidx.compose.ui.platform.Z.c cVar = new androidx.compose.ui.platform.Z.c(c1798n, this, lVar);
        if (x6 == null || !p247y7.AbstractC7350t.b(x6.H1(), a())) {
            a().postFrameCallback(cVar);
            bVar = new androidx.compose.ui.platform.Z.b(cVar);
        } else {
            x6.M1(cVar);
            bVar = new androidx.compose.ui.platform.Z.a(x6, cVar);
        }
        c1798n.G(bVar);
        java.lang.Object objX = c1798n.x();
        if (objX == p137n7.b.g()) {
            p147o7.h.c(eVar);
        }
        return objX;
    }

    public final android.view.Choreographer a() {
        return this.f20062C;
    }

    @Override // m7.i.b
    public /* synthetic */ m7.i.c getKey() {
        return V.AbstractC1720i0.a(this);
    }

    @Override // m7.i.b, p127m7.i
    public m7.i.b i(m7.i.c cVar) {
        return V.InterfaceC1723j0.a.b(this, cVar);
    }

    @Override // p127m7.i
    public p127m7.i o0(p127m7.i iVar) {
        return V.InterfaceC1723j0.a.d(this, iVar);
    }

    @Override // p127m7.i
    public p127m7.i y0(m7.i.c cVar) {
        return V.InterfaceC1723j0.a.c(this, cVar);
    }
}
