package p258z9;

/* JADX INFO: renamed from: z9.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7389b {
    public static final byte a(char c6) {
        if (c6 < '~') {
            return p258z9.C7400m.f57774c[c6];
        }
        return (byte) 0;
    }

    public static final char b(int i6) {
        if (i6 < 117) {
            return p258z9.C7400m.f57773b[i6];
        }
        return (char) 0;
    }

    public static final java.lang.String c(byte b6) {
        if (b6 == 1) {
            return "quotation mark '\"'";
        }
        if (b6 == 2) {
            return "string escape sequence '\\'";
        }
        if (b6 == 4) {
            return "comma ','";
        }
        if (b6 == 5) {
            return "colon ':'";
        }
        if (b6 == 6) {
            return "start of the object '{'";
        }
        if (b6 == 7) {
            return "end of the object '}'";
        }
        if (b6 == 8) {
            return "start of the array '['";
        }
        if (b6 == 9) {
            return "end of the array ']'";
        }
        if (b6 == 10) {
            return "end of the input";
        }
        return b6 == 127 ? "invalid token" : "valid token";
    }
}
