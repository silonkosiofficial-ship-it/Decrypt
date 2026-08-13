.class public final Landroidx/compose/foundation/BorderModifierNodeElement;
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
        "\u0160"
    }
    d2 = {
        "\u0161",
        "\u0162",
        "\u0163",
        "\u0164",
        "\u0165",
        "\u0166",
        "\u0167",
        "\u0168",
        "\u0169",
        "\u016a",
        "\u016b",
        "\u016c",
        "\u016d",
        "\u016e",
        "\u016f",
        "\u0170",
        "\u0171",
        "",
        "\u0172",
        "\u0173",
        "",
        "\u0174",
        "\u0175",
        "",
        "\u0176",
        "",
        "\u0177",
        "\u0178",
        "\u0179",
        "\u017a",
        "\u017b",
        "\u017c",
        "\u017d",
        "\u017e",
        "\u017f",
        "\u0180",
        "\u0181",
        "\u0182",
        "\u0183",
        "\u0184",
        "\u0185"
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

.field private final c:Lo0/n0;

.field private final d:Lo0/e2;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(FLo0/n0;Lo0/e2;)V
    .locals 0

    invoke-direct {p0}, LF0/W;-><init>()V

    iput p1, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->b:F

    iput-object p2, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->c:Lo0/n0;

    iput-object p3, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->d:Lo0/e2;

    return-void
.end method

.method public synthetic constructor <init>(FLo0/n0;Lo0/e2;Ly7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/foundation/BorderModifierNodeElement;-><init>(FLo0/n0;Lo0/e2;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/foundation/BorderModifierNodeElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/foundation/BorderModifierNodeElement;

    iget v1, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->b:F

    iget v3, p1, Landroidx/compose/foundation/BorderModifierNodeElement;->b:F

    invoke-static {v1, v3}, LY0/i;->s(FF)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->c:Lo0/n0;

    iget-object v3, p1, Landroidx/compose/foundation/BorderModifierNodeElement;->c:Lo0/n0;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->d:Lo0/e2;

    iget-object p1, p1, Landroidx/compose/foundation/BorderModifierNodeElement;->d:Lo0/e2;

    invoke-static {v1, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public bridge synthetic g()Landroidx/compose/ui/d$c;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/foundation/BorderModifierNodeElement;->l()Lv/f;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->b:F

    invoke-static {v0}, LY0/i;->t(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->c:Lo0/n0;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->d:Lo0/e2;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public bridge synthetic j(Landroidx/compose/ui/d$c;)V
    .locals 0

    check-cast p1, Lv/f;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/BorderModifierNodeElement;->m(Lv/f;)V

    return-void
.end method

.method public l()Lv/f;
    .locals 5

    new-instance v0, Lv/f;

    iget v1, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->b:F

    iget-object v2, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->c:Lo0/n0;

    iget-object v3, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->d:Lo0/e2;

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lv/f;-><init>(FLo0/n0;Lo0/e2;Ly7/k;)V

    return-object v0
.end method

.method public m(Lv/f;)V
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->b:F

    invoke-virtual {p1, v0}, Lv/f;->h2(F)V

    iget-object v0, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->c:Lo0/n0;

    invoke-virtual {p1, v0}, Lv/f;->g2(Lo0/n0;)V

    iget-object v0, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->d:Lo0/e2;

    invoke-virtual {p1, v0}, Lv/f;->l0(Lo0/e2;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BorderModifierNodeElement(width="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->b:F

    invoke-static {v1}, LY0/i;->u(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", brush="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->c:Lo0/n0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", shape="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->d:Lo0/e2;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
