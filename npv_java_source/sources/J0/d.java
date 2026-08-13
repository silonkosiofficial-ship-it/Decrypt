package J0;

/* JADX INFO: loaded from: classes.dex */
public final class d implements android.view.ScrollCaptureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K0.o f5559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Y0.r f5560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final J0.d.a f5561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final W8.N f5562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final J0.h f5563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f5564f;

    public interface a {
        void a();

        void b();
    }

    static final class b extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f5565G;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ java.lang.Runnable f5567I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(java.lang.Runnable runnable, p127m7.e eVar) {
            super(2, eVar);
            this.f5567I = runnable;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f5565G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                J0.h hVar = J0.d.this.f5563e;
                this.f5565G = 1;
                if (hVar.g(0.0f, this) == objG) {
                    return objG;
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            J0.d.this.f5561c.b();
            this.f5567I.run();
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((J0.d.b) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return J0.d.this.new b(this.f5567I, eVar);
        }
    }

    static final class c extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f5568G;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ android.view.ScrollCaptureSession f5570I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ android.graphics.Rect f5571J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ java.util.function.Consumer f5572K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(android.view.ScrollCaptureSession scrollCaptureSession, android.graphics.Rect rect, java.util.function.Consumer consumer, p127m7.e eVar) {
            super(2, eVar);
            this.f5570I = scrollCaptureSession;
            this.f5571J = rect;
            this.f5572K = consumer;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f5568G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                J0.d dVar = J0.d.this;
                android.view.ScrollCaptureSession scrollCaptureSession = this.f5570I;
                Y0.r rVarD = p141o0.X1.d(this.f5571J);
                this.f5568G = 1;
                obj = dVar.e(scrollCaptureSession, rVarD, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            this.f5572K.o(p141o0.X1.a((Y0.r) obj));
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((J0.d.c) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return J0.d.this.new c(this.f5570I, this.f5571J, this.f5572K, eVar);
        }
    }

    /* JADX INFO: renamed from: J0.d$d, reason: collision with other inner class name */
    static final class C0130d extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f5573F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f5574G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f5575H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        int f5576I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        int f5577J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        /* synthetic */ java.lang.Object f5578K;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        int f5580M;

        C0130d(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f5578K = obj;
            this.f5580M |= Integer.MIN_VALUE;
            return J0.d.this.e(null, null, this);
        }
    }

    static final class e extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final J0.d.e f5581D = new J0.d.e();

        e() {
            super(1);
        }

        public final void a(long j6) {
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a(((java.lang.Number) obj).longValue());
            return p087i7.M.f46721a;
        }
    }

    static final class f extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        boolean f5582G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        int f5583H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        /* synthetic */ float f5584I;

        f(p127m7.e eVar) {
            super(2, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            boolean z6;
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f5583H;
            if (i6 == 0) {
                p087i7.x.b(obj);
                float f6 = this.f5584I;
                p237x7.p pVarC = J0.n.c(J0.d.this.f5559a);
                if (pVarC == null) {
                    C0.a.c("Required value was null.");
                    throw new p087i7.C6665k();
                }
                boolean zB = ((K0.i) J0.d.this.f5559a.w().s(K0.r.f6030a.I())).b();
                if (zB) {
                    f6 = -f6;
                }
                p131n0.g gVarD = p131n0.g.d(p131n0.h.a(0.0f, f6));
                this.f5582G = zB;
                this.f5583H = 1;
                obj = pVarC.u(gVarD, this);
                if (obj == objG) {
                    return objG;
                }
                z6 = zB;
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z6 = this.f5582G;
                p087i7.x.b(obj);
            }
            float fN = p131n0.g.n(((p131n0.g) obj).v());
            if (z6) {
                fN = -fN;
            }
            return p147o7.b.b(fN);
        }

        public final java.lang.Object H(float f6, p127m7.e eVar) {
            return ((J0.d.f) x(java.lang.Float.valueOf(f6), eVar)).B(p087i7.M.f46721a);
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            return H(((java.lang.Number) obj).floatValue(), (p127m7.e) obj2);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            J0.d.f fVar = J0.d.this.new f(eVar);
            fVar.f5584I = ((java.lang.Number) obj).floatValue();
            return fVar;
        }
    }

    public d(K0.o oVar, Y0.r rVar, W8.N n6, J0.d.a aVar) {
        this.f5559a = oVar;
        this.f5560b = rVar;
        this.f5561c = aVar;
        this.f5562d = W8.O.i(n6, J0.g.f5588C);
        this.f5563e = new J0.h(rVar.f(), new J0.d.f(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:28:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:37:0x0109  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(android.view.ScrollCaptureSession scrollCaptureSession, Y0.r rVar, p127m7.e eVar) {
        J0.d.C0130d c0130d;
        int i6;
        int iD;
        J0.d dVar;
        Y0.r rVar2;
        int i10;
        J0.d dVar2;
        android.view.ScrollCaptureSession scrollCaptureSession2;
        int i11;
        int iC;
        int iC2;
        Y0.r rVarC;
        F0.AbstractC0914d0 abstractC0914d0E;
        android.graphics.Canvas canvasLockHardwareCanvas;
        if (eVar instanceof J0.d.C0130d) {
            c0130d = (J0.d.C0130d) eVar;
            int i12 = c0130d.f5580M;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c0130d.f5580M = i12 - Integer.MIN_VALUE;
            } else {
                c0130d = new J0.d.C0130d(eVar);
            }
        } else {
            c0130d = new J0.d.C0130d(eVar);
        }
        java.lang.Object obj = c0130d.f5578K;
        java.lang.Object objG = p137n7.b.g();
        int i13 = c0130d.f5580M;
        if (i13 != 0) {
            if (i13 == 1) {
                int i14 = c0130d.f5577J;
                int i15 = c0130d.f5576I;
                Y0.r rVar3 = (Y0.r) c0130d.f5575H;
                android.view.ScrollCaptureSession scrollCaptureSessionA = J0.a.a(c0130d.f5574G);
                dVar = (J0.d) c0130d.f5573F;
                p087i7.x.b(obj);
                i6 = i15;
                rVar = rVar3;
                iD = i14;
                scrollCaptureSession = scrollCaptureSessionA;
            } else {
                if (i13 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i11 = c0130d.f5577J;
                i10 = c0130d.f5576I;
                rVar2 = (Y0.r) c0130d.f5575H;
                android.view.ScrollCaptureSession scrollCaptureSessionA2 = J0.a.a(c0130d.f5574G);
                dVar2 = (J0.d) c0130d.f5573F;
                p087i7.x.b(obj);
                scrollCaptureSession2 = scrollCaptureSessionA2;
            }
            iC = dVar2.f5563e.c(i10);
            iC2 = dVar2.f5563e.c(i11);
            rVarC = Y0.r.c(rVar2, 0, iC, 0, iC2, 5, null);
            if (iC == iC2) {
                return Y0.r.f16224e.a();
            }
            abstractC0914d0E = dVar2.f5559a.e();
            if (abstractC0914d0E != null) {
                throw new java.lang.IllegalStateException("Could not find coordinator for semantics node.".toString());
            }
            canvasLockHardwareCanvas = scrollCaptureSession2.getSurface().lockHardwareCanvas();
            try {
                canvasLockHardwareCanvas.drawColor(0, android.graphics.BlendMode.CLEAR);
                p141o0.InterfaceC6993q0 interfaceC6993q0B = p141o0.H.b(canvasLockHardwareCanvas);
                interfaceC6993q0B.d(-rVarC.g(), -rVarC.i());
                abstractC0914d0E.W1(interfaceC6993q0B, null);
                return rVarC.m(0, A7.a.d(dVar2.f5563e.b()));
            } finally {
                scrollCaptureSession2.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
            }
        }
        p087i7.x.b(obj);
        i6 = rVar.i();
        iD = rVar.d();
        J0.h hVar = this.f5563e;
        c0130d.f5573F = this;
        c0130d.f5574G = scrollCaptureSession;
        c0130d.f5575H = rVar;
        c0130d.f5576I = i6;
        c0130d.f5577J = iD;
        c0130d.f5580M = 1;
        if (hVar.f(i6, iD, c0130d) == objG) {
            return objG;
        }
        dVar = this;
        J0.d.e eVar2 = J0.d.e.f5581D;
        c0130d.f5573F = dVar;
        c0130d.f5574G = scrollCaptureSession;
        c0130d.f5575H = rVar;
        c0130d.f5576I = i6;
        c0130d.f5577J = iD;
        c0130d.f5580M = 2;
        if (V.AbstractC1729l0.c(eVar2, c0130d) == objG) {
            return objG;
        }
        rVar2 = rVar;
        i10 = i6;
        dVar2 = dVar;
        scrollCaptureSession2 = scrollCaptureSession;
        i11 = iD;
        iC = dVar2.f5563e.c(i10);
        iC2 = dVar2.f5563e.c(i11);
        rVarC = Y0.r.c(rVar2, 0, iC, 0, iC2, 5, null);
        if (iC == iC2) {
            return Y0.r.f16224e.a();
        }
        abstractC0914d0E = dVar2.f5559a.e();
        if (abstractC0914d0E != null) {
            throw new java.lang.IllegalStateException("Could not find coordinator for semantics node.".toString());
        }
        canvasLockHardwareCanvas = scrollCaptureSession2.getSurface().lockHardwareCanvas();
        canvasLockHardwareCanvas.drawColor(0, android.graphics.BlendMode.CLEAR);
        p141o0.InterfaceC6993q0 interfaceC6993q0B2 = p141o0.H.b(canvasLockHardwareCanvas);
        interfaceC6993q0B2.d(-rVarC.g(), -rVarC.i());
        abstractC0914d0E.W1(interfaceC6993q0B2, null);
        return rVarC.m(0, A7.a.d(dVar2.f5563e.b()));
    }

    public void onScrollCaptureEnd(java.lang.Runnable runnable) {
        W8.AbstractC1788i.d(this.f5562d, W8.L0.f15457D, null, new J0.d.b(runnable, null), 2, null);
    }

    public void onScrollCaptureImageRequest(android.view.ScrollCaptureSession scrollCaptureSession, android.os.CancellationSignal cancellationSignal, android.graphics.Rect rect, java.util.function.Consumer consumer) {
        J0.f.c(this.f5562d, cancellationSignal, new J0.d.c(scrollCaptureSession, rect, consumer, null));
    }

    public void onScrollCaptureSearch(android.os.CancellationSignal cancellationSignal, java.util.function.Consumer consumer) {
        consumer.o(p141o0.X1.a(this.f5560b));
    }

    public void onScrollCaptureStart(android.view.ScrollCaptureSession scrollCaptureSession, android.os.CancellationSignal cancellationSignal, java.lang.Runnable runnable) {
        this.f5563e.d();
        this.f5564f = 0;
        this.f5561c.a();
        runnable.run();
    }
}
