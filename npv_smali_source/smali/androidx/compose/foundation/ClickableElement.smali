.class final Landroidx/compose/foundation/ClickableElement;
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
        "\u0186"
    }
    d2 = {
        "\u0187",
        "\u0188",
        "\u0189",
        "\u018a",
        "\u018b",
        "\u018c",
        "\u018d",
        "",
        "\u018e",
        "",
        "\u018f",
        "\u0190",
        "\u0191",
        "\u0192",
        "\u0193",
        "\u0194",
        "\u0195",
        "\u0196",
        "\u0197",
        "\u0198",
        "\u0199",
        "\u019a",
        "\u019b",
        "",
        "\u019c",
        "\u019d",
        "\u019e",
        "",
        "\u019f",
        "\u01a0",
        "\u01a1",
        "\u01a2",
        "\u01a3",
        "\u01a4",
        "\u01a5",
        "\u01a6",
        "\u01a7",
        "\u01a8",
        "\u01a9",
        "\u01aa",
        "\u01ab",
        "\u01ac",
        "\u01ad"
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


# direct methods
.method private constructor <init>(Lz/l;Lv/I;ZLjava/lang/String;LK0/h;Lx7/a;)V
    .locals 0

    invoke-direct {p0}, LF0/W;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/ClickableElement;->b:Lz/l;

    iput-object p2, p0, Landroidx/compose/foundation/ClickableElement;->c:Lv/I;

    iput-boolean p3, p0, Landroidx/compose/foundation/ClickableElement;->d:Z

    iput-object p4, p0, Landroidx/compose/foundation/ClickableElement;->e:Ljava/lang/String;

    iput-object p5, p0, Landroidx/compose/foundation/ClickableElement;->f:LK0/h;

    iput-object p6, p0, Landroidx/compose/foundation/ClickableElement;->g:Lx7/a;

    return-void
.end method

.method public synthetic constructor <init>(Lz/l;Lv/I;ZLjava/lang/String;LK0/h;Lx7/a;Ly7/k;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Landroidx/compose/foundation/ClickableElement;-><init>(Lz/l;Lv/I;ZLjava/lang/String;LK0/h;Lx7/a;)V

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

    const-class v3, Landroidx/compose/foundation/ClickableElement;

    if-eq v3, v2, :cond_2

    return v1

    :cond_2
    check-cast p1, Landroidx/compose/foundation/ClickableElement;

    iget-object v2, p0, Landroidx/compose/foundation/ClickableElement;->b:Lz/l;

    iget-object v3, p1, Landroidx/compose/foundation/ClickableElement;->b:Lz/l;

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Landroidx/compose/foundation/ClickableElement;->c:Lv/I;

    iget-object v3, p1, Landroidx/compose/foundation/ClickableElement;->c:Lv/I;

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    :cond_4
    iget-boolean v2, p0, Landroidx/compose/foundation/ClickableElement;->d:Z

    iget-boolean v3, p1, Landroidx/compose/foundation/ClickableElement;->d:Z

    if-eq v2, v3, :cond_5

    return v1

    :cond_5
    iget-object v2, p0, Landroidx/compose/foundation/ClickableElement;->e:Ljava/lang/String;

    iget-object v3, p1, Landroidx/compose/foundation/ClickableElement;->e:Ljava/lang/String;

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    return v1

    :cond_6
    iget-object v2, p0, Landroidx/compose/foundation/ClickableElement;->f:LK0/h;

    iget-object v3, p1, Landroidx/compose/foundation/ClickableElement;->f:LK0/h;

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    return v1

    :cond_7
    iget-object v2, p0, Landroidx/compose/foundation/ClickableElement;->g:Lx7/a;

    iget-object p1, p1, Landroidx/compose/foundation/ClickableElement;->g:Lx7/a;

    if-eq v2, p1, :cond_8

    return v1

    :cond_8
    return v0
.end method

.method public bridge synthetic g()Landroidx/compose/ui/d$c;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/foundation/ClickableElement;->l()Landroidx/compose/foundation/e;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    iget-object v0, p0, Landroidx/compose/foundation/ClickableElement;->b:Lz/l;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Landroidx/compose/foundation/ClickableElement;->c:Lv/I;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Landroidx/compose/foundation/ClickableElement;->d:Z

    invoke-static {v2}, Lt/h;->a(Z)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Landroidx/compose/foundation/ClickableElement;->e:Ljava/lang/String;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_2

    :cond_2
    move v2, v1

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Landroidx/compose/foundation/ClickableElement;->f:LK0/h;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, LK0/h;->n()I

    move-result v1

    invoke-static {v1}, LK0/h;->l(I)I

    move-result v1

    :cond_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/foundation/ClickableElement;->g:Lx7/a;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public bridge synthetic j(Landroidx/compose/ui/d$c;)V
    .locals 0

    check-cast p1, Landroidx/compose/foundation/e;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/ClickableElement;->m(Landroidx/compose/foundation/e;)V

    return-void
.end method

.method public l()Landroidx/compose/foundation/e;
    .locals 9

    new-instance v8, Landroidx/compose/foundation/e;

    iget-object v1, p0, Landroidx/compose/foundation/ClickableElement;->b:Lz/l;

    iget-object v2, p0, Landroidx/compose/foundation/ClickableElement;->c:Lv/I;

    iget-boolean v3, p0, Landroidx/compose/foundation/ClickableElement;->d:Z

    iget-object v4, p0, Landroidx/compose/foundation/ClickableElement;->e:Ljava/lang/String;

    iget-object v5, p0, Landroidx/compose/foundation/ClickableElement;->f:LK0/h;

    iget-object v6, p0, Landroidx/compose/foundation/ClickableElement;->g:Lx7/a;

    const/4 v7, 0x0

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Landroidx/compose/foundation/e;-><init>(Lz/l;Lv/I;ZLjava/lang/String;LK0/h;Lx7/a;Ly7/k;)V

    return-object v8
.end method

.method public m(Landroidx/compose/foundation/e;)V
    .locals 7

    iget-object v1, p0, Landroidx/compose/foundation/ClickableElement;->b:Lz/l;

    iget-object v2, p0, Landroidx/compose/foundation/ClickableElement;->c:Lv/I;

    iget-boolean v3, p0, Landroidx/compose/foundation/ClickableElement;->d:Z

    iget-object v4, p0, Landroidx/compose/foundation/ClickableElement;->e:Ljava/lang/String;

    iget-object v5, p0, Landroidx/compose/foundation/ClickableElement;->f:LK0/h;

    iget-object v6, p0, Landroidx/compose/foundation/ClickableElement;->g:Lx7/a;

    move-object v0, p1

    invoke-virtual/range {v0 .. v6}, Landroidx/compose/foundation/e;->t2(Lz/l;Lv/I;ZLjava/lang/String;LK0/h;Lx7/a;)V

    return-void
.end method
