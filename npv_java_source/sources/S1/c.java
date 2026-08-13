package S1;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f12417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected java.nio.ByteBuffer f12418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f12419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f12420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    S1.d f12421e = S1.d.a();

    protected int a(int i6) {
        return i6 + this.f12418b.getInt(i6);
    }

    protected int b(int i6) {
        if (i6 < this.f12420d) {
            return this.f12418b.getShort(this.f12419c + i6);
        }
        return 0;
    }

    protected void c(int i6, java.nio.ByteBuffer byteBuffer) {
        short s6;
        this.f12418b = byteBuffer;
        if (byteBuffer != null) {
            this.f12417a = i6;
            int i10 = i6 - byteBuffer.getInt(i6);
            this.f12419c = i10;
            s6 = this.f12418b.getShort(i10);
        } else {
            s6 = 0;
            this.f12417a = 0;
            this.f12419c = 0;
        }
        this.f12420d = s6;
    }

    protected int d(int i6) {
        int i10 = i6 + this.f12417a;
        return i10 + this.f12418b.getInt(i10) + 4;
    }

    protected int e(int i6) {
        int i10 = i6 + this.f12417a;
        return this.f12418b.getInt(i10 + this.f12418b.getInt(i10));
    }
}
