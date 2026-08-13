package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final androidx.recyclerview.widget.h.a f23424a;

    interface a {
        void a(androidx.recyclerview.widget.a.b bVar);

        androidx.recyclerview.widget.a.b b(int i6, int i10, int i11, java.lang.Object obj);
    }

    h(androidx.recyclerview.widget.h.a aVar) {
        this.f23424a = aVar;
    }

    private int a(java.util.List list) {
        boolean z6 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (((androidx.recyclerview.widget.a.b) list.get(size)).f23296a != 8) {
                z6 = true;
            } else if (z6) {
                return size;
            }
        }
        return -1;
    }

    private void c(java.util.List list, int i6, androidx.recyclerview.widget.a.b bVar, int i10, androidx.recyclerview.widget.a.b bVar2) {
        int i11 = bVar.f23299d;
        int i12 = bVar2.f23297b;
        int i13 = i11 < i12 ? -1 : 0;
        int i14 = bVar.f23297b;
        if (i14 < i12) {
            i13++;
        }
        if (i12 <= i14) {
            bVar.f23297b = i14 + bVar2.f23299d;
        }
        int i15 = bVar2.f23297b;
        if (i15 <= i11) {
            bVar.f23299d = i11 + bVar2.f23299d;
        }
        bVar2.f23297b = i15 + i13;
        list.set(i6, bVar2);
        list.set(i10, bVar);
    }

    private void d(java.util.List list, int i6, int i10) {
        androidx.recyclerview.widget.a.b bVar = (androidx.recyclerview.widget.a.b) list.get(i6);
        androidx.recyclerview.widget.a.b bVar2 = (androidx.recyclerview.widget.a.b) list.get(i10);
        int i11 = bVar2.f23296a;
        if (i11 == 1) {
            c(list, i6, bVar, i10, bVar2);
        } else if (i11 == 2) {
            e(list, i6, bVar, i10, bVar2);
        } else {
            if (i11 != 4) {
                return;
            }
            f(list, i6, bVar, i10, bVar2);
        }
    }

    void b(java.util.List list) {
        while (true) {
            int iA = a(list);
            if (iA == -1) {
                return;
            } else {
                d(list, iA, iA + 1);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00a0 A[PHI: r0
  0x00a0: PHI (r0v13 int) = (r0v6 int), (r0v16 int) binds: [B:58:0x00cd, B:45:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
    void e(java.util.List list, int i6, androidx.recyclerview.widget.a.b bVar, int i10, androidx.recyclerview.widget.a.b bVar2) {
        boolean z6;
        int i11;
        int i12 = bVar.f23297b;
        int i13 = bVar.f23299d;
        boolean z10 = false;
        int i14 = bVar2.f23297b;
        if (i12 < i13) {
            if (i14 == i12 && bVar2.f23299d == i13 - i12) {
                z6 = false;
                z10 = true;
            } else {
                z6 = false;
            }
        } else if (i14 == i13 + 1 && bVar2.f23299d == i12 - i13) {
            z6 = true;
            z10 = true;
        } else {
            z6 = true;
        }
        int i15 = bVar2.f23297b;
        if (i13 < i15) {
            bVar2.f23297b = i15 - 1;
        } else {
            int i16 = bVar2.f23299d;
            if (i13 < i15 + i16) {
                bVar2.f23299d = i16 - 1;
                bVar.f23296a = 2;
                bVar.f23299d = 1;
                if (bVar2.f23299d == 0) {
                    list.remove(i10);
                    this.f23424a.a(bVar2);
                    return;
                }
                return;
            }
        }
        int i17 = bVar.f23297b;
        int i18 = bVar2.f23297b;
        androidx.recyclerview.widget.a.b bVarB = null;
        if (i17 <= i18) {
            bVar2.f23297b = i18 + 1;
        } else {
            int i19 = bVar2.f23299d;
            if (i17 < i18 + i19) {
                bVarB = this.f23424a.b(2, i17 + 1, (i18 + i19) - i17, null);
                bVar2.f23299d = bVar.f23297b - bVar2.f23297b;
            }
        }
        if (z10) {
            list.set(i6, bVar2);
            list.remove(i10);
            this.f23424a.a(bVar);
            return;
        }
        if (z6) {
            if (bVarB != null) {
                int i20 = bVar.f23297b;
                if (i20 > bVarB.f23297b) {
                    bVar.f23297b = i20 - bVarB.f23299d;
                }
                int i21 = bVar.f23299d;
                if (i21 > bVarB.f23297b) {
                    bVar.f23299d = i21 - bVarB.f23299d;
                }
            }
            int i22 = bVar.f23297b;
            if (i22 > bVar2.f23297b) {
                bVar.f23297b = i22 - bVar2.f23299d;
            }
            i11 = bVar.f23299d;
            if (i11 > bVar2.f23297b) {
                bVar.f23299d = i11 - bVar2.f23299d;
            }
        } else {
            if (bVarB != null) {
                int i23 = bVar.f23297b;
                if (i23 >= bVarB.f23297b) {
                    bVar.f23297b = i23 - bVarB.f23299d;
                }
                int i24 = bVar.f23299d;
                if (i24 >= bVarB.f23297b) {
                    bVar.f23299d = i24 - bVarB.f23299d;
                }
            }
            int i25 = bVar.f23297b;
            if (i25 >= bVar2.f23297b) {
                bVar.f23297b = i25 - bVar2.f23299d;
            }
            i11 = bVar.f23299d;
            if (i11 >= bVar2.f23297b) {
                bVar.f23299d = i11 - bVar2.f23299d;
            }
        }
        list.set(i6, bVar2);
        if (bVar.f23297b != bVar.f23299d) {
            list.set(i10, bVar);
        } else {
            list.remove(i10);
        }
        if (bVarB != null) {
            list.add(i6, bVarB);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    /* JADX WARN: Code duplicated, block: B:17:0x0048  */
    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0056  */
    /* JADX WARN: Code duplicated, block: B:22:0x005b  */
    /* JADX WARN: Code duplicated, block: B:24:? A[RETURN, SYNTHETIC] */
    void f(java.util.List list, int i6, androidx.recyclerview.widget.a.b bVar, int i10, androidx.recyclerview.widget.a.b bVar2) {
        androidx.recyclerview.widget.a.b bVarB;
        int i11;
        int i12;
        int i13;
        int i14 = bVar.f23299d;
        int i15 = bVar2.f23297b;
        androidx.recyclerview.widget.a.b bVarB2 = null;
        if (i14 >= i15) {
            int i16 = bVar2.f23299d;
            if (i14 < i15 + i16) {
                bVar2.f23299d = i16 - 1;
                bVarB = this.f23424a.b(4, bVar.f23297b, 1, bVar2.f23298c);
            }
            i11 = bVar.f23297b;
            i12 = bVar2.f23297b;
            if (i11 <= i12) {
                bVar2.f23297b = i12 + 1;
            } else {
                i13 = bVar2.f23299d;
                if (i11 < i12 + i13) {
                    int i17 = (i12 + i13) - i11;
                    bVarB2 = this.f23424a.b(4, i11 + 1, i17, bVar2.f23298c);
                    bVar2.f23299d -= i17;
                }
            }
            list.set(i10, bVar);
            if (bVar2.f23299d > 0) {
                list.set(i6, bVar2);
            } else {
                list.remove(i6);
                this.f23424a.a(bVar2);
            }
            if (bVarB != null) {
                list.add(i6, bVarB);
            }
            if (bVarB2 != null) {
                list.add(i6, bVarB2);
            }
        }
        bVar2.f23297b = i15 - 1;
        bVarB = null;
        i11 = bVar.f23297b;
        i12 = bVar2.f23297b;
        if (i11 <= i12) {
            bVar2.f23297b = i12 + 1;
        } else {
            i13 = bVar2.f23299d;
            if (i11 < i12 + i13) {
                int i18 = (i12 + i13) - i11;
                bVarB2 = this.f23424a.b(4, i11 + 1, i18, bVar2.f23298c);
                bVar2.f23299d -= i18;
            }
        }
        list.set(i10, bVar);
        if (bVar2.f23299d > 0) {
            list.set(i6, bVar2);
        } else {
            list.remove(i6);
            this.f23424a.a(bVar2);
        }
        if (bVarB != null) {
            list.add(i6, bVarB);
        }
        if (bVarB2 != null) {
            list.add(i6, bVarB2);
        }
    }
}
