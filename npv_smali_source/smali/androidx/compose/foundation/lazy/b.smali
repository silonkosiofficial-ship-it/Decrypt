.class final Landroidx/compose/foundation/lazy/b;
.super Landroidx/compose/ui/d$c;
.source "SourceFile"

# interfaces
.implements LF0/E;


# instance fields
.field private P:F

.field private Q:LV/G1;

.field private R:LV/G1;


# direct methods
.method public constructor <init>(FLV/G1;LV/G1;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/d$c;-><init>()V

    iput p1, p0, Landroidx/compose/foundation/lazy/b;->P:F

    iput-object p2, p0, Landroidx/compose/foundation/lazy/b;->Q:LV/G1;

    iput-object p3, p0, Landroidx/compose/foundation/lazy/b;->R:LV/G1;

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

.method public final T1(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/foundation/lazy/b;->P:F

    return-void
.end method

.method public final U1(LV/G1;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/lazy/b;->R:LV/G1;

    return-void
.end method

.method public final V1(LV/G1;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/lazy/b;->Q:LV/G1;

    return-void
.end method

.method public f(LD0/M;LD0/G;J)LD0/K;
    .locals 7

    .prologue
    iget-object v0, p0, Landroidx/compose/foundation/lazy/b;->Q:LV/G1;

    const v1, 0x7fffffff

    if-eqz v0, :cond_0

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    if-eq v2, v1, :cond_0

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget v2, p0, Landroidx/compose/foundation/lazy/b;->P:F

    mul-float/2addr v0, v2

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iget-object v2, p0, Landroidx/compose/foundation/lazy/b;->R:LV/G1;

    if-eqz v2, :cond_1

    invoke-interface {v2}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    if-eq v3, v1, :cond_1

    invoke-interface {v2}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    iget v3, p0, Landroidx/compose/foundation/lazy/b;->P:F

    mul-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    if-eq v0, v1, :cond_2

    move v3, v0

    goto :goto_2

    :cond_2
    invoke-static {p3, p4}, LY0/b;->n(J)I

    move-result v3

    :goto_2
    if-eq v2, v1, :cond_3

    move v4, v2

    goto :goto_3

    :cond_3
    invoke-static {p3, p4}, LY0/b;->m(J)I

    move-result v4

    :goto_3
    if-eq v0, v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-static {p3, p4}, LY0/b;->l(J)I

    move-result v0

    :goto_4
    if-eq v2, v1, :cond_5

    goto :goto_5

    :cond_5
    invoke-static {p3, p4}, LY0/b;->k(J)I

    move-result v2

    :goto_5
    invoke-static {v3, v0, v4, v2}, LY0/c;->a(IIII)J

    move-result-wide p3

    invoke-interface {p2, p3, p4}, LD0/G;->U(J)LD0/X;

    move-result-object p2

    invoke-virtual {p2}, LD0/X;->I0()I

    move-result v1

    invoke-virtual {p2}, LD0/X;->w0()I

    move-result v2

    new-instance v4, Landroidx/compose/foundation/lazy/b$a;

    invoke-direct {v4, p2}, Landroidx/compose/foundation/lazy/b$a;-><init>(LD0/X;)V

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
