package p249y9;

/* JADX INFO: renamed from: y9.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7363g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f57420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f57421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f57422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f57423d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f57424e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f57425f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.lang.String f57426g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f57427h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f57428i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final java.lang.String f57429j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f57430k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f57431l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f57432m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f57433n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f57434o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private p249y9.EnumC7357a f57435p;

    public C7363g(boolean z6, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, java.lang.String str, boolean z15, boolean z16, java.lang.String str2, boolean z17, boolean z18, p249y9.z zVar, boolean z19, boolean z20, boolean z21, p249y9.EnumC7357a enumC7357a) {
        p247y7.AbstractC7350t.f(str, "prettyPrintIndent");
        p247y7.AbstractC7350t.f(str2, "classDiscriminator");
        p247y7.AbstractC7350t.f(enumC7357a, "classDiscriminatorMode");
        this.f57420a = z6;
        this.f57421b = z10;
        this.f57422c = z11;
        this.f57423d = z12;
        this.f57424e = z13;
        this.f57425f = z14;
        this.f57426g = str;
        this.f57427h = z15;
        this.f57428i = z16;
        this.f57429j = str2;
        this.f57430k = z17;
        this.f57431l = z18;
        this.f57432m = z19;
        this.f57433n = z20;
        this.f57434o = z21;
        this.f57435p = enumC7357a;
    }

    public /* synthetic */ C7363g(boolean z6, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, java.lang.String str, boolean z15, boolean z16, java.lang.String str2, boolean z17, boolean z18, p249y9.z zVar, boolean z19, boolean z20, boolean z21, p249y9.EnumC7357a enumC7357a, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? false : z6, (i6 & 2) != 0 ? false : z10, (i6 & 4) != 0 ? false : z11, (i6 & 8) != 0 ? false : z12, (i6 & 16) != 0 ? false : z13, (i6 & 32) != 0 ? true : z14, (i6 & 64) != 0 ? "    " : str, (i6 & 128) != 0 ? false : z15, (i6 & 256) != 0 ? false : z16, (i6 & 512) != 0 ? "type" : str2, (i6 & 1024) != 0 ? false : z17, (i6 & 2048) == 0 ? z18 : true, (i6 & 4096) != 0 ? null : zVar, (i6 & 8192) != 0 ? false : z19, (i6 & 16384) != 0 ? false : z20, (i6 & 32768) != 0 ? false : z21, (i6 & 65536) != 0 ? p249y9.EnumC7357a.POLYMORPHIC : enumC7357a);
    }

    public final boolean a() {
        return this.f57434o;
    }

    public final boolean b() {
        return this.f57430k;
    }

    public final boolean c() {
        return this.f57423d;
    }

    public final boolean d() {
        return this.f57433n;
    }

    public final java.lang.String e() {
        return this.f57429j;
    }

    public final p249y9.EnumC7357a f() {
        return this.f57435p;
    }

    public final boolean g() {
        return this.f57427h;
    }

    public final boolean h() {
        return this.f57432m;
    }

    public final boolean i() {
        return this.f57420a;
    }

    public final boolean j() {
        return this.f57425f;
    }

    public final boolean k() {
        return this.f57421b;
    }

    public final p249y9.z l() {
        return null;
    }

    public final boolean m() {
        return this.f57424e;
    }

    public final java.lang.String n() {
        return this.f57426g;
    }

    public final boolean o() {
        return this.f57431l;
    }

    public final boolean p() {
        return this.f57428i;
    }

    public final boolean q() {
        return this.f57422c;
    }

    public java.lang.String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f57420a + ", ignoreUnknownKeys=" + this.f57421b + ", isLenient=" + this.f57422c + ", allowStructuredMapKeys=" + this.f57423d + ", prettyPrint=" + this.f57424e + ", explicitNulls=" + this.f57425f + ", prettyPrintIndent='" + this.f57426g + "', coerceInputValues=" + this.f57427h + ", useArrayPolymorphism=" + this.f57428i + ", classDiscriminator='" + this.f57429j + "', allowSpecialFloatingPointValues=" + this.f57430k + ", useAlternativeNames=" + this.f57431l + ", namingStrategy=" + ((java.lang.Object) null) + ", decodeEnumsCaseInsensitive=" + this.f57432m + ", allowTrailingComma=" + this.f57433n + ", allowComments=" + this.f57434o + ", classDiscriminatorMode=" + this.f57435p + ')';
    }
}
