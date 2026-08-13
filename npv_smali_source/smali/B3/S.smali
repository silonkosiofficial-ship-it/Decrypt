.class public final synthetic LB3/S;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:LB3/a;


# direct methods
.method public synthetic constructor <init>(LB3/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB3/S;->a:LB3/a;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LB3/S;->a:LB3/a;

    invoke-virtual {v0}, LB3/a;->getViewSignals()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
