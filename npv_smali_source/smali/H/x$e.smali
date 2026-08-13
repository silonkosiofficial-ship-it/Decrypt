.class final LH/x$e;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/x;->d(Lz0/K;LH/F;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LH/F;


# direct methods
.method constructor <init>(LH/F;)V
    .locals 0

    iput-object p1, p0, LH/x$e;->D:LH/F;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lz0/B;J)V
    .locals 0

    iget-object p1, p0, LH/x$e;->D:LH/F;

    invoke-interface {p1, p2, p3}, LH/F;->e(J)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lz0/B;

    check-cast p2, Ln0/g;

    invoke-virtual {p2}, Ln0/g;->v()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, LH/x$e;->a(Lz0/B;J)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
