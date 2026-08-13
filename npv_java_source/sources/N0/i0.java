package N0;

/* JADX INFO: loaded from: classes.dex */
final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.CharSequence f7557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f7558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f7559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final android.text.TextPaint f7560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f7561e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final android.text.TextDirectionHeuristic f7562f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final android.text.Layout.Alignment f7563g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f7564h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final android.text.TextUtils.TruncateAt f7565i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f7566j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final float f7567k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final float f7568l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f7569m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f7570n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f7571o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f7572p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f7573q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f7574r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f7575s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int[] f7576t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final int[] f7577u;

    public i0(java.lang.CharSequence charSequence, int i6, int i10, android.text.TextPaint textPaint, int i11, android.text.TextDirectionHeuristic textDirectionHeuristic, android.text.Layout.Alignment alignment, int i12, android.text.TextUtils.TruncateAt truncateAt, int i13, float f6, float f10, int i14, boolean z6, boolean z10, int i15, int i16, int i17, int i18, int[] iArr, int[] iArr2) {
        this.f7557a = charSequence;
        this.f7558b = i6;
        this.f7559c = i10;
        this.f7560d = textPaint;
        this.f7561e = i11;
        this.f7562f = textDirectionHeuristic;
        this.f7563g = alignment;
        this.f7564h = i12;
        this.f7565i = truncateAt;
        this.f7566j = i13;
        this.f7567k = f6;
        this.f7568l = f10;
        this.f7569m = i14;
        this.f7570n = z6;
        this.f7571o = z10;
        this.f7572p = i15;
        this.f7573q = i16;
        this.f7574r = i17;
        this.f7575s = i18;
        this.f7576t = iArr;
        this.f7577u = iArr2;
        if (i6 < 0 || i6 > i10) {
            throw new java.lang.IllegalArgumentException("invalid start value".toString());
        }
        int length = charSequence.length();
        if (i10 < 0 || i10 > length) {
            throw new java.lang.IllegalArgumentException("invalid end value".toString());
        }
        if (i12 < 0) {
            throw new java.lang.IllegalArgumentException("invalid maxLines value".toString());
        }
        if (i11 < 0) {
            throw new java.lang.IllegalArgumentException("invalid width value".toString());
        }
        if (i13 < 0) {
            throw new java.lang.IllegalArgumentException("invalid ellipsizedWidth value".toString());
        }
        if (f6 < 0.0f) {
            throw new java.lang.IllegalArgumentException("invalid lineSpacingMultiplier value".toString());
        }
    }

    public final android.text.Layout.Alignment a() {
        return this.f7563g;
    }

    public final int b() {
        return this.f7572p;
    }

    public final android.text.TextUtils.TruncateAt c() {
        return this.f7565i;
    }

    public final int d() {
        return this.f7566j;
    }

    public final int e() {
        return this.f7559c;
    }

    public final int f() {
        return this.f7575s;
    }

    public final boolean g() {
        return this.f7570n;
    }

    public final int h() {
        return this.f7569m;
    }

    public final int[] i() {
        return this.f7576t;
    }

    public final int j() {
        return this.f7573q;
    }

    public final int k() {
        return this.f7574r;
    }

    public final float l() {
        return this.f7568l;
    }

    public final float m() {
        return this.f7567k;
    }

    public final int n() {
        return this.f7564h;
    }

    public final android.text.TextPaint o() {
        return this.f7560d;
    }

    public final int[] p() {
        return this.f7577u;
    }

    public final int q() {
        return this.f7558b;
    }

    public final java.lang.CharSequence r() {
        return this.f7557a;
    }

    public final android.text.TextDirectionHeuristic s() {
        return this.f7562f;
    }

    public final boolean t() {
        return this.f7571o;
    }

    public final int u() {
        return this.f7561e;
    }
}
