.class final LP3/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic C:LP3/y;


# direct methods
.method constructor <init>(LP3/y;)V
    .locals 0

    iput-object p1, p0, LP3/v;->C:LP3/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LP3/v;->C:LP3/y;

    invoke-static {v0}, LP3/y;->d2(LP3/y;)LP3/x;

    move-result-object v0

    new-instance v1, LN3/b;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, LN3/b;-><init>(I)V

    invoke-interface {v0, v1}, LP3/x;->c(LN3/b;)V

    return-void
.end method
