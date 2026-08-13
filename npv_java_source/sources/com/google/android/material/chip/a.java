package com.google.android.material.chip;

/* JADX INFO: loaded from: classes3.dex */
public class a extends E4.g implements android.graphics.drawable.Drawable.Callback, com.google.android.material.internal.i.b {

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    private static final int[] f43118l1 = {android.R.attr.state_enabled};

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    private static final android.graphics.drawable.ShapeDrawable f43119m1 = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.OvalShape());

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    private float f43120A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    private float f43121B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    private float f43122C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    private float f43123D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    private float f43124E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    private float f43125F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    private float f43126G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    private float f43127H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    private final android.content.Context f43128I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    private final android.graphics.Paint f43129J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    private final android.graphics.Paint f43130K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    private final android.graphics.Paint.FontMetrics f43131L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    private final android.graphics.RectF f43132M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    private final android.graphics.PointF f43133N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    private final android.graphics.Path f43134O0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    private final com.google.android.material.internal.i f43135P0;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    private int f43136Q0;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    private int f43137R0;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    private int f43138S0;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    private int f43139T0;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    private int f43140U0;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    private int f43141V0;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    private boolean f43142W0;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    private int f43143X0;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    private int f43144Y0;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    private android.graphics.ColorFilter f43145Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private android.graphics.PorterDuffColorFilter f43146a1;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private android.content.res.ColorStateList f43147b0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private android.content.res.ColorStateList f43148b1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private android.content.res.ColorStateList f43149c0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private android.graphics.PorterDuff.Mode f43150c1;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private float f43151d0;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private int[] f43152d1;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private float f43153e0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private boolean f43154e1;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private android.content.res.ColorStateList f43155f0;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private android.content.res.ColorStateList f43156f1;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private float f43157g0;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private java.lang.ref.WeakReference f43158g1;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private android.content.res.ColorStateList f43159h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    private android.text.TextUtils.TruncateAt f43160h1;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private java.lang.CharSequence f43161i0;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    private boolean f43162i1;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private boolean f43163j0;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    private int f43164j1;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private android.graphics.drawable.Drawable f43165k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    private boolean f43166k1;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private android.content.res.ColorStateList f43167l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private float f43168m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private boolean f43169n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private boolean f43170o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private android.graphics.drawable.Drawable f43171p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private android.graphics.drawable.Drawable f43172q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private android.content.res.ColorStateList f43173r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private float f43174s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private java.lang.CharSequence f43175t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private boolean f43176u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private boolean f43177v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private android.graphics.drawable.Drawable f43178w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private android.content.res.ColorStateList f43179x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private p135n4.d f43180y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private p135n4.d f43181z0;

    /* JADX INFO: renamed from: com.google.android.material.chip.a$a, reason: collision with other inner class name */
    public interface InterfaceC0473a {
        void a();
    }

    private a(android.content.Context context, android.util.AttributeSet attributeSet, int i6, int i10) {
        super(context, attributeSet, i6, i10);
        this.f43153e0 = -1.0f;
        this.f43129J0 = new android.graphics.Paint(1);
        this.f43131L0 = new android.graphics.Paint.FontMetrics();
        this.f43132M0 = new android.graphics.RectF();
        this.f43133N0 = new android.graphics.PointF();
        this.f43134O0 = new android.graphics.Path();
        this.f43144Y0 = 255;
        this.f43150c1 = android.graphics.PorterDuff.Mode.SRC_IN;
        this.f43158g1 = new java.lang.ref.WeakReference(null);
        K(context);
        this.f43128I0 = context;
        com.google.android.material.internal.i iVar = new com.google.android.material.internal.i(this);
        this.f43135P0 = iVar;
        this.f43161i0 = "";
        iVar.f().density = context.getResources().getDisplayMetrics().density;
        this.f43130K0 = null;
        int[] iArr = f43118l1;
        setState(iArr);
        h2(iArr);
        this.f43162i1 = true;
        if (C4.b.f1290a) {
            f43119m1.setTint(-1);
        }
    }

    private void A0(android.graphics.Canvas canvas, android.graphics.Rect rect) {
        if (this.f43161i0 != null) {
            android.graphics.Paint.Align alignP0 = p0(rect, this.f43133N0);
            n0(rect, this.f43132M0);
            if (this.f43135P0.e() != null) {
                this.f43135P0.f().drawableState = getState();
                this.f43135P0.l(this.f43128I0);
            }
            this.f43135P0.f().setTextAlign(alignP0);
            int iSave = 0;
            boolean z6 = java.lang.Math.round(this.f43135P0.g(d1().toString())) > java.lang.Math.round(this.f43132M0.width());
            if (z6) {
                iSave = canvas.save();
                canvas.clipRect(this.f43132M0);
            }
            java.lang.CharSequence charSequenceEllipsize = this.f43161i0;
            if (z6 && this.f43160h1 != null) {
                charSequenceEllipsize = android.text.TextUtils.ellipsize(charSequenceEllipsize, this.f43135P0.f(), this.f43132M0.width(), this.f43160h1);
            }
            java.lang.CharSequence charSequence = charSequenceEllipsize;
            int length = charSequence.length();
            android.graphics.PointF pointF = this.f43133N0;
            canvas.drawText(charSequence, 0, length, pointF.x, pointF.y, this.f43135P0.f());
            if (z6) {
                canvas.restoreToCount(iSave);
            }
        }
    }

    private boolean J2() {
        return this.f43177v0 && this.f43178w0 != null && this.f43142W0;
    }

    private boolean K2() {
        return this.f43163j0 && this.f43165k0 != null;
    }

    private boolean L2() {
        return this.f43170o0 && this.f43171p0 != null;
    }

    private void M2(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    private void N2() {
        this.f43156f1 = this.f43154e1 ? C4.b.a(this.f43159h0) : null;
    }

    private void O2() {
        this.f43172q0 = new android.graphics.drawable.RippleDrawable(C4.b.a(b1()), this.f43171p0, f43119m1);
    }

    private float V0() {
        android.graphics.drawable.Drawable drawable = this.f43142W0 ? this.f43178w0 : this.f43165k0;
        float fCeil = this.f43168m0;
        if (fCeil <= 0.0f && drawable != null) {
            fCeil = (float) java.lang.Math.ceil(com.google.android.material.internal.n.c(this.f43128I0, 24));
            if (drawable.getIntrinsicHeight() <= fCeil) {
                return drawable.getIntrinsicHeight();
            }
        }
        return fCeil;
    }

    private float W0() {
        android.graphics.drawable.Drawable drawable = this.f43142W0 ? this.f43178w0 : this.f43165k0;
        float f6 = this.f43168m0;
        return (f6 > 0.0f || drawable == null) ? f6 : drawable.getIntrinsicWidth();
    }

    private void X1(android.content.res.ColorStateList colorStateList) {
        if (this.f43147b0 != colorStateList) {
            this.f43147b0 = colorStateList;
            onStateChange(getState());
        }
    }

    private void g0(android.graphics.drawable.Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        androidx.core.graphics.drawable.a.m(drawable, androidx.core.graphics.drawable.a.f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f43171p0) {
            if (drawable.isStateful()) {
                drawable.setState(S0());
            }
            androidx.core.graphics.drawable.a.o(drawable, this.f43173r0);
            return;
        }
        android.graphics.drawable.Drawable drawable2 = this.f43165k0;
        if (drawable == drawable2 && this.f43169n0) {
            androidx.core.graphics.drawable.a.o(drawable2, this.f43167l0);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    private void h0(android.graphics.Rect rect, android.graphics.RectF rectF) {
        rectF.setEmpty();
        if (K2() || J2()) {
            float f6 = this.f43120A0 + this.f43121B0;
            float fW0 = W0();
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f10 = rect.left + f6;
                rectF.left = f10;
                rectF.right = f10 + fW0;
            } else {
                float f11 = rect.right - f6;
                rectF.right = f11;
                rectF.left = f11 - fW0;
            }
            float fV0 = V0();
            float fExactCenterY = rect.exactCenterY() - (fV0 / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fV0;
        }
    }

    private android.graphics.ColorFilter h1() {
        android.graphics.ColorFilter colorFilter = this.f43145Z0;
        return colorFilter != null ? colorFilter : this.f43146a1;
    }

    private void j0(android.graphics.Rect rect, android.graphics.RectF rectF) {
        rectF.set(rect);
        if (L2()) {
            float f6 = this.f43127H0 + this.f43126G0 + this.f43174s0 + this.f43125F0 + this.f43124E0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                rectF.right = rect.right - f6;
            } else {
                rectF.left = rect.left + f6;
            }
        }
    }

    private static boolean j1(int[] iArr, int i6) {
        if (iArr == null) {
            return false;
        }
        for (int i10 : iArr) {
            if (i10 == i6) {
                return true;
            }
        }
        return false;
    }

    private void k0(android.graphics.Rect rect, android.graphics.RectF rectF) {
        rectF.setEmpty();
        if (L2()) {
            float f6 = this.f43127H0 + this.f43126G0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f10 = rect.right - f6;
                rectF.right = f10;
                rectF.left = f10 - this.f43174s0;
            } else {
                float f11 = rect.left + f6;
                rectF.left = f11;
                rectF.right = f11 + this.f43174s0;
            }
            float fExactCenterY = rect.exactCenterY();
            float f12 = this.f43174s0;
            float f13 = fExactCenterY - (f12 / 2.0f);
            rectF.top = f13;
            rectF.bottom = f13 + f12;
        }
    }

    private void l0(android.graphics.Rect rect, android.graphics.RectF rectF) {
        rectF.setEmpty();
        if (L2()) {
            float f6 = this.f43127H0 + this.f43126G0 + this.f43174s0 + this.f43125F0 + this.f43124E0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f10 = rect.right;
                rectF.right = f10;
                rectF.left = f10 - f6;
            } else {
                int i6 = rect.left;
                rectF.left = i6;
                rectF.right = i6 + f6;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private void n0(android.graphics.Rect rect, android.graphics.RectF rectF) {
        rectF.setEmpty();
        if (this.f43161i0 != null) {
            float fI0 = this.f43120A0 + i0() + this.f43123D0;
            float fM0 = this.f43127H0 + m0() + this.f43124E0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                rectF.left = rect.left + fI0;
                rectF.right = rect.right - fM0;
            } else {
                rectF.left = rect.left + fM0;
                rectF.right = rect.right - fI0;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private static boolean n1(B4.d dVar) {
        return (dVar == null || dVar.i() == null || !dVar.i().isStateful()) ? false : true;
    }

    private float o0() {
        this.f43135P0.f().getFontMetrics(this.f43131L0);
        android.graphics.Paint.FontMetrics fontMetrics = this.f43131L0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private static boolean o1(android.content.res.ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private static boolean p1(android.graphics.drawable.Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    private boolean q0() {
        return this.f43177v0 && this.f43178w0 != null && this.f43176u0;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:42:0x0175  */
    private void q1(android.util.AttributeSet attributeSet, int i6, int i10) {
        android.text.TextUtils.TruncateAt truncateAt;
        android.content.res.TypedArray typedArrayI = com.google.android.material.internal.k.i(this.f43128I0, attributeSet, p125m4.j.f51096w0, i6, i10, new int[0]);
        this.f43166k1 = typedArrayI.hasValue(p125m4.j.f50977h1);
        X1(B4.c.a(this.f43128I0, typedArrayI, p125m4.j.f50873U0));
        B1(B4.c.a(this.f43128I0, typedArrayI, p125m4.j.f50769H0));
        P1(typedArrayI.getDimension(p125m4.j.f50833P0, 0.0f));
        if (typedArrayI.hasValue(p125m4.j.f50777I0)) {
            D1(typedArrayI.getDimension(p125m4.j.f50777I0, 0.0f));
        }
        T1(B4.c.a(this.f43128I0, typedArrayI, p125m4.j.f50857S0));
        V1(typedArrayI.getDimension(p125m4.j.f50865T0, 0.0f));
        u2(B4.c.a(this.f43128I0, typedArrayI, p125m4.j.f50969g1));
        z2(typedArrayI.getText(p125m4.j.f50722B0));
        B4.d dVarF = B4.c.f(this.f43128I0, typedArrayI, p125m4.j.f51104x0);
        dVarF.l(typedArrayI.getDimension(p125m4.j.f51111y0, dVarF.j()));
        A2(dVarF);
        int i11 = typedArrayI.getInt(p125m4.j.f51118z0, 0);
        if (i11 == 1) {
            truncateAt = android.text.TextUtils.TruncateAt.START;
        } else {
            if (i11 != 2) {
                if (i11 == 3) {
                    truncateAt = android.text.TextUtils.TruncateAt.END;
                }
                O1(typedArrayI.getBoolean(p125m4.j.f50825O0, false));
                if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
                    O1(typedArrayI.getBoolean(p125m4.j.f50801L0, false));
                }
                H1(B4.c.d(this.f43128I0, typedArrayI, p125m4.j.f50793K0));
                if (typedArrayI.hasValue(p125m4.j.f50817N0)) {
                    L1(B4.c.a(this.f43128I0, typedArrayI, p125m4.j.f50817N0));
                }
                J1(typedArrayI.getDimension(p125m4.j.f50809M0, -1.0f));
                k2(typedArrayI.getBoolean(p125m4.j.f50929b1, false));
                if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
                    k2(typedArrayI.getBoolean(p125m4.j.f50889W0, false));
                }
                Y1(B4.c.d(this.f43128I0, typedArrayI, p125m4.j.f50881V0));
                i2(B4.c.a(this.f43128I0, typedArrayI, p125m4.j.f50921a1));
                d2(typedArrayI.getDimension(p125m4.j.f50905Y0, 0.0f));
                t1(typedArrayI.getBoolean(p125m4.j.f50729C0, false));
                A1(typedArrayI.getBoolean(p125m4.j.f50761G0, false));
                if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
                    A1(typedArrayI.getBoolean(p125m4.j.f50745E0, false));
                }
                v1(B4.c.d(this.f43128I0, typedArrayI, p125m4.j.f50737D0));
                if (typedArrayI.hasValue(p125m4.j.f50753F0)) {
                    x1(B4.c.a(this.f43128I0, typedArrayI, p125m4.j.f50753F0));
                }
                x2(p135n4.d.b(this.f43128I0, typedArrayI, p125m4.j.f50985i1));
                n2(p135n4.d.b(this.f43128I0, typedArrayI, p125m4.j.f50945d1));
                R1(typedArrayI.getDimension(p125m4.j.f50849R0, 0.0f));
                r2(typedArrayI.getDimension(p125m4.j.f50961f1, 0.0f));
                p2(typedArrayI.getDimension(p125m4.j.f50953e1, 0.0f));
                F2(typedArrayI.getDimension(p125m4.j.f51001k1, 0.0f));
                C2(typedArrayI.getDimension(p125m4.j.f50993j1, 0.0f));
                f2(typedArrayI.getDimension(p125m4.j.f50913Z0, 0.0f));
                a2(typedArrayI.getDimension(p125m4.j.f50897X0, 0.0f));
                F1(typedArrayI.getDimension(p125m4.j.f50785J0, 0.0f));
                t2(typedArrayI.getDimensionPixelSize(p125m4.j.f50715A0, Integer.MAX_VALUE));
                typedArrayI.recycle();
            }
            truncateAt = android.text.TextUtils.TruncateAt.MIDDLE;
        }
        m2(truncateAt);
        O1(typedArrayI.getBoolean(p125m4.j.f50825O0, false));
        if (attributeSet != null) {
            O1(typedArrayI.getBoolean(p125m4.j.f50801L0, false));
        }
        H1(B4.c.d(this.f43128I0, typedArrayI, p125m4.j.f50793K0));
        if (typedArrayI.hasValue(p125m4.j.f50817N0)) {
            L1(B4.c.a(this.f43128I0, typedArrayI, p125m4.j.f50817N0));
        }
        J1(typedArrayI.getDimension(p125m4.j.f50809M0, -1.0f));
        k2(typedArrayI.getBoolean(p125m4.j.f50929b1, false));
        if (attributeSet != null) {
            k2(typedArrayI.getBoolean(p125m4.j.f50889W0, false));
        }
        Y1(B4.c.d(this.f43128I0, typedArrayI, p125m4.j.f50881V0));
        i2(B4.c.a(this.f43128I0, typedArrayI, p125m4.j.f50921a1));
        d2(typedArrayI.getDimension(p125m4.j.f50905Y0, 0.0f));
        t1(typedArrayI.getBoolean(p125m4.j.f50729C0, false));
        A1(typedArrayI.getBoolean(p125m4.j.f50761G0, false));
        if (attributeSet != null) {
            A1(typedArrayI.getBoolean(p125m4.j.f50745E0, false));
        }
        v1(B4.c.d(this.f43128I0, typedArrayI, p125m4.j.f50737D0));
        if (typedArrayI.hasValue(p125m4.j.f50753F0)) {
            x1(B4.c.a(this.f43128I0, typedArrayI, p125m4.j.f50753F0));
        }
        x2(p135n4.d.b(this.f43128I0, typedArrayI, p125m4.j.f50985i1));
        n2(p135n4.d.b(this.f43128I0, typedArrayI, p125m4.j.f50945d1));
        R1(typedArrayI.getDimension(p125m4.j.f50849R0, 0.0f));
        r2(typedArrayI.getDimension(p125m4.j.f50961f1, 0.0f));
        p2(typedArrayI.getDimension(p125m4.j.f50953e1, 0.0f));
        F2(typedArrayI.getDimension(p125m4.j.f51001k1, 0.0f));
        C2(typedArrayI.getDimension(p125m4.j.f50993j1, 0.0f));
        f2(typedArrayI.getDimension(p125m4.j.f50913Z0, 0.0f));
        a2(typedArrayI.getDimension(p125m4.j.f50897X0, 0.0f));
        F1(typedArrayI.getDimension(p125m4.j.f50785J0, 0.0f));
        t2(typedArrayI.getDimensionPixelSize(p125m4.j.f50715A0, Integer.MAX_VALUE));
        typedArrayI.recycle();
    }

    public static com.google.android.material.chip.a r0(android.content.Context context, android.util.AttributeSet attributeSet, int i6, int i10) {
        com.google.android.material.chip.a aVar = new com.google.android.material.chip.a(context, attributeSet, i6, i10);
        aVar.q1(attributeSet, i6, i10);
        return aVar;
    }

    private void s0(android.graphics.Canvas canvas, android.graphics.Rect rect) {
        if (J2()) {
            h0(rect, this.f43132M0);
            android.graphics.RectF rectF = this.f43132M0;
            float f6 = rectF.left;
            float f10 = rectF.top;
            canvas.translate(f6, f10);
            this.f43178w0.setBounds(0, 0, (int) this.f43132M0.width(), (int) this.f43132M0.height());
            this.f43178w0.draw(canvas);
            canvas.translate(-f6, -f10);
        }
    }

    private boolean s1(int[] iArr, int[] iArr2) {
        boolean z6;
        boolean zOnStateChange = super.onStateChange(iArr);
        android.content.res.ColorStateList colorStateList = this.f43147b0;
        int iL = l(colorStateList != null ? colorStateList.getColorForState(iArr, this.f43136Q0) : 0);
        boolean state = true;
        if (this.f43136Q0 != iL) {
            this.f43136Q0 = iL;
            zOnStateChange = true;
        }
        android.content.res.ColorStateList colorStateList2 = this.f43149c0;
        int iL2 = l(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f43137R0) : 0);
        if (this.f43137R0 != iL2) {
            this.f43137R0 = iL2;
            zOnStateChange = true;
        }
        int i6 = p195t4.a.i(iL, iL2);
        if ((this.f43138S0 != i6) | (v() == null)) {
            this.f43138S0 = i6;
            V(android.content.res.ColorStateList.valueOf(i6));
            zOnStateChange = true;
        }
        android.content.res.ColorStateList colorStateList3 = this.f43155f0;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f43139T0) : 0;
        if (this.f43139T0 != colorForState) {
            this.f43139T0 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.f43156f1 == null || !C4.b.b(iArr)) ? 0 : this.f43156f1.getColorForState(iArr, this.f43140U0);
        if (this.f43140U0 != colorForState2) {
            this.f43140U0 = colorForState2;
            if (this.f43154e1) {
                zOnStateChange = true;
            }
        }
        int colorForState3 = (this.f43135P0.e() == null || this.f43135P0.e().i() == null) ? 0 : this.f43135P0.e().i().getColorForState(iArr, this.f43141V0);
        if (this.f43141V0 != colorForState3) {
            this.f43141V0 = colorForState3;
            zOnStateChange = true;
        }
        boolean z10 = j1(getState(), android.R.attr.state_checked) && this.f43176u0;
        if (this.f43142W0 == z10 || this.f43178w0 == null) {
            z6 = false;
        } else {
            float fI0 = i0();
            this.f43142W0 = z10;
            if (fI0 != i0()) {
                zOnStateChange = true;
                z6 = true;
            } else {
                z6 = false;
                zOnStateChange = true;
            }
        }
        android.content.res.ColorStateList colorStateList4 = this.f43148b1;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f43143X0) : 0;
        if (this.f43143X0 != colorForState4) {
            this.f43143X0 = colorForState4;
            this.f43146a1 = com.google.android.material.drawable.d.j(this, this.f43148b1, this.f43150c1);
        } else {
            state = zOnStateChange;
        }
        if (p1(this.f43165k0)) {
            state |= this.f43165k0.setState(iArr);
        }
        if (p1(this.f43178w0)) {
            state |= this.f43178w0.setState(iArr);
        }
        if (p1(this.f43171p0)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            java.lang.System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            java.lang.System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f43171p0.setState(iArr3);
        }
        if (C4.b.f1290a && p1(this.f43172q0)) {
            state |= this.f43172q0.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z6) {
            r1();
        }
        return state;
    }

    private void t0(android.graphics.Canvas canvas, android.graphics.Rect rect) {
        if (this.f43166k1) {
            return;
        }
        this.f43129J0.setColor(this.f43137R0);
        this.f43129J0.setStyle(android.graphics.Paint.Style.FILL);
        this.f43129J0.setColorFilter(h1());
        this.f43132M0.set(rect);
        canvas.drawRoundRect(this.f43132M0, E0(), E0(), this.f43129J0);
    }

    private void u0(android.graphics.Canvas canvas, android.graphics.Rect rect) {
        if (K2()) {
            h0(rect, this.f43132M0);
            android.graphics.RectF rectF = this.f43132M0;
            float f6 = rectF.left;
            float f10 = rectF.top;
            canvas.translate(f6, f10);
            this.f43165k0.setBounds(0, 0, (int) this.f43132M0.width(), (int) this.f43132M0.height());
            this.f43165k0.draw(canvas);
            canvas.translate(-f6, -f10);
        }
    }

    private void v0(android.graphics.Canvas canvas, android.graphics.Rect rect) {
        if (this.f43157g0 <= 0.0f || this.f43166k1) {
            return;
        }
        this.f43129J0.setColor(this.f43139T0);
        this.f43129J0.setStyle(android.graphics.Paint.Style.STROKE);
        if (!this.f43166k1) {
            this.f43129J0.setColorFilter(h1());
        }
        android.graphics.RectF rectF = this.f43132M0;
        float f6 = rect.left;
        float f10 = this.f43157g0;
        rectF.set(f6 + (f10 / 2.0f), rect.top + (f10 / 2.0f), rect.right - (f10 / 2.0f), rect.bottom - (f10 / 2.0f));
        float f11 = this.f43153e0 - (this.f43157g0 / 2.0f);
        canvas.drawRoundRect(this.f43132M0, f11, f11, this.f43129J0);
    }

    private void w0(android.graphics.Canvas canvas, android.graphics.Rect rect) {
        if (this.f43166k1) {
            return;
        }
        this.f43129J0.setColor(this.f43136Q0);
        this.f43129J0.setStyle(android.graphics.Paint.Style.FILL);
        this.f43132M0.set(rect);
        canvas.drawRoundRect(this.f43132M0, E0(), E0(), this.f43129J0);
    }

    private void x0(android.graphics.Canvas canvas, android.graphics.Rect rect) {
        android.graphics.drawable.Drawable drawable;
        if (L2()) {
            k0(rect, this.f43132M0);
            android.graphics.RectF rectF = this.f43132M0;
            float f6 = rectF.left;
            float f10 = rectF.top;
            canvas.translate(f6, f10);
            this.f43171p0.setBounds(0, 0, (int) this.f43132M0.width(), (int) this.f43132M0.height());
            if (C4.b.f1290a) {
                this.f43172q0.setBounds(this.f43171p0.getBounds());
                this.f43172q0.jumpToCurrentState();
                drawable = this.f43172q0;
            } else {
                drawable = this.f43171p0;
            }
            drawable.draw(canvas);
            canvas.translate(-f6, -f10);
        }
    }

    private void y0(android.graphics.Canvas canvas, android.graphics.Rect rect) {
        this.f43129J0.setColor(this.f43140U0);
        this.f43129J0.setStyle(android.graphics.Paint.Style.FILL);
        this.f43132M0.set(rect);
        if (!this.f43166k1) {
            canvas.drawRoundRect(this.f43132M0, E0(), E0(), this.f43129J0);
        } else {
            h(new android.graphics.RectF(rect), this.f43134O0);
            super.q(canvas, this.f43129J0, this.f43134O0, s());
        }
    }

    private void z0(android.graphics.Canvas canvas, android.graphics.Rect rect) {
        android.graphics.Paint paint = this.f43130K0;
        if (paint != null) {
            paint.setColor(androidx.core.graphics.a.k(-16777216, com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION));
            canvas.drawRect(rect, this.f43130K0);
            if (K2() || J2()) {
                h0(rect, this.f43132M0);
                canvas.drawRect(this.f43132M0, this.f43130K0);
            }
            if (this.f43161i0 != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.f43130K0);
            }
            if (L2()) {
                k0(rect, this.f43132M0);
                canvas.drawRect(this.f43132M0, this.f43130K0);
            }
            this.f43130K0.setColor(androidx.core.graphics.a.k(-65536, com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION));
            j0(rect, this.f43132M0);
            canvas.drawRect(this.f43132M0, this.f43130K0);
            this.f43130K0.setColor(androidx.core.graphics.a.k(-16711936, com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION));
            l0(rect, this.f43132M0);
            canvas.drawRect(this.f43132M0, this.f43130K0);
        }
    }

    public void A1(boolean z6) {
        if (this.f43177v0 != z6) {
            boolean zJ2 = J2();
            this.f43177v0 = z6;
            boolean zJ3 = J2();
            if (zJ2 != zJ3) {
                if (zJ3) {
                    g0(this.f43178w0);
                } else {
                    M2(this.f43178w0);
                }
                invalidateSelf();
                r1();
            }
        }
    }

    public void A2(B4.d dVar) {
        this.f43135P0.j(dVar, this.f43128I0);
    }

    public android.graphics.drawable.Drawable B0() {
        return this.f43178w0;
    }

    public void B1(android.content.res.ColorStateList colorStateList) {
        if (this.f43149c0 != colorStateList) {
            this.f43149c0 = colorStateList;
            onStateChange(getState());
        }
    }

    public void B2(int i6) {
        A2(new B4.d(this.f43128I0, i6));
    }

    public android.content.res.ColorStateList C0() {
        return this.f43179x0;
    }

    public void C1(int i6) {
        B1(p100k.a.a(this.f43128I0, i6));
    }

    public void C2(float f6) {
        if (this.f43124E0 != f6) {
            this.f43124E0 = f6;
            invalidateSelf();
            r1();
        }
    }

    public android.content.res.ColorStateList D0() {
        return this.f43149c0;
    }

    public void D1(float f6) {
        if (this.f43153e0 != f6) {
            this.f43153e0 = f6;
            setShapeAppearanceModel(B().w(f6));
        }
    }

    public void D2(int i6) {
        C2(this.f43128I0.getResources().getDimension(i6));
    }

    public float E0() {
        return this.f43166k1 ? D() : this.f43153e0;
    }

    public void E1(int i6) {
        D1(this.f43128I0.getResources().getDimension(i6));
    }

    public void E2(float f6) {
        B4.d dVarE1 = e1();
        if (dVarE1 != null) {
            dVarE1.l(f6);
            this.f43135P0.f().setTextSize(f6);
            a();
        }
    }

    public float F0() {
        return this.f43127H0;
    }

    public void F1(float f6) {
        if (this.f43127H0 != f6) {
            this.f43127H0 = f6;
            invalidateSelf();
            r1();
        }
    }

    public void F2(float f6) {
        if (this.f43123D0 != f6) {
            this.f43123D0 = f6;
            invalidateSelf();
            r1();
        }
    }

    public android.graphics.drawable.Drawable G0() {
        android.graphics.drawable.Drawable drawable = this.f43165k0;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.q(drawable);
        }
        return null;
    }

    public void G1(int i6) {
        F1(this.f43128I0.getResources().getDimension(i6));
    }

    public void G2(int i6) {
        F2(this.f43128I0.getResources().getDimension(i6));
    }

    public float H0() {
        return this.f43168m0;
    }

    public void H1(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawableG0 = G0();
        if (drawableG0 != drawable) {
            float fI0 = i0();
            this.f43165k0 = drawable != null ? androidx.core.graphics.drawable.a.r(drawable).mutate() : null;
            float fI1 = i0();
            M2(drawableG0);
            if (K2()) {
                g0(this.f43165k0);
            }
            invalidateSelf();
            if (fI0 != fI1) {
                r1();
            }
        }
    }

    public void H2(boolean z6) {
        if (this.f43154e1 != z6) {
            this.f43154e1 = z6;
            N2();
            onStateChange(getState());
        }
    }

    public android.content.res.ColorStateList I0() {
        return this.f43167l0;
    }

    public void I1(int i6) {
        H1(p100k.a.b(this.f43128I0, i6));
    }

    boolean I2() {
        return this.f43162i1;
    }

    public float J0() {
        return this.f43151d0;
    }

    public void J1(float f6) {
        if (this.f43168m0 != f6) {
            float fI0 = i0();
            this.f43168m0 = f6;
            float fI1 = i0();
            invalidateSelf();
            if (fI0 != fI1) {
                r1();
            }
        }
    }

    public float K0() {
        return this.f43120A0;
    }

    public void K1(int i6) {
        J1(this.f43128I0.getResources().getDimension(i6));
    }

    public android.content.res.ColorStateList L0() {
        return this.f43155f0;
    }

    public void L1(android.content.res.ColorStateList colorStateList) {
        this.f43169n0 = true;
        if (this.f43167l0 != colorStateList) {
            this.f43167l0 = colorStateList;
            if (K2()) {
                androidx.core.graphics.drawable.a.o(this.f43165k0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public float M0() {
        return this.f43157g0;
    }

    public void M1(int i6) {
        L1(p100k.a.a(this.f43128I0, i6));
    }

    public android.graphics.drawable.Drawable N0() {
        android.graphics.drawable.Drawable drawable = this.f43171p0;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.q(drawable);
        }
        return null;
    }

    public void N1(int i6) {
        O1(this.f43128I0.getResources().getBoolean(i6));
    }

    public java.lang.CharSequence O0() {
        return this.f43175t0;
    }

    public void O1(boolean z6) {
        if (this.f43163j0 != z6) {
            boolean zK2 = K2();
            this.f43163j0 = z6;
            boolean zK3 = K2();
            if (zK2 != zK3) {
                if (zK3) {
                    g0(this.f43165k0);
                } else {
                    M2(this.f43165k0);
                }
                invalidateSelf();
                r1();
            }
        }
    }

    public float P0() {
        return this.f43126G0;
    }

    public void P1(float f6) {
        if (this.f43151d0 != f6) {
            this.f43151d0 = f6;
            invalidateSelf();
            r1();
        }
    }

    public float Q0() {
        return this.f43174s0;
    }

    public void Q1(int i6) {
        P1(this.f43128I0.getResources().getDimension(i6));
    }

    public float R0() {
        return this.f43125F0;
    }

    public void R1(float f6) {
        if (this.f43120A0 != f6) {
            this.f43120A0 = f6;
            invalidateSelf();
            r1();
        }
    }

    public int[] S0() {
        return this.f43152d1;
    }

    public void S1(int i6) {
        R1(this.f43128I0.getResources().getDimension(i6));
    }

    public android.content.res.ColorStateList T0() {
        return this.f43173r0;
    }

    public void T1(android.content.res.ColorStateList colorStateList) {
        if (this.f43155f0 != colorStateList) {
            this.f43155f0 = colorStateList;
            if (this.f43166k1) {
                b0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void U0(android.graphics.RectF rectF) {
        l0(getBounds(), rectF);
    }

    public void U1(int i6) {
        T1(p100k.a.a(this.f43128I0, i6));
    }

    public void V1(float f6) {
        if (this.f43157g0 != f6) {
            this.f43157g0 = f6;
            this.f43129J0.setStrokeWidth(f6);
            if (this.f43166k1) {
                super.c0(f6);
            }
            invalidateSelf();
        }
    }

    public void W1(int i6) {
        V1(this.f43128I0.getResources().getDimension(i6));
    }

    public android.text.TextUtils.TruncateAt X0() {
        return this.f43160h1;
    }

    public p135n4.d Y0() {
        return this.f43181z0;
    }

    public void Y1(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawableN0 = N0();
        if (drawableN0 != drawable) {
            float fM0 = m0();
            this.f43171p0 = drawable != null ? androidx.core.graphics.drawable.a.r(drawable).mutate() : null;
            if (C4.b.f1290a) {
                O2();
            }
            float fM1 = m0();
            M2(drawableN0);
            if (L2()) {
                g0(this.f43171p0);
            }
            invalidateSelf();
            if (fM0 != fM1) {
                r1();
            }
        }
    }

    public float Z0() {
        return this.f43122C0;
    }

    public void Z1(java.lang.CharSequence charSequence) {
        if (this.f43175t0 != charSequence) {
            this.f43175t0 = androidx.core.text.a.c().h(charSequence);
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.internal.i.b
    public void a() {
        r1();
        invalidateSelf();
    }

    public float a1() {
        return this.f43121B0;
    }

    public void a2(float f6) {
        if (this.f43126G0 != f6) {
            this.f43126G0 = f6;
            invalidateSelf();
            if (L2()) {
                r1();
            }
        }
    }

    public android.content.res.ColorStateList b1() {
        return this.f43159h0;
    }

    public void b2(int i6) {
        a2(this.f43128I0.getResources().getDimension(i6));
    }

    public p135n4.d c1() {
        return this.f43180y0;
    }

    public void c2(int i6) {
        Y1(p100k.a.b(this.f43128I0, i6));
    }

    public java.lang.CharSequence d1() {
        return this.f43161i0;
    }

    public void d2(float f6) {
        if (this.f43174s0 != f6) {
            this.f43174s0 = f6;
            invalidateSelf();
            if (L2()) {
                r1();
            }
        }
    }

    @Override // E4.g, android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i6 = this.f43144Y0;
        int iA = i6 < 255 ? p155p4.a.a(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, i6) : 0;
        w0(canvas, bounds);
        t0(canvas, bounds);
        if (this.f43166k1) {
            super.draw(canvas);
        }
        v0(canvas, bounds);
        y0(canvas, bounds);
        u0(canvas, bounds);
        s0(canvas, bounds);
        if (this.f43162i1) {
            A0(canvas, bounds);
        }
        x0(canvas, bounds);
        z0(canvas, bounds);
        if (this.f43144Y0 < 255) {
            canvas.restoreToCount(iA);
        }
    }

    public B4.d e1() {
        return this.f43135P0.e();
    }

    public void e2(int i6) {
        d2(this.f43128I0.getResources().getDimension(i6));
    }

    public float f1() {
        return this.f43124E0;
    }

    public void f2(float f6) {
        if (this.f43125F0 != f6) {
            this.f43125F0 = f6;
            invalidateSelf();
            if (L2()) {
                r1();
            }
        }
    }

    public float g1() {
        return this.f43123D0;
    }

    public void g2(int i6) {
        f2(this.f43128I0.getResources().getDimension(i6));
    }

    @Override // E4.g, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f43144Y0;
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.ColorFilter getColorFilter() {
        return this.f43145Z0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f43151d0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return java.lang.Math.min(java.lang.Math.round(this.f43120A0 + i0() + this.f43123D0 + this.f43135P0.g(d1().toString()) + this.f43124E0 + m0() + this.f43127H0), this.f43164j1);
    }

    @Override // E4.g, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // E4.g, android.graphics.drawable.Drawable
    public void getOutline(android.graphics.Outline outline) {
        if (this.f43166k1) {
            super.getOutline(outline);
            return;
        }
        android.graphics.Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f43153e0);
        } else {
            outline.setRoundRect(bounds, this.f43153e0);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    public boolean h2(int[] iArr) {
        if (java.util.Arrays.equals(this.f43152d1, iArr)) {
            return false;
        }
        this.f43152d1 = iArr;
        if (L2()) {
            return s1(getState(), iArr);
        }
        return false;
    }

    float i0() {
        if (K2() || J2()) {
            return this.f43121B0 + W0() + this.f43122C0;
        }
        return 0.0f;
    }

    public boolean i1() {
        return this.f43154e1;
    }

    public void i2(android.content.res.ColorStateList colorStateList) {
        if (this.f43173r0 != colorStateList) {
            this.f43173r0 = colorStateList;
            if (L2()) {
                androidx.core.graphics.drawable.a.o(this.f43171p0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // E4.g, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return o1(this.f43147b0) || o1(this.f43149c0) || o1(this.f43155f0) || (this.f43154e1 && o1(this.f43156f1)) || n1(this.f43135P0.e()) || q0() || p1(this.f43165k0) || p1(this.f43178w0) || o1(this.f43148b1);
    }

    public void j2(int i6) {
        i2(p100k.a.a(this.f43128I0, i6));
    }

    public boolean k1() {
        return this.f43176u0;
    }

    public void k2(boolean z6) {
        if (this.f43170o0 != z6) {
            boolean zL2 = L2();
            this.f43170o0 = z6;
            boolean zL3 = L2();
            if (zL2 != zL3) {
                if (zL3) {
                    g0(this.f43171p0);
                } else {
                    M2(this.f43171p0);
                }
                invalidateSelf();
                r1();
            }
        }
    }

    public boolean l1() {
        return p1(this.f43171p0);
    }

    public void l2(com.google.android.material.chip.a.InterfaceC0473a interfaceC0473a) {
        this.f43158g1 = new java.lang.ref.WeakReference(interfaceC0473a);
    }

    float m0() {
        if (L2()) {
            return this.f43125F0 + this.f43174s0 + this.f43126G0;
        }
        return 0.0f;
    }

    public boolean m1() {
        return this.f43170o0;
    }

    public void m2(android.text.TextUtils.TruncateAt truncateAt) {
        this.f43160h1 = truncateAt;
    }

    public void n2(p135n4.d dVar) {
        this.f43181z0 = dVar;
    }

    public void o2(int i6) {
        n2(p135n4.d.c(this.f43128I0, i6));
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i6) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i6);
        if (K2()) {
            zOnLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.f43165k0, i6);
        }
        if (J2()) {
            zOnLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.f43178w0, i6);
        }
        if (L2()) {
            zOnLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.f43171p0, i6);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i6) {
        boolean zOnLevelChange = super.onLevelChange(i6);
        if (K2()) {
            zOnLevelChange |= this.f43165k0.setLevel(i6);
        }
        if (J2()) {
            zOnLevelChange |= this.f43178w0.setLevel(i6);
        }
        if (L2()) {
            zOnLevelChange |= this.f43171p0.setLevel(i6);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // E4.g, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.f43166k1) {
            super.onStateChange(iArr);
        }
        return s1(iArr, S0());
    }

    android.graphics.Paint.Align p0(android.graphics.Rect rect, android.graphics.PointF pointF) {
        pointF.set(0.0f, 0.0f);
        android.graphics.Paint.Align align = android.graphics.Paint.Align.LEFT;
        if (this.f43161i0 != null) {
            float fI0 = this.f43120A0 + i0() + this.f43123D0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                pointF.x = rect.left + fI0;
            } else {
                pointF.x = rect.right - fI0;
                align = android.graphics.Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - o0();
        }
        return align;
    }

    public void p2(float f6) {
        if (this.f43122C0 != f6) {
            float fI0 = i0();
            this.f43122C0 = f6;
            float fI1 = i0();
            invalidateSelf();
            if (fI0 != fI1) {
                r1();
            }
        }
    }

    public void q2(int i6) {
        p2(this.f43128I0.getResources().getDimension(i6));
    }

    protected void r1() {
        com.google.android.material.chip.a.InterfaceC0473a interfaceC0473a = (com.google.android.material.chip.a.InterfaceC0473a) this.f43158g1.get();
        if (interfaceC0473a != null) {
            interfaceC0473a.a();
        }
    }

    public void r2(float f6) {
        if (this.f43121B0 != f6) {
            float fI0 = i0();
            this.f43121B0 = f6;
            float fI1 = i0();
            invalidateSelf();
            if (fI0 != fI1) {
                r1();
            }
        }
    }

    public void s2(int i6) {
        r2(this.f43128I0.getResources().getDimension(i6));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable, long j6) {
        android.graphics.drawable.Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j6);
        }
    }

    @Override // E4.g, android.graphics.drawable.Drawable
    public void setAlpha(int i6) {
        if (this.f43144Y0 != i6) {
            this.f43144Y0 = i6;
            invalidateSelf();
        }
    }

    @Override // E4.g, android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        if (this.f43145Z0 != colorFilter) {
            this.f43145Z0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // E4.g, android.graphics.drawable.Drawable
    public void setTintList(android.content.res.ColorStateList colorStateList) {
        if (this.f43148b1 != colorStateList) {
            this.f43148b1 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // E4.g, android.graphics.drawable.Drawable
    public void setTintMode(android.graphics.PorterDuff.Mode mode) {
        if (this.f43150c1 != mode) {
            this.f43150c1 = mode;
            this.f43146a1 = com.google.android.material.drawable.d.j(this, this.f43148b1, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z6, boolean z10) {
        boolean visible = super.setVisible(z6, z10);
        if (K2()) {
            visible |= this.f43165k0.setVisible(z6, z10);
        }
        if (J2()) {
            visible |= this.f43178w0.setVisible(z6, z10);
        }
        if (L2()) {
            visible |= this.f43171p0.setVisible(z6, z10);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public void t1(boolean z6) {
        if (this.f43176u0 != z6) {
            this.f43176u0 = z6;
            float fI0 = i0();
            if (!z6 && this.f43142W0) {
                this.f43142W0 = false;
            }
            float fI1 = i0();
            invalidateSelf();
            if (fI0 != fI1) {
                r1();
            }
        }
    }

    public void t2(int i6) {
        this.f43164j1 = i6;
    }

    public void u1(int i6) {
        t1(this.f43128I0.getResources().getBoolean(i6));
    }

    public void u2(android.content.res.ColorStateList colorStateList) {
        if (this.f43159h0 != colorStateList) {
            this.f43159h0 = colorStateList;
            N2();
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable) {
        android.graphics.drawable.Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public void v1(android.graphics.drawable.Drawable drawable) {
        if (this.f43178w0 != drawable) {
            float fI0 = i0();
            this.f43178w0 = drawable;
            float fI1 = i0();
            M2(this.f43178w0);
            g0(this.f43178w0);
            invalidateSelf();
            if (fI0 != fI1) {
                r1();
            }
        }
    }

    public void v2(int i6) {
        u2(p100k.a.a(this.f43128I0, i6));
    }

    public void w1(int i6) {
        v1(p100k.a.b(this.f43128I0, i6));
    }

    void w2(boolean z6) {
        this.f43162i1 = z6;
    }

    public void x1(android.content.res.ColorStateList colorStateList) {
        if (this.f43179x0 != colorStateList) {
            this.f43179x0 = colorStateList;
            if (q0()) {
                androidx.core.graphics.drawable.a.o(this.f43178w0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void x2(p135n4.d dVar) {
        this.f43180y0 = dVar;
    }

    public void y1(int i6) {
        x1(p100k.a.a(this.f43128I0, i6));
    }

    public void y2(int i6) {
        x2(p135n4.d.c(this.f43128I0, i6));
    }

    public void z1(int i6) {
        A1(this.f43128I0.getResources().getBoolean(i6));
    }

    public void z2(java.lang.CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (android.text.TextUtils.equals(this.f43161i0, charSequence)) {
            return;
        }
        this.f43161i0 = charSequence;
        this.f43135P0.k(true);
        invalidateSelf();
        r1();
    }
}
