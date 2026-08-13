.class public abstract LM8/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements Lz7/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM8/a$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected abstract d()LM8/c;
.end method

.method protected abstract e()LM8/s;
.end method

.method protected final f(LF7/c;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "tClass"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LF7/c;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p0, p1, p2}, LM8/a;->g(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method protected abstract g(Ljava/lang/String;Ljava/lang/Object;)V
.end method

.method public final isEmpty()Z
    .locals 1

    .prologue
    invoke-virtual {p0}, LM8/a;->d()LM8/c;

    move-result-object v0

    invoke-virtual {v0}, LM8/c;->d()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, LM8/a;->d()LM8/c;

    move-result-object v0

    invoke-virtual {v0}, LM8/c;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
