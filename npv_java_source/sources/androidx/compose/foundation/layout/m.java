package androidx.compose.foundation.layout;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ float f19274D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ float f19275E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ float f19276F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ float f19277G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f6, float f10, float f11, float f12) {
            super(1);
            this.f19274D = f6;
            this.f19275E = f10;
            this.f19276F = f11;
            this.f19277G = f12;
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

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ float f19278D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ float f19279E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(float f6, float f10) {
            super(1);
            this.f19278D = f6;
            this.f19279E = f10;
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

    static final class c extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ float f19280D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(float f6) {
            super(1);
            this.f19280D = f6;
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

    static final class d extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ A.B f19281D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(A.B b6) {
            super(1);
            this.f19281D = b6;
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

    public static final A.B a(float f6) {
        return new A.C(f6, f6, f6, f6, null);
    }

    public static final A.B b(float f6, float f10) {
        return new A.C(f6, f10, f6, f10, null);
    }

    public static /* synthetic */ A.B c(float f6, float f10, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            f6 = Y0.i.q(0);
        }
        if ((i6 & 2) != 0) {
            f10 = Y0.i.q(0);
        }
        return b(f6, f10);
    }

    public static final A.B d(float f6, float f10, float f11, float f12) {
        return new A.C(f6, f10, f11, f12, null);
    }

    public static /* synthetic */ A.B e(float f6, float f10, float f11, float f12, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            f6 = Y0.i.q(0);
        }
        if ((i6 & 2) != 0) {
            f10 = Y0.i.q(0);
        }
        if ((i6 & 4) != 0) {
            f11 = Y0.i.q(0);
        }
        if ((i6 & 8) != 0) {
            f12 = Y0.i.q(0);
        }
        return d(f6, f10, f11, f12);
    }

    public static final float f(A.B b6, Y0.v vVar) {
        return vVar == Y0.v.Ltr ? b6.b(vVar) : b6.a(vVar);
    }

    public static final float g(A.B b6, Y0.v vVar) {
        return vVar == Y0.v.Ltr ? b6.a(vVar) : b6.b(vVar);
    }

    public static final androidx.compose.ui.d h(androidx.compose.ui.d dVar, A.B b6) {
        return dVar.b(new androidx.compose.foundation.layout.PaddingValuesElement(b6, new androidx.compose.foundation.layout.m.d(b6)));
    }

    public static final androidx.compose.ui.d i(androidx.compose.ui.d dVar, float f6) {
        return dVar.b(new androidx.compose.foundation.layout.PaddingElement(f6, f6, f6, f6, true, new androidx.compose.foundation.layout.m.c(f6), null));
    }

    public static final androidx.compose.ui.d j(androidx.compose.ui.d dVar, float f6, float f10) {
        return dVar.b(new androidx.compose.foundation.layout.PaddingElement(f6, f10, f6, f10, true, new androidx.compose.foundation.layout.m.b(f6, f10), null));
    }

    public static /* synthetic */ androidx.compose.ui.d k(androidx.compose.ui.d dVar, float f6, float f10, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            f6 = Y0.i.q(0);
        }
        if ((i6 & 2) != 0) {
            f10 = Y0.i.q(0);
        }
        return j(dVar, f6, f10);
    }

    public static final androidx.compose.ui.d l(androidx.compose.ui.d dVar, float f6, float f10, float f11, float f12) {
        return dVar.b(new androidx.compose.foundation.layout.PaddingElement(f6, f10, f11, f12, true, new androidx.compose.foundation.layout.m.a(f6, f10, f11, f12), null));
    }

    public static /* synthetic */ androidx.compose.ui.d m(androidx.compose.ui.d dVar, float f6, float f10, float f11, float f12, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            f6 = Y0.i.q(0);
        }
        if ((i6 & 2) != 0) {
            f10 = Y0.i.q(0);
        }
        if ((i6 & 4) != 0) {
            f11 = Y0.i.q(0);
        }
        if ((i6 & 8) != 0) {
            f12 = Y0.i.q(0);
        }
        return l(dVar, f6, f10, f11, f12);
    }
}
