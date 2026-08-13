.class public final LW8/L0;
.super Lm7/a;
.source "SourceFile"

# interfaces
.implements LW8/z0;


# static fields
.field public static final D:LW8/L0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LW8/L0;

    invoke-direct {v0}, LW8/L0;-><init>()V

    sput-object v0, LW8/L0;->D:LW8/L0;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    sget-object v0, LW8/z0;->h:LW8/z0$b;

    invoke-direct {p0, v0}, Lm7/a;-><init>(Lm7/i$c;)V

    return-void
.end method


# virtual methods
.method public E0(ZZLx7/l;)LW8/f0;
    .locals 0

    sget-object p1, LW8/M0;->C:LW8/M0;

    return-object p1
.end method

.method public N()LR8/h;
    .locals 1

    invoke-static {}, LR8/k;->i()LR8/h;

    move-result-object v0

    return-object v0
.end method

.method public e0()Ljava/util/concurrent/CancellationException;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This job is always active"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public e1(Lx7/l;)LW8/f0;
    .locals 0

    sget-object p1, LW8/M0;->C:LW8/M0;

    return-object p1
.end method

.method public f()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public f1()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public g0(Lm7/e;)Ljava/lang/Object;
    .locals 1

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "This job is always active"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public isCancelled()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public l1(LW8/u;)LW8/s;
    .locals 0

    sget-object p1, LW8/M0;->C:LW8/M0;

    return-object p1
.end method

.method public o(Ljava/util/concurrent/CancellationException;)V
    .locals 0

    return-void
.end method

.method public start()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "NonCancellable"

    return-object v0
.end method
