.class final Landroidx/compose/ui/viewinterop/FocusGroupPropertiesElement;
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
        "\u09c1"
    }
    d2 = {
        "\u09c2",
        "\u09c3",
        "\u09c4",
        "\u09c5",
        "\u09c6",
        "\u09c7",
        "\u09c8",
        "\u09c9",
        "\u09ca",
        "\u09cb",
        "\u09cc",
        "",
        "\u09cd",
        "\u09ce",
        "",
        "\u09cf",
        "",
        "\u09d0",
        "\u09d1",
        "\u09d2"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final b:Landroidx/compose/ui/viewinterop/FocusGroupPropertiesElement;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/viewinterop/FocusGroupPropertiesElement;

    invoke-direct {v0}, Landroidx/compose/ui/viewinterop/FocusGroupPropertiesElement;-><init>()V

    sput-object v0, Landroidx/compose/ui/viewinterop/FocusGroupPropertiesElement;->b:Landroidx/compose/ui/viewinterop/FocusGroupPropertiesElement;

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

    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/FocusGroupPropertiesElement;->l()Landroidx/compose/ui/viewinterop/g;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    const v0, -0x72ff26c6

    return v0
.end method

.method public bridge synthetic j(Landroidx/compose/ui/d$c;)V
    .locals 0

    check-cast p1, Landroidx/compose/ui/viewinterop/g;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/viewinterop/FocusGroupPropertiesElement;->m(Landroidx/compose/ui/viewinterop/g;)V

    return-void
.end method

.method public l()Landroidx/compose/ui/viewinterop/g;
    .locals 1

    new-instance v0, Landroidx/compose/ui/viewinterop/g;

    invoke-direct {v0}, Landroidx/compose/ui/viewinterop/g;-><init>()V

    return-object v0
.end method

.method public m(Landroidx/compose/ui/viewinterop/g;)V
    .locals 0

    return-void
.end method
