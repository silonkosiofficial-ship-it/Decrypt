package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Zc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3072Zc extends R3.a {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.C3072Zc> CREATOR = new com.google.android.gms.internal.ads.C3168ad();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final java.lang.String f33616C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final long f33617D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final java.lang.String f33618E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final java.lang.String f33619F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final java.lang.String f33620G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final android.os.Bundle f33621H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final boolean f33622I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public long f33623J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public java.lang.String f33624K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f33625L;

    C3072Zc(java.lang.String str, long j6, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.os.Bundle bundle, boolean z6, long j10, java.lang.String str5, int i6) {
        this.f33616C = str;
        this.f33617D = j6;
        this.f33618E = str2 == null ? "" : str2;
        this.f33619F = str3 == null ? "" : str3;
        this.f33620G = str4 == null ? "" : str4;
        this.f33621H = bundle == null ? new android.os.Bundle() : bundle;
        this.f33622I = z6;
        this.f33623J = j10;
        this.f33624K = str5;
        this.f33625L = i6;
    }

    public static com.google.android.gms.internal.ads.C3072Zc e(android.net.Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            java.util.List<java.lang.String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                p224w3.p.g("Expected 2 path parts for namespace and id, found :" + pathSegments.size());
                return null;
            }
            java.lang.String str = pathSegments.get(0);
            java.lang.String str2 = pathSegments.get(1);
            java.lang.String host = uri.getHost();
            java.lang.String queryParameter = uri.getQueryParameter("url");
            boolean zEquals = "1".equals(uri.getQueryParameter("read_only"));
            java.lang.String queryParameter2 = uri.getQueryParameter("expiration");
            long j6 = queryParameter2 == null ? 0L : java.lang.Long.parseLong(queryParameter2);
            android.os.Bundle bundle = new android.os.Bundle();
            for (java.lang.String str3 : uri.getQueryParameterNames()) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            return new com.google.android.gms.internal.ads.C3072Zc(queryParameter, j6, host, str, str2, bundle, zEquals, 0L, "", 0);
        } catch (java.lang.NullPointerException e6) {
            e = e6;
            p224w3.p.h("Unable to parse Uri into cache offering.", e);
            return null;
        } catch (java.lang.NumberFormatException e10) {
            e = e10;
            p224w3.p.h("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        java.lang.String str = this.f33616C;
        int iA = R3.c.a(parcel);
        R3.c.q(parcel, 2, str, false);
        R3.c.n(parcel, 3, this.f33617D);
        R3.c.q(parcel, 4, this.f33618E, false);
        R3.c.q(parcel, 5, this.f33619F, false);
        R3.c.q(parcel, 6, this.f33620G, false);
        R3.c.e(parcel, 7, this.f33621H, false);
        R3.c.c(parcel, 8, this.f33622I);
        R3.c.n(parcel, 9, this.f33623J);
        R3.c.q(parcel, 10, this.f33624K, false);
        R3.c.k(parcel, 11, this.f33625L);
        R3.c.b(parcel, iA);
    }
}
