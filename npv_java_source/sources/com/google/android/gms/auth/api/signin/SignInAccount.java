package com.google.android.gms.auth.api.signin;

/* JADX INFO: loaded from: classes.dex */
public class SignInAccount extends R3.a implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.signin.SignInAccount> CREATOR = new com.google.android.gms.auth.api.signin.g();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final java.lang.String f24826C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.gms.auth.api.signin.GoogleSignInAccount f24827D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final java.lang.String f24828E;

    SignInAccount(java.lang.String str, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount, java.lang.String str2) {
        this.f24827D = googleSignInAccount;
        this.f24826C = Q3.AbstractC1477p.g(str, "8.3 and 8.4 SDKs require non-null email");
        this.f24828E = Q3.AbstractC1477p.g(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    public final com.google.android.gms.auth.api.signin.GoogleSignInAccount e() {
        return this.f24827D;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        java.lang.String str = this.f24826C;
        int iA = R3.c.a(parcel);
        R3.c.q(parcel, 4, str, false);
        R3.c.p(parcel, 7, this.f24827D, i6, false);
        R3.c.q(parcel, 8, this.f24828E, false);
        R3.c.b(parcel, iA);
    }
}
