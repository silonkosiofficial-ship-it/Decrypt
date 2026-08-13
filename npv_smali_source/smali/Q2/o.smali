.class public final LQ2/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQ2/n;


# instance fields
.field private final a:Lo2/n;

.field private final b:Lo2/g;

.field private final c:Lo2/w;

.field private final d:Lo2/w;


# direct methods
.method public constructor <init>(Lo2/n;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQ2/o;->a:Lo2/n;

    new-instance v0, LQ2/o$a;

    invoke-direct {v0, p0, p1}, LQ2/o$a;-><init>(LQ2/o;Lo2/n;)V

    iput-object v0, p0, LQ2/o;->b:Lo2/g;

    new-instance v0, LQ2/o$b;

    invoke-direct {v0, p0, p1}, LQ2/o$b;-><init>(LQ2/o;Lo2/n;)V

    iput-object v0, p0, LQ2/o;->c:Lo2/w;

    new-instance v0, LQ2/o$c;

    invoke-direct {v0, p0, p1}, LQ2/o$c;-><init>(LQ2/o;Lo2/n;)V

    iput-object v0, p0, LQ2/o;->d:Lo2/w;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 2

    .prologue
    iget-object v0, p0, LQ2/o;->a:Lo2/n;

    invoke-virtual {v0}, Lo2/n;->f()V

    iget-object v0, p0, LQ2/o;->c:Lo2/w;

    invoke-virtual {v0}, Lo2/w;->b()Lz2/h;

    move-result-object v0

    const/4 v1, 0x1

    if-nez p1, :cond_0

    invoke-interface {v0, v1}, Lz2/f;->M0(I)V

    goto :goto_0

    :cond_0
    invoke-interface {v0, v1, p1}, Lz2/f;->C(ILjava/lang/String;)V

    :goto_0
    iget-object p1, p0, LQ2/o;->a:Lo2/n;

    invoke-virtual {p1}, Lo2/n;->g()V

    :try_start_0
    invoke-interface {v0}, Lz2/h;->I()I

    iget-object p1, p0, LQ2/o;->a:Lo2/n;

    invoke-virtual {p1}, Lo2/n;->N()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LQ2/o;->a:Lo2/n;

    invoke-virtual {p1}, Lo2/n;->n()V

    iget-object p1, p0, LQ2/o;->c:Lo2/w;

    invoke-virtual {p1, v0}, Lo2/w;->h(Lz2/h;)V

    return-void

    :catchall_0
    move-exception p1

    iget-object v1, p0, LQ2/o;->a:Lo2/n;

    invoke-virtual {v1}, Lo2/n;->n()V

    iget-object v1, p0, LQ2/o;->c:Lo2/w;

    invoke-virtual {v1, v0}, Lo2/w;->h(Lz2/h;)V

    throw p1
.end method

.method public b(LQ2/m;)V
    .locals 1

    .prologue
    iget-object v0, p0, LQ2/o;->a:Lo2/n;

    invoke-virtual {v0}, Lo2/n;->f()V

    iget-object v0, p0, LQ2/o;->a:Lo2/n;

    invoke-virtual {v0}, Lo2/n;->g()V

    :try_start_0
    iget-object v0, p0, LQ2/o;->b:Lo2/g;

    invoke-virtual {v0, p1}, Lo2/g;->j(Ljava/lang/Object;)V

    iget-object p1, p0, LQ2/o;->a:Lo2/n;

    invoke-virtual {p1}, Lo2/n;->N()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LQ2/o;->a:Lo2/n;

    invoke-virtual {p1}, Lo2/n;->n()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, LQ2/o;->a:Lo2/n;

    invoke-virtual {v0}, Lo2/n;->n()V

    throw p1
.end method

.method public c()V
    .locals 3

    .prologue
    iget-object v0, p0, LQ2/o;->a:Lo2/n;

    invoke-virtual {v0}, Lo2/n;->f()V

    iget-object v0, p0, LQ2/o;->d:Lo2/w;

    invoke-virtual {v0}, Lo2/w;->b()Lz2/h;

    move-result-object v0

    iget-object v1, p0, LQ2/o;->a:Lo2/n;

    invoke-virtual {v1}, Lo2/n;->g()V

    :try_start_0
    invoke-interface {v0}, Lz2/h;->I()I

    iget-object v1, p0, LQ2/o;->a:Lo2/n;

    invoke-virtual {v1}, Lo2/n;->N()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, LQ2/o;->a:Lo2/n;

    invoke-virtual {v1}, Lo2/n;->n()V

    iget-object v1, p0, LQ2/o;->d:Lo2/w;

    invoke-virtual {v1, v0}, Lo2/w;->h(Lz2/h;)V

    return-void

    :catchall_0
    move-exception v1

    iget-object v2, p0, LQ2/o;->a:Lo2/n;

    invoke-virtual {v2}, Lo2/n;->n()V

    iget-object v2, p0, LQ2/o;->d:Lo2/w;

    invoke-virtual {v2, v0}, Lo2/w;->h(Lz2/h;)V

    throw v1
.end method
