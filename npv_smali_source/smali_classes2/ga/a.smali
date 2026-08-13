.class public Lga/a;
.super Lha/d;
.source "SourceFile"


# instance fields
.field C:Ljava/lang/String;

.field D:Lha/k;

.field E:Ljava/util/Queue;


# direct methods
.method public constructor <init>(Lha/k;Ljava/util/Queue;)V
    .locals 0

    invoke-direct {p0}, Lha/d;-><init>()V

    iput-object p1, p0, Lga/a;->D:Lha/k;

    invoke-virtual {p1}, Lha/k;->j()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lga/a;->C:Ljava/lang/String;

    iput-object p2, p0, Lga/a;->E:Ljava/util/Queue;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public b()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public c()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public e()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public f()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method protected h(Lga/b;Lfa/g;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 3

    .prologue
    new-instance v0, Lga/d;

    invoke-direct {v0}, Lga/d;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lga/d;->k(J)V

    invoke-virtual {v0, p1}, Lga/d;->e(Lga/b;)V

    iget-object p1, p0, Lga/a;->D:Lha/k;

    invoke-virtual {v0, p1}, Lga/d;->f(Lha/k;)V

    iget-object p1, p0, Lga/a;->C:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lga/d;->g(Ljava/lang/String;)V

    if-eqz p2, :cond_0

    invoke-virtual {v0, p2}, Lga/d;->a(Lfa/g;)V

    :cond_0
    invoke-virtual {v0, p3}, Lga/d;->h(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lga/d;->i(Ljava/lang/String;)V

    invoke-virtual {v0, p4}, Lga/d;->d([Ljava/lang/Object;)V

    invoke-virtual {v0, p5}, Lga/d;->j(Ljava/lang/Throwable;)V

    iget-object p1, p0, Lga/a;->E:Ljava/util/Queue;

    invoke-interface {p1, v0}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    return-void
.end method
