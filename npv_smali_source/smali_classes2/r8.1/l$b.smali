.class final Lr8/l$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr8/l;->r(Ljava/util/Set;)Ljava/util/Set;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LO7/a;LO7/a;)Li7/u;
    .locals 1

    new-instance v0, Li7/u;

    invoke-direct {v0, p1, p2}, Li7/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LO7/a;

    check-cast p2, LO7/a;

    invoke-virtual {p0, p1, p2}, Lr8/l$b;->a(LO7/a;LO7/a;)Li7/u;

    move-result-object p1

    return-object p1
.end method
