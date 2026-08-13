.class final Landroidx/compose/ui/draw/DrawWithContentElement;
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
        "\u06f4"
    }
    d2 = {
        "\u06f5",
        "\u06f6",
        "\u06f7",
        "\u06f8",
        "\u06f9",
        "\u06fa",
        "\u06fb",
        "\u06fc",
        "\u06fd",
        "\u06fe",
        "\u06ff",
        "\u0700",
        "\u0701",
        "\u0702",
        "",
        "\u0703",
        "\u0704",
        "",
        "\u0705",
        "\u0706",
        "",
        "\u0707",
        "",
        "\u0708",
        "\u0709",
        "\u070a",
        "\u070b",
        "\u070c",
        "\u070d",
        "\u070e"
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


# direct methods
.method public constructor <init>(Lx7/l;)V
    .locals 0

    invoke-direct {p0}, LF0/W;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/draw/DrawWithContentElement;->b:Lx7/l;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/ui/draw/DrawWithContentElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/ui/draw/DrawWithContentElement;

    iget-object v1, p0, Landroidx/compose/ui/draw/DrawWithContentElement;->b:Lx7/l;

    iget-object p1, p1, Landroidx/compose/ui/draw/DrawWithContentElement;->b:Lx7/l;

    invoke-static {v1, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public bridge synthetic g()Landroidx/compose/ui/d$c;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/draw/DrawWithContentElement;->l()Landroidx/compose/ui/draw/c;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/draw/DrawWithContentElement;->b:Lx7/l;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public bridge synthetic j(Landroidx/compose/ui/d$c;)V
    .locals 0

    check-cast p1, Landroidx/compose/ui/draw/c;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/draw/DrawWithContentElement;->m(Landroidx/compose/ui/draw/c;)V

    return-void
.end method

.method public l()Landroidx/compose/ui/draw/c;
    .locals 2

    new-instance v0, Landroidx/compose/ui/draw/c;

    iget-object v1, p0, Landroidx/compose/ui/draw/DrawWithContentElement;->b:Lx7/l;

    invoke-direct {v0, v1}, Landroidx/compose/ui/draw/c;-><init>(Lx7/l;)V

    return-object v0
.end method

.method public m(Landroidx/compose/ui/draw/c;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/draw/DrawWithContentElement;->b:Lx7/l;

    invoke-virtual {p1, v0}, Landroidx/compose/ui/draw/c;->T1(Lx7/l;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DrawWithContentElement(onDraw="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/ui/draw/DrawWithContentElement;->b:Lx7/l;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
