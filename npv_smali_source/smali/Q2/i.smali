.class public final LQ2/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQ2/h;


# instance fields
.field private final a:Lo2/n;

.field private final b:Lo2/g;

.field private final c:Lo2/w;


# direct methods
.method public constructor <init>(Lo2/n;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQ2/i;->a:Lo2/n;

    new-instance v0, LQ2/i$a;

    invoke-direct {v0, p0, p1}, LQ2/i$a;-><init>(LQ2/i;Lo2/n;)V

    iput-object v0, p0, LQ2/i;->b:Lo2/g;

    new-instance v0, LQ2/i$b;

    invoke-direct {v0, p0, p1}, LQ2/i$b;-><init>(LQ2/i;Lo2/n;)V

    iput-object v0, p0, LQ2/i;->c:Lo2/w;

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 5

    .prologue
    const-string v0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo2/v;->g(Ljava/lang/String;I)Lo2/v;

    move-result-object v0

    iget-object v2, p0, LQ2/i;->a:Lo2/n;

    invoke-virtual {v2}, Lo2/n;->f()V

    iget-object v2, p0, LQ2/i;->a:Lo2/n;

    const/4 v3, 0x0

    invoke-static {v2, v0, v1, v3}, Lw2/b;->e(Lo2/n;Lz2/g;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v2

    :try_start_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {v2}, Landroid/database/Cursor;->getCount()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    :goto_0
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, Lo2/v;->r()V

    return-object v3

    :goto_1
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, Lo2/v;->r()V

    throw v1
.end method

.method public b(Ljava/lang/String;)LQ2/g;
    .locals 5

    .prologue
    const-string v0, "SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?"

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo2/v;->g(Ljava/lang/String;I)Lo2/v;

    move-result-object v0

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, Lo2/v;->M0(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1, p1}, Lo2/v;->C(ILjava/lang/String;)V

    :goto_0
    iget-object p1, p0, LQ2/i;->a:Lo2/n;

    invoke-virtual {p1}, Lo2/n;->f()V

    iget-object p1, p0, LQ2/i;->a:Lo2/n;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, v0, v1, v2}, Lw2/b;->e(Lo2/n;Lz2/g;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object p1

    :try_start_0
    const-string v1, "work_spec_id"

    invoke-static {p1, v1}, Lw2/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    const-string v3, "system_id"

    invoke-static {p1, v3}, Lw2/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    new-instance v3, LQ2/g;

    invoke-direct {v3, v1, v2}, LQ2/g;-><init>(Ljava/lang/String;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v2, v3

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_1
    :goto_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, Lo2/v;->r()V

    return-object v2

    :goto_2
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, Lo2/v;->r()V

    throw v1
.end method

.method public c(LQ2/g;)V
    .locals 1

    .prologue
    iget-object v0, p0, LQ2/i;->a:Lo2/n;

    invoke-virtual {v0}, Lo2/n;->f()V

    iget-object v0, p0, LQ2/i;->a:Lo2/n;

    invoke-virtual {v0}, Lo2/n;->g()V

    :try_start_0
    iget-object v0, p0, LQ2/i;->b:Lo2/g;

    invoke-virtual {v0, p1}, Lo2/g;->j(Ljava/lang/Object;)V

    iget-object p1, p0, LQ2/i;->a:Lo2/n;

    invoke-virtual {p1}, Lo2/n;->N()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LQ2/i;->a:Lo2/n;

    invoke-virtual {p1}, Lo2/n;->n()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, LQ2/i;->a:Lo2/n;

    invoke-virtual {v0}, Lo2/n;->n()V

    throw p1
.end method

.method public d(Ljava/lang/String;)V
    .locals 2

    .prologue
    iget-object v0, p0, LQ2/i;->a:Lo2/n;

    invoke-virtual {v0}, Lo2/n;->f()V

    iget-object v0, p0, LQ2/i;->c:Lo2/w;

    invoke-virtual {v0}, Lo2/w;->b()Lz2/h;

    move-result-object v0

    const/4 v1, 0x1

    if-nez p1, :cond_0

    invoke-interface {v0, v1}, Lz2/f;->M0(I)V

    goto :goto_0

    :cond_0
    invoke-interface {v0, v1, p1}, Lz2/f;->C(ILjava/lang/String;)V

    :goto_0
    iget-object p1, p0, LQ2/i;->a:Lo2/n;

    invoke-virtual {p1}, Lo2/n;->g()V

    :try_start_0
    invoke-interface {v0}, Lz2/h;->I()I

    iget-object p1, p0, LQ2/i;->a:Lo2/n;

    invoke-virtual {p1}, Lo2/n;->N()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LQ2/i;->a:Lo2/n;

    invoke-virtual {p1}, Lo2/n;->n()V

    iget-object p1, p0, LQ2/i;->c:Lo2/w;

    invoke-virtual {p1, v0}, Lo2/w;->h(Lz2/h;)V

    return-void

    :catchall_0
    move-exception p1

    iget-object v1, p0, LQ2/i;->a:Lo2/n;

    invoke-virtual {v1}, Lo2/n;->n()V

    iget-object v1, p0, LQ2/i;->c:Lo2/w;

    invoke-virtual {v1, v0}, Lo2/w;->h(Lz2/h;)V

    throw p1
.end method
