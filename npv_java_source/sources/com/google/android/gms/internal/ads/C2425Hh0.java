package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Hh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2425Hh0 extends com.google.android.gms.internal.ads.AbstractC5482vh0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.Object f28096C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f28097D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C2536Kh0 f28098E;

    C2425Hh0(com.google.android.gms.internal.ads.C2536Kh0 c2536Kh0, int i6) {
        this.f28098E = c2536Kh0;
        this.f28096C = com.google.android.gms.internal.ads.C2536Kh0.k(c2536Kh0, i6);
        this.f28097D = i6;
    }

    private final void a() {
        int i6 = this.f28097D;
        if (i6 == -1 || i6 >= this.f28098E.size() || !com.google.android.gms.internal.ads.AbstractC5700xg0.a(this.f28096C, com.google.android.gms.internal.ads.C2536Kh0.k(this.f28098E, this.f28097D))) {
            this.f28097D = this.f28098E.C(this.f28096C);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5482vh0, java.util.Map.Entry
    public final java.lang.Object getKey() {
        return this.f28096C;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5482vh0, java.util.Map.Entry
    public final java.lang.Object getValue() {
        java.util.Map mapQ = this.f28098E.q();
        if (mapQ != null) {
            return mapQ.get(this.f28096C);
        }
        a();
        int i6 = this.f28097D;
        if (i6 == -1) {
            return null;
        }
        return com.google.android.gms.internal.ads.C2536Kh0.o(this.f28098E, i6);
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        java.util.Map mapQ = this.f28098E.q();
        if (mapQ != null) {
            return mapQ.put(this.f28096C, obj);
        }
        a();
        int i6 = this.f28097D;
        if (i6 == -1) {
            this.f28098E.put(this.f28096C, obj);
            return null;
        }
        com.google.android.gms.internal.ads.C2536Kh0 c2536Kh0 = this.f28098E;
        java.lang.Object objO = com.google.android.gms.internal.ads.C2536Kh0.o(c2536Kh0, i6);
        com.google.android.gms.internal.ads.C2536Kh0.s(c2536Kh0, this.f28097D, obj);
        return objO;
    }
}
