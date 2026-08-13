package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.mq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC4510mq {
    public static /* synthetic */ boolean a(java.util.concurrent.atomic.AtomicReference atomicReference, java.lang.Object obj, java.lang.Object obj2) {
        while (!p200u.AbstractC7162c0.a(atomicReference, null, obj2)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }
}
