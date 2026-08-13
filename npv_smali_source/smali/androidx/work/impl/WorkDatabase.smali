.class public abstract Landroidx/work/impl/WorkDatabase;
.super Lo2/n;
.source "SourceFile"


# static fields
.field private static final p:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Landroidx/work/impl/WorkDatabase;->p:J

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lo2/n;-><init>()V

    return-void
.end method

.method public static P(Landroid/content/Context;Ljava/util/concurrent/Executor;Z)Landroidx/work/impl/WorkDatabase;
    .locals 4

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x1

    const-class v2, Landroidx/work/impl/WorkDatabase;

    if-eqz p2, :cond_0

    invoke-static {p0, v2}, Lo2/l;->b(Landroid/content/Context;Ljava/lang/Class;)Lo2/n$a;

    move-result-object p2

    invoke-virtual {p2}, Lo2/n$a;->d()Lo2/n$a;

    move-result-object p2

    goto :goto_0

    :cond_0
    invoke-static {}, LJ2/h;->d()Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, v2, p2}, Lo2/l;->a(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)Lo2/n$a;

    move-result-object p2

    new-instance v2, Landroidx/work/impl/WorkDatabase$a;

    invoke-direct {v2, p0}, Landroidx/work/impl/WorkDatabase$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2, v2}, Lo2/n$a;->h(Lz2/e$c;)Lo2/n$a;

    :goto_0
    invoke-virtual {p2, p1}, Lo2/n$a;->k(Ljava/util/concurrent/Executor;)Lo2/n$a;

    move-result-object p1

    invoke-static {}, Landroidx/work/impl/WorkDatabase;->R()Lo2/n$b;

    move-result-object p2

    invoke-virtual {p1, p2}, Lo2/n$a;->a(Lo2/n$b;)Lo2/n$a;

    move-result-object p1

    new-array p2, v1, [Ls2/a;

    sget-object v2, Landroidx/work/impl/a;->a:Ls2/a;

    aput-object v2, p2, v0

    invoke-virtual {p1, p2}, Lo2/n$a;->b([Ls2/a;)Lo2/n$a;

    move-result-object p1

    new-instance p2, Landroidx/work/impl/a$h;

    const/4 v2, 0x2

    const/4 v3, 0x3

    invoke-direct {p2, p0, v2, v3}, Landroidx/work/impl/a$h;-><init>(Landroid/content/Context;II)V

    new-array v2, v1, [Ls2/a;

    aput-object p2, v2, v0

    invoke-virtual {p1, v2}, Lo2/n$a;->b([Ls2/a;)Lo2/n$a;

    move-result-object p1

    new-array p2, v1, [Ls2/a;

    sget-object v2, Landroidx/work/impl/a;->b:Ls2/a;

    aput-object v2, p2, v0

    invoke-virtual {p1, p2}, Lo2/n$a;->b([Ls2/a;)Lo2/n$a;

    move-result-object p1

    new-array p2, v1, [Ls2/a;

    sget-object v2, Landroidx/work/impl/a;->c:Ls2/a;

    aput-object v2, p2, v0

    invoke-virtual {p1, p2}, Lo2/n$a;->b([Ls2/a;)Lo2/n$a;

    move-result-object p1

    new-instance p2, Landroidx/work/impl/a$h;

    const/4 v2, 0x5

    const/4 v3, 0x6

    invoke-direct {p2, p0, v2, v3}, Landroidx/work/impl/a$h;-><init>(Landroid/content/Context;II)V

    new-array v2, v1, [Ls2/a;

    aput-object p2, v2, v0

    invoke-virtual {p1, v2}, Lo2/n$a;->b([Ls2/a;)Lo2/n$a;

    move-result-object p1

    new-array p2, v1, [Ls2/a;

    sget-object v2, Landroidx/work/impl/a;->d:Ls2/a;

    aput-object v2, p2, v0

    invoke-virtual {p1, p2}, Lo2/n$a;->b([Ls2/a;)Lo2/n$a;

    move-result-object p1

    new-array p2, v1, [Ls2/a;

    sget-object v2, Landroidx/work/impl/a;->e:Ls2/a;

    aput-object v2, p2, v0

    invoke-virtual {p1, p2}, Lo2/n$a;->b([Ls2/a;)Lo2/n$a;

    move-result-object p1

    new-array p2, v1, [Ls2/a;

    sget-object v2, Landroidx/work/impl/a;->f:Ls2/a;

    aput-object v2, p2, v0

    invoke-virtual {p1, p2}, Lo2/n$a;->b([Ls2/a;)Lo2/n$a;

    move-result-object p1

    new-instance p2, Landroidx/work/impl/a$i;

    invoke-direct {p2, p0}, Landroidx/work/impl/a$i;-><init>(Landroid/content/Context;)V

    new-array v2, v1, [Ls2/a;

    aput-object p2, v2, v0

    invoke-virtual {p1, v2}, Lo2/n$a;->b([Ls2/a;)Lo2/n$a;

    move-result-object p1

    new-instance p2, Landroidx/work/impl/a$h;

    const/16 v2, 0xa

    const/16 v3, 0xb

    invoke-direct {p2, p0, v2, v3}, Landroidx/work/impl/a$h;-><init>(Landroid/content/Context;II)V

    new-array p0, v1, [Ls2/a;

    aput-object p2, p0, v0

    invoke-virtual {p1, p0}, Lo2/n$a;->b([Ls2/a;)Lo2/n$a;

    move-result-object p0

    new-array p1, v1, [Ls2/a;

    sget-object p2, Landroidx/work/impl/a;->g:Ls2/a;

    aput-object p2, p1, v0

    invoke-virtual {p0, p1}, Lo2/n$a;->b([Ls2/a;)Lo2/n$a;

    move-result-object p0

    invoke-virtual {p0}, Lo2/n$a;->f()Lo2/n$a;

    move-result-object p0

    invoke-virtual {p0}, Lo2/n$a;->e()Lo2/n;

    move-result-object p0

    check-cast p0, Landroidx/work/impl/WorkDatabase;

    return-object p0
.end method

.method static R()Lo2/n$b;
    .locals 1

    new-instance v0, Landroidx/work/impl/WorkDatabase$b;

    invoke-direct {v0}, Landroidx/work/impl/WorkDatabase$b;-><init>()V

    return-object v0
.end method

.method static S()J
    .locals 4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sget-wide v2, Landroidx/work/impl/WorkDatabase;->p:J

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method static T()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Landroidx/work/impl/WorkDatabase;->S()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract Q()LQ2/b;
.end method

.method public abstract U()LQ2/e;
.end method

.method public abstract V()LQ2/h;
.end method

.method public abstract W()LQ2/k;
.end method

.method public abstract X()LQ2/n;
.end method

.method public abstract Y()LQ2/q;
.end method

.method public abstract Z()LQ2/t;
.end method
