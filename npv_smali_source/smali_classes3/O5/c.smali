.class public final synthetic LO5/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:LQ5/f;

.field public final synthetic D:LQ5/e;


# direct methods
.method public synthetic constructor <init>(LQ5/f;LQ5/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LO5/c;->C:LQ5/f;

    iput-object p2, p0, LO5/c;->D:LQ5/e;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LO5/c;->C:LQ5/f;

    iget-object v1, p0, LO5/c;->D:LQ5/e;

    invoke-static {v0, v1}, LO5/e;->c(LQ5/f;LQ5/e;)V

    return-void
.end method
