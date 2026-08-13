.class final Landroidx/compose/foundation/layout/q;
.super Landroidx/compose/ui/d$c;
.source "SourceFile"

# interfaces
.implements LF0/E;


# instance fields
.field private P:F

.field private Q:F

.field private R:F

.field private S:F

.field private T:Z


# direct methods
.method private constructor <init>(FFFFZ)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/d$c;-><init>()V

    iput p1, p0, Landroidx/compose/foundation/layout/q;->P:F

    iput p2, p0, Landroidx/compose/foundation/layout/q;->Q:F

    iput p3, p0, Landroidx/compose/foundation/layout/q;->R:F

    iput p4, p0, Landroidx/compose/foundation/layout/q;->S:F

    iput-boolean p5, p0, Landroidx/compose/foundation/layout/q;->T:Z

    return-void
.end method

.method public synthetic constructor <init>(FFFFZLy7/k;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Landroidx/compose/foundation/layout/q;-><init>(FFFFZ)V

    return-void
.end method

.method private final T1(LY0/e;)J
    .locals 7

    .prologue
    iget v0, p0, Landroidx/compose/foundation/layout/q;->R:F

    sget-object v1, LY0/i;->D:LY0/i$a;

    invoke-virtual {v1}, LY0/i$a;->c()F

    move-result v2

    invoke-static {v0, v2}, LY0/i;->s(FF)Z

    move-result v0

    const v2, 0x7fffffff

    const/4 v3, 0x0

    if-nez v0, :cond_0

    iget v0, p0, Landroidx/compose/foundation/layout/q;->R:F

    invoke-interface {p1, v0}, LY0/e;->S0(F)I

    move-result v0

    invoke-static {v0, v3}, LE7/j;->d(II)I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    iget v4, p0, Landroidx/compose/foundation/layout/q;->S:F

    invoke-virtual {v1}, LY0/i$a;->c()F

    move-result v5

    invoke-static {v4, v5}, LY0/i;->s(FF)Z

    move-result v4

    if-nez v4, :cond_1

    iget v4, p0, Landroidx/compose/foundation/layout/q;->S:F

    invoke-interface {p1, v4}, LY0/e;->S0(F)I

    move-result v4

    invoke-static {v4, v3}, LE7/j;->d(II)I

    move-result v4

    goto :goto_1

    :cond_1
    move v4, v2

    :goto_1
    iget v5, p0, Landroidx/compose/foundation/layout/q;->P:F

    invoke-virtual {v1}, LY0/i$a;->c()F

    move-result v6

    invoke-static {v5, v6}, LY0/i;->s(FF)Z

    move-result v5

    if-nez v5, :cond_2

    iget v5, p0, Landroidx/compose/foundation/layout/q;->P:F

    invoke-interface {p1, v5}, LY0/e;->S0(F)I

    move-result v5

    invoke-static {v5, v0}, LE7/j;->g(II)I

    move-result v5

    invoke-static {v5, v3}, LE7/j;->d(II)I

    move-result v5

    if-eq v5, v2, :cond_2

    goto :goto_2

    :cond_2
    move v5, v3

    :goto_2
    iget v6, p0, Landroidx/compose/foundation/layout/q;->Q:F

    invoke-virtual {v1}, LY0/i$a;->c()F

    move-result v1

    invoke-static {v6, v1}, LY0/i;->s(FF)Z

    move-result v1

    if-nez v1, :cond_3

    iget v1, p0, Landroidx/compose/foundation/layout/q;->Q:F

    invoke-interface {p1, v1}, LY0/e;->S0(F)I

    move-result p1

    invoke-static {p1, v4}, LE7/j;->g(II)I

    move-result p1

    invoke-static {p1, v3}, LE7/j;->d(II)I

    move-result p1

    if-eq p1, v2, :cond_3

    move v3, p1

    :cond_3
    invoke-static {v5, v0, v3, v4}, LY0/c;->a(IIII)J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public C(LD0/o;LD0/n;I)I
    .locals 2

    .prologue
    invoke-direct {p0, p1}, Landroidx/compose/foundation/layout/q;->T1(LY0/e;)J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/b;->j(J)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {v0, v1}, LY0/b;->l(J)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-interface {p2, p3}, LD0/n;->S(I)I

    move-result p1

    invoke-static {v0, v1, p1}, LY0/c;->i(JI)I

    move-result p1

    :goto_0
    return p1
.end method

.method public F(LD0/o;LD0/n;I)I
    .locals 2

    .prologue
    invoke-direct {p0, p1}, Landroidx/compose/foundation/layout/q;->T1(LY0/e;)J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/b;->j(J)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {v0, v1}, LY0/b;->l(J)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-interface {p2, p3}, LD0/n;->T(I)I

    move-result p1

    invoke-static {v0, v1, p1}, LY0/c;->i(JI)I

    move-result p1

    :goto_0
    return p1
.end method

.method public final U1(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/foundation/layout/q;->T:Z

    return-void
.end method

.method public final V1(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/foundation/layout/q;->S:F

    return-void
.end method

.method public final W1(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/foundation/layout/q;->R:F

    return-void
.end method

.method public final X1(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/foundation/layout/q;->Q:F

    return-void
.end method

.method public final Y1(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/foundation/layout/q;->P:F

    return-void
.end method

.method public f(LD0/M;LD0/G;J)LD0/K;
    .locals 7

    .prologue
    invoke-direct {p0, p1}, Landroidx/compose/foundation/layout/q;->T1(LY0/e;)J

    move-result-wide v0

    iget-boolean v2, p0, Landroidx/compose/foundation/layout/q;->T:Z

    if-eqz v2, :cond_0

    invoke-static {p3, p4, v0, v1}, LY0/c;->g(JJ)J

    move-result-wide p3

    goto/16 :goto_4

    :cond_0
    iget v2, p0, Landroidx/compose/foundation/layout/q;->P:F

    sget-object v3, LY0/i;->D:LY0/i$a;

    invoke-virtual {v3}, LY0/i$a;->c()F

    move-result v4

    invoke-static {v2, v4}, LY0/i;->s(FF)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-static {v0, v1}, LY0/b;->n(J)I

    move-result v2

    goto :goto_0

    :cond_1
    invoke-static {p3, p4}, LY0/b;->n(J)I

    move-result v2

    invoke-static {v0, v1}, LY0/b;->l(J)I

    move-result v4

    invoke-static {v2, v4}, LE7/j;->g(II)I

    move-result v2

    :goto_0
    iget v4, p0, Landroidx/compose/foundation/layout/q;->R:F

    invoke-virtual {v3}, LY0/i$a;->c()F

    move-result v5

    invoke-static {v4, v5}, LY0/i;->s(FF)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-static {v0, v1}, LY0/b;->l(J)I

    move-result v4

    goto :goto_1

    :cond_2
    invoke-static {p3, p4}, LY0/b;->l(J)I

    move-result v4

    invoke-static {v0, v1}, LY0/b;->n(J)I

    move-result v5

    invoke-static {v4, v5}, LE7/j;->d(II)I

    move-result v4

    :goto_1
    iget v5, p0, Landroidx/compose/foundation/layout/q;->Q:F

    invoke-virtual {v3}, LY0/i$a;->c()F

    move-result v6

    invoke-static {v5, v6}, LY0/i;->s(FF)Z

    move-result v5

    if-nez v5, :cond_3

    invoke-static {v0, v1}, LY0/b;->m(J)I

    move-result v5

    goto :goto_2

    :cond_3
    invoke-static {p3, p4}, LY0/b;->m(J)I

    move-result v5

    invoke-static {v0, v1}, LY0/b;->k(J)I

    move-result v6

    invoke-static {v5, v6}, LE7/j;->g(II)I

    move-result v5

    :goto_2
    iget v6, p0, Landroidx/compose/foundation/layout/q;->S:F

    invoke-virtual {v3}, LY0/i$a;->c()F

    move-result v3

    invoke-static {v6, v3}, LY0/i;->s(FF)Z

    move-result v3

    if-nez v3, :cond_4

    invoke-static {v0, v1}, LY0/b;->k(J)I

    move-result p3

    goto :goto_3

    :cond_4
    invoke-static {p3, p4}, LY0/b;->k(J)I

    move-result p3

    invoke-static {v0, v1}, LY0/b;->m(J)I

    move-result p4

    invoke-static {p3, p4}, LE7/j;->d(II)I

    move-result p3

    :goto_3
    invoke-static {v2, v4, v5, p3}, LY0/c;->a(IIII)J

    move-result-wide p3

    :goto_4
    invoke-interface {p2, p3, p4}, LD0/G;->U(J)LD0/X;

    move-result-object p2

    invoke-virtual {p2}, LD0/X;->I0()I

    move-result v1

    invoke-virtual {p2}, LD0/X;->w0()I

    move-result v2

    new-instance v4, Landroidx/compose/foundation/layout/q$a;

    invoke-direct {v4, p2}, Landroidx/compose/foundation/layout/q$a;-><init>(LD0/X;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, LD0/L;->b(LD0/M;IILjava/util/Map;Lx7/l;ILjava/lang/Object;)LD0/K;

    move-result-object p1

    return-object p1
.end method

.method public k(LD0/o;LD0/n;I)I
    .locals 2

    .prologue
    invoke-direct {p0, p1}, Landroidx/compose/foundation/layout/q;->T1(LY0/e;)J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/b;->i(J)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {v0, v1}, LY0/b;->k(J)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-interface {p2, p3}, LD0/n;->t(I)I

    move-result p1

    invoke-static {v0, v1, p1}, LY0/c;->h(JI)I

    move-result p1

    :goto_0
    return p1
.end method

.method public t(LD0/o;LD0/n;I)I
    .locals 2

    .prologue
    invoke-direct {p0, p1}, Landroidx/compose/foundation/layout/q;->T1(LY0/e;)J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/b;->i(J)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {v0, v1}, LY0/b;->k(J)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-interface {p2, p3}, LD0/n;->n0(I)I

    move-result p1

    invoke-static {v0, v1, p1}, LY0/c;->h(JI)I

    move-result p1

    :goto_0
    return p1
.end method
