.class public final LR6/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LQ6/c;

.field private final b:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(LQ6/c;Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "response"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cause"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR6/e;->a:LQ6/c;

    iput-object p2, p0, LR6/e;->b:Ljava/lang/Throwable;

    return-void
.end method
