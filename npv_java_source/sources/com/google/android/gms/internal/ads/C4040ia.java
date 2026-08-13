package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ia, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4040ia extends com.google.android.gms.internal.ads.AbstractC4109j9 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f36312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f36313c;

    public C4040ia(java.lang.String str) {
        this.f36312b = -1L;
        this.f36313c = -1L;
        java.util.HashMap mapA = com.google.android.gms.internal.ads.AbstractC4109j9.a(str);
        if (mapA != null) {
            this.f36312b = ((java.lang.Long) mapA.get(0)).longValue();
            this.f36313c = ((java.lang.Long) mapA.get(1)).longValue();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4109j9
    protected final java.util.HashMap b() {
        java.util.HashMap map = new java.util.HashMap();
        map.put(0, java.lang.Long.valueOf(this.f36312b));
        map.put(1, java.lang.Long.valueOf(this.f36313c));
        return map;
    }
}
