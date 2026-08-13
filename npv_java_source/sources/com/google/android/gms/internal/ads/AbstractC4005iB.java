package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.iB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4005iB {
    public static void a(android.text.Spannable spannable, float f6, int i6, int i10, int i11) {
        for (android.text.style.RelativeSizeSpan relativeSizeSpan : (android.text.style.RelativeSizeSpan[]) spannable.getSpans(i6, i10, android.text.style.RelativeSizeSpan.class)) {
            if (spannable.getSpanStart(relativeSizeSpan) <= i6 && spannable.getSpanEnd(relativeSizeSpan) >= i10) {
                f6 *= relativeSizeSpan.getSizeChange();
            }
            c(spannable, relativeSizeSpan, i6, i10, 33);
        }
        spannable.setSpan(new android.text.style.RelativeSizeSpan(f6), i6, i10, 33);
    }

    public static void b(android.text.Spannable spannable, java.lang.Object obj, int i6, int i10, int i11) {
        for (java.lang.Object obj2 : spannable.getSpans(i6, i10, obj.getClass())) {
            c(spannable, obj2, i6, i10, 33);
        }
        spannable.setSpan(obj, i6, i10, 33);
    }

    private static void c(android.text.Spannable spannable, java.lang.Object obj, int i6, int i10, int i11) {
        if (spannable.getSpanStart(obj) == i6 && spannable.getSpanEnd(obj) == i10 && spannable.getSpanFlags(obj) == 33) {
            spannable.removeSpan(obj);
        }
    }
}
