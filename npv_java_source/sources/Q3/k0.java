package Q3;

/* JADX INFO: loaded from: classes.dex */
public final class k0 implements android.os.Parcelable.Creator {
    static void a(Q3.C1467f c1467f, android.os.Parcel parcel, int i6) {
        int iA = R3.c.a(parcel);
        R3.c.k(parcel, 1, c1467f.f8946C);
        R3.c.k(parcel, 2, c1467f.f8947D);
        R3.c.k(parcel, 3, c1467f.f8948E);
        R3.c.q(parcel, 4, c1467f.f8949F, false);
        R3.c.j(parcel, 5, c1467f.f8950G, false);
        R3.c.t(parcel, 6, c1467f.f8951H, i6, false);
        R3.c.e(parcel, 7, c1467f.f8952I, false);
        R3.c.p(parcel, 8, c1467f.f8953J, i6, false);
        R3.c.t(parcel, 10, c1467f.f8954K, i6, false);
        R3.c.t(parcel, 11, c1467f.f8955L, i6, false);
        R3.c.c(parcel, 12, c1467f.f8956M);
        R3.c.k(parcel, 13, c1467f.f8957N);
        R3.c.c(parcel, 14, c1467f.f8958O);
        R3.c.q(parcel, 15, c1467f.e(), false);
        R3.c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        com.google.android.gms.common.api.Scope[] scopeArr = Q3.C1467f.f8944Q;
        android.os.Bundle bundle = new android.os.Bundle();
        N3.C1391d[] c1391dArr = Q3.C1467f.f8945R;
        N3.C1391d[] c1391dArr2 = c1391dArr;
        java.lang.String strF = null;
        android.os.IBinder iBinderS = null;
        android.accounts.Account account = null;
        java.lang.String strF2 = null;
        int iT = 0;
        int iT2 = 0;
        int iT3 = 0;
        boolean zM = false;
        int iT4 = 0;
        boolean zM2 = false;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            switch (R3.b.l(iR)) {
                case 1:
                    iT = R3.b.t(parcel, iR);
                    break;
                case 2:
                    iT2 = R3.b.t(parcel, iR);
                    break;
                case 3:
                    iT3 = R3.b.t(parcel, iR);
                    break;
                case 4:
                    strF = R3.b.f(parcel, iR);
                    break;
                case 5:
                    iBinderS = R3.b.s(parcel, iR);
                    break;
                case 6:
                    scopeArr = (com.google.android.gms.common.api.Scope[]) R3.b.i(parcel, iR, com.google.android.gms.common.api.Scope.CREATOR);
                    break;
                case 7:
                    bundle = R3.b.a(parcel, iR);
                    break;
                case 8:
                    account = (android.accounts.Account) R3.b.e(parcel, iR, android.accounts.Account.CREATOR);
                    break;
                case 9:
                default:
                    R3.b.x(parcel, iR);
                    break;
                case 10:
                    c1391dArr = (N3.C1391d[]) R3.b.i(parcel, iR, N3.C1391d.CREATOR);
                    break;
                case 11:
                    c1391dArr2 = (N3.C1391d[]) R3.b.i(parcel, iR, N3.C1391d.CREATOR);
                    break;
                case 12:
                    zM = R3.b.m(parcel, iR);
                    break;
                case 13:
                    iT4 = R3.b.t(parcel, iR);
                    break;
                case 14:
                    zM2 = R3.b.m(parcel, iR);
                    break;
                case 15:
                    strF2 = R3.b.f(parcel, iR);
                    break;
            }
        }
        R3.b.k(parcel, iY);
        return new Q3.C1467f(iT, iT2, iT3, strF, iBinderS, scopeArr, bundle, account, c1391dArr, c1391dArr2, zM, iT4, zM2, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new Q3.C1467f[i6];
    }
}
