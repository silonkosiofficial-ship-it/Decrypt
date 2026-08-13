.class public final synthetic Ls5/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Ls5/g$a;


# direct methods
.method public synthetic constructor <init>(Ls5/g$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls5/f;->a:Ls5/g$a;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ls5/f;->a:Ls5/g$a;

    invoke-static {v0}, Ls5/g$a;->b(Ls5/g$a;)Lorg/json/JSONObject;

    move-result-object v0

    return-object v0
.end method
