package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.iH0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4018iH0 implements com.google.android.gms.internal.ads.InterfaceC5773yG0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.media.MediaCodec f36259a;

    public C4018iH0(android.media.MediaCodec mediaCodec) {
        this.f36259a = mediaCodec;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5773yG0
    public final void a(android.os.Bundle bundle) {
        this.f36259a.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5773yG0
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5773yG0
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5773yG0
    public final void d(int i6, int i10, int i11, long j6, int i12) {
        this.f36259a.queueInputBuffer(i6, 0, i11, j6, i12);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5773yG0
    public final void e(int i6, int i10, com.google.android.gms.internal.ads.Iy0 iy0, long j6, int i11) {
        this.f36259a.queueSecureInputBuffer(i6, 0, iy0.a(), j6, 0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5773yG0
    public final void g() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5773yG0
    public final void i() {
    }
}
