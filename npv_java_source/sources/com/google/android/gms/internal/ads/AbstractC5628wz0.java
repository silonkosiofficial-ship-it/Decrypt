package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5628wz0 extends com.google.android.gms.internal.ads.AbstractC4942qm {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f39755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.II0 f39756c;

    public AbstractC5628wz0(boolean z6, com.google.android.gms.internal.ads.II0 ii0) {
        this.f39756c = ii0;
        this.f39755b = ii0.c();
    }

    private final int w(int i6, boolean z6) {
        if (z6) {
            return this.f39756c.d(i6);
        }
        if (i6 >= this.f39755b - 1) {
            return -1;
        }
        return i6 + 1;
    }

    private final int x(int i6, boolean z6) {
        if (z6) {
            return this.f39756c.e(i6);
        }
        if (i6 <= 0) {
            return -1;
        }
        return i6 - 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4942qm
    public final int a(java.lang.Object obj) {
        int iA;
        if (obj instanceof android.util.Pair) {
            android.util.Pair pair = (android.util.Pair) obj;
            java.lang.Object obj2 = pair.first;
            java.lang.Object obj3 = pair.second;
            int iP = p(obj2);
            if (iP != -1 && (iA = u(iP).a(obj3)) != -1) {
                return s(iP) + iA;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4942qm
    public final com.google.android.gms.internal.ads.C4830pl d(int i6, com.google.android.gms.internal.ads.C4830pl c4830pl, boolean z6) {
        int iQ = q(i6);
        int iT = t(iQ);
        u(iQ).d(i6 - s(iQ), c4830pl, z6);
        c4830pl.f38060c += iT;
        if (z6) {
            java.lang.Object objV = v(iQ);
            java.lang.Object obj = c4830pl.f38059b;
            obj.getClass();
            c4830pl.f38059b = android.util.Pair.create(objV, obj);
        }
        return c4830pl;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4942qm
    public final com.google.android.gms.internal.ads.C2764Ql e(int i6, com.google.android.gms.internal.ads.C2764Ql c2764Ql, long j6) {
        int iR = r(i6);
        int iT = t(iR);
        int iS = s(iR);
        u(iR).e(i6 - iT, c2764Ql, j6);
        java.lang.Object objV = v(iR);
        if (!com.google.android.gms.internal.ads.C2764Ql.f31037o.equals(c2764Ql.f31039a)) {
            objV = android.util.Pair.create(objV, c2764Ql.f31039a);
        }
        c2764Ql.f31039a = objV;
        c2764Ql.f31051m += iS;
        c2764Ql.f31052n += iS;
        return c2764Ql;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4942qm
    public final java.lang.Object f(int i6) {
        int iQ = q(i6);
        return android.util.Pair.create(v(iQ), u(iQ).f(i6 - s(iQ)));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4942qm
    public final int g(boolean z6) {
        if (this.f39755b != 0) {
            int iA = z6 ? this.f39756c.a() : 0;
            while (u(iA).o()) {
                iA = w(iA, z6);
                if (iA == -1) {
                }
            }
            return t(iA) + u(iA).g(z6);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4942qm
    public final int h(boolean z6) {
        int i6 = this.f39755b;
        if (i6 != 0) {
            int iB = z6 ? this.f39756c.b() : i6 - 1;
            while (u(iB).o()) {
                iB = x(iB, z6);
                if (iB == -1) {
                }
            }
            return t(iB) + u(iB).h(z6);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4942qm
    public final int j(int i6, int i10, boolean z6) {
        int iR = r(i6);
        int iT = t(iR);
        int iJ = u(iR).j(i6 - iT, i10 == 2 ? 0 : i10, z6);
        if (iJ != -1) {
            return iT + iJ;
        }
        int iW = w(iR, z6);
        while (iW != -1 && u(iW).o()) {
            iW = w(iW, z6);
        }
        if (iW != -1) {
            return t(iW) + u(iW).g(z6);
        }
        if (i10 == 2) {
            return g(z6);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4942qm
    public final int k(int i6, int i10, boolean z6) {
        int iR = r(i6);
        int iT = t(iR);
        int iK = u(iR).k(i6 - iT, 0, false);
        if (iK != -1) {
            return iT + iK;
        }
        int iX = x(iR, false);
        while (iX != -1 && u(iX).o()) {
            iX = x(iX, false);
        }
        if (iX != -1) {
            return t(iX) + u(iX).h(false);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4942qm
    public final com.google.android.gms.internal.ads.C4830pl n(java.lang.Object obj, com.google.android.gms.internal.ads.C4830pl c4830pl) {
        android.util.Pair pair = (android.util.Pair) obj;
        java.lang.Object obj2 = pair.first;
        java.lang.Object obj3 = pair.second;
        int iP = p(obj2);
        int iT = t(iP);
        u(iP).n(obj3, c4830pl);
        c4830pl.f38060c += iT;
        c4830pl.f38059b = obj;
        return c4830pl;
    }

    protected abstract int p(java.lang.Object obj);

    protected abstract int q(int i6);

    protected abstract int r(int i6);

    protected abstract int s(int i6);

    protected abstract int t(int i6);

    protected abstract com.google.android.gms.internal.ads.AbstractC4942qm u(int i6);

    protected abstract java.lang.Object v(int i6);
}
