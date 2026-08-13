package com.google.android.gms.auth.api.signin.internal;

/* JADX INFO: loaded from: classes.dex */
public final class SignInConfiguration extends R3.a implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.signin.internal.SignInConfiguration> CREATOR = new L3.w();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.String f24831C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.gms.auth.api.signin.GoogleSignInOptions f24832D;

    public SignInConfiguration(java.lang.String str, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) {
        this.f24831C = Q3.AbstractC1477p.f(str);
        this.f24832D = googleSignInOptions;
    }

    public final com.google.android.gms.auth.api.signin.GoogleSignInOptions e() {
        return this.f24832D;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.auth.api.signin.internal.SignInConfiguration)) {
            return false;
        }
        com.google.android.gms.auth.api.signin.internal.SignInConfiguration signInConfiguration = (com.google.android.gms.auth.api.signin.internal.SignInConfiguration) obj;
        if (this.f24831C.equals(signInConfiguration.f24831C)) {
            com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions = this.f24832D;
            com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions2 = signInConfiguration.f24832D;
            if (googleSignInOptions == null) {
                if (googleSignInOptions2 == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(googleSignInOptions2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return new L3.b().a(this.f24831C).a(this.f24832D).b();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        java.lang.String str = this.f24831C;
        int iA = R3.c.a(parcel);
        R3.c.q(parcel, 2, str, false);
        R3.c.p(parcel, 5, this.f24832D, i6, false);
        R3.c.b(parcel, iA);
    }
}
