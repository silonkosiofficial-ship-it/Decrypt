package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes3.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.graphics.Rect f43201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.content.res.ColorStateList f43202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.content.res.ColorStateList f43203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final android.content.res.ColorStateList f43204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f43205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final E4.k f43206f;

    private b(android.content.res.ColorStateList colorStateList, android.content.res.ColorStateList colorStateList2, android.content.res.ColorStateList colorStateList3, int i6, E4.k kVar, android.graphics.Rect rect) {
        B1.i.d(rect.left);
        B1.i.d(rect.top);
        B1.i.d(rect.right);
        B1.i.d(rect.bottom);
        this.f43201a = rect;
        this.f43202b = colorStateList2;
        this.f43203c = colorStateList;
        this.f43204d = colorStateList3;
        this.f43205e = i6;
        this.f43206f = kVar;
    }

    static com.google.android.material.datepicker.b a(android.content.Context context, int i6) {
        B1.i.b(i6 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i6, p125m4.j.f51027n3);
        android.graphics.Rect rect = new android.graphics.Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(p125m4.j.f51035o3, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(p125m4.j.f51051q3, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(p125m4.j.f51043p3, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(p125m4.j.f51059r3, 0));
        android.content.res.ColorStateList colorStateListA = B4.c.a(context, typedArrayObtainStyledAttributes, p125m4.j.f51067s3);
        android.content.res.ColorStateList colorStateListA2 = B4.c.a(context, typedArrayObtainStyledAttributes, p125m4.j.f51107x3);
        android.content.res.ColorStateList colorStateListA3 = B4.c.a(context, typedArrayObtainStyledAttributes, p125m4.j.f51091v3);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(p125m4.j.f51099w3, 0);
        E4.k kVarM = E4.k.b(context, typedArrayObtainStyledAttributes.getResourceId(p125m4.j.f51075t3, 0), typedArrayObtainStyledAttributes.getResourceId(p125m4.j.f51083u3, 0)).m();
        typedArrayObtainStyledAttributes.recycle();
        return new com.google.android.material.datepicker.b(colorStateListA, colorStateListA2, colorStateListA3, dimensionPixelSize, kVarM, rect);
    }

    void b(android.widget.TextView textView) {
        c(textView, null, null);
    }

    void c(android.widget.TextView textView, android.content.res.ColorStateList colorStateList, android.content.res.ColorStateList colorStateList2) {
        E4.g gVar = new E4.g();
        E4.g gVar2 = new E4.g();
        gVar.setShapeAppearanceModel(this.f43206f);
        gVar2.setShapeAppearanceModel(this.f43206f);
        if (colorStateList == null) {
            colorStateList = this.f43203c;
        }
        gVar.V(colorStateList);
        gVar.a0(this.f43205e, this.f43204d);
        if (colorStateList2 == null) {
            colorStateList2 = this.f43202b;
        }
        textView.setTextColor(colorStateList2);
        android.graphics.drawable.RippleDrawable rippleDrawable = new android.graphics.drawable.RippleDrawable(this.f43202b.withAlpha(30), gVar, gVar2);
        android.graphics.Rect rect = this.f43201a;
        androidx.core.view.X.r0(textView, new android.graphics.drawable.InsetDrawable((android.graphics.drawable.Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
