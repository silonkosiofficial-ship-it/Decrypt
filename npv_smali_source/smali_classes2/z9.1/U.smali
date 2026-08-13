.class final Lz9/U;
.super Lz9/P;
.source "SourceFile"


# instance fields
.field private final l:Ly9/D;

.field private final m:Ljava/util/List;

.field private final n:I

.field private o:I


# direct methods
.method public constructor <init>(Ly9/b;Ly9/D;)V
    .locals 8

    const-string v0, "json"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v7}, Lz9/P;-><init>(Ly9/b;Ly9/D;Ljava/lang/String;Lv9/f;ILy7/k;)V

    iput-object p2, p0, Lz9/U;->l:Ly9/D;

    invoke-virtual {p0}, Lz9/U;->D0()Ly9/D;

    move-result-object p1

    invoke-virtual {p1}, Ly9/D;->keySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lj7/v;->T0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lz9/U;->m:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    mul-int/lit8 p1, p1, 0x2

    iput p1, p0, Lz9/U;->n:I

    const/4 p1, -0x1

    iput p1, p0, Lz9/U;->o:I

    return-void
.end method


# virtual methods
.method public D0()Ly9/D;
    .locals 1

    iget-object v0, p0, Lz9/U;->l:Ly9/D;

    return-object v0
.end method

.method public b(Lv9/f;)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method protected d0(Lv9/f;I)Ljava/lang/String;
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    div-int/lit8 p2, p2, 0x2

    iget-object p1, p0, Lz9/U;->m:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method protected j0(Ljava/lang/String;)Ly9/i;
    .locals 1

    .prologue
    const-string v0, "tag"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lz9/U;->o:I

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_0

    invoke-static {p1}, Ly9/j;->c(Ljava/lang/String;)Ly9/F;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lz9/U;->D0()Ly9/D;

    move-result-object v0

    invoke-static {v0, p1}, Lj7/S;->i(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly9/i;

    :goto_0
    return-object p1
.end method

.method public r(Lv9/f;)I
    .locals 1

    .prologue
    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget p1, p0, Lz9/U;->o:I

    iget v0, p0, Lz9/U;->n:I

    add-int/lit8 v0, v0, -0x1

    if-ge p1, v0, :cond_0

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lz9/U;->o:I

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public bridge synthetic y0()Ly9/i;
    .locals 1

    invoke-virtual {p0}, Lz9/U;->D0()Ly9/D;

    move-result-object v0

    return-object v0
.end method
