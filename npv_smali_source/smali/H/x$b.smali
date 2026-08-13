.class final LH/x$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


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

    iput-object p1, p0, LH/x$b;->D:LH/F;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 1

    iget-object v0, p0, LH/x$b;->D:LH/F;

    invoke-interface {v0, p1, p2}, LH/F;->b(J)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ln0/g;

    invoke-virtual {p1}, Ln0/g;->v()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LH/x$b;->a(J)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
