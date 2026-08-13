.class final Landroidx/compose/foundation/CombinedClickableElement;
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
        "\u01ae"
    }
    d2 = {
        "\u01af",
        "\u01b0",
        "\u01b1",
        "\u01b2",
        "\u01b3",
        "\u01b4",
        "\u01b5",
        "",
        "\u01b6",
        "",
        "\u01b7",
        "\u01b8",
        "\u01b9",
        "\u01ba",
        "\u01bb",
        "\u01bc",
        "\u01bd",
        "\u01be",
        "\u01bf",
        "\u01c0",
        "\u01c1",
        "\u01c2",
        "\u01c3",
        "\u01c4",
        "\u01c5",
        "\u01c6",
        "",
        "\u01c7",
        "\u01c8",
        "\u01c9",
        "",
        "\u01ca",
        "\u01cb",
        "\u01cc",
        "\u01cd",
        "\u01ce",
        "\u01cf",
        "\u01d0",
        "\u01d1",
        "\u01d2",
        "\u01d3",
        "\u01d4",
        "\u01d5",
        "\u01d6",
        "\u01d7",
        "\u01d8",
        "\u01d9",
        "\u01da",
        "\u01db"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final b:Lz/l;

.field private final c:Lv/I;

.field private final d:Z

.field private final e:Ljava/lang/String;

.field private final f:LK0/h;

.field private final g:Lx7/a;

.field private final h:Ljava/lang/String;

.field private final i:Lx7/a;

.field private final j:Lx7/a;


# direct methods
.method private constructor <init>(Lz/l;Lv/I;ZLjava/lang/String;LK0/h;Lx7/a;Ljava/lang/String;Lx7/a;Lx7/a;)V
    .locals 0

    invoke-direct {p0}, LF0/W;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/CombinedClickableElement;->b:Lz/l;

    iput-object p2, p0, Landroidx/compose/foundation/CombinedClickableElement;->c:Lv/I;

    iput-boolean p3, p0, Landroidx/compose/foundation/CombinedClickableElement;->d:Z

    iput-object p4, p0, Landroidx/compose/foundation/CombinedClickableElement;->e:Ljava/lang/String;

    iput-object p5, p0, Landroidx/compose/foundation/CombinedClickableElement;->f:LK0/h;

    iput-object p6, p0, Landroidx/compose/foundation/CombinedClickableElement;->g:Lx7/a;

    iput-object p7, p0, Landroidx/compose/foundation/CombinedClickableElement;->h:Ljava/lang/String;

    iput-object p8, p0, Landroidx/compose/foundation/CombinedClickableElement;->i:Lx7/a;

    iput-object p9, p0, Landroidx/compose/foundation/CombinedClickableElement;->j:Lx7/a;

    return-void
.end method

.method public synthetic constructor <init>(Lz/l;Lv/I;ZLjava/lang/String;LK0/h;Lx7/a;Ljava/lang/String;Lx7/a;Lx7/a;Ly7/k;)V
    .locals 0

    invoke-direct/range {p0 .. p9}, Landroidx/compose/foundation/CombinedClickableElement;-><init>(Lz/l;Lv/I;ZLjava/lang/String;LK0/h;Lx7/a;Ljava/lang/String;Lx7/a;Lx7/a;)V

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

    const-class v3, Landroidx/compose/foundation/CombinedClickableElement;

    if-eq v3, v2, :cond_2

    return v1

    :cond_2
    check-cast p1, Landroidx/compose/foundation/CombinedClickableElement;

    iget-object v2, p0, Landroidx/compose/foundation/CombinedClickableElement;->b:Lz/l;

    iget-object v3, p1, Landroidx/compose/foundation/CombinedClickableElement;->b:Lz/l;

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Landroidx/compose/foundation/CombinedClickableElement;->c:Lv/I;

    iget-object v3, p1, Landroidx/compose/foundation/CombinedClickableElement;->c:Lv/I;

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    :cond_4
    iget-boolean v2, p0, Landroidx/compose/foundation/CombinedClickableElement;->d:Z

    iget-boolean v3, p1, Landroidx/compose/foundation/CombinedClickableElement;->d:Z

    if-eq v2, v3, :cond_5

    return v1

    :cond_5
    iget-object v2, p0, Landroidx/compose/foundation/CombinedClickableElement;->e:Ljava/lang/String;

    iget-object v3, p1, Landroidx/compose/foundation/CombinedClickableElement;->e:Ljava/lang/String;

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    return v1

    :cond_6
    iget-object v2, p0, Landroidx/compose/foundation/CombinedClickableElement;->f:LK0/h;

    iget-object v3, p1, Landroidx/compose/foundation/CombinedClickableElement;->f:LK0/h;

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    return v1

    :cond_7
    iget-object v2, p0, Landroidx/compose/foundation/CombinedClickableElement;->g:Lx7/a;

    iget-object v3, p1, Landroidx/compose/foundation/CombinedClickableElement;->g:Lx7/a;

    if-eq v2, v3, :cond_8

    return v1

    :cond_8
    iget-object v2, p0, Landroidx/compose/foundation/CombinedClickableElement;->h:Ljava/lang/String;

    iget-object v3, p1, Landroidx/compose/foundation/CombinedClickableElement;->h:Ljava/lang/String;

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    return v1

    :cond_9
    iget-object v2, p0, Landroidx/compose/foundation/CombinedClickableElement;->i:Lx7/a;

    iget-object v3, p1, Landroidx/compose/foundation/CombinedClickableElement;->i:Lx7/a;

    if-eq v2, v3, :cond_a

    return v1

    :cond_a
    iget-object v2, p0, Landroidx/compose/foundation/CombinedClickableElement;->j:Lx7/a;

    iget-object p1, p1, Landroidx/compose/foundation/CombinedClickableElement;->j:Lx7/a;

    if-eq v2, p1, :cond_b

    return v1

    :cond_b
    return v0
.end method

.method public bridge synthetic g()Landroidx/compose/ui/d$c;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/foundation/CombinedClickableElement;->l()Landroidx/compose/foundation/f;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    iget-object v0, p0, Landroidx/compose/foundation/CombinedClickableElement;->b:Lz/l;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Landroidx/compose/foundation/CombinedClickableElement;->c:Lv/I;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Landroidx/compose/foundation/CombinedClickableElement;->d:Z

    invoke-static {v2}, Lt/h;->a(Z)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Landroidx/compose/foundation/CombinedClickableElement;->e:Ljava/lang/String;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_2

    :cond_2
    move v2, v1

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Landroidx/compose/foundation/CombinedClickableElement;->f:LK0/h;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, LK0/h;->n()I

    move-result v2

    invoke-static {v2}, LK0/h;->l(I)I

    move-result v2

    goto :goto_3

    :cond_3
    move v2, v1

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Landroidx/compose/foundation/CombinedClickableElement;->g:Lx7/a;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Landroidx/compose/foundation/CombinedClickableElement;->h:Ljava/lang/String;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_4

    :cond_4
    move v2, v1

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Landroidx/compose/foundation/CombinedClickableElement;->i:Lx7/a;

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_5

    :cond_5
    move v2, v1

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Landroidx/compose/foundation/CombinedClickableElement;->j:Lx7/a;

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :cond_6
    add-int/2addr v0, v1

    return v0
.end method

.method public bridge synthetic j(Landroidx/compose/ui/d$c;)V
    .locals 0

    check-cast p1, Landroidx/compose/foundation/f;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/CombinedClickableElement;->m(Landroidx/compose/foundation/f;)V

    return-void
.end method

.method public l()Landroidx/compose/foundation/f;
    .locals 12

    new-instance v11, Landroidx/compose/foundation/f;

    iget-object v1, p0, Landroidx/compose/foundation/CombinedClickableElement;->g:Lx7/a;

    iget-object v2, p0, Landroidx/compose/foundation/CombinedClickableElement;->h:Ljava/lang/String;

    iget-object v3, p0, Landroidx/compose/foundation/CombinedClickableElement;->i:Lx7/a;

    iget-object v4, p0, Landroidx/compose/foundation/CombinedClickableElement;->j:Lx7/a;

    iget-object v5, p0, Landroidx/compose/foundation/CombinedClickableElement;->b:Lz/l;

    iget-object v6, p0, Landroidx/compose/foundation/CombinedClickableElement;->c:Lv/I;

    iget-boolean v7, p0, Landroidx/compose/foundation/CombinedClickableElement;->d:Z

    iget-object v8, p0, Landroidx/compose/foundation/CombinedClickableElement;->e:Ljava/lang/String;

    iget-object v9, p0, Landroidx/compose/foundation/CombinedClickableElement;->f:LK0/h;

    const/4 v10, 0x0

    move-object v0, v11

    invoke-direct/range {v0 .. v10}, Landroidx/compose/foundation/f;-><init>(Lx7/a;Ljava/lang/String;Lx7/a;Lx7/a;Lz/l;Lv/I;ZLjava/lang/String;LK0/h;Ly7/k;)V

    return-object v11
.end method

.method public m(Landroidx/compose/foundation/f;)V
    .locals 10

    iget-object v1, p0, Landroidx/compose/foundation/CombinedClickableElement;->g:Lx7/a;

    iget-object v2, p0, Landroidx/compose/foundation/CombinedClickableElement;->h:Ljava/lang/String;

    iget-object v3, p0, Landroidx/compose/foundation/CombinedClickableElement;->i:Lx7/a;

    iget-object v4, p0, Landroidx/compose/foundation/CombinedClickableElement;->j:Lx7/a;

    iget-object v5, p0, Landroidx/compose/foundation/CombinedClickableElement;->b:Lz/l;

    iget-object v6, p0, Landroidx/compose/foundation/CombinedClickableElement;->c:Lv/I;

    iget-boolean v7, p0, Landroidx/compose/foundation/CombinedClickableElement;->d:Z

    iget-object v8, p0, Landroidx/compose/foundation/CombinedClickableElement;->e:Ljava/lang/String;

    iget-object v9, p0, Landroidx/compose/foundation/CombinedClickableElement;->f:LK0/h;

    move-object v0, p1

    invoke-virtual/range {v0 .. v9}, Landroidx/compose/foundation/f;->u2(Lx7/a;Ljava/lang/String;Lx7/a;Lx7/a;Lz/l;Lv/I;ZLjava/lang/String;LK0/h;)V

    return-void
.end method
