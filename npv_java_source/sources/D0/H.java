package D0;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class H {
    public static int a(D0.I i6, D0.InterfaceC0896o interfaceC0896o, java.util.List list, int i10) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new D0.C0891j((D0.InterfaceC0895n) list.get(i11), D0.EnumC0897p.Max, D0.EnumC0898q.Height));
        }
        return i6.b(new D0.r(interfaceC0896o, interfaceC0896o.getLayoutDirection()), arrayList, Y0.c.b(0, i10, 0, 0, 13, null)).getHeight();
    }

    public static int b(D0.I i6, D0.InterfaceC0896o interfaceC0896o, java.util.List list, int i10) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new D0.C0891j((D0.InterfaceC0895n) list.get(i11), D0.EnumC0897p.Max, D0.EnumC0898q.Width));
        }
        return i6.b(new D0.r(interfaceC0896o, interfaceC0896o.getLayoutDirection()), arrayList, Y0.c.b(0, 0, 0, i10, 7, null)).getWidth();
    }

    public static int c(D0.I i6, D0.InterfaceC0896o interfaceC0896o, java.util.List list, int i10) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new D0.C0891j((D0.InterfaceC0895n) list.get(i11), D0.EnumC0897p.Min, D0.EnumC0898q.Height));
        }
        return i6.b(new D0.r(interfaceC0896o, interfaceC0896o.getLayoutDirection()), arrayList, Y0.c.b(0, i10, 0, 0, 13, null)).getHeight();
    }

    public static int d(D0.I i6, D0.InterfaceC0896o interfaceC0896o, java.util.List list, int i10) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new D0.C0891j((D0.InterfaceC0895n) list.get(i11), D0.EnumC0897p.Min, D0.EnumC0898q.Width));
        }
        return i6.b(new D0.r(interfaceC0896o, interfaceC0896o.getLayoutDirection()), arrayList, Y0.c.b(0, 0, 0, i10, 7, null)).getWidth();
    }
}
