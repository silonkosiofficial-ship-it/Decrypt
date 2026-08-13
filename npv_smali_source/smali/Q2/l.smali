.class public final LQ2/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQ2/k;


# instance fields
.field private final a:Lo2/n;

.field private final b:Lo2/g;


# direct methods
.method public constructor <init>(Lo2/n;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQ2/l;->a:Lo2/n;

    new-instance v0, LQ2/l$a;

    invoke-direct {v0, p0, p1}, LQ2/l$a;-><init>(LQ2/l;Lo2/n;)V

    iput-object v0, p0, LQ2/l;->b:Lo2/g;

    return-void
.end method


# virtual methods
.method public a(LQ2/j;)V
    .locals 1

    .prologue
    iget-object v0, p0, LQ2/l;->a:Lo2/n;

    invoke-virtual {v0}, Lo2/n;->f()V

    iget-object v0, p0, LQ2/l;->a:Lo2/n;

    invoke-virtual {v0}, Lo2/n;->g()V

    :try_start_0
    iget-object v0, p0, LQ2/l;->b:Lo2/g;

    invoke-virtual {v0, p1}, Lo2/g;->j(Ljava/lang/Object;)V

    iget-object p1, p0, LQ2/l;->a:Lo2/n;

    invoke-virtual {p1}, Lo2/n;->N()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LQ2/l;->a:Lo2/n;

    invoke-virtual {p1}, Lo2/n;->n()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, LQ2/l;->a:Lo2/n;

    invoke-virtual {v0}, Lo2/n;->n()V

    throw p1
.end method

.method public b(Ljava/lang/String;)Ljava/util/List;
    .locals 4

    .prologue
    const-string v0, "SELECT name FROM workname WHERE work_spec_id=?"

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo2/v;->g(Ljava/lang/String;I)Lo2/v;

    move-result-object v0

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, Lo2/v;->M0(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1, p1}, Lo2/v;->C(ILjava/lang/String;)V

    :goto_0
    iget-object p1, p0, LQ2/l;->a:Lo2/n;

    invoke-virtual {p1}, Lo2/n;->f()V

    iget-object p1, p0, LQ2/l;->a:Lo2/n;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, v0, v2, v1}, Lw2/b;->e(Lo2/n;Lz2/g;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object p1

    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {p1}, Landroid/database/Cursor;->getCount()I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    :goto_1
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, Lo2/v;->r()V

    return-object v1

    :goto_2
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, Lo2/v;->r()V

    throw v1
.end method
