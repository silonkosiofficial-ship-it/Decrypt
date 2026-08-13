.class abstract Landroidx/work/impl/background/systemalarm/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "Alarms"

    invoke-static {v0}, LI2/j;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Landroidx/work/impl/background/systemalarm/a;->a:Ljava/lang/String;

    return-void
.end method

.method public static a(Landroid/content/Context;LJ2/j;Ljava/lang/String;)V
    .locals 4

    .prologue
    const/4 v0, 0x0

    invoke-virtual {p1}, LJ2/j;->o()Landroidx/work/impl/WorkDatabase;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->V()LQ2/h;

    move-result-object p1

    invoke-interface {p1, p2}, LQ2/h;->b(Ljava/lang/String;)LQ2/g;

    move-result-object v1

    if-eqz v1, :cond_0

    iget v1, v1, LQ2/g;->b:I

    invoke-static {p0, p2, v1}, Landroidx/work/impl/background/systemalarm/a;->b(Landroid/content/Context;Ljava/lang/String;I)V

    invoke-static {}, LI2/j;->c()LI2/j;

    move-result-object p0

    sget-object v1, Landroidx/work/impl/background/systemalarm/a;->a:Ljava/lang/String;

    const-string v2, "Removing SystemIdInfo for workSpecId (%s)"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    aput-object p2, v3, v0

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-array v0, v0, [Ljava/lang/Throwable;

    invoke-virtual {p0, v1, v2, v0}, LI2/j;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    invoke-interface {p1, p2}, LQ2/h;->d(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private static b(Landroid/content/Context;Ljava/lang/String;I)V
    .locals 5

    .prologue
    const/4 v0, 0x0

    const-string v1, "alarm"

    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/AlarmManager;

    invoke-static {p0, p1}, Landroidx/work/impl/background/systemalarm/b;->b(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v2

    const/high16 v3, 0x24000000

    invoke-static {p0, p2, v2, v3}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p0

    if-eqz p0, :cond_0

    if-eqz v1, :cond_0

    invoke-static {}, LI2/j;->c()LI2/j;

    move-result-object v2

    sget-object v3, Landroidx/work/impl/background/systemalarm/a;->a:Ljava/lang/String;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    aput-object p1, v4, v0

    const/4 p1, 0x1

    aput-object p2, v4, p1

    const-string p1, "Cancelling existing alarm with (workSpecId, systemId) (%s, %s)"

    invoke-static {p1, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-array p2, v0, [Ljava/lang/Throwable;

    invoke-virtual {v2, v3, p1, p2}, LI2/j;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    invoke-virtual {v1, p0}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    :cond_0
    return-void
.end method

.method public static c(Landroid/content/Context;LJ2/j;Ljava/lang/String;J)V
    .locals 2

    .prologue
    invoke-virtual {p1}, LJ2/j;->o()Landroidx/work/impl/WorkDatabase;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->V()LQ2/h;

    move-result-object v0

    invoke-interface {v0, p2}, LQ2/h;->b(Ljava/lang/String;)LQ2/g;

    move-result-object v1

    if-eqz v1, :cond_0

    iget p1, v1, LQ2/g;->b:I

    invoke-static {p0, p2, p1}, Landroidx/work/impl/background/systemalarm/a;->b(Landroid/content/Context;Ljava/lang/String;I)V

    iget p1, v1, LQ2/g;->b:I

    :goto_0
    invoke-static {p0, p2, p1, p3, p4}, Landroidx/work/impl/background/systemalarm/a;->d(Landroid/content/Context;Ljava/lang/String;IJ)V

    goto :goto_1

    :cond_0
    new-instance v1, LR2/f;

    invoke-direct {v1, p1}, LR2/f;-><init>(Landroidx/work/impl/WorkDatabase;)V

    invoke-virtual {v1}, LR2/f;->b()I

    move-result p1

    new-instance v1, LQ2/g;

    invoke-direct {v1, p2, p1}, LQ2/g;-><init>(Ljava/lang/String;I)V

    invoke-interface {v0, v1}, LQ2/h;->c(LQ2/g;)V

    goto :goto_0

    :goto_1
    return-void
.end method

.method private static d(Landroid/content/Context;Ljava/lang/String;IJ)V
    .locals 2

    .prologue
    const-string v0, "alarm"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/AlarmManager;

    invoke-static {p0, p1}, Landroidx/work/impl/background/systemalarm/b;->b(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    const/high16 v1, 0xc000000

    invoke-static {p0, p2, p1, v1}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    invoke-virtual {v0, p1, p3, p4, p0}, Landroid/app/AlarmManager;->setExact(IJLandroid/app/PendingIntent;)V

    :cond_0
    return-void
.end method
