package p258z9;

/* JADX INFO: renamed from: z9.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7400m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p258z9.C7400m f57772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f57773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f57774c;

    static {
        p258z9.C7400m c7400m = new p258z9.C7400m();
        f57772a = c7400m;
        f57773b = new char[117];
        f57774c = new byte[126];
        c7400m.f();
        c7400m.e();
    }

    private C7400m() {
    }

    private final void a(char c6, char c10) {
        b(c6, c10);
    }

    private final void b(int i6, char c6) {
        if (c6 != 'u') {
            f57773b[c6] = (char) i6;
        }
    }

    private final void c(char c6, byte b6) {
        d(c6, b6);
    }

    private final void d(int i6, byte b6) {
        f57774c[i6] = b6;
    }

    private final void e() {
        for (int i6 = 0; i6 < 33; i6++) {
            d(i6, (byte) 127);
        }
        d(9, (byte) 3);
        d(10, (byte) 3);
        d(13, (byte) 3);
        d(32, (byte) 3);
        c(',', (byte) 4);
        c(':', (byte) 5);
        c('{', (byte) 6);
        c('}', (byte) 7);
        c('[', (byte) 8);
        c(']', (byte) 9);
        c('\"', (byte) 1);
        c('\\', (byte) 2);
    }

    private final void f() {
        for (int i6 = 0; i6 < 32; i6++) {
            b(i6, 'u');
        }
        b(8, 'b');
        b(9, 't');
        b(10, 'n');
        b(12, 'f');
        b(13, 'r');
        a('/', '/');
        a('\"', '\"');
        a('\\', '\\');
    }
}
