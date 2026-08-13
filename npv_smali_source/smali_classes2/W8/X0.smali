.class public final LW8/X0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LW8/X0;

.field private static final b:Ljava/lang/ThreadLocal;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LW8/X0;

    invoke-direct {v0}, LW8/X0;-><init>()V

    sput-object v0, LW8/X0;->a:LW8/X0;

    new-instance v0, Lb9/D;

    const-string v1, "ThreadLocalEventLoop"

    invoke-direct {v0, v1}, Lb9/D;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lb9/N;->a(Lb9/D;)Ljava/lang/ThreadLocal;

    move-result-object v0

    sput-object v0, LW8/X0;->b:Ljava/lang/ThreadLocal;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LW8/j0;
    .locals 1

    sget-object v0, LW8/X0;->b:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LW8/j0;

    return-object v0
.end method

.method public final b()LW8/j0;
    .locals 2

    .prologue
    sget-object v0, LW8/X0;->b:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LW8/j0;

    if-nez v1, :cond_0

    invoke-static {}, LW8/m0;->a()LW8/j0;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_0
    return-object v1
.end method

.method public final c()V
    .locals 2

    sget-object v0, LW8/X0;->b:Ljava/lang/ThreadLocal;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public final d(LW8/j0;)V
    .locals 1

    sget-object v0, LW8/X0;->b:Ljava/lang/ThreadLocal;

    invoke-virtual {v0, p1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-void
.end method
