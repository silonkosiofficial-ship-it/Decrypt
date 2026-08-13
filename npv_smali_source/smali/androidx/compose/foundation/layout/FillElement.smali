.class final Landroidx/compose/foundation/layout/FillElement;
.super LF0/W;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/layout/FillElement$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LF0/W;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u034d"
    }
    d2 = {
        "\u034e",
        "\u034f",
        "\u0350",
        "\u0351",
        "\u0352",
        "",
        "\u0353",
        "",
        "\u0354",
        "\u0355",
        "\u0356",
        "\u0357",
        "\u0358",
        "\u0359",
        "\u035a",
        "\u035b",
        "\u035c",
        "",
        "\u035d",
        "",
        "\u035e",
        "\u035f",
        "",
        "\u0360",
        "\u0361",
        "\u0362",
        "\u0363",
        "\u0364",
        "\u0365",
        "\u0366",
        "\u0367",
        "\u0368",
        "\u0369",
        "\u036a"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final e:Landroidx/compose/foundation/layout/FillElement$a;


# instance fields
.field private final b:LA/o;

.field private final c:F

.field private final d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/foundation/layout/FillElement$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/foundation/layout/FillElement$a;-><init>(Ly7/k;)V

    sput-object v0, Landroidx/compose/foundation/layout/FillElement;->e:Landroidx/compose/foundation/layout/FillElement$a;

    return-void
.end method

.method public constructor <init>(LA/o;FLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, LF0/W;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/layout/FillElement;->b:LA/o;

    iput p2, p0, Landroidx/compose/foundation/layout/FillElement;->c:F

    iput-object p3, p0, Landroidx/compose/foundation/layout/FillElement;->d:Ljava/lang/String;

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
    instance-of v1, p1, Landroidx/compose/foundation/layout/FillElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget-object v1, p0, Landroidx/compose/foundation/layout/FillElement;->b:LA/o;

    check-cast p1, Landroidx/compose/foundation/layout/FillElement;

    iget-object v3, p1, Landroidx/compose/foundation/layout/FillElement;->b:LA/o;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Landroidx/compose/foundation/layout/FillElement;->c:F

    iget p1, p1, Landroidx/compose/foundation/layout/FillElement;->c:F

    cmpg-float p1, v1, p1

    if-nez p1, :cond_3

    return v0

    :cond_3
    return v2
.end method

.method public bridge synthetic g()Landroidx/compose/ui/d$c;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/foundation/layout/FillElement;->l()Landroidx/compose/foundation/layout/g;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Landroidx/compose/foundation/layout/FillElement;->b:LA/o;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Landroidx/compose/foundation/layout/FillElement;->c:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public bridge synthetic j(Landroidx/compose/ui/d$c;)V
    .locals 0

    check-cast p1, Landroidx/compose/foundation/layout/g;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/layout/FillElement;->m(Landroidx/compose/foundation/layout/g;)V

    return-void
.end method

.method public l()Landroidx/compose/foundation/layout/g;
    .locals 3

    new-instance v0, Landroidx/compose/foundation/layout/g;

    iget-object v1, p0, Landroidx/compose/foundation/layout/FillElement;->b:LA/o;

    iget v2, p0, Landroidx/compose/foundation/layout/FillElement;->c:F

    invoke-direct {v0, v1, v2}, Landroidx/compose/foundation/layout/g;-><init>(LA/o;F)V

    return-object v0
.end method

.method public m(Landroidx/compose/foundation/layout/g;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/layout/FillElement;->b:LA/o;

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/layout/g;->T1(LA/o;)V

    iget v0, p0, Landroidx/compose/foundation/layout/FillElement;->c:F

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/layout/g;->U1(F)V

    return-void
.end method
