.class final LV/o$e;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV/o;->I0(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LV/o;

.field final synthetic E:LV/o0;


# direct methods
.method constructor <init>(LV/o;LV/o0;)V
    .locals 0

    iput-object p1, p0, LV/o$e;->D:LV/o;

    iput-object p2, p0, LV/o$e;->E:LV/o0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    iget-object v0, p0, LV/o$e;->D:LV/o;

    iget-object v1, p0, LV/o$e;->E:LV/o0;

    invoke-virtual {v1}, LV/o0;->c()LV/m0;

    iget-object v1, p0, LV/o$e;->E:LV/o0;

    invoke-virtual {v1}, LV/o0;->e()LV/H0;

    move-result-object v1

    iget-object v2, p0, LV/o$e;->E:LV/o0;

    invoke-virtual {v2}, LV/o0;->f()Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v0, v4, v1, v2, v3}, LV/o;->b0(LV/o;LV/m0;LV/H0;Ljava/lang/Object;Z)V

    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LV/o$e;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
