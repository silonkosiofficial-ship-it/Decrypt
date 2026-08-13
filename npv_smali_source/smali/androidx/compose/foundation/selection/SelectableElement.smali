.class final Landroidx/compose/foundation/selection/SelectableElement;
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
        "\u053a"
    }
    d2 = {
        "\u053b",
        "\u053c",
        "\u053d",
        "",
        "\u053e",
        "\u053f",
        "\u0540",
        "\u0541",
        "\u0542",
        "\u0543",
        "\u0544",
        "\u0545",
        "\u0546",
        "\u0547",
        "\u0548",
        "\u0549",
        "\u054a",
        "\u054b",
        "\u054c",
        "\u054d",
        "\u054e",
        "\u054f",
        "",
        "\u0550",
        "\u0551",
        "\u0552",
        "",
        "\u0553",
        "\u0554",
        "\u0555",
        "\u0556",
        "\u0557",
        "\u0558",
        "\u0559",
        "\u055a",
        "\u055b",
        "\u055c",
        "\u055d",
        "\u055e",
        "\u055f",
        "\u0560"
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

.field private final c:Lz/l;

.field private final d:Lv/I;

.field private final e:Z

.field private final f:LK0/h;

.field private final g:Lx7/a;


# direct methods
.method private constructor <init>(ZLz/l;Lv/I;ZLK0/h;Lx7/a;)V
    .locals 0

    invoke-direct {p0}, LF0/W;-><init>()V

    iput-boolean p1, p0, Landroidx/compose/foundation/selection/SelectableElement;->b:Z

    iput-object p2, p0, Landroidx/compose/foundation/selection/SelectableElement;->c:Lz/l;

    iput-object p3, p0, Landroidx/compose/foundation/selection/SelectableElement;->d:Lv/I;

    iput-boolean p4, p0, Landroidx/compose/foundation/selection/SelectableElement;->e:Z

    iput-object p5, p0, Landroidx/compose/foundation/selection/SelectableElement;->f:LK0/h;

    iput-object p6, p0, Landroidx/compose/foundation/selection/SelectableElement;->g:Lx7/a;

    return-void
.end method

.method public synthetic constructor <init>(ZLz/l;Lv/I;ZLK0/h;Lx7/a;Ly7/k;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Landroidx/compose/foundation/selection/SelectableElement;-><init>(ZLz/l;Lv/I;ZLK0/h;Lx7/a;)V

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

    const-class v3, Landroidx/compose/foundation/selection/SelectableElement;

    if-eq v3, v2, :cond_2

    return v1

    :cond_2
    check-cast p1, Landroidx/compose/foundation/selection/SelectableElement;

    iget-boolean v2, p0, Landroidx/compose/foundation/selection/SelectableElement;->b:Z

    iget-boolean v3, p1, Landroidx/compose/foundation/selection/SelectableElement;->b:Z

    if-eq v2, v3, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Landroidx/compose/foundation/selection/SelectableElement;->c:Lz/l;

    iget-object v3, p1, Landroidx/compose/foundation/selection/SelectableElement;->c:Lz/l;

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    :cond_4
    iget-object v2, p0, Landroidx/compose/foundation/selection/SelectableElement;->d:Lv/I;

    iget-object v3, p1, Landroidx/compose/foundation/selection/SelectableElement;->d:Lv/I;

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    return v1

    :cond_5
    iget-boolean v2, p0, Landroidx/compose/foundation/selection/SelectableElement;->e:Z

    iget-boolean v3, p1, Landroidx/compose/foundation/selection/SelectableElement;->e:Z

    if-eq v2, v3, :cond_6

    return v1

    :cond_6
    iget-object v2, p0, Landroidx/compose/foundation/selection/SelectableElement;->f:LK0/h;

    iget-object v3, p1, Landroidx/compose/foundation/selection/SelectableElement;->f:LK0/h;

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    return v1

    :cond_7
    iget-object v2, p0, Landroidx/compose/foundation/selection/SelectableElement;->g:Lx7/a;

    iget-object p1, p1, Landroidx/compose/foundation/selection/SelectableElement;->g:Lx7/a;

    if-eq v2, p1, :cond_8

    return v1

    :cond_8
    return v0
.end method

.method public bridge synthetic g()Landroidx/compose/ui/d$c;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/foundation/selection/SelectableElement;->l()Landroidx/compose/foundation/selection/b;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    iget-boolean v0, p0, Landroidx/compose/foundation/selection/SelectableElement;->b:Z

    invoke-static {v0}, Lt/h;->a(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/foundation/selection/SelectableElement;->c:Lz/l;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/foundation/selection/SelectableElement;->d:Lv/I;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Landroidx/compose/foundation/selection/SelectableElement;->e:Z

    invoke-static {v1}, Lt/h;->a(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/foundation/selection/SelectableElement;->f:LK0/h;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, LK0/h;->n()I

    move-result v1

    invoke-static {v1}, LK0/h;->l(I)I

    move-result v2

    :cond_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/foundation/selection/SelectableElement;->g:Lx7/a;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public bridge synthetic j(Landroidx/compose/ui/d$c;)V
    .locals 0

    check-cast p1, Landroidx/compose/foundation/selection/b;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/selection/SelectableElement;->m(Landroidx/compose/foundation/selection/b;)V

    return-void
.end method

.method public l()Landroidx/compose/foundation/selection/b;
    .locals 9

    new-instance v8, Landroidx/compose/foundation/selection/b;

    iget-boolean v1, p0, Landroidx/compose/foundation/selection/SelectableElement;->b:Z

    iget-object v2, p0, Landroidx/compose/foundation/selection/SelectableElement;->c:Lz/l;

    iget-object v3, p0, Landroidx/compose/foundation/selection/SelectableElement;->d:Lv/I;

    iget-boolean v4, p0, Landroidx/compose/foundation/selection/SelectableElement;->e:Z

    iget-object v5, p0, Landroidx/compose/foundation/selection/SelectableElement;->f:LK0/h;

    iget-object v6, p0, Landroidx/compose/foundation/selection/SelectableElement;->g:Lx7/a;

    const/4 v7, 0x0

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Landroidx/compose/foundation/selection/b;-><init>(ZLz/l;Lv/I;ZLK0/h;Lx7/a;Ly7/k;)V

    return-object v8
.end method

.method public m(Landroidx/compose/foundation/selection/b;)V
    .locals 7

    iget-boolean v1, p0, Landroidx/compose/foundation/selection/SelectableElement;->b:Z

    iget-object v2, p0, Landroidx/compose/foundation/selection/SelectableElement;->c:Lz/l;

    iget-object v3, p0, Landroidx/compose/foundation/selection/SelectableElement;->d:Lv/I;

    iget-boolean v4, p0, Landroidx/compose/foundation/selection/SelectableElement;->e:Z

    iget-object v5, p0, Landroidx/compose/foundation/selection/SelectableElement;->f:LK0/h;

    iget-object v6, p0, Landroidx/compose/foundation/selection/SelectableElement;->g:Lx7/a;

    move-object v0, p1

    invoke-virtual/range {v0 .. v6}, Landroidx/compose/foundation/selection/b;->u2(ZLz/l;Lv/I;ZLK0/h;Lx7/a;)V

    return-void
.end method
