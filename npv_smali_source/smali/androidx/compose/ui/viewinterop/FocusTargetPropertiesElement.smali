.class final Landroidx/compose/ui/viewinterop/FocusTargetPropertiesElement;
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
        "\u09d3"
    }
    d2 = {
        "\u09d4",
        "\u09d5",
        "\u09d6",
        "\u09d7",
        "\u09d8",
        "\u09d9",
        "\u09da",
        "\u09db",
        "\u09dc",
        "\u09dd",
        "\u09de",
        "",
        "\u09df",
        "\u09e0",
        "",
        "\u09e1",
        "",
        "\u09e2",
        "\u09e3",
        "\u09e4"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final b:Landroidx/compose/ui/viewinterop/FocusTargetPropertiesElement;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/viewinterop/FocusTargetPropertiesElement;

    invoke-direct {v0}, Landroidx/compose/ui/viewinterop/FocusTargetPropertiesElement;-><init>()V

    sput-object v0, Landroidx/compose/ui/viewinterop/FocusTargetPropertiesElement;->b:Landroidx/compose/ui/viewinterop/FocusTargetPropertiesElement;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, LF0/W;-><init>()V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 0

    .prologue
    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public bridge synthetic g()Landroidx/compose/ui/d$c;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/FocusTargetPropertiesElement;->l()Landroidx/compose/ui/viewinterop/h;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    const v0, -0x274fed84

    return v0
.end method

.method public bridge synthetic j(Landroidx/compose/ui/d$c;)V
    .locals 0

    check-cast p1, Landroidx/compose/ui/viewinterop/h;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/viewinterop/FocusTargetPropertiesElement;->m(Landroidx/compose/ui/viewinterop/h;)V

    return-void
.end method

.method public l()Landroidx/compose/ui/viewinterop/h;
    .locals 1

    new-instance v0, Landroidx/compose/ui/viewinterop/h;

    invoke-direct {v0}, Landroidx/compose/ui/viewinterop/h;-><init>()V

    return-object v0
.end method

.method public m(Landroidx/compose/ui/viewinterop/h;)V
    .locals 0

    return-void
.end method
