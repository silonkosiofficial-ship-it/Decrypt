.class public final Lf4/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf4/S0;


# instance fields
.field private final a:Lf4/W0;

.field private final b:Lf4/W0;


# direct methods
.method public constructor <init>(Lf4/W0;Lf4/W0;Lf4/W0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf4/p;->a:Lf4/W0;

    iput-object p2, p0, Lf4/p;->b:Lf4/W0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lf4/p;->b()Lf4/o;

    move-result-object v0

    return-object v0
.end method

.method public final b()Lf4/o;
    .locals 4

    iget-object v0, p0, Lf4/p;->a:Lf4/W0;

    invoke-interface {v0}, Lf4/W0;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Application;

    iget-object v1, p0, Lf4/p;->b:Lf4/W0;

    invoke-interface {v1}, Lf4/W0;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf4/q;

    invoke-static {}, Lf4/v;->b()Ljava/util/concurrent/Executor;

    move-result-object v2

    new-instance v3, Lf4/o;

    invoke-direct {v3, v0, v1, v2}, Lf4/o;-><init>(Landroid/app/Application;Lf4/q;Ljava/util/concurrent/Executor;)V

    return-object v3
.end method
