package G4;

/* JADX INFO: loaded from: classes3.dex */
public class a extends androidx.appcompat.widget.D {
    public a(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.textViewStyle);
    }

    public a(android.content.Context context, android.util.AttributeSet attributeSet, int i6) {
        super(H4.a.c(context, attributeSet, i6, 0), attributeSet, i6);
        E(attributeSet, i6, 0);
    }

    private void B(android.content.res.Resources.Theme theme, int i6) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i6, p125m4.j.f50868T3);
        int iF = F(getContext(), typedArrayObtainStyledAttributes, p125m4.j.f50884V3, p125m4.j.f50892W3);
        typedArrayObtainStyledAttributes.recycle();
        if (iF >= 0) {
            setLineHeight(iF);
        }
    }

    private static boolean C(android.content.Context context) {
        return B4.b.b(context, p125m4.a.f50503U, true);
    }

    private static int D(android.content.res.Resources.Theme theme, android.util.AttributeSet attributeSet, int i6, int i10) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, p125m4.j.f50900X3, i6, i10);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(p125m4.j.f50908Y3, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private void E(android.util.AttributeSet attributeSet, int i6, int i10) {
        int iD;
        android.content.Context context = getContext();
        if (C(context)) {
            android.content.res.Resources.Theme theme = context.getTheme();
            if (G(context, theme, attributeSet, i6, i10) || (iD = D(theme, attributeSet, i6, i10)) == -1) {
                return;
            }
            B(theme, iD);
        }
    }

    private static int F(android.content.Context context, android.content.res.TypedArray typedArray, int... iArr) {
        int iC = -1;
        for (int i6 = 0; i6 < iArr.length && iC < 0; i6++) {
            iC = B4.c.c(context, typedArray, iArr[i6], -1);
        }
        return iC;
    }

    private static boolean G(android.content.Context context, android.content.res.Resources.Theme theme, android.util.AttributeSet attributeSet, int i6, int i10) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, p125m4.j.f50900X3, i6, i10);
        int iF = F(context, typedArrayObtainStyledAttributes, p125m4.j.f50916Z3, p125m4.j.f50924a4);
        typedArrayObtainStyledAttributes.recycle();
        return iF != -1;
    }

    @Override // androidx.appcompat.widget.D, android.widget.TextView
    public void setTextAppearance(android.content.Context context, int i6) {
        super.setTextAppearance(context, i6);
        if (C(context)) {
            B(context.getTheme(), i6);
        }
    }
}
