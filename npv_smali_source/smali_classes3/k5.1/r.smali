.class public final synthetic Lk5/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lk5/w;


# direct methods
.method public synthetic constructor <init>(Lk5/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk5/r;->a:Lk5/w;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lk5/r;->a:Lk5/w;

    invoke-static {v0}, Lk5/w;->b(Lk5/w;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
