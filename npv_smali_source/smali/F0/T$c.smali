.class final LF0/T$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF0/T;->h1(LF0/t0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LF0/t0;

.field final synthetic E:LF0/T;


# direct methods
.method constructor <init>(LF0/t0;LF0/T;)V
    .locals 0

    iput-object p1, p0, LF0/T$c;->D:LF0/t0;

    iput-object p2, p0, LF0/T$c;->E:LF0/T;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    iget-object v0, p0, LF0/T$c;->D:LF0/t0;

    invoke-virtual {v0}, LF0/t0;->b()LD0/K;

    move-result-object v0

    invoke-interface {v0}, LD0/K;->l()Lx7/l;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, LF0/T$c;->E:LF0/T;

    invoke-virtual {v1}, LF0/T;->u1()LD0/d0;

    move-result-object v1

    invoke-interface {v0, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LF0/T$c;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
