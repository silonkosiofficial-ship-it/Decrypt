.class public final LF0/c;
.super Landroidx/compose/ui/d$c;
.source "SourceFile"

# interfaces
.implements LF0/E;
.implements LF0/s;
.implements LF0/z0;
.implements LF0/v0;
.implements LE0/i;
.implements LE0/l;
.implements LF0/r0;
.implements LF0/C;
.implements LF0/u;
.implements Lm0/b;
.implements Lm0/j;
.implements Lm0/m;
.implements LF0/p0;
.implements Ll0/b;


# instance fields
.field private P:Landroidx/compose/ui/d$b;

.field private Q:Z

.field private R:LE0/a;

.field private S:Ljava/util/HashSet;

.field private T:LD0/t;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/d$b;)V
    .locals 1

    invoke-direct {p0}, Landroidx/compose/ui/d$c;-><init>()V

    invoke-static {p1}, LF0/g0;->f(Landroidx/compose/ui/d$b;)I

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/compose/ui/d$c;->N1(I)V

    iput-object p1, p0, LF0/c;->P:Landroidx/compose/ui/d$b;

    const/4 p1, 0x1

    iput-boolean p1, p0, LF0/c;->Q:Z

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, LF0/c;->S:Ljava/util/HashSet;

    return-void
.end method

.method private final V1(Z)V
    .locals 3

    .prologue
    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "initializeModifier called on unattached node"

    invoke-static {v0}, LC0/a;->b(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, LF0/c;->P:Landroidx/compose/ui/d$b;

    const/16 v1, 0x20

    invoke-static {v1}, LF0/f0;->a(I)I

    move-result v1

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->v1()I

    move-result v2

    and-int/2addr v1, v2

    if-eqz v1, :cond_2

    instance-of v1, v0, LE0/d;

    if-eqz v1, :cond_1

    new-instance v1, LF0/c$a;

    invoke-direct {v1, p0}, LF0/c$a;-><init>(LF0/c;)V

    invoke-virtual {p0, v1}, Landroidx/compose/ui/d$c;->R1(Lx7/a;)V

    :cond_1
    instance-of v1, v0, LE0/k;

    if-eqz v1, :cond_2

    move-object v1, v0

    check-cast v1, LE0/k;

    invoke-direct {p0, v1}, LF0/c;->a2(LE0/k;)V

    :cond_2
    const/4 v1, 0x4

    invoke-static {v1}, LF0/f0;->a(I)I

    move-result v1

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->v1()I

    move-result v2

    and-int/2addr v1, v2

    if-eqz v1, :cond_3

    if-nez p1, :cond_3

    invoke-static {p0}, LF0/H;->a(LF0/E;)V

    :cond_3
    const/4 v1, 0x2

    invoke-static {v1}, LF0/f0;->a(I)I

    move-result v1

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->v1()I

    move-result v2

    and-int/2addr v1, v2

    if-eqz v1, :cond_5

    invoke-static {p0}, LF0/d;->c(LF0/c;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->s1()LF0/d0;

    move-result-object v1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    move-object v2, v1

    check-cast v2, LF0/F;

    invoke-virtual {v2, p0}, LF0/F;->l3(LF0/E;)V

    invoke-virtual {v1}, LF0/d0;->D2()V

    :cond_4
    if-nez p1, :cond_5

    invoke-static {p0}, LF0/H;->a(LF0/E;)V

    invoke-static {p0}, LF0/k;->m(LF0/j;)LF0/J;

    move-result-object p1

    invoke-virtual {p1}, LF0/J;->F0()V

    :cond_5
    instance-of p1, v0, LD0/a0;

    if-eqz p1, :cond_6

    move-object p1, v0

    check-cast p1, LD0/a0;

    invoke-static {p0}, LF0/k;->m(LF0/j;)LF0/J;

    move-result-object v1

    invoke-interface {p1, v1}, LD0/a0;->a(LD0/Z;)V

    :cond_6
    const/16 p1, 0x80

    invoke-static {p1}, LF0/f0;->a(I)I

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->v1()I

    const/16 p1, 0x100

    invoke-static {p1}, LF0/f0;->a(I)I

    move-result p1

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->v1()I

    move-result v1

    and-int/2addr p1, v1

    if-eqz p1, :cond_7

    instance-of p1, v0, LD0/S;

    if-eqz p1, :cond_7

    invoke-static {p0}, LF0/d;->c(LF0/c;)Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {p0}, LF0/k;->m(LF0/j;)LF0/J;

    move-result-object p1

    invoke-virtual {p1}, LF0/J;->F0()V

    :cond_7
    const/16 p1, 0x10

    invoke-static {p1}, LF0/f0;->a(I)I

    move-result p1

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->v1()I

    move-result v1

    and-int/2addr p1, v1

    if-eqz p1, :cond_8

    instance-of p1, v0, Lz0/I;

    if-eqz p1, :cond_8

    check-cast v0, Lz0/I;

    invoke-interface {v0}, Lz0/I;->e()Lz0/H;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->s1()LF0/d0;

    move-result-object v0

    invoke-virtual {p1, v0}, Lz0/H;->f(LD0/t;)V

    :cond_8
    const/16 p1, 0x8

    invoke-static {p1}, LF0/f0;->a(I)I

    move-result p1

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->v1()I

    move-result v0

    and-int/2addr p1, v0

    if-eqz p1, :cond_9

    invoke-static {p0}, LF0/k;->n(LF0/j;)LF0/o0;

    move-result-object p1

    invoke-interface {p1}, LF0/o0;->t()V

    :cond_9
    return-void
.end method

.method private final Y1()V
    .locals 3

    .prologue
    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "unInitializeModifier called on unattached node"

    invoke-static {v0}, LC0/a;->b(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, LF0/c;->P:Landroidx/compose/ui/d$b;

    const/16 v1, 0x20

    invoke-static {v1}, LF0/f0;->a(I)I

    move-result v1

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->v1()I

    move-result v2

    and-int/2addr v1, v2

    if-eqz v1, :cond_2

    instance-of v1, v0, LE0/k;

    if-eqz v1, :cond_1

    invoke-static {p0}, LF0/k;->n(LF0/j;)LF0/o0;

    move-result-object v1

    invoke-interface {v1}, LF0/o0;->getModifierLocalManager()LE0/f;

    move-result-object v1

    move-object v2, v0

    check-cast v2, LE0/k;

    invoke-interface {v2}, LE0/k;->getKey()LE0/m;

    move-result-object v2

    invoke-virtual {v1, p0, v2}, LE0/f;->d(LF0/c;LE0/c;)V

    :cond_1
    instance-of v1, v0, LE0/d;

    if-eqz v1, :cond_2

    check-cast v0, LE0/d;

    invoke-static {}, LF0/d;->a()LF0/d$a;

    move-result-object v1

    invoke-interface {v0, v1}, LE0/d;->h(LE0/l;)V

    :cond_2
    const/16 v0, 0x8

    invoke-static {v0}, LF0/f0;->a(I)I

    move-result v0

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->v1()I

    move-result v1

    and-int/2addr v0, v1

    if-eqz v0, :cond_3

    invoke-static {p0}, LF0/k;->n(LF0/j;)LF0/o0;

    move-result-object v0

    invoke-interface {v0}, LF0/o0;->t()V

    :cond_3
    return-void
.end method

.method private final a2(LE0/k;)V
    .locals 2

    .prologue
    iget-object v0, p0, LF0/c;->R:LE0/a;

    if-eqz v0, :cond_0

    invoke-interface {p1}, LE0/k;->getKey()LE0/m;

    move-result-object v1

    invoke-virtual {v0, v1}, LE0/a;->a(LE0/c;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, p1}, LE0/a;->c(LE0/k;)V

    invoke-static {p0}, LF0/k;->n(LF0/j;)LF0/o0;

    move-result-object v0

    invoke-interface {v0}, LF0/o0;->getModifierLocalManager()LE0/f;

    move-result-object v0

    invoke-interface {p1}, LE0/k;->getKey()LE0/m;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, LE0/f;->f(LF0/c;LE0/c;)V

    goto :goto_0

    :cond_0
    new-instance v0, LE0/a;

    invoke-direct {v0, p1}, LE0/a;-><init>(LE0/k;)V

    iput-object v0, p0, LF0/c;->R:LE0/a;

    invoke-static {p0}, LF0/d;->c(LF0/c;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0}, LF0/k;->n(LF0/j;)LF0/o0;

    move-result-object v0

    invoke-interface {v0}, LF0/o0;->getModifierLocalManager()LE0/f;

    move-result-object v0

    invoke-interface {p1}, LE0/k;->getKey()LE0/m;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, LE0/f;->a(LF0/c;LE0/c;)V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public C(LD0/o;LD0/n;I)I
    .locals 2

    iget-object v0, p0, LF0/c;->P:Landroidx/compose/ui/d$b;

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LD0/A;

    invoke-interface {v0, p1, p2, p3}, LD0/A;->C(LD0/o;LD0/n;I)I

    move-result p1

    return p1
.end method

.method public D0(LE0/c;)Ljava/lang/Object;
    .locals 11

    .prologue
    iget-object v0, p0, LF0/c;->S:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const/16 v0, 0x20

    invoke-static {v0}, LF0/f0;->a(I)I

    move-result v0

    invoke-interface {p0}, LF0/j;->E0()Landroidx/compose/ui/d$c;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {p0}, LF0/j;->E0()Landroidx/compose/ui/d$c;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/d$c;->x1()Landroidx/compose/ui/d$c;

    move-result-object v1

    invoke-static {p0}, LF0/k;->m(LF0/j;)LF0/J;

    move-result-object v2

    :goto_0
    if-eqz v2, :cond_a

    invoke-virtual {v2}, LF0/J;->k0()LF0/b0;

    move-result-object v3

    invoke-virtual {v3}, LF0/b0;->k()Landroidx/compose/ui/d$c;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/ui/d$c;->q1()I

    move-result v3

    and-int/2addr v3, v0

    const/4 v4, 0x0

    if-eqz v3, :cond_8

    :goto_1
    if-eqz v1, :cond_8

    invoke-virtual {v1}, Landroidx/compose/ui/d$c;->v1()I

    move-result v3

    and-int/2addr v3, v0

    if-eqz v3, :cond_7

    move-object v3, v1

    move-object v5, v4

    :goto_2
    if-eqz v3, :cond_7

    instance-of v6, v3, LE0/i;

    if-eqz v6, :cond_0

    check-cast v3, LE0/i;

    invoke-interface {v3}, LE0/i;->s0()LE0/g;

    move-result-object v6

    invoke-virtual {v6, p1}, LE0/g;->a(LE0/c;)Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {v3}, LE0/i;->s0()LE0/g;

    move-result-object v0

    invoke-virtual {v0, p1}, LE0/g;->b(LE0/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {v3}, Landroidx/compose/ui/d$c;->v1()I

    move-result v6

    and-int/2addr v6, v0

    if-eqz v6, :cond_6

    instance-of v6, v3, LF0/m;

    if-eqz v6, :cond_6

    move-object v6, v3

    check-cast v6, LF0/m;

    invoke-virtual {v6}, LF0/m;->U1()Landroidx/compose/ui/d$c;

    move-result-object v6

    const/4 v7, 0x0

    move v8, v7

    :goto_3
    const/4 v9, 0x1

    if-eqz v6, :cond_5

    invoke-virtual {v6}, Landroidx/compose/ui/d$c;->v1()I

    move-result v10

    and-int/2addr v10, v0

    if-eqz v10, :cond_4

    add-int/lit8 v8, v8, 0x1

    if-ne v8, v9, :cond_1

    move-object v3, v6

    goto :goto_4

    :cond_1
    if-nez v5, :cond_2

    new-instance v5, LX/b;

    const/16 v9, 0x10

    new-array v9, v9, [Landroidx/compose/ui/d$c;

    invoke-direct {v5, v9, v7}, LX/b;-><init>([Ljava/lang/Object;I)V

    :cond_2
    if-eqz v3, :cond_3

    invoke-virtual {v5, v3}, LX/b;->d(Ljava/lang/Object;)Z

    move-object v3, v4

    :cond_3
    invoke-virtual {v5, v6}, LX/b;->d(Ljava/lang/Object;)Z

    :cond_4
    :goto_4
    invoke-virtual {v6}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v6

    goto :goto_3

    :cond_5
    if-ne v8, v9, :cond_6

    goto :goto_2

    :cond_6
    invoke-static {v5}, LF0/k;->b(LX/b;)Landroidx/compose/ui/d$c;

    move-result-object v3

    goto :goto_2

    :cond_7
    invoke-virtual {v1}, Landroidx/compose/ui/d$c;->x1()Landroidx/compose/ui/d$c;

    move-result-object v1

    goto :goto_1

    :cond_8
    invoke-virtual {v2}, LF0/J;->o0()LF0/J;

    move-result-object v2

    if-eqz v2, :cond_9

    invoke-virtual {v2}, LF0/J;->k0()LF0/b0;

    move-result-object v1

    if-eqz v1, :cond_9

    invoke-virtual {v1}, LF0/b0;->o()Landroidx/compose/ui/d$c;

    move-result-object v1

    goto/16 :goto_0

    :cond_9
    move-object v1, v4

    goto/16 :goto_0

    :cond_a
    invoke-virtual {p1}, LE0/c;->a()Lx7/a;

    move-result-object p1

    invoke-interface {p1}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "visitAncestors called on an unattached node"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public D1()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, LF0/c;->V1(Z)V

    return-void
.end method

.method public E1()V
    .locals 0

    invoke-direct {p0}, LF0/c;->Y1()V

    return-void
.end method

.method public F(LD0/o;LD0/n;I)I
    .locals 2

    iget-object v0, p0, LF0/c;->P:Landroidx/compose/ui/d$b;

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LD0/A;

    invoke-interface {v0, p1, p2, p3}, LD0/A;->F(LD0/o;LD0/n;I)I

    move-result p1

    return p1
.end method

.method public G(LY0/e;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LF0/c;->P:Landroidx/compose/ui/d$b;

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LD0/U;

    invoke-interface {v0, p1, p2}, LD0/U;->G(LY0/e;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public M(J)V
    .locals 0

    return-void
.end method

.method public M0(LK0/w;)V
    .locals 2

    iget-object v0, p0, LF0/c;->P:Landroidx/compose/ui/d$b;

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LK0/m;

    invoke-interface {v0}, LK0/m;->i()LK0/k;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration"

    invoke-static {p1, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LK0/k;

    invoke-virtual {p1, v0}, LK0/k;->e(LK0/k;)V

    return-void
.end method

.method public R()Z
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v0

    return v0
.end method

.method public R0(Lm0/n;)V
    .locals 1

    iget-object p1, p0, LF0/c;->P:Landroidx/compose/ui/d$b;

    const-string v0, "onFocusEvent called on wrong node"

    invoke-static {v0}, LC0/a;->b(Ljava/lang/String;)V

    invoke-static {p1}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final T1()Landroidx/compose/ui/d$b;
    .locals 1

    iget-object v0, p0, LF0/c;->P:Landroidx/compose/ui/d$b;

    return-object v0
.end method

.method public final U1()Ljava/util/HashSet;
    .locals 1

    iget-object v0, p0, LF0/c;->S:Ljava/util/HashSet;

    return-object v0
.end method

.method public final W1()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LF0/c;->Q:Z

    invoke-static {p0}, LF0/t;->a(LF0/s;)V

    return-void
.end method

.method public final X1(Landroidx/compose/ui/d$b;)V
    .locals 1

    .prologue
    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, LF0/c;->Y1()V

    :cond_0
    iput-object p1, p0, LF0/c;->P:Landroidx/compose/ui/d$b;

    invoke-static {p1}, LF0/g0;->f(Landroidx/compose/ui/d$b;)I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/compose/ui/d$c;->N1(I)V

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->A1()Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    invoke-direct {p0, p1}, LF0/c;->V1(Z)V

    :cond_1
    return-void
.end method

.method public Y(Landroidx/compose/ui/focus/j;)V
    .locals 2

    iget-object v0, p0, LF0/c;->P:Landroidx/compose/ui/d$b;

    const-string v1, "applyFocusProperties called on wrong node"

    invoke-static {v1}, LC0/a;->b(Ljava/lang/String;)V

    invoke-static {v0}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    new-instance v0, Lm0/g;

    invoke-direct {v0, p1}, Lm0/g;-><init>(Landroidx/compose/ui/focus/j;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public Y0()Z
    .locals 2

    iget-object v0, p0, LF0/c;->P:Landroidx/compose/ui/d$b;

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lz0/I;

    invoke-interface {v0}, Lz0/I;->e()Lz0/H;

    move-result-object v0

    invoke-virtual {v0}, Lz0/H;->c()Z

    move-result v0

    return v0
.end method

.method public final Z1()V
    .locals 3

    .prologue
    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LF0/c;->S:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    invoke-static {p0}, LF0/k;->n(LF0/j;)LF0/o0;

    move-result-object v0

    invoke-interface {v0}, LF0/o0;->getSnapshotObserver()LF0/q0;

    move-result-object v0

    invoke-static {}, LF0/d;->b()Lx7/l;

    move-result-object v1

    new-instance v2, LF0/c$b;

    invoke-direct {v2, p0}, LF0/c$b;-><init>(LF0/c;)V

    invoke-virtual {v0, p0, v1, v2}, LF0/q0;->i(LF0/p0;Lx7/l;Lx7/a;)V

    :cond_0
    return-void
.end method

.method public f(LD0/M;LD0/G;J)LD0/K;
    .locals 2

    iget-object v0, p0, LF0/c;->P:Landroidx/compose/ui/d$b;

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LD0/A;

    invoke-interface {v0, p1, p2, p3, p4}, LD0/A;->f(LD0/M;LD0/G;J)LD0/K;

    move-result-object p1

    return-object p1
.end method

.method public synthetic f1()V
    .locals 0

    invoke-static {p0}, LF0/u0;->c(LF0/v0;)V

    return-void
.end method

.method public g0()V
    .locals 2

    iget-object v0, p0, LF0/c;->P:Landroidx/compose/ui/d$b;

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lz0/I;

    invoke-interface {v0}, Lz0/I;->e()Lz0/H;

    move-result-object v0

    invoke-virtual {v0}, Lz0/H;->d()V

    return-void
.end method

.method public getDensity()LY0/e;
    .locals 1

    invoke-static {p0}, LF0/k;->m(LF0/j;)LF0/J;

    move-result-object v0

    invoke-virtual {v0}, LF0/J;->K()LY0/e;

    move-result-object v0

    return-object v0
.end method

.method public getLayoutDirection()LY0/v;
    .locals 1

    invoke-static {p0}, LF0/k;->m(LF0/j;)LF0/J;

    move-result-object v0

    invoke-virtual {v0}, LF0/J;->getLayoutDirection()LY0/v;

    move-result-object v0

    return-object v0
.end method

.method public synthetic h0()Z
    .locals 1

    invoke-static {p0}, LF0/y0;->a(LF0/z0;)Z

    move-result v0

    return v0
.end method

.method public i()J
    .locals 2

    const/16 v0, 0x80

    invoke-static {v0}, LF0/f0;->a(I)I

    move-result v0

    invoke-static {p0, v0}, LF0/k;->h(LF0/j;I)LF0/d0;

    move-result-object v0

    invoke-virtual {v0}, LF0/d0;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/u;->d(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public k(LD0/o;LD0/n;I)I
    .locals 2

    iget-object v0, p0, LF0/c;->P:Landroidx/compose/ui/d$b;

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LD0/A;

    invoke-interface {v0, p1, p2, p3}, LD0/A;->k(LD0/o;LD0/n;I)I

    move-result p1

    return p1
.end method

.method public synthetic k1()Z
    .locals 1

    invoke-static {p0}, LF0/y0;->b(LF0/z0;)Z

    move-result v0

    return v0
.end method

.method public m0()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LF0/c;->Q:Z

    invoke-static {p0}, LF0/t;->a(LF0/s;)V

    return-void
.end method

.method public m1(LD0/t;)V
    .locals 0

    iput-object p1, p0, LF0/c;->T:LD0/t;

    return-void
.end method

.method public n0()Z
    .locals 2

    iget-object v0, p0, LF0/c;->P:Landroidx/compose/ui/d$b;

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lz0/I;

    invoke-interface {v0}, Lz0/I;->e()Lz0/H;

    move-result-object v0

    invoke-virtual {v0}, Lz0/H;->a()Z

    move-result v0

    return v0
.end method

.method public s(LD0/t;)V
    .locals 2

    iget-object v0, p0, LF0/c;->P:Landroidx/compose/ui/d$b;

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LD0/S;

    invoke-interface {v0, p1}, LD0/S;->s(LD0/t;)V

    return-void
.end method

.method public s0()LE0/g;
    .locals 1

    .prologue
    iget-object v0, p0, LF0/c;->R:LE0/a;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, LE0/j;->a()LE0/g;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public t(LD0/o;LD0/n;I)I
    .locals 2

    iget-object v0, p0, LF0/c;->P:Landroidx/compose/ui/d$b;

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LD0/A;

    invoke-interface {v0, p1, p2, p3}, LD0/A;->t(LD0/o;LD0/n;I)I

    move-result p1

    return p1
.end method

.method public synthetic t0()V
    .locals 0

    invoke-static {p0}, LF0/u0;->b(LF0/v0;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LF0/c;->P:Landroidx/compose/ui/d$b;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public w0(Lz0/p;Lz0/r;J)V
    .locals 2

    iget-object v0, p0, LF0/c;->P:Landroidx/compose/ui/d$b;

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lz0/I;

    invoke-interface {v0}, Lz0/I;->e()Lz0/H;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Lz0/H;->e(Lz0/p;Lz0/r;J)V

    return-void
.end method

.method public y(Lq0/c;)V
    .locals 2

    iget-object v0, p0, LF0/c;->P:Landroidx/compose/ui/d$b;

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ll0/g;

    invoke-interface {v0, p1}, Ll0/g;->y(Lq0/c;)V

    return-void
.end method
