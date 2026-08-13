package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.di0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3508di0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f34786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Object f34787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Object f34788c;

    C3508di0(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        this.f34786a = obj;
        this.f34787b = obj2;
        this.f34788c = obj3;
    }

    final java.lang.IllegalArgumentException a() {
        java.lang.Object obj = this.f34788c;
        java.lang.Object obj2 = this.f34787b;
        java.lang.Object obj3 = this.f34786a;
        return new java.lang.IllegalArgumentException("Multiple entries with same key: " + java.lang.String.valueOf(obj3) + "=" + java.lang.String.valueOf(obj2) + " and " + java.lang.String.valueOf(obj3) + "=" + java.lang.String.valueOf(obj));
    }
}
