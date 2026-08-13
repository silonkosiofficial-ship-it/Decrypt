.class final Lb8/i$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb8/i;-><init>(La8/g;Le8/u;Lb8/h;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lb8/i;

.field final synthetic E:La8/g;


# direct methods
.method constructor <init>(Lb8/i;La8/g;)V
    .locals 0

    iput-object p1, p0, Lb8/i$c;->D:Lb8/i;

    iput-object p2, p0, Lb8/i$c;->E:La8/g;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lb8/i$a;)LO7/e;
    .locals 16

    .prologue
    move-object/from16 v0, p0

    const-string v1, "request"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ln8/b;

    iget-object v3, v0, Lb8/i$c;->D:Lb8/i;

    invoke-virtual {v3}, Lb8/i;->S()Lb8/h;

    move-result-object v3

    invoke-virtual {v3}, LR7/z;->e()Ln8/c;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lb8/i$a;->b()Ln8/f;

    move-result-object v4

    invoke-direct {v1, v3, v4}, Ln8/b;-><init>(Ln8/c;Ln8/f;)V

    invoke-virtual/range {p1 .. p1}, Lb8/i$a;->a()Le8/g;

    move-result-object v3

    if-eqz v3, :cond_0

    iget-object v3, v0, Lb8/i$c;->E:La8/g;

    invoke-virtual {v3}, La8/g;->a()La8/b;

    move-result-object v3

    invoke-virtual {v3}, La8/b;->j()Lg8/r;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lb8/i$a;->a()Le8/g;

    move-result-object v4

    iget-object v5, v0, Lb8/i$c;->D:Lb8/i;

    invoke-static {v5}, Lb8/i;->M(Lb8/i;)Lm8/e;

    move-result-object v5

    invoke-interface {v3, v4, v5}, Lg8/r;->b(Le8/g;Lm8/e;)Lg8/r$a;

    move-result-object v3

    goto :goto_0

    :cond_0
    iget-object v3, v0, Lb8/i$c;->E:La8/g;

    invoke-virtual {v3}, La8/g;->a()La8/b;

    move-result-object v3

    invoke-virtual {v3}, La8/b;->j()Lg8/r;

    move-result-object v3

    iget-object v4, v0, Lb8/i$c;->D:Lb8/i;

    invoke-static {v4}, Lb8/i;->M(Lb8/i;)Lm8/e;

    move-result-object v4

    invoke-interface {v3, v1, v4}, Lg8/r;->a(Ln8/b;Lm8/e;)Lg8/r$a;

    move-result-object v3

    :goto_0
    const/4 v8, 0x0

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lg8/r$a;->a()Lg8/t;

    move-result-object v3

    goto :goto_1

    :cond_1
    move-object v3, v8

    :goto_1
    if-eqz v3, :cond_2

    invoke-interface {v3}, Lg8/t;->c()Ln8/b;

    move-result-object v4

    goto :goto_2

    :cond_2
    move-object v4, v8

    :goto_2
    if-eqz v4, :cond_4

    invoke-virtual {v4}, Ln8/b;->l()Z

    move-result v5

    if-nez v5, :cond_3

    invoke-virtual {v4}, Ln8/b;->k()Z

    move-result v4

    if-eqz v4, :cond_4

    :cond_3
    return-object v8

    :cond_4
    iget-object v4, v0, Lb8/i$c;->D:Lb8/i;

    invoke-static {v4, v3}, Lb8/i;->N(Lb8/i;Lg8/t;)Lb8/i$b;

    move-result-object v3

    instance-of v4, v3, Lb8/i$b$a;

    if-eqz v4, :cond_5

    check-cast v3, Lb8/i$b$a;

    invoke-virtual {v3}, Lb8/i$b$a;->a()LO7/e;

    move-result-object v8

    goto/16 :goto_5

    :cond_5
    instance-of v4, v3, Lb8/i$b$c;

    if-eqz v4, :cond_6

    goto/16 :goto_5

    :cond_6
    instance-of v3, v3, Lb8/i$b$b;

    if-eqz v3, :cond_d

    invoke-virtual/range {p1 .. p1}, Lb8/i$a;->a()Le8/g;

    move-result-object v2

    if-nez v2, :cond_7

    iget-object v2, v0, Lb8/i$c;->E:La8/g;

    invoke-virtual {v2}, La8/g;->a()La8/b;

    move-result-object v2

    invoke-virtual {v2}, La8/b;->d()LX7/p;

    move-result-object v9

    new-instance v10, LX7/p$a;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, v10

    move-object v3, v1

    invoke-direct/range {v2 .. v7}, LX7/p$a;-><init>(Ln8/b;[BLe8/g;ILy7/k;)V

    invoke-interface {v9, v10}, LX7/p;->b(LX7/p$a;)Le8/g;

    move-result-object v2

    :cond_7
    move-object v12, v2

    if-eqz v12, :cond_8

    invoke-interface {v12}, Le8/g;->O()Le8/D;

    move-result-object v2

    goto :goto_3

    :cond_8
    move-object v2, v8

    :goto_3
    sget-object v3, Le8/D;->D:Le8/D;

    if-eq v2, v3, :cond_c

    if-eqz v12, :cond_9

    invoke-interface {v12}, Le8/g;->e()Ln8/c;

    move-result-object v1

    goto :goto_4

    :cond_9
    move-object v1, v8

    :goto_4
    if-eqz v1, :cond_b

    invoke-virtual {v1}, Ln8/c;->d()Z

    move-result v2

    if-nez v2, :cond_b

    invoke-virtual {v1}, Ln8/c;->e()Ln8/c;

    move-result-object v1

    iget-object v2, v0, Lb8/i$c;->D:Lb8/i;

    invoke-virtual {v2}, Lb8/i;->S()Lb8/h;

    move-result-object v2

    invoke-virtual {v2}, LR7/z;->e()Ln8/c;

    move-result-object v2

    invoke-static {v1, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    goto :goto_5

    :cond_a
    new-instance v8, Lb8/f;

    iget-object v10, v0, Lb8/i$c;->E:La8/g;

    iget-object v1, v0, Lb8/i$c;->D:Lb8/i;

    invoke-virtual {v1}, Lb8/i;->S()Lb8/h;

    move-result-object v11

    const/16 v14, 0x8

    const/4 v15, 0x0

    const/4 v13, 0x0

    move-object v9, v8

    invoke-direct/range {v9 .. v15}, Lb8/f;-><init>(La8/g;LO7/m;Le8/g;LO7/e;ILy7/k;)V

    iget-object v1, v0, Lb8/i$c;->E:La8/g;

    invoke-virtual {v1}, La8/g;->a()La8/b;

    move-result-object v1

    invoke-virtual {v1}, La8/b;->e()LX7/q;

    move-result-object v1

    invoke-interface {v1, v8}, LX7/q;->a(LZ7/c;)V

    :cond_b
    :goto_5
    return-object v8

    :cond_c
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Couldn\'t find kotlin binary class for light class created by kotlin binary file\nJavaClass: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, "\nClassId: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, "\nfindKotlinClass(JavaClass) = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lb8/i$c;->E:La8/g;

    invoke-virtual {v4}, La8/g;->a()La8/b;

    move-result-object v4

    invoke-virtual {v4}, La8/b;->j()Lg8/r;

    move-result-object v4

    iget-object v5, v0, Lb8/i$c;->D:Lb8/i;

    invoke-static {v5}, Lb8/i;->M(Lb8/i;)Lm8/e;

    move-result-object v5

    invoke-static {v4, v12, v5}, Lg8/s;->a(Lg8/r;Le8/g;Lm8/e;)Lg8/t;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, "\nfindKotlinClass(ClassId) = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lb8/i$c;->E:La8/g;

    invoke-virtual {v4}, La8/g;->a()La8/b;

    move-result-object v4

    invoke-virtual {v4}, La8/b;->j()Lg8/r;

    move-result-object v4

    iget-object v5, v0, Lb8/i$c;->D:Lb8/i;

    invoke-static {v5}, Lb8/i;->M(Lb8/i;)Lm8/e;

    move-result-object v5

    invoke-static {v4, v1, v5}, Lg8/s;->b(Lg8/r;Ln8/b;Lm8/e;)Lg8/t;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0xa

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_d
    new-instance v1, Li7/s;

    invoke-direct {v1}, Li7/s;-><init>()V

    throw v1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lb8/i$a;

    invoke-virtual {p0, p1}, Lb8/i$c;->a(Lb8/i$a;)LO7/e;

    move-result-object p1

    return-object p1
.end method
