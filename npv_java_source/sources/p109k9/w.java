package p109k9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class w {
    public static final p109k9.v a(java.util.List list) {
        p247y7.AbstractC7350t.f(list, "predicates");
        if (list.isEmpty()) {
            return p109k9.C.f49827a;
        }
        return list.size() == 1 ? (p109k9.v) p097j7.AbstractC6879v.G0(list) : new p109k9.i(list);
    }
}
