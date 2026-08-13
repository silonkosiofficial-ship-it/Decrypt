package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.kp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4289kp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f37014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Map f37015b;

    /* synthetic */ C4289kp0(java.util.Map map, java.util.Map map2, com.google.android.gms.internal.ads.AbstractC4179jp0 abstractC4179jp0) {
        this.f37014a = map;
        this.f37015b = map2;
    }

    public static com.google.android.gms.internal.ads.C4070ip0 a() {
        return new com.google.android.gms.internal.ads.C4070ip0(null);
    }

    public final java.lang.Enum b(java.lang.Object obj) throws java.security.GeneralSecurityException {
        java.lang.Enum r6 = (java.lang.Enum) this.f37015b.get(obj);
        if (r6 != null) {
            return r6;
        }
        throw new java.security.GeneralSecurityException("Unable to convert object enum: ".concat(java.lang.String.valueOf(obj)));
    }

    public final java.lang.Object c(java.lang.Enum r6) throws java.security.GeneralSecurityException {
        java.lang.Object obj = this.f37014a.get(r6);
        if (obj != null) {
            return obj;
        }
        throw new java.security.GeneralSecurityException("Unable to convert proto enum: ".concat(java.lang.String.valueOf(r6)));
    }
}
