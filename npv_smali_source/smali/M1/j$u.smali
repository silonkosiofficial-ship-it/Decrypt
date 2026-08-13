.class final LM1/j$u;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM1/j;-><init>(LM1/w;Ljava/util/List;LM1/d;LW8/N;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LM1/j$u;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM1/j$u;

    invoke-direct {v0}, LM1/j$u;-><init>()V

    sput-object v0, LM1/j$u;->D:LM1/j$u;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LM1/p$a;Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    const-string v0, "msg"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LM1/p$a;->a()LW8/v;

    move-result-object p1

    if-nez p2, :cond_0

    new-instance p2, Ljava/util/concurrent/CancellationException;

    const-string v0, "DataStore scope was cancelled before updateData could complete"

    invoke-direct {p2, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    :cond_0
    invoke-interface {p1, p2}, LW8/v;->g(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LM1/p$a;

    check-cast p2, Ljava/lang/Throwable;

    invoke-virtual {p0, p1, p2}, LM1/j$u;->a(LM1/p$a;Ljava/lang/Throwable;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
