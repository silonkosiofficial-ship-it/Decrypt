.class final LD/f;
.super Ljava/util/concurrent/CancellationException;
.source "SourceFile"


# instance fields
.field private final C:I

.field private final D:Lu/l;


# direct methods
.method public constructor <init>(ILu/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/CancellationException;-><init>()V

    iput p1, p0, LD/f;->C:I

    iput-object p2, p0, LD/f;->D:Lu/l;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, LD/f;->C:I

    return v0
.end method

.method public final b()Lu/l;
    .locals 1

    iget-object v0, p0, LD/f;->D:Lu/l;

    return-object v0
.end method
