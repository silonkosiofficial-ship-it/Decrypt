package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4138jQ {
    C4138jQ() {
    }

    public static final void a(android.content.Context context, android.view.ViewGroup viewGroup, p104k3.i iVar) {
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        linearLayout.setTag("layout");
        f(linearLayout, -1, -1);
        linearLayout.setGravity(17);
        linearLayout.addView(iVar);
        iVar.setTag("ad_view");
        viewGroup.addView(linearLayout);
    }

    public static final void b(android.content.Context context, android.view.ViewGroup viewGroup, com.google.android.gms.ads.nativead.NativeAd nativeAd) {
        com.google.android.gms.ads.nativead.d dVar = new com.google.android.gms.ads.nativead.d(context);
        dVar.setTag("ad_view_tag");
        f(dVar, -1, -1);
        viewGroup.addView(dVar);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        linearLayout.setTag("layout_tag");
        linearLayout.setOrientation(1);
        f(linearLayout, -1, -1);
        linearLayout.setBackgroundColor(-1);
        dVar.addView(linearLayout);
        android.content.res.Resources resourcesF = p174r3.v.s().f();
        linearLayout.addView(c(context, resourcesF == null ? "Headline" : resourcesF.getString(p154p3.d.f52732b), "headline_header_tag"));
        android.view.View viewD = d(context, com.google.android.gms.internal.ads.AbstractC2829Sg0.c(nativeAd.b()), "headline_tag");
        dVar.setHeadlineView(viewD);
        linearLayout.addView(viewD);
        linearLayout.addView(c(context, resourcesF == null ? "Body" : resourcesF.getString(p154p3.d.f52731a), "body_header_tag"));
        android.view.View viewD2 = d(context, com.google.android.gms.internal.ads.AbstractC2829Sg0.c(nativeAd.a()), "body_tag");
        dVar.setBodyView(viewD2);
        linearLayout.addView(viewD2);
        linearLayout.addView(c(context, resourcesF == null ? "Media View" : resourcesF.getString(p154p3.d.f52733c), "media_view_header_tag"));
        com.google.android.gms.ads.nativead.b bVar = new com.google.android.gms.ads.nativead.b(context);
        bVar.setTag("media_view_tag");
        dVar.setMediaView(bVar);
        linearLayout.addView(bVar);
        dVar.setNativeAd(nativeAd);
    }

    private static android.widget.TextView c(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return e(context, str, android.R.style.TextAppearance.Small, -9210245, 0.0f, str2);
    }

    private static android.widget.TextView d(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return e(context, str, android.R.style.TextAppearance.Medium, -16777216, 12.0f, str2);
    }

    private static android.widget.TextView e(android.content.Context context, java.lang.String str, int i6, int i10, float f6, java.lang.String str2) {
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setTag(str2);
        f(textView, -2, -2);
        android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new android.widget.TableRow.LayoutParams();
        }
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.bottomMargin = (int) android.util.TypedValue.applyDimension(1, f6, textView.getResources().getDisplayMetrics());
        textView.setLayoutParams(marginLayoutParams);
        textView.setTextAppearance(context, i6);
        textView.setTextColor(i10);
        textView.setText(str);
        return textView;
    }

    private static void f(android.view.View view, int i6, int i10) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new android.widget.TableRow.LayoutParams();
        }
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(layoutParams);
        layoutParams2.height = i6;
        layoutParams2.width = i10;
        view.setLayoutParams(layoutParams2);
    }
}
