package S1;

/* JADX INFO: loaded from: classes.dex */
public final class a extends S1.c {
    public S1.a f(int i6, java.nio.ByteBuffer byteBuffer) {
        g(i6, byteBuffer);
        return this;
    }

    public void g(int i6, java.nio.ByteBuffer byteBuffer) {
        c(i6, byteBuffer);
    }

    public int h(int i6) {
        int iB = b(16);
        if (iB != 0) {
            return this.f12418b.getInt(d(iB) + (i6 * 4));
        }
        return 0;
    }

    public int i() {
        int iB = b(16);
        if (iB != 0) {
            return e(iB);
        }
        return 0;
    }

    public boolean j() {
        int iB = b(6);
        return (iB == 0 || this.f12418b.get(iB + this.f12417a) == 0) ? false : true;
    }

    public short k() {
        int iB = b(14);
        if (iB != 0) {
            return this.f12418b.getShort(iB + this.f12417a);
        }
        return (short) 0;
    }

    public int l() {
        int iB = b(4);
        if (iB != 0) {
            return this.f12418b.getInt(iB + this.f12417a);
        }
        return 0;
    }

    public short m() {
        int iB = b(8);
        if (iB != 0) {
            return this.f12418b.getShort(iB + this.f12417a);
        }
        return (short) 0;
    }

    public short n() {
        int iB = b(12);
        if (iB != 0) {
            return this.f12418b.getShort(iB + this.f12417a);
        }
        return (short) 0;
    }
}
