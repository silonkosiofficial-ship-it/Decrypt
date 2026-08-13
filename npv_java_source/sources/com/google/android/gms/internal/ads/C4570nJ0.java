package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4570nJ0 extends com.google.android.gms.internal.ads.C3740fp {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final boolean f37566D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final boolean f37567E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final boolean f37568F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final boolean f37569G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final boolean f37570H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final boolean f37571I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final boolean f37572J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final boolean f37573K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final boolean f37574L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final boolean f37575M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final boolean f37576N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final boolean f37577O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final boolean f37578P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final boolean f37579Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final boolean f37580R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final android.util.SparseArray f37581S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final android.util.SparseBooleanArray f37582T;

    static {
        new com.google.android.gms.internal.ads.C4570nJ0(new com.google.android.gms.internal.ads.C4460mJ0());
        java.lang.Integer.toString(1000, 36);
        java.lang.Integer.toString(1001, 36);
        java.lang.Integer.toString(1002, 36);
        java.lang.Integer.toString(1003, 36);
        java.lang.Integer.toString(1004, 36);
        java.lang.Integer.toString(1005, 36);
        java.lang.Integer.toString(1006, 36);
        java.lang.Integer.toString(1007, 36);
        java.lang.Integer.toString(1008, 36);
        java.lang.Integer.toString(1009, 36);
        java.lang.Integer.toString(1010, 36);
        java.lang.Integer.toString(1011, 36);
        java.lang.Integer.toString(1012, 36);
        java.lang.Integer.toString(1013, 36);
        java.lang.Integer.toString(1014, 36);
        java.lang.Integer.toString(1015, 36);
        java.lang.Integer.toString(1016, 36);
        java.lang.Integer.toString(1017, 36);
        java.lang.Integer.toString(1018, 36);
    }

    private C4570nJ0(com.google.android.gms.internal.ads.C4460mJ0 c4460mJ0) {
        super(c4460mJ0);
        this.f37566D = c4460mJ0.f37325s;
        this.f37567E = false;
        this.f37568F = c4460mJ0.f37326t;
        this.f37569G = false;
        this.f37570H = c4460mJ0.f37327u;
        this.f37571I = false;
        this.f37572J = false;
        this.f37573K = false;
        this.f37574L = false;
        this.f37575M = c4460mJ0.f37328v;
        this.f37576N = c4460mJ0.f37329w;
        this.f37577O = c4460mJ0.f37330x;
        this.f37578P = false;
        this.f37579Q = c4460mJ0.f37331y;
        this.f37580R = false;
        this.f37581S = c4460mJ0.f37332z;
        this.f37582T = c4460mJ0.f37324A;
    }

    public static com.google.android.gms.internal.ads.C4570nJ0 d(android.content.Context context) {
        return new com.google.android.gms.internal.ads.C4570nJ0(new com.google.android.gms.internal.ads.C4460mJ0(context));
    }

    public final com.google.android.gms.internal.ads.C4460mJ0 c() {
        return new com.google.android.gms.internal.ads.C4460mJ0(this, null);
    }

    public final com.google.android.gms.internal.ads.AbstractC4680oJ0 e(int i6, com.google.android.gms.internal.ads.PI0 pi0) {
        java.util.Map map = (java.util.Map) this.f37581S.get(i6);
        if (map != null) {
            androidx.appcompat.app.D.a(map.get(pi0));
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.C3740fp
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && com.google.android.gms.internal.ads.C4570nJ0.class == obj.getClass()) {
            com.google.android.gms.internal.ads.C4570nJ0 c4570nJ0 = (com.google.android.gms.internal.ads.C4570nJ0) obj;
            if (super.equals(c4570nJ0) && this.f37566D == c4570nJ0.f37566D && this.f37568F == c4570nJ0.f37568F && this.f37570H == c4570nJ0.f37570H && this.f37575M == c4570nJ0.f37575M && this.f37576N == c4570nJ0.f37576N && this.f37577O == c4570nJ0.f37577O && this.f37579Q == c4570nJ0.f37579Q) {
                android.util.SparseBooleanArray sparseBooleanArray = this.f37582T;
                android.util.SparseBooleanArray sparseBooleanArray2 = c4570nJ0.f37582T;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    for (int i6 = 0; i6 < size; i6++) {
                        if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i6)) >= 0) {
                        }
                    }
                    android.util.SparseArray sparseArray = this.f37581S;
                    android.util.SparseArray sparseArray2 = c4570nJ0.f37581S;
                    int size2 = sparseArray.size();
                    if (sparseArray2.size() == size2) {
                        for (int i10 = 0; i10 < size2; i10++) {
                            int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i10));
                            if (iIndexOfKey >= 0) {
                                java.util.Map map = (java.util.Map) sparseArray.valueAt(i10);
                                java.util.Map map2 = (java.util.Map) sparseArray2.valueAt(iIndexOfKey);
                                if (map2.size() == map.size()) {
                                    for (java.util.Map.Entry entry : map.entrySet()) {
                                        com.google.android.gms.internal.ads.PI0 pi0 = (com.google.android.gms.internal.ads.PI0) entry.getKey();
                                        if (!map2.containsKey(pi0) || !j$.util.Objects.equals(entry.getValue(), map2.get(pi0))) {
                                        }
                                    }
                                }
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean f(int i6) {
        return this.f37582T.get(i6);
    }

    public final boolean g(int i6, com.google.android.gms.internal.ads.PI0 pi0) {
        java.util.Map map = (java.util.Map) this.f37581S.get(i6);
        return map != null && map.containsKey(pi0);
    }

    @Override // com.google.android.gms.internal.ads.C3740fp
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.f37566D ? 1 : 0)) * 961) + (this.f37568F ? 1 : 0)) * 961) + (this.f37570H ? 1 : 0)) * 28629151) + (this.f37575M ? 1 : 0)) * 31) + (this.f37576N ? 1 : 0)) * 31) + (this.f37577O ? 1 : 0)) * 961) + (this.f37579Q ? 1 : 0)) * 31;
    }
}
