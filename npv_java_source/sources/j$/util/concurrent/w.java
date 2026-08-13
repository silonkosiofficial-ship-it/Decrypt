package j$.util.concurrent;

/* JADX INFO: loaded from: classes4.dex */
final class w extends java.lang.ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final java.lang.Object initialValue() {
        return new j$.util.concurrent.ThreadLocalRandom(0);
    }
}
