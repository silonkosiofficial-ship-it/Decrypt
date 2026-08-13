.class public final Landroidx/compose/foundation/gestures/DraggableElement;
.super LF0/W;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/gestures/DraggableElement$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LF0/W;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0294"
    }
    d2 = {
        "\u0295",
        "\u0296",
        "\u0297",
        "\u0298",
        "\u0299",
        "\u029a",
        "\u029b",
        "",
        "\u029c",
        "\u029d",
        "\u029e",
        "\u029f",
        "\u02a0",
        "\u02a1",
        "\u02a2",
        "\u02a3",
        "\u02a4",
        "",
        "\u02a5",
        "",
        "\u02a6",
        "\u02a7",
        "\u02a8",
        "\u02a9",
        "\u02aa",
        "\u02ab",
        "\u02ac",
        "\u02ad",
        "\u02ae",
        "\u02af",
        "\u02b0",
        "\u02b1",
        "",
        "\u02b2",
        "\u02b3",
        "\u02b4",
        "\u02b5",
        "\u02b6",
        "\u02b7",
        "\u02b8",
        "\u02b9",
        "\u02ba",
        "\u02bb",
        "\u02bc",
        "\u02bd",
        "\u02be",
        "\u02bf",
        "\u02c0",
        "\u02c1",
        "\u02c2"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final j:Landroidx/compose/foundation/gestures/DraggableElement$b;

.field private static final k:Lx7/l;


# instance fields
.field private final b:Lx/o;

.field private final c:Lx/s;

.field private final d:Z

.field private final e:Lz/l;

.field private final f:Z

.field private final g:Lx7/q;

.field private final h:Lx7/q;

.field private final i:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/foundation/gestures/DraggableElement$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/foundation/gestures/DraggableElement$b;-><init>(Ly7/k;)V

    sput-object v0, Landroidx/compose/foundation/gestures/DraggableElement;->j:Landroidx/compose/foundation/gestures/DraggableElement$b;

    sget-object v0, Landroidx/compose/foundation/gestures/DraggableElement$a;->D:Landroidx/compose/foundation/gestures/DraggableElement$a;

    sput-object v0, Landroidx/compose/foundation/gestures/DraggableElement;->k:Lx7/l;

    return-void
.end method

.method public constructor <init>(Lx/o;Lx/s;ZLz/l;ZLx7/q;Lx7/q;Z)V
    .locals 0

    invoke-direct {p0}, LF0/W;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/gestures/DraggableElement;->b:Lx/o;

    iput-object p2, p0, Landroidx/compose/foundation/gestures/DraggableElement;->c:Lx/s;

    iput-boolean p3, p0, Landroidx/compose/foundation/gestures/DraggableElement;->d:Z

    iput-object p4, p0, Landroidx/compose/foundation/gestures/DraggableElement;->e:Lz/l;

    iput-boolean p5, p0, Landroidx/compose/foundation/gestures/DraggableElement;->f:Z

    iput-object p6, p0, Landroidx/compose/foundation/gestures/DraggableElement;->g:Lx7/q;

    iput-object p7, p0, Landroidx/compose/foundation/gestures/DraggableElement;->h:Lx7/q;

    iput-boolean p8, p0, Landroidx/compose/foundation/gestures/DraggableElement;->i:Z

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

    const-class v3, Landroidx/compose/foundation/gestures/DraggableElement;

    if-eq v3, v2, :cond_2

    return v1

    :cond_2
    check-cast p1, Landroidx/compose/foundation/gestures/DraggableElement;

    iget-object v2, p0, Landroidx/compose/foundation/gestures/DraggableElement;->b:Lx/o;

    iget-object v3, p1, Landroidx/compose/foundation/gestures/DraggableElement;->b:Lx/o;

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Landroidx/compose/foundation/gestures/DraggableElement;->c:Lx/s;

    iget-object v3, p1, Landroidx/compose/foundation/gestures/DraggableElement;->c:Lx/s;

    if-eq v2, v3, :cond_4

    return v1

    :cond_4
    iget-boolean v2, p0, Landroidx/compose/foundation/gestures/DraggableElement;->d:Z

    iget-boolean v3, p1, Landroidx/compose/foundation/gestures/DraggableElement;->d:Z

    if-eq v2, v3, :cond_5

    return v1

    :cond_5
    iget-object v2, p0, Landroidx/compose/foundation/gestures/DraggableElement;->e:Lz/l;

    iget-object v3, p1, Landroidx/compose/foundation/gestures/DraggableElement;->e:Lz/l;

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    return v1

    :cond_6
    iget-boolean v2, p0, Landroidx/compose/foundation/gestures/DraggableElement;->f:Z

    iget-boolean v3, p1, Landroidx/compose/foundation/gestures/DraggableElement;->f:Z

    if-eq v2, v3, :cond_7

    return v1

    :cond_7
    iget-object v2, p0, Landroidx/compose/foundation/gestures/DraggableElement;->g:Lx7/q;

    iget-object v3, p1, Landroidx/compose/foundation/gestures/DraggableElement;->g:Lx7/q;

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    return v1

    :cond_8
    iget-object v2, p0, Landroidx/compose/foundation/gestures/DraggableElement;->h:Lx7/q;

    iget-object v3, p1, Landroidx/compose/foundation/gestures/DraggableElement;->h:Lx7/q;

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    return v1

    :cond_9
    iget-boolean v2, p0, Landroidx/compose/foundation/gestures/DraggableElement;->i:Z

    iget-boolean p1, p1, Landroidx/compose/foundation/gestures/DraggableElement;->i:Z

    if-eq v2, p1, :cond_a

    return v1

    :cond_a
    return v0
.end method

.method public bridge synthetic g()Landroidx/compose/ui/d$c;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/foundation/gestures/DraggableElement;->l()Landroidx/compose/foundation/gestures/c;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/compose/foundation/gestures/DraggableElement;->b:Lx/o;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/foundation/gestures/DraggableElement;->c:Lx/s;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Landroidx/compose/foundation/gestures/DraggableElement;->d:Z

    invoke-static {v1}, Lt/h;->a(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/foundation/gestures/DraggableElement;->e:Lz/l;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Landroidx/compose/foundation/gestures/DraggableElement;->f:Z

    invoke-static {v1}, Lt/h;->a(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/foundation/gestures/DraggableElement;->g:Lx7/q;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/foundation/gestures/DraggableElement;->h:Lx7/q;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Landroidx/compose/foundation/gestures/DraggableElement;->i:Z

    invoke-static {v1}, Lt/h;->a(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public bridge synthetic j(Landroidx/compose/ui/d$c;)V
    .locals 0

    check-cast p1, Landroidx/compose/foundation/gestures/c;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/gestures/DraggableElement;->m(Landroidx/compose/foundation/gestures/c;)V

    return-void
.end method

.method public l()Landroidx/compose/foundation/gestures/c;
    .locals 11

    new-instance v10, Landroidx/compose/foundation/gestures/c;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/DraggableElement;->b:Lx/o;

    sget-object v2, Landroidx/compose/foundation/gestures/DraggableElement;->k:Lx7/l;

    iget-object v3, p0, Landroidx/compose/foundation/gestures/DraggableElement;->c:Lx/s;

    iget-boolean v4, p0, Landroidx/compose/foundation/gestures/DraggableElement;->d:Z

    iget-object v5, p0, Landroidx/compose/foundation/gestures/DraggableElement;->e:Lz/l;

    iget-boolean v6, p0, Landroidx/compose/foundation/gestures/DraggableElement;->f:Z

    iget-object v7, p0, Landroidx/compose/foundation/gestures/DraggableElement;->g:Lx7/q;

    iget-object v8, p0, Landroidx/compose/foundation/gestures/DraggableElement;->h:Lx7/q;

    iget-boolean v9, p0, Landroidx/compose/foundation/gestures/DraggableElement;->i:Z

    move-object v0, v10

    invoke-direct/range {v0 .. v9}, Landroidx/compose/foundation/gestures/c;-><init>(Lx/o;Lx7/l;Lx/s;ZLz/l;ZLx7/q;Lx7/q;Z)V

    return-object v10
.end method

.method public m(Landroidx/compose/foundation/gestures/c;)V
    .locals 10

    iget-object v1, p0, Landroidx/compose/foundation/gestures/DraggableElement;->b:Lx/o;

    sget-object v2, Landroidx/compose/foundation/gestures/DraggableElement;->k:Lx7/l;

    iget-object v3, p0, Landroidx/compose/foundation/gestures/DraggableElement;->c:Lx/s;

    iget-boolean v4, p0, Landroidx/compose/foundation/gestures/DraggableElement;->d:Z

    iget-object v5, p0, Landroidx/compose/foundation/gestures/DraggableElement;->e:Lz/l;

    iget-boolean v6, p0, Landroidx/compose/foundation/gestures/DraggableElement;->f:Z

    iget-object v7, p0, Landroidx/compose/foundation/gestures/DraggableElement;->g:Lx7/q;

    iget-object v8, p0, Landroidx/compose/foundation/gestures/DraggableElement;->h:Lx7/q;

    iget-boolean v9, p0, Landroidx/compose/foundation/gestures/DraggableElement;->i:Z

    move-object v0, p1

    invoke-virtual/range {v0 .. v9}, Landroidx/compose/foundation/gestures/c;->B2(Lx/o;Lx7/l;Lx/s;ZLz/l;ZLx7/q;Lx7/q;Z)V

    return-void
.end method
