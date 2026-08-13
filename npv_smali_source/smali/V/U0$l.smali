.class final LV/U0$l;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV/U0;->A0(LV/G;Lr/L;)Lx7/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LV/G;

.field final synthetic E:Lr/L;


# direct methods
.method constructor <init>(LV/G;Lr/L;)V
    .locals 0

    iput-object p1, p0, LV/U0$l;->D:LV/G;

    iput-object p2, p0, LV/U0$l;->E:Lr/L;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    .prologue
    iget-object v0, p0, LV/U0$l;->D:LV/G;

    invoke-interface {v0, p1}, LV/G;->r(Ljava/lang/Object;)V

    iget-object v0, p0, LV/U0$l;->E:Lr/L;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lr/L;->h(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LV/U0$l;->a(Ljava/lang/Object;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
