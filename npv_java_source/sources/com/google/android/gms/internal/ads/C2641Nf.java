package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Nf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2641Nf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f30352a = new java.util.HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2752Qf f30353b;

    public C2641Nf(com.google.android.gms.internal.ads.C2752Qf c2752Qf) {
        this.f30353b = c2752Qf;
    }

    public final com.google.android.gms.internal.ads.C2752Qf a() {
        return this.f30353b;
    }

    public final void b(java.lang.String str, com.google.android.gms.internal.ads.C2604Mf c2604Mf) {
        this.f30352a.put(str, c2604Mf);
    }

    public final void c(java.lang.String str, java.lang.String str2, long j6) {
        com.google.android.gms.internal.ads.C2604Mf c2604Mf = (com.google.android.gms.internal.ads.C2604Mf) this.f30352a.get(str2);
        java.lang.String[] strArr = {str};
        if (c2604Mf != null) {
            this.f30353b.e(c2604Mf, j6, strArr);
        }
        this.f30352a.put(str, new com.google.android.gms.internal.ads.C2604Mf(j6, null, null));
    }
}
