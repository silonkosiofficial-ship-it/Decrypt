.class public final synthetic Lc5/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lc5/i;

.field public final synthetic b:Lc5/a;


# direct methods
.method public synthetic constructor <init>(Lc5/i;Lc5/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc5/f;->a:Lc5/i;

    iput-object p2, p0, Lc5/f;->b:Lc5/a;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lc5/f;->a:Lc5/i;

    iget-object v1, p0, Lc5/f;->b:Lc5/a;

    invoke-static {v0, v1}, Lc5/i;->d(Lc5/i;Lc5/a;)LY4/a;

    move-result-object v0

    return-object v0
.end method
