package Q3;

/* JADX INFO: renamed from: Q3.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1467f extends R3.a {
    public static final android.os.Parcelable.Creator<Q3.C1467f> CREATOR = new Q3.k0();

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    static final com.google.android.gms.common.api.Scope[] f8944Q = new com.google.android.gms.common.api.Scope[0];

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    static final N3.C1391d[] f8945R = new N3.C1391d[0];

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final int f8946C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final int f8947D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final int f8948E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    java.lang.String f8949F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    android.os.IBinder f8950G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    com.google.android.gms.common.api.Scope[] f8951H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    android.os.Bundle f8952I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    android.accounts.Account f8953J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    N3.C1391d[] f8954K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    N3.C1391d[] f8955L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    final boolean f8956M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    final int f8957N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    boolean f8958O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final java.lang.String f8959P;

    C1467f(int i6, int i10, int i11, java.lang.String str, android.os.IBinder iBinder, com.google.android.gms.common.api.Scope[] scopeArr, android.os.Bundle bundle, android.accounts.Account account, N3.C1391d[] c1391dArr, N3.C1391d[] c1391dArr2, boolean z6, int i12, boolean z10, java.lang.String str2) {
        scopeArr = scopeArr == null ? f8944Q : scopeArr;
        bundle = bundle == null ? new android.os.Bundle() : bundle;
        c1391dArr = c1391dArr == null ? f8945R : c1391dArr;
        c1391dArr2 = c1391dArr2 == null ? f8945R : c1391dArr2;
        this.f8946C = i6;
        this.f8947D = i10;
        this.f8948E = i11;
        if ("com.google.android.gms".equals(str)) {
            this.f8949F = "com.google.android.gms";
        } else {
            this.f8949F = str;
        }
        if (i6 < 2) {
            this.f8953J = iBinder != null ? Q3.AbstractBinderC1462a.L0(Q3.InterfaceC1471j.a.y0(iBinder)) : null;
        } else {
            this.f8950G = iBinder;
            this.f8953J = account;
        }
        this.f8951H = scopeArr;
        this.f8952I = bundle;
        this.f8954K = c1391dArr;
        this.f8955L = c1391dArr2;
        this.f8956M = z6;
        this.f8957N = i12;
        this.f8958O = z10;
        this.f8959P = str2;
    }

    public final java.lang.String e() {
        return this.f8959P;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        Q3.k0.a(this, parcel, i6);
    }
}
