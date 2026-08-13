package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class WS extends com.google.android.gms.internal.ads.AbstractC5350uT {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.app.Activity f32749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p204u3.x f32750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.String f32751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.lang.String f32752d;

    WS() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5350uT
    public final com.google.android.gms.internal.ads.AbstractC5350uT a(android.app.Activity activity) {
        if (activity == null) {
            throw new java.lang.NullPointerException("Null activity");
        }
        this.f32749a = activity;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5350uT
    public final com.google.android.gms.internal.ads.AbstractC5350uT b(p204u3.x xVar) {
        this.f32750b = xVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5350uT
    public final com.google.android.gms.internal.ads.AbstractC5350uT c(java.lang.String str) {
        this.f32751c = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5350uT
    public final com.google.android.gms.internal.ads.AbstractC5350uT d(java.lang.String str) {
        this.f32752d = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5350uT
    public final com.google.android.gms.internal.ads.AbstractC5460vT e() {
        android.app.Activity activity = this.f32749a;
        if (activity != null) {
            return new com.google.android.gms.internal.ads.ZS(activity, this.f32750b, this.f32751c, this.f32752d, null);
        }
        throw new java.lang.IllegalStateException("Missing required properties: activity");
    }
}
