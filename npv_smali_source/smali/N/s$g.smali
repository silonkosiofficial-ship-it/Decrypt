.class final LN/s$g;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/s;->j(Lz0/c;LH/F;Lz0/p;Lm7/e;)Ljava/lang/Object;
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

    iput-object p1, p0, LN/s$g;->D:LH/F;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lz0/B;)V
    .locals 3

    iget-object v0, p0, LN/s$g;->D:LH/F;

    invoke-static {p1}, Lz0/q;->g(Lz0/B;)J

    move-result-wide v1

    invoke-interface {v0, v1, v2}, LH/F;->e(J)V

    invoke-virtual {p1}, Lz0/B;->a()V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz0/B;

    invoke-virtual {p0, p1}, LN/s$g;->a(Lz0/B;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
