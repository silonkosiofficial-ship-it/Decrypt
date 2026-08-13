package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.kZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4257kZ extends com.google.android.gms.internal.ads.N00 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f36978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.List f36979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.List f36980d;

    public C4257kZ(int i6, long j6) {
        super(i6, null);
        this.f36978b = j6;
        this.f36979c = new java.util.ArrayList();
        this.f36980d = new java.util.ArrayList();
    }

    public final com.google.android.gms.internal.ads.C4257kZ b(int i6) {
        int size = this.f36980d.size();
        for (int i10 = 0; i10 < size; i10++) {
            com.google.android.gms.internal.ads.C4257kZ c4257kZ = (com.google.android.gms.internal.ads.C4257kZ) this.f36980d.get(i10);
            if (c4257kZ.f30137a == i6) {
                return c4257kZ;
            }
        }
        return null;
    }

    public final com.google.android.gms.internal.ads.LZ c(int i6) {
        int size = this.f36979c.size();
        for (int i10 = 0; i10 < size; i10++) {
            com.google.android.gms.internal.ads.LZ lz = (com.google.android.gms.internal.ads.LZ) this.f36979c.get(i10);
            if (lz.f30137a == i6) {
                return lz;
            }
        }
        return null;
    }

    public final void d(com.google.android.gms.internal.ads.C4257kZ c4257kZ) {
        this.f36980d.add(c4257kZ);
    }

    public final void e(com.google.android.gms.internal.ads.LZ lz) {
        this.f36979c.add(lz);
    }

    @Override // com.google.android.gms.internal.ads.N00
    public final java.lang.String toString() {
        java.util.List list = this.f36979c;
        return com.google.android.gms.internal.ads.N00.a(this.f30137a) + " leaves: " + java.util.Arrays.toString(list.toArray()) + " containers: " + java.util.Arrays.toString(this.f36980d.toArray());
    }
}
