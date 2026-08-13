package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nE0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4560nE0 extends android.media.AudioDeviceCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C4999rE0 f37545a;

    /* synthetic */ C4560nE0(com.google.android.gms.internal.ads.C4999rE0 c4999rE0, com.google.android.gms.internal.ads.AbstractC4890qE0 abstractC4890qE0) {
        this.f37545a = c4999rE0;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(android.media.AudioDeviceInfo[] audioDeviceInfoArr) {
        com.google.android.gms.internal.ads.C4999rE0 c4999rE0 = this.f37545a;
        this.f37545a.j(com.google.android.gms.internal.ads.C4450mE0.c(c4999rE0.f38461a, c4999rE0.f38468h, c4999rE0.f38467g));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(android.media.AudioDeviceInfo[] audioDeviceInfoArr) {
        com.google.android.gms.internal.ads.C5109sE0 c5109sE0 = this.f37545a.f38467g;
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        for (android.media.AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            if (j$.util.Objects.equals(audioDeviceInfo, c5109sE0)) {
                this.f37545a.f38467g = null;
                break;
            }
        }
        com.google.android.gms.internal.ads.C4999rE0 c4999rE0 = this.f37545a;
        c4999rE0.j(com.google.android.gms.internal.ads.C4450mE0.c(c4999rE0.f38461a, c4999rE0.f38468h, c4999rE0.f38467g));
    }
}
