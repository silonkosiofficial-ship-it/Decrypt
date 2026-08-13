.class final Landroidx/compose/foundation/layout/OffsetPxElement;
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
        "\u03c3"
    }
    d2 = {
        "\u03c4",
        "\u03c5",
        "\u03c6",
        "\u03c7",
        "\u03c8",
        "\u03c9",
        "\u03ca",
        "",
        "\u03cb",
        "\u03cc",
        "\u03cd",
        "\u03ce",
        "\u03cf",
        "\u03d0",
        "\u03d1",
        "\u03d2",
        "\u03d3",
        "\u03d4",
        "\u03d5",
        "",
        "\u03d6",
        "\u03d7",
        "\u03d8",
        "",
        "\u03d9",
        "\u03da",
        "",
        "\u03db",
        "\u03dc",
        "\u03dd",
        "\u03de",
        "\u03df",
        "\u03e0",
        "\u03e1",
        "\u03e2",
        "\u03e3",
        "\u03e4",
        "\u03e5",
        "\u03e6",
        "\u03e7"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final b:Lx7/l;

.field private final c:Z

.field private final d:Lx7/l;


# direct methods
.method public constructor <init>(Lx7/l;ZLx7/l;)V
    .locals 0

    invoke-direct {p0}, LF0/W;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/layout/OffsetPxElement;->b:Lx7/l;

    iput-boolean p2, p0, Landroidx/compose/foundation/layout/OffsetPxElement;->c:Z

    iput-object p3, p0, Landroidx/compose/foundation/layout/OffsetPxElement;->d:Lx7/l;

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
    instance-of v1, p1, Landroidx/compose/foundation/layout/OffsetPxElement;

    if-eqz v1, :cond_1

    check-cast p1, Landroidx/compose/foundation/layout/OffsetPxElement;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    const/4 v1, 0x0

    if-nez p1, :cond_2

    return v1

    :cond_2
    iget-object v2, p0, Landroidx/compose/foundation/layout/OffsetPxElement;->b:Lx7/l;

    iget-object v3, p1, Landroidx/compose/foundation/layout/OffsetPxElement;->b:Lx7/l;

    if-ne v2, v3, :cond_3

    iget-boolean v2, p0, Landroidx/compose/foundation/layout/OffsetPxElement;->c:Z

    iget-boolean p1, p1, Landroidx/compose/foundation/layout/OffsetPxElement;->c:Z

    if-ne v2, p1, :cond_3

    goto :goto_1

    :cond_3
    move v0, v1

    :goto_1
    return v0
.end method

.method public bridge synthetic g()Landroidx/compose/ui/d$c;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/foundation/layout/OffsetPxElement;->l()Landroidx/compose/foundation/layout/l;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Landroidx/compose/foundation/layout/OffsetPxElement;->b:Lx7/l;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Landroidx/compose/foundation/layout/OffsetPxElement;->c:Z

    invoke-static {v1}, Lt/h;->a(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public bridge synthetic j(Landroidx/compose/ui/d$c;)V
    .locals 0

    check-cast p1, Landroidx/compose/foundation/layout/l;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/layout/OffsetPxElement;->m(Landroidx/compose/foundation/layout/l;)V

    return-void
.end method

.method public l()Landroidx/compose/foundation/layout/l;
    .locals 3

    new-instance v0, Landroidx/compose/foundation/layout/l;

    iget-object v1, p0, Landroidx/compose/foundation/layout/OffsetPxElement;->b:Lx7/l;

    iget-boolean v2, p0, Landroidx/compose/foundation/layout/OffsetPxElement;->c:Z

    invoke-direct {v0, v1, v2}, Landroidx/compose/foundation/layout/l;-><init>(Lx7/l;Z)V

    return-object v0
.end method

.method public m(Landroidx/compose/foundation/layout/l;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/layout/OffsetPxElement;->b:Lx7/l;

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/layout/l;->V1(Lx7/l;)V

    iget-boolean v0, p0, Landroidx/compose/foundation/layout/OffsetPxElement;->c:Z

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/layout/l;->W1(Z)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "OffsetPxModifier(offset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/foundation/layout/OffsetPxElement;->b:Lx7/l;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", rtlAware="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Landroidx/compose/foundation/layout/OffsetPxElement;->c:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
