package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.s50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5091s50 {
    public static void a(java.util.concurrent.atomic.AtomicReference atomicReference, com.google.android.gms.internal.ads.InterfaceC4981r50 interfaceC4981r50) {
        java.lang.Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            interfaceC4981r50.b(obj);
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
        } catch (java.lang.NullPointerException e10) {
            p224w3.p.h("NullPointerException occurs when invoking a method from a delegating listener.", e10);
        }
    }
}
