.class public final LQ1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM1/h;


# instance fields
.field private final a:LM1/h;


# direct methods
.method public constructor <init>(LM1/h;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQ1/d;->a:LM1/h;

    return-void
.end method


# virtual methods
.method public a(Lx7/p;Lm7/e;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LQ1/d;->a:LM1/h;

    new-instance v1, LQ1/d$a;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, LQ1/d$a;-><init>(Lx7/p;Lm7/e;)V

    invoke-interface {v0, v1, p2}, LM1/h;->a(Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getData()LZ8/f;
    .locals 1

    iget-object v0, p0, LQ1/d;->a:LM1/h;

    invoke-interface {v0}, LM1/h;->getData()LZ8/f;

    move-result-object v0

    return-object v0
.end method
