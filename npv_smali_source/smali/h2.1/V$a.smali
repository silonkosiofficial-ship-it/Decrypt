.class final Lh2/V$a;
.super Ljava/util/concurrent/CancellationException;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh2/V;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final C:Lh2/V;


# direct methods
.method public constructor <init>(Lh2/V;)V
    .locals 1

    const-string v0, "runner"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "Cancelled isolated runner"

    invoke-direct {p0, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lh2/V$a;->C:Lh2/V;

    return-void
.end method


# virtual methods
.method public final a()Lh2/V;
    .locals 1

    iget-object v0, p0, Lh2/V$a;->C:Lh2/V;

    return-object v0
.end method
