.class public final synthetic LX4/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:LX4/e;

.field public final synthetic b:LX4/f;


# direct methods
.method public synthetic constructor <init>(LX4/e;LX4/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LX4/d;->a:LX4/e;

    iput-object p2, p0, LX4/d;->b:LX4/f;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LX4/d;->a:LX4/e;

    iget-object v1, p0, LX4/d;->b:LX4/f;

    invoke-static {v0, v1}, LX4/e;->c(LX4/e;LX4/f;)LY4/a;

    move-result-object v0

    return-object v0
.end method
