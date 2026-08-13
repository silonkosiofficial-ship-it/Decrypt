package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes3.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final com.google.android.material.datepicker.b f43207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final com.google.android.material.datepicker.b f43208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final com.google.android.material.datepicker.b f43209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final com.google.android.material.datepicker.b f43210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final com.google.android.material.datepicker.b f43211e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final com.google.android.material.datepicker.b f43212f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final com.google.android.material.datepicker.b f43213g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final android.graphics.Paint f43214h;

    c(android.content.Context context) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(B4.b.d(context, p125m4.a.f50530x, com.google.android.material.datepicker.j.class.getCanonicalName()), p125m4.j.f50947d3);
        this.f43207a = com.google.android.material.datepicker.b.a(context, typedArrayObtainStyledAttributes.getResourceId(p125m4.j.f50979h3, 0));
        this.f43213g = com.google.android.material.datepicker.b.a(context, typedArrayObtainStyledAttributes.getResourceId(p125m4.j.f50963f3, 0));
        this.f43208b = com.google.android.material.datepicker.b.a(context, typedArrayObtainStyledAttributes.getResourceId(p125m4.j.f50971g3, 0));
        this.f43209c = com.google.android.material.datepicker.b.a(context, typedArrayObtainStyledAttributes.getResourceId(p125m4.j.f50987i3, 0));
        android.content.res.ColorStateList colorStateListA = B4.c.a(context, typedArrayObtainStyledAttributes, p125m4.j.f50995j3);
        this.f43210d = com.google.android.material.datepicker.b.a(context, typedArrayObtainStyledAttributes.getResourceId(p125m4.j.f51011l3, 0));
        this.f43211e = com.google.android.material.datepicker.b.a(context, typedArrayObtainStyledAttributes.getResourceId(p125m4.j.f51003k3, 0));
        this.f43212f = com.google.android.material.datepicker.b.a(context, typedArrayObtainStyledAttributes.getResourceId(p125m4.j.f51019m3, 0));
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f43214h = paint;
        paint.setColor(colorStateListA.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
