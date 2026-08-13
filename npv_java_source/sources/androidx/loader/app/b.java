package androidx.loader.app;

/* JADX INFO: loaded from: classes.dex */
class b extends androidx.loader.app.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static boolean f22872c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.lifecycle.r f22873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.loader.app.b.c f22874b;

    public static class a extends androidx.lifecycle.C2093z implements f2.b.a {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f22875l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final android.os.Bundle f22876m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final p053f2.b f22877n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private androidx.lifecycle.r f22878o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private androidx.loader.app.b.C0432b f22879p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private p053f2.b f22880q;

        a(int i6, android.os.Bundle bundle, p053f2.b bVar, p053f2.b bVar2) {
            this.f22875l = i6;
            this.f22876m = bundle;
            this.f22877n = bVar;
            this.f22880q = bVar2;
            bVar.r(i6, this);
        }

        @Override // f2.b.a
        public void a(p053f2.b bVar, java.lang.Object obj) {
            if (androidx.loader.app.b.f22872c) {
                java.lang.String str = "onLoadComplete: " + this;
            }
            if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                n(obj);
            } else {
                if (androidx.loader.app.b.f22872c) {
                }
                l(obj);
            }
        }

        @Override // androidx.lifecycle.AbstractC2091x
        protected void j() {
            if (androidx.loader.app.b.f22872c) {
                java.lang.String str = "  Starting: " + this;
            }
            this.f22877n.u();
        }

        @Override // androidx.lifecycle.AbstractC2091x
        protected void k() {
            if (androidx.loader.app.b.f22872c) {
                java.lang.String str = "  Stopping: " + this;
            }
            this.f22877n.v();
        }

        @Override // androidx.lifecycle.AbstractC2091x
        public void m(androidx.lifecycle.A a6) {
            super.m(a6);
            this.f22878o = null;
            this.f22879p = null;
        }

        @Override // androidx.lifecycle.C2093z, androidx.lifecycle.AbstractC2091x
        public void n(java.lang.Object obj) {
            super.n(obj);
            p053f2.b bVar = this.f22880q;
            if (bVar != null) {
                bVar.s();
                this.f22880q = null;
            }
        }

        p053f2.b o(boolean z6) {
            if (androidx.loader.app.b.f22872c) {
                java.lang.String str = "  Destroying: " + this;
            }
            this.f22877n.b();
            this.f22877n.a();
            androidx.loader.app.b.C0432b c0432b = this.f22879p;
            if (c0432b != null) {
                m(c0432b);
                if (z6) {
                    c0432b.d();
                }
            }
            this.f22877n.w(this);
            if ((c0432b == null || c0432b.c()) && !z6) {
                return this.f22877n;
            }
            this.f22877n.s();
            return this.f22880q;
        }

        public void p(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f22875l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f22876m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f22877n);
            this.f22877n.g(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f22879p != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f22879p);
                this.f22879p.b(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(q().d(f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(g());
        }

        p053f2.b q() {
            return this.f22877n;
        }

        void r() {
            androidx.lifecycle.r rVar = this.f22878o;
            androidx.loader.app.b.C0432b c0432b = this.f22879p;
            if (rVar == null || c0432b == null) {
                return;
            }
            super.m(c0432b);
            h(rVar, c0432b);
        }

        p053f2.b s(androidx.lifecycle.r rVar, androidx.loader.app.a.InterfaceC0431a interfaceC0431a) {
            androidx.loader.app.b.C0432b c0432b = new androidx.loader.app.b.C0432b(this.f22877n, interfaceC0431a);
            h(rVar, c0432b);
            androidx.lifecycle.A a6 = this.f22879p;
            if (a6 != null) {
                m(a6);
            }
            this.f22878o = rVar;
            this.f22879p = c0432b;
            return this.f22877n;
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f22875l);
            sb.append(" : ");
            java.lang.Class<?> cls = this.f22877n.getClass();
            sb.append(cls.getSimpleName());
            sb.append("{");
            sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(cls)));
            sb.append("}}");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: androidx.loader.app.b$b, reason: collision with other inner class name */
    static class C0432b implements androidx.lifecycle.A {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p053f2.b f22881a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.loader.app.a.InterfaceC0431a f22882b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f22883c = false;

        C0432b(p053f2.b bVar, androidx.loader.app.a.InterfaceC0431a interfaceC0431a) {
            this.f22881a = bVar;
            this.f22882b = interfaceC0431a;
        }

        @Override // androidx.lifecycle.A
        public void a(java.lang.Object obj) {
            if (androidx.loader.app.b.f22872c) {
                java.lang.String str = "  onLoadFinished in " + this.f22881a + ": " + this.f22881a.d(obj);
            }
            this.f22883c = true;
            this.f22882b.b(this.f22881a, obj);
        }

        public void b(java.lang.String str, java.io.PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f22883c);
        }

        boolean c() {
            return this.f22883c;
        }

        void d() {
            if (this.f22883c) {
                if (androidx.loader.app.b.f22872c) {
                    java.lang.String str = "  Resetting: " + this.f22881a;
                }
                this.f22882b.c(this.f22881a);
            }
        }

        public java.lang.String toString() {
            return this.f22882b.toString();
        }
    }

    static class c extends androidx.lifecycle.T {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final androidx.lifecycle.V.c f22884d = new androidx.loader.app.b.c.a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private p170r.Z f22885b = new p170r.Z();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f22886c = false;

        static class a implements androidx.lifecycle.V.c {
            a() {
            }

            @Override // androidx.lifecycle.V.c
            public androidx.lifecycle.T a(java.lang.Class cls) {
                return new androidx.loader.app.b.c();
            }

            @Override // androidx.lifecycle.V.c
            public /* synthetic */ androidx.lifecycle.T b(F7.c cVar, p023c2.a aVar) {
                return androidx.lifecycle.W.a(this, cVar, aVar);
            }

            @Override // androidx.lifecycle.V.c
            public /* synthetic */ androidx.lifecycle.T c(java.lang.Class cls, p023c2.a aVar) {
                return androidx.lifecycle.W.c(this, cls, aVar);
            }
        }

        c() {
        }

        static androidx.loader.app.b.c j(androidx.lifecycle.X x6) {
            return (androidx.loader.app.b.c) new androidx.lifecycle.V(x6, f22884d).b(androidx.loader.app.b.c.class);
        }

        @Override // androidx.lifecycle.T
        protected void g() {
            super.g();
            int iN = this.f22885b.n();
            for (int i6 = 0; i6 < iN; i6++) {
                ((androidx.loader.app.b.a) this.f22885b.p(i6)).o(true);
            }
            this.f22885b.b();
        }

        public void h(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
            if (this.f22885b.n() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                java.lang.String str2 = str + "    ";
                for (int i6 = 0; i6 < this.f22885b.n(); i6++) {
                    androidx.loader.app.b.a aVar = (androidx.loader.app.b.a) this.f22885b.p(i6);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f22885b.l(i6));
                    printWriter.print(": ");
                    printWriter.println(aVar.toString());
                    aVar.p(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        void i() {
            this.f22886c = false;
        }

        androidx.loader.app.b.a k(int i6) {
            return (androidx.loader.app.b.a) this.f22885b.e(i6);
        }

        boolean l() {
            return this.f22886c;
        }

        void m() {
            int iN = this.f22885b.n();
            for (int i6 = 0; i6 < iN; i6++) {
                ((androidx.loader.app.b.a) this.f22885b.p(i6)).r();
            }
        }

        void n(int i6, androidx.loader.app.b.a aVar) {
            this.f22885b.m(i6, aVar);
        }

        void o() {
            this.f22886c = true;
        }
    }

    b(androidx.lifecycle.r rVar, androidx.lifecycle.X x6) {
        this.f22873a = rVar;
        this.f22874b = androidx.loader.app.b.c.j(x6);
    }

    private p053f2.b e(int i6, android.os.Bundle bundle, androidx.loader.app.a.InterfaceC0431a interfaceC0431a, p053f2.b bVar) {
        try {
            this.f22874b.o();
            p053f2.b bVarA = interfaceC0431a.a(i6, bundle);
            if (bVarA == null) {
                throw new java.lang.IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (bVarA.getClass().isMemberClass() && !java.lang.reflect.Modifier.isStatic(bVarA.getClass().getModifiers())) {
                throw new java.lang.IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + bVarA);
            }
            androidx.loader.app.b.a aVar = new androidx.loader.app.b.a(i6, bundle, bVarA, bVar);
            if (f22872c) {
                java.lang.String str = "  Created new loader " + aVar;
            }
            this.f22874b.n(i6, aVar);
            this.f22874b.i();
            return aVar.s(this.f22873a, interfaceC0431a);
        } catch (java.lang.Throwable th) {
            this.f22874b.i();
            throw th;
        }
    }

    @Override // androidx.loader.app.a
    public void a(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        this.f22874b.h(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.a
    public p053f2.b c(int i6, android.os.Bundle bundle, androidx.loader.app.a.InterfaceC0431a interfaceC0431a) {
        if (this.f22874b.l()) {
            throw new java.lang.IllegalStateException("Called while creating a loader");
        }
        if (android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) {
            throw new java.lang.IllegalStateException("initLoader must be called on the main thread");
        }
        androidx.loader.app.b.a aVarK = this.f22874b.k(i6);
        if (f22872c) {
            java.lang.String str = "initLoader in " + this + ": args=" + bundle;
        }
        if (aVarK == null) {
            return e(i6, bundle, interfaceC0431a, null);
        }
        if (f22872c) {
            java.lang.String str2 = "  Re-using existing loader " + aVarK;
        }
        return aVarK.s(this.f22873a, interfaceC0431a);
    }

    @Override // androidx.loader.app.a
    public void d() {
        this.f22874b.m();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append(" in ");
        java.lang.Class<?> cls = this.f22873a.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }
}
