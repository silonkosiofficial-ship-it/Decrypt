package H;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final H.InterfaceC1225q f4167a = new H.r.c(a(new p247y7.G() { // from class: H.r.b
        @Override // p247y7.G, F7.m
        public java.lang.Object get(java.lang.Object obj) {
            return java.lang.Boolean.valueOf(p231x0.d.e(((p231x0.b) obj).f()));
        }
    }));

    public static final class a implements H.InterfaceC1225q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p237x7.l f4168a;

        a(p237x7.l lVar) {
            this.f4168a = lVar;
        }

        @Override // H.InterfaceC1225q
        public H.EnumC1223o a(android.view.KeyEvent keyEvent) {
            if (!((java.lang.Boolean) this.f4168a.l(p231x0.b.a(keyEvent))).booleanValue() || !p231x0.d.f(keyEvent)) {
                if (((java.lang.Boolean) this.f4168a.l(p231x0.b.a(keyEvent))).booleanValue()) {
                    long jA = p231x0.d.a(keyEvent);
                    H.C1232y c1232y = H.C1232y.f4238a;
                    if (!(p231x0.a.p(jA, c1232y.d()) ? true : p231x0.a.p(jA, c1232y.n()))) {
                        if (!p231x0.a.p(jA, c1232y.u())) {
                            if (!p231x0.a.p(jA, c1232y.v())) {
                                if (p231x0.a.p(jA, c1232y.a())) {
                                    return H.EnumC1223o.SELECT_ALL;
                                }
                                if (!p231x0.a.p(jA, c1232y.w())) {
                                    if (p231x0.a.p(jA, c1232y.x())) {
                                        return H.EnumC1223o.UNDO;
                                    }
                                    return null;
                                }
                            }
                            return H.EnumC1223o.CUT;
                        }
                        return H.EnumC1223o.PASTE;
                    }
                    return H.EnumC1223o.COPY;
                }
                if (p231x0.d.e(keyEvent)) {
                    return null;
                }
                boolean zF = p231x0.d.f(keyEvent);
                long jA2 = p231x0.d.a(keyEvent);
                H.C1232y c1232y2 = H.C1232y.f4238a;
                long jI = c1232y2.i();
                if (zF) {
                    if (p231x0.a.p(jA2, jI)) {
                        return H.EnumC1223o.SELECT_LEFT_CHAR;
                    }
                    if (p231x0.a.p(jA2, c1232y2.j())) {
                        return H.EnumC1223o.SELECT_RIGHT_CHAR;
                    }
                    if (p231x0.a.p(jA2, c1232y2.k())) {
                        return H.EnumC1223o.SELECT_UP;
                    }
                    if (p231x0.a.p(jA2, c1232y2.h())) {
                        return H.EnumC1223o.SELECT_DOWN;
                    }
                    if (p231x0.a.p(jA2, c1232y2.r())) {
                        return H.EnumC1223o.SELECT_PAGE_UP;
                    }
                    if (p231x0.a.p(jA2, c1232y2.q())) {
                        return H.EnumC1223o.SELECT_PAGE_DOWN;
                    }
                    if (p231x0.a.p(jA2, c1232y2.p())) {
                        return H.EnumC1223o.SELECT_LINE_START;
                    }
                    if (p231x0.a.p(jA2, c1232y2.o())) {
                        return H.EnumC1223o.SELECT_LINE_END;
                    }
                    if (!p231x0.a.p(jA2, c1232y2.n())) {
                        return null;
                    }
                } else {
                    if (p231x0.a.p(jA2, jI)) {
                        return H.EnumC1223o.LEFT_CHAR;
                    }
                    if (p231x0.a.p(jA2, c1232y2.j())) {
                        return H.EnumC1223o.RIGHT_CHAR;
                    }
                    if (p231x0.a.p(jA2, c1232y2.k())) {
                        return H.EnumC1223o.UP;
                    }
                    if (p231x0.a.p(jA2, c1232y2.h())) {
                        return H.EnumC1223o.DOWN;
                    }
                    if (p231x0.a.p(jA2, c1232y2.r())) {
                        return H.EnumC1223o.PAGE_UP;
                    }
                    if (p231x0.a.p(jA2, c1232y2.q())) {
                        return H.EnumC1223o.PAGE_DOWN;
                    }
                    if (p231x0.a.p(jA2, c1232y2.p())) {
                        return H.EnumC1223o.LINE_START;
                    }
                    if (p231x0.a.p(jA2, c1232y2.o())) {
                        return H.EnumC1223o.LINE_END;
                    }
                    if (p231x0.a.p(jA2, c1232y2.l())) {
                        return H.EnumC1223o.NEW_LINE;
                    }
                    if (p231x0.a.p(jA2, c1232y2.c())) {
                        return H.EnumC1223o.DELETE_PREV_CHAR;
                    }
                    if (p231x0.a.p(jA2, c1232y2.g())) {
                        return H.EnumC1223o.DELETE_NEXT_CHAR;
                    }
                    if (!p231x0.a.p(jA2, c1232y2.s())) {
                        if (!p231x0.a.p(jA2, c1232y2.f())) {
                            if (!p231x0.a.p(jA2, c1232y2.e())) {
                                if (p231x0.a.p(jA2, c1232y2.t())) {
                                    return H.EnumC1223o.TAB;
                                }
                                return null;
                            }
                            return H.EnumC1223o.COPY;
                        }
                        return H.EnumC1223o.CUT;
                    }
                }
                return H.EnumC1223o.PASTE;
            }
            if (!p231x0.a.p(p231x0.d.a(keyEvent), H.C1232y.f4238a.x())) {
                return null;
            }
            return H.EnumC1223o.REDO;
        }
    }

    public static final class c implements H.InterfaceC1225q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ H.InterfaceC1225q f4170a;

        c(H.InterfaceC1225q interfaceC1225q) {
            this.f4170a = interfaceC1225q;
        }

        @Override // H.InterfaceC1225q
        public H.EnumC1223o a(android.view.KeyEvent keyEvent) {
            H.EnumC1223o enumC1223o = null;
            if (p231x0.d.f(keyEvent) && p231x0.d.e(keyEvent)) {
                long jA = p231x0.d.a(keyEvent);
                H.C1232y c1232y = H.C1232y.f4238a;
                if (p231x0.a.p(jA, c1232y.i())) {
                    enumC1223o = H.EnumC1223o.SELECT_LEFT_WORD;
                } else if (p231x0.a.p(jA, c1232y.j())) {
                    enumC1223o = H.EnumC1223o.SELECT_RIGHT_WORD;
                } else if (p231x0.a.p(jA, c1232y.k())) {
                    enumC1223o = H.EnumC1223o.SELECT_PREV_PARAGRAPH;
                } else if (p231x0.a.p(jA, c1232y.h())) {
                    enumC1223o = H.EnumC1223o.SELECT_NEXT_PARAGRAPH;
                }
            } else if (p231x0.d.e(keyEvent)) {
                long jA2 = p231x0.d.a(keyEvent);
                H.C1232y c1232y2 = H.C1232y.f4238a;
                if (p231x0.a.p(jA2, c1232y2.i())) {
                    enumC1223o = H.EnumC1223o.LEFT_WORD;
                } else if (p231x0.a.p(jA2, c1232y2.j())) {
                    enumC1223o = H.EnumC1223o.RIGHT_WORD;
                } else if (p231x0.a.p(jA2, c1232y2.k())) {
                    enumC1223o = H.EnumC1223o.PREV_PARAGRAPH;
                } else if (p231x0.a.p(jA2, c1232y2.h())) {
                    enumC1223o = H.EnumC1223o.NEXT_PARAGRAPH;
                } else if (p231x0.a.p(jA2, c1232y2.m())) {
                    enumC1223o = H.EnumC1223o.DELETE_PREV_CHAR;
                } else if (p231x0.a.p(jA2, c1232y2.g())) {
                    enumC1223o = H.EnumC1223o.DELETE_NEXT_WORD;
                } else if (p231x0.a.p(jA2, c1232y2.c())) {
                    enumC1223o = H.EnumC1223o.DELETE_PREV_WORD;
                } else if (p231x0.a.p(jA2, c1232y2.b())) {
                    enumC1223o = H.EnumC1223o.DESELECT;
                }
            } else if (p231x0.d.f(keyEvent)) {
                long jA3 = p231x0.d.a(keyEvent);
                H.C1232y c1232y3 = H.C1232y.f4238a;
                if (p231x0.a.p(jA3, c1232y3.p())) {
                    enumC1223o = H.EnumC1223o.SELECT_LINE_LEFT;
                } else if (p231x0.a.p(jA3, c1232y3.o())) {
                    enumC1223o = H.EnumC1223o.SELECT_LINE_RIGHT;
                }
            } else if (p231x0.d.d(keyEvent)) {
                long jA4 = p231x0.d.a(keyEvent);
                H.C1232y c1232y4 = H.C1232y.f4238a;
                if (p231x0.a.p(jA4, c1232y4.c())) {
                    enumC1223o = H.EnumC1223o.DELETE_FROM_LINE_START;
                } else if (p231x0.a.p(jA4, c1232y4.g())) {
                    enumC1223o = H.EnumC1223o.DELETE_TO_LINE_END;
                }
            }
            return enumC1223o == null ? this.f4170a.a(keyEvent) : enumC1223o;
        }
    }

    public static final H.InterfaceC1225q a(p237x7.l lVar) {
        return new H.r.a(lVar);
    }

    public static final H.InterfaceC1225q b() {
        return f4167a;
    }
}
