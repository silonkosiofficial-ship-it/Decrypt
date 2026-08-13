.class final Landroidx/compose/ui/focus/FocusChangedElement;
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
        "\u0777"
    }
    d2 = {
        "\u0778",
        "\u0779",
        "\u077a",
        "\u077b",
        "\u077c",
        "\u077d",
        "\u077e",
        "\u077f",
        "\u0780",
        "\u0781",
        "\u0782",
        "\u0783",
        "\u0784",
        "\u0785",
        "",
        "\u0786",
        "\u0787",
        "",
        "\u0788",
        "\u0789",
        "",
        "\u078a",
        "",
        "\u078b",
        "\u078c",
        "\u078d",
        "\u078e",
        "\u078f",
        "\u0790",
        "\u0791"
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

    iput-object p1, p0, Landroidx/compose/ui/focus/FocusChangedElement;->b:Lx7/l;

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
    instance-of v1, p1, Landroidx/compose/ui/focus/FocusChangedElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/ui/focus/FocusChangedElement;

    iget-object v1, p0, Landroidx/compose/ui/focus/FocusChangedElement;->b:Lx7/l;

    iget-object p1, p1, Landroidx/compose/ui/focus/FocusChangedElement;->b:Lx7/l;

    invoke-static {v1, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public bridge synthetic g()Landroidx/compose/ui/d$c;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusChangedElement;->l()Landroidx/compose/ui/focus/c;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusChangedElement;->b:Lx7/l;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public bridge synthetic j(Landroidx/compose/ui/d$c;)V
    .locals 0

    check-cast p1, Landroidx/compose/ui/focus/c;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/focus/FocusChangedElement;->m(Landroidx/compose/ui/focus/c;)V

    return-void
.end method

.method public l()Landroidx/compose/ui/focus/c;
    .locals 2

    new-instance v0, Landroidx/compose/ui/focus/c;

    iget-object v1, p0, Landroidx/compose/ui/focus/FocusChangedElement;->b:Lx7/l;

    invoke-direct {v0, v1}, Landroidx/compose/ui/focus/c;-><init>(Lx7/l;)V

    return-object v0
.end method

.method public m(Landroidx/compose/ui/focus/c;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusChangedElement;->b:Lx7/l;

    invoke-virtual {p1, v0}, Landroidx/compose/ui/focus/c;->T1(Lx7/l;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FocusChangedElement(onFocusChanged="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/ui/focus/FocusChangedElement;->b:Lx7/l;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
