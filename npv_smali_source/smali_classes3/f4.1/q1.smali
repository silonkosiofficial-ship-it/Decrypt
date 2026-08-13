.class public final Lf4/q1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf4/S0;


# instance fields
.field private final a:Lf4/W0;

.field private final b:Lf4/W0;

.field private final c:Lf4/W0;

.field private final d:Lf4/W0;

.field private final e:Lf4/W0;

.field private final f:Lf4/W0;

.field private final g:Lf4/W0;


# direct methods
.method public constructor <init>(Lf4/W0;Lf4/W0;Lf4/W0;Lf4/W0;Lf4/W0;Lf4/W0;Lf4/W0;Lf4/W0;Lf4/W0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf4/q1;->a:Lf4/W0;

    iput-object p2, p0, Lf4/q1;->b:Lf4/W0;

    iput-object p5, p0, Lf4/q1;->c:Lf4/W0;

    iput-object p6, p0, Lf4/q1;->d:Lf4/W0;

    iput-object p7, p0, Lf4/q1;->e:Lf4/W0;

    iput-object p8, p0, Lf4/q1;->f:Lf4/W0;

    iput-object p9, p0, Lf4/q1;->g:Lf4/W0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lf4/q1;->b()Lf4/p1;

    move-result-object v0

    return-object v0
.end method

.method public final b()Lf4/p1;
    .locals 11

    iget-object v0, p0, Lf4/q1;->a:Lf4/W0;

    invoke-interface {v0}, Lf4/W0;->a()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/app/Application;

    iget-object v0, p0, Lf4/q1;->b:Lf4/W0;

    invoke-interface {v0}, Lf4/W0;->a()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lf4/c;

    invoke-static {}, Lf4/t;->b()Landroid/os/Handler;

    move-result-object v4

    invoke-static {}, Lf4/v;->b()Ljava/util/concurrent/Executor;

    move-result-object v5

    iget-object v0, p0, Lf4/q1;->c:Lf4/W0;

    invoke-interface {v0}, Lf4/W0;->a()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lf4/q;

    iget-object v0, p0, Lf4/q1;->d:Lf4/W0;

    invoke-interface {v0}, Lf4/W0;->a()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lf4/P;

    iget-object v0, p0, Lf4/q1;->e:Lf4/W0;

    check-cast v0, Lf4/j1;

    invoke-virtual {v0}, Lf4/j1;->b()Lf4/e1;

    move-result-object v8

    iget-object v0, p0, Lf4/q1;->f:Lf4/W0;

    check-cast v0, Lf4/b;

    invoke-virtual {v0}, Lf4/b;->b()Lf4/s1;

    move-result-object v9

    iget-object v0, p0, Lf4/q1;->g:Lf4/W0;

    invoke-interface {v0}, Lf4/W0;->a()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lf4/X0;

    new-instance v0, Lf4/p1;

    move-object v1, v0

    invoke-direct/range {v1 .. v10}, Lf4/p1;-><init>(Landroid/app/Application;Lf4/c;Landroid/os/Handler;Ljava/util/concurrent/Executor;Lf4/q;Lf4/P;Lf4/e1;Lf4/s1;Lf4/X0;)V

    return-object v0
.end method
