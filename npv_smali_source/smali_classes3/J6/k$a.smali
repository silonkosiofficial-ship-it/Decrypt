.class public final LJ6/k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LW8/N;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ6/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final C:LI6/S;

.field private final D:Lm7/i;


# direct methods
.method public constructor <init>(LI6/S;Lm7/i;)V
    .locals 1

    const-string v0, "httpSendSender"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineContext"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ6/k$a;->C:LI6/S;

    iput-object p2, p0, LJ6/k$a;->D:Lm7/i;

    return-void
.end method


# virtual methods
.method public final a(LO6/d;Lm7/e;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LJ6/k$a;->C:LI6/S;

    invoke-interface {v0, p1, p2}, LI6/S;->a(LO6/d;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getCoroutineContext()Lm7/i;
    .locals 1

    iget-object v0, p0, LJ6/k$a;->D:Lm7/i;

    return-object v0
.end method
