.class public final Lr8/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LG8/b;


# instance fields
.field private final a:Ljava/util/Map;

.field private final b:LG8/e$a;

.field private final c:LG8/g;

.field private final d:LG8/f;

.field private final e:Lx7/p;


# direct methods
.method public constructor <init>(Ljava/util/Map;LG8/e$a;LG8/g;LG8/f;Lx7/p;)V
    .locals 1

    const-string v0, "equalityAxioms"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinTypePreparator"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr8/m;->a:Ljava/util/Map;

    iput-object p2, p0, Lr8/m;->b:LG8/e$a;

    iput-object p3, p0, Lr8/m;->c:LG8/g;

    iput-object p4, p0, Lr8/m;->d:LG8/f;

    iput-object p5, p0, Lr8/m;->e:Lx7/p;

    return-void
.end method

.method public static final synthetic F0(Lr8/m;)Lx7/p;
    .locals 0

    iget-object p0, p0, Lr8/m;->e:Lx7/p;

    return-object p0
.end method

.method private final G0(LF8/e0;LF8/e0;)Z
    .locals 4

    .prologue
    iget-object v0, p0, Lr8/m;->b:LG8/e$a;

    invoke-interface {v0, p1, p2}, LG8/e$a;->a(LF8/e0;LF8/e0;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lr8/m;->a:Ljava/util/Map;

    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    :cond_1
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF8/e0;

    iget-object v3, p0, Lr8/m;->a:Ljava/util/Map;

    invoke-interface {v3, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LF8/e0;

    if-eqz v0, :cond_2

    invoke-static {v0, p2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_4

    :cond_2
    if-eqz v3, :cond_3

    invoke-static {v3, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    move v1, v2

    :cond_4
    :goto_0
    return v1
.end method


# virtual methods
.method public A(LJ8/m;)I
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->g0(LG8/b;LJ8/m;)I

    move-result p1

    return p1
.end method

.method public A0(LJ8/m;I)LJ8/n;
    .locals 0

    invoke-static {p0, p1, p2}, LG8/b$a;->p(LG8/b;LJ8/m;I)LJ8/n;

    move-result-object p1

    return-object p1
.end method

.method public B(LJ8/c;)LJ8/l;
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->i0(LG8/b;LJ8/c;)LJ8/l;

    move-result-object p1

    return-object p1
.end method

.method public B0(LJ8/m;)Z
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->E(LG8/b;LJ8/m;)Z

    move-result p1

    return p1
.end method

.method public C(LJ8/m;)Z
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->a0(LG8/b;LJ8/m;)Z

    move-result p1

    return p1
.end method

.method public C0(LJ8/j;)Z
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->M(LG8/b;LJ8/j;)Z

    move-result p1

    return p1
.end method

.method public D(LJ8/i;)Z
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->Z(LG8/b;LJ8/i;)Z

    move-result p1

    return p1
.end method

.method public D0(LJ8/i;)Z
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->N(LG8/b;LJ8/i;)Z

    move-result p1

    return p1
.end method

.method public E(LJ8/m;)Z
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->H(LG8/b;LJ8/m;)Z

    move-result p1

    return p1
.end method

.method public E0(LJ8/l;)Z
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->W(LG8/b;LJ8/l;)Z

    move-result p1

    return p1
.end method

.method public F(LJ8/n;LJ8/m;)Z
    .locals 0

    invoke-static {p0, p1, p2}, LG8/b$a;->B(LG8/b;LJ8/n;LJ8/m;)Z

    move-result p1

    return p1
.end method

.method public G(LJ8/i;)LJ8/j;
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, LJ8/o;->t0(LJ8/i;)LJ8/g;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p0, v0}, LJ8/o;->a(LJ8/g;)LJ8/j;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    invoke-interface {p0, p1}, LJ8/o;->b(LJ8/i;)LJ8/j;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    :cond_1
    return-object v0
.end method

.method public H(LJ8/j;)Z
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->X(LG8/b;LJ8/j;)Z

    move-result p1

    return p1
.end method

.method public H0(ZZ)LF8/d0;
    .locals 7

    .prologue
    iget-object v0, p0, Lr8/m;->e:Lx7/p;

    if-nez v0, :cond_0

    iget-object v0, p0, Lr8/m;->c:LG8/g;

    iget-object v1, p0, Lr8/m;->d:LG8/f;

    invoke-static {p1, p2, p0, v1, v0}, LG8/a;->a(ZZLG8/b;LG8/f;LG8/g;)LF8/d0;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v4, p0, Lr8/m;->d:LG8/f;

    iget-object v5, p0, Lr8/m;->c:LG8/g;

    new-instance v6, Lr8/m$a;

    move-object v0, v6

    move v1, p1

    move v2, p2

    move-object v3, p0

    invoke-direct/range {v0 .. v5}, Lr8/m$a;-><init>(ZZLr8/m;LG8/f;LG8/g;)V

    return-object v6
.end method

.method public I(Ljava/util/List;)LJ8/i;
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->D(LG8/b;Ljava/util/List;)LJ8/i;

    move-result-object p1

    return-object p1
.end method

.method public J(LJ8/m;)Ljava/util/Collection;
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->k0(LG8/b;LJ8/m;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public K(LJ8/m;)Ln8/d;
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->o(LG8/b;LJ8/m;)Ln8/d;

    move-result-object p1

    return-object p1
.end method

.method public L(LJ8/j;LJ8/m;)Ljava/util/List;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "constructor"

    invoke-static {p2, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public M(LJ8/i;Z)LJ8/i;
    .locals 0

    invoke-static {p0, p1, p2}, LG8/b$a;->o0(LG8/b;LJ8/i;Z)LJ8/i;

    move-result-object p1

    return-object p1
.end method

.method public N(LJ8/m;)LL7/h;
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->r(LG8/b;LJ8/m;)LL7/h;

    move-result-object p1

    return-object p1
.end method

.method public O(LJ8/j;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, LJ8/o;->e(LJ8/j;)LJ8/m;

    move-result-object p1

    invoke-interface {p0, p1}, LJ8/o;->X(LJ8/m;)Z

    move-result p1

    return p1
.end method

.method public P(LJ8/j;LJ8/j;)LJ8/i;
    .locals 0

    invoke-static {p0, p1, p2}, LG8/b$a;->l(LG8/b;LJ8/j;LJ8/j;)LJ8/i;

    move-result-object p1

    return-object p1
.end method

.method public Q(LJ8/i;)Z
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->I(LG8/b;LJ8/i;)Z

    move-result p1

    return p1
.end method

.method public R(LJ8/i;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->n(LG8/b;LJ8/i;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public S(LJ8/d;)Z
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->S(LG8/b;LJ8/d;)Z

    move-result p1

    return p1
.end method

.method public T(LJ8/m;)Z
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->L(LG8/b;LJ8/m;)Z

    move-result p1

    return p1
.end method

.method public U(LJ8/j;LJ8/j;)Z
    .locals 0

    invoke-static {p0, p1, p2}, LG8/b$a;->C(LG8/b;LJ8/j;LJ8/j;)Z

    move-result p1

    return p1
.end method

.method public V(LJ8/m;)Z
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->G(LG8/b;LJ8/m;)Z

    move-result p1

    return p1
.end method

.method public W(LJ8/j;)Z
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->R(LG8/b;LJ8/j;)Z

    move-result p1

    return p1
.end method

.method public X(LJ8/m;)Z
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->F(LG8/b;LJ8/m;)Z

    move-result p1

    return p1
.end method

.method public Y(LJ8/d;)Z
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->Q(LG8/b;LJ8/d;)Z

    move-result p1

    return p1
.end method

.method public Z(LJ8/j;I)LJ8/l;
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-ltz p2, :cond_0

    invoke-interface {p0, p1}, LJ8/o;->h(LJ8/i;)I

    move-result v0

    if-ge p2, v0, :cond_0

    invoke-interface {p0, p1, p2}, LJ8/o;->c0(LJ8/i;I)LJ8/l;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public a(LJ8/g;)LJ8/j;
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->n0(LG8/b;LJ8/g;)LJ8/j;

    move-result-object p1

    return-object p1
.end method

.method public a0(LJ8/k;I)LJ8/l;
    .locals 2

    .prologue
    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LJ8/j;

    if-eqz v0, :cond_0

    check-cast p1, LJ8/i;

    invoke-interface {p0, p1, p2}, LJ8/o;->c0(LJ8/i;I)LJ8/l;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of v0, p1, LJ8/a;

    if-eqz v0, :cond_1

    check-cast p1, LJ8/a;

    invoke-virtual {p1, p2}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "get(...)"

    invoke-static {p1, p2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LJ8/l;

    :goto_0
    return-object p1

    :cond_1
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "unknown type argument list type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public b(LJ8/i;)LJ8/j;
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->h(LG8/b;LJ8/i;)LJ8/j;

    move-result-object p1

    return-object p1
.end method

.method public b0(LJ8/i;)LJ8/i;
    .locals 2

    .prologue
    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, LJ8/o;->b(LJ8/i;)LJ8/j;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-interface {p0, v0, v1}, LJ8/o;->g(LJ8/j;Z)LJ8/j;

    move-result-object v0

    if-eqz v0, :cond_0

    move-object p1, v0

    :cond_0
    return-object p1
.end method

.method public c(LJ8/g;)LJ8/j;
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->b0(LG8/b;LJ8/g;)LJ8/j;

    move-result-object p1

    return-object p1
.end method

.method public c0(LJ8/i;I)LJ8/l;
    .locals 0

    invoke-static {p0, p1, p2}, LG8/b$a;->m(LG8/b;LJ8/i;I)LJ8/l;

    move-result-object p1

    return-object p1
.end method

.method public d(LJ8/j;)LJ8/d;
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->d(LG8/b;LJ8/j;)LJ8/d;

    move-result-object p1

    return-object p1
.end method

.method public d0(LJ8/n;)LJ8/s;
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->z(LG8/b;LJ8/n;)LJ8/s;

    move-result-object p1

    return-object p1
.end method

.method public e(LJ8/j;)LJ8/m;
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->m0(LG8/b;LJ8/j;)LJ8/m;

    move-result-object p1

    return-object p1
.end method

.method public e0(LJ8/i;)Z
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LJ8/j;

    if-eqz v0, :cond_0

    check-cast p1, LJ8/j;

    invoke-interface {p0, p1}, LJ8/o;->C0(LJ8/j;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public f(LJ8/j;)Z
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->U(LG8/b;LJ8/j;)Z

    move-result p1

    return p1
.end method

.method public f0(LJ8/m;)Z
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->K(LG8/b;LJ8/m;)Z

    move-result p1

    return p1
.end method

.method public g(LJ8/j;Z)LJ8/j;
    .locals 0

    invoke-static {p0, p1, p2}, LG8/b$a;->p0(LG8/b;LJ8/j;Z)LJ8/j;

    move-result-object p1

    return-object p1
.end method

.method public g0(LJ8/i;)Z
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, LJ8/o;->u0(LJ8/i;)LJ8/m;

    move-result-object v0

    invoke-interface {p0, v0}, LJ8/o;->k0(LJ8/m;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0, p1}, LJ8/o;->p(LJ8/i;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public h(LJ8/i;)I
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->b(LG8/b;LJ8/i;)I

    move-result p1

    return p1
.end method

.method public h0(LJ8/m;LJ8/m;)Z
    .locals 2

    .prologue
    const-string v0, "c1"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "c2"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LF8/e0;

    const-string v1, "Failed requirement."

    if-eqz v0, :cond_3

    instance-of v0, p2, LF8/e0;

    if-eqz v0, :cond_2

    invoke-static {p0, p1, p2}, LG8/b$a;->a(LG8/b;LJ8/m;LJ8/m;)Z

    move-result v0

    if-nez v0, :cond_1

    check-cast p1, LF8/e0;

    check-cast p2, LF8/e0;

    invoke-direct {p0, p1, p2}, Lr8/m;->G0(LF8/e0;LF8/e0;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public i(LJ8/j;)LJ8/j;
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, LJ8/o;->t(LJ8/j;)LJ8/e;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {p0, v0}, LJ8/o;->y0(LJ8/e;)LJ8/j;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v0

    :cond_1
    :goto_0
    return-object p1
.end method

.method public i0(LJ8/m;)LJ8/n;
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->v(LG8/b;LJ8/m;)LJ8/n;

    move-result-object p1

    return-object p1
.end method

.method public j(LJ8/j;)LJ8/k;
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->c(LG8/b;LJ8/j;)LJ8/k;

    move-result-object p1

    return-object p1
.end method

.method public j0(LJ8/j;LJ8/b;)LJ8/j;
    .locals 0

    invoke-static {p0, p1, p2}, LG8/b$a;->j(LG8/b;LJ8/j;LJ8/b;)LJ8/j;

    move-result-object p1

    return-object p1
.end method

.method public k(LJ8/i;)Z
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, LJ8/o;->t0(LJ8/i;)LJ8/g;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, LJ8/o;->r(LJ8/g;)LJ8/f;

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public k0(LJ8/m;)Z
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->O(LG8/b;LJ8/m;)Z

    move-result p1

    return p1
.end method

.method public l(LJ8/i;Ln8/c;)Z
    .locals 0

    invoke-static {p0, p1, p2}, LG8/b$a;->A(LG8/b;LJ8/i;Ln8/c;)Z

    move-result p1

    return p1
.end method

.method public l0(LJ8/j;)LF8/d0$c;
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->j0(LG8/b;LJ8/j;)LF8/d0$c;

    move-result-object p1

    return-object p1
.end method

.method public m(LJ8/d;)LJ8/b;
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->k(LG8/b;LJ8/d;)LJ8/b;

    move-result-object p1

    return-object p1
.end method

.method public m0(LJ8/i;)LJ8/i;
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->d0(LG8/b;LJ8/i;)LJ8/i;

    move-result-object p1

    return-object p1
.end method

.method public n(LJ8/d;)LJ8/i;
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->c0(LG8/b;LJ8/d;)LJ8/i;

    move-result-object p1

    return-object p1
.end method

.method public n0(LJ8/l;)LJ8/i;
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->u(LG8/b;LJ8/l;)LJ8/i;

    move-result-object p1

    return-object p1
.end method

.method public o(LJ8/m;)LL7/h;
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->s(LG8/b;LJ8/m;)LL7/h;

    move-result-object p1

    return-object p1
.end method

.method public o0(LJ8/j;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, LJ8/o;->e(LJ8/j;)LJ8/m;

    move-result-object p1

    invoke-interface {p0, p1}, LJ8/o;->f0(LJ8/m;)Z

    move-result p1

    return p1
.end method

.method public p(LJ8/i;)Z
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->P(LG8/b;LJ8/i;)Z

    move-result p1

    return p1
.end method

.method public p0(LJ8/i;)Z
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, LJ8/o;->b(LJ8/i;)LJ8/j;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, LJ8/o;->d(LJ8/j;)LJ8/d;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return p1
.end method

.method public q(LJ8/n;)LJ8/i;
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->t(LG8/b;LJ8/n;)LJ8/i;

    move-result-object p1

    return-object p1
.end method

.method public q0(LJ8/d;)LJ8/c;
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->l0(LG8/b;LJ8/d;)LJ8/c;

    move-result-object p1

    return-object p1
.end method

.method public r(LJ8/g;)LJ8/f;
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->f(LG8/b;LJ8/g;)LJ8/f;

    const/4 p1, 0x0

    return-object p1
.end method

.method public r0(LJ8/m;)Z
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->J(LG8/b;LJ8/m;)Z

    move-result p1

    return p1
.end method

.method public s(LJ8/m;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->q(LG8/b;LJ8/m;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public s0(LJ8/k;)I
    .locals 3

    .prologue
    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LJ8/j;

    if-eqz v0, :cond_0

    check-cast p1, LJ8/i;

    invoke-interface {p0, p1}, LJ8/o;->h(LJ8/i;)I

    move-result p1

    goto :goto_0

    :cond_0
    instance-of v0, p1, LJ8/a;

    if-eqz v0, :cond_1

    check-cast p1, LJ8/a;

    invoke-virtual {p1}, LJ8/a;->size()I

    move-result p1

    :goto_0
    return p1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unknown type argument list type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public t(LJ8/j;)LJ8/e;
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->e(LG8/b;LJ8/j;)LJ8/e;

    move-result-object p1

    return-object p1
.end method

.method public t0(LJ8/i;)LJ8/g;
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->g(LG8/b;LJ8/i;)LJ8/g;

    move-result-object p1

    return-object p1
.end method

.method public u(LJ8/l;)LJ8/s;
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->y(LG8/b;LJ8/l;)LJ8/s;

    move-result-object p1

    return-object p1
.end method

.method public u0(LJ8/i;)LJ8/m;
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, LJ8/o;->b(LJ8/i;)LJ8/j;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-interface {p0, p1}, LJ8/o;->z(LJ8/i;)LJ8/j;

    move-result-object v0

    :cond_0
    invoke-interface {p0, v0}, LJ8/o;->e(LJ8/j;)LJ8/m;

    move-result-object p1

    return-object p1
.end method

.method public v(LJ8/j;)Z
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->Y(LG8/b;LJ8/j;)Z

    move-result p1

    return p1
.end method

.method public v0(LJ8/i;)Z
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->T(LG8/b;LJ8/i;)Z

    move-result p1

    return p1
.end method

.method public w(LJ8/j;)Ljava/util/Collection;
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->h0(LG8/b;LJ8/j;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public w0(LJ8/i;)LJ8/i;
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->w(LG8/b;LJ8/i;)LJ8/i;

    move-result-object p1

    return-object p1
.end method

.method public x(LJ8/n;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->x(LG8/b;LJ8/n;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public x0(LJ8/i;)Z
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, LJ8/o;->b(LJ8/i;)LJ8/j;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, LJ8/o;->t(LJ8/j;)LJ8/e;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return p1
.end method

.method public y(LJ8/i;)LJ8/l;
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->i(LG8/b;LJ8/i;)LJ8/l;

    move-result-object p1

    return-object p1
.end method

.method public y0(LJ8/e;)LJ8/j;
    .locals 0

    invoke-static {p0, p1}, LG8/b$a;->f0(LG8/b;LJ8/e;)LJ8/j;

    move-result-object p1

    return-object p1
.end method

.method public z(LJ8/i;)LJ8/j;
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, LJ8/o;->t0(LJ8/i;)LJ8/g;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p0, v0}, LJ8/o;->c(LJ8/g;)LJ8/j;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    invoke-interface {p0, p1}, LJ8/o;->b(LJ8/i;)LJ8/j;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    :cond_1
    return-object v0
.end method

.method public z0(LJ8/i;)Z
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, LJ8/o;->z(LJ8/i;)LJ8/j;

    move-result-object v0

    invoke-interface {p0, v0}, LJ8/o;->C0(LJ8/j;)Z

    move-result v0

    invoke-interface {p0, p1}, LJ8/o;->G(LJ8/i;)LJ8/j;

    move-result-object p1

    invoke-interface {p0, p1}, LJ8/o;->C0(LJ8/j;)Z

    move-result p1

    if-eq v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
