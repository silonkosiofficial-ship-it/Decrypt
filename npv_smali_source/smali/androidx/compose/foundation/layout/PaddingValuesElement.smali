.class final Landroidx/compose/foundation/layout/PaddingValuesElement;
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
        "\u041c"
    }
    d2 = {
        "\u041d",
        "\u041e",
        "\u041f",
        "\u0420",
        "\u0421",
        "\u0422",
        "\u0423",
        "\u0424",
        "\u0425",
        "\u0426",
        "\u0427",
        "\u0428",
        "\u0429",
        "\u042a",
        "\u042b",
        "\u042c",
        "",
        "\u042d",
        "\u042e",
        "",
        "\u042f",
        "",
        "\u0430",
        "\u0431",
        "\u0432",
        "\u0433",
        "\u0434",
        "\u0435",
        "\u0436",
        "\u0437",
        "\u0438",
        "\u0439",
        "\u043a"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final b:LA/B;

.field private final c:Lx7/l;


# direct methods
.method public constructor <init>(LA/B;Lx7/l;)V
    .locals 0

    invoke-direct {p0}, LF0/W;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/layout/PaddingValuesElement;->b:LA/B;

    iput-object p2, p0, Landroidx/compose/foundation/layout/PaddingValuesElement;->c:Lx7/l;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    instance-of v0, p1, Landroidx/compose/foundation/layout/PaddingValuesElement;

    if-eqz v0, :cond_0

    check-cast p1, Landroidx/compose/foundation/layout/PaddingValuesElement;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    iget-object v0, p0, Landroidx/compose/foundation/layout/PaddingValuesElement;->b:LA/B;

    iget-object p1, p1, Landroidx/compose/foundation/layout/PaddingValuesElement;->b:LA/B;

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic g()Landroidx/compose/ui/d$c;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/foundation/layout/PaddingValuesElement;->l()Landroidx/compose/foundation/layout/o;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/layout/PaddingValuesElement;->b:LA/B;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public bridge synthetic j(Landroidx/compose/ui/d$c;)V
    .locals 0

    check-cast p1, Landroidx/compose/foundation/layout/o;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/layout/PaddingValuesElement;->m(Landroidx/compose/foundation/layout/o;)V

    return-void
.end method

.method public l()Landroidx/compose/foundation/layout/o;
    .locals 2

    new-instance v0, Landroidx/compose/foundation/layout/o;

    iget-object v1, p0, Landroidx/compose/foundation/layout/PaddingValuesElement;->b:LA/B;

    invoke-direct {v0, v1}, Landroidx/compose/foundation/layout/o;-><init>(LA/B;)V

    return-object v0
.end method

.method public m(Landroidx/compose/foundation/layout/o;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/layout/PaddingValuesElement;->b:LA/B;

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/layout/o;->U1(LA/B;)V

    return-void
.end method
