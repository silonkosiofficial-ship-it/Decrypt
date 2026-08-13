package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nI0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4568nI0 implements com.google.android.gms.internal.ads.EI0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f37557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C4898qI0 f37558b;

    public C4568nI0(com.google.android.gms.internal.ads.C4898qI0 c4898qI0, int i6) {
        this.f37558b = c4898qI0;
        this.f37557a = i6;
    }

    @Override // com.google.android.gms.internal.ads.EI0
    public final int a(long j6) {
        return this.f37558b.M(this.f37557a, j6);
    }

    @Override // com.google.android.gms.internal.ads.EI0
    public final int b(com.google.android.gms.internal.ads.UA0 ua0, com.google.android.gms.internal.ads.C5518vz0 c5518vz0, int i6) {
        return this.f37558b.L(this.f37557a, ua0, c5518vz0, i6);
    }

    @Override // com.google.android.gms.internal.ads.EI0
    public final boolean d() {
        return this.f37558b.A(this.f37557a);
    }

    @Override // com.google.android.gms.internal.ads.EI0
    public final void f() {
        this.f37558b.y(this.f37557a);
    }
}
