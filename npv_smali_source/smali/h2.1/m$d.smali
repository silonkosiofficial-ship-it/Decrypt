.class final Lh2/m$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh2/m;->a(Lh2/t;Lh2/Z;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lh2/t;

.field final synthetic E:Lh2/Z;


# direct methods
.method constructor <init>(Lh2/t;Lh2/Z;)V
    .locals 0

    iput-object p1, p0, Lh2/m$d;->D:Lh2/t;

    iput-object p2, p0, Lh2/m$d;->E:Lh2/Z;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lh2/m$a;Lh2/m$a;)V
    .locals 2

    .prologue
    const-string v0, "prependHint"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appendHint"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lh2/m$d;->D:Lh2/t;

    sget-object v1, Lh2/t;->D:Lh2/t;

    if-ne v0, v1, :cond_0

    iget-object p2, p0, Lh2/m$d;->E:Lh2/Z;

    invoke-virtual {p1, p2}, Lh2/m$a;->c(Lh2/Z;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lh2/m$d;->E:Lh2/Z;

    invoke-virtual {p2, p1}, Lh2/m$a;->c(Lh2/Z;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lh2/m$a;

    check-cast p2, Lh2/m$a;

    invoke-virtual {p0, p1, p2}, Lh2/m$d;->a(Lh2/m$a;Lh2/m$a;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
