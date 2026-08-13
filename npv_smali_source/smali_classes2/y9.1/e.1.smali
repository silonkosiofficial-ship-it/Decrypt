.class public final Ly9/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Z

.field private b:Z

.field private c:Z

.field private d:Z

.field private e:Z

.field private f:Ljava/lang/String;

.field private g:Z

.field private h:Ljava/lang/String;

.field private i:Ly9/a;

.field private j:Z

.field private k:Z

.field private l:Z

.field private m:Z

.field private n:Z

.field private o:Z

.field private p:Z

.field private q:LA9/b;


# direct methods
.method public constructor <init>(Ly9/b;)V
    .locals 1

    const-string v0, "json"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Ly9/b;->e()Ly9/g;

    move-result-object v0

    invoke-virtual {v0}, Ly9/g;->i()Z

    move-result v0

    iput-boolean v0, p0, Ly9/e;->a:Z

    invoke-virtual {p1}, Ly9/b;->e()Ly9/g;

    move-result-object v0

    invoke-virtual {v0}, Ly9/g;->j()Z

    move-result v0

    iput-boolean v0, p0, Ly9/e;->b:Z

    invoke-virtual {p1}, Ly9/b;->e()Ly9/g;

    move-result-object v0

    invoke-virtual {v0}, Ly9/g;->k()Z

    move-result v0

    iput-boolean v0, p0, Ly9/e;->c:Z

    invoke-virtual {p1}, Ly9/b;->e()Ly9/g;

    move-result-object v0

    invoke-virtual {v0}, Ly9/g;->q()Z

    move-result v0

    iput-boolean v0, p0, Ly9/e;->d:Z

    invoke-virtual {p1}, Ly9/b;->e()Ly9/g;

    move-result-object v0

    invoke-virtual {v0}, Ly9/g;->m()Z

    move-result v0

    iput-boolean v0, p0, Ly9/e;->e:Z

    invoke-virtual {p1}, Ly9/b;->e()Ly9/g;

    move-result-object v0

    invoke-virtual {v0}, Ly9/g;->n()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ly9/e;->f:Ljava/lang/String;

    invoke-virtual {p1}, Ly9/b;->e()Ly9/g;

    move-result-object v0

    invoke-virtual {v0}, Ly9/g;->g()Z

    move-result v0

    iput-boolean v0, p0, Ly9/e;->g:Z

    invoke-virtual {p1}, Ly9/b;->e()Ly9/g;

    move-result-object v0

    invoke-virtual {v0}, Ly9/g;->e()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ly9/e;->h:Ljava/lang/String;

    invoke-virtual {p1}, Ly9/b;->e()Ly9/g;

    move-result-object v0

    invoke-virtual {v0}, Ly9/g;->f()Ly9/a;

    move-result-object v0

    iput-object v0, p0, Ly9/e;->i:Ly9/a;

    invoke-virtual {p1}, Ly9/b;->e()Ly9/g;

    move-result-object v0

    invoke-virtual {v0}, Ly9/g;->o()Z

    move-result v0

    iput-boolean v0, p0, Ly9/e;->j:Z

    invoke-virtual {p1}, Ly9/b;->e()Ly9/g;

    move-result-object v0

    invoke-virtual {v0}, Ly9/g;->l()Ly9/z;

    invoke-virtual {p1}, Ly9/b;->e()Ly9/g;

    move-result-object v0

    invoke-virtual {v0}, Ly9/g;->h()Z

    move-result v0

    iput-boolean v0, p0, Ly9/e;->k:Z

    invoke-virtual {p1}, Ly9/b;->e()Ly9/g;

    move-result-object v0

    invoke-virtual {v0}, Ly9/g;->d()Z

    move-result v0

    iput-boolean v0, p0, Ly9/e;->l:Z

    invoke-virtual {p1}, Ly9/b;->e()Ly9/g;

    move-result-object v0

    invoke-virtual {v0}, Ly9/g;->a()Z

    move-result v0

    iput-boolean v0, p0, Ly9/e;->m:Z

    invoke-virtual {p1}, Ly9/b;->e()Ly9/g;

    move-result-object v0

    invoke-virtual {v0}, Ly9/g;->b()Z

    move-result v0

    iput-boolean v0, p0, Ly9/e;->n:Z

    invoke-virtual {p1}, Ly9/b;->e()Ly9/g;

    move-result-object v0

    invoke-virtual {v0}, Ly9/g;->c()Z

    move-result v0

    iput-boolean v0, p0, Ly9/e;->o:Z

    invoke-virtual {p1}, Ly9/b;->e()Ly9/g;

    move-result-object v0

    invoke-virtual {v0}, Ly9/g;->p()Z

    move-result v0

    iput-boolean v0, p0, Ly9/e;->p:Z

    invoke-virtual {p1}, Ly9/b;->f()LA9/b;

    move-result-object p1

    iput-object p1, p0, Ly9/e;->q:LA9/b;

    return-void
.end method


# virtual methods
.method public final a()Ly9/g;
    .locals 21

    .prologue
    move-object/from16 v0, p0

    iget-boolean v1, v0, Ly9/e;->p:Z

    if-eqz v1, :cond_2

    iget-object v1, v0, Ly9/e;->h:Ljava/lang/String;

    const-string v2, "type"

    invoke-static {v1, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, v0, Ly9/e;->i:Ly9/a;

    sget-object v2, Ly9/a;->E:Ly9/a;

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "useArrayPolymorphism option can only be used if classDiscriminatorMode in a default POLYMORPHIC state."

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Class discriminator should not be specified when array polymorphism is specified"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    :goto_0
    iget-boolean v1, v0, Ly9/e;->e:Z

    const-string v2, "    "

    if-nez v1, :cond_4

    iget-object v1, v0, Ly9/e;->f:Ljava/lang/String;

    invoke-static {v1, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_3

    :cond_3
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Indent should not be specified when default printing mode is used"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    iget-object v1, v0, Ly9/e;->f:Ljava/lang/String;

    invoke-static {v1, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    iget-object v1, v0, Ly9/e;->f:Ljava/lang/String;

    const/4 v2, 0x0

    :goto_1
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-ge v2, v3, :cond_7

    invoke-interface {v1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    const/16 v4, 0x20

    if-eq v3, v4, :cond_6

    const/16 v4, 0x9

    if-eq v3, v4, :cond_6

    const/16 v4, 0xd

    if-eq v3, v4, :cond_6

    const/16 v4, 0xa

    if-ne v3, v4, :cond_5

    goto :goto_2

    :cond_5
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v0, Ly9/e;->f:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_6
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_7
    :goto_3
    new-instance v1, Ly9/g;

    move-object v3, v1

    iget-boolean v4, v0, Ly9/e;->a:Z

    iget-boolean v5, v0, Ly9/e;->c:Z

    iget-boolean v6, v0, Ly9/e;->d:Z

    iget-boolean v7, v0, Ly9/e;->o:Z

    iget-boolean v8, v0, Ly9/e;->e:Z

    iget-boolean v9, v0, Ly9/e;->b:Z

    iget-object v10, v0, Ly9/e;->f:Ljava/lang/String;

    iget-boolean v11, v0, Ly9/e;->g:Z

    iget-boolean v12, v0, Ly9/e;->p:Z

    iget-object v13, v0, Ly9/e;->h:Ljava/lang/String;

    iget-boolean v14, v0, Ly9/e;->n:Z

    iget-boolean v15, v0, Ly9/e;->j:Z

    iget-boolean v2, v0, Ly9/e;->k:Z

    move/from16 v17, v2

    iget-boolean v2, v0, Ly9/e;->l:Z

    move/from16 v18, v2

    iget-boolean v2, v0, Ly9/e;->m:Z

    move/from16 v19, v2

    iget-object v2, v0, Ly9/e;->i:Ly9/a;

    move-object/from16 v20, v2

    const/16 v16, 0x0

    invoke-direct/range {v3 .. v20}, Ly9/g;-><init>(ZZZZZZLjava/lang/String;ZZLjava/lang/String;ZZLy9/z;ZZZLy9/a;)V

    return-object v1
.end method

.method public final b()LA9/b;
    .locals 1

    iget-object v0, p0, Ly9/e;->q:LA9/b;

    return-object v0
.end method

.method public final c(Z)V
    .locals 0

    iput-boolean p1, p0, Ly9/e;->g:Z

    return-void
.end method

.method public final d(Z)V
    .locals 0

    iput-boolean p1, p0, Ly9/e;->a:Z

    return-void
.end method

.method public final e(Z)V
    .locals 0

    iput-boolean p1, p0, Ly9/e;->b:Z

    return-void
.end method

.method public final f(Z)V
    .locals 0

    iput-boolean p1, p0, Ly9/e;->c:Z

    return-void
.end method

.method public final g(Z)V
    .locals 0

    iput-boolean p1, p0, Ly9/e;->d:Z

    return-void
.end method

.method public final h(Z)V
    .locals 0

    iput-boolean p1, p0, Ly9/e;->e:Z

    return-void
.end method
