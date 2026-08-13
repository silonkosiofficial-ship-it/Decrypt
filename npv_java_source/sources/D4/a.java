package D4;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f1904i = new int[3];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float[] f1905j = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int[] f1906k = new int[4];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float[] f1907l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.graphics.Paint f1908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.graphics.Paint f1909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.graphics.Paint f1910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f1911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f1912e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f1913f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final android.graphics.Path f1914g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final android.graphics.Paint f1915h;

    public a() {
        this(-16777216);
    }

    public a(int i6) {
        this.f1914g = new android.graphics.Path();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f1915h = paint;
        this.f1908a = new android.graphics.Paint();
        d(i6);
        paint.setColor(0);
        android.graphics.Paint paint2 = new android.graphics.Paint(4);
        this.f1909b = paint2;
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        this.f1910c = new android.graphics.Paint(paint2);
    }

    public void a(android.graphics.Canvas canvas, android.graphics.Matrix matrix, android.graphics.RectF rectF, int i6, float f6, float f10) {
        boolean z6 = f10 < 0.0f;
        android.graphics.Path path = this.f1914g;
        if (z6) {
            int[] iArr = f1906k;
            iArr[0] = 0;
            iArr[1] = this.f1913f;
            iArr[2] = this.f1912e;
            iArr[3] = this.f1911d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f6, f10);
            path.close();
            float f11 = -i6;
            rectF.inset(f11, f11);
            int[] iArr2 = f1906k;
            iArr2[0] = 0;
            iArr2[1] = this.f1911d;
            iArr2[2] = this.f1912e;
            iArr2[3] = this.f1913f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f12 = 1.0f - (i6 / fWidth);
        float[] fArr = f1907l;
        fArr[1] = f12;
        fArr[2] = ((1.0f - f12) / 2.0f) + f12;
        this.f1909b.setShader(new android.graphics.RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, f1906k, fArr, android.graphics.Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z6) {
            canvas.clipPath(path, android.graphics.Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f1915h);
        }
        canvas.drawArc(rectF, f6, f10, true, this.f1909b);
        canvas.restore();
    }

    public void b(android.graphics.Canvas canvas, android.graphics.Matrix matrix, android.graphics.RectF rectF, int i6) {
        rectF.bottom += i6;
        rectF.offset(0.0f, -i6);
        int[] iArr = f1904i;
        iArr[0] = this.f1913f;
        iArr[1] = this.f1912e;
        iArr[2] = this.f1911d;
        android.graphics.Paint paint = this.f1910c;
        float f6 = rectF.left;
        paint.setShader(new android.graphics.LinearGradient(f6, rectF.top, f6, rectF.bottom, iArr, f1905j, android.graphics.Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f1910c);
        canvas.restore();
    }

    public android.graphics.Paint c() {
        return this.f1908a;
    }

    public void d(int i6) {
        this.f1911d = androidx.core.graphics.a.k(i6, 68);
        this.f1912e = androidx.core.graphics.a.k(i6, 20);
        this.f1913f = androidx.core.graphics.a.k(i6, 0);
        this.f1908a.setColor(this.f1911d);
    }
}
