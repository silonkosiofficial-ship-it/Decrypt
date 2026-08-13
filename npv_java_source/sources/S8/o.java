package S8;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements java.io.Serializable {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final S8.o.a f12686D = new S8.o.a(null);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.regex.Pattern f12687C;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "pattern");
        java.util.regex.Pattern patternCompile = java.util.regex.Pattern.compile(str);
        p247y7.AbstractC7350t.e(patternCompile, "compile(...)");
        this(patternCompile);
    }

    public o(java.util.regex.Pattern pattern) {
        p247y7.AbstractC7350t.f(pattern, "nativePattern");
        this.f12687C = pattern;
    }

    public static /* synthetic */ S8.InterfaceC1639l b(S8.o oVar, java.lang.CharSequence charSequence, int i6, int i10, java.lang.Object obj) {
        if ((i10 & 2) != 0) {
            i6 = 0;
        }
        return oVar.a(charSequence, i6);
    }

    public final S8.InterfaceC1639l a(java.lang.CharSequence charSequence, int i6) {
        p247y7.AbstractC7350t.f(charSequence, "input");
        java.util.regex.Matcher matcher = this.f12687C.matcher(charSequence);
        p247y7.AbstractC7350t.e(matcher, "matcher(...)");
        return S8.p.e(matcher, i6, charSequence);
    }

    public final S8.InterfaceC1639l c(java.lang.CharSequence charSequence) {
        p247y7.AbstractC7350t.f(charSequence, "input");
        java.util.regex.Matcher matcher = this.f12687C.matcher(charSequence);
        p247y7.AbstractC7350t.e(matcher, "matcher(...)");
        return S8.p.f(matcher, charSequence);
    }

    public final boolean d(java.lang.CharSequence charSequence) {
        p247y7.AbstractC7350t.f(charSequence, "input");
        return this.f12687C.matcher(charSequence).matches();
    }

    public final java.lang.String e(java.lang.CharSequence charSequence, java.lang.String str) {
        p247y7.AbstractC7350t.f(charSequence, "input");
        p247y7.AbstractC7350t.f(str, "replacement");
        java.lang.String strReplaceAll = this.f12687C.matcher(charSequence).replaceAll(str);
        p247y7.AbstractC7350t.e(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public final java.lang.String f(java.lang.CharSequence charSequence, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(charSequence, "input");
        p247y7.AbstractC7350t.f(lVar, "transform");
        int iIntValue = 0;
        S8.InterfaceC1639l interfaceC1639lB = b(this, charSequence, 0, 2, null);
        if (interfaceC1639lB == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length);
        do {
            sb.append(charSequence, iIntValue, interfaceC1639lB.d().M().intValue());
            sb.append((java.lang.CharSequence) lVar.l(interfaceC1639lB));
            iIntValue = interfaceC1639lB.d().E().intValue() + 1;
            interfaceC1639lB = interfaceC1639lB.next();
            if (iIntValue >= length) {
                break;
            }
        } while (interfaceC1639lB != null);
        if (iIntValue < length) {
            sb.append(charSequence, iIntValue, length);
        }
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        return string;
    }

    public final java.util.List g(java.lang.CharSequence charSequence, int i6) {
        p247y7.AbstractC7350t.f(charSequence, "input");
        S8.H.O0(i6);
        java.util.regex.Matcher matcher = this.f12687C.matcher(charSequence);
        if (i6 == 1 || !matcher.find()) {
            return p097j7.AbstractC6879v.e(charSequence.toString());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i6 > 0 ? E7.j.g(i6, 10) : 10);
        int i10 = i6 - 1;
        int iEnd = 0;
        do {
            arrayList.add(charSequence.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
            if (i10 >= 0 && arrayList.size() == i10) {
                break;
            }
        } while (matcher.find());
        arrayList.add(charSequence.subSequence(iEnd, charSequence.length()).toString());
        return arrayList;
    }

    public java.lang.String toString() {
        java.lang.String string = this.f12687C.toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        return string;
    }
}
