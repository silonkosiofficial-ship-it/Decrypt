package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yB0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5763yB0 extends com.google.android.gms.internal.ads.AbstractC5628wz0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f40007k = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f40008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f40009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f40010f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f40011g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC4942qm[] f40012h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final java.lang.Object[] f40013i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final java.util.HashMap f40014j;

    /* JADX WARN: Illegal instructions before constructor call */
    public C5763yB0(java.util.Collection collection, com.google.android.gms.internal.ads.II0 ii0) {
        com.google.android.gms.internal.ads.AbstractC4942qm[] abstractC4942qmArr = new com.google.android.gms.internal.ads.AbstractC4942qm[collection.size()];
        java.util.Iterator it = collection.iterator();
        int i6 = 0;
        int i10 = 0;
        while (it.hasNext()) {
            abstractC4942qmArr[i10] = ((com.google.android.gms.internal.ads.InterfaceC3676fB0) it.next()).a();
            i10++;
        }
        java.lang.Object[] objArr = new java.lang.Object[collection.size()];
        java.util.Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            objArr[i6] = ((com.google.android.gms.internal.ads.InterfaceC3676fB0) it2.next()).b();
            i6++;
        }
        this(abstractC4942qmArr, objArr, ii0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private C5763yB0(com.google.android.gms.internal.ads.AbstractC4942qm[] abstractC4942qmArr, java.lang.Object[] objArr, com.google.android.gms.internal.ads.II0 ii0) {
        super(false, ii0);
        int i6 = 0;
        this.f40012h = abstractC4942qmArr;
        int length = abstractC4942qmArr.length;
        this.f40010f = new int[length];
        this.f40011g = new int[length];
        this.f40013i = objArr;
        this.f40014j = new java.util.HashMap();
        int iC = 0;
        int iB = 0;
        int i10 = 0;
        while (i6 < abstractC4942qmArr.length) {
            com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qm = abstractC4942qmArr[i6];
            this.f40012h[i10] = abstractC4942qm;
            this.f40011g[i10] = iC;
            this.f40010f[i10] = iB;
            iC += abstractC4942qm.c();
            iB += this.f40012h[i10].b();
            this.f40014j.put(objArr[i10], java.lang.Integer.valueOf(i10));
            i6++;
            i10++;
        }
        this.f40008d = iC;
        this.f40009e = iB;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4942qm
    public final int b() {
        return this.f40009e;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4942qm
    public final int c() {
        return this.f40008d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5628wz0
    protected final int p(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) this.f40014j.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5628wz0
    protected final int q(int i6) {
        return com.google.android.gms.internal.ads.EW.u(this.f40010f, i6 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5628wz0
    protected final int r(int i6) {
        return com.google.android.gms.internal.ads.EW.u(this.f40011g, i6 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5628wz0
    protected final int s(int i6) {
        return this.f40010f[i6];
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5628wz0
    protected final int t(int i6) {
        return this.f40011g[i6];
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5628wz0
    protected final com.google.android.gms.internal.ads.AbstractC4942qm u(int i6) {
        return this.f40012h[i6];
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5628wz0
    protected final java.lang.Object v(int i6) {
        return this.f40013i[i6];
    }

    final java.util.List y() {
        return java.util.Arrays.asList(this.f40012h);
    }

    public final com.google.android.gms.internal.ads.C5763yB0 z(com.google.android.gms.internal.ads.II0 ii0) {
        com.google.android.gms.internal.ads.AbstractC4942qm[] abstractC4942qmArr = new com.google.android.gms.internal.ads.AbstractC4942qm[this.f40012h.length];
        int i6 = 0;
        while (true) {
            com.google.android.gms.internal.ads.AbstractC4942qm[] abstractC4942qmArr2 = this.f40012h;
            if (i6 >= abstractC4942qmArr2.length) {
                return new com.google.android.gms.internal.ads.C5763yB0(abstractC4942qmArr, this.f40013i, ii0);
            }
            abstractC4942qmArr[i6] = new com.google.android.gms.internal.ads.C5653xB0(this, abstractC4942qmArr2[i6]);
            i6++;
        }
    }
}
