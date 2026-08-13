.class public final Lo2/m;
.super Lo2/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo2/m$a;,
        Lo2/m$b;
    }
.end annotation


# instance fields
.field private final d:Lo2/c;

.field private final e:Lo2/r;

.field private final f:Ljava/util/List;

.field private final g:Lq2/b;

.field private h:Lz2/d;


# direct methods
.method public constructor <init>(Lo2/c;Lo2/r;)V
    .locals 2

    .prologue
    const-string v0, "config"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "openDelegate"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lo2/a;-><init>()V

    iput-object p1, p0, Lo2/m;->d:Lo2/c;

    iput-object p2, p0, Lo2/m;->e:Lo2/r;

    iget-object v0, p1, Lo2/c;->e:Ljava/util/List;

    if-nez v0, :cond_0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    :cond_0
    iput-object v0, p0, Lo2/m;->f:Ljava/util/List;

    iget-object v0, p1, Lo2/c;->t:Ly2/c;

    if-nez v0, :cond_2

    iget-object v0, p1, Lo2/c;->c:Lz2/e$c;

    if-eqz v0, :cond_1

    sget-object v0, Lz2/e$b;->f:Lz2/e$b$b;

    iget-object v1, p1, Lo2/c;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lz2/e$b$b;->a(Landroid/content/Context;)Lz2/e$b$a;

    move-result-object v0

    iget-object v1, p1, Lo2/c;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lz2/e$b$a;->c(Ljava/lang/String;)Lz2/e$b$a;

    move-result-object v0

    new-instance v1, Lo2/m$b;

    invoke-virtual {p2}, Lo2/r;->e()I

    move-result p2

    invoke-direct {v1, p0, p2}, Lo2/m$b;-><init>(Lo2/m;I)V

    invoke-virtual {v0, v1}, Lz2/e$b$a;->b(Lz2/e$a;)Lz2/e$b$a;

    move-result-object p2

    invoke-virtual {p2}, Lz2/e$b$a;->a()Lz2/e$b;

    move-result-object p2

    new-instance v0, Lr2/b;

    new-instance v1, Lr2/c;

    iget-object p1, p1, Lo2/c;->c:Lz2/e$c;

    invoke-interface {p1, p2}, Lz2/e$c;->a(Lz2/e$b;)Lz2/e;

    move-result-object p1

    invoke-direct {v1, p1}, Lr2/c;-><init>(Lz2/e;)V

    invoke-direct {v0, v1}, Lr2/b;-><init>(Lr2/c;)V

    iput-object v0, p0, Lo2/m;->g:Lq2/b;

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "SQLiteManager was constructed with both null driver and open helper factory!"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-virtual {p0}, Lo2/m;->o()Lo2/c;

    move-result-object p2

    iget-object p2, p2, Lo2/c;->b:Ljava/lang/String;

    if-nez p2, :cond_3

    new-instance p2, Lo2/a$b;

    iget-object p1, p1, Lo2/c;->t:Ly2/c;

    invoke-direct {p2, p0, p1}, Lo2/a$b;-><init>(Lo2/a;Ly2/c;)V

    const-string p1, ":memory:"

    invoke-static {p2, p1}, Lq2/e;->b(Ly2/c;Ljava/lang/String;)Lq2/b;

    move-result-object p1

    goto :goto_0

    :cond_3
    new-instance p2, Lo2/a$b;

    iget-object p1, p1, Lo2/c;->t:Ly2/c;

    invoke-direct {p2, p0, p1}, Lo2/a$b;-><init>(Lo2/a;Ly2/c;)V

    invoke-virtual {p0}, Lo2/m;->o()Lo2/c;

    move-result-object p1

    iget-object p1, p1, Lo2/c;->b:Ljava/lang/String;

    invoke-virtual {p0}, Lo2/m;->o()Lo2/c;

    move-result-object v0

    iget-object v0, v0, Lo2/c;->g:Lo2/n$d;

    invoke-virtual {p0, v0}, Lo2/a;->p(Lo2/n$d;)I

    move-result v0

    invoke-virtual {p0}, Lo2/m;->o()Lo2/c;

    move-result-object v1

    iget-object v1, v1, Lo2/c;->g:Lo2/n$d;

    invoke-virtual {p0, v1}, Lo2/a;->q(Lo2/n$d;)I

    move-result v1

    invoke-static {p2, p1, v0, v1}, Lq2/e;->a(Ly2/c;Ljava/lang/String;II)Lq2/b;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lo2/m;->g:Lq2/b;

    :goto_1
    invoke-direct {p0}, Lo2/m;->E()V

    return-void
.end method

.method public constructor <init>(Lo2/c;Lx7/l;)V
    .locals 2

    .prologue
    const-string v0, "config"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "supportOpenHelperFactory"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lo2/a;-><init>()V

    iput-object p1, p0, Lo2/m;->d:Lo2/c;

    new-instance v0, Lo2/m$a;

    invoke-direct {v0}, Lo2/m$a;-><init>()V

    iput-object v0, p0, Lo2/m;->e:Lo2/r;

    iget-object v0, p1, Lo2/c;->e:Ljava/util/List;

    if-nez v0, :cond_0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    :cond_0
    iput-object v0, p0, Lo2/m;->f:Ljava/util/List;

    new-instance v0, Lo2/m$c;

    invoke-direct {v0, p0}, Lo2/m$c;-><init>(Lo2/m;)V

    invoke-direct {p0, p1, v0}, Lo2/m;->F(Lo2/c;Lx7/l;)Lo2/c;

    move-result-object p1

    new-instance v0, Lr2/b;

    new-instance v1, Lr2/c;

    invoke-interface {p2, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lz2/e;

    invoke-direct {v1, p1}, Lr2/c;-><init>(Lz2/e;)V

    invoke-direct {v0, v1}, Lr2/b;-><init>(Lr2/c;)V

    iput-object v0, p0, Lo2/m;->g:Lq2/b;

    invoke-direct {p0}, Lo2/m;->E()V

    return-void
.end method

.method public static final synthetic B(Lo2/m;Lz2/d;)V
    .locals 0

    iput-object p1, p0, Lo2/m;->h:Lz2/d;

    return-void
.end method

.method private final E()V
    .locals 2

    .prologue
    invoke-virtual {p0}, Lo2/m;->o()Lo2/c;

    move-result-object v0

    iget-object v0, v0, Lo2/c;->g:Lo2/n$d;

    sget-object v1, Lo2/n$d;->E:Lo2/n$d;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Lo2/m;->D()Lz2/e;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-interface {v1, v0}, Lz2/e;->setWriteAheadLoggingEnabled(Z)V

    :cond_1
    return-void
.end method

.method private final F(Lo2/c;Lx7/l;)Lo2/c;
    .locals 25

    .prologue
    move-object/from16 v0, p1

    iget-object v1, v0, Lo2/c;->e:Ljava/util/List;

    if-nez v1, :cond_0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v1

    :cond_0
    check-cast v1, Ljava/util/Collection;

    new-instance v2, Lo2/m$d;

    move-object/from16 v3, p2

    invoke-direct {v2, v3}, Lo2/m$d;-><init>(Lx7/l;)V

    invoke-static {v1, v2}, Lj7/v;->D0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    const v23, 0x3fffef

    const/16 v24, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v0, p1

    invoke-static/range {v0 .. v24}, Lo2/c;->b(Lo2/c;Landroid/content/Context;Ljava/lang/String;Lz2/e$c;Lo2/n$e;Ljava/util/List;ZLo2/n$d;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroid/content/Intent;ZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Lo2/n$f;Ljava/util/List;Ljava/util/List;ZLy2/c;Lm7/i;ILjava/lang/Object;)Lo2/c;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final C()V
    .locals 1

    iget-object v0, p0, Lo2/m;->g:Lq2/b;

    invoke-interface {v0}, Lq2/b;->close()V

    return-void
.end method

.method public final D()Lz2/e;
    .locals 3

    .prologue
    iget-object v0, p0, Lo2/m;->g:Lq2/b;

    instance-of v1, v0, Lr2/b;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lr2/b;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lr2/b;->c()Lr2/c;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lr2/c;->b()Lz2/e;

    move-result-object v2

    :cond_1
    return-object v2
.end method

.method public final G()Z
    .locals 1

    .prologue
    iget-object v0, p0, Lo2/m;->h:Lz2/d;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lz2/d;->isOpen()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public H(ZLx7/p;Lm7/e;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lo2/m;->g:Lq2/b;

    invoke-interface {v0, p1, p2, p3}, Lq2/b;->a(ZLx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected n()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lo2/m;->f:Ljava/util/List;

    return-object v0
.end method

.method protected o()Lo2/c;
    .locals 1

    iget-object v0, p0, Lo2/m;->d:Lo2/c;

    return-object v0
.end method

.method protected r()Lo2/r;
    .locals 1

    iget-object v0, p0, Lo2/m;->e:Lo2/r;

    return-object v0
.end method
