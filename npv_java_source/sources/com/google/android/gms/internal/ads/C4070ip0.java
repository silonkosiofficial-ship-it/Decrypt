package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ip0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4070ip0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final java.util.Map f36356a = new java.util.HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final java.util.Map f36357b = new java.util.HashMap();

    /* synthetic */ C4070ip0(com.google.android.gms.internal.ads.AbstractC4179jp0 abstractC4179jp0) {
    }

    public final com.google.android.gms.internal.ads.C4070ip0 a(java.lang.Enum r6, java.lang.Object obj) {
        this.f36356a.put(r6, obj);
        this.f36357b.put(obj, r6);
        return this;
    }

    public final com.google.android.gms.internal.ads.C4289kp0 b() {
        return new com.google.android.gms.internal.ads.C4289kp0(j$.util.DesugarCollections.unmodifiableMap(this.f36356a), j$.util.DesugarCollections.unmodifiableMap(this.f36357b), null);
    }
}
