.class final Landroidx/compose/ui/focus/FocusPropertiesElement;
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
        "\u07a2"
    }
    d2 = {
        "\u07a3",
        "\u07a4",
        "\u07a5",
        "\u07a6",
        "\u07a7",
        "\u07a8",
        "\u07a9",
        "\u07aa",
        "\u07ab",
        "\u07ac",
        "\u07ad",
        "\u07ae",
        "\u07af",
        "",
        "\u07b0",
        "\u07b1",
        "",
        "\u07b2",
        "\u07b3",
        "",
        "\u07b4",
        "",
        "\u07b5",
        "\u07b6",
        "\u07b7",
        "\u07b8",
        "\u07b9",
        "\u07ba",
        "\u07bb"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final b:Lm0/l;


# direct methods
.method public constructor <init>(Lm0/l;)V
    .locals 0

    invoke-direct {p0}, LF0/W;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/focus/FocusPropertiesElement;->b:Lm0/l;

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
    instance-of v1, p1, Landroidx/compose/ui/focus/FocusPropertiesElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/ui/focus/FocusPropertiesElement;

    iget-object v1, p0, Landroidx/compose/ui/focus/FocusPropertiesElement;->b:Lm0/l;

    iget-object p1, p1, Landroidx/compose/ui/focus/FocusPropertiesElement;->b:Lm0/l;

    invoke-static {v1, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public bridge synthetic g()Landroidx/compose/ui/d$c;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusPropertiesElement;->l()Landroidx/compose/ui/focus/m;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusPropertiesElement;->b:Lm0/l;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public bridge synthetic j(Landroidx/compose/ui/d$c;)V
    .locals 0

    check-cast p1, Landroidx/compose/ui/focus/m;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/focus/FocusPropertiesElement;->m(Landroidx/compose/ui/focus/m;)V

    return-void
.end method

.method public l()Landroidx/compose/ui/focus/m;
    .locals 2

    new-instance v0, Landroidx/compose/ui/focus/m;

    iget-object v1, p0, Landroidx/compose/ui/focus/FocusPropertiesElement;->b:Lm0/l;

    invoke-direct {v0, v1}, Landroidx/compose/ui/focus/m;-><init>(Lm0/l;)V

    return-object v0
.end method

.method public m(Landroidx/compose/ui/focus/m;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusPropertiesElement;->b:Lm0/l;

    invoke-virtual {p1, v0}, Landroidx/compose/ui/focus/m;->T1(Lm0/l;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FocusPropertiesElement(scope="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/ui/focus/FocusPropertiesElement;->b:Lm0/l;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
