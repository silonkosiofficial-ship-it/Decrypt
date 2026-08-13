.class final Landroidx/compose/foundation/BackgroundElement;
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
        "\u013a"
    }
    d2 = {
        "\u013b",
        "\u013c",
        "\u013d",
        "\u013e",
        "\u013f",
        "\u0140",
        "\u0141",
        "",
        "\u0142",
        "\u0143",
        "\u0144",
        "\u0145",
        "\u0146",
        "\u0147",
        "\u0148",
        "\u0149",
        "\u014a",
        "\u014b",
        "\u014c",
        "\u014d",
        "\u014e",
        "\u014f",
        "",
        "\u0150",
        "\u0151",
        "",
        "\u0152",
        "",
        "\u0153",
        "\u0154",
        "\u0155",
        "\u0156",
        "\u0157",
        "\u0158",
        "\u0159",
        "\u015a",
        "\u015b",
        "\u015c",
        "\u015d",
        "\u015e",
        "\u015f"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final b:J

.field private final c:Lo0/n0;

.field private final d:F

.field private final e:Lo0/e2;

.field private final f:Lx7/l;


# direct methods
.method private constructor <init>(JLo0/n0;FLo0/e2;Lx7/l;)V
    .locals 0

    invoke-direct {p0}, LF0/W;-><init>()V

    iput-wide p1, p0, Landroidx/compose/foundation/BackgroundElement;->b:J

    iput-object p3, p0, Landroidx/compose/foundation/BackgroundElement;->c:Lo0/n0;

    iput p4, p0, Landroidx/compose/foundation/BackgroundElement;->d:F

    iput-object p5, p0, Landroidx/compose/foundation/BackgroundElement;->e:Lo0/e2;

    iput-object p6, p0, Landroidx/compose/foundation/BackgroundElement;->f:Lx7/l;

    return-void
.end method

.method public synthetic constructor <init>(JLo0/n0;FLo0/e2;Lx7/l;ILy7/k;)V
    .locals 10

    .prologue
    and-int/lit8 v0, p7, 0x1

    if-eqz v0, :cond_0

    sget-object v0, Lo0/y0;->b:Lo0/y0$a;

    invoke-virtual {v0}, Lo0/y0$a;->g()J

    move-result-wide v0

    move-wide v3, v0

    goto :goto_0

    :cond_0
    move-wide v3, p1

    :goto_0
    and-int/lit8 v0, p7, 0x2

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    move-object v5, v0

    goto :goto_1

    :cond_1
    move-object v5, p3

    :goto_1
    const/4 v9, 0x0

    move-object v2, p0

    move v6, p4

    move-object v7, p5

    move-object/from16 v8, p6

    invoke-direct/range {v2 .. v9}, Landroidx/compose/foundation/BackgroundElement;-><init>(JLo0/n0;FLo0/e2;Lx7/l;Ly7/k;)V

    return-void
.end method

.method public synthetic constructor <init>(JLo0/n0;FLo0/e2;Lx7/l;Ly7/k;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Landroidx/compose/foundation/BackgroundElement;-><init>(JLo0/n0;FLo0/e2;Lx7/l;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 5

    .prologue
    instance-of v0, p1, Landroidx/compose/foundation/BackgroundElement;

    if-eqz v0, :cond_0

    check-cast p1, Landroidx/compose/foundation/BackgroundElement;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const/4 v0, 0x0

    if-nez p1, :cond_1

    return v0

    :cond_1
    iget-wide v1, p0, Landroidx/compose/foundation/BackgroundElement;->b:J

    iget-wide v3, p1, Landroidx/compose/foundation/BackgroundElement;->b:J

    invoke-static {v1, v2, v3, v4}, Lo0/y0;->o(JJ)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Landroidx/compose/foundation/BackgroundElement;->c:Lo0/n0;

    iget-object v2, p1, Landroidx/compose/foundation/BackgroundElement;->c:Lo0/n0;

    invoke-static {v1, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget v1, p0, Landroidx/compose/foundation/BackgroundElement;->d:F

    iget v2, p1, Landroidx/compose/foundation/BackgroundElement;->d:F

    cmpg-float v1, v1, v2

    if-nez v1, :cond_2

    iget-object v1, p0, Landroidx/compose/foundation/BackgroundElement;->e:Lo0/e2;

    iget-object p1, p1, Landroidx/compose/foundation/BackgroundElement;->e:Lo0/e2;

    invoke-static {v1, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    :cond_2
    return v0
.end method

.method public bridge synthetic g()Landroidx/compose/ui/d$c;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/foundation/BackgroundElement;->l()Landroidx/compose/foundation/c;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .prologue
    iget-wide v0, p0, Landroidx/compose/foundation/BackgroundElement;->b:J

    invoke-static {v0, v1}, Lo0/y0;->u(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/foundation/BackgroundElement;->c:Lo0/n0;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Landroidx/compose/foundation/BackgroundElement;->d:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/foundation/BackgroundElement;->e:Lo0/e2;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public bridge synthetic j(Landroidx/compose/ui/d$c;)V
    .locals 0

    check-cast p1, Landroidx/compose/foundation/c;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/BackgroundElement;->m(Landroidx/compose/foundation/c;)V

    return-void
.end method

.method public l()Landroidx/compose/foundation/c;
    .locals 8

    new-instance v7, Landroidx/compose/foundation/c;

    iget-wide v1, p0, Landroidx/compose/foundation/BackgroundElement;->b:J

    iget-object v3, p0, Landroidx/compose/foundation/BackgroundElement;->c:Lo0/n0;

    iget v4, p0, Landroidx/compose/foundation/BackgroundElement;->d:F

    iget-object v5, p0, Landroidx/compose/foundation/BackgroundElement;->e:Lo0/e2;

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Landroidx/compose/foundation/c;-><init>(JLo0/n0;FLo0/e2;Ly7/k;)V

    return-object v7
.end method

.method public m(Landroidx/compose/foundation/c;)V
    .locals 2

    iget-wide v0, p0, Landroidx/compose/foundation/BackgroundElement;->b:J

    invoke-virtual {p1, v0, v1}, Landroidx/compose/foundation/c;->Y1(J)V

    iget-object v0, p0, Landroidx/compose/foundation/BackgroundElement;->c:Lo0/n0;

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/c;->X1(Lo0/n0;)V

    iget v0, p0, Landroidx/compose/foundation/BackgroundElement;->d:F

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/c;->b(F)V

    iget-object v0, p0, Landroidx/compose/foundation/BackgroundElement;->e:Lo0/e2;

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/c;->l0(Lo0/e2;)V

    return-void
.end method
