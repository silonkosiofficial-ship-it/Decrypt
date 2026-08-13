package j$.time.format;

/* JADX INFO: loaded from: classes4.dex */
class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected java.lang.String f47852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected java.lang.String f47853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected char f47854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected j$.time.format.n f47855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected j$.time.format.n f47856e;

    private n(java.lang.String str, java.lang.String str2, j$.time.format.n nVar) {
        this.f47852a = str;
        this.f47853b = str2;
        this.f47855d = nVar;
        this.f47854c = str.isEmpty() ? (char) 65535 : this.f47852a.charAt(0);
    }

    /* synthetic */ n(java.lang.String str, java.lang.String str2, j$.time.format.n nVar, int i6) {
        this(str, str2, nVar);
    }

    private boolean b(java.lang.String str, java.lang.String str2) {
        int i6 = 0;
        while (i6 < str.length() && i6 < this.f47852a.length() && c(str.charAt(i6), this.f47852a.charAt(i6))) {
            i6++;
        }
        if (i6 != this.f47852a.length()) {
            j$.time.format.n nVarE = e(this.f47852a.substring(i6), this.f47853b, this.f47855d);
            this.f47852a = str.substring(0, i6);
            this.f47855d = nVarE;
            if (i6 < str.length()) {
                this.f47855d.f47856e = e(str.substring(i6), str2, null);
                this.f47853b = null;
            } else {
                this.f47853b = str2;
            }
            return true;
        }
        if (i6 >= str.length()) {
            this.f47853b = str2;
            return true;
        }
        java.lang.String strSubstring = str.substring(i6);
        for (j$.time.format.n nVar = this.f47855d; nVar != null; nVar = nVar.f47856e) {
            if (c(nVar.f47854c, strSubstring.charAt(0))) {
                return nVar.b(strSubstring, str2);
            }
        }
        j$.time.format.n nVarE2 = e(strSubstring, str2, null);
        nVarE2.f47856e = this.f47855d;
        this.f47855d = nVarE2;
        return true;
    }

    public static j$.time.format.n f(j$.time.format.v vVar) {
        return vVar.k() ? new j$.time.format.n("", null, null) : new j$.time.format.m("", null, null);
    }

    public static j$.time.format.n g(java.util.Set set, j$.time.format.v vVar) {
        j$.time.format.n nVarF = f(vVar);
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            nVarF.b(str, str);
        }
        return nVarF;
    }

    public final void a(java.lang.String str, java.lang.String str2) {
        b(str, str2);
    }

    protected boolean c(char c6, char c10) {
        return c6 == c10;
    }

    public final java.lang.String d(java.lang.CharSequence charSequence, java.text.ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        int length = charSequence.length();
        if (!h(charSequence, index, length)) {
            return null;
        }
        int length2 = this.f47852a.length() + index;
        j$.time.format.n nVar = this.f47855d;
        if (nVar != null && length2 != length) {
            while (!c(nVar.f47854c, charSequence.charAt(length2))) {
                nVar = nVar.f47856e;
                if (nVar == null) {
                }
            }
            parsePosition.setIndex(length2);
            java.lang.String strD = nVar.d(charSequence, parsePosition);
            if (strD != null) {
                return strD;
            }
        }
        parsePosition.setIndex(length2);
        return this.f47853b;
    }

    protected j$.time.format.n e(java.lang.String str, java.lang.String str2, j$.time.format.n nVar) {
        return new j$.time.format.n(str, str2, nVar);
    }

    protected boolean h(java.lang.CharSequence charSequence, int i6, int i10) {
        if (charSequence instanceof java.lang.String) {
            return ((java.lang.String) charSequence).startsWith(this.f47852a, i6);
        }
        int length = this.f47852a.length();
        if (length > i10 - i6) {
            return false;
        }
        int i11 = 0;
        while (true) {
            int i12 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i13 = i11 + 1;
            int i14 = i6 + 1;
            if (!c(this.f47852a.charAt(i11), charSequence.charAt(i6))) {
                return false;
            }
            i6 = i14;
            length = i12;
            i11 = i13;
        }
    }
}
