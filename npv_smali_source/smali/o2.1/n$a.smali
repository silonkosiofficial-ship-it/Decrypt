.class public Lo2/n$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo2/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private A:Z

.field private final a:LF7/c;

.field private final b:Landroid/content/Context;

.field private final c:Ljava/lang/String;

.field private final d:Lx7/a;

.field private final e:Ljava/util/List;

.field private final f:Ljava/util/List;

.field private g:Ljava/util/concurrent/Executor;

.field private h:Ljava/util/concurrent/Executor;

.field private i:Lz2/e$c;

.field private j:Z

.field private k:Lo2/n$d;

.field private l:Landroid/content/Intent;

.field private m:J

.field private n:Ljava/util/concurrent/TimeUnit;

.field private final o:Lo2/n$e;

.field private p:Ljava/util/Set;

.field private final q:Ljava/util/Set;

.field private final r:Ljava/util/List;

.field private s:Z

.field private t:Z

.field private u:Z

.field private v:Ljava/lang/String;

.field private w:Ljava/io/File;

.field private x:Ljava/util/concurrent/Callable;

.field private y:Ly2/c;

.field private z:Lm7/i;


# direct methods
.method public constructor <init>(LF7/c;Ljava/lang/String;Lx7/a;Landroid/content/Context;)V
    .locals 2

    const-string v0, "klass"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo2/n$a;->e:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo2/n$a;->f:Ljava/util/List;

    sget-object v0, Lo2/n$d;->C:Lo2/n$d;

    iput-object v0, p0, Lo2/n$a;->k:Lo2/n$d;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lo2/n$a;->m:J

    new-instance v0, Lo2/n$e;

    invoke-direct {v0}, Lo2/n$e;-><init>()V

    iput-object v0, p0, Lo2/n$a;->o:Lo2/n$e;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lo2/n$a;->p:Ljava/util/Set;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lo2/n$a;->q:Ljava/util/Set;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo2/n$a;->r:Ljava/util/List;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lo2/n$a;->s:Z

    iput-boolean v0, p0, Lo2/n$a;->A:Z

    iput-object p1, p0, Lo2/n$a;->a:LF7/c;

    iput-object p4, p0, Lo2/n$a;->b:Landroid/content/Context;

    iput-object p2, p0, Lo2/n$a;->c:Ljava/lang/String;

    iput-object p3, p0, Lo2/n$a;->d:Lx7/a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "klass"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo2/n$a;->e:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo2/n$a;->f:Ljava/util/List;

    sget-object v0, Lo2/n$d;->C:Lo2/n$d;

    iput-object v0, p0, Lo2/n$a;->k:Lo2/n$d;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lo2/n$a;->m:J

    new-instance v0, Lo2/n$e;

    invoke-direct {v0}, Lo2/n$e;-><init>()V

    iput-object v0, p0, Lo2/n$a;->o:Lo2/n$e;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lo2/n$a;->p:Ljava/util/Set;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lo2/n$a;->q:Ljava/util/Set;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo2/n$a;->r:Ljava/util/List;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lo2/n$a;->s:Z

    iput-boolean v0, p0, Lo2/n$a;->A:Z

    invoke-static {p2}, Lw7/a;->e(Ljava/lang/Class;)LF7/c;

    move-result-object p2

    iput-object p2, p0, Lo2/n$a;->a:LF7/c;

    iput-object p1, p0, Lo2/n$a;->b:Landroid/content/Context;

    iput-object p3, p0, Lo2/n$a;->c:Ljava/lang/String;

    const/4 p1, 0x0

    iput-object p1, p0, Lo2/n$a;->d:Lx7/a;

    return-void
.end method


# virtual methods
.method public a(Lo2/n$b;)Lo2/n$a;
    .locals 1

    const-string v0, "callback"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lo2/n$a;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public varargs b([Ls2/a;)Lo2/n$a;
    .locals 5

    .prologue
    const-string v0, "migrations"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    iget-object v3, p0, Lo2/n$a;->q:Ljava/util/Set;

    iget v4, v2, Ls2/a;->a:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v3, p0, Lo2/n$a;->q:Ljava/util/Set;

    iget v2, v2, Ls2/a;->b:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo2/n$a;->o:Lo2/n$e;

    array-length v1, p1

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ls2/a;

    invoke-virtual {v0, p1}, Lo2/n$e;->b([Ls2/a;)V

    return-object p0
.end method

.method public c(Ljava/lang/Object;)Lo2/n$a;
    .locals 1

    const-string v0, "typeConverter"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lo2/n$a;->f:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public d()Lo2/n$a;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lo2/n$a;->j:Z

    return-object p0
.end method

.method public e()Lo2/n;
    .locals 26

    .prologue
    move-object/from16 v0, p0

    iget-object v1, v0, Lo2/n$a;->g:Ljava/util/concurrent/Executor;

    if-nez v1, :cond_0

    iget-object v2, v0, Lo2/n$a;->h:Ljava/util/concurrent/Executor;

    if-nez v2, :cond_0

    invoke-static {}, Ln/c;->f()Ljava/util/concurrent/Executor;

    move-result-object v1

    iput-object v1, v0, Lo2/n$a;->h:Ljava/util/concurrent/Executor;

    :goto_0
    iput-object v1, v0, Lo2/n$a;->g:Ljava/util/concurrent/Executor;

    goto :goto_1

    :cond_0
    if-eqz v1, :cond_1

    iget-object v2, v0, Lo2/n$a;->h:Ljava/util/concurrent/Executor;

    if-nez v2, :cond_1

    iput-object v1, v0, Lo2/n$a;->h:Ljava/util/concurrent/Executor;

    goto :goto_1

    :cond_1
    if-nez v1, :cond_2

    iget-object v1, v0, Lo2/n$a;->h:Ljava/util/concurrent/Executor;

    goto :goto_0

    :cond_2
    :goto_1
    iget-object v1, v0, Lo2/n$a;->q:Ljava/util/Set;

    iget-object v2, v0, Lo2/n$a;->p:Ljava/util/Set;

    invoke-static {v1, v2}, Lo2/o;->c(Ljava/util/Set;Ljava/util/Set;)V

    iget-object v1, v0, Lo2/n$a;->y:Ly2/c;

    const/4 v2, 0x0

    if-nez v1, :cond_3

    iget-object v3, v0, Lo2/n$a;->i:Lz2/e$c;

    if-nez v3, :cond_3

    new-instance v1, LA2/f;

    invoke-direct {v1}, LA2/f;-><init>()V

    goto :goto_2

    :cond_3
    if-nez v1, :cond_4

    iget-object v1, v0, Lo2/n$a;->i:Lz2/e$c;

    goto :goto_2

    :cond_4
    iget-object v1, v0, Lo2/n$a;->i:Lz2/e$c;

    if-nez v1, :cond_14

    move-object v1, v2

    :goto_2
    const-string v3, "Required value was null."

    if-eqz v1, :cond_f

    iget-wide v4, v0, Lo2/n$a;->m:J

    const-wide/16 v6, 0x0

    cmp-long v4, v4, v6

    if-lez v4, :cond_7

    iget-object v4, v0, Lo2/n$a;->c:Ljava/lang/String;

    if-eqz v4, :cond_6

    new-instance v4, Lv2/b;

    iget-wide v6, v0, Lo2/n$a;->m:J

    iget-object v8, v0, Lo2/n$a;->n:Ljava/util/concurrent/TimeUnit;

    if-eqz v8, :cond_5

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v9, 0x0

    move-object v5, v4

    invoke-direct/range {v5 .. v11}, Lv2/b;-><init>(JLjava/util/concurrent/TimeUnit;Lv2/b$b;ILy7/k;)V

    new-instance v5, Lv2/d;

    invoke-direct {v5, v1, v4}, Lv2/d;-><init>(Lz2/e$c;Lv2/b;)V

    move-object v1, v5

    goto :goto_3

    :cond_5
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_6
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Cannot create auto-closing database for an in-memory database."

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_7
    :goto_3
    iget-object v4, v0, Lo2/n$a;->v:Ljava/lang/String;

    if-nez v4, :cond_8

    iget-object v5, v0, Lo2/n$a;->w:Ljava/io/File;

    if-nez v5, :cond_8

    iget-object v5, v0, Lo2/n$a;->x:Ljava/util/concurrent/Callable;

    if-eqz v5, :cond_c

    :cond_8
    iget-object v5, v0, Lo2/n$a;->c:Ljava/lang/String;

    if-eqz v5, :cond_e

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-nez v4, :cond_9

    move v7, v5

    goto :goto_4

    :cond_9
    move v7, v6

    :goto_4
    iget-object v8, v0, Lo2/n$a;->w:Ljava/io/File;

    if-nez v8, :cond_a

    move v9, v5

    goto :goto_5

    :cond_a
    move v9, v6

    :goto_5
    iget-object v10, v0, Lo2/n$a;->x:Ljava/util/concurrent/Callable;

    if-nez v10, :cond_b

    goto :goto_6

    :cond_b
    move v5, v6

    :goto_6
    add-int/2addr v7, v9

    add-int/2addr v7, v5

    if-ne v7, v6, :cond_d

    new-instance v5, Lv2/f;

    invoke-direct {v5, v4, v8, v10, v1}, Lv2/f;-><init>(Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Lz2/e$c;)V

    move-object v1, v5

    :cond_c
    move-object v6, v1

    goto :goto_7

    :cond_d
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations."

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_e
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Cannot create from asset or file for an in-memory database."

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_f
    move-object v6, v2

    :goto_7
    new-instance v1, Lo2/c;

    iget-object v4, v0, Lo2/n$a;->b:Landroid/content/Context;

    iget-object v5, v0, Lo2/n$a;->c:Ljava/lang/String;

    iget-object v7, v0, Lo2/n$a;->o:Lo2/n$e;

    iget-object v8, v0, Lo2/n$a;->e:Ljava/util/List;

    iget-boolean v9, v0, Lo2/n$a;->j:Z

    iget-object v10, v0, Lo2/n$a;->k:Lo2/n$d;

    invoke-virtual {v10, v4}, Lo2/n$d;->g(Landroid/content/Context;)Lo2/n$d;

    move-result-object v10

    iget-object v11, v0, Lo2/n$a;->g:Ljava/util/concurrent/Executor;

    if-eqz v11, :cond_13

    iget-object v12, v0, Lo2/n$a;->h:Ljava/util/concurrent/Executor;

    if-eqz v12, :cond_12

    iget-object v13, v0, Lo2/n$a;->l:Landroid/content/Intent;

    iget-boolean v14, v0, Lo2/n$a;->s:Z

    iget-boolean v15, v0, Lo2/n$a;->t:Z

    iget-object v3, v0, Lo2/n$a;->p:Ljava/util/Set;

    move-object/from16 v16, v3

    iget-object v3, v0, Lo2/n$a;->v:Ljava/lang/String;

    move-object/from16 v17, v3

    iget-object v3, v0, Lo2/n$a;->w:Ljava/io/File;

    move-object/from16 v18, v3

    iget-object v3, v0, Lo2/n$a;->x:Ljava/util/concurrent/Callable;

    move-object/from16 v19, v3

    iget-object v3, v0, Lo2/n$a;->f:Ljava/util/List;

    move-object/from16 v21, v3

    iget-object v3, v0, Lo2/n$a;->r:Ljava/util/List;

    move-object/from16 v22, v3

    iget-boolean v3, v0, Lo2/n$a;->u:Z

    move/from16 v23, v3

    iget-object v3, v0, Lo2/n$a;->y:Ly2/c;

    move-object/from16 v24, v3

    iget-object v3, v0, Lo2/n$a;->z:Lm7/i;

    move-object/from16 v25, v3

    const/16 v20, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v25}, Lo2/c;-><init>(Landroid/content/Context;Ljava/lang/String;Lz2/e$c;Lo2/n$e;Ljava/util/List;ZLo2/n$d;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroid/content/Intent;ZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Lo2/n$f;Ljava/util/List;Ljava/util/List;ZLy2/c;Lm7/i;)V

    iget-boolean v3, v0, Lo2/n$a;->A:Z

    invoke-virtual {v1, v3}, Lo2/c;->f(Z)V

    iget-object v3, v0, Lo2/n$a;->d:Lx7/a;

    if-eqz v3, :cond_10

    invoke-interface {v3}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo2/n;

    if-nez v3, :cond_11

    :cond_10
    iget-object v3, v0, Lo2/n$a;->a:LF7/c;

    invoke-static {v3}, Lw7/a;->b(LF7/c;)Ljava/lang/Class;

    move-result-object v3

    const/4 v4, 0x2

    invoke-static {v3, v2, v4, v2}, Lw2/g;->b(Ljava/lang/Class;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lo2/n;

    :cond_11
    invoke-virtual {v3, v1}, Lo2/n;->E(Lo2/c;)V

    return-object v3

    :cond_12
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_13
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_14
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "A RoomDatabase cannot be configured with both a SQLiteDriver and a SupportOpenHelper.Factory."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public f()Lo2/n$a;
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lo2/n$a;->s:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lo2/n$a;->t:Z

    return-object p0
.end method

.method public final g(Z)Lo2/n$a;
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lo2/n$a;->s:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lo2/n$a;->t:Z

    iput-boolean p1, p0, Lo2/n$a;->u:Z

    return-object p0
.end method

.method public h(Lz2/e$c;)Lo2/n$a;
    .locals 0

    iput-object p1, p0, Lo2/n$a;->i:Lz2/e$c;

    return-object p0
.end method

.method public final i(Ly2/c;)Lo2/n$a;
    .locals 1

    const-string v0, "driver"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lo2/n$a;->y:Ly2/c;

    return-object p0
.end method

.method public final j(Lm7/i;)Lo2/n$a;
    .locals 1

    .prologue
    const-string v0, "context"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lo2/n$a;->g:Ljava/util/concurrent/Executor;

    if-nez v0, :cond_1

    iget-object v0, p0, Lo2/n$a;->h:Ljava/util/concurrent/Executor;

    if-nez v0, :cond_1

    sget-object v0, Lm7/f;->A:Lm7/f$b;

    invoke-interface {p1, v0}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lo2/n$a;->z:Lm7/i;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "It is required that the coroutine context contain a dispatcher."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "This builder has already been configured with an Executor. A RoomDatabase canonly be configured with either an Executor or a CoroutineContext."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public k(Ljava/util/concurrent/Executor;)Lo2/n$a;
    .locals 1

    .prologue
    const-string v0, "executor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lo2/n$a;->z:Lm7/i;

    if-nez v0, :cond_0

    iput-object p1, p0, Lo2/n$a;->g:Ljava/util/concurrent/Executor;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "This builder has already been configured with a CoroutineContext. A RoomDatabasecan only be configured with either an Executor or a CoroutineContext."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
