.class public abstract Ll5/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/util/concurrent/Executor;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm2/m;

    invoke-direct {v0}, Lm2/m;-><init>()V

    sput-object v0, Ll5/b;->a:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static synthetic a(Ll4/m;Ljava/util/concurrent/atomic/AtomicBoolean;Ll4/b;Ll4/l;)Ll4/l;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ll5/b;->b(Ll4/m;Ljava/util/concurrent/atomic/AtomicBoolean;Ll4/b;Ll4/l;)Ll4/l;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic b(Ll4/m;Ljava/util/concurrent/atomic/AtomicBoolean;Ll4/b;Ll4/l;)Ll4/l;
    .locals 1

    .prologue
    invoke-virtual {p3}, Ll4/l;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p3}, Ll4/l;->l()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll4/m;->e(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p3}, Ll4/l;->k()Ljava/lang/Exception;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p3}, Ll4/l;->k()Ljava/lang/Exception;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll4/m;->d(Ljava/lang/Exception;)Z

    goto :goto_0

    :cond_1
    const/4 p0, 0x1

    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result p0

    if-eqz p0, :cond_2

    invoke-virtual {p2}, Ll4/b;->a()V

    :cond_2
    :goto_0
    const/4 p0, 0x0

    invoke-static {p0}, Ll4/o;->e(Ljava/lang/Object;)Ll4/l;

    move-result-object p0

    return-object p0
.end method

.method public static c(Ll4/l;Ll4/l;)Ll4/l;
    .locals 4

    new-instance v0, Ll4/b;

    invoke-direct {v0}, Ll4/b;-><init>()V

    new-instance v1, Ll4/m;

    invoke-virtual {v0}, Ll4/b;->b()Ll4/a;

    move-result-object v2

    invoke-direct {v1, v2}, Ll4/m;-><init>(Ll4/a;)V

    new-instance v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    new-instance v3, Ll5/a;

    invoke-direct {v3, v1, v2, v0}, Ll5/a;-><init>(Ll4/m;Ljava/util/concurrent/atomic/AtomicBoolean;Ll4/b;)V

    sget-object v0, Ll5/b;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, v3}, Ll4/l;->i(Ljava/util/concurrent/Executor;Ll4/c;)Ll4/l;

    invoke-virtual {p1, v0, v3}, Ll4/l;->i(Ljava/util/concurrent/Executor;Ll4/c;)Ll4/l;

    invoke-virtual {v1}, Ll4/m;->a()Ll4/l;

    move-result-object p0

    return-object p0
.end method
