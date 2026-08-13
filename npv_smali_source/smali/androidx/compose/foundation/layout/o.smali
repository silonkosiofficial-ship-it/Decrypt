.class final Landroidx/compose/foundation/layout/o;
.super Landroidx/compose/ui/d$c;
.source "SourceFile"

# interfaces
.implements LF0/E;


# instance fields
.field private P:LA/B;


# direct methods
.method public constructor <init>(LA/B;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/d$c;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/layout/o;->P:LA/B;

    return-void
.end method


# virtual methods
.method public synthetic C(LD0/o;LD0/n;I)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, LF0/D;->d(LF0/E;LD0/o;LD0/n;I)I

    move-result p1

    return p1
.end method

.method public synthetic F(LD0/o;LD0/n;I)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, LF0/D;->b(LF0/E;LD0/o;LD0/n;I)I

    move-result p1

    return p1
.end method

.method public final T1()LA/B;
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/layout/o;->P:LA/B;

    return-object v0
.end method

.method public final U1(LA/B;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/layout/o;->P:LA/B;

    return-void
.end method

.method public f(LD0/M;LD0/G;J)LD0/K;
    .locals 10

    .prologue
    iget-object v0, p0, Landroidx/compose/foundation/layout/o;->P:LA/B;

    invoke-interface {p1}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object v1

    invoke-interface {v0, v1}, LA/B;->a(LY0/v;)F

    move-result v0

    const/4 v1, 0x0

    int-to-float v1, v1

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v2

    invoke-static {v0, v2}, LY0/i;->o(FF)I

    move-result v0

    if-ltz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/foundation/layout/o;->P:LA/B;

    invoke-interface {v0}, LA/B;->d()F

    move-result v0

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v2

    invoke-static {v0, v2}, LY0/i;->o(FF)I

    move-result v0

    if-ltz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/foundation/layout/o;->P:LA/B;

    invoke-interface {p1}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object v2

    invoke-interface {v0, v2}, LA/B;->b(LY0/v;)F

    move-result v0

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v2

    invoke-static {v0, v2}, LY0/i;->o(FF)I

    move-result v0

    if-ltz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/foundation/layout/o;->P:LA/B;

    invoke-interface {v0}, LA/B;->c()F

    move-result v0

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v1

    invoke-static {v0, v1}, LY0/i;->o(FF)I

    move-result v0

    if-ltz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/foundation/layout/o;->P:LA/B;

    invoke-interface {p1}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object v1

    invoke-interface {v0, v1}, LA/B;->a(LY0/v;)F

    move-result v0

    invoke-interface {p1, v0}, LY0/e;->S0(F)I

    move-result v0

    iget-object v1, p0, Landroidx/compose/foundation/layout/o;->P:LA/B;

    invoke-interface {p1}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object v2

    invoke-interface {v1, v2}, LA/B;->b(LY0/v;)F

    move-result v1

    invoke-interface {p1, v1}, LY0/e;->S0(F)I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Landroidx/compose/foundation/layout/o;->P:LA/B;

    invoke-interface {v1}, LA/B;->d()F

    move-result v1

    invoke-interface {p1, v1}, LY0/e;->S0(F)I

    move-result v1

    iget-object v2, p0, Landroidx/compose/foundation/layout/o;->P:LA/B;

    invoke-interface {v2}, LA/B;->c()F

    move-result v2

    invoke-interface {p1, v2}, LY0/e;->S0(F)I

    move-result v2

    add-int/2addr v1, v2

    neg-int v2, v0

    neg-int v3, v1

    invoke-static {p3, p4, v2, v3}, LY0/c;->n(JII)J

    move-result-wide v2

    invoke-interface {p2, v2, v3}, LD0/G;->U(J)LD0/X;

    move-result-object p2

    invoke-virtual {p2}, LD0/X;->I0()I

    move-result v2

    add-int/2addr v2, v0

    invoke-static {p3, p4, v2}, LY0/c;->i(JI)I

    move-result v4

    invoke-virtual {p2}, LD0/X;->w0()I

    move-result v0

    add-int/2addr v0, v1

    invoke-static {p3, p4, v0}, LY0/c;->h(JI)I

    move-result v5

    new-instance v7, Landroidx/compose/foundation/layout/o$a;

    invoke-direct {v7, p2, p1, p0}, Landroidx/compose/foundation/layout/o$a;-><init>(LD0/X;LD0/M;Landroidx/compose/foundation/layout/o;)V

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v6, 0x0

    move-object v3, p1

    invoke-static/range {v3 .. v9}, LD0/L;->b(LD0/M;IILjava/util/Map;Lx7/l;ILjava/lang/Object;)LD0/K;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Padding must be non-negative"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public synthetic k(LD0/o;LD0/n;I)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, LF0/D;->a(LF0/E;LD0/o;LD0/n;I)I

    move-result p1

    return p1
.end method

.method public synthetic t(LD0/o;LD0/n;I)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, LF0/D;->c(LF0/E;LD0/o;LD0/n;I)I

    move-result p1

    return p1
.end method
