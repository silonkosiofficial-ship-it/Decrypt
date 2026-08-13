package N9;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final N9.k.a f7933d = new N9.k.a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H9.y f7934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f7936c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final N9.k a(java.lang.String str) throws java.net.ProtocolException {
            H9.y yVar;
            int i6;
            java.lang.String strSubstring;
            p247y7.AbstractC7350t.f(str, "statusLine");
            if (S8.r.V(str, "HTTP/1.", false, 2, null)) {
                i6 = 9;
                if (str.length() < 9 || str.charAt(8) != ' ') {
                    throw new java.net.ProtocolException("Unexpected status line: " + str);
                }
                int iCharAt = str.charAt(7) - '0';
                if (iCharAt == 0) {
                    yVar = H9.y.HTTP_1_0;
                } else {
                    if (iCharAt != 1) {
                        throw new java.net.ProtocolException("Unexpected status line: " + str);
                    }
                    yVar = H9.y.HTTP_1_1;
                }
            } else {
                if (!S8.r.V(str, "ICY ", false, 2, null)) {
                    throw new java.net.ProtocolException("Unexpected status line: " + str);
                }
                yVar = H9.y.HTTP_1_0;
                i6 = 4;
            }
            int i10 = i6 + 3;
            if (str.length() < i10) {
                throw new java.net.ProtocolException("Unexpected status line: " + str);
            }
            try {
                java.lang.String strSubstring2 = str.substring(i6, i10);
                p247y7.AbstractC7350t.e(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                int i11 = java.lang.Integer.parseInt(strSubstring2);
                if (str.length() <= i10) {
                    strSubstring = "";
                } else {
                    if (str.charAt(i10) != ' ') {
                        throw new java.net.ProtocolException("Unexpected status line: " + str);
                    }
                    strSubstring = str.substring(i6 + 4);
                    p247y7.AbstractC7350t.e(strSubstring, "this as java.lang.String).substring(startIndex)");
                }
                return new N9.k(yVar, i11, strSubstring);
            } catch (java.lang.NumberFormatException unused) {
                throw new java.net.ProtocolException("Unexpected status line: " + str);
            }
        }
    }

    public k(H9.y yVar, int i6, java.lang.String str) {
        p247y7.AbstractC7350t.f(yVar, "protocol");
        p247y7.AbstractC7350t.f(str, "message");
        this.f7934a = yVar;
        this.f7935b = i6;
        this.f7936c = str;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.f7934a == H9.y.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f7935b);
        sb.append(' ');
        sb.append(this.f7936c);
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
