.class final Lx/l$h;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx/l;->d(Lz0/K;Lx7/l;Lx7/a;Lx7/a;Lx7/p;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lx7/a;


# direct methods
.method constructor <init>(Lx7/a;)V
    .locals 0

    iput-object p1, p0, Lx/l$h;->D:Lx7/a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lz0/B;)V
    .locals 0

    iget-object p1, p0, Lx/l$h;->D:Lx7/a;

    invoke-interface {p1}, Lx7/a;->b()Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz0/B;

    invoke-virtual {p0, p1}, Lx/l$h;->a(Lz0/B;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
