package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class XG0 implements com.google.android.gms.internal.ads.VG0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f33104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.media.MediaCodecInfo[] f33105b;

    public XG0(boolean z6, boolean z10) {
        int i6 = 1;
        if (!z6 && !z10) {
            i6 = 0;
        }
        this.f33104a = i6;
    }

    private final void e() {
        if (this.f33105b == null) {
            this.f33105b = new android.media.MediaCodecList(this.f33104a).getCodecInfos();
        }
    }

    @Override // com.google.android.gms.internal.ads.VG0
    public final android.media.MediaCodecInfo B(int i6) {
        e();
        return this.f33105b[i6];
    }

    @Override // com.google.android.gms.internal.ads.VG0
    public final int a() {
        e();
        return this.f33105b.length;
    }

    @Override // com.google.android.gms.internal.ads.VG0
    public final boolean b(java.lang.String str, java.lang.String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // com.google.android.gms.internal.ads.VG0
    public final boolean c(java.lang.String str, java.lang.String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // com.google.android.gms.internal.ads.VG0
    public final boolean d() {
        return true;
    }
}
