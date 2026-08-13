.class public final Landroidx/compose/ui/semantics/AppendedSemanticsElement;
.super LF0/W;
.source "SourceFile"

# interfaces
.implements LK0/m;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LF0/W;",
        "LK0/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0969"
    }
    d2 = {
        "\u096a",
        "\u096b",
        "\u096c",
        "\u096d",
        "",
        "\u096e",
        "\u096f",
        "\u0970",
        "\u0971",
        "\u0972",
        "\u0973",
        "\u0974",
        "\u0975",
        "\u0976",
        "\u0977",
        "\u0978",
        "\u0979",
        "",
        "\u097a",
        "\u097b",
        "",
        "\u097c",
        "\u097d",
        "",
        "\u097e",
        "\u097f",
        "\u0980",
        "\u0981",
        "\u0982",
        "\u0983",
        "\u0984",
        "\u0985",
        "\u0986",
        "\u0987",
        "\u0988",
        "\u0989",
        "\u098a",
        "\u098b",
        "\u098c",
        "\u098d"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final b:Z

.field private final c:Lx7/l;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ZLx7/l;)V
    .locals 0

    invoke-direct {p0}, LF0/W;-><init>()V

    iput-boolean p1, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->b:Z

    iput-object p2, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->c:Lx7/l;

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
    instance-of v1, p1, Landroidx/compose/ui/semantics/AppendedSemanticsElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/ui/semantics/AppendedSemanticsElement;

    iget-boolean v1, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->b:Z

    iget-boolean v3, p1, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->b:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->c:Lx7/l;

    iget-object p1, p1, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->c:Lx7/l;

    invoke-static {v1, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public bridge synthetic g()Landroidx/compose/ui/d$c;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->l()LK0/c;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->b:Z

    invoke-static {v0}, Lt/h;->a(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->c:Lx7/l;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public i()LK0/k;
    .locals 2

    new-instance v0, LK0/k;

    invoke-direct {v0}, LK0/k;-><init>()V

    iget-boolean v1, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->b:Z

    invoke-virtual {v0, v1}, LK0/k;->P(Z)V

    iget-object v1, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->c:Lx7/l;

    invoke-interface {v1, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic j(Landroidx/compose/ui/d$c;)V
    .locals 0

    check-cast p1, LK0/c;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->m(LK0/c;)V

    return-void
.end method

.method public l()LK0/c;
    .locals 4

    new-instance v0, LK0/c;

    iget-boolean v1, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->b:Z

    const/4 v2, 0x0

    iget-object v3, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->c:Lx7/l;

    invoke-direct {v0, v1, v2, v3}, LK0/c;-><init>(ZZLx7/l;)V

    return-object v0
.end method

.method public m(LK0/c;)V
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->b:Z

    invoke-virtual {p1, v0}, LK0/c;->T1(Z)V

    iget-object v0, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->c:Lx7/l;

    invoke-virtual {p1, v0}, LK0/c;->U1(Lx7/l;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AppendedSemanticsElement(mergeDescendants="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->b:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", properties="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->c:Lx7/l;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
