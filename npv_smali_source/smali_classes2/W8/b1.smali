.class public final LW8/b1;
.super LW8/J;
.source "SourceFile"


# static fields
.field public static final E:LW8/b1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LW8/b1;

    invoke-direct {v0}, LW8/b1;-><init>()V

    sput-object v0, LW8/b1;->E:LW8/b1;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, LW8/J;-><init>()V

    return-void
.end method


# virtual methods
.method public t1(Lm7/i;Ljava/lang/Runnable;)V
    .locals 0

    .prologue
    sget-object p2, LW8/f1;->E:LW8/f1$a;

    invoke-interface {p1, p2}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object p1

    check-cast p1, LW8/f1;

    if-eqz p1, :cond_0

    const/4 p2, 0x1

    iput-boolean p2, p1, LW8/f1;->D:Z

    return-void

    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Dispatchers.Unconfined"

    return-object v0
.end method

.method public v1(Lm7/i;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public x1(ILjava/lang/String;)LW8/J;
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "limitedParallelism is not supported for Dispatchers.Unconfined"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
