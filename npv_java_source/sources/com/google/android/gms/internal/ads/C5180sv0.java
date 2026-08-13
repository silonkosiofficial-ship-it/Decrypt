package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5180sv0 implements com.google.android.gms.internal.ads.Yw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC5070rv0 f38822a;

    private C5180sv0(com.google.android.gms.internal.ads.AbstractC5070rv0 abstractC5070rv0) {
        com.google.android.gms.internal.ads.Tv0.c(abstractC5070rv0, "output");
        this.f38822a = abstractC5070rv0;
        abstractC5070rv0.f38576a = this;
    }

    public static com.google.android.gms.internal.ads.C5180sv0 a(com.google.android.gms.internal.ads.AbstractC5070rv0 abstractC5070rv0) {
        com.google.android.gms.internal.ads.C5180sv0 c5180sv0 = abstractC5070rv0.f38576a;
        return c5180sv0 != null ? c5180sv0 : new com.google.android.gms.internal.ads.C5180sv0(abstractC5070rv0);
    }

    @Override // com.google.android.gms.internal.ads.Yw0
    public final void A(int i6, int i10) {
        this.f38822a.o(i6, i10);
    }

    @Override // com.google.android.gms.internal.ads.Yw0
    public final void B(int i6, java.util.List list, boolean z6) {
        int i10 = 0;
        if (!(list instanceof com.google.android.gms.internal.ads.C3317bw0)) {
            if (!z6) {
                while (i10 < list.size()) {
                    com.google.android.gms.internal.ads.AbstractC5070rv0 abstractC5070rv0 = this.f38822a;
                    long jLongValue = ((java.lang.Long) list.get(i10)).longValue();
                    abstractC5070rv0.z(i6, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i10++;
                }
                return;
            }
            this.f38822a.w(i6, 2);
            int iF = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                long jLongValue2 = ((java.lang.Long) list.get(i11)).longValue();
                iF += com.google.android.gms.internal.ads.AbstractC5070rv0.f((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            this.f38822a.y(iF);
            while (i10 < list.size()) {
                com.google.android.gms.internal.ads.AbstractC5070rv0 abstractC5070rv1 = this.f38822a;
                long jLongValue3 = ((java.lang.Long) list.get(i10)).longValue();
                abstractC5070rv1.A((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i10++;
            }
            return;
        }
        com.google.android.gms.internal.ads.C3317bw0 c3317bw0 = (com.google.android.gms.internal.ads.C3317bw0) list;
        if (!z6) {
            while (i10 < c3317bw0.size()) {
                com.google.android.gms.internal.ads.AbstractC5070rv0 abstractC5070rv2 = this.f38822a;
                long jE = c3317bw0.e(i10);
                abstractC5070rv2.z(i6, (jE >> 63) ^ (jE + jE));
                i10++;
            }
            return;
        }
        this.f38822a.w(i6, 2);
        int iF2 = 0;
        for (int i12 = 0; i12 < c3317bw0.size(); i12++) {
            long jE2 = c3317bw0.e(i12);
            iF2 += com.google.android.gms.internal.ads.AbstractC5070rv0.f((jE2 >> 63) ^ (jE2 + jE2));
        }
        this.f38822a.y(iF2);
        while (i10 < c3317bw0.size()) {
            com.google.android.gms.internal.ads.AbstractC5070rv0 abstractC5070rv3 = this.f38822a;
            long jE3 = c3317bw0.e(i10);
            abstractC5070rv3.A((jE3 >> 63) ^ (jE3 + jE3));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.Yw0
    public final void C(int i6, java.util.List list, boolean z6) {
        if (list instanceof com.google.android.gms.internal.ads.Cv0) {
            androidx.appcompat.app.D.a(list);
            if (!z6) {
                throw null;
            }
            this.f38822a.w(i6, 2);
            throw null;
        }
        int i10 = 0;
        if (!z6) {
            while (i10 < list.size()) {
                this.f38822a.o(i6, java.lang.Float.floatToRawIntBits(((java.lang.Float) list.get(i10)).floatValue()));
                i10++;
            }
            return;
        }
        this.f38822a.w(i6, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((java.lang.Float) list.get(i12)).floatValue();
            i11 += 4;
        }
        this.f38822a.y(i11);
        while (i10 < list.size()) {
            this.f38822a.p(java.lang.Float.floatToRawIntBits(((java.lang.Float) list.get(i10)).floatValue()));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.Yw0
    public final void D(int i6, int i10) {
        this.f38822a.x(i6, (i10 >> 31) ^ (i10 + i10));
    }

    @Override // com.google.android.gms.internal.ads.Yw0
    public final void E(int i6, long j6) {
        this.f38822a.q(i6, j6);
    }

    @Override // com.google.android.gms.internal.ads.Yw0
    public final void F(int i6, java.util.List list) {
        int i10 = 0;
        if (!(list instanceof com.google.android.gms.internal.ads.Yv0)) {
            while (i10 < list.size()) {
                this.f38822a.v(i6, (java.lang.String) list.get(i10));
                i10++;
            }
            return;
        }
        com.google.android.gms.internal.ads.Yv0 yv0 = (com.google.android.gms.internal.ads.Yv0) list;
        while (i10 < list.size()) {
            java.lang.Object objC = yv0.c();
            if (objC instanceof java.lang.String) {
                this.f38822a.v(i6, (java.lang.String) objC);
            } else {
                this.f38822a.m(i6, (com.google.android.gms.internal.ads.AbstractC3753fv0) objC);
            }
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.Yw0
    public final void G(int i6, long j6) {
        this.f38822a.z(i6, j6);
    }

    @Override // com.google.android.gms.internal.ads.Yw0
    public final void H(int i6) {
        this.f38822a.w(i6, 3);
    }

    @Override // com.google.android.gms.internal.ads.Yw0
    public final void I(int i6, java.lang.Object obj, com.google.android.gms.internal.ads.Ew0 ew0) {
        this.f38822a.u(i6, (com.google.android.gms.internal.ads.InterfaceC4523mw0) obj, ew0);
    }

    @Override // com.google.android.gms.internal.ads.Yw0
    public final void J(int i6, com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0) {
        this.f38822a.m(i6, abstractC3753fv0);
    }

    @Override // com.google.android.gms.internal.ads.Yw0
    public final void K(int i6, java.lang.Object obj, com.google.android.gms.internal.ads.Ew0 ew0) {
        com.google.android.gms.internal.ads.AbstractC5070rv0 abstractC5070rv0 = this.f38822a;
        abstractC5070rv0.w(i6, 3);
        ew0.g((com.google.android.gms.internal.ads.InterfaceC4523mw0) obj, abstractC5070rv0.f38576a);
        abstractC5070rv0.w(i6, 4);
    }

    @Override // com.google.android.gms.internal.ads.Yw0
    public final void L(int i6) {
        this.f38822a.w(i6, 4);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.Yw0
    public final void b(int i6, java.util.List list, boolean z6) {
        if (list instanceof com.google.android.gms.internal.ads.Uu0) {
            androidx.appcompat.app.D.a(list);
            if (!z6) {
                throw null;
            }
            this.f38822a.w(i6, 2);
            throw null;
        }
        int i10 = 0;
        if (!z6) {
            while (i10 < list.size()) {
                this.f38822a.l(i6, ((java.lang.Boolean) list.get(i10)).booleanValue());
                i10++;
            }
            return;
        }
        this.f38822a.w(i6, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((java.lang.Boolean) list.get(i12)).booleanValue();
            i11++;
        }
        this.f38822a.y(i11);
        while (i10 < list.size()) {
            this.f38822a.k(((java.lang.Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.Yw0
    public final void c(int i6, java.util.List list, boolean z6) {
        int i10 = 0;
        if (!(list instanceof com.google.android.gms.internal.ads.Kv0)) {
            if (!z6) {
                while (i10 < list.size()) {
                    this.f38822a.o(i6, ((java.lang.Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            this.f38822a.w(i6, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((java.lang.Integer) list.get(i12)).intValue();
                i11 += 4;
            }
            this.f38822a.y(i11);
            while (i10 < list.size()) {
                this.f38822a.p(((java.lang.Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        com.google.android.gms.internal.ads.Kv0 kv0 = (com.google.android.gms.internal.ads.Kv0) list;
        if (!z6) {
            while (i10 < kv0.size()) {
                this.f38822a.o(i6, kv0.e(i10));
                i10++;
            }
            return;
        }
        this.f38822a.w(i6, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < kv0.size(); i14++) {
            kv0.e(i14);
            i13 += 4;
        }
        this.f38822a.y(i13);
        while (i10 < kv0.size()) {
            this.f38822a.p(kv0.e(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.Yw0
    public final void d(int i6, java.util.List list, boolean z6) {
        int i10 = 0;
        if (!(list instanceof com.google.android.gms.internal.ads.Kv0)) {
            if (!z6) {
                while (i10 < list.size()) {
                    this.f38822a.s(i6, ((java.lang.Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            this.f38822a.w(i6, 2);
            int iF = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iF += com.google.android.gms.internal.ads.AbstractC5070rv0.f(((java.lang.Integer) list.get(i11)).intValue());
            }
            this.f38822a.y(iF);
            while (i10 < list.size()) {
                this.f38822a.t(((java.lang.Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        com.google.android.gms.internal.ads.Kv0 kv0 = (com.google.android.gms.internal.ads.Kv0) list;
        if (!z6) {
            while (i10 < kv0.size()) {
                this.f38822a.s(i6, kv0.e(i10));
                i10++;
            }
            return;
        }
        this.f38822a.w(i6, 2);
        int iF2 = 0;
        for (int i12 = 0; i12 < kv0.size(); i12++) {
            iF2 += com.google.android.gms.internal.ads.AbstractC5070rv0.f(kv0.e(i12));
        }
        this.f38822a.y(iF2);
        while (i10 < kv0.size()) {
            this.f38822a.t(kv0.e(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.Yw0
    public final void f(int i6, int i10) {
        this.f38822a.s(i6, i10);
    }

    @Override // com.google.android.gms.internal.ads.Yw0
    public final void g(int i6, java.util.List list, boolean z6) {
        int i10 = 0;
        if (!(list instanceof com.google.android.gms.internal.ads.C3317bw0)) {
            if (!z6) {
                while (i10 < list.size()) {
                    this.f38822a.q(i6, ((java.lang.Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            this.f38822a.w(i6, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((java.lang.Long) list.get(i12)).longValue();
                i11 += 8;
            }
            this.f38822a.y(i11);
            while (i10 < list.size()) {
                this.f38822a.r(((java.lang.Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        com.google.android.gms.internal.ads.C3317bw0 c3317bw0 = (com.google.android.gms.internal.ads.C3317bw0) list;
        if (!z6) {
            while (i10 < c3317bw0.size()) {
                this.f38822a.q(i6, c3317bw0.e(i10));
                i10++;
            }
            return;
        }
        this.f38822a.w(i6, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < c3317bw0.size(); i14++) {
            c3317bw0.e(i14);
            i13 += 8;
        }
        this.f38822a.y(i13);
        while (i10 < c3317bw0.size()) {
            this.f38822a.r(c3317bw0.e(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.Yw0
    public final void h(int i6, java.util.List list, boolean z6) {
        if (list instanceof com.google.android.gms.internal.ads.AbstractC5290tv0) {
            androidx.appcompat.app.D.a(list);
            if (!z6) {
                throw null;
            }
            this.f38822a.w(i6, 2);
            throw null;
        }
        int i10 = 0;
        if (!z6) {
            while (i10 < list.size()) {
                this.f38822a.q(i6, java.lang.Double.doubleToRawLongBits(((java.lang.Double) list.get(i10)).doubleValue()));
                i10++;
            }
            return;
        }
        this.f38822a.w(i6, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((java.lang.Double) list.get(i12)).doubleValue();
            i11 += 8;
        }
        this.f38822a.y(i11);
        while (i10 < list.size()) {
            this.f38822a.r(java.lang.Double.doubleToRawLongBits(((java.lang.Double) list.get(i10)).doubleValue()));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.Yw0
    public final void i(int i6, java.util.List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f38822a.m(i6, (com.google.android.gms.internal.ads.AbstractC3753fv0) list.get(i10));
        }
    }

    @Override // com.google.android.gms.internal.ads.Yw0
    public final void j(int i6, java.lang.String str) {
        this.f38822a.v(i6, str);
    }

    @Override // com.google.android.gms.internal.ads.Yw0
    public final void k(int i6, int i10) {
        this.f38822a.x(i6, i10);
    }

    @Override // com.google.android.gms.internal.ads.Yw0
    public final void l(int i6, java.util.List list, boolean z6) {
        int i10 = 0;
        if (!(list instanceof com.google.android.gms.internal.ads.Kv0)) {
            if (!z6) {
                while (i10 < list.size()) {
                    this.f38822a.o(i6, ((java.lang.Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            this.f38822a.w(i6, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((java.lang.Integer) list.get(i12)).intValue();
                i11 += 4;
            }
            this.f38822a.y(i11);
            while (i10 < list.size()) {
                this.f38822a.p(((java.lang.Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        com.google.android.gms.internal.ads.Kv0 kv0 = (com.google.android.gms.internal.ads.Kv0) list;
        if (!z6) {
            while (i10 < kv0.size()) {
                this.f38822a.o(i6, kv0.e(i10));
                i10++;
            }
            return;
        }
        this.f38822a.w(i6, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < kv0.size(); i14++) {
            kv0.e(i14);
            i13 += 4;
        }
        this.f38822a.y(i13);
        while (i10 < kv0.size()) {
            this.f38822a.p(kv0.e(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.Yw0
    public final void m(int i6, int i10) {
        this.f38822a.o(i6, i10);
    }

    @Override // com.google.android.gms.internal.ads.Yw0
    public final void n(int i6, boolean z6) {
        this.f38822a.l(i6, z6);
    }

    @Override // com.google.android.gms.internal.ads.Yw0
    public final void o(int i6, long j6) {
        this.f38822a.z(i6, j6);
    }

    @Override // com.google.android.gms.internal.ads.Yw0
    public final void p(int i6, java.util.List list, boolean z6) {
        int i10 = 0;
        if (!(list instanceof com.google.android.gms.internal.ads.Kv0)) {
            if (!z6) {
                while (i10 < list.size()) {
                    this.f38822a.x(i6, ((java.lang.Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            this.f38822a.w(i6, 2);
            int iE = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iE += com.google.android.gms.internal.ads.AbstractC5070rv0.e(((java.lang.Integer) list.get(i11)).intValue());
            }
            this.f38822a.y(iE);
            while (i10 < list.size()) {
                this.f38822a.y(((java.lang.Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        com.google.android.gms.internal.ads.Kv0 kv0 = (com.google.android.gms.internal.ads.Kv0) list;
        if (!z6) {
            while (i10 < kv0.size()) {
                this.f38822a.x(i6, kv0.e(i10));
                i10++;
            }
            return;
        }
        this.f38822a.w(i6, 2);
        int iE2 = 0;
        for (int i12 = 0; i12 < kv0.size(); i12++) {
            iE2 += com.google.android.gms.internal.ads.AbstractC5070rv0.e(kv0.e(i12));
        }
        this.f38822a.y(iE2);
        while (i10 < kv0.size()) {
            this.f38822a.y(kv0.e(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.Yw0
    public final void q(int i6, java.util.List list, boolean z6) {
        int i10 = 0;
        if (!(list instanceof com.google.android.gms.internal.ads.C3317bw0)) {
            if (!z6) {
                while (i10 < list.size()) {
                    this.f38822a.q(i6, ((java.lang.Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            this.f38822a.w(i6, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((java.lang.Long) list.get(i12)).longValue();
                i11 += 8;
            }
            this.f38822a.y(i11);
            while (i10 < list.size()) {
                this.f38822a.r(((java.lang.Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        com.google.android.gms.internal.ads.C3317bw0 c3317bw0 = (com.google.android.gms.internal.ads.C3317bw0) list;
        if (!z6) {
            while (i10 < c3317bw0.size()) {
                this.f38822a.q(i6, c3317bw0.e(i10));
                i10++;
            }
            return;
        }
        this.f38822a.w(i6, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < c3317bw0.size(); i14++) {
            c3317bw0.e(i14);
            i13 += 8;
        }
        this.f38822a.y(i13);
        while (i10 < c3317bw0.size()) {
            this.f38822a.r(c3317bw0.e(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.Yw0
    public final void r(int i6, java.util.List list, boolean z6) {
        int i10 = 0;
        if (!(list instanceof com.google.android.gms.internal.ads.Kv0)) {
            if (!z6) {
                while (i10 < list.size()) {
                    this.f38822a.s(i6, ((java.lang.Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            this.f38822a.w(i6, 2);
            int iF = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iF += com.google.android.gms.internal.ads.AbstractC5070rv0.f(((java.lang.Integer) list.get(i11)).intValue());
            }
            this.f38822a.y(iF);
            while (i10 < list.size()) {
                this.f38822a.t(((java.lang.Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        com.google.android.gms.internal.ads.Kv0 kv0 = (com.google.android.gms.internal.ads.Kv0) list;
        if (!z6) {
            while (i10 < kv0.size()) {
                this.f38822a.s(i6, kv0.e(i10));
                i10++;
            }
            return;
        }
        this.f38822a.w(i6, 2);
        int iF2 = 0;
        for (int i12 = 0; i12 < kv0.size(); i12++) {
            iF2 += com.google.android.gms.internal.ads.AbstractC5070rv0.f(kv0.e(i12));
        }
        this.f38822a.y(iF2);
        while (i10 < kv0.size()) {
            this.f38822a.t(kv0.e(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.Yw0
    public final void s(int i6, long j6) {
        this.f38822a.q(i6, j6);
    }

    @Override // com.google.android.gms.internal.ads.Yw0
    public final void t(int i6, int i10) {
        this.f38822a.s(i6, i10);
    }

    @Override // com.google.android.gms.internal.ads.Yw0
    public final void u(int i6, java.util.List list, boolean z6) {
        int i10 = 0;
        if (!(list instanceof com.google.android.gms.internal.ads.Kv0)) {
            if (!z6) {
                while (i10 < list.size()) {
                    com.google.android.gms.internal.ads.AbstractC5070rv0 abstractC5070rv0 = this.f38822a;
                    int iIntValue = ((java.lang.Integer) list.get(i10)).intValue();
                    abstractC5070rv0.x(i6, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i10++;
                }
                return;
            }
            this.f38822a.w(i6, 2);
            int iE = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                int iIntValue2 = ((java.lang.Integer) list.get(i11)).intValue();
                iE += com.google.android.gms.internal.ads.AbstractC5070rv0.e((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            this.f38822a.y(iE);
            while (i10 < list.size()) {
                com.google.android.gms.internal.ads.AbstractC5070rv0 abstractC5070rv1 = this.f38822a;
                int iIntValue3 = ((java.lang.Integer) list.get(i10)).intValue();
                abstractC5070rv1.y((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i10++;
            }
            return;
        }
        com.google.android.gms.internal.ads.Kv0 kv0 = (com.google.android.gms.internal.ads.Kv0) list;
        if (!z6) {
            while (i10 < kv0.size()) {
                com.google.android.gms.internal.ads.AbstractC5070rv0 abstractC5070rv2 = this.f38822a;
                int iE2 = kv0.e(i10);
                abstractC5070rv2.x(i6, (iE2 >> 31) ^ (iE2 + iE2));
                i10++;
            }
            return;
        }
        this.f38822a.w(i6, 2);
        int iE3 = 0;
        for (int i12 = 0; i12 < kv0.size(); i12++) {
            int iE4 = kv0.e(i12);
            iE3 += com.google.android.gms.internal.ads.AbstractC5070rv0.e((iE4 >> 31) ^ (iE4 + iE4));
        }
        this.f38822a.y(iE3);
        while (i10 < kv0.size()) {
            com.google.android.gms.internal.ads.AbstractC5070rv0 abstractC5070rv3 = this.f38822a;
            int iE5 = kv0.e(i10);
            abstractC5070rv3.y((iE5 >> 31) ^ (iE5 + iE5));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.Yw0
    public final void v(int i6, double d6) {
        this.f38822a.q(i6, java.lang.Double.doubleToRawLongBits(d6));
    }

    @Override // com.google.android.gms.internal.ads.Yw0
    public final void w(int i6, long j6) {
        this.f38822a.z(i6, (j6 >> 63) ^ (j6 + j6));
    }

    @Override // com.google.android.gms.internal.ads.Yw0
    public final void x(int i6, java.util.List list, boolean z6) {
        int i10 = 0;
        if (!(list instanceof com.google.android.gms.internal.ads.C3317bw0)) {
            if (!z6) {
                while (i10 < list.size()) {
                    this.f38822a.z(i6, ((java.lang.Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            this.f38822a.w(i6, 2);
            int iF = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iF += com.google.android.gms.internal.ads.AbstractC5070rv0.f(((java.lang.Long) list.get(i11)).longValue());
            }
            this.f38822a.y(iF);
            while (i10 < list.size()) {
                this.f38822a.A(((java.lang.Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        com.google.android.gms.internal.ads.C3317bw0 c3317bw0 = (com.google.android.gms.internal.ads.C3317bw0) list;
        if (!z6) {
            while (i10 < c3317bw0.size()) {
                this.f38822a.z(i6, c3317bw0.e(i10));
                i10++;
            }
            return;
        }
        this.f38822a.w(i6, 2);
        int iF2 = 0;
        for (int i12 = 0; i12 < c3317bw0.size(); i12++) {
            iF2 += com.google.android.gms.internal.ads.AbstractC5070rv0.f(c3317bw0.e(i12));
        }
        this.f38822a.y(iF2);
        while (i10 < c3317bw0.size()) {
            this.f38822a.A(c3317bw0.e(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.Yw0
    public final void y(int i6, float f6) {
        this.f38822a.o(i6, java.lang.Float.floatToRawIntBits(f6));
    }

    @Override // com.google.android.gms.internal.ads.Yw0
    public final void z(int i6, java.util.List list, boolean z6) {
        int i10 = 0;
        if (!(list instanceof com.google.android.gms.internal.ads.C3317bw0)) {
            if (!z6) {
                while (i10 < list.size()) {
                    this.f38822a.z(i6, ((java.lang.Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            this.f38822a.w(i6, 2);
            int iF = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iF += com.google.android.gms.internal.ads.AbstractC5070rv0.f(((java.lang.Long) list.get(i11)).longValue());
            }
            this.f38822a.y(iF);
            while (i10 < list.size()) {
                this.f38822a.A(((java.lang.Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        com.google.android.gms.internal.ads.C3317bw0 c3317bw0 = (com.google.android.gms.internal.ads.C3317bw0) list;
        if (!z6) {
            while (i10 < c3317bw0.size()) {
                this.f38822a.z(i6, c3317bw0.e(i10));
                i10++;
            }
            return;
        }
        this.f38822a.w(i6, 2);
        int iF2 = 0;
        for (int i12 = 0; i12 < c3317bw0.size(); i12++) {
            iF2 += com.google.android.gms.internal.ads.AbstractC5070rv0.f(c3317bw0.e(i12));
        }
        this.f38822a.y(iF2);
        while (i10 < c3317bw0.size()) {
            this.f38822a.A(c3317bw0.e(i10));
            i10++;
        }
    }
}
