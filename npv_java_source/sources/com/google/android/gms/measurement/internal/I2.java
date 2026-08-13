package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class I2 extends com.google.android.gms.measurement.internal.E5 implements com.google.android.gms.measurement.internal.InterfaceC6390i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.Map f41976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.Map f41977e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.util.Map f41978f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.util.Map f41979g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.util.Map f41980h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final java.util.Map f41981i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final p170r.C7048x f41982j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final com.google.android.gms.internal.measurement.K7 f41983k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final java.util.Map f41984l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final java.util.Map f41985m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final java.util.Map f41986n;

    I2(com.google.android.gms.measurement.internal.H5 h6) {
        super(h6);
        this.f41976d = new p170r.C7026a();
        this.f41977e = new p170r.C7026a();
        this.f41978f = new p170r.C7026a();
        this.f41979g = new p170r.C7026a();
        this.f41980h = new p170r.C7026a();
        this.f41984l = new p170r.C7026a();
        this.f41985m = new p170r.C7026a();
        this.f41986n = new p170r.C7026a();
        this.f41981i = new p170r.C7026a();
        this.f41982j = new com.google.android.gms.measurement.internal.K2(this, 20);
        this.f41983k = new com.google.android.gms.measurement.internal.N2(this);
    }

    private final com.google.android.gms.internal.measurement.U1 A(java.lang.String str, byte[] bArr) {
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.U1.N();
        }
        try {
            com.google.android.gms.internal.measurement.U1 u6 = (com.google.android.gms.internal.measurement.U1) ((com.google.android.gms.internal.measurement.AbstractC6130t4) ((com.google.android.gms.internal.measurement.U1.a) com.google.android.gms.measurement.internal.Z5.G(com.google.android.gms.internal.measurement.U1.L(), bArr)).q());
            j().K().c("Parsed config. version, gmp_app_id", u6.Y() ? java.lang.Long.valueOf(u6.J()) : null, u6.W() ? u6.P() : null);
            return u6;
        } catch (com.google.android.gms.internal.measurement.C4 e6) {
            e = e6;
            j().L().c("Unable to merge remote config. appId", com.google.android.gms.measurement.internal.C6428n2.v(str), e);
            return com.google.android.gms.internal.measurement.U1.N();
        } catch (java.lang.RuntimeException e10) {
            e = e10;
            j().L().c("Unable to merge remote config. appId", com.google.android.gms.measurement.internal.C6428n2.v(str), e);
            return com.google.android.gms.internal.measurement.U1.N();
        }
    }

    private static com.google.android.gms.measurement.internal.A3.a B(com.google.android.gms.internal.measurement.R1.e eVar) {
        int i6 = com.google.android.gms.measurement.internal.O2.f42069b[eVar.ordinal()];
        if (i6 == 1) {
            return com.google.android.gms.measurement.internal.A3.a.AD_STORAGE;
        }
        if (i6 == 2) {
            return com.google.android.gms.measurement.internal.A3.a.ANALYTICS_STORAGE;
        }
        if (i6 == 3) {
            return com.google.android.gms.measurement.internal.A3.a.AD_USER_DATA;
        }
        if (i6 != 4) {
            return null;
        }
        return com.google.android.gms.measurement.internal.A3.a.AD_PERSONALIZATION;
    }

    private static java.util.Map D(com.google.android.gms.internal.measurement.U1 u6) {
        p170r.C7026a c7026a = new p170r.C7026a();
        if (u6 != null) {
            for (com.google.android.gms.internal.measurement.Y1 y6 : u6.U()) {
                c7026a.put(y6.G(), y6.H());
            }
        }
        return c7026a;
    }

    private final void F(java.lang.String str, com.google.android.gms.internal.measurement.U1.a aVar) {
        java.util.HashSet hashSet = new java.util.HashSet();
        p170r.C7026a c7026a = new p170r.C7026a();
        p170r.C7026a c7026a2 = new p170r.C7026a();
        p170r.C7026a c7026a3 = new p170r.C7026a();
        if (aVar != null) {
            java.util.Iterator it = aVar.B().iterator();
            while (it.hasNext()) {
                hashSet.add(((com.google.android.gms.internal.measurement.S1) it.next()).G());
            }
            for (int i6 = 0; i6 < aVar.v(); i6++) {
                com.google.android.gms.internal.measurement.T1.a aVarW = (com.google.android.gms.internal.measurement.T1.a) aVar.w(i6).x();
                if (aVarW.x().isEmpty()) {
                    j().L().a("EventConfig contained null event name");
                } else {
                    java.lang.String strX = aVarW.x();
                    java.lang.String strB = p085i4.q.b(aVarW.x());
                    if (!android.text.TextUtils.isEmpty(strB)) {
                        aVarW = aVarW.w(strB);
                        aVar.x(i6, aVarW);
                    }
                    if (aVarW.A() && aVarW.y()) {
                        c7026a.put(strX, java.lang.Boolean.TRUE);
                    }
                    if (aVarW.B() && aVarW.z()) {
                        c7026a2.put(aVarW.x(), java.lang.Boolean.TRUE);
                    }
                    if (aVarW.C()) {
                        if (aVarW.v() < 2 || aVarW.v() > 65535) {
                            j().L().c("Invalid sampling rate. Event name, sample rate", aVarW.x(), java.lang.Integer.valueOf(aVarW.v()));
                        } else {
                            c7026a3.put(aVarW.x(), java.lang.Integer.valueOf(aVarW.v()));
                        }
                    }
                }
            }
        }
        this.f41977e.put(str, hashSet);
        this.f41978f.put(str, c7026a);
        this.f41979g.put(str, c7026a2);
        this.f41981i.put(str, c7026a3);
    }

    private final void G(final java.lang.String str, com.google.android.gms.internal.measurement.U1 u6) {
        if (u6.k() == 0) {
            this.f41982j.e(str);
            return;
        }
        j().K().b("EES programs found", java.lang.Integer.valueOf(u6.k()));
        com.google.android.gms.internal.measurement.C2 c6 = (com.google.android.gms.internal.measurement.C2) u6.T().get(0);
        try {
            com.google.android.gms.internal.measurement.C c10 = new com.google.android.gms.internal.measurement.C();
            c10.c("internal.remoteConfig", new java.util.concurrent.Callable() { // from class: com.google.android.gms.measurement.internal.J2
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return new com.google.android.gms.internal.measurement.C6147v5("internal.remoteConfig", new com.google.android.gms.measurement.internal.M2(this.f41998a, str));
                }
            });
            c10.c("internal.appMetadata", new java.util.concurrent.Callable() { // from class: i4.m
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    final com.google.android.gms.measurement.internal.I2 i6 = this.f46668a;
                    final java.lang.String str2 = str;
                    return new com.google.android.gms.internal.measurement.M7("internal.appMetadata", new java.util.concurrent.Callable() { // from class: com.google.android.gms.measurement.internal.H2
                        @Override // java.util.concurrent.Callable
                        public final java.lang.Object call() {
                            com.google.android.gms.measurement.internal.I2 i10 = i6;
                            java.lang.String str3 = str2;
                            com.google.android.gms.measurement.internal.C6351c2 c6351c2M0 = i10.q().M0(str3);
                            java.util.HashMap map = new java.util.HashMap();
                            map.put("platform", "android");
                            map.put("package_name", str3);
                            map.put("gmp_version", 106000L);
                            if (c6351c2M0 != null) {
                                java.lang.String strO = c6351c2M0.o();
                                if (strO != null) {
                                    map.put("app_version", strO);
                                }
                                map.put("app_version_int", java.lang.Long.valueOf(c6351c2M0.U()));
                                map.put("dynamite_version", java.lang.Long.valueOf(c6351c2M0.v0()));
                            }
                            return map;
                        }
                    });
                }
            });
            c10.c("internal.logger", new java.util.concurrent.Callable() { // from class: com.google.android.gms.measurement.internal.L2
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return new com.google.android.gms.internal.measurement.G7(this.f42017a.f41983k);
                }
            });
            c10.b(c6);
            this.f41982j.d(str, c10);
            j().K().c("EES program loaded for appId, activities", str, java.lang.Integer.valueOf(c6.F().k()));
            java.util.Iterator it = c6.F().H().iterator();
            while (it.hasNext()) {
                j().K().b("EES program activity", ((com.google.android.gms.internal.measurement.B2) it.next()).G());
            }
        } catch (com.google.android.gms.internal.measurement.C5996e0 unused) {
            j().G().b("Failed to load EES program. appId", str);
        }
    }

    private final void g0(java.lang.String str) {
        u();
        n();
        Q3.AbstractC1477p.f(str);
        if (this.f41980h.get(str) == null) {
            com.google.android.gms.measurement.internal.C6411l c6411lO0 = q().O0(str);
            if (c6411lO0 != null) {
                com.google.android.gms.internal.measurement.U1.a aVar = (com.google.android.gms.internal.measurement.U1.a) A(str, c6411lO0.f42497a).x();
                F(str, aVar);
                this.f41976d.put(str, D((com.google.android.gms.internal.measurement.U1) ((com.google.android.gms.internal.measurement.AbstractC6130t4) aVar.q())));
                this.f41980h.put(str, (com.google.android.gms.internal.measurement.U1) ((com.google.android.gms.internal.measurement.AbstractC6130t4) aVar.q()));
                G(str, (com.google.android.gms.internal.measurement.U1) ((com.google.android.gms.internal.measurement.AbstractC6130t4) aVar.q()));
                this.f41984l.put(str, aVar.z());
                this.f41985m.put(str, c6411lO0.f42498b);
                this.f41986n.put(str, c6411lO0.f42499c);
                return;
            }
            this.f41976d.put(str, null);
            this.f41978f.put(str, null);
            this.f41977e.put(str, null);
            this.f41979g.put(str, null);
            this.f41980h.put(str, null);
            this.f41984l.put(str, null);
            this.f41985m.put(str, null);
            this.f41986n.put(str, null);
            this.f41981i.put(str, null);
        }
    }

    static /* synthetic */ com.google.android.gms.internal.measurement.C z(com.google.android.gms.measurement.internal.I2 i6, java.lang.String str) {
        i6.u();
        Q3.AbstractC1477p.f(str);
        if (!i6.W(str)) {
            return null;
        }
        if (!i6.f41980h.containsKey(str) || i6.f41980h.get(str) == null) {
            i6.g0(str);
        } else {
            i6.G(str, (com.google.android.gms.internal.measurement.U1) i6.f41980h.get(str));
        }
        return (com.google.android.gms.internal.measurement.C) i6.f41982j.h().get(str);
    }

    final p085i4.p C(java.lang.String str, com.google.android.gms.measurement.internal.A3.a aVar) {
        n();
        g0(str);
        com.google.android.gms.internal.measurement.R1 r1J = J(str);
        if (r1J == null) {
            return p085i4.p.UNINITIALIZED;
        }
        for (com.google.android.gms.internal.measurement.R1.a aVar2 : r1J.K()) {
            if (B(aVar2.H()) == aVar) {
                int i6 = com.google.android.gms.measurement.internal.O2.f42070c[aVar2.G().ordinal()];
                if (i6 != 1) {
                    return i6 != 2 ? p085i4.p.UNINITIALIZED : p085i4.p.GRANTED;
                }
                return p085i4.p.DENIED;
            }
        }
        return p085i4.p.UNINITIALIZED;
    }

    protected final boolean H(java.lang.String str, byte[] bArr, java.lang.String str2, java.lang.String str3) {
        u();
        n();
        Q3.AbstractC1477p.f(str);
        com.google.android.gms.internal.measurement.U1.a aVar = (com.google.android.gms.internal.measurement.U1.a) A(str, bArr).x();
        if (aVar == null) {
            return false;
        }
        F(str, aVar);
        G(str, (com.google.android.gms.internal.measurement.U1) ((com.google.android.gms.internal.measurement.AbstractC6130t4) aVar.q()));
        this.f41980h.put(str, (com.google.android.gms.internal.measurement.U1) ((com.google.android.gms.internal.measurement.AbstractC6130t4) aVar.q()));
        this.f41984l.put(str, aVar.z());
        this.f41985m.put(str, str2);
        this.f41986n.put(str, str3);
        this.f41976d.put(str, D((com.google.android.gms.internal.measurement.U1) ((com.google.android.gms.internal.measurement.AbstractC6130t4) aVar.q())));
        q().c0(str, new java.util.ArrayList(aVar.A()));
        try {
            aVar.y();
            bArr = ((com.google.android.gms.internal.measurement.U1) ((com.google.android.gms.internal.measurement.AbstractC6130t4) aVar.q())).j();
        } catch (java.lang.RuntimeException e6) {
            j().L().c("Unable to serialize reduced-size config. Storing full config instead. appId", com.google.android.gms.measurement.internal.C6428n2.v(str), e6);
        }
        com.google.android.gms.measurement.internal.C6404k c6404kQ = q();
        Q3.AbstractC1477p.f(str);
        c6404kQ.n();
        c6404kQ.u();
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (c6404kQ.B().update("apps", contentValues, "app_id = ?", new java.lang.String[]{str}) == 0) {
                c6404kQ.j().G().b("Failed to update remote config (got 0). appId", com.google.android.gms.measurement.internal.C6428n2.v(str));
            }
        } catch (android.database.sqlite.SQLiteException e10) {
            c6404kQ.j().G().c("Error storing remote config. appId", com.google.android.gms.measurement.internal.C6428n2.v(str), e10);
        }
        this.f41980h.put(str, (com.google.android.gms.internal.measurement.U1) ((com.google.android.gms.internal.measurement.AbstractC6130t4) aVar.q()));
        return true;
    }

    final int I(java.lang.String str, java.lang.String str2) {
        java.lang.Integer num;
        n();
        g0(str);
        java.util.Map map = (java.util.Map) this.f41981i.get(str);
        if (map == null || (num = (java.lang.Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    final com.google.android.gms.internal.measurement.R1 J(java.lang.String str) {
        n();
        g0(str);
        com.google.android.gms.internal.measurement.U1 u1L = L(str);
        if (u1L == null || !u1L.V()) {
            return null;
        }
        return u1L.K();
    }

    final com.google.android.gms.measurement.internal.A3.a K(java.lang.String str, com.google.android.gms.measurement.internal.A3.a aVar) {
        n();
        g0(str);
        com.google.android.gms.internal.measurement.R1 r1J = J(str);
        if (r1J == null) {
            return null;
        }
        for (com.google.android.gms.internal.measurement.R1.c cVar : r1J.J()) {
            if (aVar == B(cVar.H())) {
                return B(cVar.G());
            }
        }
        return null;
    }

    protected final com.google.android.gms.internal.measurement.U1 L(java.lang.String str) {
        u();
        n();
        Q3.AbstractC1477p.f(str);
        g0(str);
        return (com.google.android.gms.internal.measurement.U1) this.f41980h.get(str);
    }

    final boolean M(java.lang.String str, com.google.android.gms.measurement.internal.A3.a aVar) {
        n();
        g0(str);
        com.google.android.gms.internal.measurement.R1 r1J = J(str);
        if (r1J == null) {
            return false;
        }
        for (com.google.android.gms.internal.measurement.R1.a aVar2 : r1J.I()) {
            if (aVar == B(aVar2.H())) {
                if (aVar2.G() == com.google.android.gms.internal.measurement.R1.d.GRANTED) {
                    return true;
                }
            }
        }
        return false;
    }

    final boolean N(java.lang.String str, java.lang.String str2) {
        java.lang.Boolean bool;
        n();
        g0(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        java.util.Map map = (java.util.Map) this.f41979g.get(str);
        if (map == null || (bool = (java.lang.Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    protected final java.lang.String O(java.lang.String str) {
        n();
        return (java.lang.String) this.f41986n.get(str);
    }

    final boolean P(java.lang.String str, java.lang.String str2) {
        java.lang.Boolean bool;
        n();
        g0(str);
        if (X(str) && com.google.android.gms.measurement.internal.d6.J0(str2)) {
            return true;
        }
        if (Z(str) && com.google.android.gms.measurement.internal.d6.K0(str2)) {
            return true;
        }
        java.util.Map map = (java.util.Map) this.f41978f.get(str);
        if (map == null || (bool = (java.lang.Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    protected final java.lang.String Q(java.lang.String str) {
        n();
        return (java.lang.String) this.f41985m.get(str);
    }

    final java.lang.String R(java.lang.String str) {
        n();
        g0(str);
        return (java.lang.String) this.f41984l.get(str);
    }

    final java.util.Set S(java.lang.String str) {
        n();
        g0(str);
        return (java.util.Set) this.f41977e.get(str);
    }

    final java.util.SortedSet T(java.lang.String str) {
        n();
        g0(str);
        java.util.TreeSet treeSet = new java.util.TreeSet();
        com.google.android.gms.internal.measurement.R1 r1J = J(str);
        if (r1J == null) {
            return treeSet;
        }
        java.util.Iterator it = r1J.H().iterator();
        while (it.hasNext()) {
            treeSet.add(((com.google.android.gms.internal.measurement.R1.f) it.next()).G());
        }
        return treeSet;
    }

    protected final void U(java.lang.String str) {
        n();
        this.f41985m.put(str, null);
    }

    final void V(java.lang.String str) {
        n();
        this.f41980h.remove(str);
    }

    public final boolean W(java.lang.String str) {
        com.google.android.gms.internal.measurement.U1 u6;
        return (android.text.TextUtils.isEmpty(str) || (u6 = (com.google.android.gms.internal.measurement.U1) this.f41980h.get(str)) == null || u6.k() == 0) ? false : true;
    }

    final boolean X(java.lang.String str) {
        return "1".equals(c(str, "measurement.upload.blacklist_internal"));
    }

    final boolean Y(java.lang.String str) {
        n();
        g0(str);
        com.google.android.gms.internal.measurement.R1 r1J = J(str);
        return r1J == null || !r1J.M() || r1J.L();
    }

    final boolean Z(java.lang.String str) {
        return "1".equals(c(str, "measurement.upload.blacklist_public"));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ android.content.Context a() {
        return super.a();
    }

    final boolean a0(java.lang.String str) {
        n();
        g0(str);
        return this.f41977e.get(str) != null && ((java.util.Set) this.f41977e.get(str)).contains("app_instance_id");
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ V3.f b() {
        return super.b();
    }

    final boolean b0(java.lang.String str) {
        n();
        g0(str);
        if (this.f41977e.get(str) != null) {
            return ((java.util.Set) this.f41977e.get(str)).contains("device_model") || ((java.util.Set) this.f41977e.get(str)).contains("device_info");
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC6390i
    public final java.lang.String c(java.lang.String str, java.lang.String str2) {
        n();
        g0(str);
        java.util.Map map = (java.util.Map) this.f41976d.get(str);
        if (map != null) {
            return (java.lang.String) map.get(str2);
        }
        return null;
    }

    final boolean c0(java.lang.String str) {
        n();
        g0(str);
        return this.f41977e.get(str) != null && ((java.util.Set) this.f41977e.get(str)).contains("enhanced_user_id");
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6376g d() {
        return super.d();
    }

    final boolean d0(java.lang.String str) {
        n();
        g0(str);
        return this.f41977e.get(str) != null && ((java.util.Set) this.f41977e.get(str)).contains("google_signals");
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6494x e() {
        return super.e();
    }

    final boolean e0(java.lang.String str) {
        n();
        g0(str);
        if (this.f41977e.get(str) != null) {
            return ((java.util.Set) this.f41977e.get(str)).contains("os_version") || ((java.util.Set) this.f41977e.get(str)).contains("device_info");
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6348c f() {
        return super.f();
    }

    final boolean f0(java.lang.String str) {
        n();
        g0(str);
        return this.f41977e.get(str) != null && ((java.util.Set) this.f41977e.get(str)).contains("user_id");
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6386h2 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6511z2 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.d6 i() {
        return super.i();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6428n2 j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.P2 l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.Z5 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.h6 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6404k q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.I2 r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6403j5 s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.G5 t() {
        return super.t();
    }

    @Override // com.google.android.gms.measurement.internal.E5
    protected final boolean x() {
        return false;
    }

    final long y(java.lang.String str) {
        java.lang.String strC = c(str, "measurement.account.time_zone_offset_minutes");
        if (android.text.TextUtils.isEmpty(strC)) {
            return 0L;
        }
        try {
            return java.lang.Long.parseLong(strC);
        } catch (java.lang.NumberFormatException e6) {
            j().L().c("Unable to parse timezone offset. appId", com.google.android.gms.measurement.internal.C6428n2.v(str), e6);
            return 0L;
        }
    }
}
