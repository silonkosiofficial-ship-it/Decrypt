package com.google.android.gms.auth.api.signin;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public class GoogleSignInOptions extends R3.a implements O3.a.d, com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.signin.GoogleSignInOptions> CREATOR;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final com.google.android.gms.auth.api.signin.GoogleSignInOptions f24798N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final com.google.android.gms.auth.api.signin.GoogleSignInOptions f24799O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final com.google.android.gms.common.api.Scope f24800P = new com.google.android.gms.common.api.Scope("profile");

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final com.google.android.gms.common.api.Scope f24801Q = new com.google.android.gms.common.api.Scope("email");

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final com.google.android.gms.common.api.Scope f24802R = new com.google.android.gms.common.api.Scope("openid");

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final com.google.android.gms.common.api.Scope f24803S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final com.google.android.gms.common.api.Scope f24804T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private static final java.util.Comparator f24805U;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final int f24806C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.util.ArrayList f24807D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private android.accounts.Account f24808E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f24809F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final boolean f24810G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final boolean f24811H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private java.lang.String f24812I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private java.lang.String f24813J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private java.util.ArrayList f24814K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private java.lang.String f24815L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private java.util.Map f24816M;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.util.Set f24817a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f24818b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f24819c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f24820d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private java.lang.String f24821e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private android.accounts.Account f24822f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private java.lang.String f24823g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private java.util.Map f24824h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private java.lang.String f24825i;

        public a() {
            this.f24817a = new java.util.HashSet();
            this.f24824h = new java.util.HashMap();
        }

        public a(com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) {
            this.f24817a = new java.util.HashSet();
            this.f24824h = new java.util.HashMap();
            Q3.AbstractC1477p.l(googleSignInOptions);
            this.f24817a = new java.util.HashSet(googleSignInOptions.f24807D);
            this.f24818b = googleSignInOptions.f24810G;
            this.f24819c = googleSignInOptions.f24811H;
            this.f24820d = googleSignInOptions.f24809F;
            this.f24821e = googleSignInOptions.f24812I;
            this.f24822f = googleSignInOptions.f24808E;
            this.f24823g = googleSignInOptions.f24813J;
            this.f24824h = com.google.android.gms.auth.api.signin.GoogleSignInOptions.Z(googleSignInOptions.f24814K);
            this.f24825i = googleSignInOptions.f24815L;
        }

        public com.google.android.gms.auth.api.signin.GoogleSignInOptions a() {
            if (this.f24817a.contains(com.google.android.gms.auth.api.signin.GoogleSignInOptions.f24804T)) {
                java.util.Set set = this.f24817a;
                com.google.android.gms.common.api.Scope scope = com.google.android.gms.auth.api.signin.GoogleSignInOptions.f24803S;
                if (set.contains(scope)) {
                    this.f24817a.remove(scope);
                }
            }
            if (this.f24820d && (this.f24822f == null || !this.f24817a.isEmpty())) {
                b();
            }
            return new com.google.android.gms.auth.api.signin.GoogleSignInOptions(new java.util.ArrayList(this.f24817a), this.f24822f, this.f24820d, this.f24818b, this.f24819c, this.f24821e, this.f24823g, this.f24824h, this.f24825i);
        }

        public com.google.android.gms.auth.api.signin.GoogleSignInOptions.a b() {
            this.f24817a.add(com.google.android.gms.auth.api.signin.GoogleSignInOptions.f24802R);
            return this;
        }

        public com.google.android.gms.auth.api.signin.GoogleSignInOptions.a c() {
            this.f24817a.add(com.google.android.gms.auth.api.signin.GoogleSignInOptions.f24800P);
            return this;
        }

        public com.google.android.gms.auth.api.signin.GoogleSignInOptions.a d(com.google.android.gms.common.api.Scope scope, com.google.android.gms.common.api.Scope... scopeArr) {
            this.f24817a.add(scope);
            this.f24817a.addAll(java.util.Arrays.asList(scopeArr));
            return this;
        }

        public com.google.android.gms.auth.api.signin.GoogleSignInOptions.a e(java.lang.String str) {
            this.f24825i = str;
            return this;
        }
    }

    static {
        com.google.android.gms.common.api.Scope scope = new com.google.android.gms.common.api.Scope("https://www.googleapis.com/auth/games_lite");
        f24803S = scope;
        f24804T = new com.google.android.gms.common.api.Scope("https://www.googleapis.com/auth/games");
        com.google.android.gms.auth.api.signin.GoogleSignInOptions.a aVar = new com.google.android.gms.auth.api.signin.GoogleSignInOptions.a();
        aVar.b();
        aVar.c();
        f24798N = aVar.a();
        com.google.android.gms.auth.api.signin.GoogleSignInOptions.a aVar2 = new com.google.android.gms.auth.api.signin.GoogleSignInOptions.a();
        aVar2.d(scope, new com.google.android.gms.common.api.Scope[0]);
        f24799O = aVar2.a();
        CREATOR = new com.google.android.gms.auth.api.signin.e();
        f24805U = new com.google.android.gms.auth.api.signin.d();
    }

    GoogleSignInOptions(int i6, java.util.ArrayList arrayList, android.accounts.Account account, boolean z6, boolean z10, boolean z11, java.lang.String str, java.lang.String str2, java.util.ArrayList arrayList2, java.lang.String str3) {
        this(i6, arrayList, account, z6, z10, z11, str, str2, Z(arrayList2), str3);
    }

    private GoogleSignInOptions(int i6, java.util.ArrayList arrayList, android.accounts.Account account, boolean z6, boolean z10, boolean z11, java.lang.String str, java.lang.String str2, java.util.Map map, java.lang.String str3) {
        this.f24806C = i6;
        this.f24807D = arrayList;
        this.f24808E = account;
        this.f24809F = z6;
        this.f24810G = z10;
        this.f24811H = z11;
        this.f24812I = str;
        this.f24813J = str2;
        this.f24814K = new java.util.ArrayList(map.values());
        this.f24816M = map;
        this.f24815L = str3;
    }

    public static com.google.android.gms.auth.api.signin.GoogleSignInOptions O(java.lang.String str) throws org.json.JSONException {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        java.util.HashSet hashSet = new java.util.HashSet();
        org.json.JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i6 = 0; i6 < length; i6++) {
            hashSet.add(new com.google.android.gms.common.api.Scope(jSONArray.getString(i6)));
        }
        java.lang.String strOptString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new com.google.android.gms.auth.api.signin.GoogleSignInOptions(3, new java.util.ArrayList(hashSet), !android.text.TextUtils.isEmpty(strOptString) ? new android.accounts.Account(strOptString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new java.util.HashMap(), (java.lang.String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.util.Map Z(java.util.List list) {
        java.util.HashMap map = new java.util.HashMap();
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                L3.a aVar = (L3.a) it.next();
                map.put(java.lang.Integer.valueOf(aVar.e()), aVar);
            }
        }
        return map;
    }

    public java.lang.String C() {
        return this.f24812I;
    }

    public boolean D() {
        return this.f24811H;
    }

    public boolean E() {
        return this.f24809F;
    }

    public boolean M() {
        return this.f24810G;
    }

    public final java.lang.String S() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.Collections.sort(this.f24807D, f24805U);
            java.util.Iterator it = this.f24807D.iterator();
            while (it.hasNext()) {
                jSONArray.put(((com.google.android.gms.common.api.Scope) it.next()).e());
            }
            jSONObject.put("scopes", jSONArray);
            android.accounts.Account account = this.f24808E;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.f24809F);
            jSONObject.put("forceCodeForRefreshToken", this.f24811H);
            jSONObject.put("serverAuthRequested", this.f24810G);
            if (!android.text.TextUtils.isEmpty(this.f24812I)) {
                jSONObject.put("serverClientId", this.f24812I);
            }
            if (!android.text.TextUtils.isEmpty(this.f24813J)) {
                jSONObject.put("hostedDomain", this.f24813J);
            }
            return jSONObject.toString();
        } catch (org.json.JSONException e6) {
            throw new java.lang.RuntimeException(e6);
        }
    }

    public android.accounts.Account e() {
        return this.f24808E;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0052 A[Catch: ClassCastException -> 0x0090, TryCatch #0 {ClassCastException -> 0x0090, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x004a, B:24:0x0052, B:30:0x006a, B:32:0x0072, B:34:0x007a, B:36:0x0082, B:27:0x005d, B:20:0x0040), top: B:42:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    /* JADX WARN: Code duplicated, block: B:27:0x005d A[Catch: ClassCastException -> 0x0090, TryCatch #0 {ClassCastException -> 0x0090, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x004a, B:24:0x0052, B:30:0x006a, B:32:0x0072, B:34:0x007a, B:36:0x0082, B:27:0x005d, B:20:0x0040), top: B:42:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0069  */
    /* JADX WARN: Code duplicated, block: B:30:0x006a A[Catch: ClassCastException -> 0x0090, TryCatch #0 {ClassCastException -> 0x0090, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x004a, B:24:0x0052, B:30:0x006a, B:32:0x0072, B:34:0x007a, B:36:0x0082, B:27:0x005d, B:20:0x0040), top: B:42:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0072 A[Catch: ClassCastException -> 0x0090, TryCatch #0 {ClassCastException -> 0x0090, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x004a, B:24:0x0052, B:30:0x006a, B:32:0x0072, B:34:0x007a, B:36:0x0082, B:27:0x005d, B:20:0x0040), top: B:42:0x0004 }] */
    public boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) obj;
            if (this.f24814K.isEmpty() && googleSignInOptions.f24814K.isEmpty() && this.f24807D.size() == googleSignInOptions.w().size() && this.f24807D.containsAll(googleSignInOptions.w())) {
                android.accounts.Account account = this.f24808E;
                if (account == null) {
                    if (googleSignInOptions.e() == null) {
                        if (android.text.TextUtils.isEmpty(this.f24812I)) {
                            if (android.text.TextUtils.isEmpty(googleSignInOptions.C())) {
                                if (this.f24811H != googleSignInOptions.D() && this.f24809F == googleSignInOptions.E() && this.f24810G == googleSignInOptions.M() && android.text.TextUtils.equals(this.f24815L, googleSignInOptions.s())) {
                                    return true;
                                }
                            }
                        } else if (!this.f24812I.equals(googleSignInOptions.C())) {
                            if (this.f24811H != googleSignInOptions.D()) {
                            }
                        }
                    }
                } else if (account.equals(googleSignInOptions.e())) {
                    if (android.text.TextUtils.isEmpty(this.f24812I)) {
                        if (android.text.TextUtils.isEmpty(googleSignInOptions.C())) {
                            if (this.f24811H != googleSignInOptions.D()) {
                            }
                        }
                    } else if (!this.f24812I.equals(googleSignInOptions.C())) {
                        if (this.f24811H != googleSignInOptions.D()) {
                        }
                    }
                }
            }
        } catch (java.lang.ClassCastException unused) {
        }
        return false;
    }

    public java.util.ArrayList f() {
        return this.f24814K;
    }

    public int hashCode() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = this.f24807D;
        int size = arrayList2.size();
        for (int i6 = 0; i6 < size; i6++) {
            arrayList.add(((com.google.android.gms.common.api.Scope) arrayList2.get(i6)).e());
        }
        java.util.Collections.sort(arrayList);
        L3.b bVar = new L3.b();
        bVar.a(arrayList);
        bVar.a(this.f24808E);
        bVar.a(this.f24812I);
        bVar.c(this.f24811H);
        bVar.c(this.f24809F);
        bVar.c(this.f24810G);
        bVar.a(this.f24815L);
        return bVar.b();
    }

    public java.lang.String s() {
        return this.f24815L;
    }

    public java.util.ArrayList w() {
        return new java.util.ArrayList(this.f24807D);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i6) {
        int i10 = this.f24806C;
        int iA = R3.c.a(parcel);
        R3.c.k(parcel, 1, i10);
        R3.c.u(parcel, 2, w(), false);
        R3.c.p(parcel, 3, e(), i6, false);
        R3.c.c(parcel, 4, E());
        R3.c.c(parcel, 5, M());
        R3.c.c(parcel, 6, D());
        R3.c.q(parcel, 7, C(), false);
        R3.c.q(parcel, 8, this.f24813J, false);
        R3.c.u(parcel, 9, f(), false);
        R3.c.q(parcel, 10, s(), false);
        R3.c.b(parcel, iA);
    }
}
