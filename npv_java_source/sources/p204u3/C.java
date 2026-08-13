package p204u3;

/* JADX INFO: loaded from: classes.dex */
public final class C extends android.widget.FrameLayout implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.widget.ImageButton f55474C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final p204u3.InterfaceC7206h f55475D;

    public C(android.content.Context context, p204u3.B b6, p204u3.InterfaceC7206h interfaceC7206h) {
        super(context);
        this.f55475D = interfaceC7206h;
        setOnClickListener(this);
        android.widget.ImageButton imageButton = new android.widget.ImageButton(context);
        this.f55474C = imageButton;
        c();
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        p184s3.C7147y.b();
        int iZ = p224w3.g.z(context, b6.f55470a);
        p184s3.C7147y.b();
        int iZ2 = p224w3.g.z(context, 0);
        p184s3.C7147y.b();
        int iZ3 = p224w3.g.z(context, b6.f55471b);
        p184s3.C7147y.b();
        imageButton.setPadding(iZ, iZ2, iZ3, p224w3.g.z(context, b6.f55472c));
        imageButton.setContentDescription("Interstitial close button");
        p184s3.C7147y.b();
        int iZ4 = p224w3.g.z(context, b6.f55473d + b6.f55470a + b6.f55471b);
        p184s3.C7147y.b();
        addView(imageButton, new android.widget.FrameLayout.LayoutParams(iZ4, p224w3.g.z(context, b6.f55473d + b6.f55472c), 17));
        long jLongValue = ((java.lang.Long) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25613l1)).longValue();
        if (jLongValue <= 0) {
            return;
        }
        p204u3.A a6 = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25623m1)).booleanValue() ? new p204u3.A(this) : null;
        imageButton.setAlpha(0.0f);
        imageButton.animate().alpha(1.0f).setDuration(jLongValue).setListener(a6);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0052  */
    /* JADX WARN: Code duplicated, block: B:25:0x0056  */
    private final void c() {
        android.widget.ImageButton imageButton;
        int i6;
        java.lang.String str = (java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25603k1);
        if (!V3.n.f() || android.text.TextUtils.isEmpty(str) || "default".equals(str)) {
            this.f55474C.setImageResource(android.R.drawable.btn_dialog);
            return;
        }
        android.content.res.Resources resourcesF = p174r3.v.s().f();
        if (resourcesF == null) {
            this.f55474C.setImageResource(android.R.drawable.btn_dialog);
            return;
        }
        android.graphics.drawable.Drawable drawable = null;
        try {
            if (!"white".equals(str)) {
                if ("black".equals(str)) {
                    i6 = p154p3.a.f52725a;
                }
                imageButton = this.f55474C;
                if (drawable == null) {
                    imageButton.setImageResource(android.R.drawable.btn_dialog);
                } else {
                    imageButton.setImageDrawable(drawable);
                    this.f55474C.setScaleType(android.widget.ImageView.ScaleType.CENTER);
                }
            }
            i6 = p154p3.a.f52726b;
            drawable = resourcesF.getDrawable(i6);
        } catch (android.content.res.Resources.NotFoundException unused) {
            p224w3.p.b("Close button resource not found, falling back to default.");
        }
        imageButton = this.f55474C;
        if (drawable == null) {
            imageButton.setImageResource(android.R.drawable.btn_dialog);
        } else {
            imageButton.setImageDrawable(drawable);
            this.f55474C.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        }
    }

    public final void b(boolean z6) {
        if (!z6) {
            this.f55474C.setVisibility(0);
            return;
        }
        this.f55474C.setVisibility(8);
        if (((java.lang.Long) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25613l1)).longValue() > 0) {
            this.f55474C.animate().cancel();
            this.f55474C.clearAnimation();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        p204u3.InterfaceC7206h interfaceC7206h = this.f55475D;
        if (interfaceC7206h != null) {
            interfaceC7206h.j();
        }
    }
}
