package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5687xa extends com.google.android.gms.internal.ads.AbstractC4109j9 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.Long f39887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.Long f39888c;

    public C5687xa(java.lang.String str) {
        java.util.HashMap mapA = com.google.android.gms.internal.ads.AbstractC4109j9.a(str);
        if (mapA != null) {
            this.f39887b = (java.lang.Long) mapA.get(0);
            this.f39888c = (java.lang.Long) mapA.get(1);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4109j9
    protected final java.util.HashMap b() {
        java.util.HashMap map = new java.util.HashMap();
        map.put(0, this.f39887b);
        map.put(1, this.f39888c);
        return map;
    }
}
