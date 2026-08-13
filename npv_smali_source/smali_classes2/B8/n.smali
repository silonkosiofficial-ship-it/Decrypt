.class public final LB8/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB8/h;


# instance fields
.field private final a:LO7/L;


# direct methods
.method public constructor <init>(LO7/L;)V
    .locals 1

    const-string v0, "packageFragmentProvider"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB8/n;->a:LO7/L;

    return-void
.end method


# virtual methods
.method public a(Ln8/b;)LB8/g;
    .locals 3

    .prologue
    const-string v0, "classId"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LB8/n;->a:LO7/L;

    invoke-virtual {p1}, Ln8/b;->h()Ln8/c;

    move-result-object v1

    const-string v2, "getPackageFqName(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1}, LO7/N;->c(LO7/L;Ln8/c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LO7/K;

    instance-of v2, v1, LB8/o;

    if-eqz v2, :cond_0

    check-cast v1, LB8/o;

    invoke-virtual {v1}, LB8/o;->O0()LB8/h;

    move-result-object v1

    invoke-interface {v1, p1}, LB8/h;->a(Ln8/b;)LB8/g;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method
