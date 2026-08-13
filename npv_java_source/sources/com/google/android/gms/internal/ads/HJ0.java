package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class HJ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.C2728Pm f28009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f28010b;

    public HJ0(com.google.android.gms.internal.ads.C2728Pm c2728Pm, int[] iArr, int i6) {
        if (iArr.length == 0) {
            com.google.android.gms.internal.ads.AbstractC3586eM.d("ETSDefinition", "Empty tracks are not allowed", new java.lang.IllegalArgumentException());
        }
        this.f28009a = c2728Pm;
        this.f28010b = iArr;
    }
}
