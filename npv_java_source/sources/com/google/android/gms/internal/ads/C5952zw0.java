package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5952zw0 extends com.google.android.gms.internal.ads.Yu0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final com.google.android.gms.internal.ads.Bw0 f40423C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    com.google.android.gms.internal.ads.InterfaceC3205av0 f40424D = b();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.Dw0 f40425E;

    C5952zw0(com.google.android.gms.internal.ads.Dw0 dw0) {
        this.f40425E = dw0;
        this.f40423C = new com.google.android.gms.internal.ads.Bw0(dw0, null);
    }

    private final com.google.android.gms.internal.ads.InterfaceC3205av0 b() {
        com.google.android.gms.internal.ads.Bw0 bw0 = this.f40423C;
        if (bw0.hasNext()) {
            return bw0.next().iterator();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3205av0
    public final byte a() {
        com.google.android.gms.internal.ads.InterfaceC3205av0 interfaceC3205av0 = this.f40424D;
        if (interfaceC3205av0 == null) {
            throw new java.util.NoSuchElementException();
        }
        byte bA = interfaceC3205av0.a();
        if (!this.f40424D.hasNext()) {
            this.f40424D = b();
        }
        return bA;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f40424D != null;
    }
}
