.class final Landroidx/compose/foundation/gestures/ScrollableElement;
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
        "\u02c3"
    }
    d2 = {
        "\u02c4",
        "\u02c5",
        "\u02c6",
        "\u02c7",
        "\u02c8",
        "\u02c9",
        "\u02ca",
        "\u02cb",
        "\u02cc",
        "",
        "\u02cd",
        "\u02ce",
        "\u02cf",
        "\u02d0",
        "\u02d1",
        "\u02d2",
        "\u02d3",
        "\u02d4",
        "\u02d5",
        "\u02d6",
        "\u02d7",
        "\u02d8",
        "\u02d9",
        "\u02da",
        "\u02db",
        "\u02dc",
        "",
        "\u02dd",
        "\u02de",
        "",
        "\u02df",
        "\u02e0",
        "\u02e1",
        "\u02e2",
        "\u02e3",
        "\u02e4",
        "\u02e5",
        "\u02e6",
        "\u02e7",
        "\u02e8",
        "\u02e9",
        "\u02ea",
        "\u02eb",
        "\u02ec",
        "\u02ed",
        "\u02ee",
        "\u02ef",
        "\u02f0",
        "\u02f1",
        "\u02f2",
        "\u02f3",
        "\u02f4",
        "\u02f5",
        "\u02f6",
        "\u02f7",
        "\u02f8",
        "\u02f9",
        "\u02fa",
        "\u02fb",
        "\u02fc",
        "\u02fd",
        "\u02fe",
        "\u02ff",
        "\u0300"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final b:Lx/A;

.field private final c:Lx/s;

.field private final d:Lv/T;

.field private final e:Z

.field private final f:Z

.field private final g:Lx/p;

.field private final h:Lz/l;

.field private final i:Lx/f;


# direct methods
.method public constructor <init>(Lx/A;Lx/s;Lv/T;ZZLx/p;Lz/l;Lx/f;)V
    .locals 0

    invoke-direct {p0}, LF0/W;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->b:Lx/A;

    iput-object p2, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->c:Lx/s;

    iput-object p3, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->d:Lv/T;

    iput-boolean p4, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->e:Z

    iput-boolean p5, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->f:Z

    iput-object p6, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->g:Lx/p;

    iput-object p7, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->h:Lz/l;

    iput-object p8, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->i:Lx/f;

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
    instance-of v1, p1, Landroidx/compose/foundation/gestures/ScrollableElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget-object v1, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->b:Lx/A;

    check-cast p1, Landroidx/compose/foundation/gestures/ScrollableElement;

    iget-object v3, p1, Landroidx/compose/foundation/gestures/ScrollableElement;->b:Lx/A;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->c:Lx/s;

    iget-object v3, p1, Landroidx/compose/foundation/gestures/ScrollableElement;->c:Lx/s;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->d:Lv/T;

    iget-object v3, p1, Landroidx/compose/foundation/gestures/ScrollableElement;->d:Lv/T;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->e:Z

    iget-boolean v3, p1, Landroidx/compose/foundation/gestures/ScrollableElement;->e:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->f:Z

    iget-boolean v3, p1, Landroidx/compose/foundation/gestures/ScrollableElement;->f:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->g:Lx/p;

    iget-object v3, p1, Landroidx/compose/foundation/gestures/ScrollableElement;->g:Lx/p;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->h:Lz/l;

    iget-object v3, p1, Landroidx/compose/foundation/gestures/ScrollableElement;->h:Lz/l;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->i:Lx/f;

    iget-object p1, p1, Landroidx/compose/foundation/gestures/ScrollableElement;->i:Lx/f;

    invoke-static {v1, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public bridge synthetic g()Landroidx/compose/ui/d$c;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/foundation/gestures/ScrollableElement;->l()Landroidx/compose/foundation/gestures/f;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    iget-object v0, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->b:Lx/A;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->c:Lx/s;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->d:Lv/T;

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

    iget-boolean v1, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->e:Z

    invoke-static {v1}, Lt/h;->a(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->f:Z

    invoke-static {v1}, Lt/h;->a(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->g:Lx/p;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->h:Lz/l;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_2

    :cond_2
    move v1, v2

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->i:Lx/f;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :cond_3
    add-int/2addr v0, v2

    return v0
.end method

.method public bridge synthetic j(Landroidx/compose/ui/d$c;)V
    .locals 0

    check-cast p1, Landroidx/compose/foundation/gestures/f;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/gestures/ScrollableElement;->m(Landroidx/compose/foundation/gestures/f;)V

    return-void
.end method

.method public l()Landroidx/compose/foundation/gestures/f;
    .locals 10

    new-instance v9, Landroidx/compose/foundation/gestures/f;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->b:Lx/A;

    iget-object v2, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->d:Lv/T;

    iget-object v3, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->g:Lx/p;

    iget-object v4, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->c:Lx/s;

    iget-boolean v5, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->e:Z

    iget-boolean v6, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->f:Z

    iget-object v7, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->h:Lz/l;

    iget-object v8, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->i:Lx/f;

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Landroidx/compose/foundation/gestures/f;-><init>(Lx/A;Lv/T;Lx/p;Lx/s;ZZLz/l;Lx/f;)V

    return-object v9
.end method

.method public m(Landroidx/compose/foundation/gestures/f;)V
    .locals 9

    iget-object v1, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->b:Lx/A;

    iget-object v2, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->c:Lx/s;

    iget-object v3, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->d:Lv/T;

    iget-boolean v4, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->e:Z

    iget-boolean v5, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->f:Z

    iget-object v6, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->g:Lx/p;

    iget-object v7, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->h:Lz/l;

    iget-object v8, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->i:Lx/f;

    move-object v0, p1

    invoke-virtual/range {v0 .. v8}, Landroidx/compose/foundation/gestures/f;->A2(Lx/A;Lx/s;Lv/T;ZZLx/p;Lz/l;Lx/f;)V

    return-void
.end method
