package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Fp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.util.ArrayList f27455a = new java.util.ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.android.gms.internal.ads.Cp0 f27456b = com.google.android.gms.internal.ads.Cp0.f26289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.Integer f27457c = null;

    public final com.google.android.gms.internal.ads.Fp0 a(com.google.android.gms.internal.ads.Gl0 gl0, int i6, java.lang.String str, java.lang.String str2) {
        java.util.ArrayList arrayList = this.f27455a;
        if (arrayList == null) {
            throw new java.lang.IllegalStateException("addEntry cannot be called after build()");
        }
        arrayList.add(new com.google.android.gms.internal.ads.Gp0(gl0, i6, str, str2, null));
        return this;
    }

    public final com.google.android.gms.internal.ads.Fp0 b(com.google.android.gms.internal.ads.Cp0 cp0) {
        if (this.f27455a == null) {
            throw new java.lang.IllegalStateException("setAnnotations cannot be called after build()");
        }
        this.f27456b = cp0;
        return this;
    }

    public final com.google.android.gms.internal.ads.Fp0 c(int i6) {
        if (this.f27455a == null) {
            throw new java.lang.IllegalStateException("setPrimaryKeyId cannot be called after build()");
        }
        this.f27457c = java.lang.Integer.valueOf(i6);
        return this;
    }

    public final com.google.android.gms.internal.ads.Ip0 d() throws java.security.GeneralSecurityException {
        if (this.f27455a == null) {
            throw new java.lang.IllegalStateException("cannot call build() twice");
        }
        java.lang.Integer num = this.f27457c;
        if (num != null) {
            int iIntValue = num.intValue();
            java.util.ArrayList arrayList = this.f27455a;
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                int iA = ((com.google.android.gms.internal.ads.Gp0) arrayList.get(i6)).a();
                i6++;
                if (iA == iIntValue) {
                }
            }
            throw new java.security.GeneralSecurityException("primary key ID is not present in entries");
        }
        com.google.android.gms.internal.ads.Ip0 ip0 = new com.google.android.gms.internal.ads.Ip0(this.f27456b, j$.util.DesugarCollections.unmodifiableList(this.f27455a), this.f27457c, null);
        this.f27455a = null;
        return ip0;
    }
}
