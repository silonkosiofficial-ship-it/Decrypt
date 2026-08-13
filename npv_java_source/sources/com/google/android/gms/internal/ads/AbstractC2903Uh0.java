package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Uh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC2903Uh0 {
    static int a(int i6) {
        return (int) (((long) java.lang.Integer.rotateLeft((int) (((long) i6) * (-862048943)), 15)) * 461845907);
    }

    static int b(java.lang.Object obj) {
        return a(obj == null ? 0 : obj.hashCode());
    }
}
