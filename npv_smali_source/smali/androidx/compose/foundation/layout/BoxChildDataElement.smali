.class final Landroidx/compose/foundation/layout/BoxChildDataElement;
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
        "\u0329"
    }
    d2 = {
        "\u032a",
        "\u032b",
        "\u032c",
        "\u032d",
        "\u032e",
        "",
        "\u032f",
        "\u0330",
        "\u0331",
        "\u0332",
        "\u0333",
        "\u0334",
        "\u0335",
        "\u0336",
        "\u0337",
        "\u0338",
        "\u0339",
        "\u033a",
        "",
        "\u033b",
        "\u033c",
        "",
        "\u033d",
        "\u033e",
        "\u033f",
        "\u0340",
        "\u0341",
        "\u0342",
        "\u0343",
        "\u0344",
        "\u0345",
        "\u0346",
        "\u0347",
        "\u0348",
        "\u0349",
        "\u034a",
        "\u034b",
        "\u034c"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final b:Lh0/c;

.field private final c:Z

.field private final d:Lx7/l;


# direct methods
.method public constructor <init>(Lh0/c;ZLx7/l;)V
    .locals 0

    invoke-direct {p0}, LF0/W;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/layout/BoxChildDataElement;->b:Lh0/c;

    iput-boolean p2, p0, Landroidx/compose/foundation/layout/BoxChildDataElement;->c:Z

    iput-object p3, p0, Landroidx/compose/foundation/layout/BoxChildDataElement;->d:Lx7/l;

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
    instance-of v1, p1, Landroidx/compose/foundation/layout/BoxChildDataElement;

    if-eqz v1, :cond_1

    check-cast p1, Landroidx/compose/foundation/layout/BoxChildDataElement;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    const/4 v1, 0x0

    if-nez p1, :cond_2

    return v1

    :cond_2
    iget-object v2, p0, Landroidx/compose/foundation/layout/BoxChildDataElement;->b:Lh0/c;

    iget-object v3, p1, Landroidx/compose/foundation/layout/BoxChildDataElement;->b:Lh0/c;

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-boolean v2, p0, Landroidx/compose/foundation/layout/BoxChildDataElement;->c:Z

    iget-boolean p1, p1, Landroidx/compose/foundation/layout/BoxChildDataElement;->c:Z

    if-ne v2, p1, :cond_3

    goto :goto_1

    :cond_3
    move v0, v1

    :goto_1
    return v0
.end method

.method public bridge synthetic g()Landroidx/compose/ui/d$c;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/foundation/layout/BoxChildDataElement;->l()Landroidx/compose/foundation/layout/c;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Landroidx/compose/foundation/layout/BoxChildDataElement;->b:Lh0/c;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Landroidx/compose/foundation/layout/BoxChildDataElement;->c:Z

    invoke-static {v1}, Lt/h;->a(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public bridge synthetic j(Landroidx/compose/ui/d$c;)V
    .locals 0

    check-cast p1, Landroidx/compose/foundation/layout/c;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/layout/BoxChildDataElement;->m(Landroidx/compose/foundation/layout/c;)V

    return-void
.end method

.method public l()Landroidx/compose/foundation/layout/c;
    .locals 3

    new-instance v0, Landroidx/compose/foundation/layout/c;

    iget-object v1, p0, Landroidx/compose/foundation/layout/BoxChildDataElement;->b:Lh0/c;

    iget-boolean v2, p0, Landroidx/compose/foundation/layout/BoxChildDataElement;->c:Z

    invoke-direct {v0, v1, v2}, Landroidx/compose/foundation/layout/c;-><init>(Lh0/c;Z)V

    return-object v0
.end method

.method public m(Landroidx/compose/foundation/layout/c;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/layout/BoxChildDataElement;->b:Lh0/c;

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/layout/c;->W1(Lh0/c;)V

    iget-boolean v0, p0, Landroidx/compose/foundation/layout/BoxChildDataElement;->c:Z

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/layout/c;->X1(Z)V

    return-void
.end method
