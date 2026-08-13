package p081i0;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final void a(p081i0.d dVar, android.util.SparseArray sparseArray) {
        int size = sparseArray.size();
        for (int i6 = 0; i6 < size; i6++) {
            int iKeyAt = sparseArray.keyAt(i6);
            android.view.autofill.AutofillValue autofillValueA = p081i0.e.a(sparseArray.get(iKeyAt));
            p081i0.r rVar = p081i0.r.f46623a;
            if (rVar.d(autofillValueA)) {
                dVar.b().b(iKeyAt, rVar.i(autofillValueA).toString());
            } else {
                if (rVar.b(autofillValueA)) {
                    throw new p087i7.t("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (rVar.c(autofillValueA)) {
                    throw new p087i7.t("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (rVar.e(autofillValueA)) {
                    throw new p087i7.t("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    public static final void b(p081i0.d dVar, android.view.ViewStructure viewStructure) {
        int iA = p081i0.h.f46622a.a(viewStructure, dVar.b().a().size());
        for (java.util.Map.Entry entry : dVar.b().a().entrySet()) {
            int iIntValue = ((java.lang.Number) entry.getKey()).intValue();
            androidx.appcompat.app.D.a(entry.getValue());
            p081i0.h hVar = p081i0.h.f46622a;
            android.view.ViewStructure viewStructureB = hVar.b(viewStructure, iA);
            if (viewStructureB != null) {
                p081i0.r rVar = p081i0.r.f46623a;
                android.view.autofill.AutofillId autofillIdA = rVar.a(viewStructure);
                p247y7.AbstractC7350t.c(autofillIdA);
                rVar.g(viewStructureB, autofillIdA, iIntValue);
                hVar.d(viewStructureB, iIntValue, dVar.c().getContext().getPackageName(), null, null);
                rVar.h(viewStructureB, p081i0.x.f46626a.a());
                throw null;
            }
            iA++;
        }
    }
}
