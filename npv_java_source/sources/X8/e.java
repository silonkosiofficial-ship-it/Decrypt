package X8;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends X8.f implements W8.X {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final android.os.Handler f16070E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final java.lang.String f16071F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final boolean f16072G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final X8.e f16073H;

    public static final class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ W8.InterfaceC1794l f16074C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ X8.e f16075D;

        public a(W8.InterfaceC1794l interfaceC1794l, X8.e eVar) {
            this.f16074C = interfaceC1794l;
            this.f16075D = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f16074C.F(this.f16075D, p087i7.M.f46721a);
        }
    }

    public e(android.os.Handler handler, java.lang.String str) {
        this(handler, str, false);
    }

    public /* synthetic */ e(android.os.Handler handler, java.lang.String str, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(handler, (i6 & 2) != 0 ? null : str);
    }

    private e(android.os.Handler handler, java.lang.String str, boolean z6) {
        super(null);
        this.f16070E = handler;
        this.f16071F = str;
        this.f16072G = z6;
        this.f16073H = z6 ? this : new X8.e(handler, str, true);
    }

    private final void E1(p127m7.i iVar, java.lang.Runnable runnable) {
        W8.C0.d(iVar, new java.util.concurrent.CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        W8.C1779d0.b().t1(iVar, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G1(X8.e eVar, java.lang.Runnable runnable) {
        eVar.f16070E.removeCallbacks(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M H1(X8.e eVar, java.lang.Runnable runnable, java.lang.Throwable th) {
        eVar.f16070E.removeCallbacks(runnable);
        return p087i7.M.f46721a;
    }

    @Override // W8.J0
    /* JADX INFO: renamed from: F1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public X8.e z1() {
        return this.f16073H;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof X8.e) {
            X8.e eVar = (X8.e) obj;
            if (eVar.f16070E == this.f16070E && eVar.f16072G == this.f16072G) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return java.lang.System.identityHashCode(this.f16070E) ^ (this.f16072G ? 1231 : 1237);
    }

    @Override // W8.X
    public W8.InterfaceC1783f0 m1(long j6, final java.lang.Runnable runnable, p127m7.i iVar) {
        if (this.f16070E.postDelayed(runnable, E7.j.h(j6, 4611686018427387903L))) {
            return new W8.InterfaceC1783f0() { // from class: X8.c
                @Override // W8.InterfaceC1783f0
                public final void e() {
                    X8.e.G1(this.f16066C, runnable);
                }
            };
        }
        E1(iVar, runnable);
        return W8.M0.f15460C;
    }

    @Override // W8.J
    public void t1(p127m7.i iVar, java.lang.Runnable runnable) {
        if (this.f16070E.post(runnable)) {
            return;
        }
        E1(iVar, runnable);
    }

    @Override // W8.J
    public java.lang.String toString() {
        java.lang.String strA1 = A1();
        if (strA1 != null) {
            return strA1;
        }
        java.lang.String string = this.f16071F;
        if (string == null) {
            string = this.f16070E.toString();
        }
        if (!this.f16072G) {
            return string;
        }
        return string + ".immediate";
    }

    @Override // W8.J
    public boolean v1(p127m7.i iVar) {
        return (this.f16072G && p247y7.AbstractC7350t.b(android.os.Looper.myLooper(), this.f16070E.getLooper())) ? false : true;
    }

    @Override // W8.X
    public void x0(long j6, W8.InterfaceC1794l interfaceC1794l) {
        final X8.e.a aVar = new X8.e.a(interfaceC1794l, this);
        if (this.f16070E.postDelayed(aVar, E7.j.h(j6, 4611686018427387903L))) {
            interfaceC1794l.G(new p237x7.l() { // from class: X8.d
                @Override // p237x7.l
                public final java.lang.Object l(java.lang.Object obj) {
                    return X8.e.H1(this.f16068C, aVar, (java.lang.Throwable) obj);
                }
            });
        } else {
            E1(interfaceC1794l.getContext(), aVar);
        }
    }
}
