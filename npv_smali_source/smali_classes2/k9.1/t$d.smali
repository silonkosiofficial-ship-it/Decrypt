.class final Lk9/t$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk9/t;->b()Lm9/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lk9/t;


# direct methods
.method constructor <init>(Lk9/t;)V
    .locals 0

    iput-object p1, p0, Lk9/t$d;->D:Lk9/t;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    iget-object v0, p0, Lk9/t$d;->D:Lk9/t;

    invoke-static {v0}, Lk9/t;->c(Lk9/t;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk9/t$a;

    invoke-static {v1}, Lk9/t$a;->a(Lk9/t$a;)Lk9/b;

    move-result-object v2

    invoke-static {v1}, Lk9/t$a;->b(Lk9/t$a;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v2, p1, v1}, Lm9/a;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lk9/t$d;->a(Ljava/lang/Object;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
