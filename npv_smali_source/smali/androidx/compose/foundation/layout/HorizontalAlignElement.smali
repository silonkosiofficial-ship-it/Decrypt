.class public final Landroidx/compose/foundation/layout/HorizontalAlignElement;
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
        "\u036b"
    }
    d2 = {
        "\u036c",
        "\u036d",
        "\u036e",
        "\u036f",
        "\u0370",
        "\u0371",
        "\u0372",
        "\u0373",
        "\u0374",
        "\u0375",
        "\u0376",
        "\u0377",
        "\u0378",
        "",
        "\u0379",
        "\u037a",
        "",
        "\u037b",
        "",
        "\u037c",
        "\u037d",
        "\u037e",
        "\u037f",
        "\u0380",
        "\u0381",
        "\u0382"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final b:Lh0/c$b;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lh0/c$b;)V
    .locals 0

    invoke-direct {p0}, LF0/W;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/layout/HorizontalAlignElement;->b:Lh0/c$b;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Landroidx/compose/foundation/layout/HorizontalAlignElement;

    if-eqz v0, :cond_1

    check-cast p1, Landroidx/compose/foundation/layout/HorizontalAlignElement;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_2

    const/4 p1, 0x0

    return p1

    :cond_2
    iget-object v0, p0, Landroidx/compose/foundation/layout/HorizontalAlignElement;->b:Lh0/c$b;

    iget-object p1, p1, Landroidx/compose/foundation/layout/HorizontalAlignElement;->b:Lh0/c$b;

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic g()Landroidx/compose/ui/d$c;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/foundation/layout/HorizontalAlignElement;->l()LA/s;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/layout/HorizontalAlignElement;->b:Lh0/c$b;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public bridge synthetic j(Landroidx/compose/ui/d$c;)V
    .locals 0

    check-cast p1, LA/s;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/layout/HorizontalAlignElement;->m(LA/s;)V

    return-void
.end method

.method public l()LA/s;
    .locals 2

    new-instance v0, LA/s;

    iget-object v1, p0, Landroidx/compose/foundation/layout/HorizontalAlignElement;->b:Lh0/c$b;

    invoke-direct {v0, v1}, LA/s;-><init>(Lh0/c$b;)V

    return-object v0
.end method

.method public m(LA/s;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/layout/HorizontalAlignElement;->b:Lh0/c$b;

    invoke-virtual {p1, v0}, LA/s;->U1(Lh0/c$b;)V

    return-void
.end method
