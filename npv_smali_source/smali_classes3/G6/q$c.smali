.class public final LG6/q$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT6/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG6/q;->c(LH9/t;)LT6/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final c:Z

.field final synthetic d:LH9/t;


# direct methods
.method constructor <init>(LH9/t;)V
    .locals 0

    iput-object p1, p0, LG6/q$c;->d:LH9/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x1

    iput-boolean p1, p0, LG6/q$c;->c:Z

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, LG6/q$c;->d:LH9/t;

    invoke-virtual {v0}, LH9/t;->o()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, LG6/q$c;->c:Z

    return v0
.end method

.method public c(Ljava/lang/String;)Ljava/util/List;
    .locals 1

    .prologue
    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LG6/q$c;->d:LH9/t;

    invoke-virtual {v0, p1}, LH9/t;->C(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public d(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, LT6/p$b;->b(LT6/p;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public e(Lx7/p;)V
    .locals 0

    invoke-static {p0, p1}, LT6/p$b;->a(LT6/p;Lx7/p;)V

    return-void
.end method

.method public names()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, LG6/q$c;->d:LH9/t;

    invoke-virtual {v0}, LH9/t;->f()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
