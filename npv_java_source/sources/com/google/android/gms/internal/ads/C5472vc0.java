package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5472vc0 extends android.content.BroadcastReceiver {
    C5472vc0() {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
            int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
            if (intExtra == 0) {
                com.google.android.gms.internal.ads.AbstractC5582wc0.f39654a = 1;
            } else if (intExtra == 1) {
                com.google.android.gms.internal.ads.AbstractC5582wc0.f39654a = 2;
            }
        }
    }
}
