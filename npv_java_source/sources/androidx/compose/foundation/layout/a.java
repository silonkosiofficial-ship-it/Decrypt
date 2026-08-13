package androidx.compose.foundation.layout;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.a$a, reason: collision with other inner class name */
    static final class C0368a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ D0.AbstractC0882a f19222D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ float f19223E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f19224F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ int f19225G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ int f19226H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ D0.X f19227I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ int f19228J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0368a(D0.AbstractC0882a abstractC0882a, float f6, int i6, int i10, int i11, D0.X x6, int i12) {
            super(1);
            this.f19222D = abstractC0882a;
            this.f19223E = f6;
            this.f19224F = i6;
            this.f19225G = i10;
            this.f19226H = i11;
            this.f19227I = x6;
            this.f19228J = i12;
        }

        public final void a(D0.X.a aVar) {
            int iI0;
            int iW0 = 0;
            if (androidx.compose.foundation.layout.a.d(this.f19222D)) {
                iI0 = 0;
            } else {
                iI0 = !Y0.i.s(this.f19223E, Y0.i.f16208D.c()) ? this.f19224F : (this.f19225G - this.f19226H) - this.f19227I.I0();
            }
            if (androidx.compose.foundation.layout.a.d(this.f19222D)) {
                iW0 = !Y0.i.s(this.f19223E, Y0.i.f16208D.c()) ? this.f19224F : (this.f19228J - this.f19226H) - this.f19227I.w0();
            }
            D0.X.a.l(aVar, this.f19227I, iI0, iW0, 0.0f, 4, null);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((D0.X.a) obj);
            return p087i7.M.f46721a;
        }
    }

    public static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ D0.AbstractC0882a f19229D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ float f19230E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ float f19231F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(D0.AbstractC0882a abstractC0882a, float f6, float f10) {
            super(1);
            this.f19229D = abstractC0882a;
            this.f19230E = f6;
            this.f19231F = f10;
        }

        public final void a(androidx.compose.ui.platform.G0 g6) {
            throw null;
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            androidx.appcompat.app.D.a(obj);
            a(null);
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final D0.K c(D0.M m6, D0.AbstractC0882a abstractC0882a, float f6, float f10, D0.G g6, long j6) {
        D0.X xU = g6.U(d(abstractC0882a) ? Y0.C1859b.d(j6, 0, 0, 0, 0, 11, null) : Y0.C1859b.d(j6, 0, 0, 0, 0, 14, null));
        int iQ = xU.Q(abstractC0882a);
        if (iQ == Integer.MIN_VALUE) {
            iQ = 0;
        }
        int iW0 = d(abstractC0882a) ? xU.w0() : xU.I0();
        int iK = d(abstractC0882a) ? Y0.C1859b.k(j6) : Y0.C1859b.l(j6);
        Y0.i.a aVar = Y0.i.f16208D;
        int i6 = iK - iW0;
        int iK2 = E7.j.k((!Y0.i.s(f6, aVar.c()) ? m6.S0(f6) : 0) - iQ, 0, i6);
        int iK3 = E7.j.k(((!Y0.i.s(f10, aVar.c()) ? m6.S0(f10) : 0) - iW0) + iQ, 0, i6 - iK2);
        int iI0 = d(abstractC0882a) ? xU.I0() : java.lang.Math.max(xU.I0() + iK2 + iK3, Y0.C1859b.n(j6));
        int iMax = d(abstractC0882a) ? java.lang.Math.max(xU.w0() + iK2 + iK3, Y0.C1859b.m(j6)) : xU.w0();
        return D0.L.b(m6, iI0, iMax, null, new androidx.compose.foundation.layout.a.C0368a(abstractC0882a, f6, iK2, iI0, iK3, xU, iMax), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(D0.AbstractC0882a abstractC0882a) {
        return abstractC0882a instanceof D0.C0894m;
    }

    public static final androidx.compose.ui.d e(androidx.compose.ui.d dVar, D0.AbstractC0882a abstractC0882a, float f6, float f10) {
        return dVar.b(new androidx.compose.foundation.layout.AlignmentLineOffsetDpElement(abstractC0882a, f6, f10, androidx.compose.ui.platform.E0.b() ? new androidx.compose.foundation.layout.a.b(abstractC0882a, f6, f10) : androidx.compose.ui.platform.E0.a(), null));
    }

    public static /* synthetic */ androidx.compose.ui.d f(androidx.compose.ui.d dVar, D0.AbstractC0882a abstractC0882a, float f6, float f10, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            f6 = Y0.i.f16208D.c();
        }
        if ((i6 & 4) != 0) {
            f10 = Y0.i.f16208D.c();
        }
        return e(dVar, abstractC0882a, f6, f10);
    }

    public static final androidx.compose.ui.d g(androidx.compose.ui.d dVar, float f6, float f10) {
        Y0.i.a aVar = Y0.i.f16208D;
        return dVar.b(!Y0.i.s(f6, aVar.c()) ? f(androidx.compose.ui.d.f19586a, D0.AbstractC0883b.a(), f6, 0.0f, 4, null) : androidx.compose.ui.d.f19586a).b(!Y0.i.s(f10, aVar.c()) ? f(androidx.compose.ui.d.f19586a, D0.AbstractC0883b.b(), 0.0f, f10, 2, null) : androidx.compose.ui.d.f19586a);
    }
}
