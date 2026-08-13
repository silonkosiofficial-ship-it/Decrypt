.class final LF0/d0$j;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF0/d0;-><init>(LF0/J;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LF0/d0;


# direct methods
.method constructor <init>(LF0/d0;)V
    .locals 0

    iput-object p1, p0, LF0/d0$j;->D:LF0/d0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    iget-object v0, p0, LF0/d0$j;->D:LF0/d0;

    invoke-virtual {v0}, LF0/d0;->p2()LF0/d0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LF0/d0;->y2()V

    :cond_0
    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LF0/d0$j;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
