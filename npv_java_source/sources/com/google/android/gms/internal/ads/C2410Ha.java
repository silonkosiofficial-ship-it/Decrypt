package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ha, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2410Ha extends com.google.android.gms.internal.ads.AbstractC4109j9 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.Long f28067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.Long f28068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.lang.Long f28069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public java.lang.Long f28070e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public java.lang.Long f28071f;

    public C2410Ha(java.lang.String str) {
        java.util.HashMap mapA = com.google.android.gms.internal.ads.AbstractC4109j9.a(str);
        if (mapA != null) {
            this.f28067b = (java.lang.Long) mapA.get(0);
            this.f28068c = (java.lang.Long) mapA.get(1);
            this.f28069d = (java.lang.Long) mapA.get(2);
            this.f28070e = (java.lang.Long) mapA.get(3);
            this.f28071f = (java.lang.Long) mapA.get(4);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4109j9
    protected final java.util.HashMap b() {
        java.util.HashMap map = new java.util.HashMap();
        map.put(0, this.f28067b);
        map.put(1, this.f28068c);
        map.put(2, this.f28069d);
        map.put(3, this.f28070e);
        map.put(4, this.f28071f);
        return map;
    }
}
