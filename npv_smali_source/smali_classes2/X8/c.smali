.class public final synthetic LX8/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LW8/f0;


# instance fields
.field public final synthetic C:LX8/e;

.field public final synthetic D:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(LX8/e;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LX8/c;->C:LX8/e;

    iput-object p2, p0, LX8/c;->D:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final e()V
    .locals 2

    iget-object v0, p0, LX8/c;->C:LX8/e;

    iget-object v1, p0, LX8/c;->D:Ljava/lang/Runnable;

    invoke-static {v0, v1}, LX8/e;->C1(LX8/e;Ljava/lang/Runnable;)V

    return-void
.end method
