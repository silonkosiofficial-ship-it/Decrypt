.class public LR2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroidx/work/impl/WorkDatabase;


# direct methods
.method public constructor <init>(Landroidx/work/impl/WorkDatabase;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR2/f;->a:Landroidx/work/impl/WorkDatabase;

    return-void
.end method

.method public static a(Landroid/content/Context;Lz2/d;)V
    .locals 9

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x2

    const-string v2, "INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)"

    const-string v3, "androidx.work.util.id"

    const/4 v4, 0x0

    invoke-virtual {p0, v3, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    const-string v3, "next_job_scheduler_id"

    invoke-interface {p0, v3}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_0

    invoke-interface {p0, v3}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    :cond_0
    invoke-interface {p0, v3, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v5

    const-string v6, "next_alarm_manager_id"

    invoke-interface {p0, v6, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v7

    invoke-interface {p1}, Lz2/d;->u()V

    :try_start_0
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    new-array v8, v1, [Ljava/lang/Object;

    aput-object v3, v8, v4

    aput-object v5, v8, v0

    invoke-interface {p1, v2, v8}, Lz2/d;->j0(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-array v1, v1, [Ljava/lang/Object;

    aput-object v6, v1, v4

    aput-object v3, v1, v0

    invoke-interface {p1, v2, v1}, Lz2/d;->j0(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    invoke-interface {p1}, Lz2/d;->i0()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p1}, Lz2/d;->B0()V

    :cond_1
    return-void

    :catchall_0
    move-exception p0

    invoke-interface {p1}, Lz2/d;->B0()V

    throw p0
.end method

.method private c(Ljava/lang/String;)I
    .locals 3

    .prologue
    iget-object v0, p0, LR2/f;->a:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lo2/n;->g()V

    :try_start_0
    iget-object v0, p0, LR2/f;->a:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->U()LQ2/e;

    move-result-object v0

    invoke-interface {v0, p1}, LQ2/e;->a(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Long;->intValue()I

    move-result v0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    move v0, v1

    :goto_0
    const v2, 0x7fffffff

    if-ne v0, v2, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v0, 0x1

    :goto_1
    invoke-direct {p0, p1, v1}, LR2/f;->e(Ljava/lang/String;I)V

    iget-object p1, p0, LR2/f;->a:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {p1}, Lo2/n;->N()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LR2/f;->a:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {p1}, Lo2/n;->n()V

    return v0

    :goto_2
    iget-object v0, p0, LR2/f;->a:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lo2/n;->n()V

    throw p1
.end method

.method private e(Ljava/lang/String;I)V
    .locals 4

    iget-object v0, p0, LR2/f;->a:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->U()LQ2/e;

    move-result-object v0

    new-instance v1, LQ2/d;

    int-to-long v2, p2

    invoke-direct {v1, p1, v2, v3}, LQ2/d;-><init>(Ljava/lang/String;J)V

    invoke-interface {v0, v1}, LQ2/e;->b(LQ2/d;)V

    return-void
.end method


# virtual methods
.method public b()I
    .locals 2

    .prologue
    const-class v0, LR2/f;

    monitor-enter v0

    :try_start_0
    const-string v1, "next_alarm_manager_id"

    invoke-direct {p0, v1}, LR2/f;->c(Ljava/lang/String;)I

    move-result v1

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public d(II)I
    .locals 2

    .prologue
    const-class v0, LR2/f;

    monitor-enter v0

    :try_start_0
    const-string v1, "next_job_scheduler_id"

    invoke-direct {p0, v1}, LR2/f;->c(Ljava/lang/String;)I

    move-result v1

    if-lt v1, p1, :cond_1

    if-le v1, p2, :cond_0

    goto :goto_0

    :cond_0
    move p1, v1

    goto :goto_1

    :cond_1
    :goto_0
    const-string p2, "next_job_scheduler_id"

    add-int/lit8 v1, p1, 0x1

    invoke-direct {p0, p2, v1}, LR2/f;->e(Ljava/lang/String;I)V

    :goto_1
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
