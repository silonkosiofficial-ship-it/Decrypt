package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class IG0 extends java.lang.Exception {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final java.lang.String f28432C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final boolean f28433D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.AG0 f28434E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final java.lang.String f28435F;

    public IG0(com.google.android.gms.internal.ads.D d6, java.lang.Throwable th, boolean z6, int i6) {
        this("Decoder init failed: [" + i6 + "], " + d6.toString(), th, d6.f26574o, false, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_" + java.lang.Math.abs(i6), null);
    }

    public IG0(com.google.android.gms.internal.ads.D d6, java.lang.Throwable th, boolean z6, com.google.android.gms.internal.ads.AG0 ag0) {
        this("Decoder init failed: " + ag0.f25094a + ", " + d6.toString(), th, d6.f26574o, false, ag0, th instanceof android.media.MediaCodec.CodecException ? ((android.media.MediaCodec.CodecException) th).getDiagnosticInfo() : null, null);
    }

    private IG0(java.lang.String str, java.lang.Throwable th, java.lang.String str2, boolean z6, com.google.android.gms.internal.ads.AG0 ag0, java.lang.String str3, com.google.android.gms.internal.ads.IG0 ig0) {
        super(str, th);
        this.f28432C = str2;
        this.f28433D = false;
        this.f28434E = ag0;
        this.f28435F = str3;
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.IG0 a(com.google.android.gms.internal.ads.IG0 ig0, com.google.android.gms.internal.ads.IG0 ig1) {
        return new com.google.android.gms.internal.ads.IG0(ig0.getMessage(), ig0.getCause(), ig0.f28432C, false, ig0.f28434E, ig0.f28435F, ig1);
    }
}
