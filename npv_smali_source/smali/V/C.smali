.class public final LV/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV/Z0;


# instance fields
.field private final C:LW8/N;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LW8/N;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LV/C;->C:LW8/N;

    return-void
.end method


# virtual methods
.method public final a()LW8/N;
    .locals 1

    iget-object v0, p0, LV/C;->C:LW8/N;

    return-object v0
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, LV/C;->C:LW8/N;

    new-instance v1, LV/g0;

    invoke-direct {v1}, LV/g0;-><init>()V

    invoke-static {v0, v1}, LW8/O;->d(LW8/N;Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public c()V
    .locals 2

    iget-object v0, p0, LV/C;->C:LW8/N;

    new-instance v1, LV/g0;

    invoke-direct {v1}, LV/g0;-><init>()V

    invoke-static {v0, v1}, LW8/O;->d(LW8/N;Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public d()V
    .locals 0

    return-void
.end method
