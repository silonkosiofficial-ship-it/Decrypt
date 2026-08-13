package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3837gi0 extends com.google.android.gms.internal.ads.AbstractC2939Vh0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    java.lang.Object[] f35667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f35668e;

    public C3837gi0() {
        super(4);
    }

    C3837gi0(int i6, boolean z6) {
        super(i6);
        this.f35667d = new java.lang.Object[com.google.android.gms.internal.ads.AbstractC3947hi0.w(i6)];
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2975Wh0
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.AbstractC2975Wh0 a(java.lang.Object obj) {
        g(obj);
        return this;
    }

    public final com.google.android.gms.internal.ads.C3837gi0 g(java.lang.Object obj) {
        obj.getClass();
        if (this.f35667d != null) {
            int iW = com.google.android.gms.internal.ads.AbstractC3947hi0.w(this.f32552b);
            java.lang.Object[] objArr = this.f35667d;
            if (iW <= objArr.length) {
                int length = objArr.length - 1;
                int iHashCode = obj.hashCode();
                int iA = com.google.android.gms.internal.ads.AbstractC2903Uh0.a(iHashCode);
                while (true) {
                    int i6 = iA & length;
                    java.lang.Object[] objArr2 = this.f35667d;
                    java.lang.Object obj2 = objArr2[i6];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            break;
                        }
                        iA = i6 + 1;
                    } else {
                        objArr2[i6] = obj;
                        this.f35668e += iHashCode;
                        super.c(obj);
                        break;
                    }
                }
                return this;
            }
        }
        this.f35667d = null;
        super.c(obj);
        return this;
    }

    public final com.google.android.gms.internal.ads.C3837gi0 h(java.lang.Object... objArr) {
        if (this.f35667d != null) {
            for (int i6 = 0; i6 < 2; i6++) {
                g(objArr[i6]);
            }
        } else {
            e(objArr, 2);
        }
        return this;
    }

    public final com.google.android.gms.internal.ads.C3837gi0 i(java.lang.Iterable iterable) {
        iterable.getClass();
        if (this.f35667d != null) {
            java.util.Iterator it = iterable.iterator();
            while (it.hasNext()) {
                g(it.next());
            }
        } else {
            super.d(iterable);
        }
        return this;
    }

    public final com.google.android.gms.internal.ads.AbstractC3947hi0 j() {
        com.google.android.gms.internal.ads.AbstractC3947hi0 abstractC3947hi0W;
        int i6 = this.f32552b;
        if (i6 == 0) {
            return com.google.android.gms.internal.ads.C2941Vi0.f32555K;
        }
        if (i6 == 1) {
            java.lang.Object obj = this.f32551a[0];
            j$.util.Objects.requireNonNull(obj);
            return new com.google.android.gms.internal.ads.C3839gj0(obj);
        }
        if (this.f35667d == null || com.google.android.gms.internal.ads.AbstractC3947hi0.w(i6) != this.f35667d.length) {
            abstractC3947hi0W = com.google.android.gms.internal.ads.AbstractC3947hi0.W(this.f32552b, this.f32551a);
            this.f32552b = abstractC3947hi0W.size();
        } else {
            int i10 = this.f32552b;
            java.lang.Object[] objArrCopyOf = this.f32551a;
            if (com.google.android.gms.internal.ads.AbstractC3947hi0.X(i10, objArrCopyOf.length)) {
                objArrCopyOf = java.util.Arrays.copyOf(objArrCopyOf, i10);
            }
            int i11 = this.f35668e;
            java.lang.Object[] objArr = this.f35667d;
            abstractC3947hi0W = new com.google.android.gms.internal.ads.C2941Vi0(objArrCopyOf, i11, objArr, objArr.length - 1, this.f32552b);
        }
        this.f32553c = true;
        this.f35667d = null;
        return abstractC3947hi0W;
    }
}
