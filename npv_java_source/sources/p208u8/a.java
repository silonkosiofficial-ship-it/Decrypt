package p208u8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements java.lang.Comparable {
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(p208u8.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "other");
        int iCompareTo = g().compareTo(aVar.g());
        if (iCompareTo == 0 && !i() && aVar.i()) {
            return 1;
        }
        return iCompareTo;
    }

    public abstract p208u8.b g();

    public abstract boolean i();
}
