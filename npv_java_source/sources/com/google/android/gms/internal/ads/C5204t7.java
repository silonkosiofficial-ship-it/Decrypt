package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.t7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5204t7 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected static final java.util.Comparator f38886d = new com.google.android.gms.internal.ads.C5094s7();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f38887a = new java.util.ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.List f38888b = new java.util.ArrayList(64);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f38889c = 0;

    public C5204t7(int i6) {
    }

    private final synchronized void c() {
        while (this.f38889c > 4096) {
            byte[] bArr = (byte[]) this.f38887a.remove(0);
            this.f38888b.remove(bArr);
            this.f38889c -= bArr.length;
        }
    }

    public final synchronized void a(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= 4096) {
                this.f38887a.add(bArr);
                int iBinarySearch = java.util.Collections.binarySearch(this.f38888b, bArr, f38886d);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                this.f38888b.add(iBinarySearch, bArr);
                this.f38889c += length;
                c();
            }
        }
    }

    public final synchronized byte[] b(int i6) {
        for (int i10 = 0; i10 < this.f38888b.size(); i10++) {
            byte[] bArr = (byte[]) this.f38888b.get(i10);
            int length = bArr.length;
            if (length >= i6) {
                this.f38889c -= length;
                this.f38888b.remove(i10);
                this.f38887a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i6];
    }
}
