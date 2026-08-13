.class public abstract LQ3/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LQ3/c$a;,
        LQ3/c$b;,
        LQ3/c$d;,
        LQ3/c$c;,
        LQ3/c$e;
    }
.end annotation


# static fields
.field public static final D:[Ljava/lang/String;

.field private static final E:[LN3/d;


# instance fields
.field private A:Z

.field private volatile B:LQ3/h0;

.field protected C:Ljava/util/concurrent/atomic/AtomicInteger;

.field private a:I

.field private b:J

.field private c:J

.field private d:I

.field private e:J

.field private volatile f:Ljava/lang/String;

.field g:LQ3/s0;

.field private final h:Landroid/content/Context;

.field private final i:Landroid/os/Looper;

.field private final j:LQ3/h;

.field private final k:LN3/h;

.field final l:Landroid/os/Handler;

.field private final m:Ljava/lang/Object;

.field private final n:Ljava/lang/Object;

.field private o:LQ3/l;

.field protected p:LQ3/c$c;

.field private q:Landroid/os/IInterface;

.field private final r:Ljava/util/ArrayList;

.field private s:LQ3/e0;

.field private t:I

.field private final u:LQ3/c$a;

.field private final v:LQ3/c$b;

.field private final w:I

.field private final x:Ljava/lang/String;

.field private volatile y:Ljava/lang/String;

.field private z:LN3/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [LN3/d;

    sput-object v0, LQ3/c;->E:[LN3/d;

    const-string v0, "service_esmobile"

    const-string v1, "service_googleme"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, LQ3/c;->D:[Ljava/lang/String;

    return-void
.end method

.method protected constructor <init>(Landroid/content/Context;Landroid/os/Looper;ILQ3/c$a;LQ3/c$b;Ljava/lang/String;)V
    .locals 9

    invoke-static {p1}, LQ3/h;->a(Landroid/content/Context;)LQ3/h;

    move-result-object v3

    invoke-static {}, LN3/h;->f()LN3/h;

    move-result-object v4

    invoke-static {p4}, LQ3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p5}, LQ3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p3

    move-object v6, p4

    move-object v7, p5

    move-object v8, p6

    invoke-direct/range {v0 .. v8}, LQ3/c;-><init>(Landroid/content/Context;Landroid/os/Looper;LQ3/h;LN3/h;ILQ3/c$a;LQ3/c$b;Ljava/lang/String;)V

    return-void
.end method

.method protected constructor <init>(Landroid/content/Context;Landroid/os/Looper;LQ3/h;LN3/h;ILQ3/c$a;LQ3/c$b;Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, LQ3/c;->f:Ljava/lang/String;

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, LQ3/c;->m:Ljava/lang/Object;

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, LQ3/c;->n:Ljava/lang/Object;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, LQ3/c;->r:Ljava/util/ArrayList;

    const/4 v1, 0x1

    iput v1, p0, LQ3/c;->t:I

    iput-object v0, p0, LQ3/c;->z:LN3/b;

    const/4 v1, 0x0

    iput-boolean v1, p0, LQ3/c;->A:Z

    iput-object v0, p0, LQ3/c;->B:LQ3/h0;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, LQ3/c;->C:Ljava/util/concurrent/atomic/AtomicInteger;

    const-string v0, "Context must not be null"

    invoke-static {p1, v0}, LQ3/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, LQ3/c;->h:Landroid/content/Context;

    const-string p1, "Looper must not be null"

    invoke-static {p2, p1}, LQ3/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p2, p0, LQ3/c;->i:Landroid/os/Looper;

    const-string p1, "Supervisor must not be null"

    invoke-static {p3, p1}, LQ3/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p3, p0, LQ3/c;->j:LQ3/h;

    const-string p1, "API availability must not be null"

    invoke-static {p4, p1}, LQ3/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p4, p0, LQ3/c;->k:LN3/h;

    new-instance p1, LQ3/b0;

    invoke-direct {p1, p0, p2}, LQ3/b0;-><init>(LQ3/c;Landroid/os/Looper;)V

    iput-object p1, p0, LQ3/c;->l:Landroid/os/Handler;

    iput p5, p0, LQ3/c;->w:I

    iput-object p6, p0, LQ3/c;->u:LQ3/c$a;

    iput-object p7, p0, LQ3/c;->v:LQ3/c$b;

    iput-object p8, p0, LQ3/c;->x:Ljava/lang/String;

    return-void
.end method

.method static bridge synthetic T(LQ3/c;)LN3/b;
    .locals 0

    iget-object p0, p0, LQ3/c;->z:LN3/b;

    return-object p0
.end method

.method static bridge synthetic U(LQ3/c;)LQ3/c$a;
    .locals 0

    iget-object p0, p0, LQ3/c;->u:LQ3/c$a;

    return-object p0
.end method

.method static bridge synthetic V(LQ3/c;)LQ3/c$b;
    .locals 0

    iget-object p0, p0, LQ3/c;->v:LQ3/c$b;

    return-object p0
.end method

.method static bridge synthetic W(LQ3/c;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, LQ3/c;->n:Ljava/lang/Object;

    return-object p0
.end method

.method static bridge synthetic Y(LQ3/c;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, LQ3/c;->r:Ljava/util/ArrayList;

    return-object p0
.end method

.method static bridge synthetic Z(LQ3/c;LN3/b;)V
    .locals 0

    iput-object p1, p0, LQ3/c;->z:LN3/b;

    return-void
.end method

.method static bridge synthetic a0(LQ3/c;LQ3/l;)V
    .locals 0

    iput-object p1, p0, LQ3/c;->o:LQ3/l;

    return-void
.end method

.method static bridge synthetic b0(LQ3/c;ILandroid/os/IInterface;)V
    .locals 0

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, LQ3/c;->i0(ILandroid/os/IInterface;)V

    return-void
.end method

.method static bridge synthetic c0(LQ3/c;LQ3/h0;)V
    .locals 0

    .prologue
    iput-object p1, p0, LQ3/c;->B:LQ3/h0;

    invoke-virtual {p0}, LQ3/c;->S()Z

    move-result p0

    if-eqz p0, :cond_1

    iget-object p0, p1, LQ3/h0;->F:LQ3/e;

    invoke-static {}, LQ3/q;->b()LQ3/q;

    move-result-object p1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LQ3/e;->D()LQ3/r;

    move-result-object p0

    :goto_0
    invoke-virtual {p1, p0}, LQ3/q;->c(LQ3/r;)V

    :cond_1
    return-void
.end method

.method static bridge synthetic d0(LQ3/c;I)V
    .locals 2

    .prologue
    iget-object p1, p0, LQ3/c;->m:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget v0, p0, LQ3/c;->t:I

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x3

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, LQ3/c;->A:Z

    const/4 p1, 0x5

    goto :goto_0

    :cond_0
    const/4 p1, 0x4

    :goto_0
    iget-object v0, p0, LQ3/c;->l:Landroid/os/Handler;

    iget-object p0, p0, LQ3/c;->C:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p0

    const/16 v1, 0x10

    invoke-virtual {v0, p1, p0, v1}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method static bridge synthetic f0(LQ3/c;)Z
    .locals 0

    iget-boolean p0, p0, LQ3/c;->A:Z

    return p0
.end method

.method static bridge synthetic g0(LQ3/c;IILandroid/os/IInterface;)Z
    .locals 2

    .prologue
    iget-object v0, p0, LQ3/c;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, LQ3/c;->t:I

    if-eq v1, p1, :cond_0

    monitor-exit v0

    const/4 p0, 0x0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    invoke-direct {p0, p2, p3}, LQ3/c;->i0(ILandroid/os/IInterface;)V

    monitor-exit v0

    const/4 p0, 0x1

    :goto_0
    return p0

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method static bridge synthetic h0(LQ3/c;)Z
    .locals 2

    .prologue
    iget-boolean v0, p0, LQ3/c;->A:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LQ3/c;->E()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, LQ3/c;->B()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    :try_start_0
    invoke-virtual {p0}, LQ3/c;->E()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v1, 0x1

    :catch_0
    :goto_0
    return v1
.end method

.method private final i0(ILandroid/os/IInterface;)V
    .locals 12

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x4

    if-eq p1, v2, :cond_0

    move v3, v0

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    if-nez p2, :cond_1

    move v4, v0

    goto :goto_1

    :cond_1
    move v4, v1

    :goto_1
    if-ne v3, v4, :cond_2

    move v0, v1

    :cond_2
    invoke-static {v0}, LQ3/p;->a(Z)V

    iget-object v0, p0, LQ3/c;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput p1, p0, LQ3/c;->t:I

    iput-object p2, p0, LQ3/c;->q:Landroid/os/IInterface;

    const/4 v3, 0x0

    if-eq p1, v1, :cond_9

    const/4 v1, 0x2

    const/4 v4, 0x3

    if-eq p1, v1, :cond_4

    if-eq p1, v4, :cond_4

    if-eq p1, v2, :cond_3

    goto/16 :goto_4

    :cond_3
    invoke-static {p2}, LQ3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, p2}, LQ3/c;->K(Landroid/os/IInterface;)V

    goto/16 :goto_4

    :catchall_0
    move-exception p1

    goto/16 :goto_5

    :cond_4
    iget-object v9, p0, LQ3/c;->s:LQ3/e0;

    if-eqz v9, :cond_5

    iget-object p1, p0, LQ3/c;->g:LQ3/s0;

    if-eqz p1, :cond_5

    const-string p2, "GmsClient"

    invoke-virtual {p1}, LQ3/s0;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, LQ3/s0;->a()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Calling connect() while still connected, missing disconnect() for "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " on "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    nop

    iget-object v5, p0, LQ3/c;->j:LQ3/h;

    iget-object p1, p0, LQ3/c;->g:LQ3/s0;

    invoke-virtual {p1}, LQ3/s0;->b()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, LQ3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, LQ3/c;->g:LQ3/s0;

    invoke-virtual {p1}, LQ3/s0;->a()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0}, LQ3/c;->X()Ljava/lang/String;

    move-result-object v10

    iget-object p1, p0, LQ3/c;->g:LQ3/s0;

    invoke-virtual {p1}, LQ3/s0;->c()Z

    move-result v11

    const/16 v8, 0x1081

    invoke-virtual/range {v5 .. v11}, LQ3/h;->d(Ljava/lang/String;Ljava/lang/String;ILandroid/content/ServiceConnection;Ljava/lang/String;Z)V

    iget-object p1, p0, LQ3/c;->C:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    :cond_5
    new-instance p1, LQ3/e0;

    iget-object p2, p0, LQ3/c;->C:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p2

    invoke-direct {p1, p0, p2}, LQ3/e0;-><init>(LQ3/c;I)V

    iput-object p1, p0, LQ3/c;->s:LQ3/e0;

    iget p2, p0, LQ3/c;->t:I

    if-ne p2, v4, :cond_6

    invoke-virtual {p0}, LQ3/c;->B()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_6

    new-instance p2, LQ3/s0;

    invoke-virtual {p0}, LQ3/c;->y()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, LQ3/c;->B()Ljava/lang/String;

    move-result-object v6

    const/16 v8, 0x1081

    const/4 v9, 0x0

    const/4 v7, 0x1

    move-object v4, p2

    invoke-direct/range {v4 .. v9}, LQ3/s0;-><init>(Ljava/lang/String;Ljava/lang/String;ZIZ)V

    goto :goto_2

    :cond_6
    new-instance p2, LQ3/s0;

    invoke-virtual {p0}, LQ3/c;->G()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, LQ3/c;->F()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, LQ3/c;->I()Z

    move-result v9

    const/4 v7, 0x0

    const/16 v8, 0x1081

    move-object v4, p2

    invoke-direct/range {v4 .. v9}, LQ3/s0;-><init>(Ljava/lang/String;Ljava/lang/String;ZIZ)V

    :goto_2
    iput-object p2, p0, LQ3/c;->g:LQ3/s0;

    invoke-virtual {p2}, LQ3/s0;->c()Z

    move-result p2

    if-eqz p2, :cond_8

    invoke-virtual {p0}, LQ3/c;->l()I

    move-result p2

    const v1, 0x1110e58

    if-lt p2, v1, :cond_7

    goto :goto_3

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    iget-object p2, p0, LQ3/c;->g:LQ3/s0;

    invoke-virtual {p2}, LQ3/s0;->b()Ljava/lang/String;

    move-result-object p2

    const-string v1, "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: "

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    :goto_3
    iget-object p2, p0, LQ3/c;->j:LQ3/h;

    iget-object v1, p0, LQ3/c;->g:LQ3/s0;

    invoke-virtual {v1}, LQ3/s0;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LQ3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, LQ3/c;->g:LQ3/s0;

    invoke-virtual {v2}, LQ3/s0;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, LQ3/c;->X()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, LQ3/c;->g:LQ3/s0;

    invoke-virtual {v5}, LQ3/s0;->c()Z

    move-result v5

    invoke-virtual {p0}, LQ3/c;->w()Ljava/util/concurrent/Executor;

    move-result-object v6

    new-instance v7, LQ3/l0;

    const/16 v8, 0x1081

    invoke-direct {v7, v1, v2, v8, v5}, LQ3/l0;-><init>(Ljava/lang/String;Ljava/lang/String;IZ)V

    invoke-virtual {p2, v7, p1, v4, v6}, LQ3/h;->e(LQ3/l0;Landroid/content/ServiceConnection;Ljava/lang/String;Ljava/util/concurrent/Executor;)Z

    move-result p1

    if-nez p1, :cond_a

    const-string p1, "GmsClient"

    iget-object p2, p0, LQ3/c;->g:LQ3/s0;

    invoke-virtual {p2}, LQ3/s0;->b()Ljava/lang/String;

    move-result-object p2

    iget-object v1, p0, LQ3/c;->g:LQ3/s0;

    invoke-virtual {v1}, LQ3/s0;->a()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "unable to connect to service: "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " on "

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    nop

    iget-object p1, p0, LQ3/c;->C:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p1

    const/16 p2, 0x10

    invoke-virtual {p0, p2, v3, p1}, LQ3/c;->e0(ILandroid/os/Bundle;I)V

    goto :goto_4

    :cond_9
    iget-object v8, p0, LQ3/c;->s:LQ3/e0;

    if-eqz v8, :cond_a

    iget-object v4, p0, LQ3/c;->j:LQ3/h;

    iget-object p1, p0, LQ3/c;->g:LQ3/s0;

    invoke-virtual {p1}, LQ3/s0;->b()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, LQ3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, LQ3/c;->g:LQ3/s0;

    invoke-virtual {p1}, LQ3/s0;->a()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, LQ3/c;->X()Ljava/lang/String;

    move-result-object v9

    iget-object p1, p0, LQ3/c;->g:LQ3/s0;

    invoke-virtual {p1}, LQ3/s0;->c()Z

    move-result v10

    const/16 v7, 0x1081

    invoke-virtual/range {v4 .. v10}, LQ3/h;->d(Ljava/lang/String;Ljava/lang/String;ILandroid/content/ServiceConnection;Ljava/lang/String;Z)V

    iput-object v3, p0, LQ3/c;->s:LQ3/e0;

    :cond_a
    :goto_4
    monitor-exit v0

    return-void

    :goto_5
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method


# virtual methods
.method protected A()Landroid/os/Bundle;
    .locals 1

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    return-object v0
.end method

.method protected B()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method protected C()Ljava/util/Set;
    .locals 1

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final D()Landroid/os/IInterface;
    .locals 3

    .prologue
    iget-object v0, p0, LQ3/c;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, LQ3/c;->t:I

    const/4 v2, 0x5

    if-eq v1, v2, :cond_0

    invoke-virtual {p0}, LQ3/c;->r()V

    iget-object v1, p0, LQ3/c;->q:Landroid/os/IInterface;

    const-string v2, "Client is connected but service is null"

    invoke-static {v1, v2}, LQ3/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    new-instance v1, Landroid/os/DeadObjectException;

    invoke-direct {v1}, Landroid/os/DeadObjectException;-><init>()V

    throw v1

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method protected abstract E()Ljava/lang/String;
.end method

.method protected abstract F()Ljava/lang/String;
.end method

.method protected G()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms"

    return-object v0
.end method

.method public H()LQ3/e;
    .locals 1

    .prologue
    iget-object v0, p0, LQ3/c;->B:LQ3/h0;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, v0, LQ3/h0;->F:LQ3/e;

    return-object v0
.end method

.method protected I()Z
    .locals 2

    .prologue
    invoke-virtual {p0}, LQ3/c;->l()I

    move-result v0

    const v1, 0xc9e4920

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public J()Z
    .locals 1

    .prologue
    iget-object v0, p0, LQ3/c;->B:LQ3/h0;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method protected K(Landroid/os/IInterface;)V
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, LQ3/c;->c:J

    return-void
.end method

.method protected L(LN3/b;)V
    .locals 2

    invoke-virtual {p1}, LN3/b;->e()I

    move-result p1

    iput p1, p0, LQ3/c;->d:I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, LQ3/c;->e:J

    return-void
.end method

.method protected M(I)V
    .locals 2

    iput p1, p0, LQ3/c;->a:I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, LQ3/c;->b:J

    return-void
.end method

.method protected N(ILandroid/os/IBinder;Landroid/os/Bundle;I)V
    .locals 1

    new-instance v0, LQ3/f0;

    invoke-direct {v0, p0, p1, p2, p3}, LQ3/f0;-><init>(LQ3/c;ILandroid/os/IBinder;Landroid/os/Bundle;)V

    iget-object p1, p0, LQ3/c;->l:Landroid/os/Handler;

    const/4 p2, 0x1

    const/4 p3, -0x1

    invoke-virtual {p1, p2, p4, p3, v0}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    iget-object p2, p0, LQ3/c;->l:Landroid/os/Handler;

    invoke-virtual {p2, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public O()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public P(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LQ3/c;->y:Ljava/lang/String;

    return-void
.end method

.method public Q(I)V
    .locals 3

    iget-object v0, p0, LQ3/c;->C:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    iget-object v1, p0, LQ3/c;->l:Landroid/os/Handler;

    const/4 v2, 0x6

    invoke-virtual {v1, v2, v0, p1}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object p1

    iget-object v0, p0, LQ3/c;->l:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method protected R(LQ3/c$c;ILandroid/app/PendingIntent;)V
    .locals 2

    const-string v0, "Connection progress callbacks cannot be null."

    invoke-static {p1, v0}, LQ3/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, LQ3/c;->p:LQ3/c$c;

    iget-object p1, p0, LQ3/c;->C:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p1

    iget-object v0, p0, LQ3/c;->l:Landroid/os/Handler;

    const/4 v1, 0x3

    invoke-virtual {v0, v1, p1, p2, p3}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    iget-object p2, p0, LQ3/c;->l:Landroid/os/Handler;

    invoke-virtual {p2, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public S()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected final X()Ljava/lang/String;
    .locals 1

    .prologue
    iget-object v0, p0, LQ3/c;->x:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, LQ3/c;->h:Landroid/content/Context;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public c(LQ3/c$c;)V
    .locals 1

    const-string v0, "Connection progress callbacks cannot be null."

    invoke-static {p1, v0}, LQ3/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, LQ3/c;->p:LQ3/c$c;

    const/4 p1, 0x2

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LQ3/c;->i0(ILandroid/os/IInterface;)V

    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LQ3/c;->f:Ljava/lang/String;

    invoke-virtual {p0}, LQ3/c;->h()V

    return-void
.end method

.method public e()Z
    .locals 4

    .prologue
    iget-object v0, p0, LQ3/c;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, LQ3/c;->t:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eq v1, v2, :cond_1

    const/4 v2, 0x3

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :cond_1
    :goto_0
    monitor-exit v0

    return v3

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method protected final e0(ILandroid/os/Bundle;I)V
    .locals 2

    new-instance p2, LQ3/g0;

    const/4 v0, 0x0

    invoke-direct {p2, p0, p1, v0}, LQ3/g0;-><init>(LQ3/c;ILandroid/os/Bundle;)V

    iget-object p1, p0, LQ3/c;->l:Landroid/os/Handler;

    const/4 v0, 0x7

    const/4 v1, -0x1

    invoke-virtual {p1, v0, p3, v1, p2}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    iget-object p2, p0, LQ3/c;->l:Landroid/os/Handler;

    invoke-virtual {p2, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public f()Ljava/lang/String;
    .locals 2

    .prologue
    invoke-virtual {p0}, LQ3/c;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LQ3/c;->g:LQ3/s0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LQ3/s0;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Failed to connect when checking package"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public g(LQ3/c$e;)V
    .locals 0

    invoke-interface {p1}, LQ3/c$e;->a()V

    return-void
.end method

.method public h()V
    .locals 4

    .prologue
    iget-object v0, p0, LQ3/c;->C:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    iget-object v0, p0, LQ3/c;->r:Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LQ3/c;->r:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    iget-object v3, p0, LQ3/c;->r:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LQ3/c0;

    invoke-virtual {v3}, LQ3/c0;->d()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    iget-object v1, p0, LQ3/c;->r:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, LQ3/c;->n:Ljava/lang/Object;

    monitor-enter v1

    const/4 v0, 0x0

    :try_start_1
    iput-object v0, p0, LQ3/c;->o:LQ3/l;

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/4 v1, 0x1

    invoke-direct {p0, v1, v0}, LQ3/c;->i0(ILandroid/os/IInterface;)V

    return-void

    :catchall_1
    move-exception v0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0

    :goto_1
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v1
.end method

.method public i(LQ3/j;Ljava/util/Set;)V
    .locals 21

    .prologue
    move-object/from16 v1, p0

    move-object/from16 v0, p2

    invoke-virtual/range {p0 .. p0}, LQ3/c;->A()Landroid/os/Bundle;

    move-result-object v2

    new-instance v15, LQ3/f;

    iget-object v14, v1, LQ3/c;->y:Ljava/lang/String;

    sget v6, LN3/h;->a:I

    sget-object v9, LQ3/f;->Q:[Lcom/google/android/gms/common/api/Scope;

    new-instance v10, Landroid/os/Bundle;

    invoke-direct {v10}, Landroid/os/Bundle;-><init>()V

    iget v5, v1, LQ3/c;->w:I

    sget-object v13, LQ3/f;->R:[LN3/d;

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/4 v4, 0x6

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/16 v18, 0x1

    move-object v3, v15

    move-object v12, v13

    move-object/from16 v19, v14

    move/from16 v14, v18

    move-object/from16 v20, v15

    move/from16 v15, v16

    move/from16 v16, v17

    move-object/from16 v17, v19

    invoke-direct/range {v3 .. v17}, LQ3/f;-><init>(IIILjava/lang/String;Landroid/os/IBinder;[Lcom/google/android/gms/common/api/Scope;Landroid/os/Bundle;Landroid/accounts/Account;[LN3/d;[LN3/d;ZIZLjava/lang/String;)V

    iget-object v3, v1, LQ3/c;->h:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v4, v20

    iput-object v3, v4, LQ3/f;->F:Ljava/lang/String;

    iput-object v2, v4, LQ3/f;->I:Landroid/os/Bundle;

    if-eqz v0, :cond_0

    const/4 v2, 0x0

    new-array v2, v2, [Lcom/google/android/gms/common/api/Scope;

    invoke-interface {v0, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/common/api/Scope;

    iput-object v0, v4, LQ3/f;->H:[Lcom/google/android/gms/common/api/Scope;

    :cond_0
    invoke-virtual/range {p0 .. p0}, LQ3/c;->o()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual/range {p0 .. p0}, LQ3/c;->u()Landroid/accounts/Account;

    move-result-object v0

    if-nez v0, :cond_1

    new-instance v0, Landroid/accounts/Account;

    const-string v2, "<<default account>>"

    const-string v3, "com.google"

    invoke-direct {v0, v2, v3}, Landroid/accounts/Account;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    iput-object v0, v4, LQ3/f;->J:Landroid/accounts/Account;

    if-eqz p1, :cond_3

    invoke-interface/range {p1 .. p1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    iput-object v0, v4, LQ3/f;->G:Landroid/os/IBinder;

    goto :goto_0

    :cond_2
    invoke-virtual/range {p0 .. p0}, LQ3/c;->O()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual/range {p0 .. p0}, LQ3/c;->u()Landroid/accounts/Account;

    move-result-object v0

    iput-object v0, v4, LQ3/f;->J:Landroid/accounts/Account;

    :cond_3
    :goto_0
    sget-object v0, LQ3/c;->E:[LN3/d;

    iput-object v0, v4, LQ3/f;->K:[LN3/d;

    invoke-virtual/range {p0 .. p0}, LQ3/c;->v()[LN3/d;

    move-result-object v0

    iput-object v0, v4, LQ3/f;->L:[LN3/d;

    invoke-virtual/range {p0 .. p0}, LQ3/c;->S()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x1

    iput-boolean v0, v4, LQ3/f;->O:Z

    :cond_4
    :try_start_0
    iget-object v2, v1, LQ3/c;->n:Ljava/lang/Object;

    monitor-enter v2
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v0, v1, LQ3/c;->o:LQ3/l;

    if-eqz v0, :cond_5

    new-instance v3, LQ3/d0;

    iget-object v5, v1, LQ3/c;->C:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v5

    invoke-direct {v3, v1, v5}, LQ3/d0;-><init>(LQ3/c;I)V

    invoke-interface {v0, v3, v4}, LQ3/l;->k4(LQ3/k;LQ3/f;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_5
    const-string v0, "GmsClient"

    const-string v3, "mServiceBroker is null, client disconnected"

    nop

    :goto_1
    monitor-exit v2

    return-void

    :goto_2
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v0
    :try_end_2
    .catch Landroid/os/DeadObjectException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception v0

    goto :goto_3

    :catch_1
    move-exception v0

    goto :goto_3

    :catch_2
    move-exception v0

    goto :goto_4

    :catch_3
    move-exception v0

    goto :goto_5

    :goto_3
    const-string v2, "GmsClient"

    const-string v3, "IGmsServiceBroker.getService failed"

    nop

    iget-object v0, v1, LQ3/c;->C:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    const/16 v2, 0x8

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v3, v0}, LQ3/c;->N(ILandroid/os/IBinder;Landroid/os/Bundle;I)V

    return-void

    :goto_4
    throw v0

    :goto_5
    const-string v2, "GmsClient"

    const-string v3, "IGmsServiceBroker.getService failed"

    nop

    const/4 v0, 0x3

    invoke-virtual {v1, v0}, LQ3/c;->Q(I)V

    return-void
.end method

.method public j()Z
    .locals 3

    .prologue
    iget-object v0, p0, LQ3/c;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, LQ3/c;->t:I

    const/4 v2, 0x4

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public k()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public l()I
    .locals 1

    sget v0, LN3/h;->a:I

    return v0
.end method

.method public final m()[LN3/d;
    .locals 1

    .prologue
    iget-object v0, p0, LQ3/c;->B:LQ3/h0;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, v0, LQ3/h0;->D:[LN3/d;

    return-object v0
.end method

.method public n()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LQ3/c;->f:Ljava/lang/String;

    return-object v0
.end method

.method public o()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public q()V
    .locals 3

    .prologue
    iget-object v0, p0, LQ3/c;->k:LN3/h;

    iget-object v1, p0, LQ3/c;->h:Landroid/content/Context;

    invoke-virtual {p0}, LQ3/c;->l()I

    move-result v2

    invoke-virtual {v0, v1, v2}, LN3/h;->h(Landroid/content/Context;I)I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {p0, v1, v2}, LQ3/c;->i0(ILandroid/os/IInterface;)V

    new-instance v1, LQ3/c$d;

    invoke-direct {v1, p0}, LQ3/c$d;-><init>(LQ3/c;)V

    invoke-virtual {p0, v1, v0, v2}, LQ3/c;->R(LQ3/c$c;ILandroid/app/PendingIntent;)V

    return-void

    :cond_0
    new-instance v0, LQ3/c$d;

    invoke-direct {v0, p0}, LQ3/c$d;-><init>(LQ3/c;)V

    invoke-virtual {p0, v0}, LQ3/c;->c(LQ3/c$c;)V

    return-void
.end method

.method protected final r()V
    .locals 2

    .prologue
    invoke-virtual {p0}, LQ3/c;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not connected. Call connect() and wait for onConnected() to be called."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected abstract s(Landroid/os/IBinder;)Landroid/os/IInterface;
.end method

.method protected t()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public u()Landroid/accounts/Account;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public v()[LN3/d;
    .locals 1

    sget-object v0, LQ3/c;->E:[LN3/d;

    return-object v0
.end method

.method protected w()Ljava/util/concurrent/Executor;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public x()Landroid/os/Bundle;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final y()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, LQ3/c;->h:Landroid/content/Context;

    return-object v0
.end method

.method public z()I
    .locals 1

    iget v0, p0, LQ3/c;->w:I

    return v0
.end method
