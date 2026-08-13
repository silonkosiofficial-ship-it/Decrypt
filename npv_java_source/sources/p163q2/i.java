package p163q2;

/* JADX INFO: loaded from: classes.dex */
final class i implements p143o2.B, p163q2.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p163q2.f f53081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f53082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p097j7.C6871m f53083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final V8.a f53084d;

    private final class a implements p243y2.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p243y2.e f53085a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f53086b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p163q2.i f53087c;

        public a(p163q2.i iVar, p243y2.e eVar) {
            p247y7.AbstractC7350t.f(eVar, "delegate");
            this.f53087c = iVar;
            this.f53085a = eVar;
            this.f53086b = p153p2.d.b();
        }

        @Override // p243y2.e
        public void a() {
            if (this.f53087c.m()) {
                p243y2.a.b(21, "Statement is recycled");
                throw new p087i7.C6665k();
            }
            if (this.f53086b == p153p2.d.b()) {
                this.f53085a.a();
            } else {
                p243y2.a.b(21, "Attempted to use statement on a different thread");
                throw new p087i7.C6665k();
            }
        }

        @Override // p243y2.e
        public void close() {
            if (this.f53087c.m()) {
                p243y2.a.b(21, "Statement is recycled");
                throw new p087i7.C6665k();
            }
            if (this.f53086b == p153p2.d.b()) {
                this.f53085a.close();
            } else {
                p243y2.a.b(21, "Attempted to use statement on a different thread");
                throw new p087i7.C6665k();
            }
        }

        @Override // p243y2.e
        public int getColumnCount() {
            if (this.f53087c.m()) {
                p243y2.a.b(21, "Statement is recycled");
                throw new p087i7.C6665k();
            }
            if (this.f53086b == p153p2.d.b()) {
                return this.f53085a.getColumnCount();
            }
            p243y2.a.b(21, "Attempted to use statement on a different thread");
            throw new p087i7.C6665k();
        }

        @Override // p243y2.e
        public java.lang.String getColumnName(int i6) {
            if (this.f53087c.m()) {
                p243y2.a.b(21, "Statement is recycled");
                throw new p087i7.C6665k();
            }
            if (this.f53086b == p153p2.d.b()) {
                return this.f53085a.getColumnName(i6);
            }
            p243y2.a.b(21, "Attempted to use statement on a different thread");
            throw new p087i7.C6665k();
        }

        @Override // p243y2.e
        public /* synthetic */ int getInt(int i6) {
            return p243y2.d.b(this, i6);
        }

        @Override // p243y2.e
        public long getLong(int i6) {
            if (this.f53087c.m()) {
                p243y2.a.b(21, "Statement is recycled");
                throw new p087i7.C6665k();
            }
            if (this.f53086b == p153p2.d.b()) {
                return this.f53085a.getLong(i6);
            }
            p243y2.a.b(21, "Attempted to use statement on a different thread");
            throw new p087i7.C6665k();
        }

        @Override // p243y2.e
        public boolean isNull(int i6) {
            if (this.f53087c.m()) {
                p243y2.a.b(21, "Statement is recycled");
                throw new p087i7.C6665k();
            }
            if (this.f53086b == p153p2.d.b()) {
                return this.f53085a.isNull(i6);
            }
            p243y2.a.b(21, "Attempted to use statement on a different thread");
            throw new p087i7.C6665k();
        }

        @Override // p243y2.e
        public void l(int i6, long j6) {
            if (this.f53087c.m()) {
                p243y2.a.b(21, "Statement is recycled");
                throw new p087i7.C6665k();
            }
            if (this.f53086b == p153p2.d.b()) {
                this.f53085a.l(i6, j6);
            } else {
                p243y2.a.b(21, "Attempted to use statement on a different thread");
                throw new p087i7.C6665k();
            }
        }

        @Override // p243y2.e
        public /* synthetic */ boolean m(int i6) {
            return p243y2.d.a(this, i6);
        }

        @Override // p243y2.e
        public void n(int i6, java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "value");
            if (this.f53087c.m()) {
                p243y2.a.b(21, "Statement is recycled");
                throw new p087i7.C6665k();
            }
            if (this.f53086b == p153p2.d.b()) {
                this.f53085a.n(i6, str);
            } else {
                p243y2.a.b(21, "Attempted to use statement on a different thread");
                throw new p087i7.C6665k();
            }
        }

        @Override // p243y2.e
        public java.lang.String o(int i6) {
            if (this.f53087c.m()) {
                p243y2.a.b(21, "Statement is recycled");
                throw new p087i7.C6665k();
            }
            if (this.f53086b == p153p2.d.b()) {
                return this.f53085a.o(i6);
            }
            p243y2.a.b(21, "Attempted to use statement on a different thread");
            throw new p087i7.C6665k();
        }

        @Override // p243y2.e
        public boolean p() {
            if (this.f53087c.m()) {
                p243y2.a.b(21, "Statement is recycled");
                throw new p087i7.C6665k();
            }
            if (this.f53086b == p153p2.d.b()) {
                return this.f53085a.p();
            }
            p243y2.a.b(21, "Attempted to use statement on a different thread");
            throw new p087i7.C6665k();
        }
    }

    private final class b implements p143o2.A, p163q2.j {
        public b() {
        }

        @Override // p143o2.k
        public java.lang.Object b(java.lang.String str, p237x7.l lVar, p127m7.e eVar) {
            return p163q2.i.this.b(str, lVar, eVar);
        }

        @Override // p163q2.j
        public p243y2.b d() {
            return p163q2.i.this.d();
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f53089a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f53090b;

        public c(int i6, boolean z6) {
            this.f53089a = i6;
            this.f53090b = z6;
        }

        public final int a() {
            return this.f53089a;
        }

        public final boolean b() {
            return this.f53090b;
        }
    }

    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f53091a;

        static {
            int[] iArr = new int[o2.B.a.values().length];
            try {
                iArr[o2.B.a.DEFERRED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[o2.B.a.IMMEDIATE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[o2.B.a.EXCLUSIVE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f53091a = iArr;
        }
    }

    static final class e extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f53092F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f53093G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f53094H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        /* synthetic */ java.lang.Object f53095I;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        int f53097K;

        e(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f53095I = obj;
            this.f53097K |= Integer.MIN_VALUE;
            return p163q2.i.this.i(null, this);
        }
    }

    static final class f extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f53098F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f53099G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        boolean f53100H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        /* synthetic */ java.lang.Object f53101I;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        int f53103K;

        f(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f53101I = obj;
            this.f53103K |= Integer.MIN_VALUE;
            return p163q2.i.this.j(false, this);
        }
    }

    static final class g extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f53104F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f53105G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        int f53106H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        /* synthetic */ java.lang.Object f53107I;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        int f53109K;

        g(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f53107I = obj;
            this.f53109K |= Integer.MIN_VALUE;
            return p163q2.i.this.o(null, null, this);
        }
    }

    static final class h extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f53110F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f53111G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f53112H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        java.lang.Object f53113I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        /* synthetic */ java.lang.Object f53114J;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        int f53116L;

        h(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f53114J = obj;
            this.f53116L |= Integer.MIN_VALUE;
            return p163q2.i.this.b(null, null, this);
        }
    }

    public i(p163q2.f fVar, boolean z6) {
        p247y7.AbstractC7350t.f(fVar, "delegate");
        this.f53081a = fVar;
        this.f53082b = z6;
        this.f53083c = new p097j7.C6871m();
        this.f53084d = V8.b.a(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object i(o2.B.a aVar, p127m7.e eVar) {
        q2.i.e eVar2;
        p059f9.a aVar2;
        p163q2.i iVar;
        p163q2.f fVar;
        java.lang.String str;
        if (eVar instanceof q2.i.e) {
            eVar2 = (q2.i.e) eVar;
            int i6 = eVar2.f53097K;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                eVar2.f53097K = i6 - Integer.MIN_VALUE;
            } else {
                eVar2 = new q2.i.e(eVar);
            }
        } else {
            eVar2 = new q2.i.e(eVar);
        }
        java.lang.Object obj = eVar2.f53095I;
        java.lang.Object objG = p137n7.b.g();
        int i10 = eVar2.f53097K;
        if (i10 == 0) {
            p087i7.x.b(obj);
            aVar2 = this.f53081a;
            eVar2.f53092F = this;
            eVar2.f53093G = aVar;
            eVar2.f53094H = aVar2;
            eVar2.f53097K = 1;
            if (aVar2.c(null, eVar2) == objG) {
                return objG;
            }
            iVar = this;
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p059f9.a aVar3 = (p059f9.a) eVar2.f53094H;
            o2.B.a aVar4 = (o2.B.a) eVar2.f53093G;
            iVar = (p163q2.i) eVar2.f53092F;
            p087i7.x.b(obj);
            aVar2 = aVar3;
            aVar = aVar4;
        }
        try {
            int size = iVar.f53083c.size();
            if (iVar.f53083c.isEmpty()) {
                int i11 = q2.i.d.f53091a[aVar.ordinal()];
                if (i11 == 1) {
                    fVar = iVar.f53081a;
                    str = "BEGIN DEFERRED TRANSACTION";
                } else {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            fVar = iVar.f53081a;
                            str = "BEGIN EXCLUSIVE TRANSACTION";
                        }
                        iVar.f53083c.g(new q2.i.c(size, false));
                        return p087i7.M.f46721a;
                    }
                    fVar = iVar.f53081a;
                    str = "BEGIN IMMEDIATE TRANSACTION";
                }
            } else {
                fVar = iVar.f53081a;
                str = "SAVEPOINT '" + size + '\'';
            }
            p243y2.a.a(fVar, str);
            iVar.f53083c.g(new q2.i.c(size, false));
            return p087i7.M.f46721a;
        } finally {
            aVar2.d(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object j(boolean z6, p127m7.e eVar) {
        q2.i.f fVar;
        p163q2.i iVar;
        p059f9.a aVar;
        p163q2.f fVar2;
        java.lang.String str;
        if (eVar instanceof q2.i.f) {
            fVar = (q2.i.f) eVar;
            int i6 = fVar.f53103K;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                fVar.f53103K = i6 - Integer.MIN_VALUE;
            } else {
                fVar = new q2.i.f(eVar);
            }
        } else {
            fVar = new q2.i.f(eVar);
        }
        java.lang.Object obj = fVar.f53101I;
        java.lang.Object objG = p137n7.b.g();
        int i10 = fVar.f53103K;
        if (i10 == 0) {
            p087i7.x.b(obj);
            p163q2.f fVar3 = this.f53081a;
            fVar.f53098F = this;
            fVar.f53099G = fVar3;
            fVar.f53100H = z6;
            fVar.f53103K = 1;
            if (fVar3.c(null, fVar) == objG) {
                return objG;
            }
            iVar = this;
            aVar = fVar3;
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z6 = fVar.f53100H;
            aVar = (p059f9.a) fVar.f53099G;
            iVar = (p163q2.i) fVar.f53098F;
            p087i7.x.b(obj);
        }
        try {
            if (iVar.f53083c.isEmpty()) {
                throw new java.lang.IllegalStateException("Not in a transaction".toString());
            }
            q2.i.c cVar = (q2.i.c) p097j7.AbstractC6879v.L(iVar.f53083c);
            if (!z6 || cVar.b()) {
                if (iVar.f53083c.isEmpty()) {
                    fVar2 = iVar.f53081a;
                    str = "ROLLBACK TRANSACTION";
                } else {
                    fVar2 = iVar.f53081a;
                    str = "ROLLBACK TRANSACTION TO SAVEPOINT '" + cVar.a() + '\'';
                }
            } else if (iVar.f53083c.isEmpty()) {
                fVar2 = iVar.f53081a;
                str = "END TRANSACTION";
            } else {
                fVar2 = iVar.f53081a;
                str = "RELEASE SAVEPOINT '" + cVar.a() + '\'';
            }
            p243y2.a.a(fVar2, str);
            p087i7.M m6 = p087i7.M.f46721a;
            aVar.d(null);
            return m6;
        } catch (java.lang.Throwable th) {
            aVar.d(null);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean m() {
        return this.f53084d.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:44:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ab A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object o(o2.B.a aVar, p237x7.p pVar, p127m7.e eVar) throws java.lang.Throwable {
        q2.i.g gVar;
        p163q2.i iVar;
        p163q2.i iVar2;
        int i6;
        android.database.SQLException e6;
        java.lang.Throwable th;
        boolean z6;
        if (eVar instanceof q2.i.g) {
            gVar = (q2.i.g) eVar;
            int i10 = gVar.f53109K;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f53109K = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new q2.i.g(eVar);
            }
        } else {
            gVar = new q2.i.g(eVar);
        }
        java.lang.Object objU = gVar.f53107I;
        java.lang.Object objG = p137n7.b.g();
        int i11 = gVar.f53109K;
        p087i7.M m6 = null;
        try {
            if (i11 == 0) {
                p087i7.x.b(objU);
                if (aVar == null) {
                    aVar = o2.B.a.DEFERRED;
                }
                gVar.f53104F = this;
                gVar.f53105G = pVar;
                gVar.f53109K = 1;
                if (i(aVar, gVar) == objG) {
                    return objG;
                }
                iVar = this;
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            java.lang.Object obj = gVar.f53104F;
                            p087i7.x.b(objU);
                            return obj;
                        }
                        if (i11 == 4) {
                            java.lang.Object obj2 = gVar.f53104F;
                            p087i7.x.b(objU);
                            return obj2;
                        }
                        if (i11 != 5) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th = (java.lang.Throwable) gVar.f53105G;
                        th = (java.lang.Throwable) gVar.f53104F;
                        try {
                            p087i7.x.b(objU);
                            throw th;
                        } catch (android.database.SQLException e10) {
                            e6 = e10;
                            if (th != null) {
                                p087i7.AbstractC6661g.a(th, e6);
                                m6 = p087i7.M.f46721a;
                            }
                            if (m6 == null) {
                                throw e6;
                            }
                            throw th;
                        }
                    }
                    i6 = gVar.f53106H;
                    iVar2 = (p163q2.i) gVar.f53104F;
                    try {
                        p087i7.x.b(objU);
                        z6 = i6 != 0;
                        gVar.f53104F = objU;
                        gVar.f53109K = 3;
                        if (iVar2.j(z6, gVar) == objG) {
                            return objG;
                        }
                        return objU;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        iVar = iVar2;
                        try {
                            throw th;
                        } catch (java.lang.Throwable th3) {
                            try {
                                gVar.f53104F = th;
                                gVar.f53105G = th3;
                                gVar.f53109K = 5;
                                if (iVar.j(false, gVar) == objG) {
                                    return objG;
                                }
                                throw th3;
                            } catch (android.database.SQLException e11) {
                                e6 = e11;
                                th = th3;
                                if (th != null) {
                                    p087i7.AbstractC6661g.a(th, e6);
                                    m6 = p087i7.M.f46721a;
                                }
                                if (m6 == null) {
                                    throw e6;
                                }
                                throw th;
                            }
                        }
                    }
                }
                pVar = (p237x7.p) gVar.f53105G;
                iVar = (p163q2.i) gVar.f53104F;
                p087i7.x.b(objU);
            }
            q2.i.b bVar = iVar.new b();
            gVar.f53104F = iVar;
            gVar.f53105G = null;
            gVar.f53106H = 1;
            gVar.f53109K = 2;
            objU = pVar.u(bVar, gVar);
            if (objU == objG) {
                return objG;
            }
            iVar2 = iVar;
            i6 = 1;
            if (i6 != 0) {
            }
            gVar.f53104F = objU;
            gVar.f53109K = 3;
            if (iVar2.j(z6, gVar) == objG) {
                return objG;
            }
            return objU;
        } catch (java.lang.Throwable th4) {
            th = th4;
            throw th;
        }
    }

    @Override // p143o2.B
    public java.lang.Object a(p127m7.e eVar) {
        if (m()) {
            p243y2.a.b(21, "Connection is recycled");
            throw new p087i7.C6665k();
        }
        p163q2.a aVar = (p163q2.a) eVar.getContext().i(p163q2.a.f53026D);
        if (aVar != null && aVar.a() == this) {
            return p147o7.b.a(!this.f53083c.isEmpty());
        }
        p243y2.a.b(21, "Attempted to use connection on a different coroutine");
        throw new p087i7.C6665k();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p143o2.k
    public java.lang.Object b(java.lang.String str, p237x7.l lVar, p127m7.e eVar) {
        q2.i.h hVar;
        p059f9.a aVar;
        p163q2.i iVar;
        if (eVar instanceof q2.i.h) {
            hVar = (q2.i.h) eVar;
            int i6 = hVar.f53116L;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                hVar.f53116L = i6 - Integer.MIN_VALUE;
            } else {
                hVar = new q2.i.h(eVar);
            }
        } else {
            hVar = new q2.i.h(eVar);
        }
        java.lang.Object obj = hVar.f53114J;
        java.lang.Object objG = p137n7.b.g();
        int i10 = hVar.f53116L;
        if (i10 == 0) {
            p087i7.x.b(obj);
            if (m()) {
                p243y2.a.b(21, "Connection is recycled");
                throw new p087i7.C6665k();
            }
            p163q2.a aVar2 = (p163q2.a) hVar.getContext().i(p163q2.a.f53026D);
            if (aVar2 == null || aVar2.a() != this) {
                p243y2.a.b(21, "Attempted to use connection on a different coroutine");
                throw new p087i7.C6665k();
            }
            aVar = this.f53081a;
            hVar.f53110F = this;
            hVar.f53111G = str;
            hVar.f53112H = lVar;
            hVar.f53113I = aVar;
            hVar.f53116L = 1;
            if (aVar.c(null, hVar) == objG) {
                return objG;
            }
            iVar = this;
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p059f9.a aVar3 = (p059f9.a) hVar.f53113I;
            lVar = (p237x7.l) hVar.f53112H;
            java.lang.String str2 = (java.lang.String) hVar.f53111G;
            iVar = (p163q2.i) hVar.f53110F;
            p087i7.x.b(obj);
            aVar = aVar3;
            str = str2;
        }
        try {
            q2.i.a aVar4 = new q2.i.a(iVar, iVar.f53081a.e(str));
            try {
                java.lang.Object objL = lVar.l(aVar4);
                aVar4.close();
                aVar.d(null);
                return objL;
            } catch (java.lang.Throwable th) {
                aVar4.close();
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            aVar.d(null);
            throw th2;
        }
    }

    @Override // p143o2.B
    public java.lang.Object c(o2.B.a aVar, p237x7.p pVar, p127m7.e eVar) {
        if (m()) {
            p243y2.a.b(21, "Connection is recycled");
            throw new p087i7.C6665k();
        }
        p163q2.a aVar2 = (p163q2.a) eVar.getContext().i(p163q2.a.f53026D);
        if (aVar2 != null && aVar2.a() == this) {
            return o(aVar, pVar, eVar);
        }
        p243y2.a.b(21, "Attempted to use connection on a different coroutine");
        throw new p087i7.C6665k();
    }

    @Override // p163q2.j
    public p243y2.b d() {
        return this.f53081a;
    }

    public final p163q2.f k() {
        return this.f53081a;
    }

    public final boolean l() {
        return this.f53082b;
    }

    public final void n() {
        this.f53081a.h();
        if (this.f53084d.a(false, true)) {
            try {
                p243y2.a.a(this.f53081a, "ROLLBACK TRANSACTION");
            } catch (android.database.SQLException unused) {
            }
        }
    }
}
