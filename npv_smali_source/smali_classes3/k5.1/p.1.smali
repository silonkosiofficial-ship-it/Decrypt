.class Lk5/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final t:Ljava/io/FilenameFilter;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lk5/C;

.field private final c:Lk5/x;

.field private final d:Lm5/n;

.field private final e:Ll5/f;

.field private final f:Lk5/H;

.field private final g:Lq5/g;

.field private final h:Lk5/a;

.field private final i:Lm5/e;

.field private final j:Lh5/a;

.field private final k:Li5/a;

.field private final l:Lk5/m;

.field private final m:Lk5/Z;

.field private n:Lk5/A;

.field private o:Ls5/j;

.field final p:Ll4/m;

.field final q:Ll4/m;

.field final r:Ll4/m;

.field final s:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lk5/o;

    invoke-direct {v0}, Lk5/o;-><init>()V

    sput-object v0, Lk5/p;->t:Ljava/io/FilenameFilter;

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Lk5/H;Lk5/C;Lq5/g;Lk5/x;Lk5/a;Lm5/n;Lm5/e;Lk5/Z;Lh5/a;Li5/a;Lk5/m;Ll5/f;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lk5/p;->o:Ls5/j;

    new-instance v0, Ll4/m;

    invoke-direct {v0}, Ll4/m;-><init>()V

    iput-object v0, p0, Lk5/p;->p:Ll4/m;

    new-instance v0, Ll4/m;

    invoke-direct {v0}, Ll4/m;-><init>()V

    iput-object v0, p0, Lk5/p;->q:Ll4/m;

    new-instance v0, Ll4/m;

    invoke-direct {v0}, Ll4/m;-><init>()V

    iput-object v0, p0, Lk5/p;->r:Ll4/m;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lk5/p;->s:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p1, p0, Lk5/p;->a:Landroid/content/Context;

    iput-object p2, p0, Lk5/p;->f:Lk5/H;

    iput-object p3, p0, Lk5/p;->b:Lk5/C;

    iput-object p4, p0, Lk5/p;->g:Lq5/g;

    iput-object p5, p0, Lk5/p;->c:Lk5/x;

    iput-object p6, p0, Lk5/p;->h:Lk5/a;

    iput-object p7, p0, Lk5/p;->d:Lm5/n;

    iput-object p8, p0, Lk5/p;->i:Lm5/e;

    iput-object p10, p0, Lk5/p;->j:Lh5/a;

    iput-object p11, p0, Lk5/p;->k:Li5/a;

    iput-object p12, p0, Lk5/p;->l:Lk5/m;

    iput-object p9, p0, Lk5/p;->m:Lk5/Z;

    iput-object p13, p0, Lk5/p;->e:Ll5/f;

    return-void
.end method

.method private A()Ljava/lang/String;
    .locals 2

    .prologue
    iget-object v0, p0, Lk5/p;->m:Lk5/Z;

    invoke-virtual {v0}, Lk5/Z;->r()Ljava/util/SortedSet;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {v0}, Ljava/util/SortedSet;->first()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method private static B()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lk5/p;->E(J)J

    move-result-wide v0

    return-wide v0
.end method

.method static C(Lh5/h;Ljava/lang/String;Lq5/g;[B)Ljava/util/List;
    .locals 6

    const-string v0, "user-data"

    invoke-virtual {p2, p1, v0}, Lq5/g;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    const-string v1, "keys"

    invoke-virtual {p2, p1, v1}, Lq5/g;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    const-string v3, "rollouts-state"

    invoke-virtual {p2, p1, v3}, Lq5/g;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    new-instance v3, Lk5/g;

    const-string v4, "logs_file"

    const-string v5, "logs"

    invoke-direct {v3, v4, v5, p3}, Lk5/g;-><init>(Ljava/lang/String;Ljava/lang/String;[B)V

    invoke-interface {p2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p3, Lk5/F;

    invoke-interface {p0}, Lh5/h;->g()Ljava/io/File;

    move-result-object v3

    const-string v4, "crash_meta_file"

    const-string v5, "metadata"

    invoke-direct {p3, v4, v5, v3}, Lk5/F;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p3, Lk5/F;

    const-string v3, "session"

    invoke-interface {p0}, Lh5/h;->f()Ljava/io/File;

    move-result-object v4

    const-string v5, "session_meta_file"

    invoke-direct {p3, v5, v3, v4}, Lk5/F;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p3, Lk5/F;

    const-string v3, "app"

    invoke-interface {p0}, Lh5/h;->a()Ljava/io/File;

    move-result-object v4

    const-string v5, "app_meta_file"

    invoke-direct {p3, v5, v3, v4}, Lk5/F;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p3, Lk5/F;

    const-string v3, "device"

    invoke-interface {p0}, Lh5/h;->c()Ljava/io/File;

    move-result-object v4

    const-string v5, "device_meta_file"

    invoke-direct {p3, v5, v3, v4}, Lk5/F;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p3, Lk5/F;

    const-string v3, "os"

    invoke-interface {p0}, Lh5/h;->b()Ljava/io/File;

    move-result-object v4

    const-string v5, "os_meta_file"

    invoke-direct {p3, v5, v3, v4}, Lk5/F;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {p0}, Lk5/p;->P(Lh5/h;)Lk5/K;

    move-result-object p0

    invoke-interface {p2, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p0, Lk5/F;

    const-string p3, "user_meta_file"

    const-string v3, "user"

    invoke-direct {p0, p3, v3, v0}, Lk5/F;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    invoke-interface {p2, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p0, Lk5/F;

    const-string p3, "keys_file"

    invoke-direct {p0, p3, v1, v2}, Lk5/F;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    invoke-interface {p2, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p0, Lk5/F;

    const-string p3, "rollouts_file"

    const-string v0, "rollouts"

    invoke-direct {p0, p3, v0, p1}, Lk5/F;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    invoke-interface {p2, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p2
.end method

.method private D(Ljava/lang/String;)Ljava/io/InputStream;
    .locals 2

    .prologue
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object p1

    const-string v0, "Couldn\'t get Class Loader"

    invoke-virtual {p1, v0}, Lh5/g;->k(Ljava/lang/String;)V

    return-object v1

    :cond_0
    invoke-static {v0, p1}, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication;->zqubf(Ljava/lang/Object;Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p1

    if-nez p1, :cond_1

    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object p1

    const-string v0, "No version control information found"

    invoke-virtual {p1, v0}, Lh5/g;->g(Ljava/lang/String;)V

    return-object v1

    :cond_1
    return-object p1
.end method

.method private static E(J)J
    .locals 2

    const-wide/16 v0, 0x3e8

    div-long/2addr p0, v0

    return-wide p0
.end method

.method private synthetic J(Ljava/lang/String;)V
    .locals 1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {p0, p1, v0}, Lk5/p;->u(Ljava/lang/String;Ljava/lang/Boolean;)V

    return-void
.end method

.method private static synthetic K(Ljava/io/File;Ljava/lang/String;)Z
    .locals 0

    const-string p0, ".ae"

    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private M(J)Ll4/l;
    .locals 2

    .prologue
    invoke-static {}, Lk5/p;->z()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object p1

    const-string p2, "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists"

    invoke-virtual {p1, p2}, Lh5/g;->k(Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-static {p1}, Ll4/o;->e(Ljava/lang/Object;)Ll4/l;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v0

    const-string v1, "Logging app exception event to Firebase Analytics"

    invoke-virtual {v0, v1}, Lh5/g;->b(Ljava/lang/String;)V

    new-instance v0, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(I)V

    new-instance v1, Lk5/p$e;

    invoke-direct {v1, p0, p1, p2}, Lk5/p$e;-><init>(Lk5/p;J)V

    invoke-static {v0, v1}, Ll4/o;->c(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Ll4/l;

    move-result-object p1

    return-object p1
.end method

.method private N()Ll4/l;
    .locals 6

    .prologue
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lk5/p;->L()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/io/File;

    :try_start_0
    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x3

    invoke-virtual {v3, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v3

    invoke-direct {p0, v3, v4}, Lk5/p;->M(J)Ll4/l;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Could not parse app exception timestamp from file "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lh5/g;->k(Ljava/lang/String;)V

    :goto_1
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ll4/o;->f(Ljava/util/Collection;)Ll4/l;

    move-result-object v0

    return-object v0
.end method

.method private static O(Ljava/lang/String;Ljava/io/File;Ln5/F$a;)Z
    .locals 3

    .prologue
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No minidump data found for session "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lh5/g;->k(Ljava/lang/String;)V

    :cond_1
    if-nez p2, :cond_2

    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No Tombstones data found for session "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lh5/g;->g(Ljava/lang/String;)V

    :cond_2
    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result p0

    if-nez p0, :cond_4

    :cond_3
    if-nez p2, :cond_4

    const/4 p0, 0x1

    goto :goto_0

    :cond_4
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static P(Lh5/h;)Lk5/K;
    .locals 4

    .prologue
    const/4 v0, 0x0

    invoke-interface {p0}, Lh5/h;->e()Ljava/io/File;

    move-result-object p0

    const-string v1, "minidump"

    const-string v2, "minidump_file"

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lk5/F;

    invoke-direct {v0, v2, v1, p0}, Lk5/F;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    goto :goto_1

    :cond_1
    :goto_0
    new-instance p0, Lk5/g;

    const/4 v3, 0x1

    new-array v3, v3, [B

    aput-byte v0, v3, v0

    invoke-direct {p0, v2, v1, v3}, Lk5/g;-><init>(Ljava/lang/String;Ljava/lang/String;[B)V

    move-object v0, p0

    :goto_1
    return-object v0
.end method

.method private static R(Ljava/io/InputStream;)[B
    .locals 4

    .prologue
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/16 v1, 0x400

    new-array v1, v1, [B

    :goto_0
    invoke-virtual {p0, v1}, Ljava/io/InputStream;->read([B)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    return-object p0
.end method

.method private V()Ll4/l;
    .locals 3

    .prologue
    iget-object v0, p0, Lk5/p;->b:Lk5/C;

    invoke-virtual {v0}, Lk5/C;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v0

    const-string v1, "Automatic data collection is enabled. Allowing upload."

    invoke-virtual {v0, v1}, Lh5/g;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lk5/p;->p:Ll4/m;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ll4/m;->e(Ljava/lang/Object;)Z

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0}, Ll4/o;->e(Ljava/lang/Object;)Ll4/l;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v0

    const-string v1, "Automatic data collection is disabled."

    invoke-virtual {v0, v1}, Lh5/g;->b(Ljava/lang/String;)V

    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v0

    const-string v1, "Notifying that unsent reports are available."

    invoke-virtual {v0, v1}, Lh5/g;->i(Ljava/lang/String;)V

    iget-object v0, p0, Lk5/p;->p:Ll4/m;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ll4/m;->e(Ljava/lang/Object;)Z

    iget-object v0, p0, Lk5/p;->b:Lk5/C;

    invoke-virtual {v0}, Lk5/C;->h()Ll4/l;

    move-result-object v0

    new-instance v1, Lk5/p$c;

    invoke-direct {v1, p0}, Lk5/p$c;-><init>(Lk5/p;)V

    invoke-virtual {v0, v1}, Ll4/l;->q(Ll4/k;)Ll4/l;

    move-result-object v0

    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v1

    const-string v2, "Waiting for send/deleteUnsentReports to be called."

    invoke-virtual {v1, v2}, Lh5/g;->b(Ljava/lang/String;)V

    iget-object v1, p0, Lk5/p;->q:Ll4/m;

    invoke-virtual {v1}, Ll4/m;->a()Ll4/l;

    move-result-object v1

    invoke-static {v0, v1}, Ll5/b;->c(Ll4/l;Ll4/l;)Ll4/l;

    move-result-object v0

    return-object v0
.end method

.method private W(Ljava/lang/String;)V
    .locals 4

    .prologue
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lk5/p;->a:Landroid/content/Context;

    const-string v1, "activity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2, v2}, LR2/c;->a(Landroid/app/ActivityManager;Ljava/lang/String;II)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Lm5/e;

    iget-object v2, p0, Lk5/p;->g:Lq5/g;

    invoke-direct {v1, v2, p1}, Lm5/e;-><init>(Lq5/g;Ljava/lang/String;)V

    iget-object v2, p0, Lk5/p;->g:Lq5/g;

    iget-object v3, p0, Lk5/p;->e:Ll5/f;

    invoke-static {p1, v2, v3}, Lm5/n;->l(Ljava/lang/String;Lq5/g;Ll5/f;)Lm5/n;

    move-result-object v2

    iget-object v3, p0, Lk5/p;->m:Lk5/Z;

    invoke-virtual {v3, p1, v0, v1, v2}, Lk5/Z;->w(Ljava/lang/String;Ljava/util/List;Lm5/e;Lm5/n;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No ApplicationExitInfo available. Session: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lh5/g;->i(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ANR feature enabled, but device is API "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lh5/g;->i(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public static synthetic a(Ljava/io/File;Ljava/lang/String;)Z
    .locals 0

    invoke-static {p0, p1}, Lk5/p;->K(Ljava/io/File;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Lk5/p;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lk5/p;->J(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic c(J)J
    .locals 0

    invoke-static {p0, p1}, Lk5/p;->E(J)J

    move-result-wide p0

    return-wide p0
.end method

.method static synthetic d(Lk5/p;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0}, Lk5/p;->A()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic e(Lk5/p;)Li5/a;
    .locals 0

    iget-object p0, p0, Lk5/p;->k:Li5/a;

    return-object p0
.end method

.method static synthetic f(Lk5/p;)Lk5/x;
    .locals 0

    iget-object p0, p0, Lk5/p;->c:Lk5/x;

    return-object p0
.end method

.method static synthetic g(Lk5/p;)Lk5/Z;
    .locals 0

    iget-object p0, p0, Lk5/p;->m:Lk5/Z;

    return-object p0
.end method

.method static synthetic h(Lk5/p;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lk5/p;->v(J)V

    return-void
.end method

.method static synthetic i(Lk5/p;Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lk5/p;->u(Ljava/lang/String;Ljava/lang/Boolean;)V

    return-void
.end method

.method static synthetic j(Lk5/p;)Lk5/C;
    .locals 0

    iget-object p0, p0, Lk5/p;->b:Lk5/C;

    return-object p0
.end method

.method static synthetic k(Lk5/p;)Ll5/f;
    .locals 0

    iget-object p0, p0, Lk5/p;->e:Ll5/f;

    return-object p0
.end method

.method static synthetic l(Lk5/p;)Ll4/l;
    .locals 0

    invoke-direct {p0}, Lk5/p;->N()Ll4/l;

    move-result-object p0

    return-object p0
.end method

.method static synthetic m(Ljava/util/List;)V
    .locals 0

    invoke-static {p0}, Lk5/p;->q(Ljava/util/List;)V

    return-void
.end method

.method private static n(Lk5/H;Lk5/a;)Ln5/G$a;
    .locals 6

    invoke-virtual {p0}, Lk5/H;->f()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p1, Lk5/a;->f:Ljava/lang/String;

    iget-object v2, p1, Lk5/a;->g:Ljava/lang/String;

    invoke-virtual {p0}, Lk5/H;->a()Lk5/I$a;

    move-result-object p0

    invoke-virtual {p0}, Lk5/I$a;->c()Ljava/lang/String;

    move-result-object v3

    iget-object p0, p1, Lk5/a;->d:Ljava/lang/String;

    invoke-static {p0}, Lk5/D;->g(Ljava/lang/String;)Lk5/D;

    move-result-object p0

    invoke-virtual {p0}, Lk5/D;->i()I

    move-result v4

    iget-object v5, p1, Lk5/a;->h:Lh5/f;

    invoke-static/range {v0 .. v5}, Ln5/G$a;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILh5/f;)Ln5/G$a;

    move-result-object p0

    return-object p0
.end method

.method private static o(Landroid/content/Context;)Ln5/G$b;
    .locals 16

    new-instance v0, Landroid/os/StatFs;

    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockCount()I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockSize()I

    move-result v0

    int-to-long v3, v0

    mul-long v10, v1, v3

    invoke-static {}, Lk5/i;->k()I

    move-result v5

    sget-object v6, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v7

    invoke-static/range {p0 .. p0}, Lk5/i;->b(Landroid/content/Context;)J

    move-result-wide v8

    invoke-static {}, Lk5/i;->w()Z

    move-result v12

    invoke-static {}, Lk5/i;->l()I

    move-result v13

    sget-object v14, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    sget-object v15, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    invoke-static/range {v5 .. v15}, Ln5/G$b;->c(ILjava/lang/String;IJJZILjava/lang/String;Ljava/lang/String;)Ln5/G$b;

    move-result-object v0

    return-object v0
.end method

.method private static p()Ln5/G$c;
    .locals 3

    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    sget-object v1, Landroid/os/Build$VERSION;->CODENAME:Ljava/lang/String;

    invoke-static {}, Lk5/i;->x()Z

    move-result v2

    invoke-static {v0, v1, v2}, Ln5/G$c;->a(Ljava/lang/String;Ljava/lang/String;Z)Ln5/G$c;

    move-result-object v0

    return-object v0
.end method

.method private static q(Ljava/util/List;)V
    .locals 1

    .prologue
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method private t(ZLs5/j;Z)V
    .locals 3

    .prologue
    invoke-static {}, Ll5/f;->c()V

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lk5/p;->m:Lk5/Z;

    invoke-virtual {v1}, Lk5/Z;->r()Ljava/util/SortedSet;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-gt v1, p1, :cond_0

    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object p1

    const-string p2, "No open sessions to be closed."

    invoke-virtual {p1, p2}, Lh5/g;->i(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz p3, :cond_1

    invoke-interface {p2}, Ls5/j;->b()Ls5/d;

    move-result-object p2

    iget-object p2, p2, Ls5/d;->b:Ls5/d$a;

    iget-boolean p2, p2, Ls5/d$a;->b:Z

    if-eqz p2, :cond_1

    invoke-direct {p0, v1}, Lk5/p;->W(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object p2

    const-string v2, "ANR feature disabled."

    invoke-virtual {p2, v2}, Lh5/g;->i(Ljava/lang/String;)V

    :goto_0
    if-eqz p3, :cond_2

    iget-object p2, p0, Lk5/p;->j:Lh5/a;

    invoke-interface {p2, v1}, Lh5/a;->d(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-direct {p0, v1}, Lk5/p;->x(Ljava/lang/String;)V

    :cond_2
    if-eqz p1, :cond_3

    const/4 p1, 0x0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lk5/p;->l:Lk5/m;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lk5/m;->e(Ljava/lang/String;)V

    move-object p1, p2

    :goto_1
    iget-object p2, p0, Lk5/p;->m:Lk5/Z;

    invoke-static {}, Lk5/p;->B()J

    move-result-wide v0

    invoke-virtual {p2, v0, v1, p1}, Lk5/Z;->l(JLjava/lang/String;)V

    return-void
.end method

.method private u(Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 8

    .prologue
    invoke-static {}, Lk5/p;->B()J

    move-result-wide v6

    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Opening a new session with ID "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lh5/g;->b(Ljava/lang/String;)V

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {}, Lk5/w;->k()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const-string v1, "Crashlytics Android SDK/%s"

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    iget-object v0, p0, Lk5/p;->f:Lk5/H;

    iget-object v1, p0, Lk5/p;->h:Lk5/a;

    invoke-static {v0, v1}, Lk5/p;->n(Lk5/H;Lk5/a;)Ln5/G$a;

    move-result-object v0

    invoke-static {}, Lk5/p;->p()Ln5/G$c;

    move-result-object v1

    iget-object v3, p0, Lk5/p;->a:Landroid/content/Context;

    invoke-static {v3}, Lk5/p;->o(Landroid/content/Context;)Ln5/G$b;

    move-result-object v3

    iget-object v4, p0, Lk5/p;->j:Lh5/a;

    invoke-static {v0, v1, v3}, Ln5/G;->b(Ln5/G$a;Ln5/G$c;Ln5/G$b;)Ln5/G;

    move-result-object v5

    move-object v0, v4

    move-object v1, p1

    move-wide v3, v6

    invoke-interface/range {v0 .. v5}, Lh5/a;->b(Ljava/lang/String;Ljava/lang/String;JLn5/G;)V

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_0

    if-eqz p1, :cond_0

    iget-object p2, p0, Lk5/p;->d:Lm5/n;

    invoke-virtual {p2, p1}, Lm5/n;->o(Ljava/lang/String;)V

    :cond_0
    iget-object p2, p0, Lk5/p;->i:Lm5/e;

    invoke-virtual {p2, p1}, Lm5/e;->e(Ljava/lang/String;)V

    iget-object p2, p0, Lk5/p;->l:Lk5/m;

    invoke-virtual {p2, p1}, Lk5/m;->e(Ljava/lang/String;)V

    iget-object p2, p0, Lk5/p;->m:Lk5/Z;

    invoke-virtual {p2, p1, v6, v7}, Lk5/Z;->s(Ljava/lang/String;J)V

    return-void
.end method

.method private v(J)V
    .locals 3

    .prologue
    :try_start_0
    iget-object v0, p0, Lk5/p;->g:Lq5/g;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ".ae"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lq5/g;->g(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->createNewFile()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Create new file failed."

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object p2

    const-string v0, "Could not create app exception marker file."

    invoke-virtual {p2, v0, p1}, Lh5/g;->l(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method private x(Ljava/lang/String;)V
    .locals 7

    .prologue
    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Finalizing native report for session "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lh5/g;->i(Ljava/lang/String;)V

    iget-object v0, p0, Lk5/p;->j:Lh5/a;

    invoke-interface {v0, p1}, Lh5/a;->a(Ljava/lang/String;)Lh5/h;

    move-result-object v0

    invoke-interface {v0}, Lh5/h;->e()Ljava/io/File;

    move-result-object v1

    invoke-interface {v0}, Lh5/h;->d()Ln5/F$a;

    move-result-object v2

    invoke-static {p1, v1, v2}, Lk5/p;->O(Ljava/lang/String;Ljava/io/File;Ln5/F$a;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object p1

    const-string v0, "No native core present"

    invoke-virtual {p1, v0}, Lh5/g;->k(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {v1}, Ljava/io/File;->lastModified()J

    move-result-wide v3

    new-instance v1, Lm5/e;

    iget-object v5, p0, Lk5/p;->g:Lq5/g;

    invoke-direct {v1, v5, p1}, Lm5/e;-><init>(Lq5/g;Ljava/lang/String;)V

    iget-object v5, p0, Lk5/p;->g:Lq5/g;

    invoke-virtual {v5, p1}, Lq5/g;->k(Ljava/lang/String;)Ljava/io/File;

    move-result-object v5

    invoke-virtual {v5}, Ljava/io/File;->isDirectory()Z

    move-result v6

    if-nez v6, :cond_1

    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object p1

    const-string v0, "Couldn\'t create directory to store native session files, aborting."

    invoke-virtual {p1, v0}, Lh5/g;->k(Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-direct {p0, v3, v4}, Lk5/p;->v(J)V

    iget-object v3, p0, Lk5/p;->g:Lq5/g;

    invoke-virtual {v1}, Lm5/e;->b()[B

    move-result-object v4

    invoke-static {v0, p1, v3, v4}, Lk5/p;->C(Lh5/h;Ljava/lang/String;Lq5/g;[B)Ljava/util/List;

    move-result-object v0

    invoke-static {v5, v0}, Lk5/L;->b(Ljava/io/File;Ljava/util/List;)V

    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v3

    const-string v4, "CrashlyticsController#finalizePreviousNativeSession"

    invoke-virtual {v3, v4}, Lh5/g;->b(Ljava/lang/String;)V

    iget-object v3, p0, Lk5/p;->m:Lk5/Z;

    invoke-virtual {v3, p1, v0, v2}, Lk5/Z;->k(Ljava/lang/String;Ljava/util/List;Ln5/F$a;)V

    invoke-virtual {v1}, Lm5/e;->a()V

    return-void
.end method

.method private static z()Z
    .locals 1

    .prologue
    :try_start_0
    const-string v0, "com.google.firebase.crash.FirebaseCrash"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :catch_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method F()Ljava/lang/String;
    .locals 3

    .prologue
    const-string v0, "META-INF/version-control-info.textproto"

    invoke-direct {p0, v0}, Lk5/p;->D(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v1

    const-string v2, "Read version control info"

    invoke-virtual {v1, v2}, Lh5/g;->b(Ljava/lang/String;)V

    invoke-static {v0}, Lk5/p;->R(Ljava/io/InputStream;)[B

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method G(Ls5/j;Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lk5/p;->H(Ls5/j;Ljava/lang/Thread;Ljava/lang/Throwable;Z)V

    return-void
.end method

.method declared-synchronized H(Ls5/j;Ljava/lang/Thread;Ljava/lang/Throwable;Z)V
    .locals 10

    .prologue
    monitor-enter p0

    :try_start_0
    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Handling uncaught exception \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "\" from thread "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lh5/g;->b(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-object v0, p0, Lk5/p;->e:Ll5/f;

    iget-object v0, v0, Ll5/f;->a:Ll5/e;

    new-instance v1, Lk5/p$b;

    move-object v2, v1

    move-object v3, p0

    move-object v6, p3

    move-object v7, p2

    move-object v8, p1

    move v9, p4

    invoke-direct/range {v2 .. v9}, Lk5/p$b;-><init>(Lk5/p;JLjava/lang/Throwable;Ljava/lang/Thread;Ls5/j;Z)V

    invoke-virtual {v0, v1}, Ll5/e;->h(Ljava/util/concurrent/Callable;)Ll4/l;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p4, :cond_0

    :try_start_1
    invoke-static {p1}, Lk5/c0;->b(Ll4/l;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    :try_start_2
    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object p2

    const-string p3, "Error handling uncaught exception"

    invoke-virtual {p2, p3, p1}, Lh5/g;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_1
    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object p1

    const-string p2, "Cannot send reports. Timed out while fetching settings."

    invoke-virtual {p1, p2}, Lh5/g;->d(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method I()Z
    .locals 1

    .prologue
    iget-object v0, p0, Lk5/p;->n:Lk5/A;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lk5/A;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method L()Ljava/util/List;
    .locals 2

    iget-object v0, p0, Lk5/p;->g:Lq5/g;

    sget-object v1, Lk5/p;->t:Ljava/io/FilenameFilter;

    invoke-virtual {v0, v1}, Lq5/g;->h(Ljava/io/FilenameFilter;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method Q(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lk5/p;->e:Ll5/f;

    iget-object v0, v0, Ll5/f;->a:Ll5/e;

    new-instance v1, Lk5/n;

    invoke-direct {v1, p0, p1}, Lk5/n;-><init>(Lk5/p;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ll5/e;->g(Ljava/lang/Runnable;)Ll4/l;

    return-void
.end method

.method S()V
    .locals 3

    .prologue
    :try_start_0
    invoke-virtual {p0}, Lk5/p;->F()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "com.crashlytics.version-control-info"

    invoke-virtual {p0, v1, v0}, Lk5/p;->T(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v0

    const-string v1, "Saved version control info"

    invoke-virtual {v0, v1}, Lh5/g;->g(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v1

    const-string v2, "Unable to save version control info"

    invoke-virtual {v1, v2, v0}, Lh5/g;->l(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    return-void
.end method

.method T(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    :try_start_0
    iget-object v0, p0, Lk5/p;->d:Lm5/n;

    invoke-virtual {v0, p1, p2}, Lm5/n;->n(Ljava/lang/String;Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    iget-object p2, p0, Lk5/p;->a:Landroid/content/Context;

    if-eqz p2, :cond_1

    invoke-static {p2}, Lk5/i;->u(Landroid/content/Context;)Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    throw p1

    :cond_1
    :goto_0
    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object p1

    const-string p2, "Attempting to set custom attribute with null key, ignoring."

    invoke-virtual {p1, p2}, Lh5/g;->d(Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method U(Ll4/l;)V
    .locals 3

    .prologue
    iget-object v0, p0, Lk5/p;->m:Lk5/Z;

    invoke-virtual {v0}, Lk5/Z;->o()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object p1

    const-string v0, "No crash reports are available to be sent."

    invoke-virtual {p1, v0}, Lh5/g;->i(Ljava/lang/String;)V

    iget-object p1, p0, Lk5/p;->p:Ll4/m;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Ll4/m;->e(Ljava/lang/Object;)Z

    return-void

    :cond_0
    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v0

    const-string v1, "Crash reports are available to be sent."

    invoke-virtual {v0, v1}, Lh5/g;->i(Ljava/lang/String;)V

    invoke-direct {p0}, Lk5/p;->V()Ll4/l;

    move-result-object v0

    iget-object v1, p0, Lk5/p;->e:Ll5/f;

    iget-object v1, v1, Ll5/f;->a:Ll5/e;

    new-instance v2, Lk5/p$d;

    invoke-direct {v2, p0, p1}, Lk5/p$d;-><init>(Lk5/p;Ll4/l;)V

    invoke-virtual {v0, v1, v2}, Ll4/l;->p(Ljava/util/concurrent/Executor;Ll4/k;)Ll4/l;

    return-void
.end method

.method X(JLjava/lang/String;)V
    .locals 1

    .prologue
    invoke-virtual {p0}, Lk5/p;->I()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lk5/p;->i:Lm5/e;

    invoke-virtual {v0, p1, p2, p3}, Lm5/e;->g(JLjava/lang/String;)V

    :cond_0
    return-void
.end method

.method r()Z
    .locals 3

    .prologue
    invoke-static {}, Ll5/f;->c()V

    iget-object v0, p0, Lk5/p;->c:Lk5/x;

    invoke-virtual {v0}, Lk5/x;->c()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    invoke-direct {p0}, Lk5/p;->A()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v2, p0, Lk5/p;->j:Lh5/a;

    invoke-interface {v2, v0}, Lh5/a;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1

    :cond_1
    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v0

    const-string v2, "Found previous crash marker."

    invoke-virtual {v0, v2}, Lh5/g;->i(Ljava/lang/String;)V

    iget-object v0, p0, Lk5/p;->c:Lk5/x;

    invoke-virtual {v0}, Lk5/x;->d()Z

    return v1
.end method

.method s(Ls5/j;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1, v0}, Lk5/p;->t(ZLs5/j;Z)V

    return-void
.end method

.method w(Ljava/lang/String;Ljava/lang/Thread$UncaughtExceptionHandler;Ls5/j;)V
    .locals 2

    iput-object p3, p0, Lk5/p;->o:Ls5/j;

    invoke-virtual {p0, p1}, Lk5/p;->Q(Ljava/lang/String;)V

    new-instance p1, Lk5/p$a;

    invoke-direct {p1, p0}, Lk5/p$a;-><init>(Lk5/p;)V

    new-instance v0, Lk5/A;

    iget-object v1, p0, Lk5/p;->j:Lh5/a;

    invoke-direct {v0, p1, p3, p2, v1}, Lk5/A;-><init>(Lk5/A$a;Ls5/j;Ljava/lang/Thread$UncaughtExceptionHandler;Lh5/a;)V

    iput-object v0, p0, Lk5/p;->n:Lk5/A;

    invoke-static {v0}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    return-void
.end method

.method y(Ls5/j;)Z
    .locals 3

    .prologue
    invoke-static {}, Ll5/f;->c()V

    invoke-virtual {p0}, Lk5/p;->I()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object p1

    const-string v0, "Skipping session finalization because a crash has already occurred."

    invoke-virtual {p1, v0}, Lh5/g;->k(Ljava/lang/String;)V

    return v1

    :cond_0
    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v0

    const-string v2, "Finalizing previously open sessions."

    invoke-virtual {v0, v2}, Lh5/g;->i(Ljava/lang/String;)V

    const/4 v0, 0x1

    :try_start_0
    invoke-direct {p0, v0, p1, v0}, Lk5/p;->t(ZLs5/j;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object p1

    const-string v1, "Closed all previously open sessions."

    invoke-virtual {p1, v1}, Lh5/g;->i(Ljava/lang/String;)V

    return v0

    :catch_0
    move-exception p1

    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v0

    const-string v2, "Unable to finalize previously open sessions."

    invoke-virtual {v0, v2, p1}, Lh5/g;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    return v1
.end method
