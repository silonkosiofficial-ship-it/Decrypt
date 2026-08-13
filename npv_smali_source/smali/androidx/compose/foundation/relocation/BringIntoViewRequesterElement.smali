.class final Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;
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
        "\u0524"
    }
    d2 = {
        "\u0525",
        "\u0526",
        "\u0527",
        "\u0528",
        "\u0529",
        "\u052a",
        "\u052b",
        "\u052c",
        "\u052d",
        "\u052e",
        "\u052f",
        "\u0530",
        "\u0531",
        "",
        "\u0532",
        "",
        "\u0533",
        "\u0534",
        "",
        "\u0535",
        "\u0536",
        "\u0537",
        "\u0538",
        "\u0539"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final b:LE/b;


# direct methods
.method public constructor <init>(LE/b;)V
    .locals 0

    invoke-direct {p0}, LF0/W;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;->b:LE/b;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    if-eq p0, p1, :cond_1

    instance-of v0, p1, Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;->b:LE/b;

    check-cast p1, Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;

    iget-object p1, p1, Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;->b:LE/b;

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public bridge synthetic g()Landroidx/compose/ui/d$c;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;->l()Landroidx/compose/foundation/relocation/e;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;->b:LE/b;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public bridge synthetic j(Landroidx/compose/ui/d$c;)V
    .locals 0

    check-cast p1, Landroidx/compose/foundation/relocation/e;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;->m(Landroidx/compose/foundation/relocation/e;)V

    return-void
.end method

.method public l()Landroidx/compose/foundation/relocation/e;
    .locals 2

    new-instance v0, Landroidx/compose/foundation/relocation/e;

    iget-object v1, p0, Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;->b:LE/b;

    invoke-direct {v0, v1}, Landroidx/compose/foundation/relocation/e;-><init>(LE/b;)V

    return-object v0
.end method

.method public m(Landroidx/compose/foundation/relocation/e;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;->b:LE/b;

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/relocation/e;->U1(LE/b;)V

    return-void
.end method
