.class LQ2/r$a;
.super Lo2/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ2/r;-><init>(Lo2/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:LQ2/r;


# direct methods
.method constructor <init>(LQ2/r;Lo2/n;)V
    .locals 0

    iput-object p1, p0, LQ2/r$a;->d:LQ2/r;

    invoke-direct {p0, p2}, Lo2/g;-><init>(Lo2/n;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"

    return-object v0
.end method

.method public bridge synthetic i(Lz2/h;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, LQ2/p;

    invoke-virtual {p0, p1, p2}, LQ2/r$a;->k(Lz2/h;LQ2/p;)V

    return-void
.end method

.method public k(Lz2/h;LQ2/p;)V
    .locals 10

    .prologue
    iget-object v0, p2, LQ2/p;->a:Ljava/lang/String;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, Lz2/f;->M0(I)V

    goto :goto_0

    :cond_0
    invoke-interface {p1, v1, v0}, Lz2/f;->C(ILjava/lang/String;)V

    :goto_0
    iget-object v0, p2, LQ2/p;->b:LI2/s;

    invoke-static {v0}, LQ2/v;->j(LI2/s;)I

    move-result v0

    const/4 v1, 0x2

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Lz2/f;->l(IJ)V

    iget-object v0, p2, LQ2/p;->c:Ljava/lang/String;

    const/4 v1, 0x3

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, Lz2/f;->M0(I)V

    goto :goto_1

    :cond_1
    invoke-interface {p1, v1, v0}, Lz2/f;->C(ILjava/lang/String;)V

    :goto_1
    iget-object v0, p2, LQ2/p;->d:Ljava/lang/String;

    const/4 v1, 0x4

    if-nez v0, :cond_2

    invoke-interface {p1, v1}, Lz2/f;->M0(I)V

    goto :goto_2

    :cond_2
    invoke-interface {p1, v1, v0}, Lz2/f;->C(ILjava/lang/String;)V

    :goto_2
    iget-object v0, p2, LQ2/p;->e:Landroidx/work/b;

    invoke-static {v0}, Landroidx/work/b;->k(Landroidx/work/b;)[B

    move-result-object v0

    const/4 v1, 0x5

    if-nez v0, :cond_3

    invoke-interface {p1, v1}, Lz2/f;->M0(I)V

    goto :goto_3

    :cond_3
    invoke-interface {p1, v1, v0}, Lz2/f;->p0(I[B)V

    :goto_3
    iget-object v0, p2, LQ2/p;->f:Landroidx/work/b;

    invoke-static {v0}, Landroidx/work/b;->k(Landroidx/work/b;)[B

    move-result-object v0

    const/4 v1, 0x6

    if-nez v0, :cond_4

    invoke-interface {p1, v1}, Lz2/f;->M0(I)V

    goto :goto_4

    :cond_4
    invoke-interface {p1, v1, v0}, Lz2/f;->p0(I[B)V

    :goto_4
    const/4 v0, 0x7

    iget-wide v1, p2, LQ2/p;->g:J

    invoke-interface {p1, v0, v1, v2}, Lz2/f;->l(IJ)V

    const/16 v0, 0x8

    iget-wide v1, p2, LQ2/p;->h:J

    invoke-interface {p1, v0, v1, v2}, Lz2/f;->l(IJ)V

    const/16 v0, 0x9

    iget-wide v1, p2, LQ2/p;->i:J

    invoke-interface {p1, v0, v1, v2}, Lz2/f;->l(IJ)V

    iget v0, p2, LQ2/p;->k:I

    int-to-long v0, v0

    const/16 v2, 0xa

    invoke-interface {p1, v2, v0, v1}, Lz2/f;->l(IJ)V

    iget-object v0, p2, LQ2/p;->l:LI2/a;

    invoke-static {v0}, LQ2/v;->a(LI2/a;)I

    move-result v0

    const/16 v1, 0xb

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Lz2/f;->l(IJ)V

    const/16 v0, 0xc

    iget-wide v1, p2, LQ2/p;->m:J

    invoke-interface {p1, v0, v1, v2}, Lz2/f;->l(IJ)V

    const/16 v0, 0xd

    iget-wide v1, p2, LQ2/p;->n:J

    invoke-interface {p1, v0, v1, v2}, Lz2/f;->l(IJ)V

    const/16 v0, 0xe

    iget-wide v1, p2, LQ2/p;->o:J

    invoke-interface {p1, v0, v1, v2}, Lz2/f;->l(IJ)V

    const/16 v0, 0xf

    iget-wide v1, p2, LQ2/p;->p:J

    invoke-interface {p1, v0, v1, v2}, Lz2/f;->l(IJ)V

    iget-boolean v0, p2, LQ2/p;->q:Z

    const/16 v1, 0x10

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Lz2/f;->l(IJ)V

    iget-object v0, p2, LQ2/p;->r:LI2/n;

    invoke-static {v0}, LQ2/v;->i(LI2/n;)I

    move-result v0

    const/16 v1, 0x11

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Lz2/f;->l(IJ)V

    iget-object p2, p2, LQ2/p;->j:LI2/b;

    const/16 v0, 0x18

    const/16 v1, 0x17

    const/16 v2, 0x16

    const/16 v3, 0x15

    const/16 v4, 0x14

    const/16 v5, 0x13

    const/16 v6, 0x12

    const/16 v7, 0x19

    if-eqz p2, :cond_6

    invoke-virtual {p2}, LI2/b;->b()LI2/k;

    move-result-object v8

    invoke-static {v8}, LQ2/v;->h(LI2/k;)I

    move-result v8

    int-to-long v8, v8

    invoke-interface {p1, v6, v8, v9}, Lz2/f;->l(IJ)V

    invoke-virtual {p2}, LI2/b;->g()Z

    move-result v6

    int-to-long v8, v6

    invoke-interface {p1, v5, v8, v9}, Lz2/f;->l(IJ)V

    invoke-virtual {p2}, LI2/b;->h()Z

    move-result v5

    int-to-long v5, v5

    invoke-interface {p1, v4, v5, v6}, Lz2/f;->l(IJ)V

    invoke-virtual {p2}, LI2/b;->f()Z

    move-result v4

    int-to-long v4, v4

    invoke-interface {p1, v3, v4, v5}, Lz2/f;->l(IJ)V

    invoke-virtual {p2}, LI2/b;->i()Z

    move-result v3

    int-to-long v3, v3

    invoke-interface {p1, v2, v3, v4}, Lz2/f;->l(IJ)V

    invoke-virtual {p2}, LI2/b;->c()J

    move-result-wide v2

    invoke-interface {p1, v1, v2, v3}, Lz2/f;->l(IJ)V

    invoke-virtual {p2}, LI2/b;->d()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Lz2/f;->l(IJ)V

    invoke-virtual {p2}, LI2/b;->a()LI2/c;

    move-result-object p2

    invoke-static {p2}, LQ2/v;->c(LI2/c;)[B

    move-result-object p2

    if-nez p2, :cond_5

    goto :goto_5

    :cond_5
    invoke-interface {p1, v7, p2}, Lz2/f;->p0(I[B)V

    goto :goto_6

    :cond_6
    invoke-interface {p1, v6}, Lz2/f;->M0(I)V

    invoke-interface {p1, v5}, Lz2/f;->M0(I)V

    invoke-interface {p1, v4}, Lz2/f;->M0(I)V

    invoke-interface {p1, v3}, Lz2/f;->M0(I)V

    invoke-interface {p1, v2}, Lz2/f;->M0(I)V

    invoke-interface {p1, v1}, Lz2/f;->M0(I)V

    invoke-interface {p1, v0}, Lz2/f;->M0(I)V

    :goto_5
    invoke-interface {p1, v7}, Lz2/f;->M0(I)V

    :goto_6
    return-void
.end method
