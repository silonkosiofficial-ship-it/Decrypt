package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class KI0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5000rF f28887c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.util.SparseArray f28886b = new android.util.SparseArray();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f28885a = -1;

    public KI0(com.google.android.gms.internal.ads.InterfaceC5000rF interfaceC5000rF) {
        this.f28887c = interfaceC5000rF;
    }

    public final java.lang.Object a(int i6) {
        if (this.f28885a == -1) {
            this.f28885a = 0;
        }
        while (true) {
            int i10 = this.f28885a;
            if (i10 <= 0 || i6 >= this.f28886b.keyAt(i10)) {
                break;
            }
            this.f28885a--;
        }
        while (this.f28885a < this.f28886b.size() - 1 && i6 >= this.f28886b.keyAt(this.f28885a + 1)) {
            this.f28885a++;
        }
        return this.f28886b.valueAt(this.f28885a);
    }

    public final java.lang.Object b() {
        return this.f28886b.valueAt(this.f28886b.size() - 1);
    }

    public final void c(int i6, java.lang.Object obj) {
        if (this.f28885a == -1) {
            com.google.android.gms.internal.ads.LC.f(this.f28886b.size() == 0);
            this.f28885a = 0;
        }
        if (this.f28886b.size() > 0) {
            android.util.SparseArray sparseArray = this.f28886b;
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            com.google.android.gms.internal.ads.LC.d(i6 >= iKeyAt);
            if (iKeyAt == i6) {
                com.google.android.gms.internal.ads.InterfaceC5000rF interfaceC5000rF = this.f28887c;
                android.util.SparseArray sparseArray2 = this.f28886b;
                interfaceC5000rF.b(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f28886b.append(i6, obj);
    }

    public final void d() {
        for (int i6 = 0; i6 < this.f28886b.size(); i6++) {
            this.f28887c.b(this.f28886b.valueAt(i6));
        }
        this.f28885a = -1;
        this.f28886b.clear();
    }

    public final void e(int i6) {
        int i10 = 0;
        while (i10 < this.f28886b.size() - 1) {
            int i11 = i10 + 1;
            if (i6 < this.f28886b.keyAt(i11)) {
                return;
            }
            this.f28887c.b(this.f28886b.valueAt(i10));
            this.f28886b.removeAt(i10);
            int i12 = this.f28885a;
            if (i12 > 0) {
                this.f28885a = i12 - 1;
            }
            i10 = i11;
        }
    }

    public final boolean f() {
        return this.f28886b.size() == 0;
    }
}
