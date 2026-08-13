.class public final Landroidx/compose/foundation/layout/LayoutWeightElement;
.super LF0/W;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LF0/W;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u03a7"
    }
    d2 = {
        "\u03a8",
        "\u03a9",
        "\u03aa",
        "",
        "\u03ab",
        "",
        "\u03ac",
        "\u03ad",
        "\u03ae",
        "\u03af",
        "\u03b0",
        "\u03b1",
        "\u03b2",
        "\u03b3",
        "\u03b4",
        "",
        "\u03b5",
        "\u03b6",
        "",
        "\u03b7",
        "\u03b8",
        "\u03b9",
        "\u03ba",
        "\u03bb",
        "\u03bc",
        "\u03bd",
        "\u03be",
        "\u03bf",
        "\u03c0",
        "\u03c1",
        "\u03c2"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final b:F

.field private final c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(FZ)V
    .locals 0

    invoke-direct {p0}, LF0/W;-><init>()V

    iput p1, p0, Landroidx/compose/foundation/layout/LayoutWeightElement;->b:F

    iput-boolean p2, p0, Landroidx/compose/foundation/layout/LayoutWeightElement;->c:Z

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/foundation/layout/LayoutWeightElement;

    if-eqz v1, :cond_1

    check-cast p1, Landroidx/compose/foundation/layout/LayoutWeightElement;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    const/4 v1, 0x0

    if-nez p1, :cond_2

    return v1

    :cond_2
    iget v2, p0, Landroidx/compose/foundation/layout/LayoutWeightElement;->b:F

    iget v3, p1, Landroidx/compose/foundation/layout/LayoutWeightElement;->b:F

    cmpg-float v2, v2, v3

    if-nez v2, :cond_3

    iget-boolean v2, p0, Landroidx/compose/foundation/layout/LayoutWeightElement;->c:Z

    iget-boolean p1, p1, Landroidx/compose/foundation/layout/LayoutWeightElement;->c:Z

    if-ne v2, p1, :cond_3

    goto :goto_1

    :cond_3
    move v0, v1

    :goto_1
    return v0
.end method

.method public bridge synthetic g()Landroidx/compose/ui/d$c;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/foundation/layout/LayoutWeightElement;->l()LA/z;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Landroidx/compose/foundation/layout/LayoutWeightElement;->b:F

    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Landroidx/compose/foundation/layout/LayoutWeightElement;->c:Z

    invoke-static {v1}, Lt/h;->a(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public bridge synthetic j(Landroidx/compose/ui/d$c;)V
    .locals 0

    check-cast p1, LA/z;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/layout/LayoutWeightElement;->m(LA/z;)V

    return-void
.end method

.method public l()LA/z;
    .locals 3

    new-instance v0, LA/z;

    iget v1, p0, Landroidx/compose/foundation/layout/LayoutWeightElement;->b:F

    iget-boolean v2, p0, Landroidx/compose/foundation/layout/LayoutWeightElement;->c:Z

    invoke-direct {v0, v1, v2}, LA/z;-><init>(FZ)V

    return-object v0
.end method

.method public m(LA/z;)V
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/layout/LayoutWeightElement;->b:F

    invoke-virtual {p1, v0}, LA/z;->V1(F)V

    iget-boolean v0, p0, Landroidx/compose/foundation/layout/LayoutWeightElement;->c:Z

    invoke-virtual {p1, v0}, LA/z;->U1(Z)V

    return-void
.end method
