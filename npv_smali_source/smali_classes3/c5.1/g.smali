.class public final synthetic Lc5/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lc5/i;

.field public final synthetic b:Lc5/b;


# direct methods
.method public synthetic constructor <init>(Lc5/i;Lc5/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc5/g;->a:Lc5/i;

    iput-object p2, p0, Lc5/g;->b:Lc5/b;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lc5/g;->a:Lc5/i;

    iget-object v1, p0, Lc5/g;->b:Lc5/b;

    invoke-static {v0, v1}, Lc5/i;->f(Lc5/i;Lc5/b;)Lc5/c;

    move-result-object v0

    return-object v0
.end method
