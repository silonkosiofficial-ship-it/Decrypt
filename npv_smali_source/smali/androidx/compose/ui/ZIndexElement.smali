.class public final Landroidx/compose/ui/ZIndexElement;
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
        "\u06a4"
    }
    d2 = {
        "\u06a5",
        "\u06a6",
        "\u06a7",
        "",
        "\u06a8",
        "\u06a9",
        "\u06aa",
        "\u06ab",
        "\u06ac",
        "\u06ad",
        "\u06ae",
        "\u06af",
        "\u06b0",
        "",
        "\u06b1",
        "\u06b2",
        "",
        "\u06b3",
        "\u06b4",
        "",
        "\u06b5",
        "",
        "\u06b6",
        "\u06b7",
        "\u06b8",
        "\u06b9",
        "\u06ba",
        "\u06bb",
        "\u06bc"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final b:F


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(F)V
    .locals 0

    invoke-direct {p0}, LF0/W;-><init>()V

    iput p1, p0, Landroidx/compose/ui/ZIndexElement;->b:F

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
    instance-of v1, p1, Landroidx/compose/ui/ZIndexElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/ui/ZIndexElement;

    iget v1, p0, Landroidx/compose/ui/ZIndexElement;->b:F

    iget p1, p1, Landroidx/compose/ui/ZIndexElement;->b:F

    invoke-static {v1, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    if-eqz p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public bridge synthetic g()Landroidx/compose/ui/d$c;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/ZIndexElement;->l()Landroidx/compose/ui/e;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Landroidx/compose/ui/ZIndexElement;->b:F

    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v0

    return v0
.end method

.method public bridge synthetic j(Landroidx/compose/ui/d$c;)V
    .locals 0

    check-cast p1, Landroidx/compose/ui/e;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/ZIndexElement;->m(Landroidx/compose/ui/e;)V

    return-void
.end method

.method public l()Landroidx/compose/ui/e;
    .locals 2

    new-instance v0, Landroidx/compose/ui/e;

    iget v1, p0, Landroidx/compose/ui/ZIndexElement;->b:F

    invoke-direct {v0, v1}, Landroidx/compose/ui/e;-><init>(F)V

    return-object v0
.end method

.method public m(Landroidx/compose/ui/e;)V
    .locals 1

    iget v0, p0, Landroidx/compose/ui/ZIndexElement;->b:F

    invoke-virtual {p1, v0}, Landroidx/compose/ui/e;->U1(F)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ZIndexElement(zIndex="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/compose/ui/ZIndexElement;->b:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
