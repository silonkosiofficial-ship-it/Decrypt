.class public final Landroidx/compose/foundation/FocusableKt$FocusableInNonTouchModeElement$1;
.super LF0/W;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/foundation/FocusableKt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LF0/W;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u01f2"
    }
    d2 = {
        "\u01f3",
        "\u01f4",
        "\u01f5",
        "\u01f6",
        "\u01f7",
        "\u01f8",
        "\u01f9",
        "\u01fa",
        "\u01fb",
        "",
        "\u01fc",
        "\u01fd",
        "",
        "\u01fe",
        "",
        "\u01ff",
        "\u0200",
        "\u0201"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, LF0/W;-><init>()V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 0

    .prologue
    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public bridge synthetic g()Landroidx/compose/ui/d$c;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/foundation/FocusableKt$FocusableInNonTouchModeElement$1;->l()Lv/x;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    invoke-static {p0}, Lv/B;->a(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public bridge synthetic j(Landroidx/compose/ui/d$c;)V
    .locals 0

    check-cast p1, Lv/x;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/FocusableKt$FocusableInNonTouchModeElement$1;->m(Lv/x;)V

    return-void
.end method

.method public l()Lv/x;
    .locals 1

    new-instance v0, Lv/x;

    invoke-direct {v0}, Lv/x;-><init>()V

    return-object v0
.end method

.method public m(Lv/x;)V
    .locals 0

    return-void
.end method
