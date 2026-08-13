package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.tF0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5221tF0 implements com.google.android.gms.internal.ads.UE0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.EF0 f38912a;

    /* synthetic */ C5221tF0(com.google.android.gms.internal.ads.EF0 ef0, com.google.android.gms.internal.ads.AbstractC5881zF0 abstractC5881zF0) {
        this.f38912a = ef0;
    }

    @Override // com.google.android.gms.internal.ads.UE0
    public final void a(long j6) {
        com.google.android.gms.internal.ads.EF0 ef0 = this.f38912a;
        if (ef0.f26985m != null) {
            ((com.google.android.gms.internal.ads.IF0) ef0.f26985m).f28431a.f28861A0.v(j6);
        }
    }

    @Override // com.google.android.gms.internal.ads.UE0
    public final void b(long j6) {
        com.google.android.gms.internal.ads.AbstractC3586eM.f("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j6);
    }

    @Override // com.google.android.gms.internal.ads.UE0
    public final void i(int i6, long j6) {
        com.google.android.gms.internal.ads.EF0 ef0 = this.f38912a;
        if (ef0.f26985m != null) {
            ((com.google.android.gms.internal.ads.IF0) this.f38912a.f26985m).f28431a.f28861A0.x(i6, j6, android.os.SystemClock.elapsedRealtime() - ef0.f26964S);
        }
    }

    @Override // com.google.android.gms.internal.ads.UE0
    public final void j(long j6, long j10, long j11, long j12) {
        com.google.android.gms.internal.ads.EF0 ef0 = this.f38912a;
        com.google.android.gms.internal.ads.AbstractC3586eM.f("DefaultAudioSink", "Spurious audio timestamp (frame position mismatch): " + j6 + ", " + j10 + ", " + j11 + ", " + j12 + ", " + ef0.I() + ", " + ef0.K());
    }

    @Override // com.google.android.gms.internal.ads.UE0
    public final void k(long j6, long j10, long j11, long j12) {
        com.google.android.gms.internal.ads.EF0 ef0 = this.f38912a;
        com.google.android.gms.internal.ads.AbstractC3586eM.f("DefaultAudioSink", "Spurious audio timestamp (system clock mismatch): " + j6 + ", " + j10 + ", " + j11 + ", " + j12 + ", " + ef0.I() + ", " + ef0.K());
    }
}
