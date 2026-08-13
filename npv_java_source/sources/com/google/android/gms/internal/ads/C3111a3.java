package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.a3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3111a3 extends com.google.android.gms.internal.ads.AbstractC3873h0 implements com.google.android.gms.internal.ads.InterfaceC3549e3 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f33994g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f33995h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f33996i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f33997j;

    public C3111a3(long j6, long j10, int i6, int i10, boolean z6) {
        super(j6, j10, i6, i10, false);
        this.f33994g = j10;
        this.f33995h = i6;
        this.f33996i = i10;
        this.f33997j = j6 == -1 ? -1L : j6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3549e3
    public final int c() {
        return this.f33995h;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3549e3
    public final long f() {
        return this.f33997j;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3549e3
    public final long h(long j6) {
        return d(j6);
    }

    public final com.google.android.gms.internal.ads.C3111a3 i(long j6) {
        return new com.google.android.gms.internal.ads.C3111a3(j6, this.f33994g, this.f33995h, this.f33996i, false);
    }
}
