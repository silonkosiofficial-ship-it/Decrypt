package A4;

/* JADX INFO: loaded from: classes3.dex */
public class a extends androidx.appcompat.widget.C1915v {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final int f257I = p125m4.i.f50707n;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final int[][] f258J = {new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private android.content.res.ColorStateList f259G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f260H;

    public a(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, p125m4.a.f50495M);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(android.content.Context context, android.util.AttributeSet attributeSet, int i6) {
        int i10 = f257I;
        super(H4.a.c(context, attributeSet, i6, i10), attributeSet, i6);
        android.content.Context context2 = getContext();
        android.content.res.TypedArray typedArrayI = com.google.android.material.internal.k.i(context2, attributeSet, p125m4.j.f50812M3, i6, i10, new int[0]);
        if (typedArrayI.hasValue(p125m4.j.f50820N3)) {
            androidx.core.widget.c.d(this, B4.c.a(context2, typedArrayI, p125m4.j.f50820N3));
        }
        this.f260H = typedArrayI.getBoolean(p125m4.j.f50828O3, false);
        typedArrayI.recycle();
    }

    private android.content.res.ColorStateList getMaterialThemeColorsTintList() {
        if (this.f259G == null) {
            int iD = p195t4.a.d(this, p125m4.a.f50514h);
            int iD2 = p195t4.a.d(this, p125m4.a.f50517k);
            int iD3 = p195t4.a.d(this, p125m4.a.f50520n);
            int[][] iArr = f258J;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = p195t4.a.j(iD3, iD, 1.0f);
            iArr2[1] = p195t4.a.j(iD3, iD2, 0.54f);
            iArr2[2] = p195t4.a.j(iD3, iD2, 0.38f);
            iArr2[3] = p195t4.a.j(iD3, iD2, 0.38f);
            this.f259G = new android.content.res.ColorStateList(iArr, iArr2);
        }
        return this.f259G;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f260H && androidx.core.widget.c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z6) {
        this.f260H = z6;
        androidx.core.widget.c.d(this, z6 ? getMaterialThemeColorsTintList() : null);
    }
}
