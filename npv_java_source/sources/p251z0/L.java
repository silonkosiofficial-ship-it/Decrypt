package p251z0;

/* JADX INFO: loaded from: classes.dex */
public final class L implements p251z0.I {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p237x7.l f57497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p251z0.T f57498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f57499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p251z0.H f57500e = new z0.L.b();

    private enum a {
        Unknown,
        Dispatching,
        NotDispatching
    }

    public static final class b extends p251z0.H {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private z0.L.a f57505b = z0.L.a.Unknown;

        static final class a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ p251z0.L f57507D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p251z0.L l6) {
                super(1);
                this.f57507D = l6;
            }

            public final void a(android.view.MotionEvent motionEvent) {
                this.f57507D.j().l(motionEvent);
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a((android.view.MotionEvent) obj);
                return p087i7.M.f46721a;
            }
        }

        /* JADX INFO: renamed from: z0.L$b$b, reason: collision with other inner class name */
        static final class C0761b extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ p251z0.L f57509E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0761b(p251z0.L l6) {
                super(1);
                this.f57509E = l6;
            }

            public final void a(android.view.MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() != 0) {
                    this.f57509E.j().l(motionEvent);
                } else {
                    z0.L.b.this.f57505b = ((java.lang.Boolean) this.f57509E.j().l(motionEvent)).booleanValue() ? z0.L.a.Dispatching : z0.L.a.NotDispatching;
                }
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a((android.view.MotionEvent) obj);
                return p087i7.M.f46721a;
            }
        }

        static final class c extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ p251z0.L f57510D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(p251z0.L l6) {
                super(1);
                this.f57510D = l6;
            }

            public final void a(android.view.MotionEvent motionEvent) {
                this.f57510D.j().l(motionEvent);
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a((android.view.MotionEvent) obj);
                return p087i7.M.f46721a;
            }
        }

        b() {
        }

        private final void h(p251z0.C7380p c7380p) {
            java.util.List listC = c7380p.c();
            int size = listC.size();
            for (int i6 = 0; i6 < size; i6++) {
                if (((p251z0.B) listC.get(i6)).p()) {
                    if (this.f57505b == z0.L.a.Dispatching) {
                        D0.InterfaceC0900t interfaceC0900tB = b();
                        if (interfaceC0900tB == null) {
                            throw new java.lang.IllegalStateException("layoutCoordinates not set".toString());
                        }
                        p251z0.N.b(c7380p, interfaceC0900tB.h0(p131n0.g.f51312b.c()), new z0.L.b.a(p251z0.L.this));
                    }
                    this.f57505b = z0.L.a.NotDispatching;
                    return;
                }
            }
            D0.InterfaceC0900t interfaceC0900tB2 = b();
            if (interfaceC0900tB2 == null) {
                throw new java.lang.IllegalStateException("layoutCoordinates not set".toString());
            }
            p251z0.N.c(c7380p, interfaceC0900tB2.h0(p131n0.g.f51312b.c()), new z0.L.b.C0761b(p251z0.L.this));
            if (this.f57505b == z0.L.a.Dispatching) {
                int size2 = listC.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    ((p251z0.B) listC.get(i10)).a();
                }
                p251z0.C7372h c7372hD = c7380p.d();
                if (c7372hD == null) {
                    return;
                }
                c7372hD.e(!p251z0.L.this.g());
            }
        }

        private final void i() {
            this.f57505b = z0.L.a.Unknown;
            p251z0.L.this.l(false);
        }

        @Override // p251z0.H
        public boolean c() {
            return true;
        }

        @Override // p251z0.H
        public void d() {
            if (this.f57505b == z0.L.a.Dispatching) {
                p251z0.N.a(android.os.SystemClock.uptimeMillis(), new z0.L.b.c(p251z0.L.this));
                i();
            }
        }

        @Override // p251z0.H
        public void e(p251z0.C7380p c7380p, p251z0.r rVar, long j6) {
            boolean z6;
            java.util.List listC = c7380p.c();
            if (p251z0.L.this.g()) {
                z6 = true;
                break;
            }
            int size = listC.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size) {
                    z6 = false;
                    break;
                }
                p251z0.B b6 = (p251z0.B) listC.get(i6);
                if (p251z0.AbstractC7381q.b(b6) || p251z0.AbstractC7381q.d(b6)) {
                    z6 = true;
                    break;
                }
                i6++;
            }
            if (this.f57505b != z0.L.a.NotDispatching) {
                if (rVar == p251z0.r.Initial && z6) {
                    h(c7380p);
                }
                if (rVar == p251z0.r.Final && !z6) {
                    h(c7380p);
                }
            }
            if (rVar == p251z0.r.Final) {
                int size2 = listC.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    if (!p251z0.AbstractC7381q.d((p251z0.B) listC.get(i10))) {
                        return;
                    }
                }
                i();
            }
        }
    }

    @Override // androidx.compose.ui.d
    public /* synthetic */ androidx.compose.ui.d b(androidx.compose.ui.d dVar) {
        return p071h0.f.a(this, dVar);
    }

    @Override // androidx.compose.ui.d
    public /* synthetic */ java.lang.Object c(java.lang.Object obj, p237x7.p pVar) {
        return p071h0.g.b(this, obj, pVar);
    }

    @Override // androidx.compose.ui.d
    public /* synthetic */ boolean d(p237x7.l lVar) {
        return p071h0.g.a(this, lVar);
    }

    @Override // p251z0.I
    public p251z0.H e() {
        return this.f57500e;
    }

    public final boolean g() {
        return this.f57499d;
    }

    public final p237x7.l j() {
        p237x7.l lVar = this.f57497b;
        if (lVar != null) {
            return lVar;
        }
        p247y7.AbstractC7350t.p("onTouchEvent");
        return null;
    }

    public final void l(boolean z6) {
        this.f57499d = z6;
    }

    public final void m(p237x7.l lVar) {
        this.f57497b = lVar;
    }

    public final void n(p251z0.T t6) {
        p251z0.T t10 = this.f57498c;
        if (t10 != null) {
            t10.e(null);
        }
        this.f57498c = t6;
        if (t6 == null) {
            return;
        }
        t6.e(this);
    }
}
