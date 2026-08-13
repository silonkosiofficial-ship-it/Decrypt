.class public final synthetic LE5/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:LE5/f;


# direct methods
.method public synthetic constructor <init>(LE5/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LE5/d;->a:LE5/f;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LE5/d;->a:LE5/f;

    invoke-static {v0}, LE5/f;->b(LE5/f;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
