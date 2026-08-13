package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6212f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f41552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Object f41553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Object f41554c;

    C6212f0(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        this.f41552a = obj;
        this.f41553b = obj2;
        this.f41554c = obj3;
    }

    final java.lang.IllegalArgumentException a() {
        java.lang.Object obj = this.f41554c;
        java.lang.Object obj2 = this.f41553b;
        java.lang.Object obj3 = this.f41552a;
        return new java.lang.IllegalArgumentException("Multiple entries with same key: " + java.lang.String.valueOf(obj3) + "=" + java.lang.String.valueOf(obj2) + " and " + java.lang.String.valueOf(obj3) + "=" + java.lang.String.valueOf(obj));
    }
}
