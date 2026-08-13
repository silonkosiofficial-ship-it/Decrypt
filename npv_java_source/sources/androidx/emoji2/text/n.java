package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final S1.b f22328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char[] f22329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.emoji2.text.n.a f22330c = new androidx.emoji2.text.n.a(1024);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final android.graphics.Typeface f22331d;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.util.SparseArray f22332a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private androidx.emoji2.text.p f22333b;

        private a() {
            this(1);
        }

        a(int i6) {
            this.f22332a = new android.util.SparseArray(i6);
        }

        androidx.emoji2.text.n.a a(int i6) {
            android.util.SparseArray sparseArray = this.f22332a;
            if (sparseArray == null) {
                return null;
            }
            return (androidx.emoji2.text.n.a) sparseArray.get(i6);
        }

        final androidx.emoji2.text.p b() {
            return this.f22333b;
        }

        void c(androidx.emoji2.text.p pVar, int i6, int i10) {
            androidx.emoji2.text.n.a aVarA = a(pVar.b(i6));
            if (aVarA == null) {
                aVarA = new androidx.emoji2.text.n.a();
                this.f22332a.put(pVar.b(i6), aVarA);
            }
            if (i10 > i6) {
                aVarA.c(pVar, i6 + 1, i10);
            } else {
                aVarA.f22333b = pVar;
            }
        }
    }

    private n(android.graphics.Typeface typeface, S1.b bVar) {
        this.f22331d = typeface;
        this.f22328a = bVar;
        this.f22329b = new char[bVar.k() * 2];
        a(bVar);
    }

    private void a(S1.b bVar) {
        int iK = bVar.k();
        for (int i6 = 0; i6 < iK; i6++) {
            androidx.emoji2.text.p pVar = new androidx.emoji2.text.p(this, i6);
            java.lang.Character.toChars(pVar.f(), this.f22329b, i6 * 2);
            h(pVar);
        }
    }

    public static androidx.emoji2.text.n b(android.graphics.Typeface typeface, java.nio.ByteBuffer byteBuffer) {
        try {
            androidx.core.os.s.a("EmojiCompat.MetadataRepo.create");
            return new androidx.emoji2.text.n(typeface, androidx.emoji2.text.m.b(byteBuffer));
        } finally {
            androidx.core.os.s.b();
        }
    }

    public char[] c() {
        return this.f22329b;
    }

    public S1.b d() {
        return this.f22328a;
    }

    int e() {
        return this.f22328a.l();
    }

    androidx.emoji2.text.n.a f() {
        return this.f22330c;
    }

    android.graphics.Typeface g() {
        return this.f22331d;
    }

    void h(androidx.emoji2.text.p pVar) {
        B1.i.h(pVar, "emoji metadata cannot be null");
        B1.i.b(pVar.c() > 0, "invalid metadata codepoint length");
        this.f22330c.c(pVar, 0, pVar.c() - 1);
    }
}
