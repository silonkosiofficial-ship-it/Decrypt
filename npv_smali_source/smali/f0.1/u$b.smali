.class final Lf0/u$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf0/u;-><init>(Lx7/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lf0/u;


# direct methods
.method constructor <init>(Lf0/u;)V
    .locals 0

    iput-object p1, p0, Lf0/u$b;->D:Lf0/u;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Set;Lf0/k;)V
    .locals 0

    .prologue
    iget-object p2, p0, Lf0/u$b;->D:Lf0/u;

    invoke-static {p2, p1}, Lf0/u;->a(Lf0/u;Ljava/util/Set;)V

    iget-object p1, p0, Lf0/u$b;->D:Lf0/u;

    invoke-static {p1}, Lf0/u;->b(Lf0/u;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lf0/u$b;->D:Lf0/u;

    invoke-static {p1}, Lf0/u;->g(Lf0/u;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Set;

    check-cast p2, Lf0/k;

    invoke-virtual {p0, p1, p2}, Lf0/u$b;->a(Ljava/util/Set;Lf0/k;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
