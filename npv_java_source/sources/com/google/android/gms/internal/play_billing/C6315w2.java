package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.w2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6315w2 implements com.google.android.gms.internal.play_billing.K3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.play_billing.AbstractC6309v2 f41670a;

    private C6315w2(com.google.android.gms.internal.play_billing.AbstractC6309v2 abstractC6309v2) {
        byte[] bArr = com.google.android.gms.internal.play_billing.Q2.f41449b;
        this.f41670a = abstractC6309v2;
        abstractC6309v2.f41662a = this;
    }

    public static com.google.android.gms.internal.play_billing.C6315w2 J(com.google.android.gms.internal.play_billing.AbstractC6309v2 abstractC6309v2) {
        com.google.android.gms.internal.play_billing.C6315w2 c6315w2 = abstractC6309v2.f41662a;
        return c6315w2 != null ? c6315w2 : new com.google.android.gms.internal.play_billing.C6315w2(abstractC6309v2);
    }

    @Override // com.google.android.gms.internal.play_billing.K3
    public final void A(int i6, int i10) {
        this.f41670a.i(i6, i10);
    }

    @Override // com.google.android.gms.internal.play_billing.K3
    public final void B(int i6, java.util.List list, boolean z6) {
        if (list instanceof com.google.android.gms.internal.play_billing.Y2) {
            androidx.appcompat.app.D.a(list);
            if (!z6) {
                throw null;
            }
            this.f41670a.r(i6, 2);
            throw null;
        }
        int i10 = 0;
        if (!z6) {
            while (i10 < list.size()) {
                com.google.android.gms.internal.play_billing.AbstractC6309v2 abstractC6309v2 = this.f41670a;
                long jLongValue = ((java.lang.Long) list.get(i10)).longValue();
                abstractC6309v2.u(i6, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i10++;
            }
            return;
        }
        this.f41670a.r(i6, 2);
        int iA = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            long jLongValue2 = ((java.lang.Long) list.get(i11)).longValue();
            iA += com.google.android.gms.internal.play_billing.AbstractC6309v2.a((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        this.f41670a.t(iA);
        while (i10 < list.size()) {
            com.google.android.gms.internal.play_billing.AbstractC6309v2 abstractC6309v3 = this.f41670a;
            long jLongValue3 = ((java.lang.Long) list.get(i10)).longValue();
            abstractC6309v3.v((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.K3
    public final void C(int i6, java.util.List list, boolean z6) {
        if (list instanceof com.google.android.gms.internal.play_billing.G2) {
            androidx.appcompat.app.D.a(list);
            if (!z6) {
                throw null;
            }
            this.f41670a.r(i6, 2);
            throw null;
        }
        int i10 = 0;
        if (!z6) {
            while (i10 < list.size()) {
                this.f41670a.i(i6, java.lang.Float.floatToRawIntBits(((java.lang.Float) list.get(i10)).floatValue()));
                i10++;
            }
            return;
        }
        this.f41670a.r(i6, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((java.lang.Float) list.get(i12)).floatValue();
            i11 += 4;
        }
        this.f41670a.t(i11);
        while (i10 < list.size()) {
            this.f41670a.j(java.lang.Float.floatToRawIntBits(((java.lang.Float) list.get(i10)).floatValue()));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.K3
    public final void D(int i6, int i10) {
        this.f41670a.s(i6, (i10 >> 31) ^ (i10 + i10));
    }

    @Override // com.google.android.gms.internal.play_billing.K3
    public final void E(int i6, long j6) {
        this.f41670a.k(i6, j6);
    }

    @Override // com.google.android.gms.internal.play_billing.K3
    public final void F(int i6, java.util.List list) {
        int i10 = 0;
        if (!(list instanceof com.google.android.gms.internal.play_billing.U2)) {
            while (i10 < list.size()) {
                this.f41670a.q(i6, (java.lang.String) list.get(i10));
                i10++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.U2 u6 = (com.google.android.gms.internal.play_billing.U2) list;
        while (i10 < list.size()) {
            java.lang.Object objC = u6.c();
            if (objC instanceof java.lang.String) {
                this.f41670a.q(i6, (java.lang.String) objC);
            } else {
                this.f41670a.h(i6, (com.google.android.gms.internal.play_billing.AbstractC6268o2) objC);
            }
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.K3
    public final void G(int i6, long j6) {
        this.f41670a.u(i6, j6);
    }

    @Override // com.google.android.gms.internal.play_billing.K3
    public final void H(int i6) {
        this.f41670a.r(i6, 3);
    }

    @Override // com.google.android.gms.internal.play_billing.K3
    public final void I(int i6, com.google.android.gms.internal.play_billing.AbstractC6268o2 abstractC6268o2) {
        this.f41670a.h(i6, abstractC6268o2);
    }

    @Override // com.google.android.gms.internal.play_billing.K3
    public final void L(int i6) {
        this.f41670a.r(i6, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.K3
    public final void a(int i6, java.lang.Object obj, com.google.android.gms.internal.play_billing.InterfaceC6298t3 interfaceC6298t3) {
        this.f41670a.p(i6, (com.google.android.gms.internal.play_billing.InterfaceC6233i3) obj, interfaceC6298t3);
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
    @Override // com.google.android.gms.internal.play_billing.K3
    public final void b(int i6, java.util.List list, boolean z6) {
        if (list instanceof com.google.android.gms.internal.play_billing.AbstractC6214f2) {
            androidx.appcompat.app.D.a(list);
            if (!z6) {
                throw null;
            }
            this.f41670a.r(i6, 2);
            throw null;
        }
        int i10 = 0;
        if (!z6) {
            while (i10 < list.size()) {
                this.f41670a.g(i6, ((java.lang.Boolean) list.get(i10)).booleanValue());
                i10++;
            }
            return;
        }
        this.f41670a.r(i6, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((java.lang.Boolean) list.get(i12)).booleanValue();
            i11++;
        }
        this.f41670a.t(i11);
        while (i10 < list.size()) {
            this.f41670a.f(((java.lang.Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.K3
    public final void c(int i6, java.util.List list, boolean z6) {
        int i10 = 0;
        if (!(list instanceof com.google.android.gms.internal.play_billing.M2)) {
            if (!z6) {
                while (i10 < list.size()) {
                    this.f41670a.i(i6, ((java.lang.Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            this.f41670a.r(i6, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((java.lang.Integer) list.get(i12)).intValue();
                i11 += 4;
            }
            this.f41670a.t(i11);
            while (i10 < list.size()) {
                this.f41670a.j(((java.lang.Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.M2 m6 = (com.google.android.gms.internal.play_billing.M2) list;
        if (!z6) {
            while (i10 < m6.size()) {
                this.f41670a.i(i6, m6.e(i10));
                i10++;
            }
            return;
        }
        this.f41670a.r(i6, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < m6.size(); i14++) {
            m6.e(i14);
            i13 += 4;
        }
        this.f41670a.t(i13);
        while (i10 < m6.size()) {
            this.f41670a.j(m6.e(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.K3
    public final void d(int i6, java.util.List list, boolean z6) {
        int i10 = 0;
        if (!(list instanceof com.google.android.gms.internal.play_billing.M2)) {
            if (!z6) {
                while (i10 < list.size()) {
                    this.f41670a.m(i6, ((java.lang.Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            this.f41670a.r(i6, 2);
            int iA = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iA += com.google.android.gms.internal.play_billing.AbstractC6309v2.a(((java.lang.Integer) list.get(i11)).intValue());
            }
            this.f41670a.t(iA);
            while (i10 < list.size()) {
                this.f41670a.n(((java.lang.Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.M2 m6 = (com.google.android.gms.internal.play_billing.M2) list;
        if (!z6) {
            while (i10 < m6.size()) {
                this.f41670a.m(i6, m6.e(i10));
                i10++;
            }
            return;
        }
        this.f41670a.r(i6, 2);
        int iA2 = 0;
        for (int i12 = 0; i12 < m6.size(); i12++) {
            iA2 += com.google.android.gms.internal.play_billing.AbstractC6309v2.a(m6.e(i12));
        }
        this.f41670a.t(iA2);
        while (i10 < m6.size()) {
            this.f41670a.n(m6.e(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.K3
    public final void e(int i6, java.lang.Object obj, com.google.android.gms.internal.play_billing.InterfaceC6298t3 interfaceC6298t3) {
        com.google.android.gms.internal.play_billing.AbstractC6309v2 abstractC6309v2 = this.f41670a;
        abstractC6309v2.r(i6, 3);
        interfaceC6298t3.h((com.google.android.gms.internal.play_billing.InterfaceC6233i3) obj, abstractC6309v2.f41662a);
        abstractC6309v2.r(i6, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.K3
    public final void f(int i6, int i10) {
        this.f41670a.m(i6, i10);
    }

    @Override // com.google.android.gms.internal.play_billing.K3
    public final void g(int i6, java.util.List list, boolean z6) {
        if (list instanceof com.google.android.gms.internal.play_billing.Y2) {
            androidx.appcompat.app.D.a(list);
            if (!z6) {
                throw null;
            }
            this.f41670a.r(i6, 2);
            throw null;
        }
        int i10 = 0;
        if (!z6) {
            while (i10 < list.size()) {
                this.f41670a.k(i6, ((java.lang.Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        this.f41670a.r(i6, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((java.lang.Long) list.get(i12)).longValue();
            i11 += 8;
        }
        this.f41670a.t(i11);
        while (i10 < list.size()) {
            this.f41670a.l(((java.lang.Long) list.get(i10)).longValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.K3
    public final void h(int i6, java.util.List list, boolean z6) {
        if (list instanceof com.google.android.gms.internal.play_billing.AbstractC6321x2) {
            androidx.appcompat.app.D.a(list);
            if (!z6) {
                throw null;
            }
            this.f41670a.r(i6, 2);
            throw null;
        }
        int i10 = 0;
        if (!z6) {
            while (i10 < list.size()) {
                this.f41670a.k(i6, java.lang.Double.doubleToRawLongBits(((java.lang.Double) list.get(i10)).doubleValue()));
                i10++;
            }
            return;
        }
        this.f41670a.r(i6, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((java.lang.Double) list.get(i12)).doubleValue();
            i11 += 8;
        }
        this.f41670a.t(i11);
        while (i10 < list.size()) {
            this.f41670a.l(java.lang.Double.doubleToRawLongBits(((java.lang.Double) list.get(i10)).doubleValue()));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.K3
    public final void i(int i6, java.util.List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f41670a.h(i6, (com.google.android.gms.internal.play_billing.AbstractC6268o2) list.get(i10));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.K3
    public final void j(int i6, java.lang.String str) {
        this.f41670a.q(i6, str);
    }

    @Override // com.google.android.gms.internal.play_billing.K3
    public final void k(int i6, int i10) {
        this.f41670a.s(i6, i10);
    }

    @Override // com.google.android.gms.internal.play_billing.K3
    public final void l(int i6, java.util.List list, boolean z6) {
        int i10 = 0;
        if (!(list instanceof com.google.android.gms.internal.play_billing.M2)) {
            if (!z6) {
                while (i10 < list.size()) {
                    this.f41670a.i(i6, ((java.lang.Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            this.f41670a.r(i6, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((java.lang.Integer) list.get(i12)).intValue();
                i11 += 4;
            }
            this.f41670a.t(i11);
            while (i10 < list.size()) {
                this.f41670a.j(((java.lang.Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.M2 m6 = (com.google.android.gms.internal.play_billing.M2) list;
        if (!z6) {
            while (i10 < m6.size()) {
                this.f41670a.i(i6, m6.e(i10));
                i10++;
            }
            return;
        }
        this.f41670a.r(i6, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < m6.size(); i14++) {
            m6.e(i14);
            i13 += 4;
        }
        this.f41670a.t(i13);
        while (i10 < m6.size()) {
            this.f41670a.j(m6.e(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.K3
    public final void m(int i6, int i10) {
        this.f41670a.i(i6, i10);
    }

    @Override // com.google.android.gms.internal.play_billing.K3
    public final void n(int i6, boolean z6) {
        this.f41670a.g(i6, z6);
    }

    @Override // com.google.android.gms.internal.play_billing.K3
    public final void o(int i6, long j6) {
        this.f41670a.u(i6, j6);
    }

    @Override // com.google.android.gms.internal.play_billing.K3
    public final void p(int i6, java.util.List list, boolean z6) {
        int i10 = 0;
        if (!(list instanceof com.google.android.gms.internal.play_billing.M2)) {
            if (!z6) {
                while (i10 < list.size()) {
                    this.f41670a.s(i6, ((java.lang.Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            this.f41670a.r(i6, 2);
            int iZ = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZ += com.google.android.gms.internal.play_billing.AbstractC6309v2.z(((java.lang.Integer) list.get(i11)).intValue());
            }
            this.f41670a.t(iZ);
            while (i10 < list.size()) {
                this.f41670a.t(((java.lang.Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.M2 m6 = (com.google.android.gms.internal.play_billing.M2) list;
        if (!z6) {
            while (i10 < m6.size()) {
                this.f41670a.s(i6, m6.e(i10));
                i10++;
            }
            return;
        }
        this.f41670a.r(i6, 2);
        int iZ2 = 0;
        for (int i12 = 0; i12 < m6.size(); i12++) {
            iZ2 += com.google.android.gms.internal.play_billing.AbstractC6309v2.z(m6.e(i12));
        }
        this.f41670a.t(iZ2);
        while (i10 < m6.size()) {
            this.f41670a.t(m6.e(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.K3
    public final void q(int i6, java.util.List list, boolean z6) {
        if (list instanceof com.google.android.gms.internal.play_billing.Y2) {
            androidx.appcompat.app.D.a(list);
            if (!z6) {
                throw null;
            }
            this.f41670a.r(i6, 2);
            throw null;
        }
        int i10 = 0;
        if (!z6) {
            while (i10 < list.size()) {
                this.f41670a.k(i6, ((java.lang.Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        this.f41670a.r(i6, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((java.lang.Long) list.get(i12)).longValue();
            i11 += 8;
        }
        this.f41670a.t(i11);
        while (i10 < list.size()) {
            this.f41670a.l(((java.lang.Long) list.get(i10)).longValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.K3
    public final void r(int i6, java.util.List list, boolean z6) {
        int i10 = 0;
        if (!(list instanceof com.google.android.gms.internal.play_billing.M2)) {
            if (!z6) {
                while (i10 < list.size()) {
                    this.f41670a.m(i6, ((java.lang.Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            this.f41670a.r(i6, 2);
            int iA = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iA += com.google.android.gms.internal.play_billing.AbstractC6309v2.a(((java.lang.Integer) list.get(i11)).intValue());
            }
            this.f41670a.t(iA);
            while (i10 < list.size()) {
                this.f41670a.n(((java.lang.Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.M2 m6 = (com.google.android.gms.internal.play_billing.M2) list;
        if (!z6) {
            while (i10 < m6.size()) {
                this.f41670a.m(i6, m6.e(i10));
                i10++;
            }
            return;
        }
        this.f41670a.r(i6, 2);
        int iA2 = 0;
        for (int i12 = 0; i12 < m6.size(); i12++) {
            iA2 += com.google.android.gms.internal.play_billing.AbstractC6309v2.a(m6.e(i12));
        }
        this.f41670a.t(iA2);
        while (i10 < m6.size()) {
            this.f41670a.n(m6.e(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.K3
    public final void s(int i6, long j6) {
        this.f41670a.k(i6, j6);
    }

    @Override // com.google.android.gms.internal.play_billing.K3
    public final void t(int i6, int i10) {
        this.f41670a.m(i6, i10);
    }

    @Override // com.google.android.gms.internal.play_billing.K3
    public final void u(int i6, java.util.List list, boolean z6) {
        int i10 = 0;
        if (!(list instanceof com.google.android.gms.internal.play_billing.M2)) {
            if (!z6) {
                while (i10 < list.size()) {
                    com.google.android.gms.internal.play_billing.AbstractC6309v2 abstractC6309v2 = this.f41670a;
                    int iIntValue = ((java.lang.Integer) list.get(i10)).intValue();
                    abstractC6309v2.s(i6, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i10++;
                }
                return;
            }
            this.f41670a.r(i6, 2);
            int iZ = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                int iIntValue2 = ((java.lang.Integer) list.get(i11)).intValue();
                iZ += com.google.android.gms.internal.play_billing.AbstractC6309v2.z((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            this.f41670a.t(iZ);
            while (i10 < list.size()) {
                com.google.android.gms.internal.play_billing.AbstractC6309v2 abstractC6309v3 = this.f41670a;
                int iIntValue3 = ((java.lang.Integer) list.get(i10)).intValue();
                abstractC6309v3.t((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i10++;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.M2 m6 = (com.google.android.gms.internal.play_billing.M2) list;
        if (!z6) {
            while (i10 < m6.size()) {
                com.google.android.gms.internal.play_billing.AbstractC6309v2 abstractC6309v4 = this.f41670a;
                int iE = m6.e(i10);
                abstractC6309v4.s(i6, (iE >> 31) ^ (iE + iE));
                i10++;
            }
            return;
        }
        this.f41670a.r(i6, 2);
        int iZ2 = 0;
        for (int i12 = 0; i12 < m6.size(); i12++) {
            int iE2 = m6.e(i12);
            iZ2 += com.google.android.gms.internal.play_billing.AbstractC6309v2.z((iE2 >> 31) ^ (iE2 + iE2));
        }
        this.f41670a.t(iZ2);
        while (i10 < m6.size()) {
            com.google.android.gms.internal.play_billing.AbstractC6309v2 abstractC6309v5 = this.f41670a;
            int iE3 = m6.e(i10);
            abstractC6309v5.t((iE3 >> 31) ^ (iE3 + iE3));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.K3
    public final void v(int i6, double d6) {
        this.f41670a.k(i6, java.lang.Double.doubleToRawLongBits(d6));
    }

    @Override // com.google.android.gms.internal.play_billing.K3
    public final void w(int i6, long j6) {
        this.f41670a.u(i6, (j6 >> 63) ^ (j6 + j6));
    }

    @Override // com.google.android.gms.internal.play_billing.K3
    public final void x(int i6, java.util.List list, boolean z6) {
        if (list instanceof com.google.android.gms.internal.play_billing.Y2) {
            androidx.appcompat.app.D.a(list);
            if (!z6) {
                throw null;
            }
            this.f41670a.r(i6, 2);
            throw null;
        }
        int i10 = 0;
        if (!z6) {
            while (i10 < list.size()) {
                this.f41670a.u(i6, ((java.lang.Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        this.f41670a.r(i6, 2);
        int iA = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iA += com.google.android.gms.internal.play_billing.AbstractC6309v2.a(((java.lang.Long) list.get(i11)).longValue());
        }
        this.f41670a.t(iA);
        while (i10 < list.size()) {
            this.f41670a.v(((java.lang.Long) list.get(i10)).longValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.K3
    public final void y(int i6, float f6) {
        this.f41670a.i(i6, java.lang.Float.floatToRawIntBits(f6));
    }

    @Override // com.google.android.gms.internal.play_billing.K3
    public final void z(int i6, java.util.List list, boolean z6) {
        if (list instanceof com.google.android.gms.internal.play_billing.Y2) {
            androidx.appcompat.app.D.a(list);
            if (!z6) {
                throw null;
            }
            this.f41670a.r(i6, 2);
            throw null;
        }
        int i10 = 0;
        if (!z6) {
            while (i10 < list.size()) {
                this.f41670a.u(i6, ((java.lang.Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        this.f41670a.r(i6, 2);
        int iA = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iA += com.google.android.gms.internal.play_billing.AbstractC6309v2.a(((java.lang.Long) list.get(i11)).longValue());
        }
        this.f41670a.t(iA);
        while (i10 < list.size()) {
            this.f41670a.v(((java.lang.Long) list.get(i10)).longValue());
            i10++;
        }
    }
}
