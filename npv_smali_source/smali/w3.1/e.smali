.class final Lw3/e;
.super Ljava/lang/Thread;
.source "SourceFile"


# instance fields
.field final synthetic C:Ljava/lang/String;


# direct methods
.method constructor <init>(Lw3/g;Ljava/lang/String;)V
    .locals 0

    iput-object p2, p0, Lw3/e;->C:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    new-instance v0, Lw3/v;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lw3/v;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lw3/e;->C:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lw3/v;->o(Ljava/lang/String;)Lw3/u;

    return-void
.end method
