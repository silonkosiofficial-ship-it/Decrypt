package p040e;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Runnable f44440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B1.a f44441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p097j7.C6871m f44442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p040e.w f44443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private android.window.OnBackInvokedCallback f44444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private android.window.OnBackInvokedDispatcher f44445f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f44446g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f44447h;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {
        a() {
            super(1);
        }

        public final void a(p040e.C6525b c6525b) {
            p247y7.AbstractC7350t.f(c6525b, "backEvent");
            p040e.x.this.n(c6525b);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((p040e.C6525b) obj);
            return p087i7.M.f46721a;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {
        b() {
            super(1);
        }

        public final void a(p040e.C6525b c6525b) {
            p247y7.AbstractC7350t.f(c6525b, "backEvent");
            p040e.x.this.m(c6525b);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((p040e.C6525b) obj);
            return p087i7.M.f46721a;
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.a {
        c() {
            super(0);
        }

        public final void a() {
            p040e.x.this.l();
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    static final class d extends p247y7.AbstractC7352v implements p237x7.a {
        d() {
            super(0);
        }

        public final void a() {
            p040e.x.this.k();
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    static final class e extends p247y7.AbstractC7352v implements p237x7.a {
        e() {
            super(0);
        }

        public final void a() {
            p040e.x.this.l();
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e.x.f f44453a = new e.x.f();

        private f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(p237x7.a aVar) {
            p247y7.AbstractC7350t.f(aVar, "$onBackInvoked");
            aVar.b();
        }

        public final android.window.OnBackInvokedCallback b(final p237x7.a aVar) {
            p247y7.AbstractC7350t.f(aVar, "onBackInvoked");
            return new android.window.OnBackInvokedCallback() { // from class: e.y
                public final void onBackInvoked() {
                    e.x.f.c(aVar);
                }
            };
        }

        public final void d(java.lang.Object obj, int i6, java.lang.Object obj2) {
            p247y7.AbstractC7350t.f(obj, "dispatcher");
            p247y7.AbstractC7350t.f(obj2, "callback");
            ((android.window.OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i6, (android.window.OnBackInvokedCallback) obj2);
        }

        public final void e(java.lang.Object obj, java.lang.Object obj2) {
            p247y7.AbstractC7350t.f(obj, "dispatcher");
            p247y7.AbstractC7350t.f(obj2, "callback");
            ((android.window.OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((android.window.OnBackInvokedCallback) obj2);
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e.x.g f44454a = new e.x.g();

        public static final class a implements android.window.OnBackAnimationCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ p237x7.l f44455a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p237x7.l f44456b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ p237x7.a f44457c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ p237x7.a f44458d;

            a(p237x7.l lVar, p237x7.l lVar2, p237x7.a aVar, p237x7.a aVar2) {
                this.f44455a = lVar;
                this.f44456b = lVar2;
                this.f44457c = aVar;
                this.f44458d = aVar2;
            }

            public void onBackCancelled() {
                this.f44458d.b();
            }

            public void onBackInvoked() {
                this.f44457c.b();
            }

            public void onBackProgressed(android.window.BackEvent backEvent) {
                p247y7.AbstractC7350t.f(backEvent, "backEvent");
                this.f44456b.l(new p040e.C6525b(backEvent));
            }

            public void onBackStarted(android.window.BackEvent backEvent) {
                p247y7.AbstractC7350t.f(backEvent, "backEvent");
                this.f44455a.l(new p040e.C6525b(backEvent));
            }
        }

        private g() {
        }

        public final android.window.OnBackInvokedCallback a(p237x7.l lVar, p237x7.l lVar2, p237x7.a aVar, p237x7.a aVar2) {
            p247y7.AbstractC7350t.f(lVar, "onBackStarted");
            p247y7.AbstractC7350t.f(lVar2, "onBackProgressed");
            p247y7.AbstractC7350t.f(aVar, "onBackInvoked");
            p247y7.AbstractC7350t.f(aVar2, "onBackCancelled");
            return new e.x.g.a(lVar, lVar2, aVar, aVar2);
        }
    }

    private final class h implements androidx.lifecycle.InterfaceC2083o, p040e.InterfaceC6526c {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final androidx.lifecycle.AbstractC2079k f44459C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final p040e.w f44460D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private p040e.InterfaceC6526c f44461E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p040e.x f44462F;

        public h(p040e.x xVar, androidx.lifecycle.AbstractC2079k abstractC2079k, p040e.w wVar) {
            p247y7.AbstractC7350t.f(abstractC2079k, "lifecycle");
            p247y7.AbstractC7350t.f(wVar, "onBackPressedCallback");
            this.f44462F = xVar;
            this.f44459C = abstractC2079k;
            this.f44460D = wVar;
            abstractC2079k.a(this);
        }

        @Override // p040e.InterfaceC6526c
        public void cancel() {
            this.f44459C.d(this);
            this.f44460D.i(this);
            p040e.InterfaceC6526c interfaceC6526c = this.f44461E;
            if (interfaceC6526c != null) {
                interfaceC6526c.cancel();
            }
            this.f44461E = null;
        }

        @Override // androidx.lifecycle.InterfaceC2083o
        public void i(androidx.lifecycle.r rVar, androidx.lifecycle.AbstractC2079k.a aVar) {
            p247y7.AbstractC7350t.f(rVar, "source");
            p247y7.AbstractC7350t.f(aVar, "event");
            if (aVar == androidx.lifecycle.AbstractC2079k.a.ON_START) {
                this.f44461E = this.f44462F.j(this.f44460D);
                return;
            }
            if (aVar != androidx.lifecycle.AbstractC2079k.a.ON_STOP) {
                if (aVar == androidx.lifecycle.AbstractC2079k.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                p040e.InterfaceC6526c interfaceC6526c = this.f44461E;
                if (interfaceC6526c != null) {
                    interfaceC6526c.cancel();
                }
            }
        }
    }

    private final class i implements p040e.InterfaceC6526c {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final p040e.w f44463C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p040e.x f44464D;

        public i(p040e.x xVar, p040e.w wVar) {
            p247y7.AbstractC7350t.f(wVar, "onBackPressedCallback");
            this.f44464D = xVar;
            this.f44463C = wVar;
        }

        @Override // p040e.InterfaceC6526c
        public void cancel() {
            this.f44464D.f44442c.remove(this.f44463C);
            if (p247y7.AbstractC7350t.b(this.f44464D.f44443d, this.f44463C)) {
                this.f44463C.c();
                this.f44464D.f44443d = null;
            }
            this.f44463C.i(this);
            p237x7.a aVarB = this.f44463C.b();
            if (aVarB != null) {
                aVarB.b();
            }
            this.f44463C.k(null);
        }
    }

    /* synthetic */ class j extends p247y7.C7348q implements p237x7.a {
        j(java.lang.Object obj) {
            super(0, obj, p040e.x.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            s();
            return p087i7.M.f46721a;
        }

        public final void s() {
            ((p040e.x) this.f57287D).q();
        }
    }

    /* synthetic */ class k extends p247y7.C7348q implements p237x7.a {
        k(java.lang.Object obj) {
            super(0, obj, p040e.x.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            s();
            return p087i7.M.f46721a;
        }

        public final void s() {
            ((p040e.x) this.f57287D).q();
        }
    }

    public x(java.lang.Runnable runnable) {
        this(runnable, null);
    }

    public x(java.lang.Runnable runnable, B1.a aVar) {
        this.f44440a = runnable;
        this.f44441b = aVar;
        this.f44442c = new p097j7.C6871m();
        int i6 = android.os.Build.VERSION.SDK_INT;
        if (i6 >= 33) {
            this.f44444e = i6 >= 34 ? e.x.g.f44454a.a(new e.x.a(), new e.x.b(), new e.x.c(), new e.x.d()) : e.x.f.f44453a.b(new e.x.e());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        java.lang.Object objPrevious;
        p040e.w wVar = this.f44443d;
        if (wVar == null) {
            p097j7.C6871m c6871m = this.f44442c;
            java.util.ListIterator<E> listIterator = c6871m.listIterator(c6871m.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((p040e.w) objPrevious).g());
            wVar = (p040e.w) objPrevious;
        }
        this.f44443d = null;
        if (wVar != null) {
            wVar.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(p040e.C6525b c6525b) {
        java.lang.Object objPrevious;
        p040e.w wVar = this.f44443d;
        if (wVar == null) {
            p097j7.C6871m c6871m = this.f44442c;
            java.util.ListIterator<E> listIterator = c6871m.listIterator(c6871m.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((p040e.w) objPrevious).g());
            wVar = (p040e.w) objPrevious;
        }
        if (wVar != null) {
            wVar.e(c6525b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(p040e.C6525b c6525b) {
        java.lang.Object objPrevious;
        p097j7.C6871m c6871m = this.f44442c;
        java.util.ListIterator<E> listIterator = c6871m.listIterator(c6871m.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!((p040e.w) objPrevious).g());
        p040e.w wVar = (p040e.w) objPrevious;
        if (this.f44443d != null) {
            k();
        }
        this.f44443d = wVar;
        if (wVar != null) {
            wVar.f(c6525b);
        }
    }

    private final void p(boolean z6) {
        android.window.OnBackInvokedDispatcher onBackInvokedDispatcher = this.f44445f;
        android.window.OnBackInvokedCallback onBackInvokedCallback = this.f44444e;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z6 && !this.f44446g) {
            e.x.f.f44453a.d(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f44446g = true;
        } else {
            if (z6 || !this.f44446g) {
                return;
            }
            e.x.f.f44453a.e(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f44446g = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q() {
        boolean z6 = this.f44447h;
        p097j7.C6871m c6871m = this.f44442c;
        boolean z10 = false;
        if (!(c6871m instanceof java.util.Collection) || !c6871m.isEmpty()) {
            java.util.Iterator<E> it = c6871m.iterator();
            while (it.hasNext()) {
                if (((p040e.w) it.next()).g()) {
                    z10 = true;
                    break;
                }
            }
        }
        this.f44447h = z10;
        if (z10 != z6) {
            B1.a aVar = this.f44441b;
            if (aVar != null) {
                aVar.accept(java.lang.Boolean.valueOf(z10));
            }
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                p(z10);
            }
        }
    }

    public final void h(androidx.lifecycle.r rVar, p040e.w wVar) {
        p247y7.AbstractC7350t.f(rVar, "owner");
        p247y7.AbstractC7350t.f(wVar, "onBackPressedCallback");
        androidx.lifecycle.AbstractC2079k abstractC2079kU = rVar.u();
        if (abstractC2079kU.b() == androidx.lifecycle.AbstractC2079k.b.DESTROYED) {
            return;
        }
        wVar.a(new e.x.h(this, abstractC2079kU, wVar));
        q();
        wVar.k(new e.x.j(this));
    }

    public final void i(p040e.w wVar) {
        p247y7.AbstractC7350t.f(wVar, "onBackPressedCallback");
        j(wVar);
    }

    public final p040e.InterfaceC6526c j(p040e.w wVar) {
        p247y7.AbstractC7350t.f(wVar, "onBackPressedCallback");
        this.f44442c.add(wVar);
        e.x.i iVar = new e.x.i(this, wVar);
        wVar.a(iVar);
        q();
        wVar.k(new e.x.k(this));
        return iVar;
    }

    public final void l() {
        java.lang.Object objPrevious;
        p040e.w wVar = this.f44443d;
        if (wVar == null) {
            p097j7.C6871m c6871m = this.f44442c;
            java.util.ListIterator<E> listIterator = c6871m.listIterator(c6871m.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((p040e.w) objPrevious).g());
            wVar = (p040e.w) objPrevious;
        }
        this.f44443d = null;
        if (wVar != null) {
            wVar.d();
            return;
        }
        java.lang.Runnable runnable = this.f44440a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void o(android.window.OnBackInvokedDispatcher onBackInvokedDispatcher) {
        p247y7.AbstractC7350t.f(onBackInvokedDispatcher, "invoker");
        this.f44445f = onBackInvokedDispatcher;
        p(this.f44447h);
    }
}
