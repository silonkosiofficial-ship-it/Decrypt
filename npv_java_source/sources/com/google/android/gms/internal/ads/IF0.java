package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class IF0 implements com.google.android.gms.internal.ads.OE0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.KF0 f28431a;

    /* synthetic */ IF0(com.google.android.gms.internal.ads.KF0 kf0, com.google.android.gms.internal.ads.JF0 jf0) {
        this.f28431a = kf0;
    }

    @Override // com.google.android.gms.internal.ads.OE0
    public final void a(java.lang.Exception exc) {
        com.google.android.gms.internal.ads.AbstractC3586eM.d("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.f28431a.f28861A0.b(exc);
    }
}
