package p163q2;

/* JADX INFO: loaded from: classes.dex */
public final class c implements p163q2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p243y2.c f53028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p163q2.h f53029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p163q2.h f53030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.ThreadLocal f53031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final V8.a f53032e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f53033f;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p243y2.c f53034D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ java.lang.String f53035E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p243y2.c cVar, java.lang.String str) {
            super(0);
            this.f53034D = cVar;
            this.f53035E = str;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p243y2.b b() {
            return this.f53034D.a(this.f53035E);
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p243y2.c f53036D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ java.lang.String f53037E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p243y2.c cVar, java.lang.String str) {
            super(0);
            this.f53036D = cVar;
            this.f53037E = str;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p243y2.b b() {
            p243y2.b bVarA = this.f53036D.a(this.f53037E);
            p243y2.a.a(bVarA, "PRAGMA query_only = 1");
            return bVarA;
        }
    }

    /* JADX INFO: renamed from: q2.c$c, reason: collision with other inner class name */
    static final class C0687c extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p243y2.c f53038D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ java.lang.String f53039E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0687c(p243y2.c cVar, java.lang.String str) {
            super(0);
            this.f53038D = cVar;
            this.f53039E = str;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p243y2.b b() {
            return this.f53038D.a(this.f53039E);
        }
    }

    static final class d extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f53040F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f53041G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f53042H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        java.lang.Object f53043I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        java.lang.Object f53044J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        boolean f53045K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        /* synthetic */ java.lang.Object f53046L;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        int f53048N;

        d(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f53046L = obj;
            this.f53048N |= Integer.MIN_VALUE;
            return p163q2.c.this.a(false, null, this);
        }
    }

    static final class e extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f53049G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ p237x7.p f53050H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p163q2.i f53051I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(p237x7.p pVar, p163q2.i iVar, p127m7.e eVar) {
            super(2, eVar);
            this.f53050H = pVar;
            this.f53051I = iVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f53049G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p237x7.p pVar = this.f53050H;
                p163q2.i iVar = this.f53051I;
                this.f53049G = 1;
                obj = pVar.u(iVar, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            return obj;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((q2.c.e) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return new q2.c.e(this.f53050H, this.f53051I, eVar);
        }
    }

    static final class f extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f53052G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ p237x7.p f53053H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p247y7.O f53054I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(p237x7.p pVar, p247y7.O o6, p127m7.e eVar) {
            super(2, eVar);
            this.f53053H = pVar;
            this.f53054I = o6;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f53052G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p237x7.p pVar = this.f53053H;
                java.lang.Object obj2 = this.f53054I.f57254C;
                this.f53052G = 1;
                obj = pVar.u(obj2, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            return obj;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((q2.c.f) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return new q2.c.f(this.f53053H, this.f53054I, eVar);
        }
    }

    public c(p243y2.c cVar, java.lang.String str) {
        p247y7.AbstractC7350t.f(cVar, "driver");
        p247y7.AbstractC7350t.f(str, "fileName");
        this.f53031d = new java.lang.ThreadLocal();
        this.f53032e = V8.b.a(false);
        T8.a.C0279a c0279a = T8.a.f13312D;
        this.f53033f = T8.c.s(30, T8.d.SECONDS);
        this.f53028a = cVar;
        p163q2.h hVar = new p163q2.h(1, new q2.c.a(cVar, str));
        this.f53029b = hVar;
        this.f53030c = hVar;
    }

    public c(p243y2.c cVar, java.lang.String str, int i6, int i10) {
        p247y7.AbstractC7350t.f(cVar, "driver");
        p247y7.AbstractC7350t.f(str, "fileName");
        this.f53031d = new java.lang.ThreadLocal();
        this.f53032e = V8.b.a(false);
        T8.a.C0279a c0279a = T8.a.f13312D;
        this.f53033f = T8.c.s(30, T8.d.SECONDS);
        if (i6 <= 0) {
            throw new java.lang.IllegalArgumentException("Maximum number of readers must be greater than 0".toString());
        }
        if (i10 <= 0) {
            throw new java.lang.IllegalArgumentException("Maximum number of writers must be greater than 0".toString());
        }
        this.f53028a = cVar;
        this.f53029b = new p163q2.h(i6, new q2.c.b(cVar, str));
        this.f53030c = new p163q2.h(i10, new p163q2.c.C0687c(cVar, str));
    }

    private final p127m7.i b(p163q2.i iVar) {
        return new p163q2.a(iVar).o0(p153p2.d.a(this.f53031d, iVar));
    }

    private final boolean c() {
        return this.f53032e.c();
    }

    private final java.lang.Void d(boolean z6) {
        java.lang.String str = z6 ? "reader" : "writer";
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Timed out attempting to acquire a " + str + " connection.");
        p247y7.AbstractC7350t.e(sb, "append(value)");
        sb.append('\n');
        p247y7.AbstractC7350t.e(sb, "append('\\n')");
        sb.append('\n');
        p247y7.AbstractC7350t.e(sb, "append('\\n')");
        sb.append("Writer pool:");
        p247y7.AbstractC7350t.e(sb, "append(value)");
        sb.append('\n');
        p247y7.AbstractC7350t.e(sb, "append('\\n')");
        this.f53030c.c(sb);
        sb.append("Reader pool:");
        p247y7.AbstractC7350t.e(sb, "append(value)");
        sb.append('\n');
        p247y7.AbstractC7350t.e(sb, "append('\\n')");
        this.f53029b.c(sb);
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "StringBuilder().apply(builderAction).toString()");
        p243y2.a.b(5, string);
        throw new p087i7.C6665k();
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0136 A[Catch: all -> 0x014f, TryCatch #7 {all -> 0x014f, blocks: (B:65:0x0121, B:67:0x0136, B:72:0x014b, B:76:0x0154, B:80:0x015e, B:88:0x018c, B:89:0x0197, B:90:0x0198, B:91:0x0199, B:92:0x01a1), top: B:122:0x0121 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x014a  */
    /* JADX WARN: Code duplicated, block: B:75:0x0153  */
    /* JADX WARN: Code duplicated, block: B:78:0x015a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x015c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:80:0x015e A[Catch: all -> 0x014f, TRY_LEAVE, TryCatch #7 {all -> 0x014f, blocks: (B:65:0x0121, B:67:0x0136, B:72:0x014b, B:76:0x0154, B:80:0x015e, B:88:0x018c, B:89:0x0197, B:90:0x0198, B:91:0x0199, B:92:0x01a1), top: B:122:0x0121 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0179 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:83:0x017a  */
    /* JADX WARN: Code duplicated, block: B:86:0x0181 A[Catch: all -> 0x018b, TRY_LEAVE, TryCatch #5 {all -> 0x018b, blocks: (B:84:0x017b, B:86:0x0181), top: B:118:0x017b }] */
    /* JADX WARN: Code duplicated, block: B:88:0x018c A[Catch: all -> 0x014f, TRY_ENTER, TryCatch #7 {all -> 0x014f, blocks: (B:65:0x0121, B:67:0x0136, B:72:0x014b, B:76:0x0154, B:80:0x015e, B:88:0x018c, B:89:0x0197, B:90:0x0198, B:91:0x0199, B:92:0x01a1), top: B:122:0x0121 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0198 A[Catch: all -> 0x014f, TryCatch #7 {all -> 0x014f, blocks: (B:65:0x0121, B:67:0x0136, B:72:0x014b, B:76:0x0154, B:80:0x015e, B:88:0x018c, B:89:0x0197, B:90:0x0198, B:91:0x0199, B:92:0x01a1), top: B:122:0x0121 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0199 A[Catch: all -> 0x014f, TryCatch #7 {all -> 0x014f, blocks: (B:65:0x0121, B:67:0x0136, B:72:0x014b, B:76:0x0154, B:80:0x015e, B:88:0x018c, B:89:0x0197, B:90:0x0198, B:91:0x0199, B:92:0x01a1), top: B:122:0x0121 }] */
    @Override // p163q2.b
    public java.lang.Object a(boolean z6, p237x7.p pVar, p127m7.e eVar) {
        q2.c.d dVar;
        java.lang.Throwable th;
        p163q2.h hVar;
        p247y7.O o6;
        p247y7.O o10;
        p163q2.h hVar2;
        p247y7.O o11;
        java.lang.Object obj;
        p163q2.c cVar;
        p237x7.p pVar2;
        boolean z10;
        p163q2.f fVar;
        java.lang.Throwable th2;
        p163q2.i iVar;
        boolean z11;
        p163q2.i iVar2;
        boolean z12 = z6;
        p237x7.p pVar3 = pVar;
        if (eVar instanceof q2.c.d) {
            dVar = (q2.c.d) eVar;
            int i6 = dVar.f53048N;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                dVar.f53048N = i6 - Integer.MIN_VALUE;
            } else {
                dVar = new q2.c.d(eVar);
            }
        } else {
            dVar = new q2.c.d(eVar);
        }
        java.lang.Object objU = dVar.f53046L;
        java.lang.Object objG = p137n7.b.g();
        int i10 = dVar.f53048N;
        if (i10 != 0) {
            if (i10 == 1 || i10 == 2) {
                p087i7.x.b(objU);
                return objU;
            }
            if (i10 != 3) {
                if (i10 != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o6 = (p247y7.O) dVar.f53041G;
                hVar = (p163q2.h) dVar.f53040F;
                try {
                    p087i7.x.b(objU);
                    try {
                        iVar2 = (p163q2.i) o6.f57254C;
                        if (iVar2 != null) {
                            iVar2.n();
                            hVar.d(iVar2.k());
                        }
                    } catch (java.lang.Throwable unused) {
                    }
                    return objU;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    try {
                        throw th;
                    } catch (java.lang.Throwable th4) {
                        try {
                            p163q2.i iVar3 = (p163q2.i) o6.f57254C;
                            if (iVar3 == null) {
                                throw th4;
                            }
                            iVar3.n();
                            hVar.d(iVar3.k());
                            throw th4;
                        } catch (java.lang.Throwable th5) {
                            p087i7.AbstractC6661g.a(th, th5);
                            throw th4;
                        }
                    }
                }
            }
            z12 = dVar.f53045K;
            p247y7.O o12 = (p247y7.O) dVar.f53044J;
            o11 = (p247y7.O) dVar.f53043I;
            hVar2 = (p163q2.h) dVar.f53042H;
            p237x7.p pVar4 = (p237x7.p) dVar.f53041G;
            p163q2.c cVar2 = (p163q2.c) dVar.f53040F;
            try {
                p087i7.x.b(objU);
                cVar = cVar2;
                o10 = o12;
                pVar3 = pVar4;
                obj = null;
            } catch (java.lang.Throwable th6) {
                obj = th6;
                cVar = cVar2;
                o10 = o12;
                pVar3 = pVar4;
            }
            pVar2 = pVar3;
            z10 = z12;
            o6 = o11;
            try {
                p087i7.u uVarA = p087i7.B.a(o10.f57254C, obj);
                fVar = (p163q2.f) uVarA.a();
                th2 = (java.lang.Throwable) uVarA.b();
                if (fVar != null) {
                    p163q2.f fVarG = fVar.g(dVar.getContext());
                    if (cVar.f53029b == cVar.f53030c && z10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    iVar = new p163q2.i(fVarG, z11);
                } else {
                    iVar = null;
                }
                o6.f57254C = iVar;
                if (!(th2 instanceof W8.Y0)) {
                    cVar.d(z10);
                    throw new p087i7.C6665k();
                }
                if (th2 == null) {
                    throw th2;
                }
                if (iVar != null) {
                    throw new java.lang.IllegalArgumentException("Required value was null.".toString());
                }
                p127m7.i iVarB = cVar.b(iVar);
                q2.c.f fVar2 = new q2.c.f(pVar2, o6, null);
                dVar.f53040F = hVar2;
                dVar.f53041G = o6;
                dVar.f53042H = null;
                dVar.f53043I = null;
                dVar.f53044J = null;
                dVar.f53048N = 4;
                objU = W8.AbstractC1784g.g(iVarB, fVar2, dVar);
                if (objU == objG) {
                    return objG;
                }
                hVar = hVar2;
                iVar2 = (p163q2.i) o6.f57254C;
                if (iVar2 != null) {
                    iVar2.n();
                    hVar.d(iVar2.k());
                }
                return objU;
            } catch (java.lang.Throwable th7) {
                th = th7;
                hVar = hVar2;
                throw th;
            }
        }
        p087i7.x.b(objU);
        if (c()) {
            p243y2.a.b(21, "Connection pool is closed");
            throw new p087i7.C6665k();
        }
        p163q2.i iVarA = (p163q2.i) this.f53031d.get();
        if (iVarA == null) {
            p163q2.a aVar = (p163q2.a) dVar.getContext().i(p163q2.a.f53026D);
            iVarA = aVar != null ? aVar.a() : null;
        }
        if (iVarA != null) {
            if (!z12 && iVarA.l()) {
                p243y2.a.b(1, "Cannot upgrade connection from reader to writer");
                throw new p087i7.C6665k();
            }
            if (dVar.getContext().i(p163q2.a.f53026D) == null) {
                p127m7.i iVarB2 = b(iVarA);
                q2.c.e eVar2 = new q2.c.e(pVar3, iVarA, null);
                dVar.f53048N = 1;
                objU = W8.AbstractC1784g.g(iVarB2, eVar2, dVar);
                if (objU == objG) {
                    return objG;
                }
            } else {
                dVar.f53048N = 2;
                objU = pVar3.u(iVarA, dVar);
                if (objU == objG) {
                    return objG;
                }
            }
            return objU;
        }
        p163q2.h hVar3 = z12 ? this.f53029b : this.f53030c;
        p247y7.O o13 = new p247y7.O();
        try {
            o10 = new p247y7.O();
            try {
                long j6 = this.f53033f;
                p163q2.d dVar2 = new p163q2.d(o10, hVar3, null);
                dVar.f53040F = this;
                dVar.f53041G = pVar3;
                dVar.f53042H = hVar3;
                dVar.f53043I = o13;
                dVar.f53044J = o10;
                dVar.f53045K = z12;
                dVar.f53048N = 3;
                if (W8.a1.d(j6, dVar2, dVar) == objG) {
                    return objG;
                }
                cVar = this;
                hVar2 = hVar3;
                o11 = o13;
                obj = null;
                pVar2 = pVar3;
                z10 = z12;
                o6 = o11;
                p087i7.u uVarA2 = p087i7.B.a(o10.f57254C, obj);
                fVar = (p163q2.f) uVarA2.a();
                th2 = (java.lang.Throwable) uVarA2.b();
                if (fVar != null) {
                    p163q2.f fVarG2 = fVar.g(dVar.getContext());
                    if (cVar.f53029b == cVar.f53030c) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    iVar = new p163q2.i(fVarG2, z11);
                } else {
                    iVar = null;
                }
                o6.f57254C = iVar;
                if (!(th2 instanceof W8.Y0)) {
                    cVar.d(z10);
                    throw new p087i7.C6665k();
                }
                if (th2 == null) {
                    throw th2;
                }
                if (iVar != null) {
                    throw new java.lang.IllegalArgumentException("Required value was null.".toString());
                }
                p127m7.i iVarB3 = cVar.b(iVar);
                q2.c.f fVar3 = new q2.c.f(pVar2, o6, null);
                dVar.f53040F = hVar2;
                dVar.f53041G = o6;
                dVar.f53042H = null;
                dVar.f53043I = null;
                dVar.f53044J = null;
                dVar.f53048N = 4;
                objU = W8.AbstractC1784g.g(iVarB3, fVar3, dVar);
                if (objU == objG) {
                    return objG;
                }
                hVar = hVar2;
                iVar2 = (p163q2.i) o6.f57254C;
                if (iVar2 != null) {
                    iVar2.n();
                    hVar.d(iVar2.k());
                }
                return objU;
            } catch (java.lang.Throwable th8) {
                hVar2 = hVar3;
                o11 = o13;
                obj = th8;
                cVar = this;
            }
        } catch (java.lang.Throwable th9) {
            th = th9;
            hVar = hVar3;
            o6 = o13;
            throw th;
        }
    }

    @Override // p163q2.b
    public void close() {
        if (this.f53032e.a(false, true)) {
            this.f53029b.b();
            this.f53030c.b();
        }
    }
}
