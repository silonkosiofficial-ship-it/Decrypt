package U5;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements U5.h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final U5.c.a f14481g = new U5.c.a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p127m7.i f14482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final G5.e f14483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final S5.C1619b f14484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final U5.a f14485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f14486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p059f9.a f14487f;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ M1.h f14488D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(M1.h hVar) {
            super(0);
            this.f14488D = hVar;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final U5.g b() {
            return new U5.g(this.f14488D);
        }
    }

    /* JADX INFO: renamed from: U5.c$c, reason: collision with other inner class name */
    static final class C0281c extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f14489F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f14490G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f14491H;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        int f14493J;

        C0281c(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f14491H = obj;
            this.f14493J |= Integer.MIN_VALUE;
            return U5.c.this.b(this);
        }
    }

    static final class d extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f14494G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f14495H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        int f14496I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        /* synthetic */ java.lang.Object f14497J;

        d(p127m7.e eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:45:0x00f7  */
        /* JADX WARN: Code duplicated, block: B:47:0x0110 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:50:0x0117  */
        /* JADX WARN: Code duplicated, block: B:52:0x0130 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:55:0x0137  */
        /* JADX WARN: Code duplicated, block: B:57:0x0150 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:59:0x0154  */
        /* JADX WARN: Code duplicated, block: B:61:0x0157  */
        /* JADX WARN: Code duplicated, block: B:63:0x0173 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:66:0x0191 A[RETURN] */
        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) throws org.json.JSONException {
            p247y7.O o6;
            java.lang.Boolean bool;
            p247y7.O o10;
            p247y7.O o11;
            p247y7.O o12;
            p247y7.O o13;
            U5.g gVarF;
            java.lang.Integer num;
            U5.g gVarF2;
            java.lang.Double d6;
            p087i7.M m6;
            U5.g gVarF3;
            java.lang.Integer num2;
            U5.g gVarF4;
            java.lang.Integer numC;
            U5.g gVarF5;
            java.lang.Long lD;
            java.lang.Object objG = p137n7.b.g();
            switch (this.f14496I) {
                case 0:
                    p087i7.x.b(obj);
                    org.json.JSONObject jSONObject = (org.json.JSONObject) this.f14497J;
                    java.lang.String str = "Fetched settings: " + jSONObject;
                    p247y7.O o14 = new p247y7.O();
                    o6 = new p247y7.O();
                    p247y7.O o15 = new p247y7.O();
                    if (jSONObject.has("app_quality")) {
                        java.lang.Object obj2 = jSONObject.get("app_quality");
                        p247y7.AbstractC7350t.d(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                        org.json.JSONObject jSONObject2 = (org.json.JSONObject) obj2;
                        try {
                            bool = jSONObject2.has("sessions_enabled") ? (java.lang.Boolean) jSONObject2.get("sessions_enabled") : null;
                            try {
                                if (jSONObject2.has("sampling_rate")) {
                                    o14.f57254C = (java.lang.Double) jSONObject2.get("sampling_rate");
                                }
                                if (jSONObject2.has("session_timeout_seconds")) {
                                    o6.f57254C = (java.lang.Integer) jSONObject2.get("session_timeout_seconds");
                                }
                                if (jSONObject2.has("cache_duration")) {
                                    o15.f57254C = (java.lang.Integer) jSONObject2.get("cache_duration");
                                }
                                break;
                            } catch (org.json.JSONException e6) {
                            }
                        } catch (org.json.JSONException e10) {
                            bool = null;
                        }
                        break;
                    } else {
                        bool = null;
                    }
                    if (bool != null) {
                        U5.g gVarF6 = U5.c.this.f();
                        this.f14497J = o14;
                        this.f14494G = o6;
                        this.f14495H = o15;
                        this.f14496I = 1;
                        if (gVarF6.n(bool, this) == objG) {
                            return objG;
                        }
                        o12 = o14;
                        o13 = o6;
                        o11 = o15;
                        o6 = o13;
                        o10 = o12;
                    } else {
                        o10 = o14;
                        o11 = o15;
                    }
                    if (((java.lang.Integer) o6.f57254C) != null) {
                        gVarF = U5.c.this.f();
                        num = (java.lang.Integer) o6.f57254C;
                        this.f14497J = o10;
                        this.f14494G = o11;
                        this.f14495H = null;
                        this.f14496I = 2;
                        if (gVarF.m(num, this) == objG) {
                            return objG;
                        }
                    }
                    if (((java.lang.Double) o10.f57254C) != null) {
                        gVarF2 = U5.c.this.f();
                        d6 = (java.lang.Double) o10.f57254C;
                        this.f14497J = o11;
                        this.f14494G = null;
                        this.f14495H = null;
                        this.f14496I = 3;
                        if (gVarF2.i(d6, this) == objG) {
                            return objG;
                        }
                    }
                    if (((java.lang.Integer) o11.f57254C) != null) {
                        gVarF3 = U5.c.this.f();
                        num2 = (java.lang.Integer) o11.f57254C;
                        this.f14497J = null;
                        this.f14494G = null;
                        this.f14495H = null;
                        this.f14496I = 4;
                        if (gVarF3.j(num2, this) == objG) {
                            return objG;
                        }
                        m6 = p087i7.M.f46721a;
                    } else {
                        m6 = null;
                    }
                    if (m6 == null) {
                        gVarF4 = U5.c.this.f();
                        numC = p147o7.b.c(86400);
                        this.f14497J = null;
                        this.f14494G = null;
                        this.f14495H = null;
                        this.f14496I = 5;
                        if (gVarF4.j(numC, this) == objG) {
                            return objG;
                        }
                    }
                    gVarF5 = U5.c.this.f();
                    lD = p147o7.b.d(java.lang.System.currentTimeMillis());
                    this.f14497J = null;
                    this.f14494G = null;
                    this.f14495H = null;
                    this.f14496I = 6;
                    if (gVarF5.k(lD, this) == objG) {
                        return objG;
                    }
                    return p087i7.M.f46721a;
                case 1:
                    o11 = (p247y7.O) this.f14495H;
                    o13 = (p247y7.O) this.f14494G;
                    o12 = (p247y7.O) this.f14497J;
                    p087i7.x.b(obj);
                    o6 = o13;
                    o10 = o12;
                    if (((java.lang.Integer) o6.f57254C) != null) {
                        gVarF = U5.c.this.f();
                        num = (java.lang.Integer) o6.f57254C;
                        this.f14497J = o10;
                        this.f14494G = o11;
                        this.f14495H = null;
                        this.f14496I = 2;
                        if (gVarF.m(num, this) == objG) {
                            return objG;
                        }
                    }
                    if (((java.lang.Double) o10.f57254C) != null) {
                        gVarF2 = U5.c.this.f();
                        d6 = (java.lang.Double) o10.f57254C;
                        this.f14497J = o11;
                        this.f14494G = null;
                        this.f14495H = null;
                        this.f14496I = 3;
                        if (gVarF2.i(d6, this) == objG) {
                            return objG;
                        }
                    }
                    if (((java.lang.Integer) o11.f57254C) != null) {
                        gVarF3 = U5.c.this.f();
                        num2 = (java.lang.Integer) o11.f57254C;
                        this.f14497J = null;
                        this.f14494G = null;
                        this.f14495H = null;
                        this.f14496I = 4;
                        if (gVarF3.j(num2, this) == objG) {
                            return objG;
                        }
                        m6 = p087i7.M.f46721a;
                    } else {
                        m6 = null;
                    }
                    if (m6 == null) {
                        gVarF4 = U5.c.this.f();
                        numC = p147o7.b.c(86400);
                        this.f14497J = null;
                        this.f14494G = null;
                        this.f14495H = null;
                        this.f14496I = 5;
                        if (gVarF4.j(numC, this) == objG) {
                            return objG;
                        }
                    }
                    gVarF5 = U5.c.this.f();
                    lD = p147o7.b.d(java.lang.System.currentTimeMillis());
                    this.f14497J = null;
                    this.f14494G = null;
                    this.f14495H = null;
                    this.f14496I = 6;
                    if (gVarF5.k(lD, this) == objG) {
                        return objG;
                    }
                    return p087i7.M.f46721a;
                case 2:
                    o11 = (p247y7.O) this.f14494G;
                    o10 = (p247y7.O) this.f14497J;
                    p087i7.x.b(obj);
                    if (((java.lang.Double) o10.f57254C) != null) {
                        gVarF2 = U5.c.this.f();
                        d6 = (java.lang.Double) o10.f57254C;
                        this.f14497J = o11;
                        this.f14494G = null;
                        this.f14495H = null;
                        this.f14496I = 3;
                        if (gVarF2.i(d6, this) == objG) {
                            return objG;
                        }
                    }
                    if (((java.lang.Integer) o11.f57254C) != null) {
                        gVarF3 = U5.c.this.f();
                        num2 = (java.lang.Integer) o11.f57254C;
                        this.f14497J = null;
                        this.f14494G = null;
                        this.f14495H = null;
                        this.f14496I = 4;
                        if (gVarF3.j(num2, this) == objG) {
                            return objG;
                        }
                        m6 = p087i7.M.f46721a;
                    } else {
                        m6 = null;
                    }
                    if (m6 == null) {
                        gVarF4 = U5.c.this.f();
                        numC = p147o7.b.c(86400);
                        this.f14497J = null;
                        this.f14494G = null;
                        this.f14495H = null;
                        this.f14496I = 5;
                        if (gVarF4.j(numC, this) == objG) {
                            return objG;
                        }
                    }
                    gVarF5 = U5.c.this.f();
                    lD = p147o7.b.d(java.lang.System.currentTimeMillis());
                    this.f14497J = null;
                    this.f14494G = null;
                    this.f14495H = null;
                    this.f14496I = 6;
                    if (gVarF5.k(lD, this) == objG) {
                        return objG;
                    }
                    return p087i7.M.f46721a;
                case 3:
                    o11 = (p247y7.O) this.f14497J;
                    p087i7.x.b(obj);
                    if (((java.lang.Integer) o11.f57254C) != null) {
                        gVarF3 = U5.c.this.f();
                        num2 = (java.lang.Integer) o11.f57254C;
                        this.f14497J = null;
                        this.f14494G = null;
                        this.f14495H = null;
                        this.f14496I = 4;
                        if (gVarF3.j(num2, this) == objG) {
                            return objG;
                        }
                        m6 = p087i7.M.f46721a;
                    } else {
                        m6 = null;
                    }
                    if (m6 == null) {
                        gVarF4 = U5.c.this.f();
                        numC = p147o7.b.c(86400);
                        this.f14497J = null;
                        this.f14494G = null;
                        this.f14495H = null;
                        this.f14496I = 5;
                        if (gVarF4.j(numC, this) == objG) {
                            return objG;
                        }
                    }
                    gVarF5 = U5.c.this.f();
                    lD = p147o7.b.d(java.lang.System.currentTimeMillis());
                    this.f14497J = null;
                    this.f14494G = null;
                    this.f14495H = null;
                    this.f14496I = 6;
                    if (gVarF5.k(lD, this) == objG) {
                        return objG;
                    }
                    return p087i7.M.f46721a;
                case 4:
                    p087i7.x.b(obj);
                    m6 = p087i7.M.f46721a;
                    if (m6 == null) {
                        gVarF4 = U5.c.this.f();
                        numC = p147o7.b.c(86400);
                        this.f14497J = null;
                        this.f14494G = null;
                        this.f14495H = null;
                        this.f14496I = 5;
                        if (gVarF4.j(numC, this) == objG) {
                            return objG;
                        }
                    }
                    gVarF5 = U5.c.this.f();
                    lD = p147o7.b.d(java.lang.System.currentTimeMillis());
                    this.f14497J = null;
                    this.f14494G = null;
                    this.f14495H = null;
                    this.f14496I = 6;
                    if (gVarF5.k(lD, this) == objG) {
                        return objG;
                    }
                    return p087i7.M.f46721a;
                case 5:
                    p087i7.x.b(obj);
                    gVarF5 = U5.c.this.f();
                    lD = p147o7.b.d(java.lang.System.currentTimeMillis());
                    this.f14497J = null;
                    this.f14494G = null;
                    this.f14495H = null;
                    this.f14496I = 6;
                    if (gVarF5.k(lD, this) == objG) {
                        return objG;
                    }
                    return p087i7.M.f46721a;
                case 6:
                    p087i7.x.b(obj);
                    return p087i7.M.f46721a;
                default:
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(org.json.JSONObject jSONObject, p127m7.e eVar) {
            return ((U5.c.d) x(jSONObject, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            U5.c.d dVar = U5.c.this.new d(eVar);
            dVar.f14497J = obj;
            return dVar;
        }
    }

    static final class e extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f14499G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f14500H;

        e(p127m7.e eVar) {
            super(2, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            p137n7.b.g();
            if (this.f14499G != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p087i7.x.b(obj);
            java.lang.String str = "Error failing to fetch the remote configs: " + ((java.lang.String) this.f14500H);
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(java.lang.String str, p127m7.e eVar) {
            return ((U5.c.e) x(str, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            U5.c.e eVar2 = new U5.c.e(eVar);
            eVar2.f14500H = obj;
            return eVar2;
        }
    }

    public c(p127m7.i iVar, G5.e eVar, S5.C1619b c1619b, U5.a aVar, M1.h hVar) {
        p247y7.AbstractC7350t.f(iVar, "backgroundDispatcher");
        p247y7.AbstractC7350t.f(eVar, "firebaseInstallationsApi");
        p247y7.AbstractC7350t.f(c1619b, "appInfo");
        p247y7.AbstractC7350t.f(aVar, "configsFetcher");
        p247y7.AbstractC7350t.f(hVar, "dataStore");
        this.f14482a = iVar;
        this.f14483b = eVar;
        this.f14484c = c1619b;
        this.f14485d = aVar;
        this.f14486e = p087i7.AbstractC6669o.b(new U5.c.b(hVar));
        this.f14487f = p059f9.g.b(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final U5.g f() {
        return (U5.g) this.f14486e.getValue();
    }

    private final java.lang.String g(java.lang.String str) {
        return new S8.o("/").e(str, "");
    }

    @Override // U5.h
    public java.lang.Boolean a() {
        return f().g();
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00bf A[Catch: all -> 0x0055, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0055, blocks: (B:21:0x0051, B:46:0x00bf, B:38:0x0097), top: B:62:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00c8 A[Catch: all -> 0x015c, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x015c, blocks: (B:44:0x00b1, B:49:0x00c8, B:36:0x008d, B:41:0x00a0), top: B:65:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:51:0x014f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x0150  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12, types: [f9.a] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [f9.a] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [f9.a] */
    /* JADX WARN: Type inference failed for: r8v0, types: [int] */
    @Override // U5.h
    public java.lang.Object b(p127m7.e eVar) throws java.lang.Throwable {
        U5.c.C0281c c0281c;
        ?? r6;
        java.lang.Object obj;
        ?? r10;
        p059f9.a aVar;
        U5.c cVar;
        ?? r11;
        java.lang.String strB;
        java.util.Map mapK;
        U5.a aVar2;
        U5.c.d dVar;
        java.lang.Object obj2;
        U5.c.e eVar2;
        if (eVar instanceof U5.c.C0281c) {
            c0281c = (U5.c.C0281c) eVar;
            int i6 = c0281c.f14493J;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c0281c.f14493J = i6 - Integer.MIN_VALUE;
            } else {
                c0281c = new U5.c.C0281c(eVar);
            }
        } else {
            c0281c = new U5.c.C0281c(eVar);
        }
        java.lang.Object objA = c0281c.f14491H;
        java.lang.Object objG = p137n7.b.g();
        ?? r12 = c0281c.f14493J;
        try {
            try {
                if (r12 != 0) {
                    if (r12 == 1) {
                        aVar = (p059f9.a) c0281c.f14490G;
                        cVar = (U5.c) c0281c.f14489F;
                        p087i7.x.b(objA);
                    } else if (r12 == 2) {
                        aVar = (p059f9.a) c0281c.f14490G;
                        cVar = (U5.c) c0281c.f14489F;
                        p087i7.x.b(objA);
                        strB = ((S5.s) objA).b();
                        if (p247y7.AbstractC7350t.b(strB, "")) {
                            p087i7.M m6 = p087i7.M.f46721a;
                            aVar.d(null);
                            return m6;
                        }
                        p087i7.u uVarA = p087i7.B.a("X-Crashlytics-Installation-ID", strB);
                        p247y7.V v6 = p247y7.V.f57259a;
                        java.lang.String str = java.lang.String.format("%s/%s", java.util.Arrays.copyOf(new java.lang.Object[]{android.os.Build.MANUFACTURER, android.os.Build.MODEL}, 2));
                        p247y7.AbstractC7350t.e(str, "format(format, *args)");
                        p087i7.u uVarA2 = p087i7.B.a("X-Crashlytics-Device-Model", cVar.g(str));
                        java.lang.String str2 = android.os.Build.VERSION.INCREMENTAL;
                        p247y7.AbstractC7350t.e(str2, "INCREMENTAL");
                        p087i7.u uVarA3 = p087i7.B.a("X-Crashlytics-OS-Build-Version", cVar.g(str2));
                        java.lang.String str3 = android.os.Build.VERSION.RELEASE;
                        p247y7.AbstractC7350t.e(str3, "RELEASE");
                        mapK = p097j7.S.k(uVarA, uVarA2, uVarA3, p087i7.B.a("X-Crashlytics-OS-Display-Version", cVar.g(str3)), p087i7.B.a("X-Crashlytics-API-Client-Version", cVar.f14484c.f()));
                        aVar2 = cVar.f14485d;
                        obj2 = null;
                        dVar = cVar.new d(null);
                        eVar2 = new U5.c.e(null);
                        c0281c.f14489F = aVar;
                        c0281c.f14490G = null;
                        c0281c.f14493J = 3;
                        if (aVar2.a(mapK, dVar, eVar2, c0281c) == objG) {
                            return objG;
                        }
                        r11 = aVar;
                    } else {
                        if (r12 != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r6 = (p059f9.a) c0281c.f14489F;
                        try {
                            p087i7.x.b(objA);
                            obj2 = null;
                            r11 = r6;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            obj = null;
                            r10 = r6;
                            r10.d(obj);
                            throw th;
                        }
                    }
                    try {
                        p087i7.M m10 = p087i7.M.f46721a;
                        r11.d(obj2);
                        return p087i7.M.f46721a;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        obj = null;
                        r10 = r11;
                        r10.d(obj);
                        throw th;
                    }
                }
                p087i7.x.b(objA);
                if (!this.f14487f.b() && !f().d()) {
                    return p087i7.M.f46721a;
                }
                p059f9.a aVar3 = this.f14487f;
                c0281c.f14489F = this;
                c0281c.f14490G = aVar3;
                c0281c.f14493J = 1;
                if (aVar3.c(null, c0281c) == objG) {
                    return objG;
                }
                aVar = aVar3;
                cVar = this;
                if (!cVar.f().d()) {
                    p087i7.M m11 = p087i7.M.f46721a;
                    aVar.d(null);
                    return m11;
                }
                S5.s.a aVar4 = S5.s.f12555c;
                G5.e eVar3 = cVar.f14483b;
                c0281c.f14489F = cVar;
                c0281c.f14490G = aVar;
                c0281c.f14493J = 2;
                objA = aVar4.a(eVar3, c0281c);
                if (objA == objG) {
                    return objG;
                }
                strB = ((S5.s) objA).b();
                if (p247y7.AbstractC7350t.b(strB, "")) {
                    p087i7.M m12 = p087i7.M.f46721a;
                    aVar.d(null);
                    return m12;
                }
                p087i7.u uVarA4 = p087i7.B.a("X-Crashlytics-Installation-ID", strB);
                p247y7.V v10 = p247y7.V.f57259a;
                java.lang.String str4 = java.lang.String.format("%s/%s", java.util.Arrays.copyOf(new java.lang.Object[]{android.os.Build.MANUFACTURER, android.os.Build.MODEL}, 2));
                p247y7.AbstractC7350t.e(str4, "format(format, *args)");
                p087i7.u uVarA5 = p087i7.B.a("X-Crashlytics-Device-Model", cVar.g(str4));
                java.lang.String str5 = android.os.Build.VERSION.INCREMENTAL;
                p247y7.AbstractC7350t.e(str5, "INCREMENTAL");
                p087i7.u uVarA6 = p087i7.B.a("X-Crashlytics-OS-Build-Version", cVar.g(str5));
                java.lang.String str6 = android.os.Build.VERSION.RELEASE;
                p247y7.AbstractC7350t.e(str6, "RELEASE");
                mapK = p097j7.S.k(uVarA4, uVarA5, uVarA6, p087i7.B.a("X-Crashlytics-OS-Display-Version", cVar.g(str6)), p087i7.B.a("X-Crashlytics-API-Client-Version", cVar.f14484c.f()));
                aVar2 = cVar.f14485d;
                obj2 = null;
                dVar = cVar.new d(null);
                eVar2 = new U5.c.e(null);
                c0281c.f14489F = aVar;
                c0281c.f14490G = null;
                c0281c.f14493J = 3;
                if (aVar2.a(mapK, dVar, eVar2, c0281c) == objG) {
                    return objG;
                }
                r11 = aVar;
                p087i7.M m13 = p087i7.M.f46721a;
                r11.d(obj2);
                return p087i7.M.f46721a;
            } catch (java.lang.Throwable th3) {
                th = th3;
                r11 = aVar;
                obj = null;
                r10 = r11;
                r10.d(obj);
                throw th;
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
            r6 = r12;
        }
    }

    @Override // U5.h
    public T8.a c() {
        java.lang.Integer numE = f().e();
        if (numE == null) {
            return null;
        }
        T8.a.C0279a c0279a = T8.a.f13312D;
        return T8.a.o(T8.c.s(numE.intValue(), T8.d.SECONDS));
    }

    @Override // U5.h
    public java.lang.Double d() {
        return f().f();
    }
}
