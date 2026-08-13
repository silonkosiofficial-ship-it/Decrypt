.class final Landroidx/compose/foundation/lazy/ParentSizeElement;
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
        "\u04a2"
    }
    d2 = {
        "\u04a3",
        "\u04a4",
        "\u04a5",
        "",
        "\u04a6",
        "\u04a7",
        "",
        "\u04a8",
        "\u04a9",
        "",
        "\u04aa",
        "\u04ab",
        "\u04ac",
        "\u04ad",
        "\u04ae",
        "\u04af",
        "\u04b0",
        "\u04b1",
        "\u04b2",
        "",
        "\u04b3",
        "",
        "\u04b4",
        "\u04b5",
        "\u04b6",
        "\u04b7",
        "\u04b8",
        "\u04b9",
        "\u04ba",
        "\u04bb",
        "\u04bc",
        "\u04bd",
        "\u04be",
        "\u04bf",
        "\u04c0",
        "\u04c1",
        "\u04c2",
        "\u04c3",
        "\u04c4",
        "\u04c5",
        "\u04c6"
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

.field private final c:LV/G1;

.field private final d:LV/G1;

.field private final e:Ljava/lang/String;


# direct methods
.method public constructor <init>(FLV/G1;LV/G1;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, LF0/W;-><init>()V

    iput p1, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->b:F

    iput-object p2, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->c:LV/G1;

    iput-object p3, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->d:LV/G1;

    iput-object p4, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->e:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(FLV/G1;LV/G1;Ljava/lang/String;ILy7/k;)V
    .locals 1

    .prologue
    and-int/lit8 p6, p5, 0x2

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_1

    move-object p3, v0

    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/compose/foundation/lazy/ParentSizeElement;-><init>(FLV/G1;LV/G1;Ljava/lang/String;)V

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
    instance-of v1, p1, Landroidx/compose/foundation/lazy/ParentSizeElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget v1, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->b:F

    check-cast p1, Landroidx/compose/foundation/lazy/ParentSizeElement;

    iget v3, p1, Landroidx/compose/foundation/lazy/ParentSizeElement;->b:F

    cmpg-float v1, v1, v3

    if-nez v1, :cond_2

    iget-object v1, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->c:LV/G1;

    iget-object v3, p1, Landroidx/compose/foundation/lazy/ParentSizeElement;->c:LV/G1;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->d:LV/G1;

    iget-object p1, p1, Landroidx/compose/foundation/lazy/ParentSizeElement;->d:LV/G1;

    invoke-static {v1, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public bridge synthetic g()Landroidx/compose/ui/d$c;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/ParentSizeElement;->l()Landroidx/compose/foundation/lazy/b;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    iget-object v0, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->c:LV/G1;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->d:LV/G1;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :cond_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->b:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public bridge synthetic j(Landroidx/compose/ui/d$c;)V
    .locals 0

    check-cast p1, Landroidx/compose/foundation/lazy/b;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/lazy/ParentSizeElement;->m(Landroidx/compose/foundation/lazy/b;)V

    return-void
.end method

.method public l()Landroidx/compose/foundation/lazy/b;
    .locals 4

    new-instance v0, Landroidx/compose/foundation/lazy/b;

    iget v1, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->b:F

    iget-object v2, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->c:LV/G1;

    iget-object v3, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->d:LV/G1;

    invoke-direct {v0, v1, v2, v3}, Landroidx/compose/foundation/lazy/b;-><init>(FLV/G1;LV/G1;)V

    return-object v0
.end method

.method public m(Landroidx/compose/foundation/lazy/b;)V
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->b:F

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/lazy/b;->T1(F)V

    iget-object v0, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->c:LV/G1;

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/lazy/b;->V1(LV/G1;)V

    iget-object v0, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->d:LV/G1;

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/lazy/b;->U1(LV/G1;)V

    return-void
.end method
