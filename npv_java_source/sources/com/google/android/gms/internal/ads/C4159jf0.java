package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4159jf0 extends com.google.android.gms.internal.ads.AbstractC2679Of0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f36711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.lang.String f36712b;

    C4159jf0() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2679Of0
    public final com.google.android.gms.internal.ads.AbstractC2679Of0 a(java.lang.String str) {
        this.f36712b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2679Of0
    public final com.google.android.gms.internal.ads.AbstractC2679Of0 b(java.lang.String str) {
        this.f36711a = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2679Of0
    public final com.google.android.gms.internal.ads.AbstractC2716Pf0 c() {
        return new com.google.android.gms.internal.ads.C4489mf0(this.f36711a, this.f36712b, null);
    }
}
