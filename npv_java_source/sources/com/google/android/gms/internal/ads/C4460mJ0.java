package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.mJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4460mJ0 extends com.google.android.gms.internal.ads.C2324Eo {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final android.util.SparseBooleanArray f37324A;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f37325s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f37326t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f37327u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f37328v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f37329w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f37330x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f37331y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final android.util.SparseArray f37332z;

    public C4460mJ0() {
        this.f37332z = new android.util.SparseArray();
        this.f37324A = new android.util.SparseBooleanArray();
        y();
    }

    public C4460mJ0(android.content.Context context) {
        super.e(context);
        android.graphics.Point pointO = com.google.android.gms.internal.ads.EW.O(context);
        super.f(pointO.x, pointO.y, true);
        this.f37332z = new android.util.SparseArray();
        this.f37324A = new android.util.SparseBooleanArray();
        y();
    }

    /* synthetic */ C4460mJ0(com.google.android.gms.internal.ads.C4570nJ0 c4570nJ0, com.google.android.gms.internal.ads.FJ0 fj0) {
        super(c4570nJ0);
        this.f37325s = c4570nJ0.f37566D;
        this.f37326t = c4570nJ0.f37568F;
        this.f37327u = c4570nJ0.f37570H;
        this.f37328v = c4570nJ0.f37575M;
        this.f37329w = c4570nJ0.f37576N;
        this.f37330x = c4570nJ0.f37577O;
        this.f37331y = c4570nJ0.f37579Q;
        android.util.SparseArray sparseArray = c4570nJ0.f37581S;
        android.util.SparseArray sparseArray2 = new android.util.SparseArray();
        for (int i6 = 0; i6 < sparseArray.size(); i6++) {
            sparseArray2.put(sparseArray.keyAt(i6), new java.util.HashMap((java.util.Map) sparseArray.valueAt(i6)));
        }
        this.f37332z = sparseArray2;
        this.f37324A = c4570nJ0.f37582T.clone();
    }

    private final void y() {
        this.f37325s = true;
        this.f37326t = true;
        this.f37327u = true;
        this.f37328v = true;
        this.f37329w = true;
        this.f37330x = true;
        this.f37331y = true;
    }

    public final com.google.android.gms.internal.ads.C4460mJ0 q(int i6, boolean z6) {
        if (this.f37324A.get(i6) != z6) {
            if (z6) {
                this.f37324A.put(i6, true);
            } else {
                this.f37324A.delete(i6);
            }
        }
        return this;
    }
}
