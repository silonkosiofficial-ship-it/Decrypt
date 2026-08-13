.class public final synthetic LB3/O;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:LB3/P;

.field public final synthetic D:LB3/N;


# direct methods
.method public synthetic constructor <init>(LB3/P;LB3/N;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB3/O;->C:LB3/P;

    iput-object p2, p0, LB3/O;->D:LB3/N;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LB3/O;->C:LB3/P;

    iget-object v1, p0, LB3/O;->D:LB3/N;

    invoke-virtual {v0, v1}, LB3/P;->b(LB3/N;)V

    return-void
.end method
