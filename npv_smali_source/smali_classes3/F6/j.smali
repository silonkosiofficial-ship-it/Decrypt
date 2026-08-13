.class public abstract LF6/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:LW8/J;

.field private c:Ljava/net/Proxy;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    iput v0, p0, LF6/j;->a:I

    return-void
.end method


# virtual methods
.method public final a()LW8/J;
    .locals 1

    iget-object v0, p0, LF6/j;->b:LW8/J;

    return-object v0
.end method

.method public final b()Ljava/net/Proxy;
    .locals 1

    iget-object v0, p0, LF6/j;->c:Ljava/net/Proxy;

    return-object v0
.end method

.method public final c(Ljava/net/Proxy;)V
    .locals 0

    iput-object p1, p0, LF6/j;->c:Ljava/net/Proxy;

    return-void
.end method
