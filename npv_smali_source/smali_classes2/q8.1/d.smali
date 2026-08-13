.class public final Lq8/d;
.super Lq8/c;
.source "SourceFile"

# interfaces
.implements Lq8/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq8/d$a;,
        Lq8/d$b;
    }
.end annotation


# instance fields
.field private final l:Lq8/g;

.field private final m:Li7/n;


# direct methods
.method public constructor <init>(Lq8/g;)V
    .locals 1

    const-string v0, "options"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lq8/c;-><init>()V

    iput-object p1, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {p1}, Lq8/g;->l0()Z

    new-instance p1, Lq8/d$d;

    invoke-direct {p1, p0}, Lq8/d$d;-><init>(Lq8/d;)V

    invoke-static {p1}, Li7/o;->b(Lx7/a;)Li7/n;

    move-result-object p1

    iput-object p1, p0, Lq8/d;->m:Li7/n;

    return-void
.end method

.method public static final synthetic A(Lq8/d;LO7/e;Ljava/lang/StringBuilder;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lq8/d;->W0(LO7/e;Ljava/lang/StringBuilder;)V

    return-void
.end method

.method private final A1(LO7/U;Ljava/lang/StringBuilder;)V
    .locals 7

    .prologue
    invoke-virtual {p0}, Lq8/d;->d0()Ljava/util/Set;

    move-result-object v0

    sget-object v1, Lq8/e;->J:Lq8/e;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p2

    move-object v3, p1

    invoke-static/range {v1 .. v6}, Lq8/d;->U0(Lq8/d;Ljava/lang/StringBuilder;LP7/a;LP7/e;ILjava/lang/Object;)V

    invoke-interface {p1}, LO7/U;->z0()LO7/w;

    move-result-object v0

    if-eqz v0, :cond_1

    sget-object v1, LP7/e;->D:LP7/e;

    invoke-direct {p0, p2, v0, v1}, Lq8/d;->T0(Ljava/lang/StringBuilder;LP7/a;LP7/e;)V

    :cond_1
    invoke-interface {p1}, LO7/U;->w0()LO7/w;

    move-result-object v0

    if-eqz v0, :cond_2

    sget-object v1, LP7/e;->L:LP7/e;

    invoke-direct {p0, p2, v0, v1}, Lq8/d;->T0(Ljava/lang/StringBuilder;LP7/a;LP7/e;)V

    :cond_2
    invoke-virtual {p0}, Lq8/d;->k0()Lq8/l;

    move-result-object v0

    sget-object v1, Lq8/l;->E:Lq8/l;

    if-ne v0, v1, :cond_4

    invoke-interface {p1}, LO7/U;->d()LO7/V;

    move-result-object v0

    if-eqz v0, :cond_3

    sget-object v1, LP7/e;->G:LP7/e;

    invoke-direct {p0, p2, v0, v1}, Lq8/d;->T0(Ljava/lang/StringBuilder;LP7/a;LP7/e;)V

    :cond_3
    invoke-interface {p1}, LO7/U;->i()LO7/W;

    move-result-object p1

    if-eqz p1, :cond_4

    sget-object v0, LP7/e;->H:LP7/e;

    invoke-direct {p0, p2, p1, v0}, Lq8/d;->T0(Ljava/lang/StringBuilder;LP7/a;LP7/e;)V

    invoke-interface {p1}, LO7/a;->n()Ljava/util/List;

    move-result-object p1

    const-string v0, "getValueParameters(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lj7/v;->G0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LO7/j0;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    sget-object v0, LP7/e;->K:LP7/e;

    invoke-direct {p0, p2, p1, v0}, Lq8/d;->T0(Ljava/lang/StringBuilder;LP7/a;LP7/e;)V

    :cond_4
    return-void
.end method

.method public static final synthetic B(Lq8/d;LO7/l;Ljava/lang/StringBuilder;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lq8/d;->b1(LO7/l;Ljava/lang/StringBuilder;)V

    return-void
.end method

.method private final B1(LO7/a;Ljava/lang/StringBuilder;)V
    .locals 1

    .prologue
    invoke-interface {p1}, LO7/a;->v0()LO7/X;

    move-result-object p1

    if-eqz p1, :cond_0

    sget-object v0, LP7/e;->I:LP7/e;

    invoke-direct {p0, p2, p1, v0}, Lq8/d;->T0(Ljava/lang/StringBuilder;LP7/a;LP7/e;)V

    invoke-interface {p1}, LO7/i0;->getType()LF8/E;

    move-result-object p1

    const-string v0, "getType(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lq8/d;->f1(LF8/E;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    return-void
.end method

.method public static final synthetic C(Lq8/d;LO7/y;Ljava/lang/StringBuilder;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lq8/d;->h1(LO7/y;Ljava/lang/StringBuilder;)V

    return-void
.end method

.method private final C1(LO7/a;Ljava/lang/StringBuilder;)V
    .locals 1

    .prologue
    invoke-virtual {p0}, Lq8/d;->l0()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-interface {p1}, LO7/a;->v0()LO7/X;

    move-result-object p1

    if-eqz p1, :cond_1

    const-string v0, " on "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, LO7/i0;->getType()LF8/E;

    move-result-object p1

    const-string v0, "getType(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lq8/d;->w(LF8/E;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    return-void
.end method

.method public static final synthetic D(Lq8/d;LO7/m;Ljava/lang/StringBuilder;Z)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lq8/d;->r1(LO7/m;Ljava/lang/StringBuilder;Z)V

    return-void
.end method

.method private final D1(Ljava/lang/StringBuilder;LF8/M;)V
    .locals 2

    .prologue
    sget-object v0, LF8/q0;->b:LF8/M;

    invoke-static {p2, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "???"

    if-nez v0, :cond_5

    invoke-static {p2}, LF8/q0;->k(LF8/E;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    invoke-static {p2}, LH8/k;->o(LF8/E;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lq8/d;->A0()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, LF8/E;->W0()LF8/e0;

    move-result-object p2

    const-string v0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor"

    invoke-static {p2, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, LH8/i;

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, LH8/i;->c(I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p2}, Lq8/d;->e1(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    return-void

    :cond_2
    invoke-static {p2}, LF8/G;->a(LF8/E;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-direct {p0, p1, p2}, Lq8/d;->d1(Ljava/lang/StringBuilder;LF8/E;)V

    return-void

    :cond_3
    invoke-direct {p0, p2}, Lq8/d;->W1(LF8/E;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-direct {p0, p1, p2}, Lq8/d;->i1(Ljava/lang/StringBuilder;LF8/E;)V

    goto :goto_1

    :cond_4
    invoke-direct {p0, p1, p2}, Lq8/d;->d1(Ljava/lang/StringBuilder;LF8/E;)V

    :goto_1
    return-void

    :cond_5
    :goto_2
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public static final synthetic E(Lq8/d;LO7/K;Ljava/lang/StringBuilder;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lq8/d;->v1(LO7/K;Ljava/lang/StringBuilder;)V

    return-void
.end method

.method private final E1(Ljava/lang/StringBuilder;)V
    .locals 2

    .prologue
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    const/16 v1, 0x20

    if-eqz v0, :cond_0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result v0

    if-eq v0, v1, :cond_1

    :cond_0
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_1
    return-void
.end method

.method public static final synthetic F(Lq8/d;LO7/P;Ljava/lang/StringBuilder;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lq8/d;->x1(LO7/P;Ljava/lang/StringBuilder;)V

    return-void
.end method

.method private final F1(LO7/e;Ljava/lang/StringBuilder;)V
    .locals 11

    .prologue
    invoke-virtual {p0}, Lq8/d;->H0()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-interface {p1}, LO7/e;->w()LF8/M;

    move-result-object v0

    invoke-static {v0}, LL7/g;->n0(LF8/E;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    invoke-interface {p1}, LO7/h;->p()LF8/e0;

    move-result-object p1

    invoke-interface {p1}, LF8/e0;->u()Ljava/util/Collection;

    move-result-object p1

    const-string v0, "getSupertypes(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF8/E;

    invoke-static {v0}, LL7/g;->b0(LF8/E;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-direct {p0, p2}, Lq8/d;->E1(Ljava/lang/StringBuilder;)V

    const-string v0, ": "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v1, p1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v8, Lq8/d$f;

    invoke-direct {v8, p0}, Lq8/d$f;-><init>(Lq8/d;)V

    const/16 v9, 0x3c

    const/4 v10, 0x0

    const-string v3, ", "

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, p2

    invoke-static/range {v1 .. v10}, Lj7/v;->p0(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lx7/l;ILjava/lang/Object;)Ljava/lang/Appendable;

    :cond_3
    :goto_0
    return-void
.end method

.method public static final synthetic G(Lq8/d;LO7/U;Ljava/lang/StringBuilder;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lq8/d;->z1(LO7/U;Ljava/lang/StringBuilder;)V

    return-void
.end method

.method private final G1(LO7/y;Ljava/lang/StringBuilder;)V
    .locals 1

    invoke-interface {p1}, LO7/y;->y()Z

    move-result p1

    const-string v0, "suspend"

    invoke-direct {p0, p2, p1, v0}, Lq8/d;->q1(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    return-void
.end method

.method public static final synthetic H(Lq8/d;LO7/e0;Ljava/lang/StringBuilder;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lq8/d;->H1(LO7/e0;Ljava/lang/StringBuilder;)V

    return-void
.end method

.method private final H1(LO7/e0;Ljava/lang/StringBuilder;)V
    .locals 6

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p2

    move-object v2, p1

    invoke-static/range {v0 .. v5}, Lq8/d;->U0(Lq8/d;Ljava/lang/StringBuilder;LP7/a;LP7/e;ILjava/lang/Object;)V

    invoke-interface {p1}, LO7/C;->h()LO7/u;

    move-result-object v0

    const-string v1, "getVisibility(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0, p2}, Lq8/d;->U1(LO7/u;Ljava/lang/StringBuilder;)Z

    invoke-direct {p0, p1, p2}, Lq8/d;->m1(LO7/C;Ljava/lang/StringBuilder;)V

    const-string v0, "typealias"

    invoke-direct {p0, v0}, Lq8/d;->k1(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0}, Lq8/d;->r1(LO7/m;Ljava/lang/StringBuilder;Z)V

    invoke-interface {p1}, LO7/i;->A()Ljava/util/List;

    move-result-object v0

    const-string v1, "getDeclaredTypeParameters(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-direct {p0, v0, p2, v1}, Lq8/d;->O1(Ljava/util/List;Ljava/lang/StringBuilder;Z)V

    invoke-direct {p0, p1, p2}, Lq8/d;->V0(LO7/i;Ljava/lang/StringBuilder;)V

    const-string v0, " = "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, LO7/e0;->o0()LF8/M;

    move-result-object p1

    invoke-virtual {p0, p1}, Lq8/d;->w(LF8/E;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public static final synthetic I(Lq8/d;LO7/f0;Ljava/lang/StringBuilder;Z)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lq8/d;->M1(LO7/f0;Ljava/lang/StringBuilder;Z)V

    return-void
.end method

.method public static final synthetic J(Lq8/d;LO7/j0;ZLjava/lang/StringBuilder;Z)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lq8/d;->R1(LO7/j0;ZLjava/lang/StringBuilder;Z)V

    return-void
.end method

.method private final J0()Ljava/lang/String;
    .locals 1

    const-string v0, ">"

    invoke-direct {p0, v0}, Lq8/d;->N(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private final K(Ljava/lang/StringBuilder;LO7/m;)V
    .locals 4

    .prologue
    instance-of v0, p2, LO7/K;

    if-nez v0, :cond_2

    instance-of v0, p2, LO7/P;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {p2}, LO7/m;->b()LO7/m;

    move-result-object v0

    if-eqz v0, :cond_2

    instance-of v1, v0, LO7/G;

    if-nez v1, :cond_2

    const-string v1, " "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "defined in"

    invoke-virtual {p0, v2}, Lq8/d;->n1(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Lr8/f;->m(LO7/m;)Ln8/d;

    move-result-object v2

    const-string v3, "getFqName(...)"

    invoke-static {v2, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ln8/d;->e()Z

    move-result v3

    if-eqz v3, :cond_1

    const-string v2, "root package"

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v2}, Lq8/d;->u(Ln8/d;)Ljava/lang/String;

    move-result-object v2

    :goto_0
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lq8/d;->F0()Z

    move-result v2

    if-eqz v2, :cond_2

    instance-of v0, v0, LO7/K;

    if-eqz v0, :cond_2

    instance-of v0, p2, LO7/p;

    if-eqz v0, :cond_2

    check-cast p2, LO7/p;

    invoke-interface {p2}, LO7/p;->o()LO7/a0;

    move-result-object p2

    invoke-interface {p2}, LO7/a0;->a()LO7/b0;

    move-result-object p2

    invoke-interface {p2}, LO7/b0;->getName()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_2

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "in file"

    invoke-virtual {p0, v0}, Lq8/d;->n1(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    :goto_1
    return-void
.end method

.method private final K0(LF8/E;)Z
    .locals 1

    .prologue
    invoke-static {p1}, LL7/f;->r(LF8/E;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, LF8/E;->k()LP7/g;

    move-result-object p1

    invoke-interface {p1}, LP7/g;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method private final K1(Ljava/lang/StringBuilder;LF8/E;LF8/e0;)V
    .locals 1

    .prologue
    invoke-static {p2}, LO7/g0;->a(LF8/E;)LO7/S;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p3}, Lq8/d;->J1(LF8/e0;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, LF8/E;->U0()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p2}, Lq8/d;->I1(Ljava/util/List;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    :cond_0
    invoke-direct {p0, p1, v0}, Lq8/d;->y1(Ljava/lang/StringBuilder;LO7/S;)V

    return-void
.end method

.method private final L(Ljava/lang/StringBuilder;Ljava/util/List;)V
    .locals 10

    move-object v0, p2

    check-cast v0, Ljava/lang/Iterable;

    new-instance v7, Lq8/d$c;

    invoke-direct {v7, p0}, Lq8/d$c;-><init>(Lq8/d;)V

    const/16 v8, 0x3c

    const/4 v9, 0x0

    const-string v2, ", "

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p1

    invoke-static/range {v0 .. v9}, Lj7/v;->p0(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lx7/l;ILjava/lang/Object;)Ljava/lang/Appendable;

    return-void
.end method

.method private final L0(LO7/C;)LO7/D;
    .locals 3

    .prologue
    instance-of v0, p1, LO7/e;

    if-eqz v0, :cond_1

    check-cast p1, LO7/e;

    invoke-interface {p1}, LO7/e;->j()LO7/f;

    move-result-object p1

    sget-object v0, LO7/f;->E:LO7/f;

    if-ne p1, v0, :cond_0

    sget-object p1, LO7/D;->G:LO7/D;

    goto :goto_0

    :cond_0
    sget-object p1, LO7/D;->D:LO7/D;

    :goto_0
    return-object p1

    :cond_1
    invoke-interface {p1}, LO7/n;->b()LO7/m;

    move-result-object v0

    instance-of v1, v0, LO7/e;

    if-eqz v1, :cond_2

    check-cast v0, LO7/e;

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    if-nez v0, :cond_3

    sget-object p1, LO7/D;->D:LO7/D;

    return-object p1

    :cond_3
    instance-of v1, p1, LO7/b;

    if-nez v1, :cond_4

    sget-object p1, LO7/D;->D:LO7/D;

    return-object p1

    :cond_4
    check-cast p1, LO7/b;

    invoke-interface {p1}, LO7/b;->f()Ljava/util/Collection;

    move-result-object v1

    const-string v2, "getOverriddenDescriptors(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_5

    invoke-interface {v0}, LO7/e;->q()LO7/D;

    move-result-object v1

    sget-object v2, LO7/D;->D:LO7/D;

    if-eq v1, v2, :cond_5

    sget-object p1, LO7/D;->F:LO7/D;

    return-object p1

    :cond_5
    invoke-interface {v0}, LO7/e;->j()LO7/f;

    move-result-object v0

    sget-object v1, LO7/f;->E:LO7/f;

    if-ne v0, v1, :cond_7

    invoke-interface {p1}, LO7/C;->h()LO7/u;

    move-result-object v0

    sget-object v1, LO7/t;->a:LO7/u;

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    invoke-interface {p1}, LO7/C;->q()LO7/D;

    move-result-object p1

    sget-object v0, LO7/D;->G:LO7/D;

    if-ne p1, v0, :cond_6

    goto :goto_2

    :cond_6
    sget-object v0, LO7/D;->F:LO7/D;

    goto :goto_2

    :cond_7
    sget-object v0, LO7/D;->D:LO7/D;

    :goto_2
    return-object v0
.end method

.method static synthetic L1(Lq8/d;Ljava/lang/StringBuilder;LF8/E;LF8/e0;ILjava/lang/Object;)V
    .locals 0

    .prologue
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    invoke-virtual {p2}, LF8/E;->W0()LF8/e0;

    move-result-object p3

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lq8/d;->K1(Ljava/lang/StringBuilder;LF8/E;LF8/e0;)V

    return-void
.end method

.method private final M()Ljava/lang/String;
    .locals 2

    .prologue
    invoke-virtual {p0}, Lq8/d;->y0()Lq8/m;

    move-result-object v0

    sget-object v1, Lq8/d$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const-string v0, "&rarr;"

    goto :goto_0

    :cond_0
    new-instance v0, Li7/s;

    invoke-direct {v0}, Li7/s;-><init>()V

    throw v0

    :cond_1
    const-string v0, "->"

    invoke-direct {p0, v0}, Lq8/d;->N(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method private final M0(LP7/c;)Z
    .locals 1

    invoke-interface {p1}, LP7/c;->e()Ln8/c;

    move-result-object p1

    sget-object v0, LL7/j$a;->E:Ln8/c;

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method private final M1(LO7/f0;Ljava/lang/StringBuilder;Z)V
    .locals 10

    .prologue
    if-eqz p3, :cond_0

    invoke-direct {p0}, Lq8/d;->N0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {p0}, Lq8/d;->D0()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "/*"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, LO7/f0;->getIndex()I

    move-result v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "*/ "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    invoke-interface {p1}, LO7/f0;->K()Z

    move-result v0

    const-string v1, "reified"

    invoke-direct {p0, p2, v0, v1}, Lq8/d;->q1(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    invoke-interface {p1}, LO7/f0;->s()LF8/u0;

    move-result-object v0

    invoke-virtual {v0}, LF8/u0;->i()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-lez v1, :cond_2

    move v1, v3

    goto :goto_0

    :cond_2
    move v1, v2

    :goto_0
    invoke-direct {p0, p2, v1, v0}, Lq8/d;->q1(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    const/4 v8, 0x2

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v4, p0

    move-object v5, p2

    move-object v6, p1

    invoke-static/range {v4 .. v9}, Lq8/d;->U0(Lq8/d;Ljava/lang/StringBuilder;LP7/a;LP7/e;ILjava/lang/Object;)V

    invoke-direct {p0, p1, p2, p3}, Lq8/d;->r1(LO7/m;Ljava/lang/StringBuilder;Z)V

    invoke-interface {p1}, LO7/f0;->getUpperBounds()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const-string v1, " : "

    if-le v0, v3, :cond_3

    if-eqz p3, :cond_4

    :cond_3
    if-ne v0, v3, :cond_5

    :cond_4
    invoke-interface {p1}, LO7/f0;->getUpperBounds()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LF8/E;

    invoke-static {p1}, LL7/g;->j0(LF8/E;)Z

    move-result v0

    if-nez v0, :cond_8

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Lq8/d;->w(LF8/E;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_5
    if-eqz p3, :cond_8

    invoke-interface {p1}, LO7/f0;->getUpperBounds()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF8/E;

    invoke-static {v0}, LL7/g;->j0(LF8/E;)Z

    move-result v4

    if-eqz v4, :cond_6

    goto :goto_1

    :cond_6
    if-eqz v3, :cond_7

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_7
    const-string v3, " & "

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_2
    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lq8/d;->w(LF8/E;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move v3, v2

    goto :goto_1

    :cond_8
    :goto_3
    if-eqz p3, :cond_9

    invoke-direct {p0}, Lq8/d;->J0()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_9
    return-void
.end method

.method private final N(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lq8/d;->y0()Lq8/m;

    move-result-object v0

    invoke-virtual {v0, p1}, Lq8/m;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private final N0()Ljava/lang/String;
    .locals 1

    const-string v0, "<"

    invoke-direct {p0, v0}, Lq8/d;->N(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private final N1(Ljava/lang/StringBuilder;Ljava/util/List;)V
    .locals 2

    .prologue
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LO7/f0;

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, v1}, Lq8/d;->M1(LO7/f0;Ljava/lang/StringBuilder;Z)V

    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, ", "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    return-void
.end method

.method private final O0(LO7/b;)Z
    .locals 0

    invoke-interface {p1}, LO7/b;->f()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method private final O1(Ljava/util/List;Ljava/lang/StringBuilder;Z)V
    .locals 1

    .prologue
    invoke-virtual {p0}, Lq8/d;->I0()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lq8/d;->N0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0, p2, p1}, Lq8/d;->N1(Ljava/lang/StringBuilder;Ljava/util/List;)V

    invoke-direct {p0}, Lq8/d;->J0()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p3, :cond_1

    const-string p1, " "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    return-void
.end method

.method private final P0(Ljava/lang/StringBuilder;LF8/a;)V
    .locals 2

    .prologue
    invoke-virtual {p0}, Lq8/d;->y0()Lq8/m;

    move-result-object v0

    sget-object v1, Lq8/m;->D:Lq8/m;

    if-ne v0, v1, :cond_0

    const-string v0, "<font color=\"808080\"><i>"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    const-string v0, " /* = "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, LF8/a;->c0()LF8/M;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lq8/d;->t1(Ljava/lang/StringBuilder;LF8/E;)V

    const-string p2, " */"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lq8/d;->y0()Lq8/m;

    move-result-object p2

    if-ne p2, v1, :cond_1

    const-string p2, "</i></font>"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    return-void
.end method

.method private final P1(LO7/k0;Ljava/lang/StringBuilder;Z)V
    .locals 0

    .prologue
    if-nez p3, :cond_0

    instance-of p3, p1, LO7/j0;

    if-nez p3, :cond_2

    :cond_0
    invoke-interface {p1}, LO7/k0;->t0()Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "var"

    goto :goto_0

    :cond_1
    const-string p1, "val"

    :goto_0
    invoke-direct {p0, p1}, Lq8/d;->k1(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    return-void
.end method

.method private final Q0(LO7/T;Ljava/lang/StringBuilder;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lq8/d;->m1(LO7/C;Ljava/lang/StringBuilder;)V

    return-void
.end method

.method static synthetic Q1(Lq8/d;LO7/k0;Ljava/lang/StringBuilder;ZILjava/lang/Object;)V
    .locals 0

    .prologue
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lq8/d;->P1(LO7/k0;Ljava/lang/StringBuilder;Z)V

    return-void
.end method

.method private final R0(LO7/y;Ljava/lang/StringBuilder;)V
    .locals 5

    .prologue
    invoke-interface {p1}, LO7/y;->W()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    const-string v3, "getOverriddenDescriptors(...)"

    if-eqz v0, :cond_3

    invoke-interface {p1}, LO7/y;->f()Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    move-object v4, v0

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LO7/y;

    invoke-interface {v4}, LO7/y;->W()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {p0}, Lq8/d;->P()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    :goto_0
    move v0, v2

    goto :goto_1

    :cond_3
    move v0, v1

    :goto_1
    invoke-interface {p1}, LO7/y;->Q0()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {p1}, LO7/y;->f()Ljava/util/Collection;

    move-result-object v4

    invoke-static {v4, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Ljava/lang/Iterable;

    move-object v3, v4

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_2

    :cond_4
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LO7/y;

    invoke-interface {v4}, LO7/y;->Q0()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-virtual {p0}, Lq8/d;->P()Z

    move-result v3

    if-eqz v3, :cond_7

    :cond_6
    :goto_2
    move v1, v2

    :cond_7
    invoke-interface {p1}, LO7/y;->V()Z

    move-result v2

    const-string v3, "tailrec"

    invoke-direct {p0, p2, v2, v3}, Lq8/d;->q1(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lq8/d;->G1(LO7/y;Ljava/lang/StringBuilder;)V

    invoke-interface {p1}, LO7/y;->m()Z

    move-result p1

    const-string v2, "inline"

    invoke-direct {p0, p2, p1, v2}, Lq8/d;->q1(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    const-string p1, "infix"

    invoke-direct {p0, p2, v1, p1}, Lq8/d;->q1(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    const-string p1, "operator"

    invoke-direct {p0, p2, v0, p1}, Lq8/d;->q1(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    return-void
.end method

.method private final R1(LO7/j0;ZLjava/lang/StringBuilder;Z)V
    .locals 9

    .prologue
    if-eqz p4, :cond_0

    const-string v0, "value-parameter"

    invoke-direct {p0, v0}, Lq8/d;->k1(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {p0}, Lq8/d;->D0()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "/*"

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, LO7/j0;->getIndex()I

    move-result v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "*/ "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p3

    move-object v3, p1

    invoke-static/range {v1 .. v6}, Lq8/d;->U0(Lq8/d;Ljava/lang/StringBuilder;LP7/a;LP7/e;ILjava/lang/Object;)V

    invoke-interface {p1}, LO7/j0;->j0()Z

    move-result v0

    const-string v1, "crossinline"

    invoke-direct {p0, p3, v0, v1}, Lq8/d;->q1(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    invoke-interface {p1}, LO7/j0;->e0()Z

    move-result v0

    const-string v1, "noinline"

    invoke-direct {p0, p3, v0, v1}, Lq8/d;->q1(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    invoke-virtual {p0}, Lq8/d;->s0()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_3

    invoke-interface {p1}, LO7/j0;->b()LO7/a;

    move-result-object v0

    instance-of v3, v0, LO7/d;

    if-eqz v3, :cond_2

    check-cast v0, LO7/d;

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_3

    invoke-interface {v0}, LO7/l;->G()Z

    move-result v0

    if-ne v0, v2, :cond_3

    move v8, v2

    goto :goto_1

    :cond_3
    move v8, v1

    :goto_1
    if-eqz v8, :cond_4

    invoke-virtual {p0}, Lq8/d;->O()Z

    move-result v0

    const-string v3, "actual"

    invoke-direct {p0, p3, v0, v3}, Lq8/d;->q1(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    :cond_4
    move-object v3, p0

    move-object v4, p1

    move v5, p2

    move-object v6, p3

    move v7, p4

    invoke-direct/range {v3 .. v8}, Lq8/d;->T1(LO7/k0;ZLjava/lang/StringBuilder;ZZ)V

    invoke-virtual {p0}, Lq8/d;->U()Lx7/l;

    move-result-object p2

    if-eqz p2, :cond_6

    invoke-virtual {p0}, Lq8/d;->n()Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-interface {p1}, LO7/j0;->D0()Z

    move-result p2

    goto :goto_2

    :cond_5
    invoke-static {p1}, Lv8/c;->c(LO7/j0;)Z

    move-result p2

    :goto_2
    if-eqz p2, :cond_6

    move v1, v2

    :cond_6
    if-eqz v1, :cond_7

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, " = "

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lq8/d;->U()Lx7/l;

    move-result-object p4

    invoke-static {p4}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p4, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_7
    return-void
.end method

.method private final S0(LP7/c;)Ljava/util/List;
    .locals 7

    .prologue
    invoke-interface {p1}, LP7/c;->a()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0}, Lq8/d;->p0()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-static {p1}, Lv8/c;->i(LP7/c;)LO7/e;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v2

    :goto_0
    const/16 v1, 0xa

    if-eqz p1, :cond_4

    invoke-interface {p1}, LO7/e;->X()LO7/d;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-interface {p1}, LO7/a;->n()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_4

    check-cast p1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, LO7/j0;

    invoke-interface {v4}, LO7/j0;->D0()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/util/ArrayList;

    invoke-static {v2, v1}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {p1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LO7/j0;

    invoke-interface {v3}, LO7/I;->getName()Ln8/f;

    move-result-object v3

    invoke-interface {p1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    move-object v2, p1

    :cond_4
    if-nez v2, :cond_5

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v2

    :cond_5
    move-object p1, v2

    check-cast p1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_6
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Ln8/f;

    invoke-static {v5}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v0, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    xor-int/lit8 v5, v5, 0x1

    if-eqz v5, :cond_6

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_7
    new-instance p1, Ljava/util/ArrayList;

    invoke-static {v3, v1}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {p1, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ln8/f;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4}, Ln8/f;->g()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " = ..."

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_8
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v0, v1}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ln8/f;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt8/g;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4}, Ln8/f;->g()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " = "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v2, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_9

    invoke-direct {p0, v1}, Lq8/d;->a1(Lt8/g;)Ljava/lang/String;

    move-result-object v1

    goto :goto_6

    :cond_9
    const-string v1, "..."

    :goto_6
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_a
    invoke-static {p1, v3}, Lj7/v;->C0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lj7/v;->K0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private final S1(Ljava/util/Collection;ZLjava/lang/StringBuilder;)V
    .locals 6

    .prologue
    invoke-direct {p0, p2}, Lq8/d;->X1(Z)Z

    move-result p2

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v0

    invoke-virtual {p0}, Lq8/d;->C0()Lq8/c$l;

    move-result-object v1

    invoke-interface {v1, v0, p3}, Lq8/c$l;->c(ILjava/lang/StringBuilder;)V

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    add-int/lit8 v3, v2, 0x1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LO7/j0;

    invoke-virtual {p0}, Lq8/d;->C0()Lq8/c$l;

    move-result-object v5

    invoke-interface {v5, v4, v2, v0, p3}, Lq8/c$l;->b(LO7/j0;IILjava/lang/StringBuilder;)V

    invoke-direct {p0, v4, p2, p3, v1}, Lq8/d;->R1(LO7/j0;ZLjava/lang/StringBuilder;Z)V

    invoke-virtual {p0}, Lq8/d;->C0()Lq8/c$l;

    move-result-object v5

    invoke-interface {v5, v4, v2, v0, p3}, Lq8/c$l;->a(LO7/j0;IILjava/lang/StringBuilder;)V

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lq8/d;->C0()Lq8/c$l;

    move-result-object p1

    invoke-interface {p1, v0, p3}, Lq8/c$l;->d(ILjava/lang/StringBuilder;)V

    return-void
.end method

.method private final T0(Ljava/lang/StringBuilder;LP7/a;LP7/e;)V
    .locals 5

    .prologue
    invoke-virtual {p0}, Lq8/d;->d0()Ljava/util/Set;

    move-result-object v0

    sget-object v1, Lq8/e;->J:Lq8/e;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    instance-of v0, p2, LF8/E;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lq8/d;->m()Ljava/util/Set;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lq8/d;->W()Ljava/util/Set;

    move-result-object v0

    :goto_0
    invoke-virtual {p0}, Lq8/d;->Q()Lx7/l;

    move-result-object v1

    invoke-interface {p2}, LP7/a;->k()LP7/g;

    move-result-object p2

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LP7/c;

    move-object v3, v0

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v2}, LP7/c;->e()Ln8/c;

    move-result-object v4

    invoke-static {v3, v4}, Lj7/v;->Z(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-direct {p0, v2}, Lq8/d;->M0(LP7/c;)Z

    move-result v3

    if-nez v3, :cond_2

    if-eqz v1, :cond_3

    invoke-interface {v1, v2}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_2

    :cond_3
    invoke-virtual {p0, v2, p3}, Lq8/d;->r(LP7/c;LP7/e;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lq8/d;->V()Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0xa

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, "append(...)"

    invoke-static {p1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    const-string v2, " "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_5
    return-void
.end method

.method private final T1(LO7/k0;ZLjava/lang/StringBuilder;ZZ)V
    .locals 5

    .prologue
    invoke-interface {p1}, LO7/i0;->getType()LF8/E;

    move-result-object v0

    const-string v1, "getType(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v1, p1, LO7/j0;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, p1

    check-cast v1, LO7/j0;

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    if-eqz v1, :cond_1

    invoke-interface {v1}, LO7/j0;->u0()LF8/E;

    move-result-object v2

    :cond_1
    if-nez v2, :cond_2

    move-object v1, v0

    goto :goto_1

    :cond_2
    move-object v1, v2

    :goto_1
    if-eqz v2, :cond_3

    const/4 v3, 0x1

    goto :goto_2

    :cond_3
    const/4 v3, 0x0

    :goto_2
    const-string v4, "vararg"

    invoke-direct {p0, p3, v3, v4}, Lq8/d;->q1(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    if-nez p5, :cond_4

    if-eqz p4, :cond_5

    invoke-virtual {p0}, Lq8/d;->x0()Z

    move-result v3

    if-nez v3, :cond_5

    :cond_4
    invoke-direct {p0, p1, p3, p5}, Lq8/d;->P1(LO7/k0;Ljava/lang/StringBuilder;Z)V

    :cond_5
    if-eqz p2, :cond_6

    invoke-direct {p0, p1, p3, p4}, Lq8/d;->r1(LO7/m;Ljava/lang/StringBuilder;Z)V

    const-string p2, ": "

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_6
    invoke-virtual {p0, v1}, Lq8/d;->w(LF8/E;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0, p1, p3}, Lq8/d;->j1(LO7/k0;Ljava/lang/StringBuilder;)V

    invoke-virtual {p0}, Lq8/d;->D0()Z

    move-result p1

    if-eqz p1, :cond_7

    if-eqz v2, :cond_7

    const-string p1, " /*"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Lq8/d;->w(LF8/E;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "*/"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_7
    return-void
.end method

.method static synthetic U0(Lq8/d;Ljava/lang/StringBuilder;LP7/a;LP7/e;ILjava/lang/Object;)V
    .locals 0

    .prologue
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lq8/d;->T0(Ljava/lang/StringBuilder;LP7/a;LP7/e;)V

    return-void
.end method

.method private final U1(LO7/u;Ljava/lang/StringBuilder;)Z
    .locals 2

    .prologue
    invoke-virtual {p0}, Lq8/d;->d0()Ljava/util/Set;

    move-result-object v0

    sget-object v1, Lq8/e;->G:Lq8/e;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, Lq8/d;->e0()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LO7/u;->f()LO7/u;

    move-result-object p1

    :cond_1
    invoke-virtual {p0}, Lq8/d;->r0()Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, LO7/t;->l:LO7/u;

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    return v1

    :cond_2
    invoke-virtual {p1}, LO7/u;->c()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lq8/d;->k1(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 p1, 0x1

    return p1
.end method

.method private final V0(LO7/i;Ljava/lang/StringBuilder;)V
    .locals 3

    .prologue
    invoke-interface {p1}, LO7/i;->A()Ljava/util/List;

    move-result-object v0

    const-string v1, "getDeclaredTypeParameters(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LO7/h;->p()LF8/e0;

    move-result-object v1

    invoke-interface {v1}, LF8/e0;->x()Ljava/util/List;

    move-result-object v1

    const-string v2, "getParameters(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lq8/d;->D0()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, LO7/i;->S()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result p1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-le p1, v2, :cond_0

    const-string p1, " /*captured type parameters: "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {v1, p1, v0}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p2, p1}, Lq8/d;->N1(Ljava/lang/StringBuilder;Ljava/util/List;)V

    const-string p1, "*/"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    return-void
.end method

.method private final V1(Ljava/util/List;Ljava/lang/StringBuilder;)V
    .locals 11

    .prologue
    invoke-virtual {p0}, Lq8/d;->I0()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    const/4 v0, 0x0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LO7/f0;

    invoke-interface {v2}, LO7/f0;->getUpperBounds()Ljava/util/List;

    move-result-object v4

    const-string v5, "getUpperBounds(...)"

    invoke-static {v4, v5}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v4, v3}, Lj7/v;->c0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LF8/E;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v2}, LO7/I;->getName()Ln8/f;

    move-result-object v6

    const-string v7, "getName(...)"

    invoke-static {v6, v7}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v6, v0}, Lq8/d;->v(Ln8/f;Z)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " : "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p0, v4}, Lq8/d;->w(LF8/E;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    xor-int/2addr p1, v3

    if-eqz p1, :cond_3

    const-string p1, " "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "where"

    invoke-direct {p0, v0}, Lq8/d;->k1(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v9, 0x7c

    const/4 v10, 0x0

    const-string v3, ", "

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v2, p2

    invoke-static/range {v1 .. v10}, Lj7/v;->p0(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lx7/l;ILjava/lang/Object;)Ljava/lang/Appendable;

    :cond_3
    return-void
.end method

.method private final W0(LO7/e;Ljava/lang/StringBuilder;)V
    .locals 11

    .prologue
    invoke-interface {p1}, LO7/e;->j()LO7/f;

    move-result-object v0

    sget-object v1, LO7/f;->G:LO7/f;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-virtual {p0}, Lq8/d;->x0()Z

    move-result v1

    const-string v4, "getVisibility(...)"

    if-nez v1, :cond_a

    const/4 v9, 0x2

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v5, p0

    move-object v6, p2

    move-object v7, p1

    invoke-static/range {v5 .. v10}, Lq8/d;->U0(Lq8/d;Ljava/lang/StringBuilder;LP7/a;LP7/e;ILjava/lang/Object;)V

    invoke-interface {p1}, LO7/e;->P0()Ljava/util/List;

    move-result-object v1

    const-string v5, "getContextReceivers(...)"

    invoke-static {v1, v5}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v1, p2}, Lq8/d;->c1(Ljava/util/List;Ljava/lang/StringBuilder;)V

    if-nez v0, :cond_1

    invoke-interface {p1}, LO7/e;->h()LO7/u;

    move-result-object v1

    invoke-static {v1, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v1, p2}, Lq8/d;->U1(LO7/u;Ljava/lang/StringBuilder;)Z

    :cond_1
    invoke-interface {p1}, LO7/e;->j()LO7/f;

    move-result-object v1

    sget-object v5, LO7/f;->E:LO7/f;

    if-ne v1, v5, :cond_2

    invoke-interface {p1}, LO7/e;->q()LO7/D;

    move-result-object v1

    sget-object v5, LO7/D;->G:LO7/D;

    if-eq v1, v5, :cond_4

    :cond_2
    invoke-interface {p1}, LO7/e;->j()LO7/f;

    move-result-object v1

    invoke-virtual {v1}, LO7/f;->g()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, LO7/e;->q()LO7/D;

    move-result-object v1

    sget-object v5, LO7/D;->D:LO7/D;

    if-eq v1, v5, :cond_4

    :cond_3
    invoke-interface {p1}, LO7/e;->q()LO7/D;

    move-result-object v1

    const-string v5, "getModality(...)"

    invoke-static {v1, v5}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lq8/d;->L0(LO7/C;)LO7/D;

    move-result-object v5

    invoke-direct {p0, v1, p2, v5}, Lq8/d;->o1(LO7/D;Ljava/lang/StringBuilder;LO7/D;)V

    :cond_4
    invoke-direct {p0, p1, p2}, Lq8/d;->m1(LO7/C;Ljava/lang/StringBuilder;)V

    invoke-virtual {p0}, Lq8/d;->d0()Ljava/util/Set;

    move-result-object v1

    sget-object v5, Lq8/e;->K:Lq8/e;

    invoke-interface {v1, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p1}, LO7/i;->S()Z

    move-result v1

    if-eqz v1, :cond_5

    move v1, v3

    goto :goto_1

    :cond_5
    move v1, v2

    :goto_1
    const-string v5, "inner"

    invoke-direct {p0, p2, v1, v5}, Lq8/d;->q1(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    invoke-virtual {p0}, Lq8/d;->d0()Ljava/util/Set;

    move-result-object v1

    sget-object v5, Lq8/e;->M:Lq8/e;

    invoke-interface {v1, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {p1}, LO7/e;->R0()Z

    move-result v1

    if-eqz v1, :cond_6

    move v1, v3

    goto :goto_2

    :cond_6
    move v1, v2

    :goto_2
    const-string v5, "data"

    invoke-direct {p0, p2, v1, v5}, Lq8/d;->q1(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    invoke-virtual {p0}, Lq8/d;->d0()Ljava/util/Set;

    move-result-object v1

    sget-object v5, Lq8/e;->N:Lq8/e;

    invoke-interface {v1, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {p1}, LO7/e;->m()Z

    move-result v1

    if-eqz v1, :cond_7

    move v1, v3

    goto :goto_3

    :cond_7
    move v1, v2

    :goto_3
    const-string v5, "inline"

    invoke-direct {p0, p2, v1, v5}, Lq8/d;->q1(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    invoke-virtual {p0}, Lq8/d;->d0()Ljava/util/Set;

    move-result-object v1

    sget-object v5, Lq8/e;->T:Lq8/e;

    invoke-interface {v1, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {p1}, LO7/e;->P()Z

    move-result v1

    if-eqz v1, :cond_8

    move v1, v3

    goto :goto_4

    :cond_8
    move v1, v2

    :goto_4
    const-string v5, "value"

    invoke-direct {p0, p2, v1, v5}, Lq8/d;->q1(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    invoke-virtual {p0}, Lq8/d;->d0()Ljava/util/Set;

    move-result-object v1

    sget-object v5, Lq8/e;->S:Lq8/e;

    invoke-interface {v1, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {p1}, LO7/e;->I()Z

    move-result v1

    if-eqz v1, :cond_9

    move v1, v3

    goto :goto_5

    :cond_9
    move v1, v2

    :goto_5
    const-string v5, "fun"

    invoke-direct {p0, p2, v1, v5}, Lq8/d;->q1(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lq8/d;->X0(LO7/e;Ljava/lang/StringBuilder;)V

    :cond_a
    invoke-static {p1}, Lr8/f;->x(LO7/m;)Z

    move-result v1

    if-nez v1, :cond_c

    invoke-virtual {p0}, Lq8/d;->x0()Z

    move-result v1

    if-nez v1, :cond_b

    invoke-direct {p0, p2}, Lq8/d;->E1(Ljava/lang/StringBuilder;)V

    :cond_b
    invoke-direct {p0, p1, p2, v3}, Lq8/d;->r1(LO7/m;Ljava/lang/StringBuilder;Z)V

    goto :goto_6

    :cond_c
    invoke-direct {p0, p1, p2}, Lq8/d;->Z0(LO7/m;Ljava/lang/StringBuilder;)V

    :goto_6
    if-eqz v0, :cond_d

    return-void

    :cond_d
    invoke-interface {p1}, LO7/e;->A()Ljava/util/List;

    move-result-object v0

    const-string v1, "getDeclaredTypeParameters(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0, p2, v2}, Lq8/d;->O1(Ljava/util/List;Ljava/lang/StringBuilder;Z)V

    invoke-direct {p0, p1, p2}, Lq8/d;->V0(LO7/i;Ljava/lang/StringBuilder;)V

    invoke-interface {p1}, LO7/e;->j()LO7/f;

    move-result-object v1

    invoke-virtual {v1}, LO7/f;->g()Z

    move-result v1

    if-nez v1, :cond_e

    invoke-virtual {p0}, Lq8/d;->S()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-interface {p1}, LO7/e;->X()LO7/d;

    move-result-object v1

    if-eqz v1, :cond_e

    const-string v2, " "

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v9, 0x2

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v5, p0

    move-object v6, p2

    move-object v7, v1

    invoke-static/range {v5 .. v10}, Lq8/d;->U0(Lq8/d;Ljava/lang/StringBuilder;LP7/a;LP7/e;ILjava/lang/Object;)V

    invoke-interface {v1}, LO7/C;->h()LO7/u;

    move-result-object v2

    invoke-static {v2, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v2, p2}, Lq8/d;->U1(LO7/u;Ljava/lang/StringBuilder;)Z

    const-string v2, "constructor"

    invoke-direct {p0, v2}, Lq8/d;->k1(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v1}, LO7/a;->n()Ljava/util/List;

    move-result-object v2

    const-string v3, "getValueParameters(...)"

    invoke-static {v2, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v1}, LO7/a;->L()Z

    move-result v1

    invoke-direct {p0, v2, v1, p2}, Lq8/d;->S1(Ljava/util/Collection;ZLjava/lang/StringBuilder;)V

    :cond_e
    invoke-direct {p0, p1, p2}, Lq8/d;->F1(LO7/e;Ljava/lang/StringBuilder;)V

    invoke-direct {p0, v0, p2}, Lq8/d;->V1(Ljava/util/List;Ljava/lang/StringBuilder;)V

    return-void
.end method

.method private final W1(LF8/E;)Z
    .locals 1

    .prologue
    invoke-static {p1}, LL7/f;->p(LF8/E;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, LF8/E;->U0()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    instance-of v0, p1, Ljava/util/Collection;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF8/i0;

    invoke-interface {v0}, LF8/i0;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    goto :goto_2

    :cond_3
    :goto_1
    const/4 p1, 0x0

    :goto_2
    return p1
.end method

.method private final X()Lq8/d;
    .locals 1

    iget-object v0, p0, Lq8/d;->m:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq8/d;

    return-object v0
.end method

.method private final X0(LO7/e;Ljava/lang/StringBuilder;)V
    .locals 1

    sget-object v0, Lq8/c;->a:Lq8/c$k;

    invoke-virtual {v0, p1}, Lq8/c$k;->a(LO7/i;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lq8/d;->k1(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method private final X1(Z)Z
    .locals 4

    .prologue
    invoke-virtual {p0}, Lq8/d;->h0()Lq8/k;

    move-result-object v0

    sget-object v1, Lq8/d$b;->b:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-eq v0, v2, :cond_2

    const/4 p1, 0x3

    if-ne v0, p1, :cond_1

    :cond_0
    move v1, v3

    goto :goto_0

    :cond_1
    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1

    :cond_2
    if-nez p1, :cond_0

    :cond_3
    :goto_0
    return v1
.end method

.method private final Z0(LO7/m;Ljava/lang/StringBuilder;)V
    .locals 3

    .prologue
    invoke-virtual {p0}, Lq8/d;->m0()Z

    move-result v0

    const-string v1, "getName(...)"

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lq8/d;->x0()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "companion object"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    invoke-direct {p0, p2}, Lq8/d;->E1(Ljava/lang/StringBuilder;)V

    invoke-interface {p1}, LO7/m;->b()LO7/m;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v2, "of "

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v0}, LO7/I;->getName()Ln8/f;

    move-result-object v0

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v2}, Lq8/d;->v(Ln8/f;Z)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    invoke-virtual {p0}, Lq8/d;->D0()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-interface {p1}, LO7/I;->getName()Ln8/f;

    move-result-object v0

    sget-object v2, Ln8/h;->d:Ln8/f;

    invoke-static {v0, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    :cond_2
    invoke-virtual {p0}, Lq8/d;->x0()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-direct {p0, p2}, Lq8/d;->E1(Ljava/lang/StringBuilder;)V

    :cond_3
    invoke-interface {p1}, LO7/I;->getName()Ln8/f;

    move-result-object p1

    invoke-static {p1, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lq8/d;->v(Ln8/f;Z)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    return-void
.end method

.method private final a1(Lt8/g;)Ljava/lang/String;
    .locals 9

    .prologue
    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0}, Lq8/g;->M()Lx7/l;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1

    :cond_0
    instance-of v0, p1, Lt8/b;

    if-eqz v0, :cond_3

    check-cast p1, Lt8/b;

    invoke-virtual {p1}, Lt8/g;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt8/g;

    invoke-direct {p0, v1}, Lq8/d;->a1(Lt8/g;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    const/16 v7, 0x38

    const/4 v8, 0x0

    const-string v1, ", "

    const-string v2, "{"

    const-string v3, "}"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v0 .. v8}, Lj7/v;->r0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lx7/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto/16 :goto_2

    :cond_3
    instance-of v0, p1, Lt8/a;

    if-eqz v0, :cond_4

    check-cast p1, Lt8/a;

    invoke-virtual {p1}, Lt8/g;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LP7/c;

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p0, p1, v1, v0, v1}, Lq8/c;->s(Lq8/c;LP7/c;LP7/e;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "@"

    invoke-static {p1, v0}, LS8/r;->J0(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    goto/16 :goto_2

    :cond_4
    instance-of v0, p1, Lt8/p;

    if-eqz v0, :cond_8

    check-cast p1, Lt8/p;

    invoke-virtual {p1}, Lt8/g;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lt8/p$b;

    instance-of v0, p1, Lt8/p$b$a;

    const-string v1, "::class"

    if-eqz v0, :cond_5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    check-cast p1, Lt8/p$b$a;

    invoke-virtual {p1}, Lt8/p$b$a;->a()LF8/E;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_5
    instance-of v0, p1, Lt8/p$b$b;

    if-eqz v0, :cond_7

    check-cast p1, Lt8/p$b$b;

    invoke-virtual {p1}, Lt8/p$b$b;->b()Ln8/b;

    move-result-object v0

    invoke-virtual {v0}, Ln8/b;->b()Ln8/c;

    move-result-object v0

    invoke-virtual {v0}, Ln8/c;->b()Ljava/lang/String;

    move-result-object v0

    const-string v2, "asString(...)"

    invoke-static {v0, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lt8/p$b$b;->a()I

    move-result p1

    const/4 v2, 0x0

    :goto_1
    if-ge v2, p1, :cond_6

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "kotlin.Array<"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x3e

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_6
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_7
    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1

    :cond_8
    invoke-virtual {p1}, Lt8/g;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_2
    return-object p1
.end method

.method private final b1(LO7/l;Ljava/lang/StringBuilder;)V
    .locals 17

    .prologue
    move-object/from16 v6, p0

    move-object/from16 v7, p2

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p1

    invoke-static/range {v0 .. v5}, Lq8/d;->U0(Lq8/d;Ljava/lang/StringBuilder;LP7/a;LP7/e;ILjava/lang/Object;)V

    iget-object v0, v6, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0}, Lq8/g;->T()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    invoke-interface/range {p1 .. p1}, LO7/l;->H()LO7/e;

    move-result-object v0

    invoke-interface {v0}, LO7/e;->q()LO7/D;

    move-result-object v0

    sget-object v3, LO7/D;->E:LO7/D;

    if-eq v0, v3, :cond_1

    :cond_0
    invoke-interface/range {p1 .. p1}, LO7/C;->h()LO7/u;

    move-result-object v0

    const-string v3, "getVisibility(...)"

    invoke-static {v0, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v6, v0, v7}, Lq8/d;->U1(LO7/u;Ljava/lang/StringBuilder;)Z

    move-result v0

    if-eqz v0, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    invoke-direct/range {p0 .. p2}, Lq8/d;->l1(LO7/b;Ljava/lang/StringBuilder;)V

    invoke-virtual/range {p0 .. p0}, Lq8/d;->o0()Z

    move-result v3

    if-nez v3, :cond_3

    invoke-interface/range {p1 .. p1}, LO7/l;->G()Z

    move-result v3

    if-eqz v3, :cond_3

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    move v0, v1

    goto :goto_2

    :cond_3
    :goto_1
    move v0, v2

    :goto_2
    if-eqz v0, :cond_4

    const-string v3, "constructor"

    invoke-direct {v6, v3}, Lq8/d;->k1(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    invoke-interface/range {p1 .. p1}, LO7/l;->b()LO7/i;

    move-result-object v3

    const-string v4, "getContainingDeclaration(...)"

    invoke-static {v3, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lq8/d;->v0()Z

    move-result v4

    const-string v5, "getTypeParameters(...)"

    if-eqz v4, :cond_6

    if-eqz v0, :cond_5

    const-string v0, " "

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    invoke-direct {v6, v3, v7, v2}, Lq8/d;->r1(LO7/m;Ljava/lang/StringBuilder;Z)V

    invoke-interface/range {p1 .. p1}, LO7/l;->g()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v5}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v6, v0, v7, v1}, Lq8/d;->O1(Ljava/util/List;Ljava/lang/StringBuilder;Z)V

    :cond_6
    invoke-interface/range {p1 .. p1}, LO7/a;->n()Ljava/util/List;

    move-result-object v0

    const-string v1, "getValueParameters(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/Collection;

    invoke-interface/range {p1 .. p1}, LO7/a;->L()Z

    move-result v4

    invoke-direct {v6, v0, v4, v7}, Lq8/d;->S1(Ljava/util/Collection;ZLjava/lang/StringBuilder;)V

    invoke-virtual/range {p0 .. p0}, Lq8/d;->n0()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface/range {p1 .. p1}, LO7/l;->G()Z

    move-result v0

    if-nez v0, :cond_9

    instance-of v0, v3, LO7/e;

    if-eqz v0, :cond_9

    check-cast v3, LO7/e;

    invoke-interface {v3}, LO7/e;->X()LO7/d;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-interface {v0}, LO7/a;->n()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_7
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, LO7/j0;

    invoke-interface {v3}, LO7/j0;->D0()Z

    move-result v4

    if-nez v4, :cond_7

    invoke-interface {v3}, LO7/j0;->u0()LF8/E;

    move-result-object v3

    if-nez v3, :cond_7

    invoke-interface {v8, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_8
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/2addr v0, v2

    if-eqz v0, :cond_9

    const-string v0, " : "

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "this"

    invoke-direct {v6, v0}, Lq8/d;->k1(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v14, Lq8/d$e;->D:Lq8/d$e;

    const/16 v15, 0x18

    const/16 v16, 0x0

    const-string v9, ", "

    const-string v10, "("

    const-string v11, ")"

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v8 .. v16}, Lj7/v;->r0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lx7/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_9
    invoke-virtual/range {p0 .. p0}, Lq8/d;->v0()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface/range {p1 .. p1}, LO7/l;->g()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v5}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v6, v0, v7}, Lq8/d;->V1(Ljava/util/List;Ljava/lang/StringBuilder;)V

    :cond_a
    return-void
.end method

.method private final c1(Ljava/util/List;Ljava/lang/StringBuilder;)V
    .locals 5

    .prologue
    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    const-string v0, "context("

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    add-int/lit8 v2, v1, 0x1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LO7/X;

    sget-object v4, LP7/e;->I:LP7/e;

    invoke-direct {p0, p2, v3, v4}, Lq8/d;->T0(Ljava/lang/StringBuilder;LP7/a;LP7/e;)V

    invoke-interface {v3}, LO7/i0;->getType()LF8/E;

    move-result-object v3

    const-string v4, "getType(...)"

    invoke-static {v3, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v3}, Lq8/d;->f1(LF8/E;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lj7/v;->o(Ljava/util/List;)I

    move-result v3

    if-ne v1, v3, :cond_0

    const-string v1, ") "

    :goto_1
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_0
    const-string v1, ", "

    goto :goto_1

    :goto_2
    move v1, v2

    goto :goto_0

    :cond_1
    return-void
.end method

.method private final d1(Ljava/lang/StringBuilder;LF8/E;)V
    .locals 7

    .prologue
    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v0 .. v5}, Lq8/d;->U0(Lq8/d;Ljava/lang/StringBuilder;LP7/a;LP7/e;ILjava/lang/Object;)V

    instance-of v0, p2, LF8/o;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LF8/o;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, LF8/o;->i1()LF8/M;

    :cond_1
    invoke-static {p2}, LF8/G;->a(LF8/E;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {p2}, LK8/a;->u(LF8/E;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lq8/d;->j0()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, LH8/k;->a:LH8/k;

    invoke-virtual {v0, p2}, LH8/k;->p(LF8/E;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lq8/d;->e1(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_4

    :cond_2
    instance-of v0, p2, LH8/h;

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lq8/d;->c0()Z

    move-result v0

    if-nez v0, :cond_3

    move-object v0, p2

    check-cast v0, LH8/h;

    invoke-virtual {v0}, LH8/h;->f1()Ljava/lang/String;

    move-result-object v0

    :goto_2
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_3
    invoke-virtual {p2}, LF8/E;->W0()LF8/e0;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :goto_3
    invoke-virtual {p2}, LF8/E;->U0()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lq8/d;->I1(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_4
    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lq8/d;->L1(Lq8/d;Ljava/lang/StringBuilder;LF8/E;LF8/e0;ILjava/lang/Object;)V

    :goto_4
    invoke-virtual {p2}, LF8/E;->X0()Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "?"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    invoke-static {p2}, LF8/Q;->c(LF8/E;)Z

    move-result p2

    if-eqz p2, :cond_6

    const-string p2, " & Any"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_6
    return-void
.end method

.method private final e1(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    invoke-virtual {p0}, Lq8/d;->y0()Lq8/m;

    move-result-object v0

    sget-object v1, Lq8/d$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "<font color=red><b>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "</b></font>"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1

    :cond_1
    :goto_0
    return-object p1
.end method

.method private final f1(LF8/E;)Ljava/lang/String;
    .locals 2

    .prologue
    invoke-virtual {p0, p1}, Lq8/d;->w(LF8/E;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1}, Lq8/d;->W1(LF8/E;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p1}, LF8/q0;->l(LF8/E;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    instance-of p1, p1, LF8/o;

    if-eqz p1, :cond_2

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x28

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x29

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_2
    return-object v0
.end method

.method private final g1(Ljava/util/List;)Ljava/lang/String;
    .locals 0

    invoke-static {p1}, Lq8/n;->c(Ljava/util/List;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lq8/d;->N(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private final h1(LO7/y;Ljava/lang/StringBuilder;)V
    .locals 9

    .prologue
    invoke-virtual {p0}, Lq8/d;->x0()Z

    move-result v0

    const/4 v1, 0x1

    const-string v2, "getTypeParameters(...)"

    if-nez v0, :cond_4

    invoke-virtual {p0}, Lq8/d;->w0()Z

    move-result v0

    if-nez v0, :cond_3

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v3, p0

    move-object v4, p2

    move-object v5, p1

    invoke-static/range {v3 .. v8}, Lq8/d;->U0(Lq8/d;Ljava/lang/StringBuilder;LP7/a;LP7/e;ILjava/lang/Object;)V

    invoke-interface {p1}, LO7/a;->A0()Ljava/util/List;

    move-result-object v0

    const-string v3, "getContextReceiverParameters(...)"

    invoke-static {v0, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0, p2}, Lq8/d;->c1(Ljava/util/List;Ljava/lang/StringBuilder;)V

    invoke-interface {p1}, LO7/C;->h()LO7/u;

    move-result-object v0

    const-string v3, "getVisibility(...)"

    invoke-static {v0, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0, p2}, Lq8/d;->U1(LO7/u;Ljava/lang/StringBuilder;)Z

    invoke-direct {p0, p1, p2}, Lq8/d;->p1(LO7/b;Ljava/lang/StringBuilder;)V

    invoke-virtual {p0}, Lq8/d;->Y()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, p2}, Lq8/d;->m1(LO7/C;Ljava/lang/StringBuilder;)V

    :cond_0
    invoke-direct {p0, p1, p2}, Lq8/d;->u1(LO7/b;Ljava/lang/StringBuilder;)V

    invoke-virtual {p0}, Lq8/d;->Y()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0, p1, p2}, Lq8/d;->R0(LO7/y;Ljava/lang/StringBuilder;)V

    goto :goto_0

    :cond_1
    invoke-direct {p0, p1, p2}, Lq8/d;->G1(LO7/y;Ljava/lang/StringBuilder;)V

    :goto_0
    invoke-direct {p0, p1, p2}, Lq8/d;->l1(LO7/b;Ljava/lang/StringBuilder;)V

    invoke-virtual {p0}, Lq8/d;->D0()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, LO7/y;->F0()Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "/*isHiddenToOvercomeSignatureClash*/ "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    invoke-interface {p1}, LO7/y;->L0()Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "/*isHiddenForResolutionEverywhereBesideSupercalls*/ "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    const-string v0, "fun"

    invoke-direct {p0, v0}, Lq8/d;->k1(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, LO7/a;->g()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0, p2, v1}, Lq8/d;->O1(Ljava/util/List;Ljava/lang/StringBuilder;Z)V

    invoke-direct {p0, p1, p2}, Lq8/d;->B1(LO7/a;Ljava/lang/StringBuilder;)V

    :cond_4
    invoke-direct {p0, p1, p2, v1}, Lq8/d;->r1(LO7/m;Ljava/lang/StringBuilder;Z)V

    invoke-interface {p1}, LO7/a;->n()Ljava/util/List;

    move-result-object v0

    const-string v1, "getValueParameters(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/Collection;

    invoke-interface {p1}, LO7/a;->L()Z

    move-result v1

    invoke-direct {p0, v0, v1, p2}, Lq8/d;->S1(Ljava/util/Collection;ZLjava/lang/StringBuilder;)V

    invoke-direct {p0, p1, p2}, Lq8/d;->C1(LO7/a;Ljava/lang/StringBuilder;)V

    invoke-interface {p1}, LO7/a;->l()LF8/E;

    move-result-object v0

    invoke-virtual {p0}, Lq8/d;->G0()Z

    move-result v1

    if-nez v1, :cond_7

    invoke-virtual {p0}, Lq8/d;->B0()Z

    move-result v1

    if-nez v1, :cond_5

    if-eqz v0, :cond_5

    invoke-static {v0}, LL7/g;->C0(LF8/E;)Z

    move-result v1

    if-nez v1, :cond_7

    :cond_5
    const-string v1, ": "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez v0, :cond_6

    const-string v0, "[NULL]"

    goto :goto_1

    :cond_6
    invoke-virtual {p0, v0}, Lq8/d;->w(LF8/E;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_7
    invoke-interface {p1}, LO7/a;->g()Ljava/util/List;

    move-result-object p1

    invoke-static {p1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lq8/d;->V1(Ljava/util/List;Ljava/lang/StringBuilder;)V

    return-void
.end method

.method private final i1(Ljava/lang/StringBuilder;LF8/E;)V
    .locals 11

    .prologue
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    invoke-direct {p0}, Lq8/d;->X()Lq8/d;

    move-result-object v1

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lq8/d;->U0(Lq8/d;Ljava/lang/StringBuilder;LP7/a;LP7/e;ILjava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v1, v0, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    invoke-static {p2}, LL7/f;->k(LF8/E;)LF8/E;

    move-result-object v4

    invoke-static {p2}, LL7/f;->e(LF8/E;)Ljava/util/List;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    xor-int/2addr v6, v3

    const-string v7, ") "

    const-string v8, ", "

    if-eqz v6, :cond_2

    const-string v6, "context("

    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v5}, Lj7/v;->o(Ljava/util/List;)I

    move-result v6

    invoke-interface {v5, v2, v6}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LF8/E;

    invoke-direct {p0, p1, v9}, Lq8/d;->s1(Ljava/lang/StringBuilder;LF8/E;)V

    invoke-virtual {p1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    invoke-static {v5}, Lj7/v;->t0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LF8/E;

    invoke-direct {p0, p1, v5}, Lq8/d;->s1(Ljava/lang/StringBuilder;LF8/E;)V

    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    invoke-static {p2}, LL7/f;->r(LF8/E;)Z

    move-result v5

    invoke-virtual {p2}, LF8/E;->X0()Z

    move-result v6

    if-nez v6, :cond_4

    if-eqz v1, :cond_3

    if-eqz v4, :cond_3

    goto :goto_2

    :cond_3
    move v9, v2

    goto :goto_3

    :cond_4
    :goto_2
    move v9, v3

    :goto_3
    const-string v10, "("

    if-eqz v9, :cond_7

    if-eqz v5, :cond_5

    const/16 v1, 0x28

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->insert(IC)Ljava/lang/StringBuilder;

    goto :goto_4

    :cond_5
    if-eqz v1, :cond_6

    invoke-static {p1}, LS8/r;->z1(Ljava/lang/CharSequence;)C

    move-result v0

    invoke-static {v0}, LS8/a;->c(C)Z

    invoke-static {p1}, LS8/r;->j0(Ljava/lang/CharSequence;)I

    move-result v0

    sub-int/2addr v0, v3

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result v0

    const/16 v1, 0x29

    if-eq v0, v1, :cond_6

    invoke-static {p1}, LS8/r;->j0(Ljava/lang/CharSequence;)I

    move-result v0

    const-string v1, "()"

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    :cond_6
    invoke-virtual {p1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_7
    :goto_4
    const-string v0, "suspend"

    invoke-direct {p0, p1, v5, v0}, Lq8/d;->q1(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    const-string v0, ")"

    if-eqz v4, :cond_d

    invoke-direct {p0, v4}, Lq8/d;->W1(LF8/E;)Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-virtual {v4}, LF8/E;->X0()Z

    move-result v1

    if-eqz v1, :cond_a

    :cond_8
    invoke-direct {p0, v4}, Lq8/d;->K0(LF8/E;)Z

    move-result v1

    if-nez v1, :cond_a

    instance-of v1, v4, LF8/o;

    if-eqz v1, :cond_9

    goto :goto_5

    :cond_9
    move v1, v2

    goto :goto_6

    :cond_a
    :goto_5
    move v1, v3

    :goto_6
    if-eqz v1, :cond_b

    invoke-virtual {p1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_b
    invoke-direct {p0, p1, v4}, Lq8/d;->s1(Ljava/lang/StringBuilder;LF8/E;)V

    if-eqz v1, :cond_c

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_c
    const-string v1, "."

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_d
    invoke-virtual {p1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, LL7/f;->n(LF8/E;)Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-virtual {p2}, LF8/E;->U0()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-gt v1, v3, :cond_e

    const-string v1, "???"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_9

    :cond_e
    invoke-static {p2}, LL7/f;->m(LF8/E;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move v3, v2

    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_12

    add-int/lit8 v4, v3, 0x1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LF8/i0;

    if-lez v3, :cond_f

    invoke-virtual {p1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_f
    invoke-virtual {p0}, Lq8/d;->i0()Z

    move-result v3

    if-eqz v3, :cond_10

    invoke-interface {v5}, LF8/i0;->getType()LF8/E;

    move-result-object v3

    const-string v10, "getType(...)"

    invoke-static {v3, v10}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, LL7/f;->d(LF8/E;)Ln8/f;

    move-result-object v3

    goto :goto_8

    :cond_10
    const/4 v3, 0x0

    :goto_8
    if-eqz v3, :cond_11

    invoke-virtual {p0, v3, v2}, Lq8/d;->v(Ln8/f;Z)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ": "

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_11
    invoke-virtual {p0, v5}, Lq8/d;->x(LF8/i0;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move v3, v4

    goto :goto_7

    :cond_12
    :goto_9
    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lq8/d;->M()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, LL7/f;->l(LF8/E;)LF8/E;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lq8/d;->s1(Ljava/lang/StringBuilder;LF8/E;)V

    if-eqz v9, :cond_13

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_13
    if-eqz v6, :cond_14

    const-string p2, "?"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_14
    return-void
.end method

.method private final j1(LO7/k0;Ljava/lang/StringBuilder;)V
    .locals 1

    .prologue
    invoke-virtual {p0}, Lq8/d;->b0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, LO7/k0;->d0()Lt8/g;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-direct {p0, p1}, Lq8/d;->a1(Lt8/g;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string v0, " = "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0, p1}, Lq8/d;->N(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    return-void
.end method

.method private final k1(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    invoke-virtual {p0}, Lq8/d;->y0()Lq8/m;

    move-result-object v0

    sget-object v1, Lq8/d$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Lq8/d;->R()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "<b>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "</b>"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1

    :cond_2
    :goto_0
    return-object p1
.end method

.method private final l1(LO7/b;Ljava/lang/StringBuilder;)V
    .locals 2

    .prologue
    invoke-virtual {p0}, Lq8/d;->d0()Ljava/util/Set;

    move-result-object v0

    sget-object v1, Lq8/e;->L:Lq8/e;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lq8/d;->D0()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, LO7/b;->j()LO7/b$a;

    move-result-object v0

    sget-object v1, LO7/b$a;->C:LO7/b$a;

    if-eq v0, v1, :cond_1

    const-string v0, "/*"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, LO7/b;->j()LO7/b$a;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LN8/a;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "*/ "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    return-void
.end method

.method private final m1(LO7/C;Ljava/lang/StringBuilder;)V
    .locals 4

    .prologue
    invoke-interface {p1}, LO7/C;->C()Z

    move-result v0

    const-string v1, "external"

    invoke-direct {p0, p2, v0, v1}, Lq8/d;->q1(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    invoke-virtual {p0}, Lq8/d;->d0()Ljava/util/Set;

    move-result-object v0

    sget-object v1, Lq8/e;->O:Lq8/e;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    invoke-interface {p1}, LO7/C;->R()Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    const-string v3, "expect"

    invoke-direct {p0, p2, v0, v3}, Lq8/d;->q1(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    invoke-virtual {p0}, Lq8/d;->d0()Ljava/util/Set;

    move-result-object v0

    sget-object v3, Lq8/e;->P:Lq8/e;

    invoke-interface {v0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, LO7/C;->N0()Z

    move-result p1

    if-eqz p1, :cond_1

    move v1, v2

    :cond_1
    const-string p1, "actual"

    invoke-direct {p0, p2, v1, p1}, Lq8/d;->q1(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    return-void
.end method

.method private final o1(LO7/D;Ljava/lang/StringBuilder;LO7/D;)V
    .locals 1

    .prologue
    invoke-virtual {p0}, Lq8/d;->q0()Z

    move-result v0

    if-nez v0, :cond_0

    if-ne p1, p3, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lq8/d;->d0()Ljava/util/Set;

    move-result-object p3

    sget-object v0, Lq8/e;->H:Lq8/e;

    invoke-interface {p3, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p3

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LN8/a;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p2, p3, p1}, Lq8/d;->q1(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    return-void
.end method

.method private final p1(LO7/b;Ljava/lang/StringBuilder;)V
    .locals 2

    .prologue
    invoke-static {p1}, Lr8/f;->J(LO7/m;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, LO7/C;->q()LO7/D;

    move-result-object v0

    sget-object v1, LO7/D;->D:LO7/D;

    if-eq v0, v1, :cond_2

    :cond_0
    invoke-virtual {p0}, Lq8/d;->g0()Lq8/j;

    move-result-object v0

    sget-object v1, Lq8/j;->C:Lq8/j;

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LO7/C;->q()LO7/D;

    move-result-object v0

    sget-object v1, LO7/D;->F:LO7/D;

    if-ne v0, v1, :cond_1

    invoke-direct {p0, p1}, Lq8/d;->O0(LO7/b;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    invoke-interface {p1}, LO7/C;->q()LO7/D;

    move-result-object v0

    const-string v1, "getModality(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lq8/d;->L0(LO7/C;)LO7/D;

    move-result-object p1

    invoke-direct {p0, v0, p2, p1}, Lq8/d;->o1(LO7/D;Ljava/lang/StringBuilder;LO7/D;)V

    :cond_2
    return-void
.end method

.method private final q1(Ljava/lang/StringBuilder;ZLjava/lang/String;)V
    .locals 0

    .prologue
    if-eqz p2, :cond_0

    invoke-direct {p0, p3}, Lq8/d;->k1(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    return-void
.end method

.method private final r1(LO7/m;Ljava/lang/StringBuilder;Z)V
    .locals 1

    invoke-interface {p1}, LO7/I;->getName()Ln8/f;

    move-result-object p1

    const-string v0, "getName(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p3}, Lq8/d;->v(Ln8/f;Z)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method private final s1(Ljava/lang/StringBuilder;LF8/E;)V
    .locals 2

    .prologue
    invoke-virtual {p2}, LF8/E;->Z0()LF8/t0;

    move-result-object v0

    instance-of v1, v0, LF8/a;

    if-eqz v1, :cond_0

    check-cast v0, LF8/a;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lq8/d;->t0()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {v0}, LF8/a;->c0()LF8/M;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lq8/d;->t1(Ljava/lang/StringBuilder;LF8/E;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, LF8/a;->i1()LF8/M;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lq8/d;->t1(Ljava/lang/StringBuilder;LF8/E;)V

    invoke-virtual {p0}, Lq8/d;->u0()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-direct {p0, p1, v0}, Lq8/d;->P0(Ljava/lang/StringBuilder;LF8/a;)V

    :cond_2
    :goto_1
    return-void

    :cond_3
    invoke-direct {p0, p1, p2}, Lq8/d;->t1(Ljava/lang/StringBuilder;LF8/E;)V

    return-void
.end method

.method private final t1(Ljava/lang/StringBuilder;LF8/E;)V
    .locals 1

    .prologue
    instance-of v0, p2, LF8/v0;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lq8/d;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LF8/v0;

    invoke-virtual {v0}, LF8/v0;->b1()Z

    move-result v0

    if-nez v0, :cond_0

    const-string p2, "<Not computed yet>"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    :cond_0
    invoke-virtual {p2}, LF8/E;->Z0()LF8/t0;

    move-result-object p2

    instance-of v0, p2, LF8/y;

    if-eqz v0, :cond_1

    check-cast p2, LF8/y;

    invoke-virtual {p2, p0, p0}, LF8/y;->g1(Lq8/c;Lq8/f;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    instance-of v0, p2, LF8/M;

    if-eqz v0, :cond_2

    check-cast p2, LF8/M;

    invoke-direct {p0, p1, p2}, Lq8/d;->D1(Ljava/lang/StringBuilder;LF8/M;)V

    :cond_2
    :goto_0
    return-void
.end method

.method private final u1(LO7/b;Ljava/lang/StringBuilder;)V
    .locals 2

    .prologue
    invoke-virtual {p0}, Lq8/d;->d0()Ljava/util/Set;

    move-result-object v0

    sget-object v1, Lq8/e;->I:Lq8/e;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0, p1}, Lq8/d;->O0(LO7/b;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lq8/d;->g0()Lq8/j;

    move-result-object v0

    sget-object v1, Lq8/j;->D:Lq8/j;

    if-eq v0, v1, :cond_1

    const/4 v0, 0x1

    const-string v1, "override"

    invoke-direct {p0, p2, v0, v1}, Lq8/d;->q1(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    invoke-virtual {p0}, Lq8/d;->D0()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "/*"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, LO7/b;->f()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "*/ "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    return-void
.end method

.method private final v1(LO7/K;Ljava/lang/StringBuilder;)V
    .locals 2

    .prologue
    invoke-interface {p1}, LO7/K;->e()Ln8/c;

    move-result-object v0

    const-string v1, "package-fragment"

    invoke-direct {p0, v0, v1, p2}, Lq8/d;->w1(Ln8/c;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    invoke-virtual {p0}, Lq8/d;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, " in "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, LO7/K;->b()LO7/G;

    move-result-object p1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lq8/d;->r1(LO7/m;Ljava/lang/StringBuilder;Z)V

    :cond_0
    return-void
.end method

.method private final w1(Ln8/c;Ljava/lang/String;Ljava/lang/StringBuilder;)V
    .locals 0

    .prologue
    invoke-direct {p0, p2}, Lq8/d;->k1(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ln8/c;->j()Ln8/d;

    move-result-object p1

    const-string p2, "toUnsafe(...)"

    invoke-static {p1, p2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lq8/d;->u(Ln8/d;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p2

    if-lez p2, :cond_0

    const-string p2, " "

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    return-void
.end method

.method private final x1(LO7/P;Ljava/lang/StringBuilder;)V
    .locals 2

    .prologue
    invoke-interface {p1}, LO7/P;->e()Ln8/c;

    move-result-object v0

    const-string v1, "package"

    invoke-direct {p0, v0, v1, p2}, Lq8/d;->w1(Ln8/c;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    invoke-virtual {p0}, Lq8/d;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, " in context of "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, LO7/P;->E0()LO7/G;

    move-result-object p1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lq8/d;->r1(LO7/m;Ljava/lang/StringBuilder;Z)V

    :cond_0
    return-void
.end method

.method private final y1(Ljava/lang/StringBuilder;LO7/S;)V
    .locals 2

    .prologue
    invoke-virtual {p2}, LO7/S;->c()LO7/S;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, v0}, Lq8/d;->y1(Ljava/lang/StringBuilder;LO7/S;)V

    const/16 v0, 0x2e

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, LO7/S;->b()LO7/i;

    move-result-object v0

    invoke-interface {v0}, LO7/I;->getName()Ln8/f;

    move-result-object v0

    const-string v1, "getName(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lq8/d;->v(Ln8/f;Z)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, LO7/S;->b()LO7/i;

    move-result-object v0

    invoke-interface {v0}, LO7/h;->p()LF8/e0;

    move-result-object v0

    const-string v1, "getTypeConstructor(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lq8/d;->J1(LF8/e0;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, LO7/S;->a()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p2}, Lq8/d;->I1(Ljava/util/List;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public static final synthetic z(Lq8/d;LO7/T;Ljava/lang/StringBuilder;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lq8/d;->Q0(LO7/T;Ljava/lang/StringBuilder;)V

    return-void
.end method

.method private final z1(LO7/U;Ljava/lang/StringBuilder;)V
    .locals 10

    .prologue
    invoke-virtual {p0}, Lq8/d;->x0()Z

    move-result v0

    const-string v1, "getTypeParameters(...)"

    const/4 v2, 0x1

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lq8/d;->w0()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-direct {p0, p1, p2}, Lq8/d;->A1(LO7/U;Ljava/lang/StringBuilder;)V

    invoke-interface {p1}, LO7/a;->A0()Ljava/util/List;

    move-result-object v0

    const-string v3, "getContextReceiverParameters(...)"

    invoke-static {v0, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0, p2}, Lq8/d;->c1(Ljava/util/List;Ljava/lang/StringBuilder;)V

    invoke-interface {p1}, LO7/C;->h()LO7/u;

    move-result-object v0

    const-string v3, "getVisibility(...)"

    invoke-static {v0, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0, p2}, Lq8/d;->U1(LO7/u;Ljava/lang/StringBuilder;)Z

    invoke-virtual {p0}, Lq8/d;->d0()Ljava/util/Set;

    move-result-object v0

    sget-object v3, Lq8/e;->Q:Lq8/e;

    invoke-interface {v0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    invoke-interface {p1}, LO7/k0;->F()Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    const-string v4, "const"

    invoke-direct {p0, p2, v0, v4}, Lq8/d;->q1(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lq8/d;->m1(LO7/C;Ljava/lang/StringBuilder;)V

    invoke-direct {p0, p1, p2}, Lq8/d;->p1(LO7/b;Ljava/lang/StringBuilder;)V

    invoke-direct {p0, p1, p2}, Lq8/d;->u1(LO7/b;Ljava/lang/StringBuilder;)V

    invoke-virtual {p0}, Lq8/d;->d0()Ljava/util/Set;

    move-result-object v0

    sget-object v4, Lq8/e;->R:Lq8/e;

    invoke-interface {v0, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, LO7/k0;->B0()Z

    move-result v0

    if-eqz v0, :cond_1

    move v3, v2

    :cond_1
    const-string v0, "lateinit"

    invoke-direct {p0, p2, v3, v0}, Lq8/d;->q1(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lq8/d;->l1(LO7/b;Ljava/lang/StringBuilder;)V

    :cond_2
    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v4, p0

    move-object v5, p1

    move-object v6, p2

    invoke-static/range {v4 .. v9}, Lq8/d;->Q1(Lq8/d;LO7/k0;Ljava/lang/StringBuilder;ZILjava/lang/Object;)V

    invoke-interface {p1}, LO7/a;->g()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0, p2, v2}, Lq8/d;->O1(Ljava/util/List;Ljava/lang/StringBuilder;Z)V

    invoke-direct {p0, p1, p2}, Lq8/d;->B1(LO7/a;Ljava/lang/StringBuilder;)V

    :cond_3
    invoke-direct {p0, p1, p2, v2}, Lq8/d;->r1(LO7/m;Ljava/lang/StringBuilder;Z)V

    const-string v0, ": "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, LO7/i0;->getType()LF8/E;

    move-result-object v0

    const-string v2, "getType(...)"

    invoke-static {v0, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lq8/d;->w(LF8/E;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0, p1, p2}, Lq8/d;->C1(LO7/a;Ljava/lang/StringBuilder;)V

    invoke-direct {p0, p1, p2}, Lq8/d;->j1(LO7/k0;Ljava/lang/StringBuilder;)V

    invoke-interface {p1}, LO7/a;->g()Ljava/util/List;

    move-result-object p1

    invoke-static {p1, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lq8/d;->V1(Ljava/util/List;Ljava/lang/StringBuilder;)V

    return-void
.end method


# virtual methods
.method public A0()Z
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0}, Lq8/g;->c0()Z

    move-result v0

    return v0
.end method

.method public B0()Z
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0}, Lq8/g;->d0()Z

    move-result v0

    return v0
.end method

.method public C0()Lq8/c$l;
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0}, Lq8/g;->e0()Lq8/c$l;

    move-result-object v0

    return-object v0
.end method

.method public D0()Z
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0}, Lq8/g;->f0()Z

    move-result v0

    return v0
.end method

.method public E0()Z
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0}, Lq8/g;->g0()Z

    move-result v0

    return v0
.end method

.method public F0()Z
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0}, Lq8/g;->h0()Z

    move-result v0

    return v0
.end method

.method public G0()Z
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0}, Lq8/g;->i0()Z

    move-result v0

    return v0
.end method

.method public H0()Z
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0}, Lq8/g;->j0()Z

    move-result v0

    return v0
.end method

.method public I0()Z
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0}, Lq8/g;->k0()Z

    move-result v0

    return v0
.end method

.method public I1(Ljava/util/List;)Ljava/lang/String;
    .locals 2

    .prologue
    const-string v0, "typeArguments"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, ""

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0}, Lq8/d;->N0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0, v0, p1}, Lq8/d;->L(Ljava/lang/StringBuilder;Ljava/util/List;)V

    invoke-direct {p0}, Lq8/d;->J0()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "toString(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1
.end method

.method public J1(LF8/e0;)Ljava/lang/String;
    .locals 3

    .prologue
    const-string v0, "typeConstructor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LF8/e0;->w()LO7/h;

    move-result-object v0

    instance-of v1, v0, LO7/f0;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    instance-of v1, v0, LO7/e;

    :goto_0
    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    instance-of v2, v0, LO7/e0;

    :goto_1
    if-eqz v2, :cond_2

    invoke-virtual {p0, v0}, Lq8/d;->Y0(LO7/h;)Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_2
    if-nez v0, :cond_4

    instance-of v0, p1, LF8/D;

    if-eqz v0, :cond_3

    check-cast p1, LF8/D;

    sget-object v0, Lq8/d$g;->D:Lq8/d$g;

    invoke-virtual {p1, v0}, LF8/D;->e(Lx7/l;)Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_2
    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected classifier: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public O()Z
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0}, Lq8/g;->r()Z

    move-result v0

    return v0
.end method

.method public P()Z
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0}, Lq8/g;->s()Z

    move-result v0

    return v0
.end method

.method public Q()Lx7/l;
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0}, Lq8/g;->t()Lx7/l;

    move-result-object v0

    return-object v0
.end method

.method public R()Z
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0}, Lq8/g;->u()Z

    move-result v0

    return v0
.end method

.method public S()Z
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0}, Lq8/g;->v()Z

    move-result v0

    return v0
.end method

.method public T()Lq8/b;
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0}, Lq8/g;->w()Lq8/b;

    move-result-object v0

    return-object v0
.end method

.method public U()Lx7/l;
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0}, Lq8/g;->x()Lx7/l;

    move-result-object v0

    return-object v0
.end method

.method public V()Z
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0}, Lq8/g;->y()Z

    move-result v0

    return v0
.end method

.method public W()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0}, Lq8/g;->z()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public Y()Z
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0}, Lq8/g;->A()Z

    move-result v0

    return v0
.end method

.method public Y0(LO7/h;)Ljava/lang/String;
    .locals 1

    .prologue
    const-string v0, "klass"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LH8/k;->m(LO7/m;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, LO7/h;->p()LF8/e0;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lq8/d;->T()Lq8/b;

    move-result-object v0

    invoke-interface {v0, p1, p0}, Lq8/b;->a(LO7/h;Lq8/c;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public Z()Z
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0}, Lq8/g;->B()Z

    move-result v0

    return v0
.end method

.method public a(Lq8/b;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0, p1}, Lq8/g;->a(Lq8/b;)V

    return-void
.end method

.method public a0()Z
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0}, Lq8/g;->C()Z

    move-result v0

    return v0
.end method

.method public b(Ljava/util/Set;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0, p1}, Lq8/g;->b(Ljava/util/Set;)V

    return-void
.end method

.method public b0()Z
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0}, Lq8/g;->D()Z

    move-result v0

    return v0
.end method

.method public c(Z)V
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0, p1}, Lq8/g;->c(Z)V

    return-void
.end method

.method public c0()Z
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0}, Lq8/g;->E()Z

    move-result v0

    return v0
.end method

.method public d(Ljava/util/Set;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0, p1}, Lq8/g;->d(Ljava/util/Set;)V

    return-void
.end method

.method public d0()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0}, Lq8/g;->F()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public e(Lq8/m;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0, p1}, Lq8/g;->e(Lq8/m;)V

    return-void
.end method

.method public e0()Z
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0}, Lq8/g;->G()Z

    move-result v0

    return v0
.end method

.method public f(Z)V
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0, p1}, Lq8/g;->f(Z)V

    return-void
.end method

.method public final f0()Lq8/g;
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    return-object v0
.end method

.method public g()Z
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0}, Lq8/g;->g()Z

    move-result v0

    return v0
.end method

.method public g0()Lq8/j;
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0}, Lq8/g;->H()Lq8/j;

    move-result-object v0

    return-object v0
.end method

.method public h(Z)V
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0, p1}, Lq8/g;->h(Z)V

    return-void
.end method

.method public h0()Lq8/k;
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0}, Lq8/g;->I()Lq8/k;

    move-result-object v0

    return-object v0
.end method

.method public i(Z)V
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0, p1}, Lq8/g;->i(Z)V

    return-void
.end method

.method public i0()Z
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0}, Lq8/g;->J()Z

    move-result v0

    return v0
.end method

.method public j(Z)V
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0, p1}, Lq8/g;->j(Z)V

    return-void
.end method

.method public j0()Z
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0}, Lq8/g;->K()Z

    move-result v0

    return v0
.end method

.method public k(Z)V
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0, p1}, Lq8/g;->k(Z)V

    return-void
.end method

.method public k0()Lq8/l;
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0}, Lq8/g;->L()Lq8/l;

    move-result-object v0

    return-object v0
.end method

.method public l(Lq8/k;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0, p1}, Lq8/g;->l(Lq8/k;)V

    return-void
.end method

.method public l0()Z
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0}, Lq8/g;->N()Z

    move-result v0

    return v0
.end method

.method public m()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0}, Lq8/g;->m()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public m0()Z
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0}, Lq8/g;->O()Z

    move-result v0

    return v0
.end method

.method public n()Z
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0}, Lq8/g;->n()Z

    move-result v0

    return v0
.end method

.method public n0()Z
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0}, Lq8/g;->P()Z

    move-result v0

    return v0
.end method

.method public n1(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    const-string v0, "message"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lq8/d;->y0()Lq8/m;

    move-result-object v0

    sget-object v1, Lq8/d$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "<i>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "</i>"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1

    :cond_1
    :goto_0
    return-object p1
.end method

.method public o()Lq8/a;
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0}, Lq8/g;->o()Lq8/a;

    move-result-object v0

    return-object v0
.end method

.method public o0()Z
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0}, Lq8/g;->Q()Z

    move-result v0

    return v0
.end method

.method public p(Z)V
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0, p1}, Lq8/g;->p(Z)V

    return-void
.end method

.method public p0()Z
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0}, Lq8/g;->R()Z

    move-result v0

    return v0
.end method

.method public q(LO7/m;)Ljava/lang/String;
    .locals 2

    .prologue
    const-string v0, "declarationDescriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v1, Lq8/d$a;

    invoke-direct {v1, p0}, Lq8/d$a;-><init>(Lq8/d;)V

    invoke-interface {p1, v1, v0}, LO7/m;->r0(LO7/o;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lq8/d;->E0()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0, v0, p1}, Lq8/d;->K(Ljava/lang/StringBuilder;LO7/m;)V

    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "toString(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public q0()Z
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0}, Lq8/g;->S()Z

    move-result v0

    return v0
.end method

.method public r(LP7/c;LP7/e;)Ljava/lang/String;
    .locals 11

    .prologue
    const-string v0, "annotation"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    if-eqz p2, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2}, LP7/e;->g()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p2, 0x3a

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    invoke-interface {p1}, LP7/c;->getType()LF8/E;

    move-result-object p2

    invoke-virtual {p0, p2}, Lq8/d;->w(LF8/E;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lq8/d;->Z()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-direct {p0, p1}, Lq8/d;->S0(LP7/c;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0}, Lq8/d;->a0()Z

    move-result v1

    if-nez v1, :cond_1

    move-object v1, p1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_2

    :cond_1
    move-object v1, p1

    check-cast v1, Ljava/lang/Iterable;

    const/16 v9, 0x70

    const/4 v10, 0x0

    const-string v3, ", "

    const-string v4, "("

    const-string v5, ")"

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v2, v0

    invoke-static/range {v1 .. v10}, Lj7/v;->p0(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lx7/l;ILjava/lang/Object;)Ljava/lang/Appendable;

    :cond_2
    invoke-virtual {p0}, Lq8/d;->D0()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {p2}, LF8/G;->a(LF8/E;)Z

    move-result p1

    if-nez p1, :cond_3

    invoke-virtual {p2}, LF8/E;->W0()LF8/e0;

    move-result-object p1

    invoke-interface {p1}, LF8/e0;->w()LO7/h;

    move-result-object p1

    instance-of p1, p1, LO7/J$b;

    if-eqz p1, :cond_4

    :cond_3
    const-string p1, " /* annotation class not found */"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "toString(...)"

    invoke-static {p1, p2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public r0()Z
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0}, Lq8/g;->T()Z

    move-result v0

    return v0
.end method

.method public s0()Z
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0}, Lq8/g;->U()Z

    move-result v0

    return v0
.end method

.method public t(Ljava/lang/String;Ljava/lang/String;LL7/g;)Ljava/lang/String;
    .locals 8

    .prologue
    const-string v0, "lowerRendered"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "upperRendered"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builtIns"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Lq8/n;->f(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    const/16 v1, 0x28

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    const-string p3, "("

    const/4 v0, 0x0

    invoke-static {p2, p3, v0, v2, v3}, LS8/r;->V(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ")!"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x21

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {p0}, Lq8/d;->T()Lq8/b;

    move-result-object v0

    invoke-virtual {p3}, LL7/g;->w()LO7/e;

    move-result-object v4

    const-string v5, "getCollection(...)"

    invoke-static {v4, v5}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v4, p0}, Lq8/b;->a(LO7/h;Lq8/c;)Ljava/lang/String;

    move-result-object v0

    const-string v4, "Collection"

    invoke-static {v0, v4, v3, v2, v3}, LS8/r;->q1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "Mutable"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v5, 0x29

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {p1, v4, p2, v0, v6}, Lq8/n;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_2

    return-object v4

    :cond_2
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "MutableMap.MutableEntry"

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "Map.Entry"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "(Mutable)Map.(Mutable)Entry"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v4, p2, v6, v0}, Lq8/n;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    return-object v0

    :cond_3
    invoke-virtual {p0}, Lq8/d;->T()Lq8/b;

    move-result-object v0

    invoke-virtual {p3}, LL7/g;->j()LO7/e;

    move-result-object p3

    const-string v4, "getArray(...)"

    invoke-static {p3, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, p3, p0}, Lq8/b;->a(LO7/h;Lq8/c;)Ljava/lang/String;

    move-result-object p3

    const-string v0, "Array"

    invoke-static {p3, v0, v3, v2, v3}, LS8/r;->q1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "Array<"

    invoke-direct {p0, v2}, Lq8/d;->N(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "Array<out "

    invoke-direct {p0, v3}, Lq8/d;->N(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "Array<(out) "

    invoke-direct {p0, p3}, Lq8/d;->N(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {p1, v0, p2, v2, p3}, Lq8/n;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    if-eqz p3, :cond_4

    return-object p3

    :cond_4
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".."

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public t0()Z
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0}, Lq8/g;->V()Z

    move-result v0

    return v0
.end method

.method public u(Ln8/d;)Ljava/lang/String;
    .locals 1

    const-string v0, "fqName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ln8/d;->h()Ljava/util/List;

    move-result-object p1

    const-string v0, "pathSegments(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lq8/d;->g1(Ljava/util/List;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public u0()Z
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0}, Lq8/g;->W()Z

    move-result v0

    return v0
.end method

.method public v(Ln8/f;Z)Ljava/lang/String;
    .locals 2

    .prologue
    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lq8/n;->b(Ln8/f;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lq8/d;->N(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Lq8/d;->R()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lq8/d;->y0()Lq8/m;

    move-result-object v0

    sget-object v1, Lq8/m;->D:Lq8/m;

    if-ne v0, v1, :cond_0

    if-eqz p2, :cond_0

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "<b>"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "</b>"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public v0()Z
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0}, Lq8/g;->X()Z

    move-result v0

    return v0
.end method

.method public w(LF8/E;)Ljava/lang/String;
    .locals 2

    const-string v0, "type"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lq8/d;->z0()Lx7/l;

    move-result-object v1

    invoke-interface {v1, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LF8/E;

    invoke-direct {p0, v0, p1}, Lq8/d;->s1(Ljava/lang/StringBuilder;LF8/E;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "toString(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public w0()Z
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0}, Lq8/g;->Y()Z

    move-result v0

    return v0
.end method

.method public x(LF8/i0;)Ljava/lang/String;
    .locals 1

    const-string v0, "typeProjection"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lq8/d;->L(Ljava/lang/StringBuilder;Ljava/util/List;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "toString(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public x0()Z
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0}, Lq8/g;->Z()Z

    move-result v0

    return v0
.end method

.method public y0()Lq8/m;
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0}, Lq8/g;->a0()Lq8/m;

    move-result-object v0

    return-object v0
.end method

.method public z0()Lx7/l;
    .locals 1

    iget-object v0, p0, Lq8/d;->l:Lq8/g;

    invoke-virtual {v0}, Lq8/g;->b0()Lx7/l;

    move-result-object v0

    return-object v0
.end method
