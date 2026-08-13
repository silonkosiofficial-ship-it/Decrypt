package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Zg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3080Zg extends android.widget.RelativeLayout {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final float[] f33645D = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private android.graphics.drawable.AnimationDrawable f33646C;

    public C3080Zg(android.content.Context context, com.google.android.gms.internal.ads.BinderC3044Yg binderC3044Yg, android.widget.RelativeLayout.LayoutParams layoutParams) {
        super(context);
        Q3.AbstractC1477p.l(binderC3044Yg);
        android.graphics.drawable.ShapeDrawable shapeDrawable = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.RoundRectShape(f33645D, null, null));
        shapeDrawable.getPaint().setColor(binderC3044Yg.f());
        setLayoutParams(layoutParams);
        setBackground(shapeDrawable);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        if (!android.text.TextUtils.isEmpty(binderC3044Yg.i())) {
            android.widget.RelativeLayout.LayoutParams layoutParams3 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            android.widget.TextView textView = new android.widget.TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(android.graphics.Typeface.DEFAULT);
            textView.setText(binderC3044Yg.i());
            textView.setTextColor(binderC3044Yg.d());
            textView.setTextSize(binderC3044Yg.p6());
            p184s3.C7147y.b();
            int iZ = p224w3.g.z(context, 4);
            p184s3.C7147y.b();
            textView.setPadding(iZ, 0, p224w3.g.z(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        java.util.List listQ6 = binderC3044Yg.q6();
        if (listQ6 != null && listQ6.size() > 1) {
            this.f33646C = new android.graphics.drawable.AnimationDrawable();
            java.util.Iterator it = listQ6.iterator();
            while (it.hasNext()) {
                try {
                    this.f33646C.addFrame((android.graphics.drawable.Drawable) X3.b.L0(((com.google.android.gms.internal.ads.BinderC3286bh) it.next()).e()), binderC3044Yg.b());
                } catch (java.lang.Exception e6) {
                    p224w3.p.e("Error while getting drawable.", e6);
                }
            }
            imageView.setBackground(this.f33646C);
        } else if (listQ6.size() == 1) {
            try {
                imageView.setImageDrawable((android.graphics.drawable.Drawable) X3.b.L0(((com.google.android.gms.internal.ads.BinderC3286bh) listQ6.get(0)).e()));
            } catch (java.lang.Exception e10) {
                p224w3.p.e("Error while getting drawable.", e10);
            }
        }
        addView(imageView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        android.graphics.drawable.AnimationDrawable animationDrawable = this.f33646C;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
