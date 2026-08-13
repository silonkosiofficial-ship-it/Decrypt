.class public final Lz9/W;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lz9/a;

.field private final b:Z

.field private final c:Z

.field private d:I


# direct methods
.method public constructor <init>(Ly9/g;Lz9/a;)V
    .locals 1

    const-string v0, "configuration"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lexer"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lz9/W;->a:Lz9/a;

    invoke-virtual {p1}, Ly9/g;->q()Z

    move-result p2

    iput-boolean p2, p0, Lz9/W;->b:Z

    invoke-virtual {p1}, Ly9/g;->d()Z

    move-result p1

    iput-boolean p1, p0, Lz9/W;->c:Z

    return-void
.end method

.method public static final synthetic a(Lz9/W;)Lz9/a;
    .locals 0

    iget-object p0, p0, Lz9/W;->a:Lz9/a;

    return-object p0
.end method

.method public static final synthetic b(Lz9/W;)Ly9/i;
    .locals 0

    invoke-direct {p0}, Lz9/W;->f()Ly9/i;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lz9/W;Li7/c;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lz9/W;->h(Li7/c;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lz9/W;Z)Ly9/F;
    .locals 0

    invoke-direct {p0, p1}, Lz9/W;->j(Z)Ly9/F;

    move-result-object p0

    return-object p0
.end method

.method private final f()Ly9/i;
    .locals 11

    .prologue
    iget-object v0, p0, Lz9/W;->a:Lz9/a;

    invoke-virtual {v0}, Lz9/a;->k()B

    move-result v0

    iget-object v1, p0, Lz9/W;->a:Lz9/a;

    invoke-virtual {v1}, Lz9/a;->D()B

    move-result v1

    const/4 v2, 0x4

    if-eq v1, v2, :cond_7

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    :goto_0
    iget-object v3, p0, Lz9/W;->a:Lz9/a;

    invoke-virtual {v3}, Lz9/a;->f()Z

    move-result v3

    const/16 v4, 0x9

    if-eqz v3, :cond_3

    invoke-virtual {p0}, Lz9/W;->e()Ly9/i;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lz9/W;->a:Lz9/a;

    invoke-virtual {v0}, Lz9/a;->k()B

    move-result v0

    if-eq v0, v2, :cond_0

    iget-object v5, p0, Lz9/W;->a:Lz9/a;

    if-ne v0, v4, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    iget v7, v5, Lz9/a;->a:I

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_2
    const/4 v9, 0x4

    const/4 v10, 0x0

    const-string v6, "Expected end of the array or comma"

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lz9/a;->y(Lz9/a;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    new-instance v0, Li7/k;

    invoke-direct {v0}, Li7/k;-><init>()V

    throw v0

    :cond_3
    const/16 v3, 0x8

    if-ne v0, v3, :cond_4

    :goto_2
    iget-object v0, p0, Lz9/W;->a:Lz9/a;

    invoke-virtual {v0, v4}, Lz9/a;->l(B)B

    goto :goto_3

    :cond_4
    if-ne v0, v2, :cond_6

    iget-boolean v0, p0, Lz9/W;->c:Z

    if-eqz v0, :cond_5

    goto :goto_2

    :cond_5
    iget-object v0, p0, Lz9/W;->a:Lz9/a;

    const-string v1, "array"

    invoke-static {v0, v1}, Lz9/G;->g(Lz9/a;Ljava/lang/String;)Ljava/lang/Void;

    new-instance v0, Li7/k;

    invoke-direct {v0}, Li7/k;-><init>()V

    throw v0

    :cond_6
    :goto_3
    new-instance v0, Ly9/c;

    invoke-direct {v0, v1}, Ly9/c;-><init>(Ljava/util/List;)V

    return-object v0

    :cond_7
    iget-object v2, p0, Lz9/W;->a:Lz9/a;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const-string v3, "Unexpected leading comma"

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lz9/a;->y(Lz9/a;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    new-instance v0, Li7/k;

    invoke-direct {v0}, Li7/k;-><init>()V

    throw v0
.end method

.method private final g()Ly9/i;
    .locals 3

    new-instance v0, Li7/a;

    new-instance v1, Lz9/W$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lz9/W$a;-><init>(Lz9/W;Lm7/e;)V

    invoke-direct {v0, v1}, Li7/a;-><init>(Lx7/q;)V

    sget-object v1, Li7/M;->a:Li7/M;

    invoke-static {v0, v1}, Li7/b;->b(Li7/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly9/i;

    return-object v0
.end method

.method private final h(Li7/c;Lm7/e;)Ljava/lang/Object;
    .locals 20

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lz9/W$b;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lz9/W$b;

    iget v3, v2, Lz9/W$b;->L:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lz9/W$b;->L:I

    goto :goto_0

    :cond_0
    new-instance v2, Lz9/W$b;

    invoke-direct {v2, v0, v1}, Lz9/W$b;-><init>(Lz9/W;Lm7/e;)V

    :goto_0
    iget-object v1, v2, Lz9/W$b;->J:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v3

    iget v4, v2, Lz9/W$b;->L:I

    const/4 v5, 0x6

    const/4 v6, 0x7

    const/4 v7, 0x4

    const/4 v8, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v8, :cond_1

    iget-object v4, v2, Lz9/W$b;->I:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v9, v2, Lz9/W$b;->H:Ljava/lang/Object;

    check-cast v9, Ljava/util/LinkedHashMap;

    iget-object v10, v2, Lz9/W$b;->G:Ljava/lang/Object;

    check-cast v10, Lz9/W;

    iget-object v11, v2, Lz9/W$b;->F:Ljava/lang/Object;

    check-cast v11, Li7/c;

    invoke-static {v1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object v1, v0, Lz9/W;->a:Lz9/a;

    invoke-virtual {v1, v5}, Lz9/a;->l(B)B

    move-result v1

    iget-object v4, v0, Lz9/W;->a:Lz9/a;

    invoke-virtual {v4}, Lz9/a;->D()B

    move-result v4

    if-eq v4, v7, :cond_b

    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    move-object v10, v0

    move-object v9, v4

    move-object v4, v2

    move v2, v1

    move-object/from16 v1, p1

    :goto_1
    iget-object v11, v10, Lz9/W;->a:Lz9/a;

    invoke-virtual {v11}, Lz9/a;->f()Z

    move-result v11

    if-eqz v11, :cond_7

    iget-boolean v2, v10, Lz9/W;->b:Z

    if-eqz v2, :cond_3

    iget-object v2, v10, Lz9/W;->a:Lz9/a;

    invoke-virtual {v2}, Lz9/a;->s()Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :cond_3
    iget-object v2, v10, Lz9/W;->a:Lz9/a;

    invoke-virtual {v2}, Lz9/a;->q()Ljava/lang/String;

    move-result-object v2

    :goto_2
    iget-object v11, v10, Lz9/W;->a:Lz9/a;

    const/4 v12, 0x5

    invoke-virtual {v11, v12}, Lz9/a;->l(B)B

    sget-object v11, Li7/M;->a:Li7/M;

    iput-object v1, v4, Lz9/W$b;->F:Ljava/lang/Object;

    iput-object v10, v4, Lz9/W$b;->G:Ljava/lang/Object;

    iput-object v9, v4, Lz9/W$b;->H:Ljava/lang/Object;

    iput-object v2, v4, Lz9/W$b;->I:Ljava/lang/Object;

    iput v8, v4, Lz9/W$b;->L:I

    invoke-virtual {v1, v11, v4}, Li7/c;->a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v3, :cond_4

    return-object v3

    :cond_4
    move-object/from16 v18, v11

    move-object v11, v1

    move-object/from16 v1, v18

    move-object/from16 v19, v4

    move-object v4, v2

    move-object/from16 v2, v19

    :goto_3
    check-cast v1, Ly9/i;

    invoke-interface {v9, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, v10, Lz9/W;->a:Lz9/a;

    invoke-virtual {v1}, Lz9/a;->k()B

    move-result v1

    if-eq v1, v7, :cond_6

    if-ne v1, v6, :cond_5

    move v2, v1

    goto :goto_4

    :cond_5
    iget-object v12, v10, Lz9/W;->a:Lz9/a;

    const/16 v16, 0x6

    const/16 v17, 0x0

    const-string v13, "Expected end of the object or comma"

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v12 .. v17}, Lz9/a;->y(Lz9/a;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    new-instance v1, Li7/k;

    invoke-direct {v1}, Li7/k;-><init>()V

    throw v1

    :cond_6
    move-object v4, v2

    move v2, v1

    move-object v1, v11

    goto :goto_1

    :cond_7
    :goto_4
    if-ne v2, v5, :cond_8

    :goto_5
    iget-object v1, v10, Lz9/W;->a:Lz9/a;

    invoke-virtual {v1, v6}, Lz9/a;->l(B)B

    goto :goto_6

    :cond_8
    if-ne v2, v7, :cond_a

    iget-boolean v1, v10, Lz9/W;->c:Z

    if-eqz v1, :cond_9

    goto :goto_5

    :cond_9
    iget-object v1, v10, Lz9/W;->a:Lz9/a;

    const/4 v2, 0x0

    invoke-static {v1, v2, v8, v2}, Lz9/G;->h(Lz9/a;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    new-instance v1, Li7/k;

    invoke-direct {v1}, Li7/k;-><init>()V

    throw v1

    :cond_a
    :goto_6
    new-instance v1, Ly9/D;

    invoke-direct {v1, v9}, Ly9/D;-><init>(Ljava/util/Map;)V

    return-object v1

    :cond_b
    iget-object v2, v0, Lz9/W;->a:Lz9/a;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const-string v3, "Unexpected leading comma"

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lz9/a;->y(Lz9/a;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    new-instance v1, Li7/k;

    invoke-direct {v1}, Li7/k;-><init>()V

    throw v1
.end method

.method private final i()Ly9/i;
    .locals 12

    .prologue
    iget-object v0, p0, Lz9/W;->a:Lz9/a;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lz9/a;->l(B)B

    move-result v0

    iget-object v2, p0, Lz9/W;->a:Lz9/a;

    invoke-virtual {v2}, Lz9/a;->D()B

    move-result v2

    const/4 v3, 0x4

    if-eq v2, v3, :cond_7

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    :cond_0
    iget-object v4, p0, Lz9/W;->a:Lz9/a;

    invoke-virtual {v4}, Lz9/a;->f()Z

    move-result v4

    const/4 v5, 0x7

    if-eqz v4, :cond_3

    iget-boolean v0, p0, Lz9/W;->b:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lz9/W;->a:Lz9/a;

    invoke-virtual {v0}, Lz9/a;->s()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lz9/W;->a:Lz9/a;

    invoke-virtual {v0}, Lz9/a;->q()Ljava/lang/String;

    move-result-object v0

    :goto_0
    iget-object v4, p0, Lz9/W;->a:Lz9/a;

    const/4 v6, 0x5

    invoke-virtual {v4, v6}, Lz9/a;->l(B)B

    invoke-virtual {p0}, Lz9/W;->e()Ly9/i;

    move-result-object v4

    invoke-interface {v2, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lz9/W;->a:Lz9/a;

    invoke-virtual {v0}, Lz9/a;->k()B

    move-result v0

    if-eq v0, v3, :cond_0

    if-ne v0, v5, :cond_2

    goto :goto_1

    :cond_2
    iget-object v6, p0, Lz9/W;->a:Lz9/a;

    const/4 v10, 0x6

    const/4 v11, 0x0

    const-string v7, "Expected end of the object or comma"

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lz9/a;->y(Lz9/a;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    new-instance v0, Li7/k;

    invoke-direct {v0}, Li7/k;-><init>()V

    throw v0

    :cond_3
    :goto_1
    if-ne v0, v1, :cond_4

    :goto_2
    iget-object v0, p0, Lz9/W;->a:Lz9/a;

    invoke-virtual {v0, v5}, Lz9/a;->l(B)B

    goto :goto_3

    :cond_4
    if-ne v0, v3, :cond_6

    iget-boolean v0, p0, Lz9/W;->c:Z

    if-eqz v0, :cond_5

    goto :goto_2

    :cond_5
    iget-object v0, p0, Lz9/W;->a:Lz9/a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, Lz9/G;->h(Lz9/a;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    new-instance v0, Li7/k;

    invoke-direct {v0}, Li7/k;-><init>()V

    throw v0

    :cond_6
    :goto_3
    new-instance v0, Ly9/D;

    invoke-direct {v0, v2}, Ly9/D;-><init>(Ljava/util/Map;)V

    return-object v0

    :cond_7
    iget-object v3, p0, Lz9/W;->a:Lz9/a;

    const/4 v7, 0x6

    const/4 v8, 0x0

    const-string v4, "Unexpected leading comma"

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lz9/a;->y(Lz9/a;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    new-instance v0, Li7/k;

    invoke-direct {v0}, Li7/k;-><init>()V

    throw v0
.end method

.method private final j(Z)Ly9/F;
    .locals 7

    .prologue
    iget-boolean v0, p0, Lz9/W;->b:Z

    if-nez v0, :cond_1

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lz9/W;->a:Lz9/a;

    invoke-virtual {v0}, Lz9/a;->q()Ljava/lang/String;

    move-result-object v0

    :goto_0
    move-object v2, v0

    goto :goto_2

    :cond_1
    :goto_1
    iget-object v0, p0, Lz9/W;->a:Lz9/a;

    invoke-virtual {v0}, Lz9/a;->s()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :goto_2
    if-nez p1, :cond_2

    const-string v0, "null"

    invoke-static {v2, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p1, Ly9/A;->INSTANCE:Ly9/A;

    return-object p1

    :cond_2
    new-instance v0, Ly9/w;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, v0

    move v3, p1

    invoke-direct/range {v1 .. v6}, Ly9/w;-><init>(Ljava/lang/Object;ZLv9/f;ILy7/k;)V

    return-object v0
.end method


# virtual methods
.method public final e()Ly9/i;
    .locals 7

    .prologue
    iget-object v0, p0, Lz9/W;->a:Lz9/a;

    invoke-virtual {v0}, Lz9/a;->D()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-direct {p0, v1}, Lz9/W;->j(Z)Ly9/F;

    move-result-object v0

    goto :goto_1

    :cond_0
    if-nez v0, :cond_1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lz9/W;->j(Z)Ly9/F;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v2, 0x6

    if-ne v0, v2, :cond_3

    iget v0, p0, Lz9/W;->d:I

    add-int/2addr v0, v1

    iput v0, p0, Lz9/W;->d:I

    const/16 v1, 0xc8

    if-ne v0, v1, :cond_2

    invoke-direct {p0}, Lz9/W;->g()Ly9/i;

    move-result-object v0

    goto :goto_0

    :cond_2
    invoke-direct {p0}, Lz9/W;->i()Ly9/i;

    move-result-object v0

    :goto_0
    iget v1, p0, Lz9/W;->d:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lz9/W;->d:I

    goto :goto_1

    :cond_3
    const/16 v1, 0x8

    if-ne v0, v1, :cond_4

    invoke-direct {p0}, Lz9/W;->f()Ly9/i;

    move-result-object v0

    :goto_1
    return-object v0

    :cond_4
    iget-object v1, p0, Lz9/W;->a:Lz9/a;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Cannot read Json element because of unexpected "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Lz9/b;->c(B)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lz9/a;->y(Lz9/a;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    new-instance v0, Li7/k;

    invoke-direct {v0}, Li7/k;-><init>()V

    throw v0
.end method
