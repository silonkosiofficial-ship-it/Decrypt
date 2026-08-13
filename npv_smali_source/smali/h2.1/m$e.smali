.class final Lh2/m$e;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh2/m;->d(Lh2/Z;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lh2/Z;


# direct methods
.method constructor <init>(Lh2/Z;)V
    .locals 0

    iput-object p1, p0, Lh2/m$e;->D:Lh2/Z;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lh2/m$a;Lh2/m$a;)V
    .locals 3

    .prologue
    const-string v0, "prependHint"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appendHint"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lh2/m$e;->D:Lh2/Z;

    invoke-virtual {p1}, Lh2/m$a;->b()Lh2/Z;

    move-result-object v1

    sget-object v2, Lh2/t;->D:Lh2/t;

    invoke-static {v0, v1, v2}, Lh2/n;->a(Lh2/Z;Lh2/Z;Lh2/t;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh2/m$e;->D:Lh2/Z;

    invoke-virtual {p1, v0}, Lh2/m$a;->c(Lh2/Z;)V

    :cond_0
    iget-object p1, p0, Lh2/m$e;->D:Lh2/Z;

    invoke-virtual {p2}, Lh2/m$a;->b()Lh2/Z;

    move-result-object v0

    sget-object v1, Lh2/t;->E:Lh2/t;

    invoke-static {p1, v0, v1}, Lh2/n;->a(Lh2/Z;Lh2/Z;Lh2/t;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lh2/m$e;->D:Lh2/Z;

    invoke-virtual {p2, p1}, Lh2/m$a;->c(Lh2/Z;)V

    :cond_1
    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lh2/m$a;

    check-cast p2, Lh2/m$a;

    invoke-virtual {p0, p1, p2}, Lh2/m$e;->a(Lh2/m$a;Lh2/m$a;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
