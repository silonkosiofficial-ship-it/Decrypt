package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f18454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.content.res.TypedArray f18455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.util.TypedValue f18456c;

    private c0(android.content.Context context, android.content.res.TypedArray typedArray) {
        this.f18454a = context;
        this.f18455b = typedArray;
    }

    public static androidx.appcompat.widget.c0 t(android.content.Context context, int i6, int[] iArr) {
        return new androidx.appcompat.widget.c0(context, context.obtainStyledAttributes(i6, iArr));
    }

    public static androidx.appcompat.widget.c0 u(android.content.Context context, android.util.AttributeSet attributeSet, int[] iArr) {
        return new androidx.appcompat.widget.c0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static androidx.appcompat.widget.c0 v(android.content.Context context, android.util.AttributeSet attributeSet, int[] iArr, int i6, int i10) {
        return new androidx.appcompat.widget.c0(context, context.obtainStyledAttributes(attributeSet, iArr, i6, i10));
    }

    public boolean a(int i6, boolean z6) {
        return this.f18455b.getBoolean(i6, z6);
    }

    public int b(int i6, int i10) {
        return this.f18455b.getColor(i6, i10);
    }

    public android.content.res.ColorStateList c(int i6) {
        int resourceId;
        android.content.res.ColorStateList colorStateListA;
        return (!this.f18455b.hasValue(i6) || (resourceId = this.f18455b.getResourceId(i6, 0)) == 0 || (colorStateListA = p100k.a.a(this.f18454a, resourceId)) == null) ? this.f18455b.getColorStateList(i6) : colorStateListA;
    }

    public float d(int i6, float f6) {
        return this.f18455b.getDimension(i6, f6);
    }

    public int e(int i6, int i10) {
        return this.f18455b.getDimensionPixelOffset(i6, i10);
    }

    public int f(int i6, int i10) {
        return this.f18455b.getDimensionPixelSize(i6, i10);
    }

    public android.graphics.drawable.Drawable g(int i6) {
        int resourceId;
        return (!this.f18455b.hasValue(i6) || (resourceId = this.f18455b.getResourceId(i6, 0)) == 0) ? this.f18455b.getDrawable(i6) : p100k.a.b(this.f18454a, resourceId);
    }

    public android.graphics.drawable.Drawable h(int i6) {
        int resourceId;
        if (!this.f18455b.hasValue(i6) || (resourceId = this.f18455b.getResourceId(i6, 0)) == 0) {
            return null;
        }
        return androidx.appcompat.widget.C1905k.b().d(this.f18454a, resourceId, true);
    }

    public float i(int i6, float f6) {
        return this.f18455b.getFloat(i6, f6);
    }

    public android.graphics.Typeface j(int i6, int i10, androidx.core.content.res.h.e eVar) {
        int resourceId = this.f18455b.getResourceId(i6, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f18456c == null) {
            this.f18456c = new android.util.TypedValue();
        }
        return androidx.core.content.res.h.h(this.f18454a, resourceId, this.f18456c, i10, eVar);
    }

    public int k(int i6, int i10) {
        return this.f18455b.getInt(i6, i10);
    }

    public int l(int i6, int i10) {
        return this.f18455b.getInteger(i6, i10);
    }

    public int m(int i6, int i10) {
        return this.f18455b.getLayoutDimension(i6, i10);
    }

    public int n(int i6, int i10) {
        return this.f18455b.getResourceId(i6, i10);
    }

    public java.lang.String o(int i6) {
        return this.f18455b.getString(i6);
    }

    public java.lang.CharSequence p(int i6) {
        return this.f18455b.getText(i6);
    }

    public java.lang.CharSequence[] q(int i6) {
        return this.f18455b.getTextArray(i6);
    }

    public android.content.res.TypedArray r() {
        return this.f18455b;
    }

    public boolean s(int i6) {
        return this.f18455b.hasValue(i6);
    }

    public void w() {
        this.f18455b.recycle();
    }
}
