.class final Landroidx/compose/foundation/layout/g;
.super Landroidx/compose/ui/d$c;
.source "SourceFile"

# interfaces
.implements LF0/E;


# instance fields
.field private P:LA/o;

.field private Q:F


# direct methods
.method public constructor <init>(LA/o;F)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/d$c;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/layout/g;->P:LA/o;

    iput p2, p0, Landroidx/compose/foundation/layout/g;->Q:F

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

.method public final T1(LA/o;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/layout/g;->P:LA/o;

    return-void
.end method

.method public final U1(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/foundation/layout/g;->Q:F

    return-void
.end method

.method public f(LD0/M;LD0/G;J)LD0/K;
    .locals 7

    .prologue
    invoke-static {p3, p4}, LY0/b;->h(J)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/foundation/layout/g;->P:LA/o;

    sget-object v1, LA/o;->C:LA/o;

    if-eq v0, v1, :cond_0

    invoke-static {p3, p4}, LY0/b;->l(J)I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Landroidx/compose/foundation/layout/g;->Q:F

    mul-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-static {p3, p4}, LY0/b;->n(J)I

    move-result v1

    invoke-static {p3, p4}, LY0/b;->l(J)I

    move-result v2

    invoke-static {v0, v1, v2}, LE7/j;->k(III)I

    move-result v0

    move v1, v0

    goto :goto_0

    :cond_0
    invoke-static {p3, p4}, LY0/b;->n(J)I

    move-result v0

    invoke-static {p3, p4}, LY0/b;->l(J)I

    move-result v1

    :goto_0
    invoke-static {p3, p4}, LY0/b;->g(J)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Landroidx/compose/foundation/layout/g;->P:LA/o;

    sget-object v3, LA/o;->D:LA/o;

    if-eq v2, v3, :cond_1

    invoke-static {p3, p4}, LY0/b;->k(J)I

    move-result v2

    int-to-float v2, v2

    iget v3, p0, Landroidx/compose/foundation/layout/g;->Q:F

    mul-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    invoke-static {p3, p4}, LY0/b;->m(J)I

    move-result v3

    invoke-static {p3, p4}, LY0/b;->k(J)I

    move-result p3

    invoke-static {v2, v3, p3}, LE7/j;->k(III)I

    move-result p3

    move p4, p3

    goto :goto_1

    :cond_1
    invoke-static {p3, p4}, LY0/b;->m(J)I

    move-result v2

    invoke-static {p3, p4}, LY0/b;->k(J)I

    move-result p3

    move p4, p3

    move p3, v2

    :goto_1
    invoke-static {v0, v1, p3, p4}, LY0/c;->a(IIII)J

    move-result-wide p3

    invoke-interface {p2, p3, p4}, LD0/G;->U(J)LD0/X;

    move-result-object p2

    invoke-virtual {p2}, LD0/X;->I0()I

    move-result v1

    invoke-virtual {p2}, LD0/X;->w0()I

    move-result v2

    new-instance v4, Landroidx/compose/foundation/layout/g$a;

    invoke-direct {v4, p2}, Landroidx/compose/foundation/layout/g$a;-><init>(LD0/X;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, LD0/L;->b(LD0/M;IILjava/util/Map;Lx7/l;ILjava/lang/Object;)LD0/K;

    move-result-object p1

    return-object p1
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
