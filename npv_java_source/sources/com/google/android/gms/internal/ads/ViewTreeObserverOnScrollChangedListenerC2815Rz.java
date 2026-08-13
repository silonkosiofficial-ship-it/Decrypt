package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Rz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewTreeObserverOnScrollChangedListenerC2815Rz extends android.widget.FrameLayout implements android.view.ViewTreeObserver.OnScrollChangedListener, android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.content.Context f31504C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private android.view.View f31505D;

    private ViewTreeObserverOnScrollChangedListenerC2815Rz(android.content.Context context) {
        super(context);
        this.f31504C = context;
    }

    public static com.google.android.gms.internal.ads.ViewTreeObserverOnScrollChangedListenerC2815Rz a(android.content.Context context, android.view.View view, com.google.android.gms.internal.ads.R60 r60) {
        android.content.res.Resources resources;
        android.util.DisplayMetrics displayMetrics;
        com.google.android.gms.internal.ads.ViewTreeObserverOnScrollChangedListenerC2815Rz viewTreeObserverOnScrollChangedListenerC2815Rz = new com.google.android.gms.internal.ads.ViewTreeObserverOnScrollChangedListenerC2815Rz(context);
        if (!r60.f31200u.isEmpty() && (resources = viewTreeObserverOnScrollChangedListenerC2815Rz.f31504C.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            com.google.android.gms.internal.ads.S60 s60 = (com.google.android.gms.internal.ads.S60) r60.f31200u.get(0);
            float f6 = s60.f31554a;
            float f10 = displayMetrics.density;
            viewTreeObserverOnScrollChangedListenerC2815Rz.setLayoutParams(new android.widget.FrameLayout.LayoutParams((int) (f6 * f10), (int) (s60.f31555b * f10)));
        }
        viewTreeObserverOnScrollChangedListenerC2815Rz.f31505D = view;
        viewTreeObserverOnScrollChangedListenerC2815Rz.addView(view);
        p174r3.v.B();
        com.google.android.gms.internal.ads.C5391ur.b(viewTreeObserverOnScrollChangedListenerC2815Rz, viewTreeObserverOnScrollChangedListenerC2815Rz);
        p174r3.v.B();
        com.google.android.gms.internal.ads.C5391ur.a(viewTreeObserverOnScrollChangedListenerC2815Rz, viewTreeObserverOnScrollChangedListenerC2815Rz);
        org.json.JSONObject jSONObject = r60.f31175h0;
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(viewTreeObserverOnScrollChangedListenerC2815Rz.f31504C);
        org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("header");
        if (jSONObjectOptJSONObject != null) {
            viewTreeObserverOnScrollChangedListenerC2815Rz.c(jSONObjectOptJSONObject, relativeLayout, 10);
        }
        org.json.JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("footer");
        if (jSONObjectOptJSONObject2 != null) {
            viewTreeObserverOnScrollChangedListenerC2815Rz.c(jSONObjectOptJSONObject2, relativeLayout, 12);
        }
        viewTreeObserverOnScrollChangedListenerC2815Rz.addView(relativeLayout);
        return viewTreeObserverOnScrollChangedListenerC2815Rz;
    }

    private final int b(double d6) {
        p184s3.C7147y.b();
        return p224w3.g.z(this.f31504C, (int) d6);
    }

    private final void c(org.json.JSONObject jSONObject, android.widget.RelativeLayout relativeLayout, int i6) {
        android.widget.TextView textView = new android.widget.TextView(this.f31504C);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int iB = b(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, iB, 0, iB);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, b(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i6);
        relativeLayout.addView(textView, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.f31505D.setY(-iArr[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.f31505D.setY(-iArr[1]);
    }
}
