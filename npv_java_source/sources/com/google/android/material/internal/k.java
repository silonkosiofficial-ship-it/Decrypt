package com.google.android.material.internal;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f43460a = {p125m4.a.f50518l};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f43461b = {p125m4.a.f50519m};

    public static void a(android.content.Context context) {
        e(context, f43460a, "Theme.AppCompat");
    }

    private static void b(android.content.Context context, android.util.AttributeSet attributeSet, int i6, int i10) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p125m4.j.f51006k7, i6, i10);
        boolean z6 = typedArrayObtainStyledAttributes.getBoolean(p125m4.j.f51022m7, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z6) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            if (!context.getTheme().resolveAttribute(p125m4.a.f50526t, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context);
            }
        }
        a(context);
    }

    public static void c(android.content.Context context) {
        e(context, f43461b, "Theme.MaterialComponents");
    }

    private static void d(android.content.Context context, android.util.AttributeSet attributeSet, int[] iArr, int i6, int i10, int... iArr2) {
        boolean zF;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p125m4.j.f51006k7, i6, i10);
        if (!typedArrayObtainStyledAttributes.getBoolean(p125m4.j.f51030n7, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            zF = typedArrayObtainStyledAttributes.getResourceId(p125m4.j.f51014l7, -1) != -1;
        } else {
            zF = f(context, attributeSet, iArr, i6, i10, iArr2);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!zF) {
            throw new java.lang.IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    private static void e(android.content.Context context, int[] iArr, java.lang.String str) {
        if (h(context, iArr)) {
            return;
        }
        throw new java.lang.IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
    }

    private static boolean f(android.content.Context context, android.util.AttributeSet attributeSet, int[] iArr, int i6, int i10, int... iArr2) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i6, i10);
        for (int i11 : iArr2) {
            if (typedArrayObtainStyledAttributes.getResourceId(i11, -1) == -1) {
                typedArrayObtainStyledAttributes.recycle();
                return false;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return true;
    }

    public static boolean g(android.content.Context context) {
        return B4.b.b(context, p125m4.a.f50525s, false);
    }

    private static boolean h(android.content.Context context, int[] iArr) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i6 = 0; i6 < iArr.length; i6++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i6)) {
                typedArrayObtainStyledAttributes.recycle();
                return false;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return true;
    }

    public static android.content.res.TypedArray i(android.content.Context context, android.util.AttributeSet attributeSet, int[] iArr, int i6, int i10, int... iArr2) {
        b(context, attributeSet, i6, i10);
        d(context, attributeSet, iArr, i6, i10, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i6, i10);
    }

    public static androidx.appcompat.widget.c0 j(android.content.Context context, android.util.AttributeSet attributeSet, int[] iArr, int i6, int i10, int... iArr2) {
        b(context, attributeSet, i6, i10);
        d(context, attributeSet, iArr, i6, i10, iArr2);
        return androidx.appcompat.widget.c0.v(context, attributeSet, iArr, i6, i10);
    }
}
