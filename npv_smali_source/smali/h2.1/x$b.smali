.class public final Lh2/x$b;
.super Lh2/x;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh2/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh2/x$b$a;
    }
.end annotation


# static fields
.field public static final g:Lh2/x$b$a;

.field private static final h:Lh2/x$b;


# instance fields
.field private final a:Lh2/t;

.field private final b:Ljava/util/List;

.field private final c:I

.field private final d:I

.field private final e:Lh2/s;

.field private final f:Lh2/s;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lh2/x$b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lh2/x$b$a;-><init>(Ly7/k;)V

    sput-object v0, Lh2/x$b;->g:Lh2/x$b$a;

    sget-object v1, Lh2/W;->e:Lh2/W$a;

    invoke-virtual {v1}, Lh2/W$a;->a()Lh2/W;

    move-result-object v1

    invoke-static {v1}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    new-instance v4, Lh2/s;

    sget-object v2, Lh2/r$c;->b:Lh2/r$c$a;

    invoke-virtual {v2}, Lh2/r$c$a;->b()Lh2/r$c;

    move-result-object v3

    invoke-virtual {v2}, Lh2/r$c$a;->a()Lh2/r$c;

    move-result-object v5

    invoke-virtual {v2}, Lh2/r$c$a;->a()Lh2/r$c;

    move-result-object v2

    invoke-direct {v4, v3, v5, v2}, Lh2/s;-><init>(Lh2/r;Lh2/r;Lh2/r;)V

    const/16 v6, 0x10

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lh2/x$b$a;->d(Lh2/x$b$a;Ljava/util/List;IILh2/s;Lh2/s;ILjava/lang/Object;)Lh2/x$b;

    move-result-object v0

    sput-object v0, Lh2/x$b;->h:Lh2/x$b;

    return-void
.end method

.method private constructor <init>(Lh2/t;Ljava/util/List;IILh2/s;Lh2/s;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lh2/x;-><init>(Ly7/k;)V

    iput-object p1, p0, Lh2/x$b;->a:Lh2/t;

    iput-object p2, p0, Lh2/x$b;->b:Ljava/util/List;

    iput p3, p0, Lh2/x$b;->c:I

    iput p4, p0, Lh2/x$b;->d:I

    iput-object p5, p0, Lh2/x$b;->e:Lh2/s;

    iput-object p6, p0, Lh2/x$b;->f:Lh2/s;

    sget-object p5, Lh2/t;->E:Lh2/t;

    if-eq p1, p5, :cond_1

    if-ltz p3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Prepend insert defining placeholdersBefore must be > 0, but was "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    :goto_0
    sget-object p3, Lh2/t;->D:Lh2/t;

    if-eq p1, p3, :cond_3

    if-ltz p4, :cond_2

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Append insert defining placeholdersAfter must be > 0, but was "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    :goto_1
    sget-object p3, Lh2/t;->C:Lh2/t;

    if-ne p1, p3, :cond_5

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_4

    goto :goto_2

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_2
    return-void
.end method

.method public synthetic constructor <init>(Lh2/t;Ljava/util/List;IILh2/s;Lh2/s;Ly7/k;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Lh2/x$b;-><init>(Lh2/t;Ljava/util/List;IILh2/s;Lh2/s;)V

    return-void
.end method

.method public static final synthetic c()Lh2/x$b;
    .locals 1

    sget-object v0, Lh2/x$b;->h:Lh2/x$b;

    return-object v0
.end method

.method public static synthetic e(Lh2/x$b;Lh2/t;Ljava/util/List;IILh2/s;Lh2/s;ILjava/lang/Object;)Lh2/x$b;
    .locals 4

    .prologue
    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lh2/x$b;->a:Lh2/t;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lh2/x$b;->b:Ljava/util/List;

    :cond_1
    move-object p8, p2

    and-int/lit8 p2, p7, 0x4

    if-eqz p2, :cond_2

    iget p3, p0, Lh2/x$b;->c:I

    :cond_2
    move v0, p3

    and-int/lit8 p2, p7, 0x8

    if-eqz p2, :cond_3

    iget p4, p0, Lh2/x$b;->d:I

    :cond_3
    move v1, p4

    and-int/lit8 p2, p7, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lh2/x$b;->e:Lh2/s;

    :cond_4
    move-object v2, p5

    and-int/lit8 p2, p7, 0x20

    if-eqz p2, :cond_5

    iget-object p6, p0, Lh2/x$b;->f:Lh2/s;

    :cond_5
    move-object v3, p6

    move-object p2, p0

    move-object p3, p1

    move-object p4, p8

    move p5, v0

    move p6, v1

    move-object p7, v2

    move-object p8, v3

    invoke-virtual/range {p2 .. p8}, Lh2/x$b;->d(Lh2/t;Ljava/util/List;IILh2/s;Lh2/s;)Lh2/x$b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lx7/p;Lm7/e;)Ljava/lang/Object;
    .locals 17

    .prologue
    move-object/from16 v0, p2

    instance-of v1, v0, Lh2/x$b$b;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lh2/x$b$b;

    iget v2, v1, Lh2/x$b$b;->S:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lh2/x$b$b;->S:I

    move-object/from16 v2, p0

    goto :goto_0

    :cond_0
    new-instance v1, Lh2/x$b$b;

    move-object/from16 v2, p0

    invoke-direct {v1, v2, v0}, Lh2/x$b$b;-><init>(Lh2/x$b;Lm7/e;)V

    :goto_0
    iget-object v0, v1, Lh2/x$b$b;->Q:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v3

    iget v4, v1, Lh2/x$b$b;->S:I

    const/16 v5, 0xa

    const/4 v6, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v6, :cond_1

    iget-object v4, v1, Lh2/x$b$b;->P:Ljava/lang/Object;

    check-cast v4, Ljava/util/Collection;

    iget-object v7, v1, Lh2/x$b$b;->O:Ljava/lang/Object;

    check-cast v7, Ljava/util/Collection;

    iget-object v8, v1, Lh2/x$b$b;->N:Ljava/lang/Object;

    check-cast v8, Ljava/util/Iterator;

    iget-object v9, v1, Lh2/x$b$b;->M:Ljava/lang/Object;

    check-cast v9, Ljava/util/Collection;

    iget-object v10, v1, Lh2/x$b$b;->L:Ljava/lang/Object;

    check-cast v10, [I

    iget-object v11, v1, Lh2/x$b$b;->K:Ljava/lang/Object;

    check-cast v11, Lh2/W;

    iget-object v12, v1, Lh2/x$b$b;->J:Ljava/lang/Object;

    check-cast v12, Ljava/util/Iterator;

    iget-object v13, v1, Lh2/x$b$b;->I:Ljava/lang/Object;

    check-cast v13, Ljava/util/Collection;

    iget-object v14, v1, Lh2/x$b$b;->H:Ljava/lang/Object;

    check-cast v14, Lh2/t;

    iget-object v15, v1, Lh2/x$b$b;->G:Ljava/lang/Object;

    check-cast v15, Lh2/x$b;

    iget-object v6, v1, Lh2/x$b$b;->F:Ljava/lang/Object;

    check-cast v6, Lx7/p;

    invoke-static {v0}, Li7/x;->b(Ljava/lang/Object;)V

    move-object/from16 v16, v11

    move-object v11, v8

    move-object v8, v14

    move-object v14, v9

    move-object v9, v15

    const/4 v15, 0x1

    goto/16 :goto_3

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Li7/x;->b(Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lh2/x$b;->f()Lh2/t;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lh2/x$b;->h()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v4, v5}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move-object v7, v0

    move-object v8, v2

    move-object/from16 v0, p1

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lh2/W;

    invoke-virtual {v9}, Lh2/W;->e()[I

    move-result-object v10

    invoke-virtual {v9}, Lh2/W;->b()Ljava/util/List;

    move-result-object v11

    check-cast v11, Ljava/lang/Iterable;

    new-instance v12, Ljava/util/ArrayList;

    invoke-static {v11, v5}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v13

    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    move-object v13, v9

    move-object v9, v8

    move-object v8, v7

    move-object v7, v6

    move-object v6, v4

    move-object v4, v7

    :goto_2
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_4

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    iput-object v0, v1, Lh2/x$b$b;->F:Ljava/lang/Object;

    iput-object v9, v1, Lh2/x$b$b;->G:Ljava/lang/Object;

    iput-object v8, v1, Lh2/x$b$b;->H:Ljava/lang/Object;

    iput-object v7, v1, Lh2/x$b$b;->I:Ljava/lang/Object;

    iput-object v6, v1, Lh2/x$b$b;->J:Ljava/lang/Object;

    iput-object v13, v1, Lh2/x$b$b;->K:Ljava/lang/Object;

    iput-object v10, v1, Lh2/x$b$b;->L:Ljava/lang/Object;

    iput-object v12, v1, Lh2/x$b$b;->M:Ljava/lang/Object;

    iput-object v11, v1, Lh2/x$b$b;->N:Ljava/lang/Object;

    iput-object v12, v1, Lh2/x$b$b;->O:Ljava/lang/Object;

    iput-object v4, v1, Lh2/x$b$b;->P:Ljava/lang/Object;

    const/4 v15, 0x1

    iput v15, v1, Lh2/x$b$b;->S:I

    invoke-interface {v0, v14, v1}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    if-ne v14, v3, :cond_3

    return-object v3

    :cond_3
    move-object/from16 v16, v13

    move-object v13, v7

    move-object v7, v12

    move-object v12, v6

    move-object v6, v0

    move-object v0, v14

    move-object v14, v7

    :goto_3
    invoke-interface {v7, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v0, v6

    move-object v6, v12

    move-object v7, v13

    move-object v12, v14

    move-object/from16 v13, v16

    goto :goto_2

    :cond_4
    const/4 v15, 0x1

    check-cast v12, Ljava/util/List;

    invoke-virtual {v13}, Lh2/W;->d()I

    move-result v11

    invoke-virtual {v13}, Lh2/W;->c()Ljava/util/List;

    move-result-object v13

    new-instance v14, Lh2/W;

    invoke-direct {v14, v10, v12, v11, v13}, Lh2/W;-><init>([ILjava/util/List;ILjava/util/List;)V

    invoke-interface {v4, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v4, v6

    move-object v6, v7

    move-object v7, v8

    move-object v8, v9

    goto :goto_1

    :cond_5
    move-object v0, v6

    check-cast v0, Ljava/util/List;

    invoke-virtual {v8}, Lh2/x$b;->j()I

    move-result v9

    invoke-virtual {v8}, Lh2/x$b;->i()I

    move-result v10

    invoke-virtual {v8}, Lh2/x$b;->k()Lh2/s;

    move-result-object v11

    invoke-virtual {v8}, Lh2/x$b;->g()Lh2/s;

    move-result-object v12

    new-instance v1, Lh2/x$b;

    const/4 v13, 0x0

    move-object v6, v1

    move-object v8, v0

    invoke-direct/range {v6 .. v13}, Lh2/x$b;-><init>(Lh2/t;Ljava/util/List;IILh2/s;Lh2/s;Ly7/k;)V

    return-object v1
.end method

.method public final d(Lh2/t;Ljava/util/List;IILh2/s;Lh2/s;)Lh2/x$b;
    .locals 8

    const-string v0, "loadType"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pages"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sourceLoadStates"

    invoke-static {p5, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lh2/x$b;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lh2/x$b;-><init>(Lh2/t;Ljava/util/List;IILh2/s;Lh2/s;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lh2/x$b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lh2/x$b;

    iget-object v1, p0, Lh2/x$b;->a:Lh2/t;

    iget-object v3, p1, Lh2/x$b;->a:Lh2/t;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lh2/x$b;->b:Ljava/util/List;

    iget-object v3, p1, Lh2/x$b;->b:Ljava/util/List;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lh2/x$b;->c:I

    iget v3, p1, Lh2/x$b;->c:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lh2/x$b;->d:I

    iget v3, p1, Lh2/x$b;->d:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lh2/x$b;->e:Lh2/s;

    iget-object v3, p1, Lh2/x$b;->e:Lh2/s;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lh2/x$b;->f:Lh2/s;

    iget-object p1, p1, Lh2/x$b;->f:Lh2/s;

    invoke-static {v1, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final f()Lh2/t;
    .locals 1

    iget-object v0, p0, Lh2/x$b;->a:Lh2/t;

    return-object v0
.end method

.method public final g()Lh2/s;
    .locals 1

    iget-object v0, p0, Lh2/x$b;->f:Lh2/s;

    return-object v0
.end method

.method public final h()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lh2/x$b;->b:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .prologue
    iget-object v0, p0, Lh2/x$b;->a:Lh2/t;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lh2/x$b;->b:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lh2/x$b;->c:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lh2/x$b;->d:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lh2/x$b;->e:Lh2/s;

    invoke-virtual {v1}, Lh2/s;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lh2/x$b;->f:Lh2/s;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lh2/s;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final i()I
    .locals 1

    iget v0, p0, Lh2/x$b;->d:I

    return v0
.end method

.method public final j()I
    .locals 1

    iget v0, p0, Lh2/x$b;->c:I

    return v0
.end method

.method public final k()Lh2/s;
    .locals 1

    iget-object v0, p0, Lh2/x$b;->e:Lh2/s;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .prologue
    iget-object v0, p0, Lh2/x$b;->b:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lh2/W;

    invoke-virtual {v2}, Lh2/W;->b()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_0

    :cond_0
    iget v0, p0, Lh2/x$b;->c:I

    const-string v2, "none"

    const/4 v3, -0x1

    if-eq v0, v3, :cond_1

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v0, v2

    :goto_1
    iget v4, p0, Lh2/x$b;->d:I

    if-eq v4, v3, :cond_2

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    :cond_2
    iget-object v3, p0, Lh2/x$b;->f:Lh2/s;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "PageEvent.Insert for "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lh2/x$b;->a:Lh2/t;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, ", with "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " items (\n                    |   first item: "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lh2/x$b;->b:Ljava/util/List;

    invoke-static {v1}, Lj7/v;->k0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh2/W;

    const/4 v5, 0x0

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lh2/W;->b()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-static {v1}, Lj7/v;->k0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_2

    :cond_3
    move-object v1, v5

    :goto_2
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\n                    |   last item: "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lh2/x$b;->b:Ljava/util/List;

    invoke-static {v1}, Lj7/v;->v0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh2/W;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lh2/W;->b()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-static {v1}, Lj7/v;->v0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_3

    :cond_4
    move-object v1, v5

    :goto_3
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\n                    |   placeholdersBefore: "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n                    |   placeholdersAfter: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n                    |   sourceLoadStates: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lh2/x$b;->e:Lh2/s;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "\n                    "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    if-eqz v3, :cond_5

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "|   mediatorLoadStates: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v0, 0xa

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_5
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "|)"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v5, v1, v5}, LS8/r;->q(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
