package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rF0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5001rF0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.media.AudioTrack f38471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4999rE0 f38472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.media.AudioRouting$OnRoutingChangedListener f38473c = new android.media.AudioRouting$OnRoutingChangedListener() { // from class: com.google.android.gms.internal.ads.mF0
        public final void onRoutingChanged(android.media.AudioRouting audioRouting) {
            com.google.android.gms.internal.ads.C5001rF0.a(this.f37305a, audioRouting);
        }
    };

    public C5001rF0(android.media.AudioTrack audioTrack, com.google.android.gms.internal.ads.C4999rE0 c4999rE0) {
        this.f38471a = audioTrack;
        this.f38472b = c4999rE0;
        audioTrack.addOnRoutingChangedListener(this.f38473c, new android.os.Handler(android.os.Looper.myLooper()));
    }

    public static /* synthetic */ void a(com.google.android.gms.internal.ads.C5001rF0 c5001rF0, android.media.AudioRouting audioRouting) {
        if (c5001rF0.f38473c == null || audioRouting.getRoutedDevice() == null) {
            return;
        }
        c5001rF0.f38472b.h(audioRouting.getRoutedDevice());
    }

    public final void b() {
        android.media.AudioRouting$OnRoutingChangedListener audioRouting$OnRoutingChangedListener = this.f38473c;
        audioRouting$OnRoutingChangedListener.getClass();
        this.f38471a.removeOnRoutingChangedListener(com.google.android.gms.internal.ads.AbstractC4672oF0.a(audioRouting$OnRoutingChangedListener));
        this.f38473c = null;
    }
}
