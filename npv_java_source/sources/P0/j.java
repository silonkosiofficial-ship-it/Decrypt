package P0;

/* JADX INFO: loaded from: classes.dex */
public final class j extends android.text.style.ReplacementSpan {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final P0.j.a f8253k = new P0.j.a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f8254l = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f8255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f8256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f8257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f8258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f8259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f8260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private android.graphics.Paint.FontMetricsInt f8261g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f8262h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f8263i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f8264j;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public final android.graphics.Paint.FontMetricsInt a() {
        android.graphics.Paint.FontMetricsInt fontMetricsInt = this.f8261g;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        p247y7.AbstractC7350t.p("fontMetrics");
        return null;
    }

    public final int b() {
        if (this.f8264j) {
            return this.f8263i;
        }
        throw new java.lang.IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }

    public final int c() {
        return this.f8260f;
    }

    public final int d() {
        if (this.f8264j) {
            return this.f8262h;
        }
        throw new java.lang.IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i6, int i10, float f6, int i11, int i12, int i13, android.graphics.Paint paint) {
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(android.graphics.Paint paint, java.lang.CharSequence charSequence, int i6, int i10, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        float f6;
        float f10;
        int iB;
        int iB2;
        this.f8264j = true;
        float textSize = paint.getTextSize();
        this.f8261g = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            throw new java.lang.IllegalArgumentException("Invalid fontMetrics: line height can not be negative.".toString());
        }
        int i11 = this.f8256b;
        if (i11 == 0) {
            f6 = this.f8255a * this.f8259e;
        } else {
            if (i11 != 1) {
                throw new java.lang.IllegalArgumentException("Unsupported unit.");
            }
            f6 = this.f8255a * textSize;
        }
        this.f8262h = P0.k.a(f6);
        int i12 = this.f8258d;
        if (i12 == 0) {
            f10 = this.f8257c * this.f8259e;
        } else {
            if (i12 != 1) {
                throw new java.lang.IllegalArgumentException("Unsupported unit.");
            }
            f10 = this.f8257c * textSize;
        }
        this.f8263i = P0.k.a(f10);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            switch (this.f8260f) {
                case 0:
                    if (fontMetricsInt.ascent > (-b())) {
                        iB = -b();
                        fontMetricsInt.ascent = iB;
                    }
                    fontMetricsInt.top = java.lang.Math.min(a().top, fontMetricsInt.ascent);
                    fontMetricsInt.bottom = java.lang.Math.max(a().bottom, fontMetricsInt.descent);
                    break;
                case 1:
                case 4:
                    if (fontMetricsInt.ascent + b() > fontMetricsInt.descent) {
                        iB2 = fontMetricsInt.ascent;
                        fontMetricsInt.descent = iB2 + b();
                    }
                    fontMetricsInt.top = java.lang.Math.min(a().top, fontMetricsInt.ascent);
                    fontMetricsInt.bottom = java.lang.Math.max(a().bottom, fontMetricsInt.descent);
                    break;
                case 2:
                case 5:
                    if (fontMetricsInt.ascent > fontMetricsInt.descent - b()) {
                        iB = fontMetricsInt.descent - b();
                        fontMetricsInt.ascent = iB;
                    }
                    fontMetricsInt.top = java.lang.Math.min(a().top, fontMetricsInt.ascent);
                    fontMetricsInt.bottom = java.lang.Math.max(a().bottom, fontMetricsInt.descent);
                    break;
                case 3:
                case 6:
                    if (fontMetricsInt.descent - fontMetricsInt.ascent < b()) {
                        iB2 = fontMetricsInt.ascent - ((b() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                        fontMetricsInt.ascent = iB2;
                        fontMetricsInt.descent = iB2 + b();
                    }
                    fontMetricsInt.top = java.lang.Math.min(a().top, fontMetricsInt.ascent);
                    fontMetricsInt.bottom = java.lang.Math.max(a().bottom, fontMetricsInt.descent);
                    break;
                default:
                    throw new java.lang.IllegalArgumentException("Unknown verticalAlign.");
            }
        }
        return d();
    }
}
