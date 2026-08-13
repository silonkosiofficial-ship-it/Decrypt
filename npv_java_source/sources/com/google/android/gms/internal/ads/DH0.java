package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class DH0 extends com.google.android.gms.internal.ads.AbstractC5775yH0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final java.lang.Object f26635e = new java.lang.Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Object f26636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.Object f26637d;

    private DH0(com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qm, java.lang.Object obj, java.lang.Object obj2) {
        super(abstractC4942qm);
        this.f26636c = obj;
        this.f26637d = obj2;
    }

    public static com.google.android.gms.internal.ads.DH0 q(com.google.android.gms.internal.ads.Q7 q10) {
        return new com.google.android.gms.internal.ads.DH0(new com.google.android.gms.internal.ads.FH0(q10), com.google.android.gms.internal.ads.C2764Ql.f31037o, f26635e);
    }

    public static com.google.android.gms.internal.ads.DH0 r(com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qm, java.lang.Object obj, java.lang.Object obj2) {
        return new com.google.android.gms.internal.ads.DH0(abstractC4942qm, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5775yH0, com.google.android.gms.internal.ads.AbstractC4942qm
    public final int a(java.lang.Object obj) {
        java.lang.Object obj2;
        if (f26635e.equals(obj) && (obj2 = this.f26637d) != null) {
            obj = obj2;
        }
        return this.f40027b.a(obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5775yH0, com.google.android.gms.internal.ads.AbstractC4942qm
    public final com.google.android.gms.internal.ads.C4830pl d(int i6, com.google.android.gms.internal.ads.C4830pl c4830pl, boolean z6) {
        this.f40027b.d(i6, c4830pl, z6);
        if (j$.util.Objects.equals(c4830pl.f38059b, this.f26637d) && z6) {
            c4830pl.f38059b = f26635e;
        }
        return c4830pl;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5775yH0, com.google.android.gms.internal.ads.AbstractC4942qm
    public final com.google.android.gms.internal.ads.C2764Ql e(int i6, com.google.android.gms.internal.ads.C2764Ql c2764Ql, long j6) {
        this.f40027b.e(i6, c2764Ql, j6);
        if (j$.util.Objects.equals(c2764Ql.f31039a, this.f26636c)) {
            c2764Ql.f31039a = com.google.android.gms.internal.ads.C2764Ql.f31037o;
        }
        return c2764Ql;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5775yH0, com.google.android.gms.internal.ads.AbstractC4942qm
    public final java.lang.Object f(int i6) {
        java.lang.Object objF = this.f40027b.f(i6);
        return j$.util.Objects.equals(objF, this.f26637d) ? f26635e : objF;
    }

    public final com.google.android.gms.internal.ads.DH0 p(com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qm) {
        return new com.google.android.gms.internal.ads.DH0(abstractC4942qm, this.f26636c, this.f26637d);
    }
}
