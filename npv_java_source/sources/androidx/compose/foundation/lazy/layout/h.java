package androidx.compose.foundation.lazy.layout;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D.C0880q f19412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final D0.i0 f19413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final D.P f19414c;

    private final class a implements androidx.compose.foundation.lazy.layout.d.b, D.N {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f19415a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f19416b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final D.M f19417c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private D0.i0.a f19418d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f19419e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f19420f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f19421g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private androidx.compose.foundation.lazy.layout.h.a.C0369a f19422h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f19423i;

        /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.h$a$a, reason: collision with other inner class name */
        private final class C0369a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final java.util.List f19425a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final java.util.List[] f19426b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f19427c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f19428d;

            public C0369a(java.util.List list) {
                this.f19425a = list;
                this.f19426b = new java.util.List[list.size()];
                if (!(!list.isEmpty())) {
                    throw new java.lang.IllegalArgumentException("NestedPrefetchController shouldn't be created with no states".toString());
                }
            }

            public final boolean a(D.O o6) {
                if (this.f19427c >= this.f19425a.size()) {
                    return false;
                }
                if (!(!androidx.compose.foundation.lazy.layout.h.a.this.f19420f)) {
                    throw new java.lang.IllegalStateException("Should not execute nested prefetch on canceled request".toString());
                }
                android.os.Trace.beginSection("compose:lazy:prefetch:nested");
                while (this.f19427c < this.f19425a.size()) {
                    try {
                        if (this.f19426b[this.f19427c] == null) {
                            if (o6.a() <= 0) {
                                android.os.Trace.endSection();
                                return true;
                            }
                            java.util.List[] listArr = this.f19426b;
                            int i6 = this.f19427c;
                            listArr[i6] = ((androidx.compose.foundation.lazy.layout.d) this.f19425a.get(i6)).b();
                        }
                        java.util.List list = this.f19426b[this.f19427c];
                        p247y7.AbstractC7350t.c(list);
                        while (this.f19428d < list.size()) {
                            if (((D.N) list.get(this.f19428d)).b(o6)) {
                                android.os.Trace.endSection();
                                return true;
                            }
                            this.f19428d++;
                        }
                        this.f19428d = 0;
                        this.f19427c++;
                    } catch (java.lang.Throwable th) {
                        android.os.Trace.endSection();
                        throw th;
                    }
                }
                p087i7.M m6 = p087i7.M.f46721a;
                android.os.Trace.endSection();
                return false;
            }
        }

        static final class b extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ p247y7.O f19430D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(p247y7.O o6) {
                super(1);
                this.f19430D = o6;
            }

            @Override // p237x7.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final F0.D0 l(F0.E0 e6) {
                p247y7.AbstractC7350t.d(e6, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode");
                androidx.compose.foundation.lazy.layout.d dVarT1 = ((androidx.compose.foundation.lazy.layout.i) e6).T1();
                p247y7.O o6 = this.f19430D;
                java.util.List listS = (java.util.List) o6.f57254C;
                if (listS != null) {
                    listS.add(dVarT1);
                } else {
                    listS = p097j7.AbstractC6879v.s(dVarT1);
                }
                o6.f57254C = listS;
                return F0.D0.SkipSubtreeAndContinueTraversal;
            }
        }

        private a(int i6, long j6, D.M m6) {
            this.f19415a = i6;
            this.f19416b = j6;
            this.f19417c = m6;
        }

        public /* synthetic */ a(androidx.compose.foundation.lazy.layout.h hVar, int i6, long j6, D.M m6, p247y7.AbstractC7342k abstractC7342k) {
            this(i6, j6, m6);
        }

        private final boolean d() {
            return this.f19418d != null;
        }

        private final boolean e() {
            if (!this.f19420f) {
                int iA = ((D.InterfaceC0881s) androidx.compose.foundation.lazy.layout.h.this.f19412a.d().b()).a();
                int i6 = this.f19415a;
                if (i6 >= 0 && i6 < iA) {
                    return true;
                }
            }
            return false;
        }

        private final void f() {
            if (!e()) {
                throw new java.lang.IllegalArgumentException("Callers should check whether the request is still valid before calling performComposition()".toString());
            }
            if (this.f19418d != null) {
                throw new java.lang.IllegalArgumentException("Request was already composed!".toString());
            }
            D.InterfaceC0881s interfaceC0881s = (D.InterfaceC0881s) androidx.compose.foundation.lazy.layout.h.this.f19412a.d().b();
            java.lang.Object objB = interfaceC0881s.b(this.f19415a);
            this.f19418d = androidx.compose.foundation.lazy.layout.h.this.f19413b.i(objB, androidx.compose.foundation.lazy.layout.h.this.f19412a.b(this.f19415a, objB, interfaceC0881s.e(this.f19415a)));
        }

        private final void g(long j6) {
            if (!(!this.f19420f)) {
                throw new java.lang.IllegalArgumentException("Callers should check whether the request is still valid before calling performMeasure()".toString());
            }
            if (!(!this.f19419e)) {
                throw new java.lang.IllegalArgumentException("Request was already measured!".toString());
            }
            this.f19419e = true;
            D0.i0.a aVar = this.f19418d;
            if (aVar == null) {
                throw new java.lang.IllegalArgumentException("performComposition() must be called before performMeasure()".toString());
            }
            int iB = aVar.b();
            for (int i6 = 0; i6 < iB; i6++) {
                aVar.g(i6, j6);
            }
        }

        private final androidx.compose.foundation.lazy.layout.h.a.C0369a h() {
            D0.i0.a aVar = this.f19418d;
            if (aVar == null) {
                throw new java.lang.IllegalArgumentException("Should precompose before resolving nested prefetch states".toString());
            }
            p247y7.O o6 = new p247y7.O();
            aVar.f("androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", new androidx.compose.foundation.lazy.layout.h.a.b(o6));
            java.util.List list = (java.util.List) o6.f57254C;
            if (list != null) {
                return new androidx.compose.foundation.lazy.layout.h.a.C0369a(list);
            }
            return null;
        }

        private final boolean i(D.O o6, long j6) {
            long jA = o6.a();
            return (this.f19423i && jA > 0) || j6 < jA;
        }

        @Override // androidx.compose.foundation.lazy.layout.d.b
        public void a() {
            this.f19423i = true;
        }

        @Override // D.N
        public boolean b(D.O o6) {
            if (!e()) {
                return false;
            }
            java.lang.Object objE = ((D.InterfaceC0881s) androidx.compose.foundation.lazy.layout.h.this.f19412a.d().b()).e(this.f19415a);
            if (!d()) {
                if (!i(o6, (objE == null || !this.f19417c.f().a(objE)) ? this.f19417c.e() : this.f19417c.f().c(objE))) {
                    return true;
                }
                D.M m6 = this.f19417c;
                long jNanoTime = java.lang.System.nanoTime();
                android.os.Trace.beginSection("compose:lazy:prefetch:compose");
                try {
                    f();
                    p087i7.M m10 = p087i7.M.f46721a;
                    android.os.Trace.endSection();
                    long jNanoTime2 = java.lang.System.nanoTime() - jNanoTime;
                    if (objE != null) {
                        m6.f().p(objE, m6.d(jNanoTime2, m6.f().e(objE, 0L)));
                    }
                    m6.f1617c = m6.d(jNanoTime2, m6.e());
                } catch (java.lang.Throwable th) {
                    android.os.Trace.endSection();
                    throw th;
                }
            }
            if (!this.f19423i) {
                if (!this.f19421g) {
                    if (o6.a() <= 0) {
                        return true;
                    }
                    android.os.Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                    try {
                        this.f19422h = h();
                        this.f19421g = true;
                        p087i7.M m11 = p087i7.M.f46721a;
                        android.os.Trace.endSection();
                    } catch (java.lang.Throwable th2) {
                        android.os.Trace.endSection();
                        throw th2;
                    }
                }
                androidx.compose.foundation.lazy.layout.h.a.C0369a c0369a = this.f19422h;
                if (c0369a != null ? c0369a.a(o6) : false) {
                    return true;
                }
            }
            if (!this.f19419e && !Y0.C1859b.p(this.f19416b)) {
                if (!i(o6, (objE == null || !this.f19417c.h().a(objE)) ? this.f19417c.g() : this.f19417c.h().c(objE))) {
                    return true;
                }
                D.M m12 = this.f19417c;
                long jNanoTime3 = java.lang.System.nanoTime();
                android.os.Trace.beginSection("compose:lazy:prefetch:measure");
                try {
                    g(this.f19416b);
                    p087i7.M m13 = p087i7.M.f46721a;
                    android.os.Trace.endSection();
                    long jNanoTime4 = java.lang.System.nanoTime() - jNanoTime3;
                    if (objE != null) {
                        m12.h().p(objE, m12.d(jNanoTime4, m12.h().e(objE, 0L)));
                    }
                    m12.f1618d = m12.d(jNanoTime4, m12.g());
                } catch (java.lang.Throwable th3) {
                    android.os.Trace.endSection();
                    throw th3;
                }
            }
            return false;
        }

        @Override // androidx.compose.foundation.lazy.layout.d.b
        public void cancel() {
            if (this.f19420f) {
                return;
            }
            this.f19420f = true;
            D0.i0.a aVar = this.f19418d;
            if (aVar != null) {
                aVar.e();
            }
            this.f19418d = null;
        }

        public java.lang.String toString() {
            return "HandleAndRequestImpl { index = " + this.f19415a + ", constraints = " + ((java.lang.Object) Y0.C1859b.q(this.f19416b)) + ", isComposed = " + d() + ", isMeasured = " + this.f19419e + ", isCanceled = " + this.f19420f + " }";
        }
    }

    public h(D.C0880q c0880q, D0.i0 i0Var, D.P p6) {
        this.f19412a = c0880q;
        this.f19413b = i0Var;
        this.f19414c = p6;
    }

    public final D.N c(int i6, long j6, D.M m6) {
        return new androidx.compose.foundation.lazy.layout.h.a(this, i6, j6, m6, null);
    }

    public final androidx.compose.foundation.lazy.layout.d.b d(int i6, long j6, D.M m6) {
        androidx.compose.foundation.lazy.layout.h.a aVar = new androidx.compose.foundation.lazy.layout.h.a(this, i6, j6, m6, null);
        this.f19414c.a(aVar);
        return aVar;
    }
}
