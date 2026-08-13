package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C5883zG0 extends com.google.android.gms.internal.ads.AbstractC4199jz0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final java.lang.String f40244C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f40245D;

    public C5883zG0(java.lang.Throwable th, com.google.android.gms.internal.ads.AG0 ag0) {
        super("Decoder failed: ".concat(java.lang.String.valueOf(ag0 == null ? null : ag0.f25094a)), th);
        boolean z6 = th instanceof android.media.MediaCodec.CodecException;
        java.lang.String diagnosticInfo = z6 ? ((android.media.MediaCodec.CodecException) th).getDiagnosticInfo() : null;
        this.f40244C = diagnosticInfo;
        this.f40245D = com.google.android.gms.internal.ads.EW.f27061a >= 23 ? z6 ? ((android.media.MediaCodec.CodecException) th).getErrorCode() : 0 : com.google.android.gms.internal.ads.EW.E(diagnosticInfo);
    }
}
