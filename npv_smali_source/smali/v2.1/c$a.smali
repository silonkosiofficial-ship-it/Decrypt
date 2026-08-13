.class public final Lv2/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz2/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv2/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final C:Lv2/b;


# direct methods
.method public constructor <init>(Lv2/b;)V
    .locals 1

    const-string v0, "autoCloser"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv2/c$a;->C:Lv2/b;

    return-void
.end method


# virtual methods
.method public B(Ljava/lang/String;)V
    .locals 2

    const-string v0, "sql"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lv2/c$a;->C:Lv2/b;

    new-instance v1, Lv2/c$a$b;

    invoke-direct {v1, p1}, Lv2/c$a$b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lv2/b;->h(Lx7/l;)Ljava/lang/Object;

    return-void
.end method

.method public B0()V
    .locals 2

    .prologue
    :try_start_0
    iget-object v0, p0, Lv2/c$a;->C:Lv2/b;

    invoke-virtual {v0}, Lv2/b;->i()Lz2/d;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v0}, Lz2/d;->B0()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lv2/c$a;->C:Lv2/b;

    invoke-virtual {v0}, Lv2/b;->g()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lv2/c$a;->C:Lv2/b;

    invoke-virtual {v1}, Lv2/b;->g()V

    throw v0
.end method

.method public J(Ljava/lang/String;)Lz2/h;
    .locals 2

    const-string v0, "sql"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lv2/c$b;

    iget-object v1, p0, Lv2/c$a;->C:Lv2/b;

    invoke-direct {v0, p1, v1}, Lv2/c$b;-><init>(Ljava/lang/String;Lv2/b;)V

    return-object v0
.end method

.method public L0(Lz2/g;Landroid/os/CancellationSignal;)Landroid/database/Cursor;
    .locals 1

    .prologue
    const-string v0, "query"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lv2/c$a;->C:Lv2/b;

    invoke-virtual {v0}, Lv2/b;->j()Lz2/d;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lz2/d;->L0(Lz2/g;Landroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance p2, Lv2/c$c;

    iget-object v0, p0, Lv2/c$a;->C:Lv2/b;

    invoke-direct {p2, p1, v0}, Lv2/c$c;-><init>(Landroid/database/Cursor;Lv2/b;)V

    return-object p2

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lv2/c$a;->C:Lv2/b;

    invoke-virtual {p2}, Lv2/b;->g()V

    throw p1
.end method

.method public synthetic S()V
    .locals 0

    invoke-static {p0}, Lz2/c;->a(Lz2/d;)V

    return-void
.end method

.method public S0()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lv2/c$a;->C:Lv2/b;

    sget-object v1, Lv2/c$a$f;->K:Lv2/c$a$f;

    invoke-virtual {v0, v1}, Lv2/b;->h(Lx7/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public T(Lz2/g;)Landroid/database/Cursor;
    .locals 2

    .prologue
    const-string v0, "query"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lv2/c$a;->C:Lv2/b;

    invoke-virtual {v0}, Lv2/b;->j()Lz2/d;

    move-result-object v0

    invoke-interface {v0, p1}, Lz2/d;->T(Lz2/g;)Landroid/database/Cursor;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance v0, Lv2/c$c;

    iget-object v1, p0, Lv2/c$a;->C:Lv2/b;

    invoke-direct {v0, p1, v1}, Lv2/c$c;-><init>(Landroid/database/Cursor;Lv2/b;)V

    return-object v0

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lv2/c$a;->C:Lv2/b;

    invoke-virtual {v0}, Lv2/b;->g()V

    throw p1
.end method

.method public V0()Z
    .locals 2

    .prologue
    iget-object v0, p0, Lv2/c$a;->C:Lv2/b;

    invoke-virtual {v0}, Lv2/b;->i()Lz2/d;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lv2/c$a;->C:Lv2/b;

    sget-object v1, Lv2/c$a$d;->L:Lv2/c$a$d;

    invoke-virtual {v0, v1}, Lv2/b;->h(Lx7/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    :goto_0
    return v0
.end method

.method public final a()V
    .locals 2

    iget-object v0, p0, Lv2/c$a;->C:Lv2/b;

    sget-object v1, Lv2/c$a$g;->D:Lv2/c$a$g;

    invoke-virtual {v0, v1}, Lv2/b;->h(Lx7/l;)Ljava/lang/Object;

    return-void
.end method

.method public a1()Z
    .locals 2

    iget-object v0, p0, Lv2/c$a;->C:Lv2/b;

    sget-object v1, Lv2/c$a$e;->K:Lv2/c$a$e;

    invoke-virtual {v0, v1}, Lv2/b;->h(Lx7/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Lv2/c$a;->C:Lv2/b;

    invoke-virtual {v0}, Lv2/b;->f()V

    return-void
.end method

.method public i0()V
    .locals 1

    iget-object v0, p0, Lv2/c$a;->C:Lv2/b;

    invoke-virtual {v0}, Lv2/b;->i()Lz2/d;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v0}, Lz2/d;->i0()V

    return-void
.end method

.method public isOpen()Z
    .locals 1

    .prologue
    iget-object v0, p0, Lv2/c$a;->C:Lv2/b;

    invoke-virtual {v0}, Lv2/b;->i()Lz2/d;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lz2/d;->isOpen()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public j0(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    const-string v0, "sql"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bindArgs"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lv2/c$a;->C:Lv2/b;

    new-instance v1, Lv2/c$a$c;

    invoke-direct {v1, p1, p2}, Lv2/c$a$c;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lv2/b;->h(Lx7/l;)Ljava/lang/Object;

    return-void
.end method

.method public l0()V
    .locals 2

    .prologue
    iget-object v0, p0, Lv2/c$a;->C:Lv2/b;

    invoke-virtual {v0}, Lv2/b;->j()Lz2/d;

    move-result-object v0

    :try_start_0
    invoke-interface {v0}, Lz2/d;->l0()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lv2/c$a;->C:Lv2/b;

    invoke-virtual {v1}, Lv2/b;->g()V

    throw v0
.end method

.method public u()V
    .locals 2

    .prologue
    iget-object v0, p0, Lv2/c$a;->C:Lv2/b;

    invoke-virtual {v0}, Lv2/b;->j()Lz2/d;

    move-result-object v0

    :try_start_0
    invoke-interface {v0}, Lz2/d;->u()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lv2/c$a;->C:Lv2/b;

    invoke-virtual {v1}, Lv2/b;->g()V

    throw v0
.end method

.method public w0(Ljava/lang/String;)Landroid/database/Cursor;
    .locals 2

    .prologue
    const-string v0, "query"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lv2/c$a;->C:Lv2/b;

    invoke-virtual {v0}, Lv2/b;->j()Lz2/d;

    move-result-object v0

    invoke-interface {v0, p1}, Lz2/d;->w0(Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance v0, Lv2/c$c;

    iget-object v1, p0, Lv2/c$a;->C:Lv2/b;

    invoke-direct {v0, p1, v1}, Lv2/c$c;-><init>(Landroid/database/Cursor;Lv2/b;)V

    return-object v0

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lv2/c$a;->C:Lv2/b;

    invoke-virtual {v0}, Lv2/b;->g()V

    throw p1
.end method

.method public z()Ljava/util/List;
    .locals 2

    iget-object v0, p0, Lv2/c$a;->C:Lv2/b;

    sget-object v1, Lv2/c$a$a;->K:Lv2/c$a$a;

    invoke-virtual {v0, v1}, Lv2/b;->h(Lx7/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method
