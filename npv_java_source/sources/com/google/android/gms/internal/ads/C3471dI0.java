package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dI0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3471dI0 extends com.google.android.gms.internal.ads.AbstractC5115sH0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Q7 f34681s;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.NH0[] f34682k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final java.util.List f34683l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC4942qm[] f34684m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final java.util.ArrayList f34685n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f34686o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long[][] f34687p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C3142aI0 f34688q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5445vH0 f34689r;

    static {
        com.google.android.gms.internal.ads.I1 i6 = new com.google.android.gms.internal.ads.I1();
        i6.a("MergingMediaSource");
        f34681s = i6.c();
    }

    public C3471dI0(boolean z6, boolean z10, com.google.android.gms.internal.ads.C5445vH0 c5445vH0, com.google.android.gms.internal.ads.NH0... nh0Arr) {
        this.f34682k = nh0Arr;
        this.f34689r = c5445vH0;
        this.f34685n = new java.util.ArrayList(java.util.Arrays.asList(nh0Arr));
        this.f34683l = new java.util.ArrayList(nh0Arr.length);
        int i6 = 0;
        while (true) {
            int length = nh0Arr.length;
            if (i6 >= length) {
                this.f34684m = new com.google.android.gms.internal.ads.AbstractC4942qm[length];
                this.f34687p = new long[0][];
                new java.util.HashMap();
                com.google.android.gms.internal.ads.AbstractC2464Ii0.a(8).b(2).c();
                return;
            }
            this.f34683l.add(new java.util.ArrayList());
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5115sH0
    protected final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.LH0 C(java.lang.Object obj, com.google.android.gms.internal.ads.LH0 lh0) {
        java.util.List list = (java.util.List) this.f34683l.get(((java.lang.Integer) obj).intValue());
        for (int i6 = 0; i6 < list.size(); i6++) {
            if (((com.google.android.gms.internal.ads.C3252bI0) list.get(i6)).f34268a.equals(lh0)) {
                return ((com.google.android.gms.internal.ads.C3252bI0) ((java.util.List) this.f34683l.get(0)).get(i6)).f34268a;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5115sH0, com.google.android.gms.internal.ads.NH0
    public final void J() throws com.google.android.gms.internal.ads.C3142aI0 {
        com.google.android.gms.internal.ads.C3142aI0 c3142aI0 = this.f34688q;
        if (c3142aI0 != null) {
            throw c3142aI0;
        }
        super.J();
    }

    @Override // com.google.android.gms.internal.ads.NH0
    public final void b(com.google.android.gms.internal.ads.JH0 jh0) {
        com.google.android.gms.internal.ads.ZH0 zh0 = (com.google.android.gms.internal.ads.ZH0) jh0;
        for (int i6 = 0; i6 < this.f34682k.length; i6++) {
            java.util.List list = (java.util.List) this.f34683l.get(i6);
            for (int i10 = 0; i10 < list.size(); i10++) {
                if (((com.google.android.gms.internal.ads.C3252bI0) list.get(i10)).f34269b.equals(jh0)) {
                    list.remove(i10);
                    break;
                }
            }
            this.f34682k[i6].b(zh0.m(i6));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4236kH0, com.google.android.gms.internal.ads.NH0
    public final void c(com.google.android.gms.internal.ads.Q7 q10) {
        this.f34682k[0].c(q10);
    }

    @Override // com.google.android.gms.internal.ads.NH0
    public final com.google.android.gms.internal.ads.JH0 e(com.google.android.gms.internal.ads.LH0 lh0, com.google.android.gms.internal.ads.YJ0 yj0, long j6) {
        com.google.android.gms.internal.ads.AbstractC4942qm[] abstractC4942qmArr = this.f34684m;
        int length = this.f34682k.length;
        com.google.android.gms.internal.ads.JH0[] jh0Arr = new com.google.android.gms.internal.ads.JH0[length];
        int iA = abstractC4942qmArr[0].a(lh0.f29454a);
        for (int i6 = 0; i6 < length; i6++) {
            com.google.android.gms.internal.ads.LH0 lh0A = lh0.a(this.f34684m[i6].f(iA));
            jh0Arr[i6] = this.f34682k[i6].e(lh0A, yj0, j6 - this.f34687p[iA][i6]);
            ((java.util.List) this.f34683l.get(i6)).add(new com.google.android.gms.internal.ads.C3252bI0(lh0A, jh0Arr[i6], null));
        }
        return new com.google.android.gms.internal.ads.ZH0(this.f34689r, this.f34687p[iA], jh0Arr);
    }

    @Override // com.google.android.gms.internal.ads.NH0
    public final com.google.android.gms.internal.ads.Q7 l0() {
        com.google.android.gms.internal.ads.NH0[] nh0Arr = this.f34682k;
        return nh0Arr.length > 0 ? nh0Arr[0].l0() : f34681s;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5115sH0, com.google.android.gms.internal.ads.AbstractC4236kH0
    protected final void t(com.google.android.gms.internal.ads.Pv0 pv0) {
        super.t(pv0);
        int i6 = 0;
        while (true) {
            com.google.android.gms.internal.ads.NH0[] nh0Arr = this.f34682k;
            if (i6 >= nh0Arr.length) {
                return;
            }
            z(java.lang.Integer.valueOf(i6), nh0Arr[i6]);
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5115sH0, com.google.android.gms.internal.ads.AbstractC4236kH0
    protected final void w() {
        super.w();
        java.util.Arrays.fill(this.f34684m, (java.lang.Object) null);
        this.f34686o = -1;
        this.f34688q = null;
        this.f34685n.clear();
        java.util.Collections.addAll(this.f34685n, this.f34682k);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5115sH0
    protected final /* bridge */ /* synthetic */ void y(java.lang.Object obj, com.google.android.gms.internal.ads.NH0 nh0, com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qm) {
        int iB;
        java.lang.Integer num = (java.lang.Integer) obj;
        if (this.f34688q != null) {
            return;
        }
        if (this.f34686o == -1) {
            iB = abstractC4942qm.b();
            this.f34686o = iB;
        } else {
            int iB2 = abstractC4942qm.b();
            int i6 = this.f34686o;
            if (iB2 != i6) {
                this.f34688q = new com.google.android.gms.internal.ads.C3142aI0(0);
                return;
            }
            iB = i6;
        }
        if (this.f34687p.length == 0) {
            this.f34687p = (long[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Long.TYPE, iB, this.f34684m.length);
        }
        this.f34685n.remove(nh0);
        this.f34684m[num.intValue()] = abstractC4942qm;
        if (this.f34685n.isEmpty()) {
            u(this.f34684m[0]);
        }
    }
}
