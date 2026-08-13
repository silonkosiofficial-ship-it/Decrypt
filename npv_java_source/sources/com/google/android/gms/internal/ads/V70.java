package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class V70 implements com.google.android.gms.internal.ads.HC {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.HashSet f32411C = new java.util.HashSet();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final android.content.Context f32412D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3022Xq f32413E;

    public V70(android.content.Context context, com.google.android.gms.internal.ads.C3022Xq c3022Xq) {
        this.f32412D = context;
        this.f32413E = c3022Xq;
    }

    public final android.os.Bundle a() {
        return this.f32413E.n(this.f32412D, this);
    }

    public final synchronized void b(java.util.HashSet hashSet) {
        this.f32411C.clear();
        this.f32411C.addAll(hashSet);
    }

    @Override // com.google.android.gms.internal.ads.HC
    public final synchronized void u0(p184s3.W0 w6) {
        if (w6.f54145C != 3) {
            this.f32413E.l(this.f32411C);
        }
    }
}
