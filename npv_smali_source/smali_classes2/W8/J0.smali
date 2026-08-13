.class public abstract LW8/J0;
.super LW8/J;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LW8/J;-><init>()V

    return-void
.end method


# virtual methods
.method protected final A1()Ljava/lang/String;
    .locals 2

    .prologue
    invoke-static {}, LW8/d0;->c()LW8/J0;

    move-result-object v0

    if-ne p0, v0, :cond_0

    const-string v0, "Dispatchers.Main"

    return-object v0

    :cond_0
    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {v0}, LW8/J0;->z1()LW8/J0;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object v0, v1

    :goto_0
    if-ne p0, v0, :cond_1

    const-string v0, "Dispatchers.Main.immediate"

    return-object v0

    :cond_1
    return-object v1
.end method

.method public x1(ILjava/lang/String;)LW8/J;
    .locals 0

    invoke-static {p1}, Lb9/l;->a(I)V

    invoke-static {p0, p2}, Lb9/l;->b(LW8/J;Ljava/lang/String;)LW8/J;

    move-result-object p1

    return-object p1
.end method

.method public abstract z1()LW8/J0;
.end method
