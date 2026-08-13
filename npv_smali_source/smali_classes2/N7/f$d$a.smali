.class final LN7/f$d$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN7/f$d;->a()LN7/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LN7/f;


# direct methods
.method constructor <init>(LN7/f;)V
    .locals 0

    iput-object p1, p0, LN7/f$d$a;->D:LN7/f;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LN7/f$b;
    .locals 3

    .prologue
    iget-object v0, p0, LN7/f$d$a;->D:LN7/f;

    invoke-static {v0}, LN7/f;->F0(LN7/f;)Lx7/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, LN7/f$d$a;->D:LN7/f;

    check-cast v0, LN7/f$b;

    const/4 v2, 0x0

    invoke-static {v1, v2}, LN7/f;->G0(LN7/f;Lx7/a;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "JvmBuiltins instance has not been initialized properly"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LN7/f$d$a;->a()LN7/f$b;

    move-result-object v0

    return-object v0
.end method
