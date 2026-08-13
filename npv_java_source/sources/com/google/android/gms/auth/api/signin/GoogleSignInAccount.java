package com.google.android.gms.auth.api.signin;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public class GoogleSignInAccount extends R3.a implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.signin.GoogleSignInAccount> CREATOR = new com.google.android.gms.auth.api.signin.c();

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final V3.f f24784P = V3.i.d();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final int f24785C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.String f24786D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.lang.String f24787E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final java.lang.String f24788F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final java.lang.String f24789G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final android.net.Uri f24790H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private java.lang.String f24791I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final long f24792J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final java.lang.String f24793K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    final java.util.List f24794L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final java.lang.String f24795M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final java.lang.String f24796N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final java.util.Set f24797O = new java.util.HashSet();

    GoogleSignInAccount(int i6, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.net.Uri uri, java.lang.String str5, long j6, java.lang.String str6, java.util.List list, java.lang.String str7, java.lang.String str8) {
        this.f24785C = i6;
        this.f24786D = str;
        this.f24787E = str2;
        this.f24788F = str3;
        this.f24789G = str4;
        this.f24790H = uri;
        this.f24791I = str5;
        this.f24792J = j6;
        this.f24793K = str6;
        this.f24794L = list;
        this.f24795M = str7;
        this.f24796N = str8;
    }

    public static com.google.android.gms.auth.api.signin.GoogleSignInAccount O(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, android.net.Uri uri, java.lang.Long l6, java.lang.String str7, java.util.Set set) {
        return new com.google.android.gms.auth.api.signin.GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l6.longValue(), Q3.AbstractC1477p.f(str7), new java.util.ArrayList((java.util.Collection) Q3.AbstractC1477p.l(set)), str5, str6);
    }

    public static com.google.android.gms.auth.api.signin.GoogleSignInAccount P(java.lang.String str) throws org.json.JSONException {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        java.lang.String strOptString = jSONObject.optString("photoUrl");
        android.net.Uri uri = !android.text.TextUtils.isEmpty(strOptString) ? android.net.Uri.parse(strOptString) : null;
        long j6 = java.lang.Long.parseLong(jSONObject.getString("expirationTime"));
        java.util.HashSet hashSet = new java.util.HashSet();
        org.json.JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i6 = 0; i6 < length; i6++) {
            hashSet.add(new com.google.android.gms.common.api.Scope(jSONArray.getString(i6)));
        }
        com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccountO = O(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, uri, java.lang.Long.valueOf(j6), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        googleSignInAccountO.f24791I = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccountO;
    }

    public java.lang.String C() {
        return this.f24786D;
    }

    public java.lang.String D() {
        return this.f24787E;
    }

    public android.net.Uri E() {
        return this.f24790H;
    }

    public java.util.Set M() {
        java.util.HashSet hashSet = new java.util.HashSet(this.f24794L);
        hashSet.addAll(this.f24797O);
        return hashSet;
    }

    public java.lang.String N() {
        return this.f24791I;
    }

    public final java.lang.String Q() {
        return this.f24793K;
    }

    public final java.lang.String R() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            if (C() != null) {
                jSONObject.put("id", C());
            }
            if (D() != null) {
                jSONObject.put("tokenId", D());
            }
            if (f() != null) {
                jSONObject.put("email", f());
            }
            if (e() != null) {
                jSONObject.put("displayName", e());
            }
            if (w() != null) {
                jSONObject.put("givenName", w());
            }
            if (s() != null) {
                jSONObject.put("familyName", s());
            }
            android.net.Uri uriE = E();
            if (uriE != null) {
                jSONObject.put("photoUrl", uriE.toString());
            }
            if (N() != null) {
                jSONObject.put("serverAuthCode", N());
            }
            jSONObject.put("expirationTime", this.f24792J);
            jSONObject.put("obfuscatedIdentifier", this.f24793K);
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.List list = this.f24794L;
            com.google.android.gms.common.api.Scope[] scopeArr = (com.google.android.gms.common.api.Scope[]) list.toArray(new com.google.android.gms.common.api.Scope[list.size()]);
            java.util.Arrays.sort(scopeArr, new java.util.Comparator() { // from class: K3.b
                @Override // java.util.Comparator
                public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                    android.os.Parcelable.Creator<com.google.android.gms.auth.api.signin.GoogleSignInAccount> creator = com.google.android.gms.auth.api.signin.GoogleSignInAccount.CREATOR;
                    return ((com.google.android.gms.common.api.Scope) obj).e().compareTo(((com.google.android.gms.common.api.Scope) obj2).e());
                }
            });
            for (com.google.android.gms.common.api.Scope scope : scopeArr) {
                jSONArray.put(scope.e());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (org.json.JSONException e6) {
            throw new java.lang.RuntimeException(e6);
        }
    }

    public java.lang.String e() {
        return this.f24789G;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.auth.api.signin.GoogleSignInAccount)) {
            return false;
        }
        com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) obj;
        return googleSignInAccount.f24793K.equals(this.f24793K) && googleSignInAccount.M().equals(M());
    }

    public java.lang.String f() {
        return this.f24788F;
    }

    public int hashCode() {
        return ((this.f24793K.hashCode() + 527) * 31) + M().hashCode();
    }

    public java.lang.String s() {
        return this.f24796N;
    }

    public java.lang.String w() {
        return this.f24795M;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i6) {
        int iA = R3.c.a(parcel);
        R3.c.k(parcel, 1, this.f24785C);
        R3.c.q(parcel, 2, C(), false);
        R3.c.q(parcel, 3, D(), false);
        R3.c.q(parcel, 4, f(), false);
        R3.c.q(parcel, 5, e(), false);
        R3.c.p(parcel, 6, E(), i6, false);
        R3.c.q(parcel, 7, N(), false);
        R3.c.n(parcel, 8, this.f24792J);
        R3.c.q(parcel, 9, this.f24793K, false);
        R3.c.u(parcel, 10, this.f24794L, false);
        R3.c.q(parcel, 11, w(), false);
        R3.c.q(parcel, 12, s(), false);
        R3.c.b(parcel, iA);
    }
}
