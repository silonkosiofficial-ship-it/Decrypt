.class public final LW8/f;
.super LW8/k0;
.source "SourceFile"


# instance fields
.field private final K:Ljava/lang/Thread;


# direct methods
.method public constructor <init>(Ljava/lang/Thread;)V
    .locals 0

    invoke-direct {p0}, LW8/k0;-><init>()V

    iput-object p1, p0, LW8/f;->K:Ljava/lang/Thread;

    return-void
.end method


# virtual methods
.method protected L1()Ljava/lang/Thread;
    .locals 1

    iget-object v0, p0, LW8/f;->K:Ljava/lang/Thread;

    return-object v0
.end method
