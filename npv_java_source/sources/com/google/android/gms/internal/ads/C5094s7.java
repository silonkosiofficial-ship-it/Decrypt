package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.s7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5094s7 implements java.util.Comparator {
    C5094s7() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        return ((byte[]) obj).length - ((byte[]) obj2).length;
    }
}
