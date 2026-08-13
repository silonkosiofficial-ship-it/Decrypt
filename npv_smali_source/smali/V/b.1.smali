.class public abstract LV/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Li7/n;

.field private static final b:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    sget-object v0, LV/b$a;->D:LV/b$a;

    invoke-static {v0}, Li7/o;->b(Lx7/a;)Li7/n;

    move-result-object v0

    sput-object v0, LV/b;->a:Li7/n;

    :try_start_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-wide/16 v0, -0x1

    :goto_0
    sput-wide v0, LV/b;->b:J

    return-void
.end method

.method public static final a(F)LV/q0;
    .locals 1

    new-instance v0, LV/A0;

    invoke-direct {v0, p0}, LV/A0;-><init>(F)V

    return-object v0
.end method

.method public static final b(I)LV/s0;
    .locals 1

    new-instance v0, LV/B0;

    invoke-direct {v0, p0}, LV/B0;-><init>(I)V

    return-object v0
.end method

.method public static final c(J)LV/u0;
    .locals 1

    new-instance v0, LV/C0;

    invoke-direct {v0, p0, p1}, LV/C0;-><init>(J)V

    return-object v0
.end method

.method public static final d(Ljava/lang/Object;LV/u1;)Lf0/q;
    .locals 1

    new-instance v0, LV/D0;

    invoke-direct {v0, p0, p1}, LV/D0;-><init>(Ljava/lang/Object;LV/u1;)V

    return-object v0
.end method

.method public static final e()J
    .locals 2

    sget-wide v0, LV/b;->b:J

    return-wide v0
.end method

.method public static final f(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "ComposeInternal"

    nop

    return-void
.end method
