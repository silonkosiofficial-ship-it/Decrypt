package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class KO extends android.telephony.TelephonyCallback implements android.telephony.TelephonyCallback.DisplayInfoListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4908qQ f28905a;

    public KO(com.google.android.gms.internal.ads.C4908qQ c4908qQ) {
        this.f28905a = c4908qQ;
    }

    public final void onDisplayInfoChanged(android.telephony.TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        com.google.android.gms.internal.ads.C4908qQ.c(this.f28905a, true == (overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5) ? 10 : 5);
    }
}
