.class final Landroidx/compose/foundation/layout/WrapContentElement;
.super LF0/W;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/layout/WrapContentElement$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LF0/W;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u047a"
    }
    d2 = {
        "\u047b",
        "\u047c",
        "\u047d",
        "\u047e",
        "\u047f",
        "",
        "\u0480",
        "\u0481",
        "\u0482",
        "\u0483",
        "\u0484",
        "\u0485",
        "",
        "\u0486",
        "",
        "\u0487",
        "\u0488",
        "\u0489",
        "\u048a",
        "\u048b",
        "\u048c",
        "\u048d",
        "\u048e",
        "\u048f",
        "\u0490",
        "\u0491",
        "\u0492",
        "",
        "\u0493",
        "\u0494",
        "\u0495",
        "\u0496",
        "\u0497",
        "\u0498",
        "\u0499",
        "\u049a",
        "\u049b",
        "\u049c",
        "\u049d",
        "\u049e",
        "\u049f",
        "\u04a0",
        "\u04a1"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:Landroidx/compose/foundation/layout/WrapContentElement$a;


# instance fields
.field private final b:LA/o;

.field private final c:Z

.field private final d:Lx7/p;

.field private final e:Ljava/lang/Object;

.field private final f:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/foundation/layout/WrapContentElement$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/foundation/layout/WrapContentElement$a;-><init>(Ly7/k;)V

    sput-object v0, Landroidx/compose/foundation/layout/WrapContentElement;->g:Landroidx/compose/foundation/layout/WrapContentElement$a;

    return-void
.end method

.method public constructor <init>(LA/o;ZLx7/p;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, LF0/W;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/layout/WrapContentElement;->b:LA/o;

    iput-boolean p2, p0, Landroidx/compose/foundation/layout/WrapContentElement;->c:Z

    iput-object p3, p0, Landroidx/compose/foundation/layout/WrapContentElement;->d:Lx7/p;

    iput-object p4, p0, Landroidx/compose/foundation/layout/WrapContentElement;->e:Ljava/lang/Object;

    iput-object p5, p0, Landroidx/compose/foundation/layout/WrapContentElement;->f:Ljava/lang/String;

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
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-class v3, Landroidx/compose/foundation/layout/WrapContentElement;

    if-eq v3, v2, :cond_2

    return v1

    :cond_2
    check-cast p1, Landroidx/compose/foundation/layout/WrapContentElement;

    iget-object v2, p0, Landroidx/compose/foundation/layout/WrapContentElement;->b:LA/o;

    iget-object v3, p1, Landroidx/compose/foundation/layout/WrapContentElement;->b:LA/o;

    if-eq v2, v3, :cond_3

    return v1

    :cond_3
    iget-boolean v2, p0, Landroidx/compose/foundation/layout/WrapContentElement;->c:Z

    iget-boolean v3, p1, Landroidx/compose/foundation/layout/WrapContentElement;->c:Z

    if-eq v2, v3, :cond_4

    return v1

    :cond_4
    iget-object v2, p0, Landroidx/compose/foundation/layout/WrapContentElement;->e:Ljava/lang/Object;

    iget-object p1, p1, Landroidx/compose/foundation/layout/WrapContentElement;->e:Ljava/lang/Object;

    invoke-static {v2, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v1

    :cond_5
    return v0
.end method

.method public bridge synthetic g()Landroidx/compose/ui/d$c;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/foundation/layout/WrapContentElement;->l()Landroidx/compose/foundation/layout/s;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Landroidx/compose/foundation/layout/WrapContentElement;->b:LA/o;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Landroidx/compose/foundation/layout/WrapContentElement;->c:Z

    invoke-static {v1}, Lt/h;->a(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/foundation/layout/WrapContentElement;->e:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public bridge synthetic j(Landroidx/compose/ui/d$c;)V
    .locals 0

    check-cast p1, Landroidx/compose/foundation/layout/s;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/layout/WrapContentElement;->m(Landroidx/compose/foundation/layout/s;)V

    return-void
.end method

.method public l()Landroidx/compose/foundation/layout/s;
    .locals 4

    new-instance v0, Landroidx/compose/foundation/layout/s;

    iget-object v1, p0, Landroidx/compose/foundation/layout/WrapContentElement;->b:LA/o;

    iget-boolean v2, p0, Landroidx/compose/foundation/layout/WrapContentElement;->c:Z

    iget-object v3, p0, Landroidx/compose/foundation/layout/WrapContentElement;->d:Lx7/p;

    invoke-direct {v0, v1, v2, v3}, Landroidx/compose/foundation/layout/s;-><init>(LA/o;ZLx7/p;)V

    return-object v0
.end method

.method public m(Landroidx/compose/foundation/layout/s;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/layout/WrapContentElement;->b:LA/o;

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/layout/s;->V1(LA/o;)V

    iget-boolean v0, p0, Landroidx/compose/foundation/layout/WrapContentElement;->c:Z

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/layout/s;->W1(Z)V

    iget-object v0, p0, Landroidx/compose/foundation/layout/WrapContentElement;->d:Lx7/p;

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/layout/s;->U1(Lx7/p;)V

    return-void
.end method
