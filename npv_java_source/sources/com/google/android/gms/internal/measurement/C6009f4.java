package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6009f4 implements com.google.android.gms.internal.measurement.X5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.measurement.AbstractC5982c4 f40940a;

    private C6009f4(com.google.android.gms.internal.measurement.AbstractC5982c4 abstractC5982c4) {
        com.google.android.gms.internal.measurement.AbstractC5982c4 abstractC5982c5 = (com.google.android.gms.internal.measurement.AbstractC5982c4) com.google.android.gms.internal.measurement.AbstractC6146v4.f(abstractC5982c4, "output");
        this.f40940a = abstractC5982c5;
        abstractC5982c5.f40816a = this;
    }

    public static com.google.android.gms.internal.measurement.C6009f4 P(com.google.android.gms.internal.measurement.AbstractC5982c4 abstractC5982c4) {
        com.google.android.gms.internal.measurement.C6009f4 c6009f4 = abstractC5982c4.f40816a;
        return c6009f4 != null ? c6009f4 : new com.google.android.gms.internal.measurement.C6009f4(abstractC5982c4);
    }

    @Override // com.google.android.gms.internal.measurement.X5
    public final void A(int i6, double d6) {
        this.f40940a.I(i6, d6);
    }

    @Override // com.google.android.gms.internal.measurement.X5
    public final void B(int i6) {
        this.f40940a.V(i6, 3);
    }

    @Override // com.google.android.gms.internal.measurement.X5
    public final void C(int i6, float f6) {
        this.f40940a.J(i6, f6);
    }

    @Override // com.google.android.gms.internal.measurement.X5
    public final void D(int i6, java.util.List list, boolean z6) {
        int i10 = 0;
        if (!(list instanceof com.google.android.gms.internal.measurement.K4)) {
            if (!z6) {
                while (i10 < list.size()) {
                    this.f40940a.m(i6, ((java.lang.Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            this.f40940a.V(i6, 2);
            int iS = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iS += com.google.android.gms.internal.measurement.AbstractC5982c4.S(((java.lang.Long) list.get(i11)).longValue());
            }
            this.f40940a.U(iS);
            while (i10 < list.size()) {
                this.f40940a.s(((java.lang.Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.K4 k6 = (com.google.android.gms.internal.measurement.K4) list;
        if (!z6) {
            while (i10 < k6.size()) {
                this.f40940a.m(i6, k6.B(i10));
                i10++;
            }
            return;
        }
        this.f40940a.V(i6, 2);
        int iS2 = 0;
        for (int i12 = 0; i12 < k6.size(); i12++) {
            iS2 += com.google.android.gms.internal.measurement.AbstractC5982c4.S(k6.B(i12));
        }
        this.f40940a.U(iS2);
        while (i10 < k6.size()) {
            this.f40940a.s(k6.B(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.X5
    public final void E(int i6, int i10) {
        this.f40940a.b0(i6, i10);
    }

    @Override // com.google.android.gms.internal.measurement.X5
    public final void F(int i6, java.lang.Object obj, com.google.android.gms.internal.measurement.InterfaceC6100p5 interfaceC6100p5) {
        com.google.android.gms.internal.measurement.AbstractC5982c4 abstractC5982c4 = this.f40940a;
        abstractC5982c4.V(i6, 3);
        interfaceC6100p5.g((com.google.android.gms.internal.measurement.InterfaceC5965a5) obj, abstractC5982c4.f40816a);
        abstractC5982c4.V(i6, 4);
    }

    @Override // com.google.android.gms.internal.measurement.X5
    public final void G(int i6, java.util.List list, boolean z6) {
        int i10 = 0;
        if (!(list instanceof com.google.android.gms.internal.measurement.C6154w4)) {
            if (!z6) {
                while (i10 < list.size()) {
                    this.f40940a.l(i6, ((java.lang.Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            this.f40940a.V(i6, 2);
            int iC0 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iC0 += com.google.android.gms.internal.measurement.AbstractC5982c4.c0(((java.lang.Integer) list.get(i11)).intValue());
            }
            this.f40940a.U(iC0);
            while (i10 < list.size()) {
                this.f40940a.k(((java.lang.Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.C6154w4 c6154w4 = (com.google.android.gms.internal.measurement.C6154w4) list;
        if (!z6) {
            while (i10 < c6154w4.size()) {
                this.f40940a.l(i6, c6154w4.e(i10));
                i10++;
            }
            return;
        }
        this.f40940a.V(i6, 2);
        int iC1 = 0;
        for (int i12 = 0; i12 < c6154w4.size(); i12++) {
            iC1 += com.google.android.gms.internal.measurement.AbstractC5982c4.c0(c6154w4.e(i12));
        }
        this.f40940a.U(iC1);
        while (i10 < c6154w4.size()) {
            this.f40940a.k(c6154w4.e(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.X5
    public final void H(int i6, java.lang.Object obj, com.google.android.gms.internal.measurement.InterfaceC6100p5 interfaceC6100p5) {
        this.f40940a.p(i6, (com.google.android.gms.internal.measurement.InterfaceC5965a5) obj, interfaceC6100p5);
    }

    @Override // com.google.android.gms.internal.measurement.X5
    public final void I(int i6, java.util.List list, boolean z6) {
        int i10 = 0;
        if (!(list instanceof com.google.android.gms.internal.measurement.C6154w4)) {
            if (!z6) {
                while (i10 < list.size()) {
                    this.f40940a.b0(i6, ((java.lang.Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            this.f40940a.V(i6, 2);
            int iV0 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iV0 += com.google.android.gms.internal.measurement.AbstractC5982c4.v0(((java.lang.Integer) list.get(i11)).intValue());
            }
            this.f40940a.U(iV0);
            while (i10 < list.size()) {
                this.f40940a.U(((java.lang.Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.C6154w4 c6154w4 = (com.google.android.gms.internal.measurement.C6154w4) list;
        if (!z6) {
            while (i10 < c6154w4.size()) {
                this.f40940a.b0(i6, c6154w4.e(i10));
                i10++;
            }
            return;
        }
        this.f40940a.V(i6, 2);
        int iV1 = 0;
        for (int i12 = 0; i12 < c6154w4.size(); i12++) {
            iV1 += com.google.android.gms.internal.measurement.AbstractC5982c4.v0(c6154w4.e(i12));
        }
        this.f40940a.U(iV1);
        while (i10 < c6154w4.size()) {
            this.f40940a.U(c6154w4.e(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.X5
    public final void J(int i6, java.util.List list) {
        int i10 = 0;
        if (!(list instanceof com.google.android.gms.internal.measurement.H4)) {
            while (i10 < list.size()) {
                this.f40940a.q(i6, (java.lang.String) list.get(i10));
                i10++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.H4 h6 = (com.google.android.gms.internal.measurement.H4) list;
        while (i10 < list.size()) {
            java.lang.Object objR = h6.r(i10);
            if (objR instanceof java.lang.String) {
                this.f40940a.q(i6, (java.lang.String) objR);
            } else {
                this.f40940a.n(i6, (com.google.android.gms.internal.measurement.L3) objR);
            }
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.X5
    public final void K(int i6, int i10) {
        this.f40940a.l(i6, i10);
    }

    @Override // com.google.android.gms.internal.measurement.X5
    public final void L(int i6, long j6) {
        this.f40940a.q0(i6, j6);
    }

    @Override // com.google.android.gms.internal.measurement.X5
    public final void M(int i6, java.util.List list, boolean z6) {
        if (list instanceof com.google.android.gms.internal.measurement.AbstractC6122s4) {
            androidx.appcompat.app.D.a(list);
            if (!z6) {
                throw null;
            }
            this.f40940a.V(i6, 2);
            throw null;
        }
        int i10 = 0;
        if (!z6) {
            while (i10 < list.size()) {
                this.f40940a.J(i6, ((java.lang.Float) list.get(i10)).floatValue());
                i10++;
            }
            return;
        }
        this.f40940a.V(i6, 2);
        int iD = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iD += com.google.android.gms.internal.measurement.AbstractC5982c4.d(((java.lang.Float) list.get(i11)).floatValue());
        }
        this.f40940a.U(iD);
        while (i10 < list.size()) {
            this.f40940a.G(((java.lang.Float) list.get(i10)).floatValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.X5
    public final void N(int i6, int i10) {
        this.f40940a.y0(i6, i10);
    }

    @Override // com.google.android.gms.internal.measurement.X5
    public final void O(int i6, java.util.List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f40940a.n(i6, (com.google.android.gms.internal.measurement.L3) list.get(i10));
        }
    }

    @Override // com.google.android.gms.internal.measurement.X5
    public final int a() {
        return 1;
    }

    @Override // com.google.android.gms.internal.measurement.X5
    public final void b(int i6, java.util.List list, boolean z6) {
        int i10 = 0;
        if (!(list instanceof com.google.android.gms.internal.measurement.C6154w4)) {
            if (!z6) {
                while (i10 < list.size()) {
                    this.f40940a.K(i6, ((java.lang.Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            this.f40940a.V(i6, 2);
            int iX = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iX += com.google.android.gms.internal.measurement.AbstractC5982c4.X(((java.lang.Integer) list.get(i11)).intValue());
            }
            this.f40940a.U(iX);
            while (i10 < list.size()) {
                this.f40940a.H(((java.lang.Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.C6154w4 c6154w4 = (com.google.android.gms.internal.measurement.C6154w4) list;
        if (!z6) {
            while (i10 < c6154w4.size()) {
                this.f40940a.K(i6, c6154w4.e(i10));
                i10++;
            }
            return;
        }
        this.f40940a.V(i6, 2);
        int iX2 = 0;
        for (int i12 = 0; i12 < c6154w4.size(); i12++) {
            iX2 += com.google.android.gms.internal.measurement.AbstractC5982c4.X(c6154w4.e(i12));
        }
        this.f40940a.U(iX2);
        while (i10 < c6154w4.size()) {
            this.f40940a.H(c6154w4.e(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.X5
    public final void c(int i6, java.util.List list, boolean z6) {
        int i10 = 0;
        if (!(list instanceof com.google.android.gms.internal.measurement.K4)) {
            if (!z6) {
                while (i10 < list.size()) {
                    this.f40940a.q0(i6, ((java.lang.Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            this.f40940a.V(i6, 2);
            int iJ0 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iJ0 += com.google.android.gms.internal.measurement.AbstractC5982c4.j0(((java.lang.Long) list.get(i11)).longValue());
            }
            this.f40940a.U(iJ0);
            while (i10 < list.size()) {
                this.f40940a.r0(((java.lang.Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.K4 k6 = (com.google.android.gms.internal.measurement.K4) list;
        if (!z6) {
            while (i10 < k6.size()) {
                this.f40940a.q0(i6, k6.B(i10));
                i10++;
            }
            return;
        }
        this.f40940a.V(i6, 2);
        int iJ1 = 0;
        for (int i12 = 0; i12 < k6.size(); i12++) {
            iJ1 += com.google.android.gms.internal.measurement.AbstractC5982c4.j0(k6.B(i12));
        }
        this.f40940a.U(iJ1);
        while (i10 < k6.size()) {
            this.f40940a.r0(k6.B(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.X5
    public final void d(int i6, java.util.List list, boolean z6) {
        int i10 = 0;
        if (!(list instanceof com.google.android.gms.internal.measurement.K4)) {
            if (!z6) {
                while (i10 < list.size()) {
                    this.f40940a.m(i6, ((java.lang.Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            this.f40940a.V(i6, 2);
            int iF0 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iF0 += com.google.android.gms.internal.measurement.AbstractC5982c4.f0(((java.lang.Long) list.get(i11)).longValue());
            }
            this.f40940a.U(iF0);
            while (i10 < list.size()) {
                this.f40940a.s(((java.lang.Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.K4 k6 = (com.google.android.gms.internal.measurement.K4) list;
        if (!z6) {
            while (i10 < k6.size()) {
                this.f40940a.m(i6, k6.B(i10));
                i10++;
            }
            return;
        }
        this.f40940a.V(i6, 2);
        int iF1 = 0;
        for (int i12 = 0; i12 < k6.size(); i12++) {
            iF1 += com.google.android.gms.internal.measurement.AbstractC5982c4.f0(k6.B(i12));
        }
        this.f40940a.U(iF1);
        while (i10 < k6.size()) {
            this.f40940a.s(k6.B(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.X5
    public final void e(int i6, long j6) {
        this.f40940a.m(i6, j6);
    }

    @Override // com.google.android.gms.internal.measurement.X5
    public final void f(int i6, java.lang.String str) {
        this.f40940a.q(i6, str);
    }

    @Override // com.google.android.gms.internal.measurement.X5
    public final void g(int i6, java.util.List list, boolean z6) {
        int i10 = 0;
        if (!(list instanceof com.google.android.gms.internal.measurement.K4)) {
            if (!z6) {
                while (i10 < list.size()) {
                    this.f40940a.L(i6, ((java.lang.Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            this.f40940a.V(i6, 2);
            int iN0 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iN0 += com.google.android.gms.internal.measurement.AbstractC5982c4.n0(((java.lang.Long) list.get(i11)).longValue());
            }
            this.f40940a.U(iN0);
            while (i10 < list.size()) {
                this.f40940a.N(((java.lang.Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.K4 k6 = (com.google.android.gms.internal.measurement.K4) list;
        if (!z6) {
            while (i10 < k6.size()) {
                this.f40940a.L(i6, k6.B(i10));
                i10++;
            }
            return;
        }
        this.f40940a.V(i6, 2);
        int iN1 = 0;
        for (int i12 = 0; i12 < k6.size(); i12++) {
            iN1 += com.google.android.gms.internal.measurement.AbstractC5982c4.n0(k6.B(i12));
        }
        this.f40940a.U(iN1);
        while (i10 < k6.size()) {
            this.f40940a.N(k6.B(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.X5
    public final void h(int i6, java.util.List list, boolean z6) {
        int i10 = 0;
        if (!(list instanceof com.google.android.gms.internal.measurement.C6154w4)) {
            if (!z6) {
                while (i10 < list.size()) {
                    this.f40940a.K(i6, ((java.lang.Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            this.f40940a.V(i6, 2);
            int iG0 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iG0 += com.google.android.gms.internal.measurement.AbstractC5982c4.g0(((java.lang.Integer) list.get(i11)).intValue());
            }
            this.f40940a.U(iG0);
            while (i10 < list.size()) {
                this.f40940a.H(((java.lang.Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.C6154w4 c6154w4 = (com.google.android.gms.internal.measurement.C6154w4) list;
        if (!z6) {
            while (i10 < c6154w4.size()) {
                this.f40940a.K(i6, c6154w4.e(i10));
                i10++;
            }
            return;
        }
        this.f40940a.V(i6, 2);
        int iG1 = 0;
        for (int i12 = 0; i12 < c6154w4.size(); i12++) {
            iG1 += com.google.android.gms.internal.measurement.AbstractC5982c4.g0(c6154w4.e(i12));
        }
        this.f40940a.U(iG1);
        while (i10 < c6154w4.size()) {
            this.f40940a.H(c6154w4.e(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.X5
    public final void i(int i6, long j6) {
        this.f40940a.L(i6, j6);
    }

    @Override // com.google.android.gms.internal.measurement.X5
    public final void j(int i6, boolean z6) {
        this.f40940a.r(i6, z6);
    }

    @Override // com.google.android.gms.internal.measurement.X5
    public final void k(int i6, java.util.List list, boolean z6) {
        int i10 = 0;
        if (!(list instanceof com.google.android.gms.internal.measurement.C6154w4)) {
            if (!z6) {
                while (i10 < list.size()) {
                    this.f40940a.l(i6, ((java.lang.Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            this.f40940a.V(i6, 2);
            int iK0 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iK0 += com.google.android.gms.internal.measurement.AbstractC5982c4.k0(((java.lang.Integer) list.get(i11)).intValue());
            }
            this.f40940a.U(iK0);
            while (i10 < list.size()) {
                this.f40940a.k(((java.lang.Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.C6154w4 c6154w4 = (com.google.android.gms.internal.measurement.C6154w4) list;
        if (!z6) {
            while (i10 < c6154w4.size()) {
                this.f40940a.l(i6, c6154w4.e(i10));
                i10++;
            }
            return;
        }
        this.f40940a.V(i6, 2);
        int iK1 = 0;
        for (int i12 = 0; i12 < c6154w4.size(); i12++) {
            iK1 += com.google.android.gms.internal.measurement.AbstractC5982c4.k0(c6154w4.e(i12));
        }
        this.f40940a.U(iK1);
        while (i10 < c6154w4.size()) {
            this.f40940a.k(c6154w4.e(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.X5
    public final void l(int i6, java.util.List list, com.google.android.gms.internal.measurement.InterfaceC6100p5 interfaceC6100p5) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            H(i6, list.get(i10), interfaceC6100p5);
        }
    }

    @Override // com.google.android.gms.internal.measurement.X5
    public final void m(int i6, long j6) {
        this.f40940a.L(i6, j6);
    }

    @Override // com.google.android.gms.internal.measurement.X5
    public final void n(int i6, com.google.android.gms.internal.measurement.Q4 q6, java.util.Map map) {
        for (java.util.Map.Entry entry : map.entrySet()) {
            this.f40940a.V(i6, 2);
            this.f40940a.U(com.google.android.gms.internal.measurement.R4.a(q6, entry.getKey(), entry.getValue()));
            com.google.android.gms.internal.measurement.R4.b(this.f40940a, q6, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.X5
    public final void o(int i6, int i10) {
        this.f40940a.l(i6, i10);
    }

    @Override // com.google.android.gms.internal.measurement.X5
    public final void p(int i6, java.util.List list, boolean z6) {
        if (list instanceof com.google.android.gms.internal.measurement.J3) {
            androidx.appcompat.app.D.a(list);
            if (!z6) {
                throw null;
            }
            this.f40940a.V(i6, 2);
            throw null;
        }
        int i10 = 0;
        if (!z6) {
            while (i10 < list.size()) {
                this.f40940a.r(i6, ((java.lang.Boolean) list.get(i10)).booleanValue());
                i10++;
            }
            return;
        }
        this.f40940a.V(i6, 2);
        int iH = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iH += com.google.android.gms.internal.measurement.AbstractC5982c4.h(((java.lang.Boolean) list.get(i11)).booleanValue());
        }
        this.f40940a.U(iH);
        while (i10 < list.size()) {
            this.f40940a.O(((java.lang.Boolean) list.get(i10)).booleanValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.X5
    public final void q(int i6, com.google.android.gms.internal.measurement.L3 l6) {
        this.f40940a.n(i6, l6);
    }

    @Override // com.google.android.gms.internal.measurement.X5
    public final void r(int i6) {
        this.f40940a.V(i6, 4);
    }

    @Override // com.google.android.gms.internal.measurement.X5
    public final void s(int i6, java.util.List list, boolean z6) {
        int i10 = 0;
        if (!(list instanceof com.google.android.gms.internal.measurement.K4)) {
            if (!z6) {
                while (i10 < list.size()) {
                    this.f40940a.L(i6, ((java.lang.Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            this.f40940a.V(i6, 2);
            int iA0 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iA0 += com.google.android.gms.internal.measurement.AbstractC5982c4.a0(((java.lang.Long) list.get(i11)).longValue());
            }
            this.f40940a.U(iA0);
            while (i10 < list.size()) {
                this.f40940a.N(((java.lang.Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.K4 k6 = (com.google.android.gms.internal.measurement.K4) list;
        if (!z6) {
            while (i10 < k6.size()) {
                this.f40940a.L(i6, k6.B(i10));
                i10++;
            }
            return;
        }
        this.f40940a.V(i6, 2);
        int iA1 = 0;
        for (int i12 = 0; i12 < k6.size(); i12++) {
            iA1 += com.google.android.gms.internal.measurement.AbstractC5982c4.a0(k6.B(i12));
        }
        this.f40940a.U(iA1);
        while (i10 < k6.size()) {
            this.f40940a.N(k6.B(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.X5
    public final void t(int i6, java.util.List list, com.google.android.gms.internal.measurement.InterfaceC6100p5 interfaceC6100p5) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            F(i6, list.get(i10), interfaceC6100p5);
        }
    }

    @Override // com.google.android.gms.internal.measurement.X5
    public final void u(int i6, int i10) {
        this.f40940a.K(i6, i10);
    }

    @Override // com.google.android.gms.internal.measurement.X5
    public final void v(int i6, long j6) {
        this.f40940a.m(i6, j6);
    }

    @Override // com.google.android.gms.internal.measurement.X5
    public final void w(int i6, java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.internal.measurement.L3) {
            this.f40940a.M(i6, (com.google.android.gms.internal.measurement.L3) obj);
        } else {
            this.f40940a.o(i6, (com.google.android.gms.internal.measurement.InterfaceC5965a5) obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.X5
    public final void x(int i6, java.util.List list, boolean z6) {
        if (list instanceof com.google.android.gms.internal.measurement.AbstractC6000e4) {
            androidx.appcompat.app.D.a(list);
            if (!z6) {
                throw null;
            }
            this.f40940a.V(i6, 2);
            throw null;
        }
        int i10 = 0;
        if (!z6) {
            while (i10 < list.size()) {
                this.f40940a.I(i6, ((java.lang.Double) list.get(i10)).doubleValue());
                i10++;
            }
            return;
        }
        this.f40940a.V(i6, 2);
        int iC = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iC += com.google.android.gms.internal.measurement.AbstractC5982c4.c(((java.lang.Double) list.get(i11)).doubleValue());
        }
        this.f40940a.U(iC);
        while (i10 < list.size()) {
            this.f40940a.F(((java.lang.Double) list.get(i10)).doubleValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.X5
    public final void y(int i6, java.util.List list, boolean z6) {
        int i10 = 0;
        if (!(list instanceof com.google.android.gms.internal.measurement.C6154w4)) {
            if (!z6) {
                while (i10 < list.size()) {
                    this.f40940a.y0(i6, ((java.lang.Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            this.f40940a.V(i6, 2);
            int iO0 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iO0 += com.google.android.gms.internal.measurement.AbstractC5982c4.o0(((java.lang.Integer) list.get(i11)).intValue());
            }
            this.f40940a.U(iO0);
            while (i10 < list.size()) {
                this.f40940a.x0(((java.lang.Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        com.google.android.gms.internal.measurement.C6154w4 c6154w4 = (com.google.android.gms.internal.measurement.C6154w4) list;
        if (!z6) {
            while (i10 < c6154w4.size()) {
                this.f40940a.y0(i6, c6154w4.e(i10));
                i10++;
            }
            return;
        }
        this.f40940a.V(i6, 2);
        int iO1 = 0;
        for (int i12 = 0; i12 < c6154w4.size(); i12++) {
            iO1 += com.google.android.gms.internal.measurement.AbstractC5982c4.o0(c6154w4.e(i12));
        }
        this.f40940a.U(iO1);
        while (i10 < c6154w4.size()) {
            this.f40940a.x0(c6154w4.e(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.X5
    public final void z(int i6, int i10) {
        this.f40940a.K(i6, i10);
    }
}
