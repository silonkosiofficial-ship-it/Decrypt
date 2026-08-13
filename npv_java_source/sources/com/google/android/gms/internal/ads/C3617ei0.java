package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ei0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3617ei0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    java.lang.Object[] f35037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f35038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    com.google.android.gms.internal.ads.C3508di0 f35039c;

    public C3617ei0() {
        this(4);
    }

    C3617ei0(int i6) {
        this.f35037a = new java.lang.Object[i6 + i6];
        this.f35038b = 0;
    }

    private final void d(int i6) {
        java.lang.Object[] objArr = this.f35037a;
        int length = objArr.length;
        int i10 = i6 + i6;
        if (i10 > length) {
            this.f35037a = java.util.Arrays.copyOf(objArr, com.google.android.gms.internal.ads.AbstractC2975Wh0.b(length, i10));
        }
    }

    public final com.google.android.gms.internal.ads.C3617ei0 a(java.lang.Object obj, java.lang.Object obj2) {
        d(this.f35038b + 1);
        com.google.android.gms.internal.ads.AbstractC5812yh0.b(obj, obj2);
        java.lang.Object[] objArr = this.f35037a;
        int i6 = this.f35038b;
        int i10 = i6 + i6;
        objArr[i10] = obj;
        objArr[i10 + 1] = obj2;
        this.f35038b = i6 + 1;
        return this;
    }

    public final com.google.android.gms.internal.ads.C3617ei0 b(java.lang.Iterable iterable) {
        if (iterable instanceof java.util.Collection) {
            d(this.f35038b + ((java.util.Collection) iterable).size());
        }
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            a(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final com.google.android.gms.internal.ads.AbstractC3727fi0 c() {
        com.google.android.gms.internal.ads.C3508di0 c3508di0 = this.f35039c;
        if (c3508di0 != null) {
            throw c3508di0.a();
        }
        com.google.android.gms.internal.ads.C2905Ui0 c2905Ui0K = com.google.android.gms.internal.ads.C2905Ui0.k(this.f35038b, this.f35037a, this);
        com.google.android.gms.internal.ads.C3508di0 c3508di1 = this.f35039c;
        if (c3508di1 == null) {
            return c2905Ui0K;
        }
        throw c3508di1.a();
    }
}
