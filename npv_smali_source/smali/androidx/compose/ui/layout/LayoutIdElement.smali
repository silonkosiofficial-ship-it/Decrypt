.class final Landroidx/compose/ui/layout/LayoutIdElement;
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
        "\u0912"
    }
    d2 = {
        "\u0913",
        "\u0914",
        "\u0915",
        "",
        "\u0916",
        "\u0917",
        "\u0918",
        "\u0919",
        "\u091a",
        "\u091b",
        "\u091c",
        "\u091d",
        "\u091e",
        "",
        "\u091f",
        "\u0920",
        "",
        "\u0921",
        "\u0922",
        "\u0923",
        "",
        "\u0924",
        "\u0925",
        "\u0926",
        "\u0927",
        "\u0928"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, LF0/W;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/layout/LayoutIdElement;->b:Ljava/lang/Object;

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
    instance-of v1, p1, Landroidx/compose/ui/layout/LayoutIdElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/ui/layout/LayoutIdElement;

    iget-object v1, p0, Landroidx/compose/ui/layout/LayoutIdElement;->b:Ljava/lang/Object;

    iget-object p1, p1, Landroidx/compose/ui/layout/LayoutIdElement;->b:Ljava/lang/Object;

    invoke-static {v1, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public bridge synthetic g()Landroidx/compose/ui/d$c;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/layout/LayoutIdElement;->l()LD0/v;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/LayoutIdElement;->b:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public bridge synthetic j(Landroidx/compose/ui/d$c;)V
    .locals 0

    check-cast p1, LD0/v;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/layout/LayoutIdElement;->m(LD0/v;)V

    return-void
.end method

.method public l()LD0/v;
    .locals 2

    new-instance v0, LD0/v;

    iget-object v1, p0, Landroidx/compose/ui/layout/LayoutIdElement;->b:Ljava/lang/Object;

    invoke-direct {v0, v1}, LD0/v;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public m(LD0/v;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/LayoutIdElement;->b:Ljava/lang/Object;

    invoke-virtual {p1, v0}, LD0/v;->T1(Ljava/lang/Object;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "LayoutIdElement(layoutId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/ui/layout/LayoutIdElement;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
