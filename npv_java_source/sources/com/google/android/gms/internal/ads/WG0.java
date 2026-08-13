package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class WG0 implements com.google.android.gms.internal.ads.VG0 {
    /* synthetic */ WG0(com.google.android.gms.internal.ads.ZG0 zg0) {
    }

    @Override // com.google.android.gms.internal.ads.VG0
    public final android.media.MediaCodecInfo B(int i6) {
        return android.media.MediaCodecList.getCodecInfoAt(i6);
    }

    @Override // com.google.android.gms.internal.ads.VG0
    public final int a() {
        return android.media.MediaCodecList.getCodecCount();
    }

    @Override // com.google.android.gms.internal.ads.VG0
    public final boolean b(java.lang.String str, java.lang.String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // com.google.android.gms.internal.ads.VG0
    public final boolean c(java.lang.String str, java.lang.String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.VG0
    public final boolean d() {
        return false;
    }
}
