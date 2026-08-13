.class final Landroidx/compose/foundation/layout/n;
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

    iput p1, p0, Landroidx/compose/foundation/layout/n;->P:F

    iput p2, p0, Landroidx/compose/foundation/layout/n;->Q:F

    iput p3, p0, Landroidx/compose/foundation/layout/n;->R:F

    iput p4, p0, Landroidx/compose/foundation/layout/n;->S:F

    iput-boolean p5, p0, Landroidx/compose/foundation/layout/n;->T:Z

    return-void
.end method

.method public synthetic constructor <init>(FFFFZLy7/k;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Landroidx/compose/foundation/layout/n;-><init>(FFFFZ)V

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

.method public final T1()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/layout/n;->T:Z

    return v0
.end method

.method public final U1()F
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/layout/n;->P:F

    return v0
.end method

.method public final V1()F
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/layout/n;->Q:F

    return v0
.end method

.method public final W1(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/foundation/layout/n;->S:F

    return-void
.end method

.method public final X1(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/foundation/layout/n;->R:F

    return-void
.end method

.method public final Y1(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/foundation/layout/n;->T:Z

    return-void
.end method

.method public final Z1(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/foundation/layout/n;->P:F

    return-void
.end method

.method public final a2(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/foundation/layout/n;->Q:F

    return-void
.end method

.method public f(LD0/M;LD0/G;J)LD0/K;
    .locals 10

    iget v0, p0, Landroidx/compose/foundation/layout/n;->P:F

    invoke-interface {p1, v0}, LY0/e;->S0(F)I

    move-result v0

    iget v1, p0, Landroidx/compose/foundation/layout/n;->R:F

    invoke-interface {p1, v1}, LY0/e;->S0(F)I

    move-result v1

    add-int/2addr v0, v1

    iget v1, p0, Landroidx/compose/foundation/layout/n;->Q:F

    invoke-interface {p1, v1}, LY0/e;->S0(F)I

    move-result v1

    iget v2, p0, Landroidx/compose/foundation/layout/n;->S:F

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

    new-instance v7, Landroidx/compose/foundation/layout/n$a;

    invoke-direct {v7, p0, p2, p1}, Landroidx/compose/foundation/layout/n$a;-><init>(Landroidx/compose/foundation/layout/n;LD0/X;LD0/M;)V

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v6, 0x0

    move-object v3, p1

    invoke-static/range {v3 .. v9}, LD0/L;->b(LD0/M;IILjava/util/Map;Lx7/l;ILjava/lang/Object;)LD0/K;

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
