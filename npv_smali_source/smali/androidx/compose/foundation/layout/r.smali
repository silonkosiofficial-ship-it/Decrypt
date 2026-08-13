.class final Landroidx/compose/foundation/layout/r;
.super Landroidx/compose/ui/d$c;
.source "SourceFile"

# interfaces
.implements LF0/E;


# instance fields
.field private P:F

.field private Q:F


# direct methods
.method private constructor <init>(FF)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/d$c;-><init>()V

    iput p1, p0, Landroidx/compose/foundation/layout/r;->P:F

    iput p2, p0, Landroidx/compose/foundation/layout/r;->Q:F

    return-void
.end method

.method public synthetic constructor <init>(FFLy7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/layout/r;-><init>(FF)V

    return-void
.end method


# virtual methods
.method public C(LD0/o;LD0/n;I)I
    .locals 1

    .prologue
    invoke-interface {p2, p3}, LD0/n;->S(I)I

    move-result p2

    iget p3, p0, Landroidx/compose/foundation/layout/r;->P:F

    sget-object v0, LY0/i;->D:LY0/i$a;

    invoke-virtual {v0}, LY0/i$a;->c()F

    move-result v0

    invoke-static {p3, v0}, LY0/i;->s(FF)Z

    move-result p3

    if-nez p3, :cond_0

    iget p3, p0, Landroidx/compose/foundation/layout/r;->P:F

    invoke-interface {p1, p3}, LY0/e;->S0(F)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p2, p1}, LE7/j;->d(II)I

    move-result p1

    return p1
.end method

.method public F(LD0/o;LD0/n;I)I
    .locals 1

    .prologue
    invoke-interface {p2, p3}, LD0/n;->T(I)I

    move-result p2

    iget p3, p0, Landroidx/compose/foundation/layout/r;->P:F

    sget-object v0, LY0/i;->D:LY0/i$a;

    invoke-virtual {v0}, LY0/i$a;->c()F

    move-result v0

    invoke-static {p3, v0}, LY0/i;->s(FF)Z

    move-result p3

    if-nez p3, :cond_0

    iget p3, p0, Landroidx/compose/foundation/layout/r;->P:F

    invoke-interface {p1, p3}, LY0/e;->S0(F)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p2, p1}, LE7/j;->d(II)I

    move-result p1

    return p1
.end method

.method public final T1(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/foundation/layout/r;->Q:F

    return-void
.end method

.method public final U1(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/foundation/layout/r;->P:F

    return-void
.end method

.method public f(LD0/M;LD0/G;J)LD0/K;
    .locals 7

    .prologue
    iget v0, p0, Landroidx/compose/foundation/layout/r;->P:F

    sget-object v1, LY0/i;->D:LY0/i$a;

    invoke-virtual {v1}, LY0/i$a;->c()F

    move-result v2

    invoke-static {v0, v2}, LY0/i;->s(FF)Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    invoke-static {p3, p4}, LY0/b;->n(J)I

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Landroidx/compose/foundation/layout/r;->P:F

    invoke-interface {p1, v0}, LY0/e;->S0(F)I

    move-result v0

    invoke-static {p3, p4}, LY0/b;->l(J)I

    move-result v3

    invoke-static {v0, v3}, LE7/j;->g(II)I

    move-result v0

    invoke-static {v0, v2}, LE7/j;->d(II)I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-static {p3, p4}, LY0/b;->n(J)I

    move-result v0

    :goto_0
    invoke-static {p3, p4}, LY0/b;->l(J)I

    move-result v3

    iget v4, p0, Landroidx/compose/foundation/layout/r;->Q:F

    invoke-virtual {v1}, LY0/i$a;->c()F

    move-result v1

    invoke-static {v4, v1}, LY0/i;->s(FF)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {p3, p4}, LY0/b;->m(J)I

    move-result v1

    if-nez v1, :cond_1

    iget v1, p0, Landroidx/compose/foundation/layout/r;->Q:F

    invoke-interface {p1, v1}, LY0/e;->S0(F)I

    move-result v1

    invoke-static {p3, p4}, LY0/b;->k(J)I

    move-result v4

    invoke-static {v1, v4}, LE7/j;->g(II)I

    move-result v1

    invoke-static {v1, v2}, LE7/j;->d(II)I

    move-result v1

    goto :goto_1

    :cond_1
    invoke-static {p3, p4}, LY0/b;->m(J)I

    move-result v1

    :goto_1
    invoke-static {p3, p4}, LY0/b;->k(J)I

    move-result p3

    invoke-static {v0, v3, v1, p3}, LY0/c;->a(IIII)J

    move-result-wide p3

    invoke-interface {p2, p3, p4}, LD0/G;->U(J)LD0/X;

    move-result-object p2

    invoke-virtual {p2}, LD0/X;->I0()I

    move-result v1

    invoke-virtual {p2}, LD0/X;->w0()I

    move-result v2

    new-instance v4, Landroidx/compose/foundation/layout/r$a;

    invoke-direct {v4, p2}, Landroidx/compose/foundation/layout/r$a;-><init>(LD0/X;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, LD0/L;->b(LD0/M;IILjava/util/Map;Lx7/l;ILjava/lang/Object;)LD0/K;

    move-result-object p1

    return-object p1
.end method

.method public k(LD0/o;LD0/n;I)I
    .locals 1

    .prologue
    invoke-interface {p2, p3}, LD0/n;->t(I)I

    move-result p2

    iget p3, p0, Landroidx/compose/foundation/layout/r;->Q:F

    sget-object v0, LY0/i;->D:LY0/i$a;

    invoke-virtual {v0}, LY0/i$a;->c()F

    move-result v0

    invoke-static {p3, v0}, LY0/i;->s(FF)Z

    move-result p3

    if-nez p3, :cond_0

    iget p3, p0, Landroidx/compose/foundation/layout/r;->Q:F

    invoke-interface {p1, p3}, LY0/e;->S0(F)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p2, p1}, LE7/j;->d(II)I

    move-result p1

    return p1
.end method

.method public t(LD0/o;LD0/n;I)I
    .locals 1

    .prologue
    invoke-interface {p2, p3}, LD0/n;->n0(I)I

    move-result p2

    iget p3, p0, Landroidx/compose/foundation/layout/r;->Q:F

    sget-object v0, LY0/i;->D:LY0/i$a;

    invoke-virtual {v0}, LY0/i$a;->c()F

    move-result v0

    invoke-static {p3, v0}, LY0/i;->s(FF)Z

    move-result p3

    if-nez p3, :cond_0

    iget p3, p0, Landroidx/compose/foundation/layout/r;->Q:F

    invoke-interface {p1, p3}, LY0/e;->S0(F)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p2, p1}, LE7/j;->d(II)I

    move-result p1

    return p1
.end method
