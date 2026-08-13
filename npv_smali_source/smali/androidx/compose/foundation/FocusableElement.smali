.class final Landroidx/compose/foundation/FocusableElement;
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
        "\u01dc"
    }
    d2 = {
        "\u01dd",
        "\u01de",
        "\u01df",
        "\u01e0",
        "\u01e1",
        "\u01e2",
        "\u01e3",
        "\u01e4",
        "\u01e5",
        "\u01e6",
        "\u01e7",
        "\u01e8",
        "\u01e9",
        "",
        "\u01ea",
        "",
        "\u01eb",
        "\u01ec",
        "",
        "\u01ed",
        "\u01ee",
        "\u01ef",
        "\u01f0",
        "\u01f1"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final b:Lz/l;


# direct methods
.method public constructor <init>(Lz/l;)V
    .locals 0

    invoke-direct {p0}, LF0/W;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/FocusableElement;->b:Lz/l;

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
    instance-of v1, p1, Landroidx/compose/foundation/FocusableElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget-object v1, p0, Landroidx/compose/foundation/FocusableElement;->b:Lz/l;

    check-cast p1, Landroidx/compose/foundation/FocusableElement;

    iget-object p1, p1, Landroidx/compose/foundation/FocusableElement;->b:Lz/l;

    invoke-static {v1, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public bridge synthetic g()Landroidx/compose/ui/d$c;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/foundation/FocusableElement;->l()Lv/z;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/compose/foundation/FocusableElement;->b:Lz/l;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public bridge synthetic j(Landroidx/compose/ui/d$c;)V
    .locals 0

    check-cast p1, Lv/z;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/FocusableElement;->m(Lv/z;)V

    return-void
.end method

.method public l()Lv/z;
    .locals 2

    new-instance v0, Lv/z;

    iget-object v1, p0, Landroidx/compose/foundation/FocusableElement;->b:Lz/l;

    invoke-direct {v0, v1}, Lv/z;-><init>(Lz/l;)V

    return-object v0
.end method

.method public m(Lv/z;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/FocusableElement;->b:Lz/l;

    invoke-virtual {p1, v0}, Lv/z;->Z1(Lz/l;)V

    return-void
.end method
