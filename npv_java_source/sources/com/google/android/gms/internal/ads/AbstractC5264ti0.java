package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ti0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5264ti0 {
    public static java.util.ArrayList a(int i6) {
        com.google.android.gms.internal.ads.AbstractC5812yh0.a(i6, "initialArraySize");
        return new java.util.ArrayList(i6);
    }

    public static java.util.List b(java.util.List list, com.google.android.gms.internal.ads.InterfaceC4821pg0 interfaceC4821pg0) {
        return list instanceof java.util.RandomAccess ? new com.google.android.gms.internal.ads.C4935qi0(list, interfaceC4821pg0) : new com.google.android.gms.internal.ads.C5154si0(list, interfaceC4821pg0);
    }
}
