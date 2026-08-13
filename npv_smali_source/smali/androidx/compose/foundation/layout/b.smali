.class final Landroidx/compose/foundation/layout/b;
.super Landroidx/compose/ui/d$c;
.source "SourceFile"

# interfaces
.implements LF0/E;


# instance fields
.field private P:LD0/a;

.field private Q:F

.field private R:F


# direct methods
.method private constructor <init>(LD0/a;FF)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/d$c;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/layout/b;->P:LD0/a;

    iput p2, p0, Landroidx/compose/foundation/layout/b;->Q:F

    iput p3, p0, Landroidx/compose/foundation/layout/b;->R:F

    return-void
.end method

.method public synthetic constructor <init>(LD0/a;FFLy7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/foundation/layout/b;-><init>(LD0/a;FF)V

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

    iput p1, p0, Landroidx/compose/foundation/layout/b;->R:F

    return-void
.end method

.method public final U1(LD0/a;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/layout/b;->P:LD0/a;

    return-void
.end method

.method public final V1(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/foundation/layout/b;->Q:F

    return-void
.end method

.method public f(LD0/M;LD0/G;J)LD0/K;
    .locals 7

    iget-object v1, p0, Landroidx/compose/foundation/layout/b;->P:LD0/a;

    iget v2, p0, Landroidx/compose/foundation/layout/b;->Q:F

    iget v3, p0, Landroidx/compose/foundation/layout/b;->R:F

    move-object v0, p1

    move-object v4, p2

    move-wide v5, p3

    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/layout/a;->a(LD0/M;LD0/a;FFLD0/G;J)LD0/K;

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
