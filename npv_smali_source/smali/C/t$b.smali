.class final LC/t$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC/t;->d(ILC/y;LC/w;IIIIIIFJZLA/b$m;LA/b$e;ZLY0/e;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;ILjava/util/List;LW8/N;LV/w0;Lo0/C1;Lx7/l;Lx7/q;)LC/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Ljava/util/List;

.field final synthetic E:LV/w0;


# direct methods
.method constructor <init>(Ljava/util/List;LV/w0;)V
    .locals 0

    iput-object p1, p0, LC/t$b;->D:Ljava/util/List;

    iput-object p2, p0, LC/t$b;->E:LV/w0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LD0/X$a;)V
    .locals 4

    .prologue
    iget-object v0, p0, LC/t$b;->D:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LC/v;

    invoke-virtual {v3, p1}, LC/v;->t(LD0/X$a;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, LC/t$b;->E:LV/w0;

    invoke-static {p1}, LD/L;->a(LV/w0;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LD0/X$a;

    invoke-virtual {p0, p1}, LC/t$b;->a(LD0/X$a;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
