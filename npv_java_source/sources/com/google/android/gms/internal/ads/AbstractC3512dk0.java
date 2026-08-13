package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC3512dk0 {
    public static /* synthetic */ boolean a(sun.misc.Unsafe unsafe, java.lang.Object obj, long j6, java.lang.Object obj2, java.lang.Object obj3) {
        while (!com.google.android.gms.internal.ads.AbstractC3402ck0.a(unsafe, obj, j6, obj2, obj3)) {
            if (unsafe.getObject(obj, j6) != obj2) {
                return false;
            }
        }
        return true;
    }
}
