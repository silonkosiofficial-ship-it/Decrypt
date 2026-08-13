.class final Lr8/l$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr8/l;->t(LO7/e;Ljava/util/Collection;)Ljava/util/Collection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic C:LO7/e;


# direct methods
.method constructor <init>(LO7/e;)V
    .locals 0

    iput-object p1, p0, Lr8/l$e;->C:LO7/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LO7/b;)Ljava/lang/Boolean;
    .locals 2

    .prologue
    invoke-interface {p1}, LO7/C;->h()LO7/u;

    move-result-object v0

    invoke-static {v0}, LO7/t;->g(LO7/u;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, Lr8/l$e;->C:LO7/e;

    invoke-static {p1, v0, v1}, LO7/t;->h(LO7/q;LO7/m;Z)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LO7/b;

    invoke-virtual {p0, p1}, Lr8/l$e;->a(LO7/b;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
