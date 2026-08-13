package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.e90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3562e90 {
    public static final com.google.android.gms.internal.ads.C4330l90 a(java.util.concurrent.Callable callable, java.lang.Object obj, com.google.android.gms.internal.ads.AbstractC4550n90 abstractC4550n90) {
        return b(callable, abstractC4550n90.f37530a, obj, abstractC4550n90);
    }

    public static final com.google.android.gms.internal.ads.C4330l90 b(java.util.concurrent.Callable callable, com.google.android.gms.internal.ads.Yk0 yk0, java.lang.Object obj, com.google.android.gms.internal.ads.AbstractC4550n90 abstractC4550n90) {
        return new com.google.android.gms.internal.ads.C4330l90(abstractC4550n90, obj, com.google.android.gms.internal.ads.AbstractC4550n90.f37529d, java.util.Collections.emptyList(), yk0.H0(callable));
    }

    public static final com.google.android.gms.internal.ads.C4330l90 c(P4.d dVar, java.lang.Object obj, com.google.android.gms.internal.ads.AbstractC4550n90 abstractC4550n90) {
        return new com.google.android.gms.internal.ads.C4330l90(abstractC4550n90, obj, com.google.android.gms.internal.ads.AbstractC4550n90.f37529d, java.util.Collections.emptyList(), dVar);
    }

    public static final com.google.android.gms.internal.ads.C4330l90 d(final com.google.android.gms.internal.ads.Z80 z80, com.google.android.gms.internal.ads.Yk0 yk0, java.lang.Object obj, com.google.android.gms.internal.ads.AbstractC4550n90 abstractC4550n90) {
        return b(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.d90
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                z80.a();
                return null;
            }
        }, yk0, obj, abstractC4550n90);
    }
}
