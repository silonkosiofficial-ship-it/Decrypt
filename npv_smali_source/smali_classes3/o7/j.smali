.class public abstract Lo7/j;
.super Lo7/a;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lm7/e;)V
    .locals 1

    .prologue
    invoke-direct {p0, p1}, Lo7/a;-><init>(Lm7/e;)V

    if-eqz p1, :cond_1

    invoke-interface {p1}, Lm7/e;->getContext()Lm7/i;

    move-result-object p1

    sget-object v0, Lm7/j;->C:Lm7/j;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Coroutines with restricted suspension must have EmptyCoroutineContext"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public getContext()Lm7/i;
    .locals 1

    sget-object v0, Lm7/j;->C:Lm7/j;

    return-object v0
.end method
