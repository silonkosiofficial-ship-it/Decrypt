package D7;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends C7.a {
    @Override // C7.a
    public java.util.Random d() {
        j$.util.concurrent.ThreadLocalRandom threadLocalRandomCurrent = j$.util.concurrent.ThreadLocalRandom.current();
        p247y7.AbstractC7350t.e(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
