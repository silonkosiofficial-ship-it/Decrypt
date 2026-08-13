package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vF0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5441vF0 extends android.media.AudioTrack$StreamEventCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C5771yF0 f39367a;

    C5441vF0(com.google.android.gms.internal.ads.C5771yF0 c5771yF0) {
        this.f39367a = c5771yF0;
    }

    public final void onDataRequest(android.media.AudioTrack audioTrack, int i6) {
        audioTrack.equals(this.f39367a.f40025c.f26989q);
    }

    public final void onPresentationEnded(android.media.AudioTrack audioTrack) {
        if (audioTrack.equals(this.f39367a.f40025c.f26989q)) {
            this.f39367a.f40025c.f26959N = true;
        }
    }

    public final void onTearDown(android.media.AudioTrack audioTrack) {
        audioTrack.equals(this.f39367a.f40025c.f26989q);
    }
}
