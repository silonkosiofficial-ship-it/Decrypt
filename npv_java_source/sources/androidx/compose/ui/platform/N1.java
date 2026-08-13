package androidx.compose.ui.platform;

/* JADX INFO: loaded from: classes.dex */
public final class N1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.compose.ui.platform.N1 f19902a = new androidx.compose.ui.platform.N1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.util.concurrent.atomic.AtomicReference f19903b = new java.util.concurrent.atomic.AtomicReference(androidx.compose.ui.platform.M1.f19884a.c());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f19904c = 8;

    public static final class a implements android.view.View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ W8.InterfaceC1822z0 f19905C;

        a(W8.InterfaceC1822z0 interfaceC1822z0) {
            this.f19905C = interfaceC1822z0;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(android.view.View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(android.view.View view) {
            view.removeOnAttachStateChangeListener(this);
            W8.InterfaceC1822z0.a.a(this.f19905C, null, 1, null);
        }
    }

    static final class b extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f19906G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ V.U0 f19907H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ android.view.View f19908I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(V.U0 u6, android.view.View view, p127m7.e eVar) {
            super(2, eVar);
            this.f19907H = u6;
            this.f19908I = view;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f19906G;
            try {
                if (i6 == 0) {
                    p087i7.x.b(obj);
                    V.U0 u6 = this.f19907H;
                    this.f19906G = 1;
                    if (u6.k0(this) == objG) {
                        return objG;
                    }
                } else {
                    if (i6 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p087i7.x.b(obj);
                }
                if (androidx.compose.ui.platform.O1.f(this.f19908I) == this.f19907H) {
                    androidx.compose.ui.platform.O1.i(this.f19908I, null);
                }
                return p087i7.M.f46721a;
            } catch (java.lang.Throwable th) {
                if (androidx.compose.ui.platform.O1.f(this.f19908I) == this.f19907H) {
                    androidx.compose.ui.platform.O1.i(this.f19908I, null);
                }
                throw th;
            }
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((androidx.compose.ui.platform.N1.b) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return new androidx.compose.ui.platform.N1.b(this.f19907H, this.f19908I, eVar);
        }
    }

    private N1() {
    }

    public final V.U0 a(android.view.View view) {
        V.U0 u0A = ((androidx.compose.ui.platform.M1) f19903b.get()).a(view);
        androidx.compose.ui.platform.O1.i(view, u0A);
        view.addOnAttachStateChangeListener(new androidx.compose.ui.platform.N1.a(W8.AbstractC1788i.d(W8.C1810t0.f15533C, X8.g.b(view.getHandler(), "windowRecomposer cleanup").z1(), null, new androidx.compose.ui.platform.N1.b(u0A, view, null), 2, null)));
        return u0A;
    }
}
