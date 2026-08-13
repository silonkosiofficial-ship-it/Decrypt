package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5113sG0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.HashSet f38710a = new java.util.HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.media.LoudnessCodecController f38711b;

    public C5113sG0(com.google.android.gms.internal.ads.InterfaceC5003rG0 interfaceC5003rG0) {
    }

    public final void a(android.media.MediaCodec mediaCodec) {
        android.media.LoudnessCodecController loudnessCodecController = this.f38711b;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            com.google.android.gms.internal.ads.LC.f(this.f38710a.add(mediaCodec));
        }
    }

    public final void b() {
        this.f38710a.clear();
        android.media.LoudnessCodecController loudnessCodecController = this.f38711b;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(android.media.MediaCodec mediaCodec) {
        android.media.LoudnessCodecController loudnessCodecController;
        if (!this.f38710a.remove(mediaCodec) || (loudnessCodecController = this.f38711b) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public final void d(int i6) {
        android.media.LoudnessCodecController loudnessCodecController = this.f38711b;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f38711b = null;
        }
        android.media.LoudnessCodecController loudnessCodecControllerCreate = android.media.LoudnessCodecController.create(i6, com.google.android.gms.internal.ads.AbstractC3733fl0.c(), new com.google.android.gms.internal.ads.C4784pG0(this));
        this.f38711b = loudnessCodecControllerCreate;
        java.util.Iterator it = this.f38710a.iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec((android.media.MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
