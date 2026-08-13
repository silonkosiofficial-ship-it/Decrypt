package V0;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    static final class a extends p247y7.AbstractC7352v implements p237x7.q {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ android.text.Spannable f15098D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p237x7.r f15099E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(android.text.Spannable spannable, p237x7.r rVar) {
            super(3);
            this.f15098D = spannable;
            this.f15099E = rVar;
        }

        public final void a(M0.C c6, int i6, int i10) {
            android.text.Spannable spannable = this.f15098D;
            p237x7.r rVar = this.f15099E;
            R0.AbstractC1494h abstractC1494hI = c6.i();
            R0.q qVarN = c6.n();
            if (qVarN == null) {
                qVarN = R0.q.f9331D.d();
            }
            R0.o oVarL = c6.l();
            R0.o oVarC = R0.o.c(oVarL != null ? oVarL.i() : R0.o.f9321b.b());
            R0.p pVarM = c6.m();
            spannable.setSpan(new P0.o((android.graphics.Typeface) rVar.o(abstractC1494hI, qVarN, oVarC, R0.p.e(pVarM != null ? pVarM.k() : R0.p.f9325b.a()))), i6, i10, 33);
        }

        @Override // p237x7.q
        public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            a((M0.C) obj, ((java.lang.Number) obj2).intValue(), ((java.lang.Number) obj3).intValue());
            return p087i7.M.f46721a;
        }
    }

    private static final android.text.style.MetricAffectingSpan a(long j6, Y0.e eVar) {
        long jG = Y0.x.g(j6);
        Y0.z.a aVar = Y0.z.f16241b;
        if (Y0.z.g(jG, aVar.b())) {
            return new P0.f(eVar.g1(j6));
        }
        if (Y0.z.g(jG, aVar.a())) {
            return new P0.e(Y0.x.h(j6));
        }
        return null;
    }

    public static final void b(M0.C c6, java.util.List list, p237x7.q qVar) {
        if (list.size() <= 1) {
            if (!list.isEmpty()) {
                qVar.j(f(c6, (M0.C) ((M0.C1332d.c) list.get(0)).e()), java.lang.Integer.valueOf(((M0.C1332d.c) list.get(0)).f()), java.lang.Integer.valueOf(((M0.C1332d.c) list.get(0)).d()));
                return;
            }
            return;
        }
        int size = list.size();
        int i6 = size * 2;
        java.lang.Integer[] numArr = new java.lang.Integer[i6];
        for (int i10 = 0; i10 < i6; i10++) {
            numArr[i10] = 0;
        }
        int size2 = list.size();
        for (int i11 = 0; i11 < size2; i11++) {
            M0.C1332d.c cVar = (M0.C1332d.c) list.get(i11);
            numArr[i11] = java.lang.Integer.valueOf(cVar.f());
            numArr[i11 + size] = java.lang.Integer.valueOf(cVar.d());
        }
        p097j7.AbstractC6872n.J(numArr);
        int iIntValue = ((java.lang.Number) p097j7.AbstractC6872n.Y(numArr)).intValue();
        for (int i12 = 0; i12 < i6; i12++) {
            java.lang.Integer num = numArr[i12];
            int iIntValue2 = num.intValue();
            if (iIntValue2 != iIntValue) {
                int size3 = list.size();
                M0.C cF = c6;
                for (int i13 = 0; i13 < size3; i13++) {
                    M0.C1332d.c cVar2 = (M0.C1332d.c) list.get(i13);
                    if (cVar2.f() != cVar2.d() && M0.AbstractC1333e.l(iIntValue, iIntValue2, cVar2.f(), cVar2.d())) {
                        cF = f(cF, (M0.C) cVar2.e());
                    }
                }
                if (cF != null) {
                    qVar.j(cF, java.lang.Integer.valueOf(iIntValue), num);
                }
                iIntValue = iIntValue2;
            }
        }
    }

    private static final boolean c(M0.C c6) {
        long jG = Y0.x.g(c6.o());
        Y0.z.a aVar = Y0.z.f16241b;
        return Y0.z.g(jG, aVar.b()) || Y0.z.g(Y0.x.g(c6.o()), aVar.a());
    }

    private static final boolean d(M0.P p6) {
        return V0.f.d(p6.M()) || p6.n() != null;
    }

    private static final boolean e(Y0.e eVar) {
        return ((double) eVar.v0()) > 1.05d;
    }

    private static final M0.C f(M0.C c6, M0.C c10) {
        return c6 == null ? c10 : c6.x(c10);
    }

    private static final float g(long j6, float f6, Y0.e eVar) {
        float fH;
        long jG = Y0.x.g(j6);
        Y0.z.a aVar = Y0.z.f16241b;
        if (Y0.z.g(jG, aVar.b())) {
            if (!e(eVar)) {
                return eVar.g1(j6);
            }
            fH = Y0.x.h(j6) / Y0.x.h(eVar.k0(f6));
        } else {
            if (!Y0.z.g(jG, aVar.a())) {
                return Float.NaN;
            }
            fH = Y0.x.h(j6);
        }
        return fH * f6;
    }

    public static final void h(android.text.Spannable spannable, long j6, int i6, int i10) {
        if (j6 != 16) {
            u(spannable, new android.text.style.BackgroundColorSpan(p141o0.A0.k(j6)), i6, i10);
        }
    }

    private static final void i(android.text.Spannable spannable, X0.a aVar, int i6, int i10) {
        if (aVar != null) {
            u(spannable, new P0.a(aVar.h()), i6, i10);
        }
    }

    private static final void j(android.text.Spannable spannable, p141o0.AbstractC6984n0 abstractC6984n0, float f6, int i6, int i10) {
        if (abstractC6984n0 != null) {
            if (abstractC6984n0 instanceof p141o0.f2) {
                k(spannable, ((p141o0.f2) abstractC6984n0).b(), i6, i10);
            } else if (abstractC6984n0 instanceof p141o0.a2) {
                u(spannable, new W0.b((p141o0.a2) abstractC6984n0, f6), i6, i10);
            }
        }
    }

    public static final void k(android.text.Spannable spannable, long j6, int i6, int i10) {
        if (j6 != 16) {
            u(spannable, new android.text.style.ForegroundColorSpan(p141o0.A0.k(j6)), i6, i10);
        }
    }

    private static final void l(android.text.Spannable spannable, p161q0.h hVar, int i6, int i10) {
        if (hVar != null) {
            u(spannable, new W0.a(hVar), i6, i10);
        }
    }

    private static final void m(android.text.Spannable spannable, M0.P p6, java.util.List list, p237x7.r rVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            java.lang.Object obj = list.get(i6);
            M0.C1332d.c cVar = (M0.C1332d.c) obj;
            if (V0.f.d((M0.C) cVar.e()) || ((M0.C) cVar.e()).m() != null) {
                arrayList.add(obj);
            }
        }
        b(d(p6) ? new M0.C(0L, 0L, p6.o(), p6.m(), p6.n(), p6.j(), null, 0L, null, null, null, 0L, null, null, null, null, 65475, null) : null, arrayList, new V0.e.a(spannable, rVar));
    }

    private static final void n(android.text.Spannable spannable, java.lang.String str, int i6, int i10) {
        if (str != null) {
            u(spannable, new P0.b(str), i6, i10);
        }
    }

    public static final void o(android.text.Spannable spannable, long j6, Y0.e eVar, int i6, int i10) {
        long jG = Y0.x.g(j6);
        Y0.z.a aVar = Y0.z.f16241b;
        if (Y0.z.g(jG, aVar.b())) {
            u(spannable, new android.text.style.AbsoluteSizeSpan(A7.a.d(eVar.g1(j6)), false), i6, i10);
        } else if (Y0.z.g(jG, aVar.a())) {
            u(spannable, new android.text.style.RelativeSizeSpan(Y0.x.h(j6)), i6, i10);
        }
    }

    private static final void p(android.text.Spannable spannable, X0.p pVar, int i6, int i10) {
        if (pVar != null) {
            u(spannable, new android.text.style.ScaleXSpan(pVar.b()), i6, i10);
            u(spannable, new P0.m(pVar.c()), i6, i10);
        }
    }

    public static final void q(android.text.Spannable spannable, long j6, float f6, Y0.e eVar, X0.h hVar) {
        float fG = g(j6, f6, eVar);
        if (java.lang.Float.isNaN(fG)) {
            return;
        }
        u(spannable, new P0.h(fG, 0, (spannable.length() == 0 || S8.r.z1(spannable) == '\n') ? spannable.length() + 1 : spannable.length(), X0.h.c.f(hVar.c()), X0.h.c.g(hVar.c()), hVar.b()), 0, spannable.length());
    }

    public static final void r(android.text.Spannable spannable, long j6, float f6, Y0.e eVar) {
        float fG = g(j6, f6, eVar);
        if (java.lang.Float.isNaN(fG)) {
            return;
        }
        u(spannable, new P0.g(fG), 0, spannable.length());
    }

    public static final void s(android.text.Spannable spannable, T0.h hVar, int i6, int i10) {
        java.lang.Object localeSpan;
        if (hVar != null) {
            if (android.os.Build.VERSION.SDK_INT >= 24) {
                localeSpan = V0.c.f15097a.a(hVar);
            } else {
                localeSpan = new android.text.style.LocaleSpan((hVar.isEmpty() ? T0.g.f12887b.a() : hVar.f(0)).b());
            }
            u(spannable, localeSpan, i6, i10);
        }
    }

    private static final void t(android.text.Spannable spannable, p141o0.c2 c2Var, int i6, int i10) {
        if (c2Var != null) {
            u(spannable, new P0.l(p141o0.A0.k(c2Var.c()), p131n0.g.m(c2Var.d()), p131n0.g.n(c2Var.d()), V0.f.b(c2Var.b())), i6, i10);
        }
    }

    public static final void u(android.text.Spannable spannable, java.lang.Object obj, int i6, int i10) {
        spannable.setSpan(obj, i6, i10, 33);
    }

    private static final void v(android.text.Spannable spannable, M0.C1332d.c cVar, Y0.e eVar) {
        int iF = cVar.f();
        int iD = cVar.d();
        M0.C c6 = (M0.C) cVar.e();
        i(spannable, c6.e(), iF, iD);
        k(spannable, c6.g(), iF, iD);
        j(spannable, c6.f(), c6.c(), iF, iD);
        x(spannable, c6.s(), iF, iD);
        o(spannable, c6.k(), eVar, iF, iD);
        n(spannable, c6.j(), iF, iD);
        p(spannable, c6.u(), iF, iD);
        s(spannable, c6.p(), iF, iD);
        h(spannable, c6.d(), iF, iD);
        t(spannable, c6.r(), iF, iD);
        l(spannable, c6.h(), iF, iD);
    }

    public static final void w(android.text.Spannable spannable, M0.P p6, java.util.List list, Y0.e eVar, p237x7.r rVar) {
        android.text.style.MetricAffectingSpan metricAffectingSpanA;
        m(spannable, p6, list, rVar);
        int size = list.size();
        boolean z6 = false;
        for (int i6 = 0; i6 < size; i6++) {
            M0.C1332d.c cVar = (M0.C1332d.c) list.get(i6);
            int iF = cVar.f();
            int iD = cVar.d();
            if (iF >= 0 && iF < spannable.length() && iD > iF && iD <= spannable.length()) {
                v(spannable, cVar, eVar);
                if (c((M0.C) cVar.e())) {
                    z6 = true;
                }
            }
        }
        if (z6) {
            int size2 = list.size();
            for (int i10 = 0; i10 < size2; i10++) {
                M0.C1332d.c cVar2 = (M0.C1332d.c) list.get(i10);
                int iF2 = cVar2.f();
                int iD2 = cVar2.d();
                M0.C c6 = (M0.C) cVar2.e();
                if (iF2 >= 0 && iF2 < spannable.length() && iD2 > iF2 && iD2 <= spannable.length() && (metricAffectingSpanA = a(c6.o(), eVar)) != null) {
                    u(spannable, metricAffectingSpanA, iF2, iD2);
                }
            }
        }
    }

    public static final void x(android.text.Spannable spannable, X0.k kVar, int i6, int i10) {
        if (kVar != null) {
            X0.k.a aVar = X0.k.f15631b;
            u(spannable, new P0.n(kVar.d(aVar.d()), kVar.d(aVar.b())), i6, i10);
        }
    }

    public static final void y(android.text.Spannable spannable, X0.r rVar, float f6, Y0.e eVar) {
        float fH;
        if (rVar != null) {
            if ((Y0.x.e(rVar.b(), Y0.y.f(0)) && Y0.x.e(rVar.c(), Y0.y.f(0))) || Y0.y.g(rVar.b()) || Y0.y.g(rVar.c())) {
                return;
            }
            long jG = Y0.x.g(rVar.b());
            Y0.z.a aVar = Y0.z.f16241b;
            float fH2 = 0.0f;
            if (Y0.z.g(jG, aVar.b())) {
                fH = eVar.g1(rVar.b());
            } else {
                fH = Y0.z.g(jG, aVar.a()) ? Y0.x.h(rVar.b()) * f6 : 0.0f;
            }
            long jG2 = Y0.x.g(rVar.c());
            if (Y0.z.g(jG2, aVar.b())) {
                fH2 = eVar.g1(rVar.c());
            } else if (Y0.z.g(jG2, aVar.a())) {
                fH2 = Y0.x.h(rVar.c()) * f6;
            }
            u(spannable, new android.text.style.LeadingMarginSpan.Standard((int) java.lang.Math.ceil(fH), (int) java.lang.Math.ceil(fH2)), 0, spannable.length());
        }
    }
}
