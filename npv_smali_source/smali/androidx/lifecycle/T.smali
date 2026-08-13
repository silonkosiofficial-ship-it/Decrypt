.class public abstract Landroidx/lifecycle/T;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Le2/f;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Le2/f;

    invoke-direct {v0}, Le2/f;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/T;->a:Le2/f;

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/String;Ljava/lang/AutoCloseable;)V
    .locals 1

    .prologue
    const-string v0, "key"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "closeable"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/lifecycle/T;->a:Le2/f;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Le2/f;->d(Ljava/lang/String;Ljava/lang/AutoCloseable;)V

    :cond_0
    return-void
.end method

.method public final e()V
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/lifecycle/T;->a:Le2/f;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Le2/f;->e()V

    :cond_0
    invoke-virtual {p0}, Landroidx/lifecycle/T;->g()V

    return-void
.end method

.method public final f(Ljava/lang/String;)Ljava/lang/AutoCloseable;
    .locals 1

    .prologue
    const-string v0, "key"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/lifecycle/T;->a:Le2/f;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Le2/f;->g(Ljava/lang/String;)Ljava/lang/AutoCloseable;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method protected g()V
    .locals 0

    return-void
.end method
