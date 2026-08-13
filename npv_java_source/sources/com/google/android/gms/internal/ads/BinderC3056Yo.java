package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Yo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC3056Yo extends com.google.android.gms.internal.ads.AbstractBinderC3192ap {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.String f33408C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final int f33409D;

    public BinderC3056Yo(java.lang.String str, int i6) {
        this.f33408C = str;
        this.f33409D = i6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3302bp
    public final int b() {
        return this.f33409D;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3302bp
    public final java.lang.String c() {
        return this.f33408C;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != null && (obj instanceof com.google.android.gms.internal.ads.BinderC3056Yo)) {
            com.google.android.gms.internal.ads.BinderC3056Yo binderC3056Yo = (com.google.android.gms.internal.ads.BinderC3056Yo) obj;
            if (Q3.AbstractC1475n.a(this.f33408C, binderC3056Yo.f33408C)) {
                if (Q3.AbstractC1475n.a(java.lang.Integer.valueOf(this.f33409D), java.lang.Integer.valueOf(binderC3056Yo.f33409D))) {
                    return true;
                }
            }
        }
        return false;
    }
}
