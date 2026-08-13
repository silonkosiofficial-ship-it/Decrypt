.class public final LV/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV/Z0;


# instance fields
.field private final C:Lx7/p;

.field private final D:LW8/N;

.field private E:LW8/z0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lm7/i;Lx7/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LV/e0;->C:Lx7/p;

    invoke-static {p1}, LW8/O;->a(Lm7/i;)LW8/N;

    move-result-object p1

    iput-object p1, p0, LV/e0;->D:LW8/N;

    return-void
.end method


# virtual methods
.method public b()V
    .locals 2

    .prologue
    iget-object v0, p0, LV/e0;->E:LW8/z0;

    if-eqz v0, :cond_0

    new-instance v1, LV/g0;

    invoke-direct {v1}, LV/g0;-><init>()V

    invoke-interface {v0, v1}, LW8/z0;->o(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, LV/e0;->E:LW8/z0;

    return-void
.end method

.method public c()V
    .locals 2

    .prologue
    iget-object v0, p0, LV/e0;->E:LW8/z0;

    if-eqz v0, :cond_0

    new-instance v1, LV/g0;

    invoke-direct {v1}, LV/g0;-><init>()V

    invoke-interface {v0, v1}, LW8/z0;->o(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, LV/e0;->E:LW8/z0;

    return-void
.end method

.method public d()V
    .locals 10

    .prologue
    iget-object v0, p0, LV/e0;->E:LW8/z0;

    if-eqz v0, :cond_0

    const-string v1, "Old job was still running!"

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, v3, v2, v3}, LW8/C0;->e(LW8/z0;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    :cond_0
    iget-object v4, p0, LV/e0;->D:LW8/N;

    iget-object v7, p0, LV/e0;->C:Lx7/p;

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    move-result-object v0

    iput-object v0, p0, LV/e0;->E:LW8/z0;

    return-void
.end method
