.class public final LB/D$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB/v;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB/D;-><init>(IILB/x;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LB/D;


# direct methods
.method constructor <init>(LB/D;)V
    .locals 0

    iput-object p1, p0, LB/D$d;->a:LB/D;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)Landroidx/compose/foundation/lazy/layout/d$b;
    .locals 7

    .prologue
    sget-object v0, Lf0/k;->e:Lf0/k$a;

    iget-object v1, p0, LB/D$d;->a:LB/D;

    invoke-virtual {v0}, Lf0/k$a;->d()Lf0/k;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lf0/k;->h()Lx7/l;

    move-result-object v3

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v0, v2}, Lf0/k$a;->f(Lf0/k;)Lf0/k;

    move-result-object v4

    :try_start_0
    invoke-static {v1}, LB/D;->f(LB/D;)LV/w0;

    move-result-object v1

    invoke-interface {v1}, LV/w0;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LB/s;

    invoke-virtual {v1}, LB/s;->o()J

    move-result-wide v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0, v2, v4, v3}, Lf0/k$a;->m(Lf0/k;Lf0/k;Lx7/l;)V

    iget-object v0, p0, LB/D$d;->a:LB/D;

    invoke-virtual {v0}, LB/D;->C()Landroidx/compose/foundation/lazy/layout/d;

    move-result-object v0

    invoke-virtual {v0, p1, v5, v6}, Landroidx/compose/foundation/lazy/layout/d;->e(IJ)Landroidx/compose/foundation/lazy/layout/d$b;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    invoke-virtual {v0, v2, v4, v3}, Lf0/k$a;->m(Lf0/k;Lf0/k;Lx7/l;)V

    throw p1
.end method
