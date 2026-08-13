package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class SC0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f31642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f31643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f31644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.android.gms.internal.ads.LH0 f31645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f31646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f31647f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.UC0 f31648g;

    public SC0(com.google.android.gms.internal.ads.UC0 uc0, java.lang.String str, int i6, com.google.android.gms.internal.ads.LH0 lh0) {
        this.f31648g = uc0;
        this.f31642a = str;
        this.f31643b = i6;
        this.f31644c = lh0 == null ? -1L : lh0.f29457d;
        if (lh0 == null || !lh0.b()) {
            return;
        }
        this.f31645d = lh0;
    }

    public final void g(int i6, com.google.android.gms.internal.ads.LH0 lh0) {
        if (this.f31644c == -1 && i6 == this.f31643b && lh0 != null) {
            com.google.android.gms.internal.ads.UC0 uc0 = this.f31648g;
            long j6 = lh0.f29457d;
            if (j6 >= uc0.l()) {
                this.f31644c = j6;
            }
        }
    }

    public final boolean j(int i6, com.google.android.gms.internal.ads.LH0 lh0) {
        if (lh0 == null) {
            return i6 == this.f31643b;
        }
        com.google.android.gms.internal.ads.LH0 lh1 = this.f31645d;
        if (lh1 == null) {
            return !lh0.b() && lh0.f29457d == this.f31644c;
        }
        return lh0.f29457d == lh1.f29457d && lh0.f29455b == lh1.f29455b && lh0.f29456c == lh1.f29456c;
    }

    public final boolean k(com.google.android.gms.internal.ads.LB0 lb0) {
        com.google.android.gms.internal.ads.LH0 lh0 = lb0.f29433d;
        if (lh0 == null) {
            return this.f31643b != lb0.f29432c;
        }
        long j6 = this.f31644c;
        if (j6 == -1) {
            return false;
        }
        if (lh0.f29457d > j6) {
            return true;
        }
        if (this.f31645d == null) {
            return false;
        }
        com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qm = lb0.f29431b;
        int iA = abstractC4942qm.a(lh0.f29454a);
        int iA2 = abstractC4942qm.a(this.f31645d.f29454a);
        com.google.android.gms.internal.ads.LH0 lh1 = lb0.f29433d;
        if (lh1.f29457d < this.f31645d.f29457d || iA < iA2) {
            return false;
        }
        if (iA > iA2) {
            return true;
        }
        boolean zB = lh1.b();
        com.google.android.gms.internal.ads.LH0 lh2 = lb0.f29433d;
        if (!zB) {
            int i6 = lh2.f29458e;
            return i6 == -1 || i6 > this.f31645d.f29455b;
        }
        int i10 = lh2.f29455b;
        int i11 = lh2.f29456c;
        com.google.android.gms.internal.ads.LH0 lh3 = this.f31645d;
        int i12 = lh3.f29455b;
        if (i10 <= i12) {
            return i10 == i12 && i11 > lh3.f29456c;
        }
        return true;
    }

    public final boolean l(com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qm, com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qm2) {
        int i6 = this.f31643b;
        if (i6 < abstractC4942qm.c()) {
            abstractC4942qm.e(i6, this.f31648g.f32168a, 0L);
            int i10 = this.f31648g.f32168a.f31051m;
            while (true) {
                if (i10 > this.f31648g.f32168a.f31052n) {
                    i6 = -1;
                    break;
                }
                int iA = abstractC4942qm2.a(abstractC4942qm.f(i10));
                if (iA != -1) {
                    i6 = abstractC4942qm2.d(iA, this.f31648g.f32169b, false).f38060c;
                    break;
                }
                i10++;
            }
        } else if (i6 >= abstractC4942qm2.c()) {
            i6 = -1;
            break;
        }
        this.f31643b = i6;
        if (i6 == -1) {
            return false;
        }
        com.google.android.gms.internal.ads.LH0 lh0 = this.f31645d;
        return lh0 == null || abstractC4942qm2.a(lh0.f29454a) != -1;
    }
}
