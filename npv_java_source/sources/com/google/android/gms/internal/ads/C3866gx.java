package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3866gx implements com.google.android.gms.internal.ads.InterfaceC3208ax {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.KP f35954a;

    C3866gx(com.google.android.gms.internal.ads.KP kp) {
        this.f35954a = kp;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3208ax
    public final void a(java.util.Map map) {
        byte b6;
        com.google.android.gms.internal.ads.KP kp;
        com.google.android.gms.internal.ads.GP gp;
        java.lang.String str = (java.lang.String) map.get("gesture");
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 97520651) {
            if (iHashCode == 109399814 && str.equals("shake")) {
                b6 = 0;
            } else {
                b6 = -1;
            }
        } else if (str.equals("flick")) {
            b6 = 1;
        } else {
            b6 = -1;
        }
        if (b6 == 0) {
            kp = this.f35954a;
            gp = com.google.android.gms.internal.ads.GP.SHAKE;
        } else if (b6 != 1) {
            kp = this.f35954a;
            gp = com.google.android.gms.internal.ads.GP.NONE;
        } else {
            kp = this.f35954a;
            gp = com.google.android.gms.internal.ads.GP.FLICK;
        }
        kp.n(gp);
    }
}
