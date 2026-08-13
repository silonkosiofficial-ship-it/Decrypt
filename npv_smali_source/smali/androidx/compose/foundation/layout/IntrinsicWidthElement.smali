.class final Landroidx/compose/foundation/layout/IntrinsicWidthElement;
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
        "\u0383"
    }
    d2 = {
        "\u0384",
        "\u0385",
        "\u0386",
        "\u0387",
        "\u0388",
        "",
        "\u0389",
        "\u038a",
        "\u038b",
        "\u038c",
        "\u038d",
        "\u038e",
        "\u038f",
        "\u0390",
        "\u0391",
        "\u0392",
        "\u0393",
        "\u0394",
        "",
        "\u0395",
        "\u0396",
        "\u0397",
        "",
        "\u0398",
        "\u0399",
        "\u039a",
        "\u039b",
        "\u039c",
        "\u039d",
        "\u039e",
        "\u039f",
        "\u03a0",
        "\u03a1",
        "\u03a2",
        "\u03a3",
        "\u03a4",
        "\u03a5",
        "\u03a6"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final b:LA/y;

.field private final c:Z

.field private final d:Lx7/l;


# direct methods
.method public constructor <init>(LA/y;ZLx7/l;)V
    .locals 0

    invoke-direct {p0}, LF0/W;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/layout/IntrinsicWidthElement;->b:LA/y;

    iput-boolean p2, p0, Landroidx/compose/foundation/layout/IntrinsicWidthElement;->c:Z

    iput-object p3, p0, Landroidx/compose/foundation/layout/IntrinsicWidthElement;->d:Lx7/l;

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
    instance-of v1, p1, Landroidx/compose/foundation/layout/IntrinsicWidthElement;

    if-eqz v1, :cond_1

    check-cast p1, Landroidx/compose/foundation/layout/IntrinsicWidthElement;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    const/4 v1, 0x0

    if-nez p1, :cond_2

    return v1

    :cond_2
    iget-object v2, p0, Landroidx/compose/foundation/layout/IntrinsicWidthElement;->b:LA/y;

    iget-object v3, p1, Landroidx/compose/foundation/layout/IntrinsicWidthElement;->b:LA/y;

    if-ne v2, v3, :cond_3

    iget-boolean v2, p0, Landroidx/compose/foundation/layout/IntrinsicWidthElement;->c:Z

    iget-boolean p1, p1, Landroidx/compose/foundation/layout/IntrinsicWidthElement;->c:Z

    if-ne v2, p1, :cond_3

    goto :goto_1

    :cond_3
    move v0, v1

    :goto_1
    return v0
.end method

.method public bridge synthetic g()Landroidx/compose/ui/d$c;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/foundation/layout/IntrinsicWidthElement;->l()Landroidx/compose/foundation/layout/j;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Landroidx/compose/foundation/layout/IntrinsicWidthElement;->b:LA/y;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Landroidx/compose/foundation/layout/IntrinsicWidthElement;->c:Z

    invoke-static {v1}, Lt/h;->a(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public bridge synthetic j(Landroidx/compose/ui/d$c;)V
    .locals 0

    check-cast p1, Landroidx/compose/foundation/layout/j;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/layout/IntrinsicWidthElement;->m(Landroidx/compose/foundation/layout/j;)V

    return-void
.end method

.method public l()Landroidx/compose/foundation/layout/j;
    .locals 3

    new-instance v0, Landroidx/compose/foundation/layout/j;

    iget-object v1, p0, Landroidx/compose/foundation/layout/IntrinsicWidthElement;->b:LA/y;

    iget-boolean v2, p0, Landroidx/compose/foundation/layout/IntrinsicWidthElement;->c:Z

    invoke-direct {v0, v1, v2}, Landroidx/compose/foundation/layout/j;-><init>(LA/y;Z)V

    return-object v0
.end method

.method public m(Landroidx/compose/foundation/layout/j;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/layout/IntrinsicWidthElement;->b:LA/y;

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/layout/j;->W1(LA/y;)V

    iget-boolean v0, p0, Landroidx/compose/foundation/layout/IntrinsicWidthElement;->c:Z

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/layout/j;->V1(Z)V

    return-void
.end method
