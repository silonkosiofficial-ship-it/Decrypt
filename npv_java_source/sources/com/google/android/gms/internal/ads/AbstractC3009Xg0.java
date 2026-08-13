package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Xg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3009Xg0 {
    public static com.google.android.gms.internal.ads.InterfaceC2865Tg0 a(com.google.android.gms.internal.ads.InterfaceC2865Tg0 interfaceC2865Tg0) {
        if ((interfaceC2865Tg0 instanceof com.google.android.gms.internal.ads.C2973Wg0) || (interfaceC2865Tg0 instanceof com.google.android.gms.internal.ads.C2901Ug0)) {
            return interfaceC2865Tg0;
        }
        return interfaceC2865Tg0 instanceof java.io.Serializable ? new com.google.android.gms.internal.ads.C2901Ug0(interfaceC2865Tg0) : new com.google.android.gms.internal.ads.C2973Wg0(interfaceC2865Tg0);
    }
}
