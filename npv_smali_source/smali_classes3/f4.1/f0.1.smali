.class public final Lf4/f0;
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


# direct methods
.method public constructor <init>(Lf4/W0;Lf4/W0;Lf4/W0;Lf4/W0;Lf4/W0;Lf4/W0;Lf4/W0;Lf4/W0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf4/f0;->a:Lf4/W0;

    iput-object p2, p0, Lf4/f0;->b:Lf4/W0;

    iput-object p5, p0, Lf4/f0;->c:Lf4/W0;

    iput-object p6, p0, Lf4/f0;->d:Lf4/W0;

    iput-object p7, p0, Lf4/f0;->e:Lf4/W0;

    iput-object p8, p0, Lf4/f0;->f:Lf4/W0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lf4/f0;->b()Lf4/e0;

    move-result-object v0

    return-object v0
.end method

.method public final b()Lf4/e0;
    .locals 10

    iget-object v0, p0, Lf4/f0;->a:Lf4/W0;

    invoke-interface {v0}, Lf4/W0;->a()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/app/Application;

    iget-object v0, p0, Lf4/f0;->b:Lf4/W0;

    invoke-interface {v0}, Lf4/W0;->a()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lf4/Z;

    invoke-static {}, Lf4/t;->b()Landroid/os/Handler;

    move-result-object v4

    invoke-static {}, Lf4/v;->b()Ljava/util/concurrent/Executor;

    move-result-object v5

    iget-object v0, p0, Lf4/f0;->c:Lf4/W0;

    invoke-interface {v0}, Lf4/W0;->a()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lf4/X0;

    iget-object v0, p0, Lf4/f0;->d:Lf4/W0;

    check-cast v0, Lf4/p;

    invoke-virtual {v0}, Lf4/p;->b()Lf4/o;

    move-result-object v7

    iget-object v0, p0, Lf4/f0;->e:Lf4/W0;

    invoke-interface {v0}, Lf4/W0;->a()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lf4/D;

    iget-object v0, p0, Lf4/f0;->f:Lf4/W0;

    invoke-interface {v0}, Lf4/W0;->a()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lf4/q;

    new-instance v0, Lf4/e0;

    move-object v1, v0

    invoke-direct/range {v1 .. v9}, Lf4/e0;-><init>(Landroid/app/Application;Lf4/Z;Landroid/os/Handler;Ljava/util/concurrent/Executor;Lf4/X0;Lf4/o;Lf4/D;Lf4/q;)V

    return-object v0
.end method
