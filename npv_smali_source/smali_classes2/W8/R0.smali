.class final LW8/R0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final C:LW8/J;

.field private final D:LW8/l;


# direct methods
.method public constructor <init>(LW8/J;LW8/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LW8/R0;->C:LW8/J;

    iput-object p2, p0, LW8/R0;->D:LW8/l;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, LW8/R0;->D:LW8/l;

    iget-object v1, p0, LW8/R0;->C:LW8/J;

    sget-object v2, Li7/M;->a:Li7/M;

    invoke-interface {v0, v1, v2}, LW8/l;->F(LW8/J;Ljava/lang/Object;)V

    return-void
.end method
