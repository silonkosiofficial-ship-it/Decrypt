package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
abstract class m {

    private static class a implements androidx.emoji2.text.m.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.nio.ByteBuffer f22325a;

        a(java.nio.ByteBuffer byteBuffer) {
            this.f22325a = byteBuffer;
            byteBuffer.order(java.nio.ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji2.text.m.c
        public int a() {
            return androidx.emoji2.text.m.d(this.f22325a.getShort());
        }

        @Override // androidx.emoji2.text.m.c
        public int b() {
            return this.f22325a.getInt();
        }

        @Override // androidx.emoji2.text.m.c
        public void c(int i6) {
            java.nio.ByteBuffer byteBuffer = this.f22325a;
            byteBuffer.position(byteBuffer.position() + i6);
        }

        @Override // androidx.emoji2.text.m.c
        public long d() {
            return androidx.emoji2.text.m.c(this.f22325a.getInt());
        }

        @Override // androidx.emoji2.text.m.c
        public long getPosition() {
            return this.f22325a.position();
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f22326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f22327b;

        b(long j6, long j10) {
            this.f22326a = j6;
            this.f22327b = j10;
        }

        long a() {
            return this.f22326a;
        }
    }

    private interface c {
        int a();

        int b();

        void c(int i6);

        long d();

        long getPosition();
    }

    private static androidx.emoji2.text.m.b a(androidx.emoji2.text.m.c cVar) throws java.io.IOException {
        long jD;
        cVar.c(4);
        int iA = cVar.a();
        if (iA > 100) {
            throw new java.io.IOException("Cannot read metadata.");
        }
        cVar.c(6);
        int i6 = 0;
        while (true) {
            if (i6 >= iA) {
                jD = -1;
                break;
            }
            int iB = cVar.b();
            cVar.c(4);
            jD = cVar.d();
            cVar.c(4);
            if (1835365473 == iB) {
                break;
            }
            i6++;
        }
        if (jD != -1) {
            cVar.c((int) (jD - cVar.getPosition()));
            cVar.c(12);
            long jD2 = cVar.d();
            for (int i10 = 0; i10 < jD2; i10++) {
                int iB2 = cVar.b();
                long jD3 = cVar.d();
                long jD4 = cVar.d();
                if (1164798569 == iB2 || 1701669481 == iB2) {
                    return new androidx.emoji2.text.m.b(jD3 + jD, jD4);
                }
            }
        }
        throw new java.io.IOException("Cannot read metadata.");
    }

    static S1.b b(java.nio.ByteBuffer byteBuffer) {
        java.nio.ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position((int) a(new androidx.emoji2.text.m.a(byteBufferDuplicate)).a());
        return S1.b.h(byteBufferDuplicate);
    }

    static long c(int i6) {
        return ((long) i6) & 4294967295L;
    }

    static int d(short s6) {
        return s6 & 65535;
    }
}
