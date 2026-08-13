.class public final Lf4/Q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf4/S0;


# instance fields
.field private final a:Lf4/W0;


# direct methods
.method public constructor <init>(Lf4/W0;Lf4/W0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf4/Q;->a:Lf4/W0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 3

    invoke-static {}, Lf4/v;->b()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Lf4/P;

    iget-object v2, p0, Lf4/Q;->a:Lf4/W0;

    invoke-direct {v1, v2, v0}, Lf4/P;-><init>(Lf4/W0;Ljava/util/concurrent/Executor;)V

    return-object v1
.end method
