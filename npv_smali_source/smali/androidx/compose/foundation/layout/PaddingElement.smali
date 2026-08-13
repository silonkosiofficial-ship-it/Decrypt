.class final Landroidx/compose/foundation/layout/PaddingElement;
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
        "\u03e8"
    }
    d2 = {
        "\u03e9",
        "\u03ea",
        "\u03eb",
        "\u03ec",
        "\u03ed",
        "\u03ee",
        "\u03ef",
        "\u03f0",
        "",
        "\u03f1",
        "\u03f2",
        "\u03f3",
        "\u03f4",
        "\u03f5",
        "\u03f6",
        "\u03f7",
        "\u03f8",
        "\u03f9",
        "\u03fa",
        "\u03fb",
        "\u03fc",
        "",
        "\u03fd",
        "\u03fe",
        "",
        "\u03ff",
        "\u0400",
        "\u0401",
        "\u0402",
        "\u0403",
        "\u0404",
        "\u0405",
        "\u0406",
        "\u0407",
        "\u0408",
        "\u0409",
        "\u040a",
        "\u040b",
        "\u040c",
        "\u040d",
        "\u040e",
        "\u040f",
        "\u0410",
        "\u0411",
        "\u0412",
        "\u0413",
        "\u0414",
        "\u0415",
        "\u0416",
        "\u0417",
        "\u0418",
        "\u0419",
        "\u041a",
        "\u041b"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private b:F

.field private c:F

.field private d:F

.field private e:F

.field private f:Z

.field private final g:Lx7/l;


# direct methods
.method private constructor <init>(FFFFZLx7/l;)V
    .locals 0

    .prologue
    invoke-direct {p0}, LF0/W;-><init>()V

    iput p1, p0, Landroidx/compose/foundation/layout/PaddingElement;->b:F

    iput p2, p0, Landroidx/compose/foundation/layout/PaddingElement;->c:F

    iput p3, p0, Landroidx/compose/foundation/layout/PaddingElement;->d:F

    iput p4, p0, Landroidx/compose/foundation/layout/PaddingElement;->e:F

    iput-boolean p5, p0, Landroidx/compose/foundation/layout/PaddingElement;->f:Z

    iput-object p6, p0, Landroidx/compose/foundation/layout/PaddingElement;->g:Lx7/l;

    const/4 p2, 0x0

    cmpl-float p3, p1, p2

    if-gez p3, :cond_0

    sget-object p3, LY0/i;->D:LY0/i$a;

    invoke-virtual {p3}, LY0/i$a;->c()F

    move-result p3

    invoke-static {p1, p3}, LY0/i;->s(FF)Z

    move-result p1

    if-eqz p1, :cond_3

    :cond_0
    iget p1, p0, Landroidx/compose/foundation/layout/PaddingElement;->c:F

    cmpl-float p3, p1, p2

    if-gez p3, :cond_1

    sget-object p3, LY0/i;->D:LY0/i$a;

    invoke-virtual {p3}, LY0/i$a;->c()F

    move-result p3

    invoke-static {p1, p3}, LY0/i;->s(FF)Z

    move-result p1

    if-eqz p1, :cond_3

    :cond_1
    iget p1, p0, Landroidx/compose/foundation/layout/PaddingElement;->d:F

    cmpl-float p3, p1, p2

    if-gez p3, :cond_2

    sget-object p3, LY0/i;->D:LY0/i$a;

    invoke-virtual {p3}, LY0/i$a;->c()F

    move-result p3

    invoke-static {p1, p3}, LY0/i;->s(FF)Z

    move-result p1

    if-eqz p1, :cond_3

    :cond_2
    iget p1, p0, Landroidx/compose/foundation/layout/PaddingElement;->e:F

    cmpl-float p2, p1, p2

    if-gez p2, :cond_4

    sget-object p2, LY0/i;->D:LY0/i$a;

    invoke-virtual {p2}, LY0/i$a;->c()F

    move-result p2

    invoke-static {p1, p2}, LY0/i;->s(FF)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Padding must be non-negative"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    :goto_0
    return-void
.end method

.method public synthetic constructor <init>(FFFFZLx7/l;Ly7/k;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Landroidx/compose/foundation/layout/PaddingElement;-><init>(FFFFZLx7/l;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    instance-of v0, p1, Landroidx/compose/foundation/layout/PaddingElement;

    if-eqz v0, :cond_0

    check-cast p1, Landroidx/compose/foundation/layout/PaddingElement;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const/4 v0, 0x0

    if-nez p1, :cond_1

    return v0

    :cond_1
    iget v1, p0, Landroidx/compose/foundation/layout/PaddingElement;->b:F

    iget v2, p1, Landroidx/compose/foundation/layout/PaddingElement;->b:F

    invoke-static {v1, v2}, LY0/i;->s(FF)Z

    move-result v1

    if-eqz v1, :cond_2

    iget v1, p0, Landroidx/compose/foundation/layout/PaddingElement;->c:F

    iget v2, p1, Landroidx/compose/foundation/layout/PaddingElement;->c:F

    invoke-static {v1, v2}, LY0/i;->s(FF)Z

    move-result v1

    if-eqz v1, :cond_2

    iget v1, p0, Landroidx/compose/foundation/layout/PaddingElement;->d:F

    iget v2, p1, Landroidx/compose/foundation/layout/PaddingElement;->d:F

    invoke-static {v1, v2}, LY0/i;->s(FF)Z

    move-result v1

    if-eqz v1, :cond_2

    iget v1, p0, Landroidx/compose/foundation/layout/PaddingElement;->e:F

    iget v2, p1, Landroidx/compose/foundation/layout/PaddingElement;->e:F

    invoke-static {v1, v2}, LY0/i;->s(FF)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-boolean v1, p0, Landroidx/compose/foundation/layout/PaddingElement;->f:Z

    iget-boolean p1, p1, Landroidx/compose/foundation/layout/PaddingElement;->f:Z

    if-ne v1, p1, :cond_2

    const/4 v0, 0x1

    :cond_2
    return v0
.end method

.method public bridge synthetic g()Landroidx/compose/ui/d$c;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/foundation/layout/PaddingElement;->l()Landroidx/compose/foundation/layout/n;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Landroidx/compose/foundation/layout/PaddingElement;->b:F

    invoke-static {v0}, LY0/i;->t(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Landroidx/compose/foundation/layout/PaddingElement;->c:F

    invoke-static {v1}, LY0/i;->t(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Landroidx/compose/foundation/layout/PaddingElement;->d:F

    invoke-static {v1}, LY0/i;->t(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Landroidx/compose/foundation/layout/PaddingElement;->e:F

    invoke-static {v1}, LY0/i;->t(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Landroidx/compose/foundation/layout/PaddingElement;->f:Z

    invoke-static {v1}, Lt/h;->a(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public bridge synthetic j(Landroidx/compose/ui/d$c;)V
    .locals 0

    check-cast p1, Landroidx/compose/foundation/layout/n;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/layout/PaddingElement;->m(Landroidx/compose/foundation/layout/n;)V

    return-void
.end method

.method public l()Landroidx/compose/foundation/layout/n;
    .locals 8

    new-instance v7, Landroidx/compose/foundation/layout/n;

    iget v1, p0, Landroidx/compose/foundation/layout/PaddingElement;->b:F

    iget v2, p0, Landroidx/compose/foundation/layout/PaddingElement;->c:F

    iget v3, p0, Landroidx/compose/foundation/layout/PaddingElement;->d:F

    iget v4, p0, Landroidx/compose/foundation/layout/PaddingElement;->e:F

    iget-boolean v5, p0, Landroidx/compose/foundation/layout/PaddingElement;->f:Z

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Landroidx/compose/foundation/layout/n;-><init>(FFFFZLy7/k;)V

    return-object v7
.end method

.method public m(Landroidx/compose/foundation/layout/n;)V
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/layout/PaddingElement;->b:F

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/layout/n;->Z1(F)V

    iget v0, p0, Landroidx/compose/foundation/layout/PaddingElement;->c:F

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/layout/n;->a2(F)V

    iget v0, p0, Landroidx/compose/foundation/layout/PaddingElement;->d:F

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/layout/n;->X1(F)V

    iget v0, p0, Landroidx/compose/foundation/layout/PaddingElement;->e:F

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/layout/n;->W1(F)V

    iget-boolean v0, p0, Landroidx/compose/foundation/layout/PaddingElement;->f:Z

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/layout/n;->Y1(Z)V

    return-void
.end method
