.class final Landroidx/compose/ui/input/key/KeyInputElement;
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
        "\u0854"
    }
    d2 = {
        "\u0855",
        "\u0856",
        "\u0857",
        "\u0858",
        "\u0859",
        "",
        "\u085a",
        "\u085b",
        "\u085c",
        "\u085d",
        "\u085e",
        "\u085f",
        "\u0860",
        "\u0861",
        "\u0862",
        "\u0863",
        "",
        "\u0864",
        "\u0865",
        "",
        "\u0866",
        "\u0867",
        "",
        "\u0868",
        "\u0869",
        "\u086a",
        "\u086b",
        "\u086c",
        "\u086d",
        "\u086e",
        "\u086f",
        "\u0870",
        "\u0871"
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

.field private final c:Lx7/l;


# direct methods
.method public constructor <init>(Lx7/l;Lx7/l;)V
    .locals 0

    invoke-direct {p0}, LF0/W;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/input/key/KeyInputElement;->b:Lx7/l;

    iput-object p2, p0, Landroidx/compose/ui/input/key/KeyInputElement;->c:Lx7/l;

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
    instance-of v1, p1, Landroidx/compose/ui/input/key/KeyInputElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/ui/input/key/KeyInputElement;

    iget-object v1, p0, Landroidx/compose/ui/input/key/KeyInputElement;->b:Lx7/l;

    iget-object v3, p1, Landroidx/compose/ui/input/key/KeyInputElement;->b:Lx7/l;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Landroidx/compose/ui/input/key/KeyInputElement;->c:Lx7/l;

    iget-object p1, p1, Landroidx/compose/ui/input/key/KeyInputElement;->c:Lx7/l;

    invoke-static {v1, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public bridge synthetic g()Landroidx/compose/ui/d$c;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/input/key/KeyInputElement;->l()Landroidx/compose/ui/input/key/b;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/input/key/KeyInputElement;->b:Lx7/l;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Landroidx/compose/ui/input/key/KeyInputElement;->c:Lx7/l;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public bridge synthetic j(Landroidx/compose/ui/d$c;)V
    .locals 0

    check-cast p1, Landroidx/compose/ui/input/key/b;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/input/key/KeyInputElement;->m(Landroidx/compose/ui/input/key/b;)V

    return-void
.end method

.method public l()Landroidx/compose/ui/input/key/b;
    .locals 3

    new-instance v0, Landroidx/compose/ui/input/key/b;

    iget-object v1, p0, Landroidx/compose/ui/input/key/KeyInputElement;->b:Lx7/l;

    iget-object v2, p0, Landroidx/compose/ui/input/key/KeyInputElement;->c:Lx7/l;

    invoke-direct {v0, v1, v2}, Landroidx/compose/ui/input/key/b;-><init>(Lx7/l;Lx7/l;)V

    return-object v0
.end method

.method public m(Landroidx/compose/ui/input/key/b;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/input/key/KeyInputElement;->b:Lx7/l;

    invoke-virtual {p1, v0}, Landroidx/compose/ui/input/key/b;->T1(Lx7/l;)V

    iget-object v0, p0, Landroidx/compose/ui/input/key/KeyInputElement;->c:Lx7/l;

    invoke-virtual {p1, v0}, Landroidx/compose/ui/input/key/b;->U1(Lx7/l;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "KeyInputElement(onKeyEvent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/ui/input/key/KeyInputElement;->b:Lx7/l;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", onPreKeyEvent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/ui/input/key/KeyInputElement;->c:Lx7/l;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
