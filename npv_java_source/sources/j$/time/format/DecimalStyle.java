package j$.time.format;

/* JADX INFO: loaded from: classes4.dex */
public final class DecimalStyle {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j$.time.format.DecimalStyle f47813e = new j$.time.format.DecimalStyle('0', '-', '.');

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final j$.util.concurrent.ConcurrentHashMap f47814f = new j$.util.concurrent.ConcurrentHashMap(16, 0.75f, 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char f47815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char f47816b = '+';

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final char f47817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final char f47818d;

    private DecimalStyle(char c6, char c10, char c11) {
        this.f47815a = c6;
        this.f47817c = c10;
        this.f47818d = c11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static j$.time.format.DecimalStyle of(java.util.Locale locale) {
        j$.util.Objects.requireNonNull(locale, "locale");
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = f47814f;
        j$.time.format.DecimalStyle decimalStyle = (j$.time.format.DecimalStyle) concurrentHashMap.get(locale);
        if (decimalStyle != null) {
            return decimalStyle;
        }
        java.text.DecimalFormatSymbols decimalFormatSymbols = java.text.DecimalFormatSymbols.getInstance(locale);
        char zeroDigit = decimalFormatSymbols.getZeroDigit();
        char minusSign = decimalFormatSymbols.getMinusSign();
        char decimalSeparator = decimalFormatSymbols.getDecimalSeparator();
        concurrentHashMap.putIfAbsent(locale, (zeroDigit == '0' && minusSign == '-' && decimalSeparator == '.') ? f47813e : new j$.time.format.DecimalStyle(zeroDigit, minusSign, decimalSeparator));
        return (j$.time.format.DecimalStyle) concurrentHashMap.get(locale);
    }

    final java.lang.String a(java.lang.String str) {
        char c6 = this.f47815a;
        if (c6 == '0') {
            return str;
        }
        int i6 = c6 - '0';
        char[] charArray = str.toCharArray();
        for (int i10 = 0; i10 < charArray.length; i10++) {
            charArray[i10] = (char) (charArray[i10] + i6);
        }
        return new java.lang.String(charArray);
    }

    final int b(char c6) {
        int i6 = c6 - this.f47815a;
        if (i6 < 0 || i6 > 9) {
            return -1;
        }
        return i6;
    }

    public final char c() {
        return this.f47818d;
    }

    public final char d() {
        return this.f47817c;
    }

    public final char e() {
        return this.f47816b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j$.time.format.DecimalStyle)) {
            return false;
        }
        j$.time.format.DecimalStyle decimalStyle = (j$.time.format.DecimalStyle) obj;
        return this.f47815a == decimalStyle.f47815a && this.f47816b == decimalStyle.f47816b && this.f47817c == decimalStyle.f47817c && this.f47818d == decimalStyle.f47818d;
    }

    public final char f() {
        return this.f47815a;
    }

    public final int hashCode() {
        return this.f47815a + this.f47816b + this.f47817c + this.f47818d;
    }

    public final java.lang.String toString() {
        return "DecimalStyle[" + this.f47815a + this.f47816b + this.f47817c + this.f47818d + "]";
    }
}
