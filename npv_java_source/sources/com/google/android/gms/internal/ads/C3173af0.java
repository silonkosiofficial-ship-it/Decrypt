package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.af0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3173af0 extends com.google.android.gms.internal.ads.AbstractC4599nf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f34117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.lang.String f34118b;

    C3173af0() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4599nf0
    public final com.google.android.gms.internal.ads.AbstractC4599nf0 a(java.lang.String str) {
        this.f34118b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4599nf0
    public final com.google.android.gms.internal.ads.AbstractC4599nf0 b(java.lang.String str) {
        this.f34117a = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4599nf0
    public final com.google.android.gms.internal.ads.AbstractC4709of0 c() {
        return new com.google.android.gms.internal.ads.C3392cf0(this.f34117a, this.f34118b, null);
    }
}
