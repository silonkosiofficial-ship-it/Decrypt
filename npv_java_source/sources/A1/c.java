package A1;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.String[] f205a = new java.lang.String[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.util.Comparator f206b = new java.util.Comparator() { // from class: A1.b
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return A1.c.i((A1.c.a) obj, (A1.c.a) obj2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        android.text.style.URLSpan f207a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        java.lang.String f208b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f209c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f210d;

        a() {
        }
    }

    private static void b(android.widget.TextView textView) {
        if ((textView.getMovementMethod() instanceof android.text.method.LinkMovementMethod) || !textView.getLinksClickable()) {
            return;
        }
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
    }

    public static boolean c(android.text.Spannable spannable, int i6) {
        if (l()) {
            return android.text.util.Linkify.addLinks(spannable, i6);
        }
        if (i6 == 0) {
            return false;
        }
        android.text.style.URLSpan[] uRLSpanArr = (android.text.style.URLSpan[]) spannable.getSpans(0, spannable.length(), android.text.style.URLSpan.class);
        for (int length = uRLSpanArr.length - 1; length >= 0; length--) {
            spannable.removeSpan(uRLSpanArr[length]);
        }
        if ((i6 & 4) != 0) {
            android.text.util.Linkify.addLinks(spannable, 4);
        }
        java.util.ArrayList<A1.c.a> arrayList = new java.util.ArrayList();
        if ((i6 & 1) != 0) {
            g(arrayList, spannable, B1.e.f509h, new java.lang.String[]{"http://", "https://", "rtsp://"}, android.text.util.Linkify.sUrlMatchFilter, null);
        }
        if ((i6 & 2) != 0) {
            g(arrayList, spannable, B1.e.f510i, new java.lang.String[]{"mailto:"}, null, null);
        }
        if ((i6 & 8) != 0) {
            h(arrayList, spannable);
        }
        k(arrayList, spannable);
        if (arrayList.size() == 0) {
            return false;
        }
        for (A1.c.a aVar : arrayList) {
            if (aVar.f207a == null) {
                e(aVar.f208b, aVar.f209c, aVar.f210d, spannable);
            }
        }
        return true;
    }

    public static boolean d(android.widget.TextView textView, int i6) {
        if (l()) {
            return android.text.util.Linkify.addLinks(textView, i6);
        }
        if (i6 == 0) {
            return false;
        }
        java.lang.CharSequence text = textView.getText();
        if (!(text instanceof android.text.Spannable)) {
            android.text.SpannableString spannableStringValueOf = android.text.SpannableString.valueOf(text);
            if (c(spannableStringValueOf, i6)) {
                b(textView);
                textView.setText(spannableStringValueOf);
                return true;
            }
        } else if (c((android.text.Spannable) text, i6)) {
            b(textView);
            return true;
        }
        return false;
    }

    private static void e(java.lang.String str, int i6, int i10, android.text.Spannable spannable) {
        spannable.setSpan(new android.text.style.URLSpan(str), i6, i10, 33);
    }

    private static java.lang.String f(java.lang.String str) {
        return android.os.Build.VERSION.SDK_INT >= 28 ? android.webkit.WebView.findAddress(str) : A1.a.c(str);
    }

    private static void g(java.util.ArrayList arrayList, android.text.Spannable spannable, java.util.regex.Pattern pattern, java.lang.String[] strArr, android.text.util.Linkify.MatchFilter matchFilter, android.text.util.Linkify.TransformFilter transformFilter) {
        java.util.regex.Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            java.lang.String strGroup = matcher.group(0);
            if (matchFilter == null || matchFilter.acceptMatch(spannable, iStart, iEnd)) {
                if (strGroup != null) {
                    A1.c.a aVar = new A1.c.a();
                    aVar.f208b = j(strGroup, strArr, matcher, transformFilter);
                    aVar.f209c = iStart;
                    aVar.f210d = iEnd;
                    arrayList.add(aVar);
                }
            }
        }
    }

    private static void h(java.util.ArrayList arrayList, android.text.Spannable spannable) {
        int iIndexOf;
        java.lang.String string = spannable.toString();
        int i6 = 0;
        while (true) {
            try {
                java.lang.String strF = f(string);
                if (strF != null && (iIndexOf = string.indexOf(strF)) >= 0) {
                    A1.c.a aVar = new A1.c.a();
                    int length = strF.length() + iIndexOf;
                    aVar.f209c = iIndexOf + i6;
                    i6 += length;
                    aVar.f210d = i6;
                    string = string.substring(length);
                    try {
                        aVar.f208b = "geo:0,0?q=" + java.net.URLEncoder.encode(strF, "UTF-8");
                        arrayList.add(aVar);
                    } catch (java.io.UnsupportedEncodingException unused) {
                    }
                }
                return;
            } catch (java.lang.UnsupportedOperationException unused2) {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int i(A1.c.a aVar, A1.c.a aVar2) {
        int i6 = aVar.f209c;
        int i10 = aVar2.f209c;
        if (i6 < i10) {
            return -1;
        }
        if (i6 > i10) {
            return 1;
        }
        return java.lang.Integer.compare(aVar2.f210d, aVar.f210d);
    }

    private static java.lang.String j(java.lang.String str, java.lang.String[] strArr, java.util.regex.Matcher matcher, android.text.util.Linkify.TransformFilter transformFilter) {
        boolean z6;
        if (transformFilter != null) {
            str = transformFilter.transformUrl(matcher, str);
        }
        int length = strArr.length;
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                z6 = false;
                break;
            }
            java.lang.String str2 = strArr[i6];
            if (str.regionMatches(true, 0, str2, 0, str2.length())) {
                z6 = true;
                if (!str.regionMatches(false, 0, str2, 0, str2.length())) {
                    str = str2 + str.substring(str2.length());
                    break;
                }
                break;
            }
            i6++;
        }
        if (z6 || strArr.length <= 0) {
            return str;
        }
        return strArr[0] + str;
    }

    private static void k(java.util.ArrayList arrayList, android.text.Spannable spannable) {
        int i6;
        int i10 = 0;
        for (android.text.style.URLSpan uRLSpan : (android.text.style.URLSpan[]) spannable.getSpans(0, spannable.length(), android.text.style.URLSpan.class)) {
            A1.c.a aVar = new A1.c.a();
            aVar.f207a = uRLSpan;
            aVar.f209c = spannable.getSpanStart(uRLSpan);
            aVar.f210d = spannable.getSpanEnd(uRLSpan);
            arrayList.add(aVar);
        }
        java.util.Collections.sort(arrayList, f206b);
        int size = arrayList.size();
        while (i10 < size - 1) {
            A1.c.a aVar2 = (A1.c.a) arrayList.get(i10);
            int i11 = i10 + 1;
            A1.c.a aVar3 = (A1.c.a) arrayList.get(i11);
            int i12 = aVar2.f209c;
            int i13 = aVar3.f209c;
            if (i12 <= i13 && (i6 = aVar2.f210d) > i13) {
                int i14 = aVar3.f210d;
                int i15 = (i14 > i6 && i6 - i12 <= i14 - i13) ? i6 - i12 < i14 - i13 ? i10 : -1 : i11;
                if (i15 != -1) {
                    java.lang.Object obj = ((A1.c.a) arrayList.get(i15)).f207a;
                    if (obj != null) {
                        spannable.removeSpan(obj);
                    }
                    arrayList.remove(i15);
                    size--;
                }
            }
            i10 = i11;
        }
    }

    private static boolean l() {
        return android.os.Build.VERSION.SDK_INT >= 28;
    }
}
