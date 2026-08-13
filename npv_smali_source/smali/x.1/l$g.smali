.class final Lx/l$g;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx/l;->d(Lz0/K;Lx7/l;Lx7/a;Lx7/a;Lx7/p;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lx7/l;


# direct methods
.method constructor <init>(Lx7/l;)V
    .locals 0

    iput-object p1, p0, Lx/l$g;->D:Lx7/l;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lz0/B;Lz0/B;J)V
    .locals 0

    iget-object p1, p0, Lx/l$g;->D:Lx7/l;

    invoke-virtual {p2}, Lz0/B;->h()J

    move-result-wide p2

    invoke-static {p2, p3}, Ln0/g;->d(J)Ln0/g;

    move-result-object p2

    invoke-interface {p1, p2}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lz0/B;

    check-cast p2, Lz0/B;

    check-cast p3, Ln0/g;

    invoke-virtual {p3}, Ln0/g;->v()J

    move-result-wide v0

    invoke-virtual {p0, p1, p2, v0, v1}, Lx/l$g;->a(Lz0/B;Lz0/B;J)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
