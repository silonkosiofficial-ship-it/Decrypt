.class public final synthetic LB3/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:LB3/w;

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:LX3/a;


# direct methods
.method public synthetic constructor <init>(LB3/w;Ljava/util/List;LX3/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB3/q;->a:LB3/w;

    iput-object p2, p0, LB3/q;->b:Ljava/util/List;

    iput-object p3, p0, LB3/q;->c:LX3/a;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LB3/q;->a:LB3/w;

    iget-object v1, p0, LB3/q;->b:Ljava/util/List;

    iget-object v2, p0, LB3/q;->c:LX3/a;

    invoke-virtual {v0, v1, v2}, LB3/w;->r6(Ljava/util/List;LX3/a;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method
