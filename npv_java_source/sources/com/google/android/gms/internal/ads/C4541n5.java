package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.n5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4541n5 implements com.google.android.gms.internal.ads.InterfaceC4539n4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f37496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f37497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long[] f37498c;

    public C4541n5(java.util.List list) {
        this.f37496a = j$.util.DesugarCollections.unmodifiableList(new java.util.ArrayList(list));
        int size = list.size();
        this.f37497b = new long[size + size];
        for (int i6 = 0; i6 < list.size(); i6++) {
            com.google.android.gms.internal.ads.C3334c5 c3334c5 = (com.google.android.gms.internal.ads.C3334c5) list.get(i6);
            long[] jArr = this.f37497b;
            int i10 = i6 + i6;
            jArr[i10] = c3334c5.f34444b;
            jArr[i10 + 1] = c3334c5.f34445c;
        }
        long[] jArr2 = this.f37497b;
        long[] jArrCopyOf = java.util.Arrays.copyOf(jArr2, jArr2.length);
        this.f37498c = jArrCopyOf;
        java.util.Arrays.sort(jArrCopyOf);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4539n4
    public final long B(int i6) {
        com.google.android.gms.internal.ads.LC.d(i6 >= 0);
        com.google.android.gms.internal.ads.LC.d(i6 < this.f37498c.length);
        return this.f37498c[i6];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4539n4
    public final java.util.List C(long j6) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (int i6 = 0; i6 < this.f37496a.size(); i6++) {
            long[] jArr = this.f37497b;
            int i10 = i6 + i6;
            if (jArr[i10] <= j6 && j6 < jArr[i10 + 1]) {
                com.google.android.gms.internal.ads.C3334c5 c3334c5 = (com.google.android.gms.internal.ads.C3334c5) this.f37496a.get(i6);
                com.google.android.gms.internal.ads.C2297Dy c2297Dy = c3334c5.f34443a;
                if (c2297Dy.f26843e == -3.4028235E38f) {
                    arrayList2.add(c3334c5);
                } else {
                    arrayList.add(c2297Dy);
                }
            }
        }
        java.util.Collections.sort(arrayList2, new java.util.Comparator() { // from class: com.google.android.gms.internal.ads.m5
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.compare(((com.google.android.gms.internal.ads.C3334c5) obj).f34444b, ((com.google.android.gms.internal.ads.C3334c5) obj2).f34444b);
            }
        });
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            com.google.android.gms.internal.ads.C2185Ax c2185AxB = ((com.google.android.gms.internal.ads.C3334c5) arrayList2.get(i11)).f34443a.b();
            c2185AxB.e((-1) - i11, 1);
            arrayList.add(c2185AxB.p());
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4539n4
    public final int a() {
        return this.f37498c.length;
    }
}
