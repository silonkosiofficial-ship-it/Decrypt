package p258z9;

/* JADX INFO: loaded from: classes2.dex */
public final class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p258z9.AbstractC7388a f57700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f57701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f57702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f57703d;

    static final class a extends p147o7.k implements p237x7.q {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        int f57704E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f57705F;

        a(p127m7.e eVar) {
            super(3, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f57704E;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p087i7.AbstractC6657c abstractC6657c = (p087i7.AbstractC6657c) this.f57705F;
                byte bD = p258z9.W.this.f57700a.D();
                if (bD == 1) {
                    return p258z9.W.this.j(true);
                }
                if (bD == 0) {
                    return p258z9.W.this.j(false);
                }
                if (bD != 6) {
                    if (bD == 8) {
                        return p258z9.W.this.f();
                    }
                    p258z9.AbstractC7388a.y(p258z9.W.this.f57700a, "Can't begin reading element, unexpected token", 0, null, 6, null);
                    throw new p087i7.C6665k();
                }
                p258z9.W w6 = p258z9.W.this;
                this.f57704E = 1;
                obj = w6.h(abstractC6657c, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            return (p249y9.i) obj;
        }

        @Override // p237x7.q
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object j(p087i7.AbstractC6657c abstractC6657c, p087i7.M m6, p127m7.e eVar) {
            z9.W.a aVar = p258z9.W.this.new a(eVar);
            aVar.f57705F = abstractC6657c;
            return aVar.B(p087i7.M.f46721a);
        }
    }

    static final class b extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f57707F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f57708G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f57709H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        java.lang.Object f57710I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        /* synthetic */ java.lang.Object f57711J;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        int f57713L;

        b(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f57711J = obj;
            this.f57713L |= Integer.MIN_VALUE;
            return p258z9.W.this.h(null, this);
        }
    }

    public W(p249y9.C7363g c7363g, p258z9.AbstractC7388a abstractC7388a) {
        p247y7.AbstractC7350t.f(c7363g, "configuration");
        p247y7.AbstractC7350t.f(abstractC7388a, "lexer");
        this.f57700a = abstractC7388a;
        this.f57701b = c7363g.q();
        this.f57702c = c7363g.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p249y9.i f() {
        byte bK = this.f57700a.k();
        if (this.f57700a.D() == 4) {
            p258z9.AbstractC7388a.y(this.f57700a, "Unexpected leading comma", 0, null, 6, null);
            throw new p087i7.C6665k();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (this.f57700a.f()) {
            arrayList.add(e());
            bK = this.f57700a.k();
            if (bK != 4) {
                p258z9.AbstractC7388a abstractC7388a = this.f57700a;
                boolean z6 = bK == 9;
                int i6 = abstractC7388a.f57735a;
                if (!z6) {
                    p258z9.AbstractC7388a.y(abstractC7388a, "Expected end of the array or comma", i6, null, 4, null);
                    throw new p087i7.C6665k();
                }
            }
        }
        if (bK == 8) {
            this.f57700a.l((byte) 9);
        } else if (bK == 4) {
            if (!this.f57702c) {
                p258z9.G.g(this.f57700a, "array");
                throw new p087i7.C6665k();
            }
            this.f57700a.l((byte) 9);
        }
        return new p249y9.C7359c(arrayList);
    }

    private final p249y9.i g() {
        return (p249y9.i) p087i7.AbstractC6656b.b(new p087i7.C6655a(new z9.W.a(null)), p087i7.M.f46721a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x006c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0070  */
    /* JADX WARN: Code duplicated, block: B:22:0x0077  */
    /* JADX WARN: Code duplicated, block: B:25:0x0095 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0096  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00af  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0096 -> B:27:0x00a0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object h(p087i7.AbstractC6657c r21, p127m7.e r22) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p258z9.W.h(i7.c, m7.e):java.lang.Object");
    }

    private final p249y9.i i() {
        byte bL = this.f57700a.l((byte) 6);
        if (this.f57700a.D() == 4) {
            p258z9.AbstractC7388a.y(this.f57700a, "Unexpected leading comma", 0, null, 6, null);
            throw new p087i7.C6665k();
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        while (this.f57700a.f()) {
            java.lang.String strS = this.f57701b ? this.f57700a.s() : this.f57700a.q();
            this.f57700a.l((byte) 5);
            linkedHashMap.put(strS, e());
            bL = this.f57700a.k();
            if (bL != 4) {
                if (bL == 7) {
                    break;
                }
                p258z9.AbstractC7388a.y(this.f57700a, "Expected end of the object or comma", 0, null, 6, null);
                throw new p087i7.C6665k();
            }
        }
        if (bL == 6) {
            this.f57700a.l((byte) 7);
        } else if (bL == 4) {
            if (!this.f57702c) {
                p258z9.G.h(this.f57700a, null, 1, null);
                throw new p087i7.C6665k();
            }
            this.f57700a.l((byte) 7);
        }
        return new p249y9.D(linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p249y9.F j(boolean z6) {
        java.lang.String strS = (this.f57701b || !z6) ? this.f57700a.s() : this.f57700a.q();
        return (z6 || !p247y7.AbstractC7350t.b(strS, "null")) ? new p249y9.w(strS, z6, null, 4, null) : p249y9.A.INSTANCE;
    }

    public final p249y9.i e() {
        byte bD = this.f57700a.D();
        if (bD == 1) {
            return j(true);
        }
        if (bD == 0) {
            return j(false);
        }
        if (bD == 6) {
            int i6 = this.f57703d + 1;
            this.f57703d = i6;
            p249y9.i iVarG = i6 == 200 ? g() : i();
            this.f57703d--;
            return iVarG;
        }
        if (bD == 8) {
            return f();
        }
        p258z9.AbstractC7388a.y(this.f57700a, "Cannot read Json element because of unexpected " + p258z9.AbstractC7389b.c(bD), 0, null, 6, null);
        throw new p087i7.C6665k();
    }
}
