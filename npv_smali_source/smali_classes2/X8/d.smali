.class public final synthetic LX8/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic C:LX8/e;

.field public final synthetic D:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(LX8/e;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LX8/d;->C:LX8/e;

    iput-object p2, p0, LX8/d;->D:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LX8/d;->C:LX8/e;

    iget-object v1, p0, LX8/d;->D:Ljava/lang/Runnable;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, v1, p1}, LX8/e;->D1(LX8/e;Ljava/lang/Runnable;Ljava/lang/Throwable;)Li7/M;

    move-result-object p1

    return-object p1
.end method
