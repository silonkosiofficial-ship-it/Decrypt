.class final LW8/F0$a;
.super LW8/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LW8/F0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final K:LW8/F0;


# direct methods
.method public constructor <init>(Lm7/e;LW8/F0;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, LW8/n;-><init>(Lm7/e;I)V

    iput-object p2, p0, LW8/F0$a;->K:LW8/F0;

    return-void
.end method


# virtual methods
.method protected O()Ljava/lang/String;
    .locals 1

    const-string v0, "AwaitContinuation"

    return-object v0
.end method

.method public v(LW8/z0;)Ljava/lang/Throwable;
    .locals 2

    .prologue
    iget-object v0, p0, LW8/F0$a;->K:LW8/F0;

    invoke-virtual {v0}, LW8/F0;->b0()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LW8/F0$c;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, LW8/F0$c;

    invoke-virtual {v1}, LW8/F0$c;->e()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    instance-of v1, v0, LW8/A;

    if-eqz v1, :cond_1

    check-cast v0, LW8/A;

    iget-object p1, v0, LW8/A;->a:Ljava/lang/Throwable;

    return-object p1

    :cond_1
    invoke-interface {p1}, LW8/z0;->e0()Ljava/util/concurrent/CancellationException;

    move-result-object p1

    return-object p1
.end method
