.class public final synthetic LB3/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:LB3/l0;

.field public final synthetic b:Lk3/g;

.field public final synthetic c:LB3/m0;


# direct methods
.method public synthetic constructor <init>(LB3/l0;Lk3/g;LB3/m0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB3/k0;->a:LB3/l0;

    iput-object p2, p0, LB3/k0;->b:Lk3/g;

    iput-object p3, p0, LB3/k0;->c:LB3/m0;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LB3/k0;->a:LB3/l0;

    iget-object v1, p0, LB3/k0;->b:Lk3/g;

    iget-object v2, p0, LB3/k0;->c:LB3/m0;

    invoke-virtual {v0, v1, v2}, LB3/l0;->a(Lk3/g;LB3/m0;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
