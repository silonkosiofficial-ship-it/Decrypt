.class final Lr8/l$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr8/l;->p(LO7/b;Ljava/util/Queue;Lr8/k;)Ljava/util/Collection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic C:Lr8/k;

.field final synthetic D:LO7/b;


# direct methods
.method constructor <init>(Lr8/k;LO7/b;)V
    .locals 0

    iput-object p1, p0, Lr8/l$g;->C:Lr8/k;

    iput-object p2, p0, Lr8/l$g;->D:LO7/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LO7/b;)Li7/M;
    .locals 2

    iget-object v0, p0, Lr8/l$g;->C:Lr8/k;

    iget-object v1, p0, Lr8/l$g;->D:LO7/b;

    invoke-virtual {v0, v1, p1}, Lr8/k;->b(LO7/b;LO7/b;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LO7/b;

    invoke-virtual {p0, p1}, Lr8/l$g;->a(LO7/b;)Li7/M;

    move-result-object p1

    return-object p1
.end method
