package S1;

/* JADX INFO: loaded from: classes.dex */
public final class b extends S1.c {
    public static S1.b h(java.nio.ByteBuffer byteBuffer) {
        return i(byteBuffer, new S1.b());
    }

    public static S1.b i(java.nio.ByteBuffer byteBuffer, S1.b bVar) {
        byteBuffer.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        return bVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public S1.b f(int i6, java.nio.ByteBuffer byteBuffer) {
        g(i6, byteBuffer);
        return this;
    }

    public void g(int i6, java.nio.ByteBuffer byteBuffer) {
        c(i6, byteBuffer);
    }

    public S1.a j(S1.a aVar, int i6) {
        int iB = b(6);
        if (iB != 0) {
            return aVar.f(a(d(iB) + (i6 * 4)), this.f12418b);
        }
        return null;
    }

    public int k() {
        int iB = b(6);
        if (iB != 0) {
            return e(iB);
        }
        return 0;
    }

    public int l() {
        int iB = b(4);
        if (iB != 0) {
            return this.f12418b.getInt(iB + this.f12417a);
        }
        return 0;
    }
}
