package C7;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends C7.c {
    @Override // C7.c
    public int b() {
        return d().nextInt();
    }

    @Override // C7.c
    public int c(int i6) {
        return d().nextInt(i6);
    }

    public abstract java.util.Random d();
}
