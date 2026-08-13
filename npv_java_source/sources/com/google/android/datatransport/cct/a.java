package com.google.android.datatransport.cct;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Y2.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final java.lang.String f24682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final java.lang.String f24683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final java.lang.String f24684e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final java.util.Set f24685f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final com.google.android.datatransport.cct.a f24686g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final com.google.android.datatransport.cct.a f24687h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f24688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f24689b;

    static {
        java.lang.String strA = com.google.android.datatransport.cct.e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f24682c = strA;
        java.lang.String strA2 = com.google.android.datatransport.cct.e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f24683d = strA2;
        java.lang.String strA3 = com.google.android.datatransport.cct.e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f24684e = strA3;
        f24685f = j$.util.DesugarCollections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList(W2.b.b("proto"), W2.b.b("json"))));
        f24686g = new com.google.android.datatransport.cct.a(strA, null);
        f24687h = new com.google.android.datatransport.cct.a(strA2, strA3);
    }

    public a(java.lang.String str, java.lang.String str2) {
        this.f24688a = str;
        this.f24689b = str2;
    }

    public static com.google.android.datatransport.cct.a c(byte[] bArr) {
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new java.lang.IllegalArgumentException("Version marker missing from extras");
        }
        java.lang.String[] strArrSplit = str.substring(2).split(java.util.regex.Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new java.lang.IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        java.lang.String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        java.lang.String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new com.google.android.datatransport.cct.a(str2, str3);
    }

    @Override // Y2.g
    public java.util.Set a() {
        return f24685f;
    }

    public byte[] b() {
        java.lang.String str = this.f24689b;
        if (str == null && this.f24688a == null) {
            return null;
        }
        java.lang.String str2 = this.f24688a;
        if (str == null) {
            str = "";
        }
        return java.lang.String.format("%s%s%s%s", "1$", str2, "\\", str).getBytes(java.nio.charset.Charset.forName("UTF-8"));
    }

    public java.lang.String d() {
        return this.f24689b;
    }

    public java.lang.String e() {
        return this.f24688a;
    }

    @Override // Y2.f
    public byte[] getExtras() {
        return b();
    }

    @Override // Y2.f
    public java.lang.String getName() {
        return "cct";
    }
}
