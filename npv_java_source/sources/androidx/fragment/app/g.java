package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends p040e.j implements androidx.core.app.b.InterfaceC0400b {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    boolean f22552a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    boolean f22553b0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    final androidx.fragment.app.i f22550Y = androidx.fragment.app.i.b(new androidx.fragment.app.g.a());

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final androidx.lifecycle.C2087t f22551Z = new androidx.lifecycle.C2087t(this);

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    boolean f22554c0 = true;

    class a extends androidx.fragment.app.k implements androidx.core.content.b, androidx.core.content.c, androidx.core.app.n, androidx.core.app.o, androidx.lifecycle.Y, p040e.A, p070h.f, p233x2.f, V1.k, androidx.core.view.InterfaceC2033w {
        public a() {
            super(androidx.fragment.app.g.this);
        }

        @Override // androidx.fragment.app.k
        public void A() {
            B();
        }

        public void B() {
            androidx.fragment.app.g.this.U();
        }

        @Override // androidx.fragment.app.k
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public androidx.fragment.app.g x() {
            return androidx.fragment.app.g.this;
        }

        @Override // V1.k
        public void a(androidx.fragment.app.n nVar, androidx.fragment.app.f fVar) {
            androidx.fragment.app.g.this.n0(fVar);
        }

        @Override // p040e.A
        public p040e.x b() {
            return androidx.fragment.app.g.this.b();
        }

        @Override // androidx.core.app.n
        public void c(B1.a aVar) {
            androidx.fragment.app.g.this.c(aVar);
        }

        @Override // androidx.core.view.InterfaceC2033w
        public void d(androidx.core.view.InterfaceC2039z interfaceC2039z) {
            androidx.fragment.app.g.this.d(interfaceC2039z);
        }

        @Override // androidx.core.content.c
        public void e(B1.a aVar) {
            androidx.fragment.app.g.this.e(aVar);
        }

        @Override // androidx.core.app.o
        public void f(B1.a aVar) {
            androidx.fragment.app.g.this.f(aVar);
        }

        @Override // V1.e
        public android.view.View h(int i6) {
            return androidx.fragment.app.g.this.findViewById(i6);
        }

        @Override // androidx.core.content.b
        public void i(B1.a aVar) {
            androidx.fragment.app.g.this.i(aVar);
        }

        @Override // V1.e
        public boolean j() {
            android.view.Window window = androidx.fragment.app.g.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.core.app.o
        public void l(B1.a aVar) {
            androidx.fragment.app.g.this.l(aVar);
        }

        @Override // p070h.f
        public p070h.e m() {
            return androidx.fragment.app.g.this.m();
        }

        @Override // androidx.lifecycle.Y
        public androidx.lifecycle.X n() {
            return androidx.fragment.app.g.this.n();
        }

        @Override // p233x2.f
        public p233x2.d p() {
            return androidx.fragment.app.g.this.p();
        }

        @Override // androidx.core.content.c
        public void q(B1.a aVar) {
            androidx.fragment.app.g.this.q(aVar);
        }

        @Override // androidx.core.view.InterfaceC2033w
        public void s(androidx.core.view.InterfaceC2039z interfaceC2039z) {
            androidx.fragment.app.g.this.s(interfaceC2039z);
        }

        @Override // androidx.core.content.b
        public void t(B1.a aVar) {
            androidx.fragment.app.g.this.t(aVar);
        }

        @Override // androidx.lifecycle.r
        public androidx.lifecycle.AbstractC2079k u() {
            return androidx.fragment.app.g.this.f22551Z;
        }

        @Override // androidx.core.app.n
        public void v(B1.a aVar) {
            androidx.fragment.app.g.this.v(aVar);
        }

        @Override // androidx.fragment.app.k
        public void w(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
            androidx.fragment.app.g.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.k
        public android.view.LayoutInflater y() {
            return androidx.fragment.app.g.this.getLayoutInflater().cloneInContext(androidx.fragment.app.g.this);
        }
    }

    public g() {
        g0();
    }

    private void g0() {
        p().h("android:support:lifecycle", new x2.d.c() { // from class: V1.a
            @Override // x2.d.c
            public final android.os.Bundle a() {
                return this.f15100a.h0();
            }
        });
        i(new B1.a() { // from class: V1.b
            @Override // B1.a
            public final void accept(java.lang.Object obj) {
                this.f15101a.i0((android.content.res.Configuration) obj);
            }
        });
        P(new B1.a() { // from class: V1.c
            @Override // B1.a
            public final void accept(java.lang.Object obj) {
                this.f15102a.j0((android.content.Intent) obj);
            }
        });
        O(new p060g.b() { // from class: V1.d
            @Override // p060g.b
            public final void a(android.content.Context context) {
                this.f15103a.k0(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ android.os.Bundle h0() {
        l0();
        this.f22551Z.i(androidx.lifecycle.AbstractC2079k.a.ON_STOP);
        return new android.os.Bundle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i0(android.content.res.Configuration configuration) {
        this.f22550Y.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j0(android.content.Intent intent) {
        this.f22550Y.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k0(android.content.Context context) {
        this.f22550Y.a(null);
    }

    private static boolean m0(androidx.fragment.app.n nVar, androidx.lifecycle.AbstractC2079k.b bVar) {
        boolean zM0 = false;
        for (androidx.fragment.app.f fVar : nVar.q0()) {
            if (fVar != null) {
                if (fVar.C() != null) {
                    zM0 |= m0(fVar.s(), bVar);
                }
                androidx.fragment.app.y yVar = fVar.f22519w0;
                if (yVar != null && yVar.u().b().g(androidx.lifecycle.AbstractC2079k.b.STARTED)) {
                    fVar.f22519w0.g(bVar);
                    zM0 = true;
                }
                if (fVar.f22518v0.b().g(androidx.lifecycle.AbstractC2079k.b.STARTED)) {
                    fVar.f22518v0.n(bVar);
                    zM0 = true;
                }
            }
        }
        return zM0;
    }

    @Override // androidx.core.app.b.InterfaceC0400b
    public final void a(int i6) {
    }

    final android.view.View d0(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        return this.f22550Y.n(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (w(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
            printWriter.println(" State:");
            java.lang.String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.f22552a0);
            printWriter.print(" mResumed=");
            printWriter.print(this.f22553b0);
            printWriter.print(" mStopped=");
            printWriter.print(this.f22554c0);
            if (getApplication() != null) {
                androidx.loader.app.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
            }
            this.f22550Y.l().U(str, fileDescriptor, printWriter, strArr);
        }
    }

    public androidx.fragment.app.n e0() {
        return this.f22550Y.l();
    }

    public androidx.loader.app.a f0() {
        return androidx.loader.app.a.b(this);
    }

    void l0() {
        while (m0(e0(), androidx.lifecycle.AbstractC2079k.b.CREATED)) {
        }
    }

    public void n0(androidx.fragment.app.f fVar) {
    }

    protected void o0() {
        this.f22551Z.i(androidx.lifecycle.AbstractC2079k.a.ON_RESUME);
        this.f22550Y.h();
    }

    @Override // p040e.j, androidx.core.app.f, android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f22551Z.i(androidx.lifecycle.AbstractC2079k.a.ON_CREATE);
        this.f22550Y.e();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public android.view.View onCreateView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        android.view.View viewD0 = d0(view, str, context, attributeSet);
        return viewD0 == null ? super.onCreateView(view, str, context, attributeSet) : viewD0;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public android.view.View onCreateView(java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        android.view.View viewD0 = d0(null, str, context, attributeSet);
        return viewD0 == null ? super.onCreateView(str, context, attributeSet) : viewD0;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f22550Y.f();
        this.f22551Z.i(androidx.lifecycle.AbstractC2079k.a.ON_DESTROY);
    }

    @Override // p040e.j, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i6, android.view.MenuItem menuItem) {
        if (super.onMenuItemSelected(i6, menuItem)) {
            return true;
        }
        if (i6 == 6) {
            return this.f22550Y.d(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f22553b0 = false;
        this.f22550Y.g();
        this.f22551Z.i(androidx.lifecycle.AbstractC2079k.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        o0();
    }

    @Override // p040e.j, android.app.Activity
    public void onRequestPermissionsResult(int i6, java.lang.String[] strArr, int[] iArr) {
        this.f22550Y.m();
        super.onRequestPermissionsResult(i6, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        this.f22550Y.m();
        super.onResume();
        this.f22553b0 = true;
        this.f22550Y.k();
    }

    @Override // android.app.Activity
    protected void onStart() {
        this.f22550Y.m();
        super.onStart();
        this.f22554c0 = false;
        if (!this.f22552a0) {
            this.f22552a0 = true;
            this.f22550Y.c();
        }
        this.f22550Y.k();
        this.f22551Z.i(androidx.lifecycle.AbstractC2079k.a.ON_START);
        this.f22550Y.i();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f22550Y.m();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.f22554c0 = true;
        l0();
        this.f22550Y.j();
        this.f22551Z.i(androidx.lifecycle.AbstractC2079k.a.ON_STOP);
    }
}
