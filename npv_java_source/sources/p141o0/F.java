package p141o0;

/* JADX INFO: loaded from: classes.dex */
public abstract class F {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f52117a;

        static {
            int[] iArr = new int[android.graphics.BlendMode.values().length];
            try {
                iArr[android.graphics.BlendMode.CLEAR.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[android.graphics.BlendMode.SRC.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[android.graphics.BlendMode.DST.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[android.graphics.BlendMode.SRC_OVER.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[android.graphics.BlendMode.DST_OVER.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[android.graphics.BlendMode.SRC_IN.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[android.graphics.BlendMode.DST_IN.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[android.graphics.BlendMode.SRC_OUT.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[android.graphics.BlendMode.DST_OUT.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[android.graphics.BlendMode.SRC_ATOP.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr[android.graphics.BlendMode.DST_ATOP.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr[android.graphics.BlendMode.XOR.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr[android.graphics.BlendMode.PLUS.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr[android.graphics.BlendMode.MODULATE.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr[android.graphics.BlendMode.SCREEN.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr[android.graphics.BlendMode.OVERLAY.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr[android.graphics.BlendMode.DARKEN.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                iArr[android.graphics.BlendMode.LIGHTEN.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                iArr[android.graphics.BlendMode.COLOR_DODGE.ordinal()] = 19;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                iArr[android.graphics.BlendMode.COLOR_BURN.ordinal()] = 20;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                iArr[android.graphics.BlendMode.HARD_LIGHT.ordinal()] = 21;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                iArr[android.graphics.BlendMode.SOFT_LIGHT.ordinal()] = 22;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                iArr[android.graphics.BlendMode.DIFFERENCE.ordinal()] = 23;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            try {
                iArr[android.graphics.BlendMode.EXCLUSION.ordinal()] = 24;
            } catch (java.lang.NoSuchFieldError unused24) {
            }
            try {
                iArr[android.graphics.BlendMode.MULTIPLY.ordinal()] = 25;
            } catch (java.lang.NoSuchFieldError unused25) {
            }
            try {
                iArr[android.graphics.BlendMode.HUE.ordinal()] = 26;
            } catch (java.lang.NoSuchFieldError unused26) {
            }
            try {
                iArr[android.graphics.BlendMode.SATURATION.ordinal()] = 27;
            } catch (java.lang.NoSuchFieldError unused27) {
            }
            try {
                iArr[android.graphics.BlendMode.COLOR.ordinal()] = 28;
            } catch (java.lang.NoSuchFieldError unused28) {
            }
            try {
                iArr[android.graphics.BlendMode.LUMINOSITY.ordinal()] = 29;
            } catch (java.lang.NoSuchFieldError unused29) {
            }
            f52117a = iArr;
        }
    }

    public static final android.graphics.BlendMode a(int i6) {
        p141o0.AbstractC6960f0.a aVar = p141o0.AbstractC6960f0.f52197a;
        if (p141o0.AbstractC6960f0.E(i6, aVar.a())) {
            return android.graphics.BlendMode.CLEAR;
        }
        if (p141o0.AbstractC6960f0.E(i6, aVar.x())) {
            return android.graphics.BlendMode.SRC;
        }
        if (p141o0.AbstractC6960f0.E(i6, aVar.g())) {
            return android.graphics.BlendMode.DST;
        }
        if (!p141o0.AbstractC6960f0.E(i6, aVar.B())) {
            if (p141o0.AbstractC6960f0.E(i6, aVar.k())) {
                return android.graphics.BlendMode.DST_OVER;
            }
            if (p141o0.AbstractC6960f0.E(i6, aVar.z())) {
                return android.graphics.BlendMode.SRC_IN;
            }
            if (p141o0.AbstractC6960f0.E(i6, aVar.i())) {
                return android.graphics.BlendMode.DST_IN;
            }
            if (p141o0.AbstractC6960f0.E(i6, aVar.A())) {
                return android.graphics.BlendMode.SRC_OUT;
            }
            if (p141o0.AbstractC6960f0.E(i6, aVar.j())) {
                return android.graphics.BlendMode.DST_OUT;
            }
            if (p141o0.AbstractC6960f0.E(i6, aVar.y())) {
                return android.graphics.BlendMode.SRC_ATOP;
            }
            if (p141o0.AbstractC6960f0.E(i6, aVar.h())) {
                return android.graphics.BlendMode.DST_ATOP;
            }
            if (p141o0.AbstractC6960f0.E(i6, aVar.C())) {
                return android.graphics.BlendMode.XOR;
            }
            if (p141o0.AbstractC6960f0.E(i6, aVar.t())) {
                return android.graphics.BlendMode.PLUS;
            }
            if (p141o0.AbstractC6960f0.E(i6, aVar.q())) {
                return android.graphics.BlendMode.MODULATE;
            }
            if (p141o0.AbstractC6960f0.E(i6, aVar.v())) {
                return android.graphics.BlendMode.SCREEN;
            }
            if (p141o0.AbstractC6960f0.E(i6, aVar.s())) {
                return android.graphics.BlendMode.OVERLAY;
            }
            if (p141o0.AbstractC6960f0.E(i6, aVar.e())) {
                return android.graphics.BlendMode.DARKEN;
            }
            if (p141o0.AbstractC6960f0.E(i6, aVar.o())) {
                return android.graphics.BlendMode.LIGHTEN;
            }
            if (p141o0.AbstractC6960f0.E(i6, aVar.d())) {
                return android.graphics.BlendMode.COLOR_DODGE;
            }
            if (p141o0.AbstractC6960f0.E(i6, aVar.c())) {
                return android.graphics.BlendMode.COLOR_BURN;
            }
            if (p141o0.AbstractC6960f0.E(i6, aVar.m())) {
                return android.graphics.BlendMode.HARD_LIGHT;
            }
            if (p141o0.AbstractC6960f0.E(i6, aVar.w())) {
                return android.graphics.BlendMode.SOFT_LIGHT;
            }
            if (p141o0.AbstractC6960f0.E(i6, aVar.f())) {
                return android.graphics.BlendMode.DIFFERENCE;
            }
            if (p141o0.AbstractC6960f0.E(i6, aVar.l())) {
                return android.graphics.BlendMode.EXCLUSION;
            }
            if (p141o0.AbstractC6960f0.E(i6, aVar.r())) {
                return android.graphics.BlendMode.MULTIPLY;
            }
            if (p141o0.AbstractC6960f0.E(i6, aVar.n())) {
                return android.graphics.BlendMode.HUE;
            }
            if (p141o0.AbstractC6960f0.E(i6, aVar.u())) {
                return android.graphics.BlendMode.SATURATION;
            }
            if (p141o0.AbstractC6960f0.E(i6, aVar.b())) {
                return android.graphics.BlendMode.COLOR;
            }
            if (p141o0.AbstractC6960f0.E(i6, aVar.p())) {
                return android.graphics.BlendMode.LUMINOSITY;
            }
        }
        return android.graphics.BlendMode.SRC_OVER;
    }

    public static final int b(android.graphics.BlendMode blendMode) {
        switch (o0.F.a.f52117a[blendMode.ordinal()]) {
            case 1:
                return p141o0.AbstractC6960f0.f52197a.a();
            case 2:
                return p141o0.AbstractC6960f0.f52197a.x();
            case 3:
                return p141o0.AbstractC6960f0.f52197a.g();
            case 4:
            default:
                return p141o0.AbstractC6960f0.f52197a.B();
            case 5:
                return p141o0.AbstractC6960f0.f52197a.k();
            case 6:
                return p141o0.AbstractC6960f0.f52197a.z();
            case 7:
                return p141o0.AbstractC6960f0.f52197a.i();
            case 8:
                return p141o0.AbstractC6960f0.f52197a.A();
            case 9:
                return p141o0.AbstractC6960f0.f52197a.j();
            case 10:
                return p141o0.AbstractC6960f0.f52197a.y();
            case 11:
                return p141o0.AbstractC6960f0.f52197a.h();
            case 12:
                return p141o0.AbstractC6960f0.f52197a.C();
            case 13:
                return p141o0.AbstractC6960f0.f52197a.t();
            case 14:
                return p141o0.AbstractC6960f0.f52197a.q();
            case 15:
                return p141o0.AbstractC6960f0.f52197a.v();
            case 16:
                return p141o0.AbstractC6960f0.f52197a.s();
            case 17:
                return p141o0.AbstractC6960f0.f52197a.e();
            case 18:
                return p141o0.AbstractC6960f0.f52197a.o();
            case 19:
                return p141o0.AbstractC6960f0.f52197a.d();
            case 20:
                return p141o0.AbstractC6960f0.f52197a.c();
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                return p141o0.AbstractC6960f0.f52197a.m();
            case 22:
                return p141o0.AbstractC6960f0.f52197a.w();
            case 23:
                return p141o0.AbstractC6960f0.f52197a.f();
            case 24:
                return p141o0.AbstractC6960f0.f52197a.l();
            case 25:
                return p141o0.AbstractC6960f0.f52197a.r();
            case 26:
                return p141o0.AbstractC6960f0.f52197a.n();
            case 27:
                return p141o0.AbstractC6960f0.f52197a.u();
            case 28:
                return p141o0.AbstractC6960f0.f52197a.b();
            case 29:
                return p141o0.AbstractC6960f0.f52197a.p();
        }
    }

    public static final android.graphics.PorterDuff.Mode c(int i6) {
        p141o0.AbstractC6960f0.a aVar = p141o0.AbstractC6960f0.f52197a;
        if (p141o0.AbstractC6960f0.E(i6, aVar.a())) {
            return android.graphics.PorterDuff.Mode.CLEAR;
        }
        if (p141o0.AbstractC6960f0.E(i6, aVar.x())) {
            return android.graphics.PorterDuff.Mode.SRC;
        }
        if (p141o0.AbstractC6960f0.E(i6, aVar.g())) {
            return android.graphics.PorterDuff.Mode.DST;
        }
        if (!p141o0.AbstractC6960f0.E(i6, aVar.B())) {
            if (p141o0.AbstractC6960f0.E(i6, aVar.k())) {
                return android.graphics.PorterDuff.Mode.DST_OVER;
            }
            if (p141o0.AbstractC6960f0.E(i6, aVar.z())) {
                return android.graphics.PorterDuff.Mode.SRC_IN;
            }
            if (p141o0.AbstractC6960f0.E(i6, aVar.i())) {
                return android.graphics.PorterDuff.Mode.DST_IN;
            }
            if (p141o0.AbstractC6960f0.E(i6, aVar.A())) {
                return android.graphics.PorterDuff.Mode.SRC_OUT;
            }
            if (p141o0.AbstractC6960f0.E(i6, aVar.j())) {
                return android.graphics.PorterDuff.Mode.DST_OUT;
            }
            if (p141o0.AbstractC6960f0.E(i6, aVar.y())) {
                return android.graphics.PorterDuff.Mode.SRC_ATOP;
            }
            if (p141o0.AbstractC6960f0.E(i6, aVar.h())) {
                return android.graphics.PorterDuff.Mode.DST_ATOP;
            }
            if (p141o0.AbstractC6960f0.E(i6, aVar.C())) {
                return android.graphics.PorterDuff.Mode.XOR;
            }
            if (p141o0.AbstractC6960f0.E(i6, aVar.t())) {
                return android.graphics.PorterDuff.Mode.ADD;
            }
            if (p141o0.AbstractC6960f0.E(i6, aVar.v())) {
                return android.graphics.PorterDuff.Mode.SCREEN;
            }
            if (p141o0.AbstractC6960f0.E(i6, aVar.s())) {
                return android.graphics.PorterDuff.Mode.OVERLAY;
            }
            if (p141o0.AbstractC6960f0.E(i6, aVar.e())) {
                return android.graphics.PorterDuff.Mode.DARKEN;
            }
            if (p141o0.AbstractC6960f0.E(i6, aVar.o())) {
                return android.graphics.PorterDuff.Mode.LIGHTEN;
            }
            if (p141o0.AbstractC6960f0.E(i6, aVar.q())) {
                return android.graphics.PorterDuff.Mode.MULTIPLY;
            }
        }
        return android.graphics.PorterDuff.Mode.SRC_OVER;
    }
}
